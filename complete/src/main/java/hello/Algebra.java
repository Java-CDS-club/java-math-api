package hello;


import org.json.JSONObject;
import java.util.ArrayList;
import java.lang.reflect.Method;

public class Algebra {
    ArrayList<String> function_urls = new ArrayList<String>();
    JSONObject functions = new JSONObject();
    JSONObject links = new JSONObject();
    Links link;
    AlgebraFunctions algebraFunctions = new AlgebraFunctions();


    public AlgebraFunctions getAlgebraFunctions() {
        return algebraFunctions;
    }

    public Algebra(String hostname){
        this.link = new Links(hostname);
    this.links.put("root",link.getRoot());
    Method mArry[] = AlgebraFunctions.class.getDeclaredMethods();
        for(Method m : mArry){
            if(m.getName() != "getFunctionSigs" && m.getName() != "getParameterSigs")
            functions.put(m.getName(),this.link.getAlgebraRoot()+"/"+m.getName());
        }
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
