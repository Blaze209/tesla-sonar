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
public class BacsViewManager extends ViewGroupManager<d> {
    public static final String REACT_CLASS = "BacsViewManager";

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return jn.c.a().b("topChange", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onChange"))).b("topError", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onError"))).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return jn.c.a().b("onConfirm", jn.c.d("registrationName", "onConfirm")).a();
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
    public void setParams(d dVar, ReadableArray readableArray) {
        dVar.m(readableArray.getString(0), readableArray.getString(1), readableArray.getString(2), readableArray.getString(3), readableArray.getString(4), Integer.valueOf(readableArray.getInt(5)));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public d createViewInstance(v0 v0Var) {
        return new d(v0Var, (u) v0Var.getCurrentActivity());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull d dVar) {
        Log.d("BACS", "Dropping BacsView");
        dVar.u();
    }
}
