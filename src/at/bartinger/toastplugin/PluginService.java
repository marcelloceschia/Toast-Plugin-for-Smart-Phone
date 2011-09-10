package at.bartinger.toastplugin;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

public class PluginService extends IntentService{

	public PluginService() {
		super("PluginService");
	}

	private Handler handler;


	@Override
	protected void onHandleIntent(Intent intent) {

		if(intent.hasExtra(SmartPhonePluginHelper.SMART_PHONE_PLUGIN_DATA)){
			
			final String data = intent.getStringExtra(SmartPhonePluginHelper.SMART_PHONE_PLUGIN_DATA);
			
			//is this a call to toggle your settings back?
			final boolean toggleBack = intent.getBooleanExtra(SmartPhonePluginHelper.SMART_PHONE_PLUGIN_TOGGLE_BACK, false);
			
			
			/**Put your stuff here*/
			handler = new Handler(Looper.getMainLooper());
			handler.post(new Runnable() {

				public void run() {
					Toast.makeText(getApplicationContext(), data + " Is toggleBack: " + toggleBack, Toast.LENGTH_LONG).show();
				}
			});
			/*********************/
			
		}
	}

}
