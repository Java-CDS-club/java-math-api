package hello;


import org.json.JSONObject;
import java.util.ArrayList;

public class Algebra {
    Links link = new Links("http://localhost:8080");
    String nth_root = link.getAlgebraRoot()+"/nth_root";
    ArrayList<String> function_urls = new ArrayList<String>();
    JSONObject functions = new JSONObject();
    JSONObject links = new JSONObject();


    public Algebra(){
    this.links.put("root",link.getRoot());
    this.functions = functions.put("nth_root",nth_root);
    }

    public JSONObject getLinks() {
        return links;
    }
    public JSONObject getAlgebra(){
        return new JSONObject().put("algebra",new JSONObject().put("links",this.getLinks()).put("functions",this.getFunctions()));
    }
    public JSONObject getFunctions() {
        return functions;
    }

}
