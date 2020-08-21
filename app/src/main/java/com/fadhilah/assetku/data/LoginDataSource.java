package com.fadhilah.assetku.data;


import android.content.Context;
import android.content.SharedPreferences;

import com.fadhilah.assetku.data.model.LoggedInUser;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */

public class LoginDataSource{

    public final String USER_KEY = "USER_KEY";
    public final String ID_KEY = "ID_KEY";
    public final String NAME_KEY = "NAME_KEY";

    private SharedPreferences getSharedPreferences(Context context){
        return context.getSharedPreferences(USER_KEY, Context.MODE_PRIVATE);
    }

    public void setLoggedInUser(Context context, LoggedInUser user){
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ID_KEY,user.getUserId());
        editor.putString(NAME_KEY,user.getDisplayName());
        editor.apply();
    }

    public LoggedInUser getLoggedInUser(Context context){
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        String id = sharedPreferences.getString(ID_KEY,"");
        String name = sharedPreferences.getString(NAME_KEY,"");

        return new LoggedInUser(id,name);
    }

    public void removeLoggedInUser(Context context){
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

    public boolean isLoggedIn(Context context){
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        boolean isUsernameExist = !sharedPreferences.getString(NAME_KEY, "").equals("");
        boolean isIdExist = !sharedPreferences.getString(ID_KEY, "").equals("");

        if (isIdExist && isUsernameExist){
            return true;
        }

        return false;

    }

}