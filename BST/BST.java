public class BST
{

    BSTNode root = null;
    
    BSTNode nodeObject = null;
    
    BSTNode currentNode = root;
    
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
    
    public void displayBST(BSTNode currentNode)
    {

       if (root == null)
       {
           
           System.out.println("BST is empty please enter nodes in order to enable display function.");
           
       }
       
       else
       {

             if (currentNode.left == null) //base case
            {

                System.out.println(currentNode.serialNumber);
                
                System.out.println();
                return; 
            } 
                else //recursion call
                     {
                        
                         
                         currentNode = currentNode.left;
                         displayBST(currentNode);
                         
                     }
        
            System.out.println(currentNode.serialNumber);

           
        }
       
        

        
       
    }


        
       
    

}
