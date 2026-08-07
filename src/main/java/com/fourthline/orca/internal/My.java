package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class My implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f26979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W6 f26980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f26981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3906uk f26982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3949vk f26983e;

    public My(InterfaceC3863tk navigationChannel, W6 bundle, C3392ik analyticsContext) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        this.f26979a = navigationChannel;
        this.f26980b = bundle;
        this.f26981c = analyticsContext;
        C3906uk c3906uk = new C3906uk(true, true, false, new C3743qs(new InterfaceC3949vk.h.b(null, 1, null), true, false), 4, null);
        this.f26982d = c3906uk;
        this.f26983e = new InterfaceC3949vk.h.b(c3906uk);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f26981c;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f26983e;
    }

    private final InterfaceC3949vk a(InterfaceC2937Ta.a aVar) {
        if (aVar instanceof InterfaceC2937Ta.a.C0518a) {
            return new InterfaceC3949vk.m(AbstractC3502l8.b.f33245a);
        }
        if (aVar instanceof InterfaceC2937Ta.a.d) {
            if (((InterfaceC2937Ta.a.d) aVar).c() instanceof C3802s8) {
                return new InterfaceC3949vk.i.c(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.i.e(null, 1, null), true, false, 4, null), 7, null));
            }
            DocumentScannerResult documentScannerResultB = this.f26980b.b();
            if (documentScannerResultB != null) {
                return new InterfaceC3949vk.n(new InterfaceC3740qp.a(new C3467ka(documentScannerResultB, null, 2, null)));
            }
            throw new IllegalStateException("FL developer error. Expected DocumentScannerResult at this moment.");
        }
        if (aVar instanceof InterfaceC2937Ta.a.c) {
            return new InterfaceC3949vk.m(((InterfaceC2937Ta.a.c) aVar).c());
        }
        if ((aVar instanceof InterfaceC2937Ta.a.b) || (aVar instanceof InterfaceC2937Ta.a.e)) {
            throw new IllegalStateException("Such actions are not possible in standalone mode!");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof InterfaceC2937Ta.a) {
            return a((InterfaceC2937Ta.a) navigationEffect);
        }
        if (navigationEffect instanceof T6) {
            return a((T6) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    private final InterfaceC3949vk a(T6 t11) {
        if (p013kotlin.jvm.internal.s.f(t11, T6.a.f27836a)) {
            return new InterfaceC3949vk.m(AbstractC3502l8.b.f33245a);
        }
        if (p013kotlin.jvm.internal.s.f(t11, T6.d.f27839a)) {
            DocumentScannerResult documentScannerResultB = this.f26980b.b();
            if (documentScannerResultB != null) {
                return new InterfaceC3949vk.n(new InterfaceC3740qp.a(new C3467ka(documentScannerResultB, this.f26980b.c())));
            }
            throw new IllegalStateException("FL developer error. Expected DocumentScannerResult at this moment.");
        }
        if (t11 instanceof T6.c) {
            return new InterfaceC3949vk.m(new AbstractC3502l8.a(((T6.c) t11).c()));
        }
        if (t11 instanceof T6.b) {
            return new InterfaceC3949vk.m(new AbstractC3502l8.a(((T6.b) t11).c()));
        }
        if (t11 instanceof T6.e) {
            return new InterfaceC3949vk.m(new AbstractC3502l8.a(((T6.e) t11).c()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f26979a.mo85trySendJP2dKIU(b(navigationEffect));
    }
}
