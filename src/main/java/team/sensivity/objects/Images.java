package team.sensivity.objects;

public class Images {
    private final String url;
    private final int height, width;

    public Images(String url, int height, int width) {
        this.url = url;
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getUrl() {
        return url;
    }
}
