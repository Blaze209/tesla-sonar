package com.rnmaps.maps;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MapCalloutManager extends ViewGroupManager<f> {
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return jn.c.d("onPress", jn.c.d("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCallout";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(defaultBoolean = false, name = "tooltip")
    public void setTooltip(f fVar, boolean z11) {
        fVar.setTooltip(z11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.m createShadowNodeInstance() {
        return new w();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(v0 v0Var) {
        return new f(v0Var);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(f fVar, Object obj) {
        Map map = (Map) obj;
        float fFloatValue = ((Float) map.get(Snapshot.WIDTH)).floatValue();
        float fFloatValue2 = ((Float) map.get(Snapshot.HEIGHT)).floatValue();
        fVar.f49140b = (int) fFloatValue;
        fVar.f49141c = (int) fFloatValue2;
    }
}
