package collection_Practice;

import java.util.HashMap;

class Patient2 {
    int id;
    String name;
    String disease;

    public Patient2(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public String toString() {
        return "[ID: " + id + ", Name: " + name + ", disease: "+ disease+"]";
    }
}

public class HashmapPatient {
    public static void main(String[] args) {
        HashMap<Integer, Patient2> map = new HashMap<>();

        map.put(1, new Patient2(101, "Akshay", "fever"));
        map.put(2, new Patient2(102, "Rahul", "pain"));
        map.put(3, new Patient2(103, "Pooja", "cold"));

        System.out.println("Patient with key 2: " + map.get(2));

        System.out.println("Does key 1 exist? " + map.containsKey(1));

        System.out.println("Does value exist? " + map.containsValue(new Patient2(101, "Akshay", "fever")));

        System.out.println("All keys: " + map.keySet());

        System.out.println("All patient values: " + map.values());

        System.out.println("Total patients: " + map.size());

        map.remove(3);
        System.out.println("After removing key 3: " + map);

        System.out.println("Is map empty? " + map.isEmpty());

        map.clear();
        System.out.println("After clearing: " + map);
        System.out.println("Is map empty now? " + map.isEmpty());
    }
}
