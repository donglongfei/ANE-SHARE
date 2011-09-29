package com.mark.android.sharelib;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

public class ShareIntentActivity implements FREFunction {

	public FREObject call(FREContext arg0, FREObject[] arg1) {

		FREObject result = null;

		 ShareIntentExtensionContext shareExtContext = (ShareIntentExtensionContext) arg0;
		 
		 try{
			 String message="";
			 Uri messageURI = null;
			 int type=0;
			 message=arg1[0].getAsString();
			 type=arg1[1].getAsInt();
			 
			 Activity a = shareExtContext.getActivity();
		// TODO Auto-generated method stub
			 Intent intent=new Intent(Intent.ACTION_SEND);
			 //Share Text base message
			 if(type==0){
				 intent.setType("text/plain");
				 intent.putExtra(Intent.EXTRA_SUBJECT,"·ÖÏí");
				 intent.putExtra(Intent.EXTRA_TEXT, message);
			 }
			 
			 //Share image base message
			 if(type==1){
				 messageURI = Uri.parse(message);
				 intent.setType("image/png");
				 intent.putExtra(Intent.EXTRA_STREAM, messageURI);
			 }
			 
			 a.startActivity(Intent.createChooser(intent, "·ÖÏí"));
			 if(type==1){
				 result = FREObject.newObject(messageURI.toString());  
			 }else{
				 result = FREObject.newObject(message);  
			 }
	      
			}catch(IllegalStateException e){
				e.printStackTrace();
			}catch(FREInvalidObjectException e){
				e.printStackTrace();
			}catch(FRETypeMismatchException e){
				e.printStackTrace();
			}catch(FREWrongThreadException e){
				e.printStackTrace();
			}
			return result;
	}
}
