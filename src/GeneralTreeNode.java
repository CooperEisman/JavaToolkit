public class GeneralTreeNode {                                          //Class Declaration
    private GeneralTreeNode[] children;                                 //Array of Children of the Node
    private String nodeValue;                                           //The Value held within this Node

                                                                        //General constructor for class
    public GeneralTreeNode(String nodeValue) {
        this.nodeValue = nodeValue;                                     //Sets nodeValue to received input value
        children = new GeneralTreeNode[0];                              //Initializes the Array of Children
    }

                                                                        //Gets the value of this node
    public String getNodeValue() {
        return nodeValue;                                               //Return the value of this Node
    }

                                                                        //Returns number of child nodes to this Node
    public int numChildren() {
        return children.length;                                         //Return number of children
    }

                                                                        //Returns if this node has children
    public boolean hasChildren() {
        return children.length!=0;                                      //Returns true if the node has one or more children
    }

                                                                        //Tells whether or not the Node has a child of certain name
    public boolean hasChild(String childValue) {
        for (GeneralTreeNode childNode : children) {                    //Loop for each node in ChildNode Array
            if (childNode.getNodeValue().equals(childValue)) {          //If detects a Child node of Inputted Name
                return true;                                            //Return True
            }
        }
        return false;                                                   //If the searched for Node is not Found, return false
    }

                                                                        //Returns a child of a certain name
    public GeneralTreeNode getChild(String childValue) {
        for (GeneralTreeNode childNode : children) {                    //Loop for each node in ChildNode Array
            if (childNode.getNodeValue().equals(childValue)) {          //If detects a Child node of Inputted Name
                return childNode;                                       //Return that Child
            }
        }
        return null;                                                    //If the searched for Node is not Found, return null
    }

                                                                        //Adds a child node, returns duplicate node if already exists
    public GeneralTreeNode addChild(String child) {
        if(hasChild(child)) {                                           //if duplicate exists
            return getChild(child);                                     //Return that child
        }
        GeneralTreeNode tempNode = new GeneralTreeNode(child);
        GeneralTreeNode[] tempList = new GeneralTreeNode[children.length];


        children

        return true;
    }

    //Returns an Array of Child Nodes
    public GeneralTreeNode[] getChildren() {
        return children;
    }
}
