package team.sensivity.objects;

import team.sensivity.enums.Copy;

public class Copyrights {
    private String text;
    private Copy type;

    public Copyrights(String text, Copy type) {
        this.type = type;
        this.text = text;
    }

    public Copy getType() {
        return type;
    }

    public String getText() {
        return text;
    }
}
