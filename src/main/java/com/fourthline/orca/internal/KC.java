package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class KC implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f26560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4044xs f26561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f26562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3949vk f26563d;

    public KC(InterfaceC3863tk navigationChannel, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f26560a = navigationChannel;
        this.f26561b = popupHandler;
        this.f26562c = new C3392ik("workflow_uploading");
        this.f26563d = InterfaceC3949vk.z.b.f36247b;
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f26561b, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.gh0
            @Override // wn0.a
            public final Object invoke() {
                return KC.a(this.f32022a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f26562c;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f26563d;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(FC navigationEffect) {
        InterfaceC3949vk lVar;
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof FC.a) {
            lVar = c();
        } else if (navigationEffect instanceof FC.b) {
            lVar = new InterfaceC3949vk.l(null, Pf.a(((FC.b) navigationEffect).c()), 1, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f26560a.mo85trySendJP2dKIU(lVar);
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        throw new IllegalStateException("FL developer error. Consume() is not supported by this UploadDataFlowCoordinator.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(KC kc2) {
        kc2.f26560a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
