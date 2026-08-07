package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class MapGradientPolylineManager extends ViewGroupManager<i> {
    private final DisplayMetrics metrics;

    public MapGradientPolylineManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapGradientPolyline";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "coordinates")
    public void setCoordinates(i iVar, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            arrayList.add(new LatLng(map.getDouble(OrcaKeys.LATITUDE), map.getDouble(OrcaKeys.LONGITUDE)));
        }
        iVar.setCoordinates(arrayList);
    }

    @no.a(customType = "ColorArray", name = "strokeColors")
    public void setStrokeColors(i iVar, ReadableArray readableArray) {
        if (readableArray == null) {
            iVar.setStrokeColors(new int[]{0, 0});
            return;
        }
        if (readableArray.size() == 0) {
            iVar.setStrokeColors(new int[]{0, 0});
            return;
        }
        if (readableArray.size() == 1) {
            iVar.setStrokeColors(new int[]{readableArray.getInt(0), readableArray.getInt(0)});
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            iArr[i11] = readableArray.getInt(i11);
        }
        iVar.setStrokeColors(iArr);
    }

    @no.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(i iVar, float f11) {
        iVar.setWidth(this.metrics.density * f11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createViewInstance(v0 v0Var) {
        return new i(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(i iVar, float f11) {
        iVar.setZIndex(f11);
    }
}
