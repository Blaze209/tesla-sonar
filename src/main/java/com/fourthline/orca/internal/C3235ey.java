package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.vision.selfie.SelfieScannerResult;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3235ey implements Ts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnProductCompleted f31553a;

    public C3235ey(OnProductCompleted completionBlock) {
        p013kotlin.jvm.internal.s.k(completionBlock, "completionBlock");
        this.f31553a = completionBlock;
    }

    @Override // com.fourthline.orca.internal.Ts
    public void a(Object obj) {
        Object objA;
        OnProductCompleted onProductCompleted = this.f31553a;
        Throwable thE = jn0.s.e(obj);
        if (thE == null) {
            InterfaceC3740qp interfaceC3740qp = (InterfaceC3740qp) obj;
            if (!(interfaceC3740qp instanceof InterfaceC3740qp.b)) {
                throw new IllegalStateException(("FL developer error. Wrong result type is provided to `SelfieProductResultRepository`: " + interfaceC3740qp).toString());
            }
            objA = a(((InterfaceC3740qp.b) interfaceC3740qp).a());
        } else {
            if (!(thE instanceof AbstractC3397ip)) {
                throw new IllegalStateException(("FL developer error. Wrong error type is provided to `SelfieProductResultRepository`: " + thE).toString());
            }
            objA = a((AbstractC3397ip) thE);
        }
        onProductCompleted.onResult(objA);
    }

    private final Object a(SelfieScannerResult selfieScannerResult) {
        return jn0.s.b(selfieScannerResult);
    }

    private final Object a(AbstractC3397ip abstractC3397ip) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(abstractC3397ip));
    }
}
