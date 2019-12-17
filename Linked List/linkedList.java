public class linkedList
{
  
    
   Node nodeObject = null;
   
   int nextSerialNumber = 0;
   
   Node head = null;
   
   Node tail = null;
   
   Node currentNode = null;
   
   Node prevNode = null;
   
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
   
   public boolean isLinkedListEmpty(boolean test)
   {
       if (head == null)
       {
           test = true;
           
       }
       else
       {
           
           test = false;
       }
       return test;
   }
   
   public void removeNode(int removeNodeSerialNumber)
   {
       boolean flag = true;
       currentNode = head;
       if (head == null)
       {
           
           System.out.println("Linked list is empty unable to remove node please select another option.");
           
       } 
           else
           {
               currentNode = head;
               prevNode = currentNode;
               while(flag)
               {
                   
                   if (head == tail)
                   {
                       if (currentNode.serialNumber == removeNodeSerialNumber)
                       {
                           
                           head = null; 
                           tail = null;
                           
                       }
                       else
                       {
                           System.out.println("Serial number not found, please enter a valid serial number to remove.");
                           
                       }
                       flag = false;
                   }  
                   else 
                   {
                      if(currentNode.serialNumber == removeNodeSerialNumber)
                      
                      {
                          if (currentNode == head)
                          {
                              head = head.next;
                              
                          }
                          else if (currentNode.next != null)
                          {
                              prevNode.next = currentNode.next;
                             
                          }
                          else
                          {
                              tail = prevNode;
                              tail.next = null;
                              
                          }
                          flag = false;
                        }   
                      else
                      {
                          if (currentNode.next != null)
                          {
                              prevNode = currentNode; 
                              currentNode = currentNode.next;
                          }
                          else
                          {
                              System.out.println("Serial number not found in linked list.");
                              flag = false;
                          }
                      }
                   }
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
               if(head == null)
               {
                   
                   System.out.println("Linked list is empty, this feature is disabled until nodes are populated in the linked list.");
                   
               }
                   else
                   {
                       currentNode = head;
                       while (currentNode.serialNumber!= serialNumberEntered && currentNode != tail)
                       {
                               currentNode = currentNode.next;
                               
        
                               
                       }   
                       if(currentNode == tail && currentNode.serialNumber != serialNumberEntered)
                       {
                          System.out.println("Serial number not found in linked list please enter a valid # to add node to.");
                                   
                       } 
                       else if (tail.serialNumber == serialNumberEntered)
                       {
                               Node nodeObject = new Node();
                               nodeObject.serialNumber = nextSerialNumber;
                               nextSerialNumber++;
                               System.out.println("Here's your new node: " + nodeObject);
                               System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
                               nodeObject.next = null;
                               currentNode.next = nodeObject;
                               tail = nodeObject;
                       }
                       else
                       {
                               Node nodeObject = new Node();
                               nodeObject.serialNumber = nextSerialNumber;
                               nextSerialNumber++;
                               System.out.println("Here's your new node: " + nodeObject);
                               System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
                               nodeObject.next = currentNode.next;
                               currentNode.next = nodeObject;
                           
                           
                       }
                   }
   }
   
   public void addToTheLeft(int serialNumberEntered)
   {
       boolean flag = true;
       
       if (head == null)
       {
         System.out.println("Linked list is empty, this feature is disabled until nodes are populated in the linked list.");
           
       }
           else
           {
                prevNode = head;
                currentNode = head;
                while (flag)
                {

                   
                   if (currentNode.serialNumber == serialNumberEntered)
                   {
                       
                       if (currentNode == head)
                       {
                                   Node nodeObject = new Node();
                                   nodeObject.serialNumber = nextSerialNumber;
                                   nextSerialNumber++;
                                   System.out.println("Here's your new node: " + nodeObject);
                                   System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
                                   nodeObject.next = head;
                                   head = nodeObject;
                           
                       }
                           else
                           {       
                                   Node nodeObject = new Node();
                                   nodeObject.serialNumber = nextSerialNumber;
                                   nextSerialNumber++;
                                   System.out.println("Here's your new node: " + nodeObject);
                                   System.out.println("Your node's serial number is: " + nodeObject.serialNumber);
                                   prevNode.next = nodeObject;
                                   nodeObject.next = currentNode;
                                   
                           }
                       flag = false;
                   }
                   else
                   {
                       if (currentNode.next != null)
                       {
                           prevNode = currentNode;
                           currentNode = currentNode.next;
                       }
                           else
                           {
                               
                               System.out.println("Serial number not found, please enter valid serial number of node you'd like to add to the left of.");
                               flag = false;
                           }
                   }
                }
            }
   }
     
   public void displayHead()
   {
       if (head == null)
       {
           System.out.println("Linked list is empty, please add node(s) in order to display head of linked list.");
       }
       else
       {
           System.out.println("The head of the linked list is: "+head.serialNumber);
       }
   }    
       
}  
