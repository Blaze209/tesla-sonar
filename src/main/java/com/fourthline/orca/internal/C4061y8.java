package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycErrorKt;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4061y8 implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f36933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f36934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f36935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.a f36936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4044xs f36937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3392ik f36938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3906uk f36939g;

    public C4061y8(InterfaceC3863tk navigationChannel, wn0.a didNfcCanUseCase, wn0.a skipDocumentDetailsUseCase, wn0.a showPermissionRationaleUseCase, InterfaceC4044xs popupHandler, C3392ik analyticsContext) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(didNfcCanUseCase, "didNfcCanUseCase");
        p013kotlin.jvm.internal.s.k(skipDocumentDetailsUseCase, "skipDocumentDetailsUseCase");
        p013kotlin.jvm.internal.s.k(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        this.f36933a = navigationChannel;
        this.f36934b = didNfcCanUseCase;
        this.f36935c = skipDocumentDetailsUseCase;
        this.f36936d = showPermissionRationaleUseCase;
        this.f36937e = popupHandler;
        this.f36938f = analyticsContext;
        this.f36939g = new C3906uk(true, true, false, new C3743qs(new InterfaceC3949vk.h.b(null, 1, null), true, false), 4, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f36938f;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f36933a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return ((Boolean) this.f36934b.invoke()).booleanValue() ? InterfaceC3949vk.i.d.f36152b : new InterfaceC3949vk.i.e(this.f36939g);
    }

    private final InterfaceC3949vk a(InterfaceC3596na interfaceC3596na) {
        if (interfaceC3596na instanceof InterfaceC3596na.a) {
            return new InterfaceC3949vk.d(null, 1, null);
        }
        if (interfaceC3596na instanceof InterfaceC3596na.b) {
            final InterfaceC3949vk.i.e eVar = new InterfaceC3949vk.i.e(this.f36939g);
            if (((InterfaceC3596na.b) interfaceC3596na).c() || !((Boolean) this.f36936d.invoke()).booleanValue()) {
                return eVar;
            }
            InterfaceC4044xs.a.a(this.f36937e, Ds.a.f25497a, new wn0.a() { // from class: com.fourthline.orca.internal.xi1
                @Override // wn0.a
                public final Object invoke() {
                    return C4061y8.a(this.f36742a, eVar);
                }
            }, null, 4, null);
            return new InterfaceC3949vk.p(null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof InterfaceC2937Ta.a) {
            return a((InterfaceC2937Ta.a) navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3596na) {
            return a((InterfaceC3596na) navigationEffect);
        }
        if (navigationEffect instanceof T6) {
            return a((T6) navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3076b8) {
            return a((InterfaceC3076b8) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C4061y8 c4061y8, InterfaceC3949vk.i.e eVar) {
        c4061y8.f36933a.mo85trySendJP2dKIU(eVar);
        return jn0.h0.f84049a;
    }

    private final InterfaceC3949vk a(InterfaceC2937Ta.a aVar) {
        C3906uk c3906uk = new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.j.d(null, 1, null), false, false, 4, null), 7, null);
        if (aVar instanceof InterfaceC2937Ta.a.C0518a) {
            if (((Boolean) this.f36934b.invoke()).booleanValue()) {
                return new InterfaceC3949vk.b(null, 1, null);
            }
            return new InterfaceC3949vk.d(null, 1, null);
        }
        if (aVar instanceof InterfaceC2937Ta.a.d) {
            InterfaceC2937Ta.a.d dVar = (InterfaceC2937Ta.a.d) aVar;
            Of ofC = dVar.c();
            if (ofC instanceof C3802s8) {
                return new InterfaceC3949vk.i.c(c3906uk);
            }
            if (ofC instanceof C3845t8) {
                return new InterfaceC3949vk.i.b(null, 1, null);
            }
            if (ofC instanceof C3759r8) {
                return new InterfaceC3949vk.i.f(c3906uk);
            }
            if (ofC instanceof C3888u8) {
                return new InterfaceC3949vk.l(c3906uk, Pf.a(dVar.c()));
            }
            throw new IllegalStateException("FL Developer Error. This FlowAction is not supported by DocumentFlowCoordinator.");
        }
        if (aVar instanceof InterfaceC2937Ta.a.e) {
            return new InterfaceC3949vk.d(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.j.d(null, 1, null), false, false, 6, null), 7, null));
        }
        if (aVar instanceof InterfaceC2937Ta.a.b) {
            return new InterfaceC3949vk.d(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.j.a(null, 1, null), false, false, 6, null), 7, null));
        }
        if (aVar instanceof InterfaceC2937Ta.a.c) {
            InterfaceC2937Ta.a.c cVar = (InterfaceC2937Ta.a.c) aVar;
            if (cVar.c() instanceof AbstractC3502l8.a) {
                return new InterfaceC3949vk.m(KycErrorKt.getKycError(cVar.c()));
            }
            return new InterfaceC3949vk.m(KycErrorKt.getKycError(cVar.c()));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(T6 t11) {
        if (t11 instanceof T6.d) {
            if (((Boolean) this.f36935c.invoke()).booleanValue()) {
                return new InterfaceC3949vk.i.f(null, 1, null);
            }
            return new InterfaceC3949vk.i.b(null, 1, null);
        }
        if (t11 instanceof T6.c) {
            return new InterfaceC3949vk.m(KycErrorKt.documentAnalysisErrorToKycError(((T6.c) t11).c()));
        }
        if (t11 instanceof T6.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (t11 instanceof T6.b) {
            return new InterfaceC3949vk.d(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.j.a(new C3906uk(false, true, false, null, 13, null)), false, false, 6, null), 7, null));
        }
        if (t11 instanceof T6.e) {
            return new InterfaceC3949vk.d(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.j.d(null, 1, null), false, false, 6, null), 7, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(InterfaceC3076b8 interfaceC3076b8) {
        if (p013kotlin.jvm.internal.s.f(interfaceC3076b8, InterfaceC3076b8.b.f30571a)) {
            return new InterfaceC3949vk.d(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.j.d(null, 1, null), false, false, 6, null), 7, null));
        }
        if (interfaceC3076b8 instanceof InterfaceC3076b8.a) {
            InterfaceC3076b8.a aVar = (InterfaceC3076b8.a) interfaceC3076b8;
            if (aVar.c() instanceof C3759r8) {
                return new InterfaceC3949vk.i.f(null, 1, null);
            }
            Of ofC = aVar.c();
            C3888u8 c3888u8 = ofC instanceof C3888u8 ? (C3888u8) ofC : null;
            return new InterfaceC3949vk.l(null, c3888u8 != null ? c3888u8.a() : null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
