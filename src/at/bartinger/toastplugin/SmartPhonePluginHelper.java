package at.bartinger.toastplugin;

import android.app.Activity;
import android.content.Intent;

public class SmartPhonePluginHelper {

	public static final int SMART_PHONE_PLUGIN_REQUEST_CODE = 7;

	public static final String SMART_PHONE_PLUGIN_DATA = "at.bartinger.smartphone.PLUGIN_DATA";

	public static void setResult(Activity activity, String data){
		final Intent intent = activity.getIntent();
		intent.putExtra(SMART_PHONE_PLUGIN_DATA, data);
		activity.setResult(Activity.RESULT_OK, intent);
	}

	public static void setResultAndFinish(Activity activity, String data){
		final Intent intent = activity.getIntent();
		intent.putExtra(SMART_PHONE_PLUGIN_DATA, data);
		activity.setResult(Activity.RESULT_OK, intent);
		activity.finish();
	}

	public static String getData(Activity activity){
		String data = "";

		if(activity.getIntent().hasExtra(SMART_PHONE_PLUGIN_DATA))
			data = activity.getIntent().getStringExtra(SMART_PHONE_PLUGIN_DATA);

		return data;
	}

}
