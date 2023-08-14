package team.sensivity;

import team.sensivity.api.Request;

public class Main {

    public static void main(String[] args){

    }
    public static void StopSong(String token){
        Request.PUTRequest("https://api.spotify.com/v1/me/player/pause", token);
    }

    public static void SetPosition(String token, String pos){
        Request.PUTRequest("https://api.spotify.com/v1/me/player/seek?position_ms=", token, pos);
    }

    public static void NextSong(String token){
        Request.POSTRequest("https://api.spotify.com/v1/me/player/next", token);
    }
}