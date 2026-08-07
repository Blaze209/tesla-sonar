package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;

/* JADX INFO: renamed from: com.fourthline.orca.internal.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3510la implements Ts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnProductCompleted f33267a;

    public C3510la(OnProductCompleted completionBlock) {
        p013kotlin.jvm.internal.s.k(completionBlock, "completionBlock");
        this.f33267a = completionBlock;
    }

    @Override // com.fourthline.orca.internal.Ts
    public void a(Object obj) {
        Object objA;
        OnProductCompleted onProductCompleted = this.f33267a;
        Throwable thE = jn0.s.e(obj);
        if (thE == null) {
            InterfaceC3740qp interfaceC3740qp = (InterfaceC3740qp) obj;
            if (!(interfaceC3740qp instanceof InterfaceC3740qp.a)) {
                throw new IllegalStateException(("FL developer error. Wrong result type is provided to `DocumentProductResultRepository`: " + interfaceC3740qp).toString());
            }
            objA = a(((InterfaceC3740qp.a) interfaceC3740qp).a());
        } else {
            if (!(thE instanceof AbstractC3502l8)) {
                throw new IllegalStateException(("FL developer error. Wrong error type is provided to `DocumentProductResultRepository`: " + thE).toString());
            }
            objA = a((AbstractC3502l8) thE);
        }
        onProductCompleted.onResult(objA);
    }

    private final Object a(C3467ka c3467ka) {
        return jn0.s.b(c3467ka);
    }

    private final Object a(AbstractC3502l8 abstractC3502l8) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(abstractC3502l8));
    }
}
