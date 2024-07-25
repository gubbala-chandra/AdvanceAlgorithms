package org.example.hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashMap<K,V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float lf = 0.5f;

    public CustomHashMap() {
        list = new ArrayList<>();
        for(int i=0; i< 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);
        for(Entity entity : entities) {
            if(entity.key.equals(key.toString())) {
                entity.value = value.toString();
                return;
            }
        }

        if((float)(size) /list.size() > lf) {
            reHash();
        }

        entities.add(new Entity(key.toString(), value.toString()));
        size++;
    }

    private void reHash() {
        System.out.println("Rehashing the custom hash Map");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size =0;

        for(int i =0; i< old.size(); i++) {
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entries : old) {
            for(Entity entry : entries) {
                put((K) entry.key, (V)entry.value);
            }
        }
    }
    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
