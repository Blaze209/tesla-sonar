package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3576mx implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3192dy f33731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3920uy f33732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f33734d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mx$a */
    static final class a implements wn0.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lazy f33735a;

        a(Lazy lazy) {
            this.f33735a = lazy;
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-608845269, i11, -1, "com.fourthline.orca.selfie.internal.SelfieComponentFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (SelfieComponentFlow.kt:35)");
            }
            Vg.a(C3576mx.b(this.f33735a), lVar, 0);
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

    public C3576mx(C3192dy flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f33731a = flowConfig;
        this.f33733c = "NavigationDestination.Selfie::class.java";
        this.f33734d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.q71
            @Override // wn0.a
            public final Object invoke() {
                return C3576mx.b(this.f34736a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f33734d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Oy b(C3576mx c3576mx) {
        InterfaceC3920uy interfaceC3920uy = c3576mx.f33732b;
        if (interfaceC3920uy == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3920uy = null;
        }
        return interfaceC3920uy.b();
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3192dy c() {
        return this.f33731a;
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.p71
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3576mx.a(this.f34457a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f33733c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3370i3 b(Lazy lazy) {
        return (InterfaceC3370i3) lazy.getValue();
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        InterfaceC3920uy interfaceC3920uy = orcaSubcomponent instanceof InterfaceC3920uy ? (InterfaceC3920uy) orcaSubcomponent : null;
        if (interfaceC3920uy != null) {
            this.f33732b = interfaceC3920uy;
        } else {
            AbstractC3989wg.a("Selfie Component is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(final C3576mx c3576mx, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        ka.k.c(uVar, new InterfaceC3949vk.w.b(null, 1, null).a(), null, null, null, null, null, null, null, z2.c.c(-608845269, true, new a(jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.r71
            @Override // wn0.a
            public final Object invoke() {
                return C3576mx.a(this.f34994a);
            }
        }))), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3370i3 a(C3576mx c3576mx) {
        InterfaceC3920uy interfaceC3920uy = c3576mx.f33732b;
        if (interfaceC3920uy == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3920uy = null;
        }
        return interfaceC3920uy.z().build();
    }
}
