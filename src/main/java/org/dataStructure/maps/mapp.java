package org.dataStructure.maps;

import java.util.*;

public class mapp {

    public static void main(String[] args) {
        hashMapExample();
        System.out.println();
        treeMapExample();
        System.out.println();
        linkedHashMapExample();
    }

    // 1. HashMap - UserID to UserName
    public static void hashMapExample() {
        System.out.println("=== HashMap Example ===");
        Map<Integer, String> userIdToName = new HashMap<>();
        userIdToName.put(1001, "Alice");
        userIdToName.put(1003, "Charlie");
        userIdToName.put(1002, "Bob");

        System.out.println("User 1002: " + userIdToName.get(1002));
        System.out.println("Contains user 1004? " + userIdToName.containsKey(1004));
        userIdToName.remove(1003);

        for (Map.Entry<Integer, String> entry : userIdToName.entrySet()) {
            System.out.println("UserID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    // 2. TreeMap - Product name to Price
    public static void treeMapExample() {
        System.out.println("=== TreeMap Example ===");
        TreeMap<String, Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 1200.99);
        productPrices.put("Smartphone", 799.49);
        productPrices.put("Earbuds", 199.99);

        System.out.println("First product: " + productPrices.firstKey());
        System.out.println("Last product: " + productPrices.lastKey());
        System.out.println("Price of Smartphone: " + productPrices.get("Smartphone"));

        System.out.println("Products before Smartphone: " + productPrices.headMap("Smartphone"));

        productPrices.forEach((product, price) -> System.out.println(product + ": $" + price));
    }

    // 3. LinkedHashMap - SessionID to Activity
    public static void linkedHashMapExample() {
        System.out.println("=== LinkedHashMap Example ===");
        LinkedHashMap<String, String> sessionActivity = new LinkedHashMap<>();
        sessionActivity.put("sess123", "Login");
        sessionActivity.put("sess124", "ViewProfile");
        sessionActivity.put("sess125", "Logout");

        System.out.println("Is map empty? " + sessionActivity.isEmpty());
        System.out.println("Size: " + sessionActivity.size());

        sessionActivity.put("sess124", "UpdateProfile");

        for (String sessionId : sessionActivity.keySet()) {
            System.out.println(sessionId + " -> " + sessionActivity.get(sessionId));
        }

        sessionActivity.remove("sess123");

        System.out.println("After removal:");
        sessionActivity.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

