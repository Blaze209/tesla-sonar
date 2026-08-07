package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public final class Nj implements Eh, Xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yj f27056a;

    public Nj(Yj locationIntroLottieSource) {
        p013kotlin.jvm.internal.s.k(locationIntroLottieSource, "locationIntroLottieSource");
        this.f27056a = locationIntroLottieSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Kj a(boolean z11, Kj kj2) {
        p013kotlin.jvm.internal.s.k(kj2, "<this>");
        boolean z12 = !z11;
        return Kj.a(kj2, null, null, null, null, kj2.q().a(kj2.q().a().a(z11 ? QA.a.a(QA.f27433a, R.string.shared_button_verifying, 0, 2, null) : QA.a.a(QA.f27433a, R.string.shared_button_continue, 0, 2, null), z12, z11)), kj2.r().a(z12), null, 79, null);
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.tj0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Nj.a(z11, (Kj) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Kj getInitialState() {
        QA.a aVar = QA.f27433a;
        return new Kj(QA.a.a(aVar, R.string.step_metadata_header, 0, 2, null), QA.a.a(aVar, R.string.step_metadata_title, 0, 2, null), QA.a.a(aVar, R.string.step_metadata_message, 0, 2, null), this.f27056a, new InterfaceC3777rk.b(true, false), new InterfaceC3777rk.a.c(null, 1, null), Kj.a.SCANNING);
    }

    public final wn0.l o() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.sj0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Nj.a((Kj) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Kj a(Kj kj2) {
        p013kotlin.jvm.internal.s.k(kj2, "<this>");
        return Kj.a(kj2, null, null, null, null, kj2.q().a(kj2.q().a().a(QA.a.a(QA.f27433a, R.string.shared_button_verifying, 0, 2, null), false, true)), kj2.r().a(true), null, 79, null);
    }
}
