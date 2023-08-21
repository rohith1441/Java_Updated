package java_code_practise;

class values{
    int i,j;
    int dq;
    int lenth_of_queue;
    static int[] arr;
    values(int size_of_arrray){
        lenth_of_queue = size_of_arrray;
        arr = new int[lenth_of_queue];
    }
    void enque(int n){
        if(dq==lenth_of_queue){
            System.out.println("Queue is full");
        }
        else{
            arr[dq]=n;
            dq++;
        }
    }
    void deque(){
        if(dq==0){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=0;i<dq-1;i++){
                arr[i]=arr[i+1];
            }
            dq--;
        }
    }
    void display(){
        if(dq==0){
            System.out.println("empty queue");
        }else{
            for(int i=0;i<dq;i++){
                System.out.print(arr[i]+" ");
        }
    }}

}
public class basics {
    public static void main(String[] args) {
        values val = new values(5);
        val.enque(2);
        val.enque(9);
        val.enque(6);val.enque(5);
        val.deque();
        val.display();

    }
}
