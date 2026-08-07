package com.plaid.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class I4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46352c;

    public I4(String workflowId, String renderingId, byte[] model) {
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(renderingId, "renderingId");
        p013kotlin.jvm.internal.s.k(model, "model");
        this.f46350a = workflowId;
        this.f46351b = renderingId;
        this.f46352c = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I4)) {
            return false;
        }
        I4 i11 = (I4) obj;
        return p013kotlin.jvm.internal.s.f(this.f46350a, i11.f46350a) && p013kotlin.jvm.internal.s.f(this.f46351b, i11.f46351b) && p013kotlin.jvm.internal.s.f(this.f46352c, i11.f46352c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46352c) + C4571x.a(this.f46351b, this.f46350a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PaneEntity(workflowId=" + this.f46350a + ", renderingId=" + this.f46351b + ", model=" + Arrays.toString(this.f46352c) + ")";
    }
}
