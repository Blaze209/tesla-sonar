package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3130ce implements Cs.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f30866f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f30867g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f30868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f30869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2899Lc f30870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f30871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f30872e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ce$a */
    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ce$a$a, reason: collision with other inner class name */
        public static final class C0548a implements Ds {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0548a f30873a = new C0548a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f30874b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f30875c = "card_connection_lost";

            private C0548a() {
            }

            @Override // com.fourthline.orca.internal.Ds
            public String a() {
                return f30874b;
            }

            @Override // com.fourthline.orca.internal.Ds
            public String getName() {
                return f30875c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3130ce(ND viewNavigator, InterfaceC3732qh imageServiceLocator, C2899Lc bundle) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f30868a = viewNavigator;
        this.f30869b = imageServiceLocator;
        this.f30870c = bundle;
        this.f30871d = a.C0548a.f30873a;
        this.f30872e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.cz0
            @Override // wn0.a
            public final Object invoke() {
                return C3130ce.a(this.f31035a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3130ce c3130ce) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3130ce.f30869b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_nfc_connection_lost_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        Cs.b.a.a(this);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        this.f30868a.a(InterfaceC3557me.c.f33559a);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f30872e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f30871d;
    }
}
