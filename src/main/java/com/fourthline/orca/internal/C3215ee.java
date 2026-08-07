package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3215ee implements Cs.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31383f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31384g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f31385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f31386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2899Lc f31387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f31388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f31389e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ee$a */
    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ee$a$a, reason: collision with other inner class name */
        public static final class C0552a implements Ds {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0552a f31390a = new C0552a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f31391b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f31392c = "governikus_result_error";

            private C0552a() {
            }

            @Override // com.fourthline.orca.internal.Ds
            public String a() {
                return f31391b;
            }

            @Override // com.fourthline.orca.internal.Ds
            public String getName() {
                return f31392c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3215ee(ND viewNavigator, InterfaceC3732qh imageServiceLocator, C2899Lc bundle) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f31385a = viewNavigator;
        this.f31386b = imageServiceLocator;
        this.f31387c = bundle;
        this.f31388d = a.C0552a.f31390a;
        this.f31389e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.c11
            @Override // wn0.a
            public final Object invoke() {
                return C3215ee.a(this.f30761a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3215ee c3215ee) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3215ee.f31386b.a(EnumC3689ph.D0), QA.a.a(aVar, R.string.shared_dialog_error_eid_unrecoverable_germany, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f31387c.b(false);
        this.f31385a.a(InterfaceC3557me.c.f33559a);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f31389e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f31388d;
    }
}
