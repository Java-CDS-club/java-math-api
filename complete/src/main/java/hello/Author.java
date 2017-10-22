package hello;

import org.json.JSONObject;
public class Author {
    String name, DOB, desiredPosition, desiredCompany,github,personalWebsite,instagram,twitter,snapchat;
    int age;

    public Author() {
        this.name = "Brett Reinhard";
        this.DOB = "08/19/1989";
        this.age = 28;
        this.desiredPosition = "AV Backend Developer Intern";
        this.desiredCompany = "SnapChat";
        this.github="https://github.com/bareinhard";
        this.personalWebsite= "http://brettreinhard.com";
        this.instagram= "https://instagram.com/bareinhard";
        this.twitter= "https://twitter.com/brett510";
        this.snapchat= "@bareinhard";
    }
    public JSONObject getAuthor(){
        return new JSONObject().put("snapchat",snapchat).put("name",name).put("DOB",DOB).put("age",age).put("desiredPosition",desiredPosition)
                .put("desiredCompany",desiredCompany).put("github",github).put("personalWebsite",personalWebsite)
                .put("instagram",instagram);
    }

    public String getSnapchat() {
        return snapchat;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }

    public String getDesiredCompany() {
        return desiredCompany;
    }

    public String getDesiredPosition() {
        return desiredPosition;
    }

    public String getGithub() {
        return github;
    }

    public String getPersonalWebsite() {
        return personalWebsite;
    }
}
