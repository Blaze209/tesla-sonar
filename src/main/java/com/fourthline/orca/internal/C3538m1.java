package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.Iterator;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3538m1 implements Eh, Xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3452k1 f33476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3155d2 f33477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kh f33478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3732qh f33479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uj f33480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f33481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3368i1 f33482g;

    /* JADX WARN: Multi-variable type inference failed */
    public C3538m1(InterfaceC3452k1 repository, InterfaceC3155d2 validator, Kh analytics, InterfaceC3732qh imageServiceLocator, Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(validator, "validator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        this.f33476a = repository;
        this.f33477b = validator;
        this.f33478c = analytics;
        this.f33479d = imageServiceLocator;
        this.f33480e = lottieServiceLocator;
        this.f33481f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.a71
            @Override // wn0.a
            public final Object invoke() {
                return C3538m1.a(this.f30315a);
            }
        });
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_bav_capture_header_sepa, 0, 2, null);
        Nh nh2 = new Nh(Mh.NumberOrIdentifier, "bav_sepa_iban", false, Gh.UNFOCUSED, "", QA.a.a(aVar, R.string.step_bav_capture_label_iban, 0, 2, null), j(), QA.b.f27435b, null, null, 0, 1796, null);
        analytics.a(nh2);
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f33482g = new C3368i1(dVarA, nh2, aVar.a(R.string.step_bav_capture_hint_sepa, "0." + repository.c(), "0." + repository.c()), new C3368i1.a(QA.a.a(aVar, R.string.shared_footer_sepa, 0, 2, null), QA.a.a(aVar, R.string.shared_button_read_more, 0, 2, null)), new InterfaceC3777rk.b(new E3(QA.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), false, false, 4, 0 == true ? 1 : 0)), new InterfaceC3777rk.a.C0608a(null, 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3903uh a(C3538m1 c3538m1) {
        return c3538m1.f33479d.a(EnumC3689ph.C0);
    }

    private final QA j() {
        Object next;
        Iterator it = this.f33476a.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((BavIbanCountryConfig) next).getCountryCode(), this.f33476a.a()));
        BavIbanCountryConfig bavIbanCountryConfig = (BavIbanCountryConfig) next;
        if (bavIbanCountryConfig == null) {
            return QA.a.a(QA.f27433a, R.string.shared_placeholder_add, 0, 2, null);
        }
        String strSubstring = bavIbanCountryConfig.getCountryCode().substring(0, 2);
        p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
        return new QA.e(p013kotlin.collections.v.y0(p013kotlin.text.t.L1(strSubstring + p013kotlin.text.t.R(WebrtcBuildVersion.maint_version, bavIbanCountryConfig.getLength() - 2), 4), " ", null, null, 0, null, null, 62, null));
    }

    private final InterfaceC3903uh o() {
        return (InterfaceC3903uh) this.f33481f.getValue();
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C3368i1 getInitialState() {
        return this.f33482g;
    }

    public final wn0.l s() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.v61
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3538m1.a(this.f36023a, (C3368i1) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3368i1 b(boolean z11, C3368i1 c3368i1) {
        p013kotlin.jvm.internal.s.k(c3368i1, "<this>");
        boolean z12 = !z11;
        return C3368i1.a(c3368i1, null, null, null, null, c3368i1.s().a(z12, z11), c3368i1.t().a(z12), 15, null);
    }

    public final wn0.l a(final String value, final InterfaceC3112c2 validationResult) {
        p013kotlin.jvm.internal.s.k(value, "value");
        p013kotlin.jvm.internal.s.k(validationResult, "validationResult");
        return new wn0.l() { // from class: com.fourthline.orca.internal.z61
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3538m1.a(value, validationResult, (C3368i1) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.y61
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3538m1.b(z11, (C3368i1) obj);
            }
        };
    }

    public final wn0.l e(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.w61
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3538m1.a(z11, (C3368i1) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3368i1 a(String str, InterfaceC3112c2 interfaceC3112c2, C3368i1 c3368i1) {
        p013kotlin.jvm.internal.s.k(c3368i1, "<this>");
        Nh nhQ = c3368i1.q();
        QA qaB = p013kotlin.jvm.internal.s.f(interfaceC3112c2, InterfaceC3112c2.g.f30774a) ? QA.b.f27435b : interfaceC3112c2.b();
        BavIbanCountryConfig bavIbanCountryConfigA = interfaceC3112c2.a();
        return C3368i1.a(c3368i1, null, Nh.a(nhQ, null, null, false, null, str, null, null, qaB, null, null, bavIbanCountryConfigA != null ? bavIbanCountryConfigA.getLength() : Integer.MAX_VALUE, 111, null), null, null, c3368i1.s().b(interfaceC3112c2 instanceof InterfaceC3112c2.h), null, 45, null);
    }

    public final wn0.l a(final InterfaceC3409j1 state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return new wn0.l() { // from class: com.fourthline.orca.internal.x61
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3538m1.a(state, this, (C3368i1) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    public static final C3368i1 a(InterfaceC3409j1 interfaceC3409j1, C3538m1 c3538m1, C3368i1 c3368i1) {
        InterfaceC3067b interfaceC3067b;
        InterfaceC3067b aVar;
        boolean zA;
        p013kotlin.jvm.internal.s.k(c3368i1, "<this>");
        Nh nhQ = c3368i1.q();
        if (interfaceC3409j1 instanceof InterfaceC3409j1.c) {
            aVar = new InterfaceC3067b.C0542b(c3538m1.f33480e.a(Tj.LoadingSpinner));
        } else {
            if (!(interfaceC3409j1 instanceof InterfaceC3409j1.a)) {
                interfaceC3067b = null;
            } else if (((InterfaceC3409j1.a) interfaceC3409j1).a()) {
                aVar = new InterfaceC3067b.a(c3538m1.f33479d.a(EnumC3689ph.H0));
            } else {
                aVar = new InterfaceC3067b.a(c3538m1.f33479d.a(EnumC3689ph.C0));
            }
            Nh nhA = Nh.a(nhQ, null, null, false, null, null, null, null, null, null, interfaceC3067b, 0, 1535, null);
            InterfaceC3777rk.b bVarS = c3368i1.s();
            if ((interfaceC3409j1 instanceof InterfaceC3409j1.a ? (InterfaceC3409j1.a) interfaceC3409j1 : null) != null) {
                zA = ((InterfaceC3409j1.a) interfaceC3409j1).a();
            } else {
                zA = false;
            }
            return C3368i1.a(c3368i1, null, nhA, null, null, bVarS.b(zA), null, 45, null);
        }
        interfaceC3067b = aVar;
        Nh nhA2 = Nh.a(nhQ, null, null, false, null, null, null, null, null, null, interfaceC3067b, 0, 1535, null);
        InterfaceC3777rk.b bVarS2 = c3368i1.s();
        if ((interfaceC3409j1 instanceof InterfaceC3409j1.a ? (InterfaceC3409j1.a) interfaceC3409j1 : null) != null) {
            zA = ((InterfaceC3409j1.a) interfaceC3409j1).a();
        } else {
            zA = false;
        }
        return C3368i1.a(c3368i1, null, nhA2, null, null, bVarS2.b(zA), null, 45, null);
    }

    public static /* synthetic */ wn0.l a(C3538m1 c3538m1, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c3538m1.e(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3368i1 a(boolean z11, C3368i1 c3368i1) {
        QA qaD;
        p013kotlin.jvm.internal.s.k(c3368i1, "<this>");
        Nh nhQ = c3368i1.q();
        String strC = z11 ? "" : c3368i1.q().c();
        Gh gh2 = Gh.FOCUSED;
        if (c3368i1.q().c().length() == 0) {
            qaD = QA.b.f27435b;
        } else {
            qaD = c3368i1.q().d();
        }
        return C3368i1.a(c3368i1, null, Nh.a(nhQ, null, null, false, gh2, strC, null, null, qaD, null, null, 0, 1127, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3368i1 a(C3538m1 c3538m1, C3368i1 c3368i1) {
        p013kotlin.jvm.internal.s.k(c3368i1, "<this>");
        InterfaceC3112c2 interfaceC3112c2A = c3538m1.f33477b.a(c3368i1.q().c());
        boolean z11 = interfaceC3112c2A instanceof InterfaceC3112c2.h;
        QA qaB = interfaceC3112c2A.b();
        Nh nhA = Nh.a(c3368i1.q(), null, null, false, z11 ? Gh.UNFOCUSED : Gh.ERROR, null, null, null, qaB, z11 ? null : c3538m1.o(), null, 0, 1143, null);
        c3538m1.f33478c.b(nhA);
        if (interfaceC3112c2A instanceof InterfaceC3112c2.g) {
            c3538m1.f33478c.a(nhA, new Th.c());
        } else if (interfaceC3112c2A instanceof InterfaceC3112c2.d) {
            c3538m1.f33478c.a(nhA, new Th.d());
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        return C3368i1.a(c3368i1, null, nhA, null, null, c3368i1.s().b(interfaceC3112c2A instanceof InterfaceC3112c2.h), null, 45, null);
    }
}
