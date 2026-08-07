package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3476kj implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3605nj f33004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bj f33005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f33007d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kj$a */
    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(-584553387, i11, -1, "com.fourthline.orca.kyc.internal.flow.location.LocationFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (LocationFlow.kt:40)");
            }
            Bj bj2 = C3476kj.this.f33005b;
            if (bj2 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                bj2 = null;
            }
            Pg.a(bj2, lVar, 0);
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

    public C3476kj(C3605nj flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f33004a = flowConfig;
        this.f33006c = "NavigationDestination.LocationFlow::class.java";
        this.f33007d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.x51
            @Override // wn0.a
            public final Object invoke() {
                return C3476kj.b(this.f36672a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.y51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3476kj.a(this.f36897a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f33006c;
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3605nj c() {
        return this.f33004a;
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f33007d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3648oj b(C3476kj c3476kj) {
        Bj bj2 = c3476kj.f33005b;
        if (bj2 == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            bj2 = null;
        }
        return bj2.c();
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f33005b = ((Lf) orcaSubcomponent).g().a(new C3691pj(c())).build();
        } else {
            AbstractC3989wg.a("Location is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3476kj c3476kj, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        ka.k.c(uVar, InterfaceC3949vk.o.b.f36185b.a(), null, null, null, null, null, null, null, z2.c.c(-584553387, true, c3476kj.new a()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }
}
