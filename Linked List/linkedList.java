public class linkedList
{
  
    
   Node nodeObject = null;
   
   int nextSerialNumber = 0;
   
   Node head = null;
   
   Node tail = null;
   
   Node currentNode = head;
   
   public linkedList()
   {
       
    
   }
    
   public  void addNodeToHead()
   {
       
       //creating a new node object
       if (tail == null)
       {
           Node nodeObject = new Node();
           nodeObject.serialNumber = nextSerialNumber;
           nextSerialNumber++;
           System.out.println("Here's your new node: " + nodeObject);
           System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
           System.out.println("Your node points to: " + nodeObject.next);
           nodeObject.next = head;
           head = nodeObject;
           tail = nodeObject;
      }
      else
      {
          Node nodeObject = new Node();
          nodeObject.serialNumber = nextSerialNumber;
          nextSerialNumber++;
          System.out.println("Here's your new node: " + nodeObject);
          System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
          nodeObject.next = head;
          head = nodeObject;
          System.out.println("Your node points to: " + nodeObject.next);
       
      }    
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
       
       if (currentNode != null)
       {
          System.out.println(currentNode); 
          currentNode = currentNode.next; 
       }    
       
   }    
   
       
}      
