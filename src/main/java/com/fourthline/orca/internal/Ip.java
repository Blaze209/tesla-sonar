package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Ip extends androidx.p003lifecycle.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26363a = new LinkedHashMap();

    public final Object a(String key, wn0.a create) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(create, "create");
        Map map = this.f26363a;
        Object objInvoke = map.get(key);
        if (objInvoke == null) {
            objInvoke = create.invoke();
            map.put(key, objInvoke);
        }
        p013kotlin.jvm.internal.s.i(objInvoke, "null cannot be cast to non-null type T of com.fourthline.orca.core.internal.viewmodel.PersistentStorage.getOrCreate");
        return objInvoke;
    }

    @Override // androidx.p003lifecycle.c1
    protected void onCleared() {
        Iterator it = this.f26363a.entrySet().iterator();
        while (it.hasNext()) {
            ((Map.Entry) it.next()).getValue();
        }
        this.f26363a.clear();
    }
}
