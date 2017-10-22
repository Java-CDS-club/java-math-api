package hello;
import org.json.JSONObject;



public class Links {
     private String root,calcRoot,algebraRoot,geometryRoot,physicsRoot;
    JSONObject links = new JSONObject();
    public  Links(String hostname){
    this.root = hostname;
    this.calcRoot = hostname + "/calculus";
    this.algebraRoot = hostname + "/algebra";
    this.geometryRoot = hostname + "/geometry";
    this.physicsRoot = hostname + "/physics";
    this.links.put("calculus",this.calcRoot);
    this.links.put("algebra",this.algebraRoot);
    this.links.put("geometry",this.geometryRoot);
    this.links.put("physics",this.physicsRoot);
    }

    public String getPhysicsRoot() {
        return physicsRoot;
    }

    public String getGeometryRoot() {
        return geometryRoot;
    }

    public String getAlgebraRoot() {
        return algebraRoot;
    }

    public String getCalcRoot() {
        return calcRoot;
    }

    public String getRoot() {
        return root;
    }

    public JSONObject getLinks(){
        return links;
    }

}
