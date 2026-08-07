package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3591nB implements Eh, Xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Kh f33870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3292gB f33871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f33872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f33873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3249fB f33874e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nB$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3420jC.values().length];
            try {
                iArr[EnumC3420jC.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3420jC.REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3420jC.INVALID_LENGTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3420jC.INVALID_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3591nB(Kh analytics, AbstractC3292gB countryResources, InterfaceC3732qh imageServiceLocator, boolean z11, String str, InterfaceC3463kC tinValidator) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(countryResources, "countryResources");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(tinValidator, "tinValidator");
        this.f33870a = analytics;
        this.f33871b = countryResources;
        this.f33872c = imageServiceLocator;
        this.f33873d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.d81
            @Override // wn0.a
            public final Object invoke() {
                return C3591nB.a(this.f31081a);
            }
        });
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_tin_details_header, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.shared_button_confirm, 0, 2, null);
        boolean z12 = true;
        if (str == null || tinValidator.a(str) != EnumC3420jC.SUCCESS) {
            z12 = false;
        }
        InterfaceC3777rk.b bVar = new InterfaceC3777rk.b(new E3(dVarA2, z12, false, 4, null));
        InterfaceC3777rk.a cVar = z11 ? new InterfaceC3777rk.a.c(null, z12, null) : new InterfaceC3777rk.a.C0608a(null, 1, null);
        Nh nh2 = new Nh(Mh.NumberOrIdentifier, "tax_info_number", false, Gh.UNFOCUSED, str == null ? "" : str, QA.a.a(aVar, countryResources.f(), 0, 2, null), QA.a.a(aVar, R.string.shared_placeholder_add, 0, 2, null), (str == null || str.length() <= 0) ? QA.b.f27435b : QA.a.a(aVar, R.string.shared_validation_captured_from_scan, 0, 2, null), null, null, 0, 1796, null);
        analytics.a(nh2);
        this.f33874e = new C3249fB(dVarA, nh2, QA.a.a(aVar, countryResources.a(), 0, 2, null), bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3903uh a(C3591nB c3591nB) {
        return c3591nB.f33872c.a(EnumC3689ph.C0);
    }

    private final InterfaceC3903uh o() {
        return (InterfaceC3903uh) this.f33873d.getValue();
    }

    public final wn0.l j() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.z71
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3591nB.a((C3249fB) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C3249fB getInitialState() {
        return this.f33874e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3249fB a(boolean z11, C3249fB c3249fB) {
        p013kotlin.jvm.internal.s.k(c3249fB, "<this>");
        boolean z12 = !z11;
        return C3249fB.a(c3249fB, null, null, null, c3249fB.r().a(z12, z11), c3249fB.s().a(z12), 7, null);
    }

    @Override // com.fourthline.orca.internal.Xs
    public wn0.l d(final boolean z11) {
        return new wn0.l() { // from class: com.fourthline.orca.internal.c81
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3591nB.a(z11, (C3249fB) obj);
            }
        };
    }

    public final wn0.l a(final String value, final boolean z11) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return new wn0.l() { // from class: com.fourthline.orca.internal.b81
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3591nB.a(value, z11, (C3249fB) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3249fB a(String str, boolean z11, C3249fB c3249fB) {
        p013kotlin.jvm.internal.s.k(c3249fB, "<this>");
        return C3249fB.a(c3249fB, null, Nh.a(c3249fB.q(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, c3249fB.r().b(z11), null, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3249fB a(C3249fB c3249fB) {
        p013kotlin.jvm.internal.s.k(c3249fB, "<this>");
        return C3249fB.a(c3249fB, null, Nh.a(c3249fB.q(), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null), null, null, null, 29, null);
    }

    public final wn0.l a(final EnumC3420jC validationError) {
        p013kotlin.jvm.internal.s.k(validationError, "validationError");
        return new wn0.l() { // from class: com.fourthline.orca.internal.a81
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3591nB.a(validationError, this, (C3249fB) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3249fB a(EnumC3420jC enumC3420jC, C3591nB c3591nB, C3249fB c3249fB) {
        QA qaB;
        p013kotlin.jvm.internal.s.k(c3249fB, "<this>");
        int[] iArr = a.$EnumSwitchMapping$0;
        int i11 = iArr[enumC3420jC.ordinal()];
        if (i11 == 1) {
            qaB = QA.b.f27435b;
        } else if (i11 == 2) {
            qaB = QA.f27433a.b(c3591nB.f33871b.e());
        } else if (i11 == 3) {
            qaB = QA.f27433a.a(c3591nB.f33871b.d(), c3591nB.f33871b.c());
        } else if (i11 == 4) {
            qaB = QA.f27433a.a(c3591nB.f33871b.b());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        QA qa2 = qaB;
        Nh nhQ = c3249fB.q();
        EnumC3420jC enumC3420jC2 = EnumC3420jC.SUCCESS;
        Nh nhA = Nh.a(nhQ, null, null, false, enumC3420jC == enumC3420jC2 ? Gh.UNFOCUSED : Gh.ERROR, null, null, null, qa2, enumC3420jC == enumC3420jC2 ? null : c3591nB.o(), null, 0, 1655, null);
        c3591nB.f33870a.b(nhA);
        int i12 = iArr[enumC3420jC.ordinal()];
        if (i12 == 2) {
            c3591nB.f33870a.a(nhA, new Th.c());
        } else if (i12 == 4) {
            c3591nB.f33870a.a(nhA, new Th.d());
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        return C3249fB.a(c3249fB, null, nhA, null, c3249fB.r().b(enumC3420jC == enumC3420jC2), null, 21, null);
    }
}
