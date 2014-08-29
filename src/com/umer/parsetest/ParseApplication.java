package com.umer.parsetest;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseFacebookUtils;
import com.parse.ParseUser;
import com.parse.PushService;

import android.app.Application;

public class ParseApplication extends Application {
	static final String TAG = "MyApp";
	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "pRnlRo3kvj9OyoDJIXIHvVUunWBWyKxe5QzSFU1D", "TkvUFuuCSaWuFWnQu2USZizL4ZdSDtsBnD30XzLX");
		PushService.setDefaultPushCallback(this, ParseStarterProjectActivity.class);

		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
		
		ParseFacebookUtils.initialize(getString(R.string.app_id));
	}

}
