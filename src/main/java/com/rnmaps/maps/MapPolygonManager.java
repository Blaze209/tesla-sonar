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
public class MapPolygonManager extends ViewGroupManager<n> {
    private final DisplayMetrics metrics;

    public MapPolygonManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return jn.c.d("onPress", jn.c.d("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapPolygon";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "coordinates")
    public void setCoordinate(n nVar, ReadableArray readableArray) {
        nVar.setCoordinates(readableArray);
    }

    @no.a(customType = "Color", defaultInt = -65536, name = "fillColor")
    public void setFillColor(n nVar, int i11) {
        nVar.setFillColor(i11);
    }

    @no.a(defaultBoolean = false, name = "geodesic")
    public void setGeodesic(n nVar, boolean z11) {
        nVar.setGeodesic(z11);
    }

    @no.a(name = "holes")
    public void setHoles(n nVar, ReadableArray readableArray) {
        nVar.setHoles(readableArray);
    }

    @no.a(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(n nVar, int i11) {
        nVar.setStrokeColor(i11);
    }

    @no.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(n nVar, float f11) {
        nVar.setStrokeWidth(this.metrics.density * f11);
    }

    @no.a(defaultBoolean = false, name = "tappable")
    public void setTappable(n nVar, boolean z11) {
        nVar.setTappable(z11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public n createViewInstance(v0 v0Var) {
        return new n(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(n nVar, float f11) {
        nVar.setZIndex(f11);
    }
}
