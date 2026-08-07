package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class Ry implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qy f27692a;

    public Ry(Qy qy2) {
        this.f27692a = qy2;
    }

    public static WorkflowConfig b(Qy qy2) {
        return (WorkflowConfig) qj0.h.d(qy2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WorkflowConfig get() {
        return b(this.f27692a);
    }

    public static Ry a(Qy qy2) {
        return new Ry(qy2);
    }
}
