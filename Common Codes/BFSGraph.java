public boolean breadthFirstSearch(Node rootNode, String data){
    if(rootNode == null || data == null){
        return false;
    }
    
    Queue<Node> q = new LinkedList<>();
    q.add(rootNode);
    rootNode.visited = true;
    
    while(!q.isEmpty()){
        Node temp = (Node)q.poll();
        if(temp.data != null && temp.data.equals(data)){
            return true;
        }
        List<Node> adjacentNodes = temp.adjacentNodes;
        for(Node n: adjacentNodes){
            if(!n.visited){
                q.add(n);
                n.visited = true;
            }
        }
    }
    return false;
}
