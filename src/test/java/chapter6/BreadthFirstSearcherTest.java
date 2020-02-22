package chapter6;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class BreadthFirstSearcherTest {

    private BreadthFirstSearcher breadthFirstSearcher;

    @Test
    public void findShortestPathToMangoSeller() {
        //given
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("you", asList("alice", "bob", "claire"));
        graph.put("bob", asList("anuj", "peggy"));
        graph.put("alice", singletonList("peggy"));
        graph.put("claire", asList("thom", "jonny"));
        graph.put("anuj", emptyList());
        graph.put("peggy", emptyList());
        graph.put("thom", emptyList());
        graph.put("jonny", emptyList());
        breadthFirstSearcher = new BreadthFirstSearcher(graph);

        //when
        String result = breadthFirstSearcher.search("you");

        //then
        assertEquals("thom", result);
    }
}
