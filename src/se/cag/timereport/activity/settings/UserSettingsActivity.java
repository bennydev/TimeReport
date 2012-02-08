package se.cag.timereport.activity.settings;

import se.cag.timereport.R;
import se.cag.timereport.R.id;
import se.cag.timereport.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class UserSettingsActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        setContentView(R.layout.user_settings);
        Button but = (Button) findViewById(R.id.btnNext);
        but.setOnClickListener(this);
    }

	@Override
	public void onClick(View userSettings) {
		
		saveViewContent(userSettings);
		Intent intent = new Intent(this, CustomerSettingsActivity.class);
		startActivity(intent);	}

	private void saveViewContent(View userSettings) {
		// TODO Check how you save things in Android
	}
}