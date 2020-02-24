package chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Dijkstra {

    private final Map<String, Map<String, Integer>> graph;
    private Map<String, Integer> costs;
    private Map<String, String> parents;
    private List<String> processed = new ArrayList<>();

    public Dijkstra(Map<String, Map<String, Integer>> graph, Map<String, Integer> costs, Map<String, String> parents) {
        this.graph = graph;
        this.costs = costs;
        this.parents = parents;
    }

    public void find() {
        String node = findLowestCostNode(costs);
        while (!node.isEmpty()) {
            int cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);
            for (String neighbor : neighbors.keySet()) {
                int newCost = cost + neighbors.get(neighbor);
                if (costs.get(neighbor) > newCost) {
                    costs.put(neighbor, newCost);
                    parents.put(neighbor, node);
                }
            }
            processed.add(node);
            node = findLowestCostNode(costs);
        }
    }

    private String findLowestCostNode(Map<String, Integer> costs) {
        int lowestCost = Integer.MAX_VALUE;
        String lowestCostNode = "";
        for (String node : costs.keySet()) {
            int cost = costs.get(node);
            if (cost < lowestCost && !processed.contains(node)) {
                lowestCost = cost;
                lowestCostNode = node;
            }
        }
        return lowestCostNode;
    }
}
