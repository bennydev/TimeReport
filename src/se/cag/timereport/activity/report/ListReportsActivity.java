package se.cag.timereport.activity.report;

import se.cag.timereport.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListReportsActivity extends ListActivity implements OnClickListener {
	
	static final String[] REPORTS = new String[] {
		"Swedbank", "Madeo", "CAG"
	};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		  setListAdapter(new ArrayAdapter<String>(this, R.layout.reports_text, REPORTS));

		  ListView lv = super.getListView();
		  lv.setTextFilterEnabled(true);

		  lv.setOnItemClickListener(new OnItemClickListener() {
		    public void onItemClick(AdapterView<?> parent, View view,
		            int position, long id) {
		        // When clicked, show a toast with the TextView text
		        Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
		            Toast.LENGTH_SHORT).show();
		      }

		  });
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

	}

}
