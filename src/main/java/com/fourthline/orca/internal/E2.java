package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public final class E2 implements Eh, Xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A2 f25544a;

    public E2(Yj networkSpinnerThinkLottieSource) {
        p013kotlin.jvm.internal.s.k(networkSpinnerThinkLottieSource, "networkSpinnerThinkLottieSource");
        this.f25544a = new A2(new QA.d(R.string.step_qes_loading_header, 0, 2, null), new E3(new QA.d(R.string.shared_button_exit, 0, 2, null), false, false, 6, null), networkSpinnerThinkLottieSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A2 a(boolean z11, A2 a11) {
        p013kotlin.jvm.internal.s.k(a11, "<this>");
        return A2.a(a11, null, E3.a(a11.p(), null, !z11, false, 5, null), null, 5, null);
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.f20
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return E2.a(z11, (A2) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public A2 getInitialState() {
        return this.f25544a;
    }
}
