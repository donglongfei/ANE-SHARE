package com.mark.nativeExtension.ShareActivity
{
	import flash.external.ExtensionContext;
	
	import mx.core.mx_internal;
	
	public class ShareActivity
	{
		
		private var extContext:ExtensionContext = null;
		private static var _instance:ShareActivity = null;
		private static var _flag:Boolean = false;
		
		
		public function ShareActivity()
		{
			if (!extContext)
			{
				extContext = ExtensionContext.createExtensionContext("com.mark.ShareANE",null);
			}
		}
		
		public function share (message:String,type:int):String
		{
			var result:String;
			result=extContext.call("showShareActivity",message,type) as String;
			return result;
		}
	}
}