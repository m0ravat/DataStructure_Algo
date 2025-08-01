package org.dataStructure;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("B");
        list.add(0, "A");
        list.addFirst("D");
        list.addLast("E");
        boolean hasA  = list.contains("A");
        List<String> comparison = new ArrayList<>();
        comparison.add("A");
        comparison.add("D");
        boolean isEqual = list.equals(comparison);
        String getVal = list.get(1);
        String head = list.getFirst();
        String tail = list.getLast();
        boolean isEmpty = list.isEmpty();
        int lastIndex  = list.lastIndexOf("D");
        list.remove("A");
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        List<String> reverse = list.reversed();
        reverse.set(3, "ABC");
        int size = list.size();
        List<String> subList = list.subList(0, 3); // includes 0 index excludes 3
        list.clear();
        String[] arrSt = subList.toArray(new String[0]);
    }
}
