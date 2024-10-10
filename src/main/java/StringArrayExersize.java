import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringArrayExersize {
    public static void main(String[] args) {

        //Create a new ArrayList for your favorite songs
        List<String> songList = new ArrayList<>();
        //Add at least 3 songs
        songList.add("b");
        songList.add("a");
        songList.add("c");
        //Remove your least favorite song
        songList.remove("c");

        System.out.println("Your songs include:" + songList);
        //Sort them alphabetically
        Collections.sort(songList);
        System.out.println(songList);
        //Create a list of the ages of the people in your breakout room

        //Make a new list, and add all the ages times 2
        List<Integer> groupList1 = new ArrayList<>();
        groupList1.add(26);
        groupList1.add(21);
        groupList1.add(27);

        List<Integer> groupList2 = new ArrayList<>();

        int doubledAge; //var
        doubledAge = groupList1.get(0) * 2;
        groupList2.add(doubledAge);
        doubledAge = groupList1.get(1) * 2;
        groupList2.add(doubledAge);
        doubledAge = groupList1.get(2) * 2;
        groupList2.add(doubledAge);

        //Sort them (the second list) numerically
        Collections.sort(groupList2);
        System.out.println("Your ages times 2 sorted is: " + groupList2);

        //Calculate the sum and the average
        int sum = 0; // initiialize b/c doing math with it , adding age to sum, sum needs a initial value of 0
        int avg; // n oinitialization b/c not doing math and setting to something else
        for (int age : groupList2) {
            sum += age;
        }
        System.out.println("Your sum is" + sum);
        avg = sum / groupList2.size();
        System.out.println("Your avg is: " + avg);

        //Create 3 puppies

        Puppy puppy1 = new Puppy("Babka","German shepard");
        Puppy puppy2 = new Puppy("boo","Australian shepard");
        Puppy puppy3 = new Puppy("bizia","Pitbull");
        //Create a new list for the puppies
        List<Puppy> puppies = new ArrayList<>();
        //Add the puppies to the list
        puppies.add(puppy1);
        puppies.add(puppy2);
        puppies.add(puppy3);
        //Remove one puppy (it's adopted)
        puppies.remove(puppy3);
        //Count the remaining puppies (print that)
        puppies.size();
        System.out.println(puppies.size());


    }
        //Create a class Puppy
        public static class Puppy{
            String name;
            String breed;

            public Puppy(String name, String breed){       //Give it a name and a breed
                this.name = name;
                this.breed = breed;
            }
        }

    }

