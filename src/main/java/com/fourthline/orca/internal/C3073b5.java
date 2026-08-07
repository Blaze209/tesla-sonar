package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3073b5 implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3200e5 f30553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3756r5 f30554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f30556d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b5$a */
    static final class a implements wn0.r {
        a() {
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(767532983, i11, -1, "com.fourthline.orca.kyc.internal.flow.contacts.ContactsFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (ContactsFlow.kt:40)");
            }
            InterfaceC3756r5 interfaceC3756r5 = C3073b5.this.f30554b;
            if (interfaceC3756r5 == null) {
                p013kotlin.jvm.internal.s.B("subComponent");
                interfaceC3756r5 = null;
            }
            Jg.a(interfaceC3756r5, it, lVar, i11 & 112);
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

    public C3073b5(C3200e5 flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f30553a = flowConfig;
        this.f30555c = "NavigationDestination.ContactsFlow::class.java";
        this.f30556d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.oy0
            @Override // wn0.a
            public final Object invoke() {
                return C3073b5.b(this.f34396a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Do
    public wn0.l d() {
        return new wn0.l() { // from class: com.fourthline.orca.internal.ny0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3073b5.a(this.f34022a, (p011ja.u) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Do
    public String e() {
        return this.f30555c;
    }

    @Override // com.fourthline.orca.internal.Do
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3200e5 c() {
        return this.f30553a;
    }

    @Override // com.fourthline.orca.internal.Do
    public Sf b() {
        return (Sf) this.f30556d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3243f5 b(C3073b5 c3073b5) {
        InterfaceC3756r5 interfaceC3756r5 = c3073b5.f30554b;
        if (interfaceC3756r5 == null) {
            p013kotlin.jvm.internal.s.B("subComponent");
            interfaceC3756r5 = null;
        }
        return interfaceC3756r5.b();
    }

    @Override // com.fourthline.orca.internal.Do
    public void a(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof Lf) {
            this.f30554b = ((Lf) orcaSubcomponent).D().a(new C3286g5(c())).build();
        } else {
            AbstractC3989wg.a("Contacts is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3073b5 c3073b5, p011ja.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        ka.k.c(uVar, InterfaceC3949vk.f.b.f36144b.a(), null, null, null, null, null, null, null, z2.c.c(767532983, true, c3073b5.new a()), EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }
}
