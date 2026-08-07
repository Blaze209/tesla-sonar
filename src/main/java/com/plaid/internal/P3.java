package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class P3 implements I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowDatabase_Impl f46582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J3 f46583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L3 f46584c;

    public P3(@NonNull WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f46582a = workflowDatabase_Impl;
        this.f46583b = new J3(workflowDatabase_Impl);
        new K3(workflowDatabase_Impl);
        this.f46584c = new L3(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, String str2, String str3, R3 r11) {
        return androidx.room.d.b(this.f46582a, true, new M3(this, str, str2, str3), r11);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, ContinuationImpl continuationImpl) {
        return androidx.room.d.b(this.f46582a, true, new N3(this, str), continuationImpl);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        androidx.room.l0 l0VarT = androidx.room.l0.t("SELECT string FROM workflow_local_key_values WHERE pane_id=? AND `key`=?", 2);
        l0VarT.R0(1, str);
        l0VarT.R0(2, str2);
        return androidx.room.d.a(this.f46582a, false, wa.b.a(), new O3(this, l0VarT), continuationImpl);
    }
}
