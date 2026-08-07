package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: loaded from: classes4.dex */
public final class N7 implements InterfaceC3131cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Is f27025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Eh f27026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f27027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ND f27028d;

    public N7(Is presenter, Eh stateProvider, C2874Gc effectHandler, ND viewNavigator) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        this.f27025a = presenter;
        this.f27026b = stateProvider;
        this.f27027c = effectHandler;
        this.f27028d = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(InterfaceC3807sD intent, M0 error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        this.f27025a.a(new wn0.l() { // from class: com.fourthline.orca.internal.mj0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return N7.a(this.f33601a, (L0) obj);
            }
        });
        this.f27027c.a(new wn0.a() { // from class: com.fourthline.orca.internal.nj0
            @Override // wn0.a
            public final Object invoke() {
                return N7.a();
            }
        });
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(InterfaceC3807sD intent, M0 error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        this.f27028d.a(new R7.b(KycError.IssuingCountryNotSupported.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 a(N7 n11, L0 present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return L0.a((L0) n11.f27026b.getInitialState(), null, null, null, null, K0.a(present.p(), null, null, false, null, null, null, Gh.FOCUSED, null, null, null, null, null, 4031, null), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I0 a() {
        return I0.c.f26176a;
    }
}
