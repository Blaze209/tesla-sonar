package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MapOverlayManager extends ViewGroupManager<m> {
    public MapOverlayManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return jn.c.d("onPress", jn.c.d("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapOverlay";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "bearing")
    public void setBearing(m mVar, float f11) {
        mVar.setBearing(f11);
    }

    @no.a(name = "bounds")
    public void setBounds(m mVar, ReadableArray readableArray) {
        mVar.setBounds(readableArray);
    }

    @no.a(name = "image")
    public void setImage(m mVar, String str) {
        mVar.setImage(str);
    }

    @no.a(defaultBoolean = false, name = "tappable")
    public void setTappable(m mVar, boolean z11) {
        mVar.setTappable(z11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(v0 v0Var) {
        return new m(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(m mVar, float f11) {
        mVar.setTransparency(1.0f - f11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(m mVar, float f11) {
        mVar.setZIndex(f11);
    }
}
