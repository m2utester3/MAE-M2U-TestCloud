
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


 /**
	 * Create passcode for the device. This keyword should be called if the device doesn't have any lock settings
	 */ 
def static "customKeyword.ChangeAndroidPasscode.createPasscode"(
    	String appId	) {
    (new customKeyword.ChangeAndroidPasscode()).createPasscode(
        	appId)
}

 /**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */ 
def static "customKeyword.ChangeAndroidPasscode.getCurrentSessionMobileDriver"() {
    (new customKeyword.ChangeAndroidPasscode()).getCurrentSessionMobileDriver()
}
