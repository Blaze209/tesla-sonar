package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class N implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f26990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4044xs f26991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f26992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3949vk f26993d;

    public N(InterfaceC3863tk navigationChannel, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f26990a = navigationChannel;
        this.f26991b = popupHandler;
        this.f26992c = new C3392ik(PlaceTypes.ADDRESS);
        this.f26993d = InterfaceC3949vk.InterfaceC3950a.b.f36128b;
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f26991b, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.kj0
            @Override // wn0.a
            public final Object invoke() {
                return N.a(this.f33009a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f26992c;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f26993d;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(InterfaceC3025a0 navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof B.c) {
            this.f26990a.mo85trySendJP2dKIU(a((B.c) navigationEffect));
        } else {
            throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    private final InterfaceC3949vk a(B.c cVar) {
        if (p013kotlin.jvm.internal.s.f(cVar, B.c.a.f25039a)) {
            return c();
        }
        if (cVar instanceof B.c.b) {
            return new InterfaceC3949vk.l(null, Pf.a(((B.c.b) cVar).c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(N n11) {
        n11.f26990a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
