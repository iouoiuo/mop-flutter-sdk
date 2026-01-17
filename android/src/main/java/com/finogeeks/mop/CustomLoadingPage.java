package com.finogeeks.mop;

import android.content.Context;

import androidx.annotation.NonNull;

import com.finogeeks.lib.applet.modules.appletloadinglayout.FinAppletDefaultLoadingPage;

public class CustomLoadingPage extends FinAppletDefaultLoadingPage {
    public CustomLoadingPage(@NonNull Context context) {
        super(context);
    }

    @Override
    public boolean hideTechSupport() {
        return true;
    }
}
