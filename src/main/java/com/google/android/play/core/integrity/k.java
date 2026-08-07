package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import iu.i0;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class k extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f43158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a.d f43159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f43160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f43161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f43162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ q f43163h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(q qVar, TaskCompletionSource taskCompletionSource, int i11, a.d dVar, long j11, long j12, TaskCompletionSource taskCompletionSource2) {
        super(qVar, taskCompletionSource);
        this.f43158c = i11;
        this.f43159d = dVar;
        this.f43160e = j11;
        this.f43161f = j12;
        this.f43162g = taskCompletionSource2;
        Objects.requireNonNull(qVar);
        this.f43163h = qVar;
    }

    @Override // iu.m0
    protected final void b() {
        q qVar = this.f43163h;
        if (q.j(qVar)) {
            super.a(new StandardIntegrityException(-2, false, null));
            return;
        }
        int i11 = this.f43158c;
        if (q.i(qVar, i11)) {
            super.a(new StandardIntegrityException(-14, false, null));
            return;
        }
        try {
            i0 i0Var = (i0) qVar.f43178f.e();
            a.d dVar = this.f43159d;
            long j11 = this.f43160e;
            i0Var.Y(q.a(qVar, dVar, j11, this.f43161f, i11), new n(qVar, this.f43162g, j11));
        } catch (RemoteException e11) {
            q qVar2 = this.f43163h;
            a.d dVar2 = this.f43159d;
            qVar2.f43173a.a(e11, "requestExpressIntegrityToken(%s, %s, %s)", dVar2.b(), dVar2.c(), Long.valueOf(this.f43160e));
            this.f43162g.trySetException(new StandardIntegrityException(-100, false, e11));
        }
    }
}
