package se.cag.timereport.activity.settings;

import se.cag.timereport.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SettingsMenuActivity extends Activity {
	

	private OnClickListener userListener = new OnClickListener() {
	    public void onClick(View v) {
			Intent intent = new Intent(SettingsMenuActivity.this, UserSettingsActivity.class);
			startActivity(intent);
	    }
	};

	private OnClickListener customerListener = new OnClickListener() {
	    public void onClick(View v) {
			Intent intent = new Intent(SettingsMenuActivity.this, CustomerSettingsActivity.class);
			startActivity(intent);
	    }
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_menu);
		Button btn = (Button) findViewById(R.id.btnUserSettings);
		btn.setOnClickListener(userListener);
		btn = (Button) findViewById(R.id.btnCustomerSettings);
		btn.setOnClickListener(customerListener);
	}


}
