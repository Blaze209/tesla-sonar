package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlayOptions;

/* JADX INFO: loaded from: classes6.dex */
public class MapWMSTileManager extends ViewGroupManager<t> {
    public MapWMSTileManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapWMSTile";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(defaultFloat = 100.0f, name = "maximumNativeZ")
    public void setMaximumNativeZ(t tVar, float f11) {
        tVar.setMaximumNativeZ(f11);
    }

    @no.a(defaultFloat = 100.0f, name = "maximumZ")
    public void setMaximumZ(t tVar, float f11) {
        tVar.setMaximumZ(f11);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "minimumZ")
    public void setMinimumZ(t tVar, float f11) {
        tVar.setMinimumZ(f11);
    }

    @no.a(defaultBoolean = false, name = "offlineMode")
    public void setOfflineMode(t tVar, boolean z11) {
        tVar.setOfflineMode(z11);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "tileCacheMaxAge")
    public void setTileCacheMaxAge(t tVar, float f11) {
        tVar.setTileCacheMaxAge(f11);
    }

    @no.a(name = "tileCachePath")
    public void setTileCachePath(t tVar, String str) {
        tVar.setTileCachePath(str);
    }

    @no.a(defaultFloat = 256.0f, name = "tileSize")
    public void setTileSize(t tVar, float f11) {
        tVar.setTileSize(f11);
    }

    @no.a(name = "urlTemplate")
    public void setUrlTemplate(t tVar, String str) {
        tVar.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public t createViewInstance(v0 v0Var) {
        return new t(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(t tVar, float f11) {
        tVar.setOpacity(f11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = GroundOverlayOptions.NO_DIMENSION, name = "zIndex")
    public void setZIndex(t tVar, float f11) {
        tVar.setZIndex(f11);
    }
}
