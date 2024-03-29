package se.cag.timereport.activity.daily;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import se.cag.timereport.R;
import se.cag.timereport.activity.report.ListReportsActivity;
import se.cag.timereport.activity.settings.SettingsMenuActivity;
import static se.cag.timereport.activity.settings.SharedPrefsProperties.PREFS_NAME;

public class WorkStatusActivity extends Activity implements OnClickListener {
	
	
	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, SettingsMenuActivity.class);
		startActivity(intent);	

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_status);
        Button but = (Button) findViewById(R.id.btnSettings);
        but.setOnClickListener(this);
        but = (Button) findViewById(R.id.btnViewReports);
        but.setOnClickListener(new OnClickListener () {
        	public void onClick(View v) {
        		Intent intent = new Intent(WorkStatusActivity.this, ListReportsActivity.class);
        		startActivity(intent);	
       		
        	}
        });
        // Restore preferences
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if (settings == null) {
        	System.out.println("Settings is null!");
        }
        boolean atWork = settings.getBoolean("atWork", false);
        TextView workStatus = (TextView) findViewById(R.id.textAtWork);
        if (atWork) {
        	// Set the punched in string on the text view
        }
        workStatus.setText(R.string.not_initialized);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

}
