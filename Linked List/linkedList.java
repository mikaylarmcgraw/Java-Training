public class linkedList
{
  
    
   Node nodeObject = null;
   
   int nextSerialNumber = 0;
   
   Node head = null;
   
   Node tail = null;
   
   Node currentNode = head;
   
   boolean flag = true;
   
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
           currentNode = head;
           currentNode.next = nodeObject.next;

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
          currentNode = head;
          currentNode.next = nodeObject.next;

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
       if (head == null)
       {
               System.out.print("Linked list is empty.");
               System.out.println("");
              
       }
       else
       {
           while (flag)
           {

               if(currentNode.next != null)
               {
    
                      
                    System.out.print(currentNode.serialNumber + " -> "); 
                  
                    currentNode = currentNode.next; 
                       
               }  
               else if(currentNode.next == null)
               {
                   System.out.println(currentNode.serialNumber + " -> null");
                   
                   flag = false;
                   
                   
               }   
               
            }
       }
   }
       
     
   public void displayHead()
   {
       
       System.out.println("The head of the linked list is: "+head);
       
   }    
       
} 
