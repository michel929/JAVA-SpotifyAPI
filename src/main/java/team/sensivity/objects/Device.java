package team.sensivity.objects;

public class Device {
    private final String id;
    private final String name;
    private final String type;
    private final int volume_percent;
    private final boolean active, supports_volume, private_session, restricted;
    
    public Device (String id, String name, String type, int volume_percent, boolean active, boolean supports_volume, boolean private_session, boolean restricted){
        this.id = id;
        this.name = name;
        this.type = type;
        this.volume_percent = volume_percent;
        this.active = active;
        this.supports_volume = supports_volume;
        this.private_session = private_session;
        this.restricted = restricted;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume_percent;
    }

    public boolean isActive(){
        return active;
    }

    public boolean isPrivateSession() {
        return private_session;
    }

    public boolean isRestricted() {
        return restricted;
    }

    public boolean SupportsVolume() {
        return supports_volume;
    }
}
