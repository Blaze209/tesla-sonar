package com.oney.WebRTCModule;

import com.facebook.react.uimanager.SimpleViewManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class RTCVideoViewManager extends SimpleViewManager<x2> {
    private static final String REACT_CLASS = "RTCVideoView";

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("registrationName", "onDimensionsChange");
        map.put("onDimensionsChange", map2);
        return map;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @no.a(name = "mirror")
    public void setMirror(x2 x2Var, boolean z11) {
        x2Var.setMirror(z11);
    }

    @no.a(name = "objectFit")
    public void setObjectFit(x2 x2Var, String str) {
        x2Var.setObjectFit(str);
    }

    @no.a(name = "onDimensionsChange")
    public void setOnDimensionsChange(x2 x2Var, boolean z11) {
        x2Var.setOnDimensionsChange(z11);
    }

    @no.a(name = "streamURL")
    public void setStreamURL(x2 x2Var, String str) {
        x2Var.setStreamURL(str);
    }

    @no.a(name = "zOrder")
    public void setZOrder(x2 x2Var, int i11) {
        x2Var.setZOrder(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public x2 createViewInstance(com.facebook.react.uimanager.v0 v0Var) {
        return new x2(v0Var);
    }
}
