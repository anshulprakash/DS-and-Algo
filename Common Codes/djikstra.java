public static List<Vertex> getShortestPath(Vertex source, Vertex target) {
    computePaths(source);
    return getShortestPathTo(target);
}

public static List<Vertex> getShortestPathTo(Vertex target) {
    List<Vertex> path = new ArrayList<Vertex>();
    for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
        path.add(vertex);
    Collections.reverse(path);
    return path;
}

// Helper function to compute shortest path and store in each vertex
public static void computePaths(Vertex source) {
    source.minDistance = 0.;
    PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
    vertexQueue.add(source);

    while (!vertexQueue.isEmpty()) {
        Vertex u = vertexQueue.poll();
        // Visit each edge exiting u
        for (Edge e : u.adjacencies) {
            Vertex v = e.target;
            double weight = e.weight;
            double distanceThroughU = u.minDistance + weight;
            if (distanceThroughU < v.minDistance) {
                vertexQueue.remove(v);
                v.minDistance = distanceThroughU ;
                v.previous = u;
                vertexQueue.add(v);
            }
        }
    }
}