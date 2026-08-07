package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f44175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<f> f44176b;

    public d(h hVar, TaskCompletionSource<f> taskCompletionSource) {
        this.f44175a = hVar;
        this.f44176b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.f44176b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(bw.d dVar) {
        if (!dVar.k() || this.f44175a.f(dVar)) {
            return false;
        }
        this.f44176b.setResult(f.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
