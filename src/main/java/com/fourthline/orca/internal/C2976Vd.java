package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2976Vd implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2900Ld f29067a;

    public C2976Vd() {
        QA.a aVar = QA.f27433a;
        this.f29067a = new C2900Ld(QA.a.a(aVar, R.string.step_eid_pin_header_germany, 0, 2, null), QA.a.a(aVar, R.string.step_eid_pin_message_germany, 0, 2, null), QA.a.a(aVar, R.string.step_eid_pin_label, 0, 2, null), new C2900Ld.a(QA.a.a(aVar, R.string.step_eid_pin_hint_germany, 0, 2, null), "AusweisApp"), false, new C2900Ld.b(QA.a.a(aVar, R.string.step_document_type_footer_document_not_accepted, 0, 2, null), QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2900Ld a(C2900Ld c2900Ld) {
        p013kotlin.jvm.internal.s.k(c2900Ld, "<this>");
        return C2900Ld.a(c2900Ld, null, null, null, null, false, null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2900Ld b(C2900Ld c2900Ld) {
        p013kotlin.jvm.internal.s.k(c2900Ld, "<this>");
        return C2900Ld.a(c2900Ld, null, null, null, null, true, null, 47, null);
    }

    public final wn0.l j() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ur0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C2976Vd.a((C2900Ld) obj);
            }
        };
    }

    public final wn0.l o() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.tr0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C2976Vd.b((C2900Ld) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2900Ld getInitialState() {
        return this.f29067a;
    }
}
