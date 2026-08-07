package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2940Td implements Cs.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27888d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27889e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f27890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ds f27891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f27892c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Td$a */
    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Td$a$a, reason: collision with other inner class name */
        public static final class C0519a implements Ds {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0519a f27893a = new C0519a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f27894b = "eid_pin";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f27895c = "pin_reuse_warning";

            private C0519a() {
            }

            @Override // com.fourthline.orca.internal.Ds
            public String a() {
                return f27894b;
            }

            @Override // com.fourthline.orca.internal.Ds
            public String getName() {
                return f27895c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2940Td(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27890a = imageServiceLocator;
        this.f27891b = a.C0519a.f27893a;
        this.f27892c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.pp0
            @Override // wn0.a
            public final Object invoke() {
                return C2940Td.a(this.f34622a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C2940Td c2940Td) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c2940Td.f27890a.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_eid_pin_already_used_germany, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_use_other_pin, 0, 2, null)), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        Cs.b.a.a(this);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f27892c.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f27891b;
    }
}
