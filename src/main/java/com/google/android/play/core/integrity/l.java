package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import iu.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class l extends j0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final TaskCompletionSource f43164n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ q f43165o;

    l(q qVar, TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(qVar);
        this.f43165o = qVar;
        this.f43164n = taskCompletionSource;
    }

    @Override // iu.k0
    public void R0(Bundle bundle) {
        this.f43165o.f43178f.v(this.f43164n);
    }

    @Override // iu.k0
    public void S(Bundle bundle) {
        this.f43165o.f43178f.v(this.f43164n);
    }

    @Override // iu.k0
    public final void W(Bundle bundle) {
        this.f43165o.f43178f.v(this.f43164n);
    }

    @Override // iu.k0
    public final void X0(Bundle bundle) {
        this.f43165o.f43178f.v(this.f43164n);
    }
}
