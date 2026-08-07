package com.plaid.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class j8 extends p013kotlin.jvm.internal.u implements wn0.a<m8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k8<p8> f47780a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(k8<p8> k8Var) {
        super(0);
        this.f47780a = k8Var;
    }

    @Override // wn0.a
    public final m8 invoke() {
        m8 m8Var;
        Bundle arguments = this.f47780a.getArguments();
        if (arguments == null || (m8Var = (m8) arguments.getParcelable("workflow_pane_id")) == null) {
            throw new RuntimeException("Needs pane id");
        }
        return m8Var;
    }
}
