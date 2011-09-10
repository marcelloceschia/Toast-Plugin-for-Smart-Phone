package at.bartinger.toastplugin.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import at.bartinger.toastplugin.SmartPhonePluginHelper;
import at.bartinger.toastplugin.R;
import at.bartinger.toastplugin.R.id;
import at.bartinger.toastplugin.R.layout;

public class ConfigActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final EditText text = (EditText) findViewById(R.id.edittext);
		Button ok = (Button) findViewById(R.id.button_ok);
		Button cancel = (Button) findViewById(R.id.button_cancel);


		String data = SmartPhonePluginHelper.getData(this);
		if(!data.equals(""))
			text.setText(data);


		ok.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				String data = text.getText().toString();
				SmartPhonePluginHelper.setResultAndFinish(ConfigActivity.this,
						"Toast Message",//Title: displayed in the list
						"Will display: " + data,//Info: displayed under the title
						data);//The actual data
			}
		});
		
		cancel.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
				ConfigActivity.this.finish();
			}
		});
	}

}
