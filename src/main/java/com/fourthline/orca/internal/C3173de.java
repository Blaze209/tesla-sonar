package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3173de implements Cs.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31150f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31151g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f31152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f31153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2899Lc f31154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f31155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f31156e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.de$a */
    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.de$a$a, reason: collision with other inner class name */
        public static final class C0551a implements Ds {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0551a f31157a = new C0551a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f31158b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f31159c = "enter_can";

            private C0551a() {
            }

            @Override // com.fourthline.orca.internal.Ds
            public String a() {
                return f31158b;
            }

            @Override // com.fourthline.orca.internal.Ds
            public String getName() {
                return f31159c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3173de(ND viewNavigator, InterfaceC3732qh imageServiceLocator, C2899Lc bundle) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f31152a = viewNavigator;
        this.f31153b = imageServiceLocator;
        this.f31154c = bundle;
        this.f31155d = a.C0551a.f31157a;
        this.f31156e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.w01
            @Override // wn0.a
            public final Object invoke() {
                return C3173de.a(this.f36317a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3173de c3173de) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3173de.f31153b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_eid_second_incorrect_pin_germany, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_enter_can, 0, 2, null)), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f31152a.a(InterfaceC3557me.b.f33558a);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        this.f31152a.a(InterfaceC3557me.c.f33559a);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f31156e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f31155d;
    }
}
