package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.document.DocumentCustomizationConfig;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class C7 implements Qs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D7 f25187a = new D7();

    static final class a implements OnProductCompleted {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OnProductCompleted f25188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7 f25189b;

        a(OnProductCompleted onProductCompleted, C7 c11) {
            this.f25188a = onProductCompleted;
            this.f25189b = c11;
        }

        @Override // com.fourthline.orca.core.OnProductCompleted
        public final void onResult(Object obj) {
            this.f25188a.onResult(this.f25189b.f25187a.a(obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    @Override // com.fourthline.orca.internal.Qs
    public InterfaceC3910uo a(XE networkConfig, final C3340ha productConfig, DocumentCustomizationConfig productCustomization, Map customFields, OnProductCompleted onProductCompleted) {
        AbstractC3641oc abstractC3641ocA;
        p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
        p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
        p013kotlin.jvm.internal.s.k(productCustomization, "productCustomization");
        p013kotlin.jvm.internal.s.k(customFields, "customFields");
        p013kotlin.jvm.internal.s.k(onProductCompleted, "onProductCompleted");
        if (productConfig.f() == DocumentType.TIN_REFERENCE_DOCUMENT || productConfig.f() == DocumentType.PROOF_OF_ADDRESS) {
            abstractC3641ocA = null;
        } else if (productConfig.d() == null) {
            abstractC3641ocA = AbstractC3641oc.g.f34200a;
        } else {
            OcrValidationError ocrValidationError = (OcrValidationError) p013kotlin.collections.v.p0(new OcrCountryAndTypeValidator(new wn0.a() { // from class: com.fourthline.orca.internal.g10
                @Override // wn0.a
                public final Object invoke() {
                    return C7.a(productConfig);
                }
            }).validate2(new jn0.w<>(productConfig.d(), productConfig.f(), null)));
            if (ocrValidationError != null) {
                abstractC3641ocA = AbstractC4017x7.a(ocrValidationError);
            } else {
                abstractC3641ocA = null;
            }
        }
        if (abstractC3641ocA != null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            onProductCompleted.onResult(jn0.s.b(jn0.t.a(AbstractC4083yo.b(abstractC3641ocA))));
            return null;
        }
        return V5.b().a(new F7(networkConfig, productConfig, productCustomization, new a(onProductCompleted, this))).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(C3340ha c3340ha) {
        return c3340ha.b().getSupportedDocuments();
    }
}
