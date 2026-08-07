package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;

/* JADX INFO: renamed from: com.plaid.internal.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4541t5 implements qj0.e<WorkflowDatabase> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f48144a;

    public C4541t5(C4515q5 c4515q5, qj0.e eVar) {
        this.f48144a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f48144a.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        return (WorkflowDatabase) qj0.h.d((WorkflowDatabase) androidx.room.v.a(application, WorkflowDatabase.class, "plaid_workflow_database").e().d());
    }
}
