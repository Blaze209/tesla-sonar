package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

/* JADX INFO: loaded from: classes3.dex */
public interface z0 {
    void a(String str);

    View b(String str);

    void e(View view);

    void g();

    Activity getCurrentActivity();

    JavaScriptExecutorFactory getJavaScriptExecutorFactory();
}
