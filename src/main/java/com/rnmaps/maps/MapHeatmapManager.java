package com.rnmaps.maps;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public class MapHeatmapManager extends ViewGroupManager<j> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapHeatmap";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "gradient")
    public void setGradient(j jVar, ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("colors");
        int[] iArr = new int[array.size()];
        for (int i11 = 0; i11 < array.size(); i11++) {
            iArr[i11] = array.getInt(i11);
        }
        ReadableArray array2 = readableMap.getArray("startPoints");
        float[] fArr = new float[array2.size()];
        for (int i12 = 0; i12 < array2.size(); i12++) {
            fArr[i12] = (float) array2.getDouble(i12);
        }
        if (readableMap.hasKey("colorMapSize")) {
            jVar.setGradient(new lx.a(iArr, fArr, readableMap.getInt("colorMapSize")));
        } else {
            jVar.setGradient(new lx.a(iArr, fArr));
        }
    }

    @no.a(name = "opacity")
    public void setOpacity(j jVar, double d11) {
        jVar.setOpacity(d11);
    }

    @no.a(name = "points")
    public void setPoints(j jVar, ReadableArray readableArray) {
        lx.c[] cVarArr = new lx.c[readableArray.size()];
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            LatLng latLng = new LatLng(map.getDouble(OrcaKeys.LATITUDE), map.getDouble(OrcaKeys.LONGITUDE));
            cVarArr[i11] = map.hasKey("weight") ? new lx.c(latLng, map.getDouble("weight")) : new lx.c(latLng);
        }
        jVar.setPoints(cVarArr);
    }

    @no.a(name = "radius")
    public void setRadius(j jVar, int i11) {
        jVar.setRadius(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createViewInstance(v0 v0Var) {
        return new j(v0Var);
    }
}
