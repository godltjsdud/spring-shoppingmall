package etc;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> sport_stars = new ArrayList<>();
        //add
        sport_stars.add("김연아");
        sport_stars.add("박태환");
        sport_stars.add("손흥민");
        sport_stars.add("이강인");
        sport_stars.add("김송아");

        for(int i=0; i<sport_stars.size(); i++){
            System.out.println(sport_stars.get(i));
        }

        Iterator<String> sportStarIterator = sport_stars.iterator();
        while(sportStarIterator.hasNext()){
            System.out.println(2+sportStarIterator.next());
        }

        for (String star :
                sport_stars) {
            System.out.println(3+ star);
        }

        Map<Integer, String> fruits= new HashMap<>();
        fruits.put(1,"사과");
        fruits.put(2,"배");
        fruits.put(3,"딸기");
        fruits.put(4, "포도");
        fruits.put(5, "수박");


        for(Map.Entry<Integer, String> entry : fruits.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

        for(String sportstart :sport_stars){
            System.out.println(sportstart);

            if(sportstart.equals("김송아")){
                sport_stars.remove(sportstart);
            }
        }



        Iterator<String> fruitIterator = fruits.values().iterator();
        while(fruitIterator.hasNext()){
            System.out.println(2 + " " + fruitIterator.next());
        }


    }
}
