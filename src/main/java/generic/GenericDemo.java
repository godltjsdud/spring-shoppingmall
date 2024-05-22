package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class GenericDemo {
    public static void main(String[] args) {
        CarList<Car> carList = new CarList<>();
        carList.add(new Taxi());
        carList.add(new Bus());
        carList.add(new ElecCar());

        for(int i=0; i<carList.size(); i++){
            carList.get(i).bbang();
        }
    }
}

class Car {

    public void bbang(){
        System.out.println("경적소리");
    }
}


class Taxi extends Car{
    @Override
    public void bbang() {
        System.out.println("뛰뛰");
    }
}

class Bus extends Car{

    @Override
    public void bbang() {
        System.out.println("빵빵");
    }
}

class ElecCar extends Car{
    @Override
    public void bbang() {
        System.out.println("부릉부릉");
    }
}

class CarList<T>{
    ArrayList<T> arrayList = new ArrayList<T>();

    void add(T t){
        arrayList.add(t);
    }

    T get(int idx){
        return arrayList.get(idx);
    }

    int size(){
        return arrayList.size();
    }


}