/**
 * 
 */
package se.cag.timereport.activity.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import se.cag.timereport.R;

/**
 * @author benny
 *
 */
public class CustomerSettingsActivity extends Activity implements
		OnClickListener {
	
	


	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		saveViewContent();
		// TODO: Go back to settings, or to the recipient mapping view?
		Intent intent = new Intent(this, CustomerSettingsActivity.class);
		startActivity(intent);	

	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cust_settings);
		Button btn = (Button) findViewById(R.id.btnCustSettNext);
		btn.setOnClickListener(this);
		getPrefsContent();
	}

	private void saveViewContent() {
		// TODO Save new customers.
		
	}

	private void getPrefsContent() {
		// TODO Load existing customers
//	      SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//	      String value = settings.getString(USER_NAME_KEY, "");
//	      TextView txtView = (TextView) findViewById(R.id.editUserName);
//	      txtView.setText(value);
//	      
//	      value = settings.getString(EMPLOYER_NAME_KEY, "");
//	      txtView = (TextView) findViewById(R.id.editUserCompany);
//	      txtView.setText(value);
//		
//	      value = settings.getString(EMPLOYEE_ID_KEY, "");
//	      txtView = (TextView) findViewById(R.id.editUserID);
//	      txtView.setText(value);
	}


}
