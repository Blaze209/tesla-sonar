package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3301ge implements Cs.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31999f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f32000g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f32001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f32002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2899Lc f32003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f32004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f32005e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ge$a */
    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ge$a$a, reason: collision with other inner class name */
        public static final class C0563a implements Ds {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0563a f32006a = new C0563a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f32007b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32008c = "incorrect_pin";

            private C0563a() {
            }

            @Override // com.fourthline.orca.internal.Ds
            public String a() {
                return f32007b;
            }

            @Override // com.fourthline.orca.internal.Ds
            public String getName() {
                return f32008c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3301ge(ND viewNavigator, InterfaceC3732qh imageServiceLocator, C2899Lc bundle) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f32001a = viewNavigator;
        this.f32002b = imageServiceLocator;
        this.f32003c = bundle;
        this.f32004d = a.C0563a.f32006a;
        this.f32005e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.c21
            @Override // wn0.a
            public final Object invoke() {
                return C3301ge.a(this.f30778a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3301ge c3301ge) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3301ge.f32002b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_eid_first_incorrect_pin_germany, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f32001a.a(InterfaceC3557me.a.f33557a);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        this.f32001a.a(InterfaceC3557me.c.f33559a);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f32005e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f32004d;
    }
}
