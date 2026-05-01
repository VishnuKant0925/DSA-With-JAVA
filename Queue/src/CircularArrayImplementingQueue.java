class CircularQueue{
    int[] arr;
    int f;
    int r;
    int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }
    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is Full ");
            return;
        }
        arr[r] = val;
        r++;
        if(r== arr.length) r = 0;  // rear has crossed last index
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is Empty ");
            return -1;
        }
        int frontval = arr[r];
        f++;
        if(f== arr.length) f=0; // front has cross last index 
        size--;
        return frontval;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is Empty ");
            return -1;
        }
        return arr[f];
    }
    void display(){
        if(size==0) return;
        if(f>=r){
            for(int i=f;i<arr.length;i++){ //front to end
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){  //start to rare
                System.out.print(arr[i]+" ");
            }
        }
        else{  // normal case when f<r
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

}

public class CircularArrayImplementingQueue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(50);
        q.add(60);
        q.add(70);
        q.display();
        System.out.println(q.remove());
        q.add(90);
        q.display();
    }
}
