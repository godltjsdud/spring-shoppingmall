package generic;

import java.util.ArrayList;
import java.util.List;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<Integer> stackStr = new MyStack<>();

        System.out.println(stackStr.isEmpty());
        stackStr.push(1); // 1
        stackStr.push(2); // 2
        stackStr.push(3); // 3

        System.out.println(stackStr.pop());
        System.out.println(stackStr.peek());

        System.out.println(stackStr.isEmpty());

        stackStr.printElements();
    }
}


class MyStack<T> {
    List<T> arrayList = new ArrayList<>();

    void push(T t){
        arrayList.add(t);
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        return arrayList.remove(arrayList.size()-1);
    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    public T peek(){
        return arrayList.get(arrayList.size()-1);
    }


    public void printElements() {
        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }
    }
}
