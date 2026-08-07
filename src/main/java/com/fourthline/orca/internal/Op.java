package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Op implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qp f27208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3655oq f27209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27211d;

    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(160499893, i11, -1, "com.fourthline.orca.kyc.internal.flow.person.PersonFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PersonFlow.kt:41)");
            }
            InterfaceC3655oq interfaceC3655oq = Op.this.f27209b;
            if (interfaceC3655oq == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3655oq = null;
            }
            Ng.a(interfaceC3655oq, lVar, 0);
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

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(412257246, i11, -1, "com.fourthline.orca.kyc.internal.flow.person.PersonFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PersonFlow.kt:45)");
            }
            InterfaceC3655oq interfaceC3655oq = Op.this.f27209b;
            if (interfaceC3655oq == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3655oq = null;
            }
            Ng.a(interfaceC3655oq, it, lVar, i11 & 112);
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

    public Op(Qp flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f27208a = flowConfig;
        this.f27210c = "NavigationDestination.PersonFlow::class.java";
        this.f27211d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ok0
            @Override // wn0.a
            public final Object invoke() {
                return Op.b(this.f34304a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f27211d.getValue();
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f27210c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rp b(Op op2) {
        InterfaceC3655oq interfaceC3655oq = op2.f27209b;
        if (interfaceC3655oq == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3655oq = null;
        }
        return interfaceC3655oq.c();
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Qp c() {
        return this.f27208a;
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.pk0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Op.a(this.f34600a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f27209b = ((Lf) orcaSubcomponent).l().a(new Sp(c())).build();
        } else {
            AbstractC3989wg.a("Person is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Op op2, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        ka.k.c(uVar, new InterfaceC3949vk.t.b(null, 1, null).a(), null, null, null, null, null, null, null, z2.c.c(160499893, true, op2.new a()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        ka.k.c(uVar, InterfaceC3949vk.t.c.f36205b.a(), null, null, null, null, null, null, null, z2.c.c(412257246, true, op2.new b()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }
}
