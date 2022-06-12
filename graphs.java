import java.util.HashMap;
public class graphs
{
    private void depthFirstSearchRecursive(String node, HashMap<String, String[]> neighbors) {
        System.out.println(node);
        for (String n : neighbors.get(node))
        {
            deathFirstSearchRecursive(n, neighbors);
        }
    }

    public static void main(String...args) {
        graphs ob = new graphs();
        HashMap<String, String[]> graph = new HashMap<>();

        graph.put("a", new String[]{"b", "c"});
        graph.put("b", new String[]{"d"});
        graph.put("c", new String[]{"e"});
        graph.put("d", new String[]{"f"});
        graph.put("e", new String[]{});
        graph.put("f", new String[]{});
        ob.depthFirstSearchRecursive("a", graph);
    }
}
