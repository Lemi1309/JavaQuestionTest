package main.java.main;

public class NodePractice {
    public boolean usingTest = false; // Change this to true and the test will work

    // Part A
    /* Create a star topology node network via the Node class
     * Hint: A star topology has multiple nodes all connecting to one singular 
     * Node. There must be 1 central Node and 8 other connecting Nodes. The
     * data for each node should be empty/contain '0'.
     * 
     * Here are the names for each Node: 
     *
     * centralNode
     * n1, n2, n3, n4, n5, n6, n7, n8
    */
    // Code goes under here:
    public void setupStarTopology() {
        
    }
    //Part B
    /* Once your topology is setup you will need to collect these elements
       and move them into a single set of data that can be accessed for further
       use. Hint: Make an Array for them and call it 'nodes'.
    */ 
    // Code goes under here:
    

    public Node[] collectNodes() { // DO NOT MODIFY THIS
        return nodes;
    }
    //Part C
    // Now using a function named randomData, assign random data values to each Node
    public void randomData(int NodeAmount){
        
    }
    //Part D
    // Now that the topolgy is setup, make n4, n7 and n8 connect to n2.
    // Code goes under here:
    public void connectNodes() {

    }
    //Part E
    /* Now using a function names newNodeCenter that takes in a Node array.
       Make n4 the new central node and make every other node including the 
       currect centralNode connect to n4. This will restructure the Node topology
    */ 
    public void newNodeCenter(Node[] node){

    }
}

