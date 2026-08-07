package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public final class Yu implements InterfaceC3947vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3475ki f29944a;

    public Yu(Yj qesIntroLottieSource) {
        p013kotlin.jvm.internal.s.k(qesIntroLottieSource, "qesIntroLottieSource");
        this.f29944a = new C3475ki("qes_intro", new QA.d(R.string.step_qes_intro_header, 0, 2, null), new QA.d(R.string.step_qes_intro_message, 0, 2, null), qesIntroLottieSource, new InterfaceC3777rk.b(QA.a.a(QA.f27433a, R.string.shared_button_start, 0, 2, null)), new InterfaceC3777rk.a.c(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3947vi
    public wn0.l a(boolean z11) {
        return InterfaceC3947vi.a.a(this, z11);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3475ki getInitialState() {
        return this.f29944a;
    }
}
