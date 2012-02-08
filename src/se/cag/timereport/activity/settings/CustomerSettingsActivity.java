/**
 * 
 */
package se.cag.timereport.activity.settings;

import se.cag.timereport.R;
import se.cag.timereport.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * @author benny
 *
 */
public class CustomerSettingsActivity extends Activity implements
		OnClickListener {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cust_settings);
	}

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
