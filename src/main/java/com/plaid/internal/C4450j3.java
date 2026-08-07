package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4450j3 implements qj0.e<L4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<WorkflowDatabase> f47771a;

    public C4450j3(C4396d3 c4396d3, Provider<WorkflowDatabase> provider) {
        this.f47771a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f47771a.get();
        p013kotlin.jvm.internal.s.k(database, "database");
        return (L4) qj0.h.d(new C4518r0(database));
    }
}
