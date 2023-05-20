import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] results = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String dividend = query.get(0);
            String divisor = query.get(1);
            results[i] = evaluateQuery(dividend, divisor, graph, new HashSet<>());
        }

        return results;
    }

    private double evaluateQuery(String dividend, String divisor, Map<String, Map<String, Double>> graph, Set<String> visited) {
        if (!graph.containsKey(dividend) || !graph.containsKey(divisor))
            return -1.0;

        if (dividend.equals(divisor))
            return 1.0;

        Map<String, Double> neighbors = graph.get(dividend);
        visited.add(dividend);

        for (Map.Entry<String, Double> neighborEntry : neighbors.entrySet()) {
            String neighbor = neighborEntry.getKey();
            double value = neighborEntry.getValue();

            if (visited.contains(neighbor))
                continue;

            double result = evaluateQuery(neighbor, divisor, graph, visited);
            if (result != -1.0)
                return value * result;
        }

        visited.remove(dividend);
        return -1.0;
    }

    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String dividend = equation.get(0);
            String divisor = equation.get(1);
            double value = values[i];

            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());

            graph.get(dividend).put(divisor, value);
            graph.get(divisor).put(dividend, 1.0 / value);
        }

        return graph;
    }
}
