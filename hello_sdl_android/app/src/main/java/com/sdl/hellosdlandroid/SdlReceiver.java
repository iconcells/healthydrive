package com.sdl.hellosdlandroid;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.smartdevicelink.transport.SdlBroadcastReceiver;
import com.smartdevicelink.transport.SdlRouterService;

public class SdlReceiver  extends SdlBroadcastReceiver {		
	private static final String TAG = "SdlBroadcastReciever";
	public static final String ACTION_LANGUAGE_CHANGED = "ACTION_LANGUAGE_CHANGED";

	@Override
	public void onSdlEnabled(Context context, Intent intent) {
		Log.d(TAG, "SDL Enabled");
		intent.setClass(context, SdlService.class);
		context.startService(intent);
		
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		super.onReceive(context, intent); // Required
		if(intent.getAction().equals(ACTION_LANGUAGE_CHANGED)){
			onSdlEnabled(context, intent);
		}
	}

	@Override
	public Class<? extends SdlRouterService> defineLocalSdlRouterClass() {
		return com.sdl.hellosdlandroid.SdlRouterService.class;
	}


}