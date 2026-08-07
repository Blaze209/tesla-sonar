package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.ButtCap;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.maps.model.SquareCap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MapPolylineManager extends ViewGroupManager<o> {
    private final DisplayMetrics metrics;

    public MapPolylineManager(ReactApplicationContext reactApplicationContext) {
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
        return "AIRMapPolyline";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "coordinates")
    public void setCoordinate(o oVar, ReadableArray readableArray) {
        oVar.setCoordinates(readableArray);
    }

    @no.a(defaultBoolean = false, name = "geodesic")
    public void setGeodesic(o oVar, boolean z11) {
        oVar.setGeodesic(z11);
    }

    @no.a(name = "lineDashPattern")
    public void setLineDashPattern(o oVar, ReadableArray readableArray) {
        oVar.setLineDashPattern(readableArray);
    }

    @no.a(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(o oVar, int i11) {
        oVar.setColor(i11);
    }

    @no.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(o oVar, float f11) {
        oVar.setWidth(this.metrics.density * f11);
    }

    @no.a(defaultBoolean = false, name = "tappable")
    public void setTappable(o oVar, boolean z11) {
        oVar.setTappable(z11);
    }

    @no.a(name = "lineCap")
    public void setlineCap(o oVar, String str) {
        Cap squareCap;
        str.getClass();
        switch (str) {
            case "square":
                squareCap = new SquareCap();
                break;
            case "butt":
                squareCap = new ButtCap();
                break;
            case "round":
                squareCap = new RoundCap();
                break;
            default:
                squareCap = new RoundCap();
                break;
        }
        oVar.setLineCap(squareCap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public o createViewInstance(v0 v0Var) {
        return new o(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(o oVar, float f11) {
        oVar.setZIndex(f11);
    }
}
