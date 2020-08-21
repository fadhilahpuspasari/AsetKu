package com.fadhilah.assetku.data;

import android.content.Context;

import com.fadhilah.assetku.data.model.LoggedInUser;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class LoginRepository {

    private LoginDataSource loginDataSource = new LoginDataSource();

    public void login(Context context, LoggedInUser user) {
        loginDataSource.setLoggedInUser(context, user);
    }

    public void logout(Context context) {
        loginDataSource.removeLoggedInUser(context);
    }

    public LoggedInUser getLoggedInUser(Context context) {
        return loginDataSource.getLoggedInUser(context);
    }

    public boolean isLoggedIn(Context context) {
        return loginDataSource.isLoggedIn(context);
    }
}