package com.silence.arts.leetcode;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-07-26 00:08<br>
 * <b>Desc：</b>无<br>
 */
public class LRUCache {

    private LinkedList<ListNode> cacheList;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheList = new LinkedList<>();
    }

    public int get(int key) {
        AtomicInteger result = new AtomicInteger(-1);
        final ListNode[] node = {null};
        cacheList.forEach(v -> {
            if (v.key == key) {
                result.set(v.value);
                node[0] = v;
                cacheList.remove(v);
            }
        });
        if (null != node[0]) {
            cacheList.add(0, node[0]);
        }
        return result.get();
    }

    public void put(int key, int value) {
        if (size() == capacity) {
            cacheList.remove(capacity - 1);
        }
        ListNode node = new ListNode(key, value);
        cacheList.add(0, node);
    }

    public int size() {
        return cacheList.size();
    }

    class ListNode {
        int key;
        int value;

        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* capacity */);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
        System.out.println(cache.get(4));       // returns 4
    }
}
