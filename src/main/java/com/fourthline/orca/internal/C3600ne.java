package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3600ne implements Cs.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f33913g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f33914h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uj f33915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2874Gc f33916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ND f33917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3643oe f33918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Ds f33919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f33920f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ne$a */
    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ne$a$a, reason: collision with other inner class name */
        public static final class C0588a implements Ds {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0588a f33921a = new C0588a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f33922b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f33923c = "nfc_settings";

            private C0588a() {
            }

            @Override // com.fourthline.orca.internal.Ds
            public String a() {
                return f33922b;
            }

            @Override // com.fourthline.orca.internal.Ds
            public String getName() {
                return f33923c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ne$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC2894Kc.values().length];
            try {
                iArr[EnumC2894Kc.Can.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2894Kc.Pin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2894Kc.RetryPin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3600ne(Uj lottieServiceLocator, C2874Gc effectHandler, ND viewNavigator, InterfaceC3643oe repository) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.f33915a = lottieServiceLocator;
        this.f33916b = effectHandler;
        this.f33917c = viewNavigator;
        this.f33918d = repository;
        this.f33919e = a.C0588a.f33921a;
        this.f33920f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.e81
            @Override // wn0.a
            public final Object invoke() {
                return C3600ne.a(this.f31355a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final An f() {
        return An.d.f24979a;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.a getState() {
        return (InterfaceC4001ws.a) this.f33920f.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f33919e;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f33916b.a(new wn0.a() { // from class: com.fourthline.orca.internal.f81
            @Override // wn0.a
            public final Object invoke() {
                return C3600ne.f();
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        int i11 = b.$EnumSwitchMapping$0[this.f33918d.d().ordinal()];
        if (i11 == 1) {
            this.f33917c.a(InterfaceC3557me.b.f33558a);
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.f33917c.a(InterfaceC3557me.e.f33561a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.a a(C3600ne c3600ne) {
        Yj yjA = c3600ne.f33915a.a(Tj.NfcEnable);
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.a(QA.a.a(aVar, R.string.shared_dialog_permission_nfc_header, 0, 2, null), yjA, QA.a.a(aVar, R.string.shared_dialog_permission_nfc_message, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new InterfaceC3807sD.a(null, 1, null), false, 32, null);
    }
}
