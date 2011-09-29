package com.mark.android.sharelib;

import java.util.HashMap;
import java.util.Map;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class ShareIntentExtensionContext extends FREContext {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		// TODO Auto-generated method stub
		Log.e("AIR_ShareIntentNE", "Map function called");
		
		Map<String, FREFunction> functionMap=new HashMap<String, FREFunction>();
		
		functionMap.put("showShareActivity", new ShareIntentActivity());
		return functionMap;
	}

}
