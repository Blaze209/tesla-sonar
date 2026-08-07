package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3258fe implements Cs.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31727f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31728g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f31729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f31730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2899Lc f31731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f31732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f31733e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fe$a */
    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.fe$a$a, reason: collision with other inner class name */
        public static final class C0560a implements Ds {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0560a f31734a = new C0560a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f31735b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f31736c = "incorrect_can";

            private C0560a() {
            }

            @Override // com.fourthline.orca.internal.Ds
            public String a() {
                return f31735b;
            }

            @Override // com.fourthline.orca.internal.Ds
            public String getName() {
                return f31736c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3258fe(ND viewNavigator, InterfaceC3732qh imageServiceLocator, C2899Lc bundle) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f31729a = viewNavigator;
        this.f31730b = imageServiceLocator;
        this.f31731c = bundle;
        this.f31732d = a.C0560a.f31734a;
        this.f31733e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.s11
            @Override // wn0.a
            public final Object invoke() {
                return C3258fe.a(this.f35190a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3258fe c3258fe) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3258fe.f31730b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_incorrect_can_number, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f31729a.a(InterfaceC3557me.b.f33558a);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        this.f31729a.a(InterfaceC3557me.c.f33559a);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f31733e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f31732d;
    }
}
