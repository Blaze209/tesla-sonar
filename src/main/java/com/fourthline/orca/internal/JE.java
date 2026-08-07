package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class JE implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3680pE f26452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CE f26453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f26455d;

    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(336828084, i11, -1, "com.fourthline.orca.workflow.internal.WorkflowLoadingFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (WorkflowLoadingFlow.kt:36)");
            }
            CE ce2 = JE.this.f26453b;
            if (ce2 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                ce2 = null;
            }
            Xg.a(ce2, lVar, 0);
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

    public JE(C3680pE flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f26452a = flowConfig;
        this.f26454c = "NavigationDestination.Workflow::class.java";
        this.f26455d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ag0
            @Override // wn0.a
            public final Object invoke() {
                return JE.b(this.f30410a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f26455d.getValue();
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f26454c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3723qE b(JE je2) {
        CE ce2 = je2.f26453b;
        if (ce2 == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            ce2 = null;
        }
        return ce2.c();
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3680pE c() {
        return this.f26452a;
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.zf0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return JE.a(this.f37264a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f26453b = ((Lf) orcaSubcomponent).w().a(new C3808sE(c())).build();
            return;
        }
        throw new IllegalStateException("FL Developer Error. Workflow is not a supported Flow for subtype of OrcaSubcomponent.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(JE je2, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        ka.k.c(uVar, InterfaceC3949vk.A.b.f36126b.a(), null, null, null, null, null, null, null, z2.c.c(336828084, true, je2.new a()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }
}
