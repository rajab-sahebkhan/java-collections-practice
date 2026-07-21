import java.util.ArrayList; // for array list

public class Arraylist {
    public static void main(String[] args){

        ArrayList<String> students = new ArrayList<>();

        // add elements
        students.add("Rajab");
        students.add("Ali");
        students.add("Sargam");
        students.add("motu");

        students.get(0);            //Rajab
        students.remove(1);   //removes Ali
        students.size();            //number of elements

        for (String s : students){
            System.out.println(s);
        }

        System.out.println(students.size());
    }
}
