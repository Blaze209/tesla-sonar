package com.plaid.internal;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;

/* JADX INFO: loaded from: classes6.dex */
public final class q8 implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8.a f48073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H1 f48074b;

    public q8(k8.a createFunction, H1 paneHostComponent) {
        p013kotlin.jvm.internal.s.k(createFunction, "createFunction");
        p013kotlin.jvm.internal.s.k(paneHostComponent, "paneHostComponent");
        this.f48073a = createFunction;
        this.f48074b = paneHostComponent;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* bridge */ /* synthetic */ androidx.p003lifecycle.c1 create(co0.d dVar, CreationExtras creationExtras) {
        return super.create(dVar, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* bridge */ /* synthetic */ androidx.p003lifecycle.c1 create(Class cls, CreationExtras creationExtras) {
        return super.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass) {
        p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
        Object objInvoke = this.f48073a.invoke(this.f48074b);
        p013kotlin.jvm.internal.s.i(objInvoke, "null cannot be cast to non-null type T of com.plaid.internal.workflow.panes.WorkflowViewModelFactory.create");
        return (T) objInvoke;
    }
}
