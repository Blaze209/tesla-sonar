package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4423g3 implements qj0.e<A3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<WorkflowDatabase> f47679a;

    public C4423g3(C4396d3 c4396d3, Provider<WorkflowDatabase> provider) {
        this.f47679a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f47679a.get();
        p013kotlin.jvm.internal.s.k(database, "database");
        return (A3) qj0.h.d(new C4593z3(database));
    }
}
