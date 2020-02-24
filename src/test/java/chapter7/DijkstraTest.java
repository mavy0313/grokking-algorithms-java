package chapter7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DijkstraTest {

    @Test
    public void shouldFindCheapestPath() {
        //given
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        Map<String, Integer> costs = new HashMap<>();
        Map<String, String> parents = new HashMap<>();

        Map<String, Integer> mapStart = new HashMap<>();
        mapStart.put("a", 6);
        mapStart.put("b", 2);
        graph.put("start", mapStart);

        Map<String, Integer> mapA = new HashMap<>();
        mapA.put("fin", 1);
        graph.put("a", mapA);

        Map<String, Integer> mapB = new HashMap<>();
        mapB.put("a", 3);
        mapB.put("fin", 5);
        graph.put("b", mapB);

        graph.put("fin", new HashMap<>());

        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("fin", Integer.MAX_VALUE);

        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", "");
        Dijkstra dijkstra = new Dijkstra(graph, costs, parents);

        //when
        dijkstra.find();

        //then
        assertEquals(costs.get("a").intValue(), 5);
        assertEquals(costs.get("b").intValue(), 2);
        assertEquals(costs.get("fin").intValue(), 6);

        assertEquals(parents.get("a"), "b");
        assertEquals(parents.get("b"), "start");
        assertEquals(parents.get("fin"), "a");
    }
}
