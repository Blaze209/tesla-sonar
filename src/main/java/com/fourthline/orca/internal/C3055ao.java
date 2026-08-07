package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3055ao implements Tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3098bo f30456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Sf f30457b;

    public C3055ao(C3098bo flowManager) {
        p013kotlin.jvm.internal.s.k(flowManager, "flowManager");
        this.f30456a = flowManager;
        Do doA = flowManager.a();
        this.f30457b = doA != null ? doA.b() : null;
    }

    @Override // com.fourthline.orca.internal.Tf
    public Sf a() {
        return this.f30457b;
    }

    @Override // com.fourthline.orca.internal.Tf
    public Sf a(Rf flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        Do doA = this.f30456a.a(flowConfig);
        if (doA != null) {
            this.f30456a.a(doA);
        } else {
            doA = null;
        }
        Sf sfB = doA != null ? doA.b() : null;
        this.f30457b = sfB;
        return sfB;
    }

    @Override // com.fourthline.orca.internal.Tf
    public Sf a(C3906uk c3906uk) {
        Sf sfB;
        C3743qs c3743qsB;
        Do doA = this.f30456a.a((c3906uk == null || (c3743qsB = c3906uk.b()) == null) ? null : c3743qsB.a());
        if (doA == null || (sfB = doA.b()) == null) {
            return null;
        }
        this.f30457b = sfB;
        return sfB;
    }
}
