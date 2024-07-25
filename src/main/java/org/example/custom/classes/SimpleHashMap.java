package org.example.custom.classes;

public class SimpleHashMap<K, V> {
    private Entry<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;

    public SimpleHashMap() {
        this.buckets = new Entry[INITIAL_CAPACITY];
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);
        int bucket = getBucket(key);

        Entry<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = entry;
            size++;
        } else {
            // Compare the keys see if key already exists
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }
            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = entry;
                size++;
            }
        }

        if (size == 0.75 * buckets.length) {
            resize();
        }
    }

    public V get(K key) {
        Entry<K, V> bucket = buckets[getBucket(key)];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private int getBucket(K key) {
        return key.hashCode() % buckets.length;
    }

    private void resize() {
        Entry<K, V>[] oldBuckets = buckets;
        buckets = new Entry[buckets.length * 2];
        size = 0;
        for (Entry<K, V> headNode : oldBuckets) {
            while (headNode != null) {
                put(headNode.key, headNode.value);
                headNode = headNode.next;
            }
        }
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}

