package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class R0 implements Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KD f27582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f27583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kh f27584c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Fh.values().length];
            try {
                iArr[Fh.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Fh.INVALID_FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public R0(KD stringExtractor, InterfaceC3732qh imageServiceLocator, Kh analytics) {
        p013kotlin.jvm.internal.s.k(stringExtractor, "stringExtractor");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f27582a = stringExtractor;
        this.f27583b = imageServiceLocator;
        this.f27584c = analytics;
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(final String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        return new wn0.l() { // from class: com.fourthline.orca.internal.en0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return R0.a(input, (L0) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l b(final InterfaceC3447jx item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        return new wn0.l() { // from class: com.fourthline.orca.internal.cn0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return R0.a(this.f30955a, item, (L0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 a(String str, L0 l11) {
        p013kotlin.jvm.internal.s.k(l11, "<this>");
        return L0.a(l11, null, null, null, null, K0.a(l11.p(), null, null, false, null, null, str, null, null, null, null, null, null, 4063, null), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 b(R0 r11, InterfaceC3447jx interfaceC3447jx, L0 l11) {
        p013kotlin.jvm.internal.s.k(l11, "<this>");
        K0 k0A = K0.a(l11.p(), null, null, false, null, null, r11.f27582a.a(interfaceC3447jx.getName()), Gh.UNFOCUSED, QA.b.f27435b, null, null, p013kotlin.collections.v.m(), null, 2079, null);
        r11.f27584c.b(k0A);
        return L0.a(l11, null, l11.r().b(false), null, null, k0A, 13, null);
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l d(final String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        return new wn0.l() { // from class: com.fourthline.orca.internal.fn0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return R0.b(input, (L0) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(final List suggestions) {
        p013kotlin.jvm.internal.s.k(suggestions, "suggestions");
        return new wn0.l() { // from class: com.fourthline.orca.internal.bn0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return R0.a(suggestions, (L0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 a(List list, L0 l11) {
        p013kotlin.jvm.internal.s.k(l11, "<this>");
        return L0.a(l11, null, null, null, null, K0.a(l11.p(), null, null, false, null, null, null, null, null, null, null, list, null, 3071, null), 15, null);
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(final InterfaceC3447jx interfaceC3447jx, final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.zm0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return R0.a(interfaceC3447jx, this, z11, (L0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 a(InterfaceC3447jx interfaceC3447jx, R0 r11, boolean z11, L0 l11) {
        String strA;
        QA name;
        p013kotlin.jvm.internal.s.k(l11, "<this>");
        K0 k0P = l11.p();
        Gh gh2 = Gh.UNFOCUSED;
        QA.b bVar = QA.b.f27435b;
        if (interfaceC3447jx == null || (name = interfaceC3447jx.getName()) == null || (strA = r11.f27582a.a(name)) == null) {
            strA = "";
        }
        K0 k0A = K0.a(k0P, null, null, false, null, null, strA, gh2, bVar, null, bVar, null, null, 3359, null);
        r11.f27584c.a(k0A);
        return L0.a(l11, null, l11.r().b(z11), null, null, k0A, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 b(String str, L0 l11) {
        p013kotlin.jvm.internal.s.k(l11, "<this>");
        return L0.a(l11, null, l11.r().b(false), null, null, K0.a(l11.p(), null, null, false, null, null, str, Gh.FOCUSED, QA.b.f27435b, null, null, null, null, 3103, null), 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 a(R0 r11, InterfaceC3447jx interfaceC3447jx, L0 l11) {
        p013kotlin.jvm.internal.s.k(l11, "<this>");
        K0 k0A = K0.a(l11.p(), null, null, false, null, null, r11.f27582a.a(interfaceC3447jx.getName()), Gh.UNFOCUSED, QA.b.f27435b, null, null, p013kotlin.collections.v.m(), null, 2591, null);
        r11.f27584c.b(k0A);
        return L0.a(l11, null, l11.r().b(true), null, null, k0A, 13, null);
    }

    private final QA.d b(Fh fh2) {
        int i11 = a.$EnumSwitchMapping$0[fh2.ordinal()];
        if (i11 == 1) {
            return QA.f27433a.b(R.string.shared_validation_required_issuing_country_accessibility);
        }
        if (i11 == 2) {
            return QA.f27433a.a(R.string.shared_validation_invalid_issuing_country_accessibility);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(final InterfaceC3447jx item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        return new wn0.l() { // from class: com.fourthline.orca.internal.dn0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return R0.b(this.f31216a, item, (L0) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Q0
    public wn0.l a(final Fh fh2) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.an0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return R0.a(fh2, this, (L0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 a(Fh fh2, R0 r11, L0 l11) {
        p013kotlin.jvm.internal.s.k(l11, "<this>");
        if (fh2 == null) {
            K0 k0A = K0.a(l11.p(), null, null, false, null, null, null, Gh.UNFOCUSED, QA.b.f27435b, null, null, p013kotlin.collections.v.m(), null, 2623, null);
            r11.f27584c.b(k0A);
            jn0.h0 h0Var = jn0.h0.f84049a;
            return L0.a(l11, null, null, null, null, k0A, 15, null);
        }
        K0 k0A2 = K0.a(l11.p(), null, null, false, null, null, null, Gh.ERROR, r11.b(fh2), r11.f27583b.a(EnumC3689ph.C0), null, p013kotlin.collections.v.m(), null, 2623, null);
        r11.f27584c.b(k0A2);
        return L0.a(l11, null, l11.r().b(false), null, null, k0A2, 13, null);
    }
}
