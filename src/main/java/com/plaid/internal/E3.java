package com.plaid.internal;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;

/* JADX INFO: loaded from: classes6.dex */
public final class E3 implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H1 f46294a;

    public E3(H1 loadingComponent) {
        p013kotlin.jvm.internal.s.k(loadingComponent, "loadingComponent");
        this.f46294a = loadingComponent;
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
    public final <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass) throws B2 {
        p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(D3.class)) {
            return new D3(this.f46294a);
        }
        throw new B2("Unsupported ViewModel");
    }
}
