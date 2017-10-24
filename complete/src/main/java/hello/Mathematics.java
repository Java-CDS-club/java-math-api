package hello;
import org.json.JSONObject;
import org.json.JSONArray;
public class Mathematics {
    Author author;
    String hostname,root,calcRoot,algebraRoot,geometryRoot,physicsRoot;

    Algebra algebra;
    private Links links;
    public Mathematics(String hostname){
        this.links = new Links(hostname);
        this.author = new Author();
        this.algebra =   new Algebra(hostname);



    }
    public Author getAuthorObject(){
        return this.author;
    }
    public JSONObject getAlgebra(){
        return algebra.getAlgebra();
    }
    public Algebra getAlgebraObject(){
        return algebra;
    }
    public JSONObject getAuthor() {
        return author.getAuthor();
    }

    public JSONObject getLinks() {
        return this.links.getLinks();
    }
    public String getRoot(){
        return this.links.getRoot();
    }
    public  String getCalcRoot(){
        return this.links.getCalcRoot();
    }
    public String getAlgebraRoot(){
        return this.links.getAlgebraRoot();
    }
    public  String getGeometryRoot(){
        return this.links.getGeometryRoot();
    }
    public  String getPhysicsRoot(){
        return this.links.getPhysicsRoot();
    }

}
