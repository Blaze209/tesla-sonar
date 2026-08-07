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
public class MapUrlTileManager extends ViewGroupManager<q> {
    public MapUrlTileManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapUrlTile";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(defaultBoolean = false, name = "doubleTileSize")
    public void setDoubleTileSize(q qVar, boolean z11) {
        qVar.setDoubleTileSize(z11);
    }

    @no.a(defaultBoolean = false, name = "flipY")
    public void setFlipY(q qVar, boolean z11) {
        qVar.setFlipY(z11);
    }

    @no.a(defaultFloat = 100.0f, name = "maximumNativeZ")
    public void setMaximumNativeZ(q qVar, float f11) {
        qVar.setMaximumNativeZ(f11);
    }

    @no.a(defaultFloat = 100.0f, name = "maximumZ")
    public void setMaximumZ(q qVar, float f11) {
        qVar.setMaximumZ(f11);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "minimumZ")
    public void setMinimumZ(q qVar, float f11) {
        qVar.setMinimumZ(f11);
    }

    @no.a(defaultBoolean = false, name = "offlineMode")
    public void setOfflineMode(q qVar, boolean z11) {
        qVar.setOfflineMode(z11);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "tileCacheMaxAge")
    public void setTileCacheMaxAge(q qVar, float f11) {
        qVar.setTileCacheMaxAge(f11);
    }

    @no.a(name = "tileCachePath")
    public void setTileCachePath(q qVar, String str) {
        qVar.setTileCachePath(str);
    }

    @no.a(defaultFloat = 256.0f, name = "tileSize")
    public void setTileSize(q qVar, float f11) {
        qVar.setTileSize(f11);
    }

    @no.a(name = "urlTemplate")
    public void setUrlTemplate(q qVar, String str) {
        qVar.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public q createViewInstance(v0 v0Var) {
        return new q(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(q qVar, float f11) {
        qVar.setOpacity(f11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = GroundOverlayOptions.NO_DIMENSION, name = "zIndex")
    public void setZIndex(q qVar, float f11) {
        qVar.setZIndex(f11);
    }
}
