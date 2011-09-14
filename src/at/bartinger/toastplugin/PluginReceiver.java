package at.bartinger.toastplugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

public class PluginReceiver extends BroadcastReceiver{


	private Handler handler;


	@Override
	public void onReceive(final Context context, Intent intent) {

		if(intent.hasExtra(SmartPhonePluginHelper.SMART_PHONE_PLUGIN_DATA)){

			final String data = intent.getStringExtra(SmartPhonePluginHelper.SMART_PHONE_PLUGIN_DATA);

			//is this a call to toggle your settings back?
			final boolean toggleBack = intent.getBooleanExtra(SmartPhonePluginHelper.SMART_PHONE_PLUGIN_TOGGLE_BACK, false);


			/**Put your stuff here*/
			handler = new Handler(Looper.getMainLooper());
			handler.post(new Runnable() {

				public void run() {
					Toast.makeText(context, data, Toast.LENGTH_LONG).show();
				}
			});
			/*********************/

		}

	}
	
}
