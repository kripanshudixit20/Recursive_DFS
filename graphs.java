import java.util.ArrayList;
import java.util.HashMap;
public class graphs
{
    private void depthFirstSearchRecursive(String node, HashMap<String, String[]> neighbors, ArrayList<String> visited)
    {
        if (!visited.contains(node))
        {
            visited.add(node);
            System.out.println(node);
            for (String n : neighbors.get(node))
            {
                depthFirstSearchRecursive(n, neighbors, visited);
            }
        }
    }

    public static void main(String...args) {
        graphs ob = new graphs();
        HashMap<String, String[]> graph = new HashMap<>();
        ArrayList<String> visited = new ArrayList<>();

        graph.put("a", new String[]{"b", "c"});
        graph.put("b", new String[]{"d"});
        graph.put("c", new String[]{"e"});
        graph.put("d", new String[]{"f"});
        graph.put("e", new String[]{});
        graph.put("f", new String[]{"b"});
        ob.depthFirstSearchRecursive("a", graph, visited);
    }
}
