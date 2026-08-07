package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public final class Fr implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f25866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Yj f25867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f25868c;

    public Fr(wn0.a imageProvider, Yj poaDocumentPlaceholderLottieSource, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageProvider, "imageProvider");
        p013kotlin.jvm.internal.s.k(poaDocumentPlaceholderLottieSource, "poaDocumentPlaceholderLottieSource");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f25866a = imageProvider;
        this.f25867b = poaDocumentPlaceholderLottieSource;
        this.f25868c = imageServiceLocator;
    }

    public final wn0.l a(final Bitmap image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        return new wn0.l() { // from class: com.fourthline.orca.internal.bb0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Fr.a(image, (Br) obj);
            }
        };
    }

    public final wn0.l g() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ab0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Fr.a((Br) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Br getInitialState() {
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_document_capture_header_confirm, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.step_document_capture_title_capture_ok, 0, 2, null);
        Bitmap bitmap = (Bitmap) this.f25866a.invoke();
        return new Br(dVarA, dVarA2, bitmap != null ? new Br.a.b(bitmap) : new Br.a.C0476a(this.f25867b), QA.a.a(aVar, R.string.step_poa_capture_message_confirm_first, 0, 2, null), QA.a.a(aVar, R.string.step_poa_capture_message_confirm_second, 0, 2, null), QA.a.a(aVar, R.string.step_poa_capture_message_confirm_third, 0, 2, null), QA.a.a(aVar, R.string.shared_button_change_document, 0, 2, null), QA.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), this.f25868c.a(EnumC3689ph.N0), null, 512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Br a(Bitmap bitmap, Br br2) {
        p013kotlin.jvm.internal.s.k(br2, "<this>");
        return Br.a(br2, null, null, null, null, null, null, null, null, null, new C2916Oe(k3.n0.c(bitmap)), 511, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Br a(Br br2) {
        p013kotlin.jvm.internal.s.k(br2, "<this>");
        return Br.a(br2, null, null, null, null, null, null, null, null, null, null, 511, null);
    }
}
