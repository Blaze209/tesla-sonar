package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4039xn implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yj f36773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f36774b;

    public C4039xn(Yj nfcIntroLottieSource, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(nfcIntroLottieSource, "nfcIntroLottieSource");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f36773a = nfcIntroLottieSource;
        this.f36774b = imageServiceLocator;
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3780rn getInitialState() {
        QA.a aVar = QA.f27433a;
        return new C3780rn(QA.a.a(aVar, R.string.step_document_nfc_intro_header_centric, 0, 2, null), this.f36773a, QA.a.a(aVar, R.string.step_document_nfc_intro_title, 0, 2, null), QA.a.a(aVar, R.string.step_document_nfc_intro_message, 0, 2, null), new InterfaceC3777rk.b(QA.a.a(aVar, R.string.step_document_nfc_intro_button_start_nfc_scan, 0, 2, null)), new C3780rn.b(QA.a.a(aVar, R.string.step_document_nfc_intro_footer_how_to_scan, 0, 2, null), QA.a.a(aVar, R.string.shared_button_add_details_manually, 0, 2, null)), new InterfaceC3777rk.a.C0608a(null, 1, null), new C3780rn.a(this.f36774b.a(EnumC3689ph.A0), QA.a.a(aVar, R.string.shared_hint_nfc_instructions, 0, 2, null)));
    }
}
