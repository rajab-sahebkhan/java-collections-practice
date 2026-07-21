import java.util.HashMap;

public class hashmap {
    public static void main(String[] args){
        HashMap<String, Double> accounts = new HashMap<>();

        accounts.put("Rajab", 1000.0);
        accounts.put("Ali", 500.0);

        System.out.println(accounts.get("Rajab"));

        accounts.remove("Ali");

        //to check
        if(accounts.containsKey("Rajab")){
            System.out.println("exists");
        } else {
            System.out.println("Does not exist!");
        }



    }
}
