package com.rnmaps.maps;

import com.facebook.react.uimanager.h1;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class w extends com.facebook.react.uimanager.m {
    @Override // com.facebook.react.uimanager.j0
    public void onCollectExtraUpdates(h1 h1Var) {
        super.onCollectExtraUpdates(h1Var);
        HashMap map = new HashMap();
        map.put(Snapshot.WIDTH, Float.valueOf(getLayoutWidth()));
        map.put(Snapshot.HEIGHT, Float.valueOf(getLayoutHeight()));
        h1Var.O(getReactTag(), map);
    }
}
