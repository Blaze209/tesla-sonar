package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource<String> f44177a;

    public e(TaskCompletionSource<String> taskCompletionSource) {
        this.f44177a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(bw.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f44177a.trySetResult(dVar.d());
        return true;
    }
}
