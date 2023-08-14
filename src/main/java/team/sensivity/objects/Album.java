package team.sensivity.objects;

import team.sensivity.enums.Genres;
import team.sensivity.enums.Restrictions;
import team.sensivity.enums.Types;
import team.sensivity.enums.Markets;

import java.util.ArrayList;
import java.util.Date;

public class Album {
    private Types album_type, type, album_group;
    private int total_tracks, popularity;
    private ArrayList<Markets> markets;
    private ArrayList<String> external_urls;
    private ArrayList<Images> images;
    private ArrayList<Copyrights> copyrights;
    private ArrayList<Genres> genres;
    private String href, id, name, uri, label;
    private Date release_date;
    private Restrictions restrictions;

    public Album(Types album_type, Types album_group, int total_tracks, int popularity, String href, String id, String name, String uri, String label, Restrictions restrictions) {
        this.type = Types.ALBUM;
        this.album_group = album_group;
        this.album_type = album_type;
        this.total_tracks = total_tracks;
        this.popularity = popularity;
        this.href = href;
        this.id = id;
        this.name = name;
        this.uri = uri;
        this.label = label;
        this.restrictions = restrictions;
    }

    public String getUri() {
        return uri;
    }

    public String getHref() {
        return href;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPopularity() {
        return popularity;
    }

    public Date getReleaseDate() {
        return release_date;
    }

    public int getTotalTracks() {
        return total_tracks;
    }

    public Restrictions getRestrictions() {
        return restrictions;
    }

    public String getLabel() {
        return label;
    }

    public Types getType() {
        return type;
    }

    public Types getAlbumGroup() {
        return album_group;
    }

}
