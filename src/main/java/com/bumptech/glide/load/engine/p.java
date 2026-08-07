package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<dj.e, k<?>> f20721a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<dj.e, k<?>> f20722b = new HashMap();

    p() {
    }

    private Map<dj.e, k<?>> b(boolean z11) {
        return z11 ? this.f20722b : this.f20721a;
    }

    k<?> a(dj.e eVar, boolean z11) {
        return b(z11).get(eVar);
    }

    void c(dj.e eVar, k<?> kVar) {
        b(kVar.p()).put(eVar, kVar);
    }

    void d(dj.e eVar, k<?> kVar) {
        Map<dj.e, k<?>> mapB = b(kVar.p());
        if (kVar.equals(mapB.get(eVar))) {
            mapB.remove(eVar);
        }
    }
}
