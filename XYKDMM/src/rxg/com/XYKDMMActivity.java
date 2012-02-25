package rxg.com;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class XYKDMMActivity extends Activity {
	private Button myButton=null;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        myButton=(Button)findViewById(R.id.myButton);
        myButton.setOnClickListener(new MyButtonListener());
    }
    
    class MyButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Uri uri = Uri.parse("smsto:10001");
			Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
			intent.putExtra("sms_body", "XYKDMM");
			startActivity(intent);
			finish();
		}
    }
}