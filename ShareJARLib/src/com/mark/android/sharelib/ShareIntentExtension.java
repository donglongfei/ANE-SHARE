package com.mark.android.sharelib;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class ShareIntentExtension implements FREExtension {

	public FREContext createContext(String arg0) {
		// TODO Auto-generated method stub
		Log.e("AIR_ShareIntent", "Inside Create Context");
		return new ShareIntentExtensionContext();
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void initialize() {
		// TODO Auto-generated method stub

	}

}
