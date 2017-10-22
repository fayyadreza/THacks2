package life.thacks;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Jonathan on 2017-10-21.
 */

public class Victim {

    private String name;
    private LatLng location;
    private ArrayList<String> conditions;

    public Victim(LatLng location) {
        this.location = location;
    }

    public Victim(LatLng location, String name) {
        this(location);
        this.name = name;
    }

    public Victim(LatLng location, VictimProfile profile) {
        this(location, profile.getName());
        this.conditions = profile.getConditions();
    }

    public LatLng getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getConditions() {
        String out = "";
        for (int i = 0; i < conditions.size(); i++) {
            out += conditions.get(i) + "\n";
        }
        return out;
    }
}
