package team.sensivity.objects;

import team.sensivity.enums.RepeatState;

public class PlaybackState {
    private Device device;
    private RepeatState repeat_state;
    private Context context;
    private boolean shuffle_state, is_playing;
    private int timestamp, progress_ms;
}
