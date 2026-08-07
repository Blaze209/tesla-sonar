package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3297ga implements InterfaceC3216ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f31983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f31984c;

    public C3297ga(boolean z11, wn0.a minPersonAgeFactory, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(minPersonAgeFactory, "minPersonAgeFactory");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f31982a = z11;
        this.f31983b = minPersonAgeFactory;
        this.f31984c = imageServiceLocator;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0150  */
    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e buildStateFor(AbstractC3502l8.d error) {
        QA qaA;
        InterfaceC3807sD kVar;
        InterfaceC3807sD.g gVar;
        p013kotlin.jvm.internal.s.k(error, "error");
        AbstractC3641oc abstractC3641ocA = error.a();
        AbstractC3641oc.e eVar = AbstractC3641oc.e.f34198a;
        if (p013kotlin.jvm.internal.s.f(abstractC3641ocA, eVar)) {
            qaA = QA.a.a(QA.f27433a, R.string.shared_dialog_error_document_type_not_supported_title, 0, 2, null);
        } else if (p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.a.f34194a)) {
            qaA = QA.a.a(QA.f27433a, R.string.shared_dialog_error_expired_document_title, 0, 2, null);
        } else if (p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.d.f34197a)) {
            qaA = QA.a.a(QA.f27433a, R.string.shared_dialog_error_different_scanned_document_title, 0, 2, null);
        } else if (p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.g.f34200a)) {
            qaA = QA.a.a(QA.f27433a, R.string.shared_dialog_error_unsupported_issuing_country_title, 0, 2, null);
        } else if (p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.i.f34202a)) {
            qaA = QA.a.a(QA.f27433a, R.string.shared_dialog_error_document_nationality_not_supported_title, 0, 2, null);
        } else {
            if (!p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.j.f34203a)) {
                if (!p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.f.f34199a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.c.f34196a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.b.f34195a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.h.f34201a)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Document PostProcessing doesn't handle this error: " + error).toString());
            }
            qaA = QA.f27433a.a(R.string.shared_dialog_error_underage_title, String.valueOf(((Number) this.f31983b.invoke()).intValue()));
        }
        QA qa2 = qaA;
        AbstractC3641oc abstractC3641ocA2 = error.a();
        if (p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.g.f34200a)) {
            kVar = new InterfaceC3807sD.k(QA.a.a(QA.f27433a, R.string.shared_button_change_issuing_country, 0, 2, null));
        } else if (p013kotlin.jvm.internal.s.f(abstractC3641ocA2, eVar) || p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.i.f34202a) || p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.d.f34197a)) {
            kVar = new InterfaceC3807sD.k(QA.a.a(QA.f27433a, R.string.shared_button_change_document, 0, 2, null));
        } else if (p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.a.f34194a)) {
            kVar = new InterfaceC3807sD.k(QA.a.a(QA.f27433a, R.string.shared_button_valid_document, 0, 2, null));
        } else {
            if (!p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.j.f34203a)) {
                if (!p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.f.f34199a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.c.f34196a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.b.f34195a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA2, AbstractC3641oc.h.f34201a)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Document PostProcessing doesn't handle this error: " + error).toString());
            }
            kVar = new InterfaceC3807sD.g(null, 1, null);
        }
        InterfaceC3807sD interfaceC3807sD = kVar;
        if (this.f31982a) {
            AbstractC3641oc abstractC3641ocA3 = error.a();
            if (p013kotlin.jvm.internal.s.f(abstractC3641ocA3, AbstractC3641oc.j.f34203a) || p013kotlin.jvm.internal.s.f(abstractC3641ocA3, AbstractC3641oc.d.f34197a)) {
                gVar = null;
            } else {
                gVar = new InterfaceC3807sD.g(null, 1, null);
            }
        } else {
            gVar = null;
        }
        return new InterfaceC4001ws.e(this.f31984c.a(EnumC3689ph.B0), qa2, interfaceC3807sD, gVar, true);
    }
}
