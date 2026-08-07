package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.GroundOverlayOptions;

/* JADX INFO: loaded from: classes6.dex */
public class MapLocalTileManager extends ViewGroupManager<k> {
    public MapLocalTileManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapLocalTile";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "pathTemplate")
    public void setPathTemplate(k kVar, String str) {
        kVar.setPathTemplate(str);
    }

    @no.a(defaultFloat = 256.0f, name = "tileSize")
    public void setTileSize(k kVar, float f11) {
        kVar.setTileSize(f11);
    }

    @no.a(defaultBoolean = false, name = "useAssets")
    public void setUseAssets(k kVar, boolean z11) {
        kVar.setUseAssets(z11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(v0 v0Var) {
        return new k(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = GroundOverlayOptions.NO_DIMENSION, name = "zIndex")
    public void setZIndex(k kVar, float f11) {
        kVar.setZIndex(f11);
    }
}
