package hello;

import java.util.ArrayList;

public class Pair {
    public String key = new String();
    public String value = new String();
    public ArrayList<String> valArry = new ArrayList<String>();
    public Pair(String key,String val){
        this.key = key;
        this.value = val;
    }
    public Pair(String key, ArrayList<String> val){
        this.key = key;
        this.valArry = val;
    }



}
