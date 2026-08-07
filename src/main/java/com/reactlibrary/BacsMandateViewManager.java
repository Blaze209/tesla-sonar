package com.reactlibrary;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.u;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BacsMandateViewManager extends ViewGroupManager<a> {
    public static final String REACT_CLASS = "BacsMandateViewManager";

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return jn.c.a().b("topChange", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onChange"))).b("topError", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onError"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @no.a(name = "params")
    public void setParams(a aVar, ReadableArray readableArray) {
        aVar.a(readableArray.getString(0), readableArray.getString(1), readableArray.getString(2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public a createViewInstance(v0 v0Var) {
        return new a(v0Var, (u) v0Var.getCurrentActivity());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull a aVar) {
        Log.d("BACS", "Dropping BacsMandateView");
        aVar.c();
        super.onDropViewInstance(aVar);
    }
}
