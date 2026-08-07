package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* JADX INFO: loaded from: classes6.dex */
public final class K3 extends androidx.room.n0 {
    public K3(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.n0
    @NonNull
    public final String createQuery() {
        return "REPLACE INTO workflow_local_key_values (pane_id, `key`, byte_array) VALUES (?, ?, ?)";
    }
}
