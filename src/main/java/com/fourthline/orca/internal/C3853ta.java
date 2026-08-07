package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3853ta implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3682pa f35628a;

    public C3853ta(Yj documentReadyLottieSource, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(documentReadyLottieSource, "documentReadyLottieSource");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        QA.a aVar = QA.f27433a;
        this.f35628a = new C3682pa(documentReadyLottieSource, QA.a.a(aVar, R.string.step_document_ready_header, 0, 2, null), QA.a.a(aVar, R.string.step_document_ready_title, 0, 2, null), QA.a.a(aVar, R.string.step_document_ready_message, 0, 2, null), new InterfaceC3807sD.d(null, 1, null), new InterfaceC3807sD.a(QA.a.a(aVar, R.string.shared_button_back, 0, 2, null)), p013kotlin.collections.v.p(new C3682pa.a(imageServiceLocator.a(EnumC3689ph.R0), QA.a.a(aVar, R.string.shared_dialog_action_ready_document_hint1, 0, 2, null)), new C3682pa.a(imageServiceLocator.a(EnumC3689ph.S0), QA.a.a(aVar, R.string.shared_dialog_action_ready_document_hint2, 0, 2, null)), new C3682pa.a(imageServiceLocator.a(EnumC3689ph.T0), QA.a.a(aVar, R.string.shared_dialog_action_ready_document_hint3, 0, 2, null))));
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3682pa getInitialState() {
        return this.f35628a;
    }
}
