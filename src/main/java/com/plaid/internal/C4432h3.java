package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4432h3 implements qj0.e<T3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<WorkflowDatabase> f47708a;

    public C4432h3(C4396d3 c4396d3, Provider<WorkflowDatabase> provider) {
        this.f47708a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f47708a.get();
        p013kotlin.jvm.internal.s.k(database, "database");
        return (T3) qj0.h.d(new S3(database));
    }
}
