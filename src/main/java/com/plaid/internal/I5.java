package com.plaid.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.plaid.link.Plaid;
import com.plaid.link.R;

/* JADX INFO: loaded from: classes6.dex */
public final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f46353a;

    public I5(Application application) {
        p013kotlin.jvm.internal.s.k(application, "application");
        this.f46353a = application;
    }

    public final String a() {
        Bundle bundle = this.f46353a.getPackageManager().getApplicationInfo(this.f46353a.getPackageName(), 128).metaData;
        String string = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        if (string != null) {
            String string2 = this.f46353a.getString(R.string.plaid_user_agent_string_format_react_native, string, Plaid.getVERSION_NAME(), this.f46353a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
            p013kotlin.jvm.internal.s.j(string2, "getString(...)");
            return string2;
        }
        String string3 = this.f46353a.getString(R.string.plaid_user_agent_string_format_android, Plaid.getVERSION_NAME(), this.f46353a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
        p013kotlin.jvm.internal.s.j(string3, "getString(...)");
        return string3;
    }
}
