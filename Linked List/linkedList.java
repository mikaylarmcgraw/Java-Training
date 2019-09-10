public class linkedList
{

    
   Node nodeObject = null;
   
   Node head = null;
   
   Node tail = null;
   
   Node currentNode = head;
   
   public linkedList()
   {
       
    
   }
    
   public  void addNodeToHead()
   {
       
       //creating a new node object
       Node nodeObject = new Node();
       System.out.println("Here's your new node: " + nodeObject);
       System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
       System.out.println("Your node points to: " + nodeObject.next);
       nodeObject.next = head;
       head = nodeObject;
   }
   
   public void addNodeToTail()
   {
   
       Node name = new Node();
    
   }   
   
   public void removeNode()
   {
       
       
   }
   
   public void displayLinkedList()
   {
       if currentNode.next >= null; currentNode.next--)
       {
           
           
       }    
   }    
   
       
}    
