



class dsa{
  int space = 10;
  int[] array = new int[space];
  int size = 0;
  int rear = -1;
  int front = 0;

  public void Enq(int Data){
    if(size >= space){
      System.out.println("Queue space is full ");
    }
    else{
     rear = (rear + 1) % space;
     array[rear] = Data;
     size++;
    }
   
  }
 
  public void Deq(){

    array[front] = 0 ; 
    front = (front + 1 ) % space;
    size = size-1  ;
  }
  public void isFull(){
    if(size >= space){
      System.out.println("Queue space is full");
    }
  }
  public void isEmpty(){
    if (size <= space ){
      System.out.println("Queue space not fill ");
    }
  }

  public void get(){
    for(int i : array){
      System.out.print(i + " -  ");
    
    }
    System.out.println();
  }

}
public class Q{
  public static void main(String[] args) {
   // dsa d = new dsa();
  /*    d.Enq(10);
    d.Enq(20);
    d.Deq();
    d.Enq(30);
    d.Deq();
    d.Deq();
    d.get();
    d.isEmpty();
    */
    dsa e = new dsa();
    e.Enq(100);
    e.Enq(200);
    e.get();
    e.isFull();
    e.isEmpty();
  }
}









/*public class Q{

  public static void main(String[] args) {
   int[] array = {1,2,3,4,5};
   int n = array.length;
   int front = array[0] ;
   int rear = n-1 ;
   System.out.print(array[0]);
   System.out.println("front value "+front); 
   array[rear] = 19;
   System.out.println("rear value "+rear);
  


   for(int i : array){
     System.out.println(i);
   }
  }
} */




