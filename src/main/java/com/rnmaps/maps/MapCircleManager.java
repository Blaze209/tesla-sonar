package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public class MapCircleManager extends ViewGroupManager<g> {
    private final DisplayMetrics metrics;

    public MapCircleManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCircle";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "center")
    public void setCenter(g gVar, ReadableMap readableMap) {
        gVar.setCenter(new LatLng(readableMap.getDouble(OrcaKeys.LATITUDE), readableMap.getDouble(OrcaKeys.LONGITUDE)));
    }

    @no.a(customType = "Color", defaultInt = -65536, name = "fillColor")
    public void setFillColor(g gVar, int i11) {
        gVar.setFillColor(i11);
    }

    @no.a(defaultDouble = 0.0d, name = "radius")
    public void setRadius(g gVar, double d11) {
        gVar.setRadius(d11);
    }

    @no.a(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(g gVar, int i11) {
        gVar.setStrokeColor(i11);
    }

    @no.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(g gVar, float f11) {
        gVar.setStrokeWidth(this.metrics.density * f11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(v0 v0Var) {
        return new g(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(g gVar, float f11) {
        gVar.setZIndex(f11);
    }
}
