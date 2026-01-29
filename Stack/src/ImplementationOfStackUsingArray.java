public class ImplementationOfStackUsingArray {
    static class Stack{
        private int[] arr = new int[5];
        int idx = 0;
        void push( int val ){
            if(idx==arr.length){
                System.out.println("Stack is full : OVERFLOW ");
                return;
            }
            arr[idx] = val;
            idx++;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty : UNDERFLOW ");
                return -1;
            }
            idx=idx-1;
            int top = arr[idx];
            arr[idx]=0;
            return top;
        }
        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty :");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;

            return false;
        }
        boolean isFull(){
            if(idx== arr.length) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
