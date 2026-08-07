package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* JADX INFO: loaded from: classes6.dex */
public final class V7 extends androidx.room.h<c8> {
    public V7(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.h
    public final void bind(@NonNull za.g gVar, @NonNull c8 c8Var) {
        c8 c8Var2 = c8Var;
        gVar.R0(1, c8Var2.f46911a);
        gVar.R0(2, c8Var2.f46912b);
    }

    @Override // androidx.room.h, androidx.room.n0
    @NonNull
    public final String createQuery() {
        return "DELETE FROM `workflow_analytics` WHERE `workflow_id` = ? AND `id` = ?";
    }
}
