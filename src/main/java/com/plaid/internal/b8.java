package com.plaid.internal;

import androidx.annotation.NonNull;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class b8 implements T7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowDatabase_Impl f46893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V7 f46894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W7 f46895c;

    public b8(@NonNull WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f46893a = workflowDatabase_Impl;
        this.f46894b = new V7(workflowDatabase_Impl);
        this.f46895c = new W7(workflowDatabase_Impl);
        new X7(workflowDatabase_Impl);
        new Y7(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.T7
    public final Object a(ArrayList arrayList, C4548u3 c4548u3) {
        return androidx.room.d.b(this.f46893a, true, new Z7(this, arrayList), c4548u3);
    }

    @Override // com.plaid.internal.T7
    public final Object a(String str, String str2, byte[] bArr, C4566w3.a aVar) {
        return androidx.room.d.b(this.f46893a, true, new a8(this, str, str2, bArr), aVar);
    }

    @Override // com.plaid.internal.T7
    public final Object a(C4584y3 c4584y3) {
        androidx.room.l0 l0VarT = androidx.room.l0.t("SELECT * FROM workflow_analytics", 0);
        return androidx.room.d.a(this.f46893a, false, wa.b.a(), new U7(this, l0VarT), c4584y3);
    }
}
