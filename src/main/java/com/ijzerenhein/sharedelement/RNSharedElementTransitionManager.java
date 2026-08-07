package com.ijzerenhein.sharedelement;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class RNSharedElementTransitionManager extends SimpleViewManager<m> {
    public static final String REACT_CLASS = "RNSharedElementTransition";

    public RNSharedElementTransitionManager(ReactApplicationContext reactApplicationContext) {
    }

    private void setViewItem(m mVar, m.b bVar, ReadableMap readableMap) {
        if (readableMap != null && readableMap.hasKey("node") && readableMap.hasKey("ancestor")) {
            ReadableMap map = readableMap.getMap("node");
            ReadableMap map2 = readableMap.getMap("ancestor");
            int i11 = map.getInt("nodeHandle");
            int i12 = map2.getInt("nodeHandle");
            boolean z11 = map.getBoolean("isParent");
            ReadableMap map3 = map.getMap("nodeStyle");
            mVar.j(bVar, mVar.getNodeManager().a(i11, mVar.getNodeManager().b().resolveView(i11), z11, mVar.getNodeManager().b().resolveView(i12), map3));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return jn.c.a().b("onMeasureNode", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onMeasureNode"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNSharedElementTransition";
    }

    @no.a(name = "align")
    public void setAlign(m mVar, int i11) {
        mVar.setAlign(a.values()[i11]);
    }

    @no.a(name = "animation")
    public void setAnimation(m mVar, int i11) {
        mVar.setAnimation(b.values()[i11]);
    }

    @no.a(name = "endNode")
    public void setEndNode(m mVar, ReadableMap readableMap) {
        setViewItem(mVar, m.b.END, readableMap);
    }

    @no.a(name = "nodePosition")
    public void setNodePosition(m mVar, float f11) {
        mVar.setNodePosition(f11);
    }

    @no.a(name = "resize")
    public void setResize(m mVar, int i11) {
        mVar.setResize(i.values()[i11]);
    }

    @no.a(name = "startNode")
    public void setStartNode(m mVar, ReadableMap readableMap) {
        setViewItem(mVar, m.b.START, readableMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public m createViewInstance(v0 v0Var) {
        return new m(v0Var, ((RNSharedElementModule) v0Var.getNativeModule(RNSharedElementModule.class)).getNodeManager());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull m mVar) {
        super.onDropViewInstance(mVar);
        mVar.h();
    }
}
