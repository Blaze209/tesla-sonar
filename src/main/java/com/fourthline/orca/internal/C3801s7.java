package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3801s7 implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yj f35209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Yj f35210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3903uh f35211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V6.b f35212d;

    public C3801s7(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        Yj yjA = lottieServiceLocator.a(Tj.DocumentIntro);
        this.f35209a = yjA;
        Yj yjA2 = lottieServiceLocator.a(Tj.NetworkSpinnerBold);
        this.f35210b = yjA2;
        this.f35211c = imageServiceLocator.a(EnumC3689ph.H0);
        QA.a aVar = QA.f27433a;
        this.f35212d = new V6.b(QA.a.a(aVar, R.string.step_document_processing_header_processing, 0, 2, null), QA.a.a(aVar, R.string.step_document_processing_message, 0, 2, null), yjA, yjA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V6.b a(C3801s7 c3801s7, V6 v11) {
        p013kotlin.jvm.internal.s.k(v11, "<this>");
        return V6.b.a(c3801s7.getInitialState(), null, QA.a.a(QA.f27433a, R.string.step_document_processing_message_waiting, 0, 2, null), null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V6.a b(C3801s7 c3801s7, V6 v11) {
        p013kotlin.jvm.internal.s.k(v11, "<this>");
        return new V6.a(QA.a.a(QA.f27433a, R.string.step_document_processing_header_success, 0, 2, null), QA.b.f27435b, c3801s7.f35209a, c3801s7.f35211c);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public V6.b getInitialState() {
        return this.f35212d;
    }

    public final wn0.l o() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.yb1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3801s7.a(this.f36979a, (V6) obj);
            }
        };
    }

    public final wn0.l r() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.zb1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3801s7.b(this.f37254a, (V6) obj);
            }
        };
    }
}
