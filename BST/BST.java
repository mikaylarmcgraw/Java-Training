
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
        currentNode = root;
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
                if (numberForBST > currentNode.serialNumber)
                {
                   while ((numberForBST > currentNode.serialNumber) && (currentNode.right != null))
                   {
                       
                       currentNode = currentNode.right;
                       
                   }
                    
                    
                    
                }
                
            }
        
    }
    
    public void displayBST()
    {
        
        
        
    }
    
}
