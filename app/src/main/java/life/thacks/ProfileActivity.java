package life.thacks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Jonathan on 2017-10-22.
 */

public class ProfileActivity extends AppCompatActivity {

    private TextView tv;

    private String name = "Steve Smith";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv = (TextView) findViewById(R.id.name);
    }
}
