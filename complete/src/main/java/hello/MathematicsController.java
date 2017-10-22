package hello;

import java.util.concurrent.atomic.AtomicLong;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import org.json.JSONObject;
import org.json.JSONArray;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public  String algebraId (@PathVariable("id") String id){
        return new JSONObject().put("link1","https://github.com").put("newLink","https://github.com/new").toString();
    }
    @RequestMapping("/{id}")
    public  Links cat(@PathVariable("id") String id){
        return new Links(pathName);
    }

}
