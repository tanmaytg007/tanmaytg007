import java.util.HashMap;
import java.util.Set;
public class hashfuc{
    public static void main(String args[]){
        
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        map.put("abc",1);
        map.put("achint",69);
        map.put("priti",786);
        map.put("tanu",420);
        map.put("harsh",007);// to insert an element in hash table->O(1)


        int k=map.get("harsh");//to get a value using a key->O(1)  PS.it returns null if key is not present
        System.out.println(k);


        if(map.get("harsh")!=null)//or if(map.containsKey("harsh"))->to check if a certain key exist in a hash table->(O(1))
        System.out.println("has harsh");




        if(map.containsValue(7))//to check if a value exist in a hashtable ->O(n)
        System.out.println("has 7");


        System.out.println("size : "+map.size());// to get the size of the hash table


        //to get all the keys in one set 
        Set<String> keys =map.keySet();// it creates a set of all the keys and store it in a set keys
        System.out.println(keys);
        System.out.println(map.keySet());
        //or we can iterate through the set of keys
        for(String i:keys)
        System.out.println(i+"  "+map.get(i));


        System.out.println(map.values());//to get a set of all the values


        System.out.println(map);//to get a complete 
    }
}
