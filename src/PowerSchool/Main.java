package PowerSchool;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        ArrayList<Students> kiddo = new ArrayList<>();
        ArrayList<Teachers> notKiddo = new ArrayList<Teachers>();

        Students student1 = new Students("Johnny", "Joe", 1, 1);

        Students student2 = new Students("Bob", "bobby", 2, 1);

        Students student3 = new Students("Danny", "Phantom", 3, 1);

        Students student4 = new Students("Kim", "Possible", 4, 1);

        Students student5 = new Students("Courage", "Dog", 5, 1);

        Students student6 = new Students("Billy", "Mandy", 6, 1);

        Students student7 = new Students("Johnny", "Bravo", 7, 1);

        Students student8 = new Students("Spongebob", "Squarepants", 8, 1);

        Students student9 = new Students("Patrick", "Star", 9, 1);

        Students student10 = new Students("Jimmy", "Neutron", 10, 1);

        Students student11 = new Students("Pika", "Chu", 11, 1);

        Students student12 = new Students("Bloo", "Bloo", 12, 1);

        Students student13 = new Students("Number", "One", 13, 1);

        Students student14 = new Students("Samurai", "Jack", 14, 1);

        Students student15 = new Students("Harvey", "Birdman", 15, 1);

        Teachers teacher1 = new Teachers("Fred", "Flintstone", 201, 203);

        Teachers teacher2 = new Teachers("Bugs", "Bunny", 202, 213);

        Teachers teacher3 = new Teachers("Mickey", "Mouse", 203, 225);

        Teachers teacher4 = new Teachers("Super", "Friends", 204, 283);

        Teachers teacher5 = new Teachers("Captain", "K'nuckles", 205, 290);


        notKiddo.add(teacher1);
        notKiddo.add(teacher2);
        notKiddo.add(teacher3);
        notKiddo.add(teacher4);
        notKiddo.add(teacher5);

        kiddo.add(student1);
        kiddo.add(student2);
        kiddo.add(student3);
        kiddo.add(student4);
        kiddo.add(student5);
        kiddo.add(student6);
        kiddo.add(student7);
        kiddo.add(student8);
        kiddo.add(student9);
        kiddo.add(student10);
        kiddo.add(student11);
        kiddo.add(student12);
        kiddo.add(student13);
        kiddo.add(student14);
        kiddo.add(student15);


        HashSet <Students> class1 = new HashSet<>();
        class1.add(student1);
        class1.add(student2);
        class1.add(student3);
        class1.add(student4);
        class1.add(student5);

        HashSet <Students> class2 = new HashSet<>();
        class2.add(student6);
        class2.add(student7);
        class2.add(student8);
        class2.add(student9);
        class2.add(student10);

        HashSet <Students> class3 = new HashSet<>();
        class3.add(student11);
        class3.add(student12);
        class3.add(student13);
        class3.add(student14);
        class3.add(student15);

        HashMap <Teachers, Set> School = new HashMap<>();
        School.put(teacher1, class1);
        School.put(teacher2, class2);
        School.put(teacher3, class3);

        for (Teachers k : School.keySet()) {
            System.out.println("Class = " + k);
        }
        for(Set a : School.values()){
            System.out.println(a);
        }


    }

}
