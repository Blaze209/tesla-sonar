package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;

/* JADX INFO: renamed from: com.fourthline.orca.internal.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3061au implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f30490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4101z5 f30491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4101z5 f30492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4101z5 f30493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4101z5 f30494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4101z5 f30495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4044xs f30496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3392ik f30497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3949vk f30498i;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.au$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3319gw.values().length];
            try {
                iArr[EnumC3319gw.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3319gw.SELFIE_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3319gw.USER_CONSENT_REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3319gw.CONFIRMATION_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3061au(InterfaceC3863tk navigationChannel, InterfaceC4101z5 qesSelfieIntroCoordinator, InterfaceC4101z5 qesSelfieScannerCoordinator, InterfaceC4101z5 qesAgreementCoordinator, InterfaceC4101z5 qesPdfRendererCoordinator, InterfaceC4101z5 qesSignCoordinator, InterfaceC4044xs popupHandler, EnumC3319gw initialQesStatus) {
        InterfaceC3949vk aVar;
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(qesSelfieIntroCoordinator, "qesSelfieIntroCoordinator");
        p013kotlin.jvm.internal.s.k(qesSelfieScannerCoordinator, "qesSelfieScannerCoordinator");
        p013kotlin.jvm.internal.s.k(qesAgreementCoordinator, "qesAgreementCoordinator");
        p013kotlin.jvm.internal.s.k(qesPdfRendererCoordinator, "qesPdfRendererCoordinator");
        p013kotlin.jvm.internal.s.k(qesSignCoordinator, "qesSignCoordinator");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(initialQesStatus, "initialQesStatus");
        this.f30490a = navigationChannel;
        this.f30491b = qesSelfieIntroCoordinator;
        this.f30492c = qesSelfieScannerCoordinator;
        this.f30493d = qesAgreementCoordinator;
        this.f30494e = qesPdfRendererCoordinator;
        this.f30495f = qesSignCoordinator;
        this.f30496g = popupHandler;
        this.f30497h = new C3392ik("qes");
        int i11 = a.$EnumSwitchMapping$0[initialQesStatus.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            aVar = InterfaceC3949vk.v.c.f36219b;
        } else if (i11 == 2) {
            aVar = InterfaceC3949vk.v.f.f36225b;
        } else {
            if (i11 != 3 && i11 != 4) {
                throw new IllegalStateException(("QES flow can not be started with " + initialQesStatus + " status. Please filter it out on WorkflowModulesFilter.kt").toString());
            }
            aVar = new InterfaceC3949vk.v.a(null, i12, 0 == true ? 1 : 0);
        }
        this.f30498i = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f30496g, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.ky0
            @Override // wn0.a
            public final Object invoke() {
                return C3061au.a(this.f33169a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f30497h;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f30490a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f30498i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof C3262fi) {
            return c();
        }
        if (navigationEffect instanceof C3690pi) {
            return InterfaceC3949vk.v.d.f36221b;
        }
        if (navigationEffect instanceof C3861ti) {
            return InterfaceC3949vk.v.f.f36225b;
        }
        int i11 = 1;
        C3906uk c3906uk = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (navigationEffect instanceof C3049ai) {
            return new InterfaceC3949vk.v.a(c3906uk, i11, objArr3 == true ? 1 : 0);
        }
        if (navigationEffect instanceof Hj.a.C0493a) {
            return c();
        }
        if (navigationEffect instanceof Hj.a.b) {
            InterfaceC3519lj interfaceC3519ljC = ((Hj.a.b) navigationEffect).c();
            if (interfaceC3519ljC instanceof InterfaceC3519lj.c) {
                return InterfaceC3949vk.v.f.f36225b;
            }
            if (interfaceC3519ljC instanceof InterfaceC3519lj.b) {
                return new InterfaceC3949vk.v.a(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            }
            throw new IllegalStateException("FL Developer error. This LocationFlowAction is not supported for Qes.");
        }
        if (navigationEffect instanceof Nx.a) {
            return c();
        }
        if (navigationEffect instanceof Nx) {
            return this.f30491b.b(navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3364hy.a) {
            return this.f30492c.b(navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3443jt) {
            return this.f30493d.b(navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3275fv) {
            return this.f30494e.b(navigationEffect);
        }
        if (navigationEffect instanceof Dv.c) {
            return this.f30495f.b(navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3061au c3061au) {
        c3061au.f30490a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(QesError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
