package main.java.hashtable;

public class HashTableMain {
    public static void main(String args[]) {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);
        hashTable.set("lumber", 20);

        hashTable.printTable();

    }
}
