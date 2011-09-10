package at.bartinger.toastplugin;

import android.app.Activity;
import android.content.Intent;

public class SmartPhonePluginHelper {

	/******************************************************
	 * DO NOT CHANGE THIS OR YOUR PLUGIN WON'T WORK!!!    *
	 ******************************************************/
	public static final int SMART_PHONE_PLUGIN_VERSION = 2;
	/******************************************************/
	
	
	public static final int SMART_PHONE_PLUGIN_REQUEST_CODE = 7;

	public static final String SMART_PHONE_PLUGIN_TITLE = "at.bartinger.smartphone.PLUGIN_TITLE";
	public static final String SMART_PHONE_PLUGIN_INFO= "at.bartinger.smartphone.PLUGIN_INFO";
	public static final String SMART_PHONE_PLUGIN_DATA = "at.bartinger.smartphone.PLUGIN_DATA";
	public static final String SMART_PHONE_PLUGIN_TOGGLE_BACK = "at.bartinger.smartphone.TOGGLE_BACK";


	public static void setResultAndFinish(Activity activity, String title, String info, String data){
		final Intent intent = activity.getIntent();
		intent.putExtra(SMART_PHONE_PLUGIN_TITLE, title);
		intent.putExtra(SMART_PHONE_PLUGIN_INFO, info);
		intent.putExtra(SMART_PHONE_PLUGIN_DATA, data);
		activity.setResult(Activity.RESULT_OK, intent);
		activity.finish();
	}

	public static String getTitle(Activity activity){
		String data = "";

		if(activity.getIntent().hasExtra(SMART_PHONE_PLUGIN_TITLE))
			data = activity.getIntent().getStringExtra(SMART_PHONE_PLUGIN_TITLE);

		return data;
	}
	
	public static String getInfo(Activity activity){
		String data = "";

		if(activity.getIntent().hasExtra(SMART_PHONE_PLUGIN_INFO))
			data = activity.getIntent().getStringExtra(SMART_PHONE_PLUGIN_INFO);

		return data;
	}
	
	public static String getData(Activity activity){
		String data = "";

		if(activity.getIntent().hasExtra(SMART_PHONE_PLUGIN_DATA))
			data = activity.getIntent().getStringExtra(SMART_PHONE_PLUGIN_DATA);

		return data;
	}
	
	public static boolean isToggleBack(Activity activity){
		boolean data = false;

		if(activity.getIntent().hasExtra(SMART_PHONE_PLUGIN_DATA))
			data = activity.getIntent().getBooleanExtra(SMART_PHONE_PLUGIN_TOGGLE_BACK, false);

		return data;
	}

}
