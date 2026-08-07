package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* JADX INFO: loaded from: classes6.dex */
public final class X7 extends androidx.room.n0 {
    public X7(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.n0
    @NonNull
    public final String createQuery() {
        return "DELETE FROM workflow_analytics WHERE workflow_id=?";
    }
}
