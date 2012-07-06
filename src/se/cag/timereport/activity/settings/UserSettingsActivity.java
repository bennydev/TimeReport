package se.cag.timereport.activity.settings;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import se.cag.timereport.R;

import static se.cag.timereport.activity.settings.SharedPrefsProperties.PREFS_NAME;
import static se.cag.timereport.activity.settings.SharedPrefsProperties.EMPLOYEE_ID_KEY;
import static se.cag.timereport.activity.settings.SharedPrefsProperties.EMPLOYER_NAME_KEY;
import static se.cag.timereport.activity.settings.SharedPrefsProperties.USER_NAME_KEY;

public class UserSettingsActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_settings);
        getPrefsContent(); 
        Button but = (Button) findViewById(R.id.btnNext);
        but.setOnClickListener(this);
    }


	@Override
	public void onClick(View userSettings) {
		
		saveViewContent(userSettings);
		Intent intent = new Intent(this, CustomerSettingsActivity.class);
		startActivity(intent);	
	}

	private void saveViewContent(View userSettings) {
		// TODO Check how you save things in Android
	      // We need an Editor object to make preference changes.
	      // All objects are from android.context.Context
	      SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
	      SharedPreferences.Editor editor = settings.edit();
	      TextView txtView = (TextView) findViewById(R.id.editUserName);
	      CharSequence value = txtView.getText();
	      if (value != null && value.length() > 0) {
		      editor.putString(USER_NAME_KEY, value.toString());
	    	  
	      }
	      // TODO: Should have some reference to the enclosing
	      // view for view components names to be able to
	      // distinguish different components.
	      txtView = (TextView) findViewById(R.id.editUserCompany);
	      value = txtView.getText();
	      if (value != null && value.length() > 0) {
		      editor.putString(EMPLOYER_NAME_KEY, value.toString());
	    	  
	      }
	      txtView = (TextView) findViewById(R.id.editUserID);
	      value = txtView.getText();
	      if (value != null && value.length() > 0) {
		      editor.putString(EMPLOYEE_ID_KEY, value.toString());
	    	  
	      }
//	      editor.putBoolean("silentMode", mSilentMode);

	      // Commit the edits!
	      editor.commit();

	}
	
	private void getPrefsContent() {
		// TODO Auto-generated method stub
	      SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
	      String value = settings.getString(USER_NAME_KEY, "");
	      TextView txtView = (TextView) findViewById(R.id.editUserName);
	      txtView.setText(value);
	      
	      value = settings.getString(EMPLOYER_NAME_KEY, "");
	      txtView = (TextView) findViewById(R.id.editUserCompany);
	      txtView.setText(value);
		
	      value = settings.getString(EMPLOYEE_ID_KEY, "");
	      txtView = (TextView) findViewById(R.id.editUserID);
	      txtView.setText(value);
	}

}