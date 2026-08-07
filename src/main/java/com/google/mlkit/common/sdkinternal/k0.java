package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;

/* JADX INFO: loaded from: classes5.dex */
final class k0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f45052a;

    /* synthetic */ k0(o oVar, j0 j0Var) {
        this.f45052a = oVar;
        Preconditions.checkState(((Thread) oVar.f45084d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45052a.f45084d.set(null);
        this.f45052a.d();
    }
}
