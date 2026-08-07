package com.fourthline.orca.internal;

import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Rl implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tl f27628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3694pm f27629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27631d;

    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b screenComposable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(screenComposable, "$this$screenComposable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(806896489, i11, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.NfcCanFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcCanFlow.kt:43)");
            }
            InterfaceC3694pm interfaceC3694pm = Rl.this.f27629b;
            if (interfaceC3694pm == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3694pm = null;
            }
            Qg.a(interfaceC3694pm, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((p015o1.b) obj, (p011ja.k) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    static final class b implements wn0.r {
        b() {
        }

        public final void a(p015o1.b screenComposable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(screenComposable, "$this$screenComposable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(961052320, i11, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.NfcCanFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcCanFlow.kt:46)");
            }
            InterfaceC3694pm interfaceC3694pm = Rl.this.f27629b;
            if (interfaceC3694pm == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3694pm = null;
            }
            Qg.b(interfaceC3694pm, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((p015o1.b) obj, (p011ja.k) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    static final class c implements wn0.r {
        c() {
        }

        public final void a(p015o1.b screenComposable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(screenComposable, "$this$screenComposable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-572895, i11, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.NfcCanFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcCanFlow.kt:49)");
            }
            InterfaceC3694pm interfaceC3694pm = Rl.this.f27629b;
            if (interfaceC3694pm == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3694pm = null;
            }
            Qg.c(interfaceC3694pm, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((p015o1.b) obj, (p011ja.k) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    public Rl(Tl flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f27628a = flowConfig;
        this.f27630c = "NavigationDestination.NfcCanFlow::class.java";
        this.f27631d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.pn0
            @Override // wn0.a
            public final Object invoke() {
                return Rl.b(this.f34614a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f27631d.getValue();
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f27630c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ul b(Rl rl2) {
        InterfaceC3694pm interfaceC3694pm = rl2.f27629b;
        if (interfaceC3694pm == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3694pm = null;
        }
        return interfaceC3694pm.e();
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tl c() {
        return this.f27628a;
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.on0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Rl.a(this.f34333a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f27629b = ((Lf) orcaSubcomponent).s().a(new Zl(c())).build();
        } else {
            AbstractC3989wg.a("NfcCan is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Rl rl2, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        AbstractC3993wk.a(uVar, InterfaceC3949vk.r.b.f36191b.a(), null, null, null, null, null, null, z2.c.c(806896489, true, rl2.new a()), 126, null);
        AbstractC3993wk.a(uVar, new InterfaceC3949vk.r.c(null, 1, null).a(), null, null, null, null, null, null, z2.c.c(961052320, true, rl2.new b()), 126, null);
        AbstractC3993wk.a(uVar, new InterfaceC3949vk.r.d(null, 1, null).a(), null, null, null, null, null, null, z2.c.c(-572895, true, rl2.new c()), 126, null);
        return jn0.h0.f84049a;
    }
}
