package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3088be implements Cs.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f30624g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30625h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f30626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f30627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2899Lc f30628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f30629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Ds f30630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f30631f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.be$a */
    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.be$a$a, reason: collision with other inner class name */
        public static final class C0543a implements Ds {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0543a f30632a = new C0543a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f30633b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f30634c = "card_blocked_puk";

            private C0543a() {
            }

            @Override // com.fourthline.orca.internal.Ds
            public String a() {
                return f30633b;
            }

            @Override // com.fourthline.orca.internal.Ds
            public String getName() {
                return f30634c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3088be(ND viewNavigator, InterfaceC3732qh imageServiceLocator, C2899Lc bundle, Context context) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f30626a = viewNavigator;
        this.f30627b = imageServiceLocator;
        this.f30628c = bundle;
        this.f30629d = context;
        this.f30630e = a.C0543a.f30632a;
        this.f30631f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.py0
            @Override // wn0.a
            public final Object invoke() {
                return C3088be.a(this.f34666a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3088be c3088be) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3088be.f30627b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_eid_third_incorrect_pin_germany, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_go_to_ausweisapp, 0, 2, null)), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        AbstractC3225eo.a(this.f30629d);
        this.f30626a.a(InterfaceC3557me.c.f33559a);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        this.f30626a.a(InterfaceC3557me.c.f33559a);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f30631f.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f30630e;
    }
}
