package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M f26401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3068b0 f26402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f26404d;

    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(1693631316, i11, -1, "com.fourthline.orca.kyc.internal.flow.address.AddressFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (AddressFlow.kt:40)");
            }
            InterfaceC3068b0 interfaceC3068b0 = J.this.f26402b;
            if (interfaceC3068b0 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3068b0 = null;
            }
            Hg.a(interfaceC3068b0, it, lVar, i11 & 112);
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

    public J(M flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f26401a = flowConfig;
        this.f26403c = "NavigationDestination.AddressFlow::class.java";
        this.f26404d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.yf0
            @Override // wn0.a
            public final Object invoke() {
                return J.b(this.f36998a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.xf0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return J.a(this.f36718a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f26403c;
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public M c() {
        return this.f26401a;
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f26404d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N b(J j11) {
        InterfaceC3068b0 interfaceC3068b0 = j11.f26402b;
        if (interfaceC3068b0 == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3068b0 = null;
        }
        return interfaceC3068b0.a();
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f26402b = ((Lf) orcaSubcomponent).h().a(new O(c())).build();
        } else {
            AbstractC3989wg.a("Address is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(J j11, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        ka.k.c(uVar, InterfaceC3949vk.InterfaceC3950a.b.f36128b.a(), null, null, null, null, null, null, null, z2.c.c(1693631316, true, j11.new a()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }
}
