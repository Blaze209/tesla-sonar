package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.plaid.internal.EnumC4419g;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Pv implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f27396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Kh f27397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Gv f27400e;

    public Pv(InterfaceC3732qh imageServiceLocator, String partialPhoneNumber, List signDocumentNames, Kh analytics, int i11) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(partialPhoneNumber, "partialPhoneNumber");
        p013kotlin.jvm.internal.s.k(signDocumentNames, "signDocumentNames");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f27396a = imageServiceLocator;
        this.f27397b = analytics;
        this.f27398c = i11;
        this.f27399d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.vl0
            @Override // wn0.a
            public final Object invoke() {
                return Pv.a(this.f36256a);
            }
        });
        QA.d dVarA = QA.a.a(QA.f27433a, R.string.shared_button_sign, 0, 2, null);
        int i12 = R.string.step_qes_sign_message;
        Iterator it = signDocumentNames.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ((String) next) + ", " + ((String) it.next());
        }
        QA.c cVar = new QA.c(i12, p013kotlin.collections.v.e(next));
        QA.a aVar = QA.f27433a;
        QA.d dVarA2 = QA.a.a(aVar, R.string.shared_button_sign, 0, 2, null);
        QA.d dVarA3 = QA.a.a(aVar, R.string.shared_button_exit, 0, 2, null);
        QA.d dVarA4 = QA.a.a(aVar, R.string.step_qes_sign_label_code, 0, 2, null);
        QA.b bVar = QA.b.f27435b;
        StringBuilder sb2 = new StringBuilder();
        int i13 = this.f27398c;
        for (int i14 = 0; i14 < i13; i14++) {
            sb2.append('X');
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        Nh nh2 = new Nh(null, "qes_otp_code", false, Gh.UNFOCUSED, "", dVarA4, new QA.e(string), bVar, null, null, 0, 1797, null);
        this.f27397b.a(nh2);
        QA.c cVar2 = new QA.c(R.string.step_qes_sign_hint_sms_sent_to, p013kotlin.collections.v.e(partialPhoneNumber));
        QA.a aVar2 = QA.f27433a;
        this.f27400e = new Gv(dVarA, cVar, nh2, cVar2, new Gv.a(true, QA.a.a(aVar2, R.string.step_qes_sign_alternative_sms_not_received, 0, 2, null), QA.a.a(aVar2, R.string.shared_button_send_again, 0, 2, null), null, 8, null), dVarA2, false, false, dVarA3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3903uh a(Pv pv2) {
        return pv2.f27396a.a(EnumC3689ph.C0);
    }

    private final InterfaceC3903uh r() {
        return (InterfaceC3903uh) this.f27399d.getValue();
    }

    public final wn0.l j() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.tl0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pv.a((Gv) obj);
            }
        };
    }

    public final wn0.l o() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.am0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pv.b((Gv) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Gv getInitialState() {
        return this.f27400e;
    }

    public final wn0.l t() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ul0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pv.a(this.f35928a, (Gv) obj);
            }
        };
    }

    public final wn0.l u() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.zl0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pv.c((Gv) obj);
            }
        };
    }

    public final wn0.l v() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.yl0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pv.b(this.f37042a, (Gv) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gv b(Gv gv2) {
        p013kotlin.jvm.internal.s.k(gv2, "<this>");
        return Gv.a(gv2, null, null, Nh.a(gv2.p(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, false, false, null, false, 1019, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gv c(Gv gv2) {
        p013kotlin.jvm.internal.s.k(gv2, "<this>");
        return Gv.a(gv2, null, null, Nh.a(gv2.p(), null, null, false, Gh.DISABLED, null, null, null, null, null, null, 0, 2039, null), null, Gv.a.a(gv2.r(), false, null, null, null, 14, null), QA.a.a(QA.f27433a, R.string.shared_button_signing, 0, 2, null), true, false, null, false, EnumC4419g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, null);
    }

    public final wn0.l a(final String code) {
        p013kotlin.jvm.internal.s.k(code, "code");
        return new wn0.l() { // from class: com.fourthline.orca.internal.xl0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pv.a(code, this, (Gv) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gv a(String str, Pv pv2, Gv gv2) {
        p013kotlin.jvm.internal.s.k(gv2, "<this>");
        return Gv.a(gv2, null, null, Nh.a(gv2.p(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, false, pv2.a(gv2.p(), str), null, false, 891, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gv a(Pv pv2, Gv gv2) {
        p013kotlin.jvm.internal.s.k(gv2, "<this>");
        Nh nhP = gv2.p();
        QA.a aVar = QA.f27433a;
        return Gv.a(gv2, null, null, Nh.a(nhP, null, null, false, Gh.ERROR, "", null, null, QA.a.a(aVar, R.string.step_qes_sign_validation_invalid_code, 0, 2, null), pv2.r(), null, 0, 1639, null), null, Gv.a.a(gv2.r(), gv2.r().b() == null, null, null, null, 14, null), QA.a.a(aVar, R.string.shared_button_sign, 0, 2, null), false, false, null, true, EnumC4419g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, null);
    }

    public final wn0.l c(final int i11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.wl0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pv.a(i11, (Gv) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    public static final Gv b(Pv pv2, Gv gv2) {
        Th dVar;
        QA qaA;
        p013kotlin.jvm.internal.s.k(gv2, "<this>");
        if (!(gv2.p().getState() == Gh.FOCUSED)) {
            dVar = null;
        } else if (gv2.p().c().length() == 0) {
            dVar = new Th.c();
        } else if (gv2.p().c().length() < pv2.f27398c) {
            dVar = new Th.d();
        } else {
            dVar = null;
        }
        Gh gh2 = dVar == null ? Gh.UNFOCUSED : Gh.ERROR;
        if (dVar instanceof Th.c) {
            qaA = QA.f27433a.b(R.string.shared_validation_required_sign_code_accessibility);
        } else {
            qaA = dVar instanceof Th.d ? QA.f27433a.a(R.string.shared_validation_invalid_sign_code_accessibility) : QA.b.f27435b;
        }
        QA qa2 = qaA;
        Nh nhA = Nh.a(gv2.p(), null, null, false, gh2, null, null, null, qa2, p013kotlin.jvm.internal.s.f(qa2, QA.b.f27435b) ? null : pv2.r(), null, 0, 1655, null);
        pv2.f27397b.b(nhA);
        if (dVar != null) {
            pv2.f27397b.a(nhA, dVar);
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        return Gv.a(gv2, null, null, nhA, null, null, null, false, false, null, false, 1019, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gv a(int i11, Gv gv2) {
        p013kotlin.jvm.internal.s.k(gv2, "<this>");
        return Gv.a(gv2, null, null, null, null, Gv.a.a(gv2.r(), false, null, null, Integer.valueOf(i11), 6, null), null, false, false, null, false, 1007, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gv a(Gv gv2) {
        p013kotlin.jvm.internal.s.k(gv2, "<this>");
        return Gv.a(gv2, null, null, null, null, Gv.a.a(gv2.r(), true, null, null, null, 6, null), null, false, false, null, false, 1007, null);
    }

    private final boolean a(Nh nh2, String str) {
        return str.length() == this.f27398c;
    }
}
