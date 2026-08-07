package com.plaid.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46913c;

    public c8(String workflowId, String id2, byte[] model) {
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(model, "model");
        this.f46911a = workflowId;
        this.f46912b = id2;
        this.f46913c = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p013kotlin.jvm.internal.s.f(c8.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity");
        c8 c8Var = (c8) obj;
        return p013kotlin.jvm.internal.s.f(this.f46911a, c8Var.f46911a) && p013kotlin.jvm.internal.s.f(this.f46912b, c8Var.f46912b) && Arrays.equals(this.f46913c, c8Var.f46913c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46913c) + C4571x.a(this.f46912b, this.f46911a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "WorkflowAnalyticsEntity(workflowId=" + this.f46911a + ", id=" + this.f46912b + ", model=" + Arrays.toString(this.f46913c) + ")";
    }
}
