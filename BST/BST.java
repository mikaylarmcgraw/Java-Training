
public class BST
{

    BSTNode root = null;
    
    BSTNode nodeObject = null;
    
    BSTNode currentNode = null;
    
    public BST()
    {
        
        
    }
    
    public void addToBST(int numberForBST)
    {
        boolean flag2 = true;
        if (root == null)
        {
           BSTNode nodeObject = new BSTNode();
           nodeObject.serialNumber = numberForBST;
           root = nodeObject;
           nodeObject.left = null;
           nodeObject.right = null;
        }
            else
            {
                   currentNode = root;
                   BSTNode nodeObject = new BSTNode();
                   nodeObject.serialNumber = numberForBST; 
                   while ((numberForBST != currentNode.serialNumber) || (numberForBST != currentNode.serialNumber))
                   {
                       
                       if (numberForBST < currentNode.serialNumber && currentNode.left != null)
                       {
                           currentNode = currentNode.left;
                           
                       }
                           else if ((numberForBST > currentNode.serialNumber) && (currentNode.right != null))
                           {
                               
                               currentNode = currentNode.right;
                           }
                                else if (numberForBST < currentNode.serialNumber && (currentNode.left == null))
                                {
                                    
                                    currentNode.left = nodeObject;
                                    
                                }
                                       else if ((numberForBST > currentNode.serialNumber) && (currentNode.right == null))
                                       {
                                    
                                           currentNode.right = nodeObject;
                                    
                                       }

                            
                   }
                    
                    
                    
                
                
            }
        
    }
    
    public void displayBST()
    {
        
        if (root == null)
        {
            
            System.out.println("BST is empty please enter a node(s) onto tree to display.");
            
        }
        else
        {
            System.out.println(root.serialNumber);
            if (root.left != null)
            {
                System.out.println(root.left.serialNumber);
            }
            
            if (root.right!= null)
            {
                System.out.println(root.right.serialNumber);
            }
        
        }
    }

}
