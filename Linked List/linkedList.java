public class linkedList
{
  
    
   Node nodeObject = null;
   
   int nextSerialNumber = 0;
   
   Node head = null;
   
   Node tail = null;
   
   Node currentNode = null;
   
  
   
   public linkedList()
   {
       
    
   }
    
   public  void addNodeToHead()
   {
       
       //creating a new node object
       if (head == null)
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
           //currentNode = head;
           //currentNode.next = nodeObject.next;

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
          //currentNode = head;
          //currentNode.next = nodeObject.next;

      }    
   }
   
   public void addNodeToTail()
   {
       if (tail == null)
       {
           Node nodeObject = new Node();
           nodeObject.serialNumber = nextSerialNumber;
           nextSerialNumber++;
           System.out.println("Here's your new node: " + nodeObject);
           System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
           head = nodeObject;
           //currentNode = head;
           tail = nodeObject;
           System.out.println("Your Node points to: " + tail.next);
      }
      else
      {
          Node nodeObject = new Node();
          nodeObject.serialNumber = nextSerialNumber;
          nextSerialNumber++;
          System.out.println("Here's your new node: " + nodeObject);
          System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
          tail.next = nodeObject;
          tail = nodeObject;
          System.out.println("Your Node points to: null.");
          
      }    
    
   }   
   
   public void removeNode(int removeNodeSerialNumber)
   {
       boolean flag2 = true;
       currentNode = head;
       
       while(flag2 == true)
       {
           if (removeNodeSerialNumber == head.serialNumber)
           {
               
               head = head.next;
               
               flag2 = false;
           }  
           else if (removeNodeSerialNumber == tail.serialNumber)
           {
               while(currentNode.next != tail)
               {
                   currentNode = currentNode.next;
                   
               }
               tail = currentNode;
               tail.next = null;
               flag2 = false;
           }
           else if(currentNode.next.serialNumber == removeNodeSerialNumber)
           {
               
               currentNode.next = currentNode.next.next;
               
               flag2 = false;
           }   
               else
               {
                   currentNode = currentNode.next;
                   
                   
               }
       }
       
   }
   
   public void displayLinkedList()
   {
       boolean flag = true;
       currentNode = head;

       if (currentNode == null)
       {
           
           System.out.println("Sorry linked list is empty.");
           
       }    
       else 
       {
           while (flag)
           {
                  
              if (currentNode.next != null)
              {
                  
                  
                   System.out.print(currentNode.serialNumber + " ->"); 
                     
                   currentNode = currentNode.next;
              }   
                  else if(currentNode.next == null)
                  {
                      flag = false;
                      System.out.print(currentNode.serialNumber + " ->");
                      System.out.print("null");
                      
                  }    
                  
           }    

       }    
       
       
   } 
  
   
   public void addToTheRight(int serialNumberEntered)
   {
           currentNode = head;
           while (currentNode.serialNumber!= serialNumberEntered)
           {
               currentNode = currentNode.next;
               
           }   
           Node nodeObject = new Node();
           nodeObject.serialNumber = nextSerialNumber;
           nextSerialNumber++;
           System.out.println("Here's your new node: " + nodeObject);
           System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
           nodeObject.next = currentNode.next;
           currentNode.next = nodeObject;
   }
   
   public void addToTheLeft()
   {
       
       
       
   }
     
   public void displayHead()
   {
       
       System.out.println("The head of the linked list is: "+head.serialNumber);
       
   }    
       
}   
