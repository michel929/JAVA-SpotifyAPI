package team.sensivity.objects;

import java.util.ArrayList;

public class Context {
    private final String type, href, uri;
    private ArrayList<String> external_urls = new ArrayList<>();

    public Context(String type, String href, ArrayList<String> external_urls, String uri){
        this.type = type;
        this.href = href;
        this.external_urls = external_urls;
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getExternal_urls() {
        return external_urls;
    }

    public String getHref() {
        return href;
    }

    public String getUri() {
        return uri;
    }
}
