package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4105z9 implements InterfaceC3947vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3475ki f37227a;

    public C4105z9(Yj documentIntroLottieSource) {
        p013kotlin.jvm.internal.s.k(documentIntroLottieSource, "documentIntroLottieSource");
        QA.a aVar = QA.f27433a;
        this.f37227a = new C3475ki("document_intro", QA.a.a(aVar, R.string.step_document_intro_header, 0, 2, null), QA.a.a(aVar, R.string.step_document_intro_message, 0, 2, null), documentIntroLottieSource, new InterfaceC3777rk.b(null, 1, null), new InterfaceC3777rk.a.c(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3947vi
    public wn0.l a(boolean z11) {
        return InterfaceC3947vi.a.a(this, z11);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3475ki getInitialState() {
        return this.f37227a;
    }
}
