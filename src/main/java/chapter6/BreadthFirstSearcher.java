package chapter6;

import java.util.*;

public class BreadthFirstSearcher {

    private final Map<String, List<String>> graph;

    public BreadthFirstSearcher(Map<String, List<String>> graph) {
        this.graph = graph;
    }

    public String search(String name) {
        Deque<String> searchQueue = new ArrayDeque<>(graph.get(name));
        List<String> searched = new ArrayList<>();
        while (!searchQueue.isEmpty()) {
            String person = searchQueue.pollFirst();
            if (!searched.contains(person)) {
                if (isPersonSeller(person)) {
                    System.out.println(person + " is mango seller!");
                    return person;
                } else {
                    searchQueue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }
        return "";
    }

    private boolean isPersonSeller(String person) {
        return person.charAt(person.length() - 1) == 'm';
    }
}
