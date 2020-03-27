package cww327;
public class Stack {
    private int[] array = new int[100];
    private  int size =0;
    //入栈
    public void push(int x){
        array[size] = x;
        size++;
    }
    //取栈顶元素
    public int peak(){
        return array[size-1];//这里注意了是size-1,不是size;
    }
    //出栈
    public int pop(){
        int result =  array[size-1];
        size--;
        return  result ;
    }
}
