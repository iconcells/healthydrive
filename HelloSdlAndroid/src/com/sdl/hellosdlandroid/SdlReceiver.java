package com.sdl.hellosdlandroid;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.smartdevicelink.transport.SdlBroadcastReceiver;

public class SdlReceiver  extends SdlBroadcastReceiver {		
	private static final String TAG = "SdlBroadcastReciever";
	
	@Override
	public Class defineLocalSdlRouterClass() {
		return com.sdl.hellosdlandroid.SdlRouterService.class;
	}

	@Override
	public void onSdlEnabled(Context context, Intent intent) {
		Log.d(TAG, "SDL Enabled");
		intent.setClass(context, SdlService.class);
		context.startService(intent);
		
	}
}