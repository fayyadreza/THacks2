package life.thacks;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jonathan on 2017-10-21.
 */

public class VictimProfile {

    private String name;
    private ArrayList<String> conditions;
    private ImageView img;

    public VictimProfile(String name) {
        this.name = name;
    }

    public VictimProfile(String name, String... conditions) {
        this.name = name;
        this.conditions = new ArrayList<>(Arrays.asList(conditions));
    }

    public VictimProfile(String name, ImageView img, String... conditions) {
        this(name, conditions);
        this.img = img;
    }
    
    public String getName() {
        return name;
    }

    public VictimProfile returnTestVictim() {
        return new VictimProfile("John Doe", "Stroke");
    }

    public ArrayList<String> getConditions() {
        return conditions;
    }
}
