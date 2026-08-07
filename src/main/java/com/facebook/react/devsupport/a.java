package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class a extends c0 {
    public a(Context context, z0 z0Var, String str, boolean z11, pn.j jVar, pn.b bVar, int i11, Map<String, jo.f> map, jn.i iVar, pn.c cVar, pn.i iVar2) {
        super(context, z0Var, str, z11, jVar, bVar, i11, map, iVar, cVar, iVar2);
    }

    @Override // pn.e
    public void C() {
        UiThreadUtil.assertOnUiThread();
        w();
        this.f22408f.a("BridgelessDevSupportManager.handleReloadJS()");
    }

    @Override // com.facebook.react.devsupport.c0
    protected String j0() {
        return "Bridgeless";
    }
}
