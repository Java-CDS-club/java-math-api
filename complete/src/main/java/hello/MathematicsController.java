package hello;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Base64;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.reflect.Parameter;
import java.lang.annotation.Annotation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MathematicsController {
    String pathName = "http://localhost:8080";
    Mathematics rootMath = new Mathematics(pathName);
    private JSONObject link = rootMath.getLinks();

    // Use This Style to Return Proper Formatting
    @RequestMapping("/")
    public String math(@RequestParam(value="name", defaultValue="World") String name) {
        return new JSONObject().put("author",rootMath.getAuthor()).put("links",rootMath.getLinks()).toString();
    }

    @RequestMapping("/algebra")
    public String algebra(@RequestParam(value="name", defaultValue="World") String name){
        return new JSONObject().put("links",rootMath.getAlgebraObject().getLinks()).put("functions",rootMath.getAlgebraObject().getFunctions()).toString();
    }
    @RequestMapping("/algebra/{id}")
    public  String algebraId (@PathVariable("id") String id, HttpServletRequest req) {
        ArrayList<Pair> functions = new ArrayList<Pair>();
        ArrayList<Pair> parameters = new ArrayList<Pair>();
        String name = new String();
        String queryString = req.getQueryString();
        parameters = rootMath.getAlgebraObject().getAlgebraFunctions().getParameterSigs();
        functions = rootMath.getAlgebraObject().getAlgebraFunctions().getFunctionSigs();
        JSONObject funcSig = new JSONObject();
        JSONObject func = new JSONObject();


        switch (id) {
            case "nth_root":
                if (queryString == null) {
                    name = "function";
                    for (Pair p : functions) {
                        if (p.key == "nth_root") {

                            func.put("name", "nth_root").put("signature", p.value).put("base64", new String(Base64.getEncoder().encode(p.value.getBytes())));

                        }
                    }
                    for (Pair p : parameters) {
                        if (p.key == "nth_root") {
                            func.put("parameters", new JSONArray(p.valArry));
                            String temp = new String();
                            temp = rootMath.getAlgebraRoot() + "/nth_root" + "?";
                            for (String s : p.valArry) {
                                temp += "param0=" + 3 + "&";
                            }

                            func.put("example", temp.substring(0, temp.length() - 1));

                        }
                    }
                } else {
                    name = "result";
                    func.put("answer", rootMath.getAlgebraObject().getAlgebraFunctions().nth_root(3, 3.3, 3.3));

                }
                break;
        }
        if (queryString == null)
            return new JSONObject().put(name, func).put("links", new JSONObject().put("root", rootMath.getRoot()).put("parent", rootMath.getAlgebraRoot())).toString();
    else
            return new JSONObject().put(name, func).put("links", new JSONObject().put("root", rootMath.getRoot()).put("parent", rootMath.getAlgebraRoot()).put("self",rootMath.getAlgebraRoot()+"/nth_root")).toString();

    }

    @RequestMapping("/{id}")
    public String test(@PathVariable("id") String id, HttpServletRequest req){
        String p = req.getQueryString();

        return p;
    }

}
