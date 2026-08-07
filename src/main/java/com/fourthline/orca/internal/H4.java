package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.List;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class H4 implements Eh, Xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G4 f26079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f26080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kh f26081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f26082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f26083e;

    public H4(G4 repository, InterfaceC3732qh imageServiceLocator, Kh analytics) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f26079a = repository;
        this.f26080b = imageServiceLocator;
        this.f26081c = analytics;
        this.f26082d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.nd0
            @Override // wn0.a
            public final Object invoke() {
                return H4.a(this.f33910a);
            }
        });
        this.f26083e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.od0
            @Override // wn0.a
            public final Object invoke() {
                return H4.b(this.f34216a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3903uh a(H4 h11) {
        return h11.f26080b.a(EnumC3689ph.C0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Y4 b(H4 h11) {
        String strG;
        String strE;
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_contact_details_header, 0, 2, null);
        InterfaceC3777rk.b bVar = new InterfaceC3777rk.b(h11.f26079a.i());
        InterfaceC3777rk.a.c cVar = new InterfaceC3777rk.a.c(null, 1, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.step_contact_details_label_email, 0, 2, null);
        QA.d dVarA3 = QA.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null);
        String strG2 = h11.f26079a.g();
        String str = strG2 == null ? "" : strG2;
        QA.b bVar2 = QA.b.f27435b;
        Gh gh2 = Gh.UNFOCUSED;
        Nh nh2 = new Nh(null, "contact_email", false, gh2, str, dVarA2, dVarA3, bVar2, null, null, 0, 1797, null);
        h11.f26081c.a(nh2);
        jn0.h0 h0Var = jn0.h0.f84049a;
        Mh mh2 = Mh.NumberOrIdentifier;
        String strF = h11.f26079a.f();
        Nh nh3 = new Nh(mh2, "contact_phone", false, gh2, strF == null ? "" : strF, QA.a.a(aVar, R.string.step_contact_details_label_phone_number, 0, 2, null), QA.a.a(aVar, R.string.step_contact_details_placeholder_phone_number, 0, 2, null), bVar2, null, null, 0, 1796, null);
        h11.f26081c.a(nh3);
        G5 g5E = h11.f26079a.e();
        String str2 = (g5E == null || (strE = g5E.e()) == null) ? "" : strE;
        G5 g5E2 = h11.f26079a.e();
        Y4.c cVar2 = new Y4.c(nh3, str2, (g5E2 == null || (strG = g5E2.g()) == null) ? "" : strG, h11.f26080b.a(EnumC3689ph.L0), QA.a.a(aVar, R.string.shared_icon_country_code_accessibility, 0, 2, null));
        Y4.a aVar2 = new Y4.a(null, null, false, QA.a.a(aVar, R.string.step_contact_details_label_phone_number, 0, 2, null), null, QA.a.a(aVar, R.string.shared_placeholder_search, 0, 2, null), null, null, h11.f26080b.a(EnumC3689ph.M0), null, 727, null);
        h11.f26081c.a(aVar2);
        return new Y4(dVarA, bVar, cVar, nh2, cVar2, aVar2, 0 == true ? 1 : 0, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 c(String str, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, null, null, null, Y4.c.a(y11.s(), Nh.a(y11.s().b(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, 30, null), null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 e(H4 h11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        Y4.c cVarS = y11.s();
        Nh nhA = Nh.a(y11.s().b(), null, null, false, Gh.ERROR, null, null, null, QA.f27433a.b(R.string.shared_validation_required_phone_number_accessibility), h11.t(), null, 0, 1655, null);
        h11.f26081c.b(nhA);
        h11.f26081c.a(nhA, new Th.c());
        jn0.h0 h0Var = jn0.h0.f84049a;
        return Y4.a(y11, null, null, null, null, Y4.c.a(cVarS, nhA, null, null, null, null, 30, null), null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 g(H4 h11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        Nh nhA = Nh.a(y11.q(), null, null, false, Gh.UNFOCUSED, null, null, null, null, null, null, 0, 2039, null);
        h11.f26081c.b(nhA);
        jn0.h0 h0Var = jn0.h0.f84049a;
        return Y4.a(y11, null, null, null, nhA, null, null, null, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 h(H4 h11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        Y4.c cVarS = y11.s();
        Nh nhA = Nh.a(y11.s().b(), null, null, false, Gh.UNFOCUSED, null, null, null, null, null, null, 0, 2039, null);
        h11.f26081c.b(nhA);
        jn0.h0 h0Var = jn0.h0.f84049a;
        return Y4.a(y11, null, null, null, null, Y4.c.a(cVarS, nhA, null, null, null, null, 30, null), null, null, 111, null);
    }

    public final wn0.l C() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ld0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.h(this.f33294a, (Y4) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.cd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.a(z11, (Y4) obj);
            }
        };
    }

    public final wn0.l f(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.dd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.c(value, (Y4) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 a(boolean z11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        boolean z12 = !z11;
        return Y4.a(y11, null, y11.t().a(z12, z11), y11.u().a(z12), null, null, null, null, 121, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 f(H4 h11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        Y4.a aVarA = Y4.a.a(y11.p(), null, null, false, null, null, null, null, Gh.UNFOCUSED, null, null, 895, null);
        h11.f26081c.b(aVarA);
        jn0.h0 h0Var = jn0.h0.f84049a;
        return Y4.a(y11, null, null, null, null, null, aVarA, Y4.b.NUMBER, 31, null);
    }

    private final InterfaceC3903uh t() {
        return (InterfaceC3903uh) this.f26082d.getValue();
    }

    public final wn0.l A() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.jd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.f(this.f32747a, (Y4) obj);
            }
        };
    }

    public final wn0.l B() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.md0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.g(this.f33555a, (Y4) obj);
            }
        };
    }

    public final wn0.l d(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.id0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.b(value, (Y4) obj);
            }
        };
    }

    public final wn0.l j() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.kd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.a((Y4) obj);
            }
        };
    }

    public final wn0.l o() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ad0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.b((Y4) obj);
            }
        };
    }

    public final wn0.l r() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ed0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.c((Y4) obj);
            }
        };
    }

    public final wn0.l s() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.zc0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.d((Y4) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Y4 getInitialState() {
        return (Y4) this.f26083e.getValue();
    }

    public final wn0.l v() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.hd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.a(this.f32284a, (Y4) obj);
            }
        };
    }

    public final wn0.l w() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.qd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.b(this.f34810a, (Y4) obj);
            }
        };
    }

    public final wn0.l x() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.pd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.c(this.f34508a, (Y4) obj);
            }
        };
    }

    public final wn0.l y() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.gd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.d(this.f31997a, (Y4) obj);
            }
        };
    }

    public final wn0.l z() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.yc0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.e(this.f36980a, (Y4) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 d(Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, null, null, null, Y4.c.a(y11.s(), Nh.a(y11.s().b(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, null, 30, null), null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 a(H4 h11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, y11.t().b(h11.f26079a.i()), null, null, null, null, null, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 c(Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, null, null, Nh.a(y11.q(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, 119, null);
    }

    public final wn0.l a(final String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.bd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.a(value, (Y4) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 a(String str, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, null, null, null, null, Y4.a.a(y11.p(), null, null, false, null, str, null, null, null, null, null, 1007, null), null, 95, null);
    }

    public final wn0.l a(final List value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.xc0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.a(value, (Y4) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 a(List list, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, null, null, null, null, Y4.a.a(y11.p(), null, null, false, null, null, null, null, null, null, list, 511, null), null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 c(H4 h11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        Nh nhA = Nh.a(y11.q(), null, null, false, Gh.ERROR, null, null, null, QA.a.a(QA.f27433a, 0, 1, null), h11.t(), null, 0, 1655, null);
        h11.f26081c.b(nhA);
        h11.f26081c.a(nhA, new Th.d());
        jn0.h0 h0Var = jn0.h0.f84049a;
        return Y4.a(y11, null, null, null, nhA, null, null, null, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 d(H4 h11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        Y4.c cVarS = y11.s();
        Nh nhA = Nh.a(y11.s().b(), null, null, false, Gh.ERROR, null, null, null, QA.a.a(QA.f27433a, 0, 1, null), h11.t(), null, 0, 1655, null);
        h11.f26081c.b(nhA);
        h11.f26081c.a(nhA, new Th.d());
        jn0.h0 h0Var = jn0.h0.f84049a;
        return Y4.a(y11, null, null, null, null, Y4.c.a(cVarS, nhA, null, null, null, null, 30, null), null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 a(Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, null, null, null, null, Y4.a.a(y11.p(), null, null, false, null, "", null, null, Gh.UNFOCUSED, null, p013kotlin.collections.v.m(), 367, null), Y4.b.COUNTRY, 31, null);
    }

    public final wn0.l a(final G5 selectedCountry) {
        p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
        return new wn0.l() { // from class: com.fourthline.orca.internal.fd0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return H4.a(this.f31724a, selectedCountry, (Y4) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 a(H4 h11, G5 g11, Y4 y11) {
        String strG;
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        Y4.a aVarP = y11.p();
        Gh gh2 = Gh.UNFOCUSED;
        Y4.a aVarA = Y4.a.a(aVarP, null, null, false, null, null, null, null, gh2, null, p013kotlin.collections.v.m(), 383, null);
        h11.f26081c.b(aVarA);
        Y4.c cVarS = y11.s();
        Nh nhB = y11.s().b();
        String strF = h11.f26079a.f();
        Nh nhA = Nh.a(nhB, null, null, false, gh2, strF == null ? "" : strF, null, null, QA.b.f27435b, null, null, 0, 1639, null);
        G5 g5E = h11.f26079a.e();
        return Y4.a(y11, null, null, null, null, Y4.c.a(cVarS, nhA, g11.e(), (g5E == null || (strG = g5E.g()) == null) ? "" : strG, null, null, 24, null), aVarA, Y4.b.NUMBER, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 b(String str, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, null, null, Nh.a(y11.q(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 b(Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        return Y4.a(y11, null, null, null, null, null, Y4.a.a(y11.p(), null, null, false, null, null, null, null, Gh.FOCUSED, null, null, 895, null), null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4 b(H4 h11, Y4 y11) {
        p013kotlin.jvm.internal.s.k(y11, "<this>");
        Nh nhA = Nh.a(y11.q(), null, null, false, Gh.ERROR, null, null, null, QA.f27433a.b(R.string.shared_validation_required_email_accessibility), h11.t(), null, 0, 1655, null);
        h11.f26081c.b(nhA);
        h11.f26081c.a(nhA, new Th.c());
        jn0.h0 h0Var = jn0.h0.f84049a;
        return Y4.a(y11, null, null, null, nhA, null, null, null, 119, null);
    }
}
