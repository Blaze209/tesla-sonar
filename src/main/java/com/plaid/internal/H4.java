package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* JADX INFO: loaded from: classes6.dex */
public final class H4 implements C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowDatabase_Impl f46333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D4 f46334b;

    public H4(@NonNull WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f46333a = workflowDatabase_Impl;
        this.f46334b = new D4(workflowDatabase_Impl);
        new E4(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.C4
    public final Object a(String str, String str2, byte[] bArr, S2 s11) {
        return androidx.room.d.b(this.f46333a, true, new F4(this, str, str2, bArr), s11);
    }

    @Override // com.plaid.internal.C4
    public final Object a(String str, String str2, C4510q0 c4510q0) {
        androidx.room.l0 l0VarT = androidx.room.l0.t("SELECT * FROM workflow_pane WHERE workflow_id=? AND id=?", 2);
        l0VarT.R0(1, str);
        l0VarT.R0(2, str2);
        return androidx.room.d.a(this.f46333a, false, wa.b.a(), new G4(this, l0VarT), c4510q0);
    }
}
