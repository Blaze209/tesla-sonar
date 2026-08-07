package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class B7 implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3340ha f25066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3005Wb f25067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f25069d;

    static final class a implements wn0.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lazy f25070a;

        a(Lazy lazy) {
            this.f25070a = lazy;
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(535238264, i11, -1, "com.fourthline.orca.document.internal.DocumentComponentFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentComponentFlow.kt:36)");
            }
            Kg.b(B7.b(this.f25070a), it, lVar, i11 & 112);
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lazy f25071a;

        b(Lazy lazy) {
            this.f25071a = lazy;
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-743719889, i11, -1, "com.fourthline.orca.document.internal.DocumentComponentFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentComponentFlow.kt:40)");
            }
            Kg.a(B7.b(this.f25071a), it, lVar, i11 & 112);
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

    public B7(C3340ha flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f25066a = flowConfig;
        this.f25068c = "NavigationDestination.Document::class.java";
        this.f25069d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.r00
            @Override // wn0.a
            public final Object invoke() {
                return B7.b(this.f34954a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f25068c;
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3340ha c() {
        return this.f25066a;
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f25069d.getValue();
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.t00
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return B7.a(this.f35500a, (p011ja.u) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final My b(B7 b11) {
        InterfaceC3005Wb interfaceC3005Wb = b11.f25067b;
        if (interfaceC3005Wb == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3005Wb = null;
        }
        return interfaceC3005Wb.x();
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        InterfaceC3005Wb interfaceC3005Wb = orcaSubcomponent instanceof InterfaceC3005Wb ? (InterfaceC3005Wb) orcaSubcomponent : null;
        if (interfaceC3005Wb != null) {
            this.f25067b = interfaceC3005Wb;
        } else {
            AbstractC3989wg.a("Document Component is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2917Pa b(Lazy lazy) {
        return (InterfaceC2917Pa) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(final B7 b11, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        Lazy lazyB = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.s00
            @Override // wn0.a
            public final Object invoke() {
                return B7.a(this.f35186a);
            }
        });
        ka.k.c(uVar, new InterfaceC3949vk.h.b(null, 1, null).a(), null, null, null, null, null, null, null, z2.c.c(535238264, true, new a(lazyB)), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        ka.k.c(uVar, new InterfaceC3949vk.i.c(null, 1, null).a(), null, null, null, null, null, null, null, z2.c.c(-743719889, true, new b(lazyB)), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2917Pa a(B7 b11) {
        InterfaceC3005Wb interfaceC3005Wb = b11.f25067b;
        if (interfaceC3005Wb == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3005Wb = null;
        }
        return interfaceC3005Wb.c().build();
    }
}
