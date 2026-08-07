package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public final class Bi extends AB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3475ki f25097a;

    public Bi(Yj tinIntroLottieSource) {
        p013kotlin.jvm.internal.s.k(tinIntroLottieSource, "tinIntroLottieSource");
        QA.a aVar = QA.f27433a;
        this.f25097a = new C3475ki("tin_intro", QA.a.a(aVar, R.string.step_tin_intro_header_ita, 0, 2, null), QA.a.a(aVar, R.string.step_tin_intro_message_ita, 0, 2, null), tinIntroLottieSource, new InterfaceC3777rk.b(null, 1, null), new InterfaceC3777rk.a.c(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3475ki getInitialState() {
        return this.f25097a;
    }
}
