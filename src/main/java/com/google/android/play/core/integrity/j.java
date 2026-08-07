package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import iu.i0;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class j extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f43154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f43155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f43156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f43157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(q qVar, TaskCompletionSource taskCompletionSource, int i11, long j11, TaskCompletionSource taskCompletionSource2) {
        super(qVar, taskCompletionSource);
        this.f43154c = i11;
        this.f43155d = j11;
        this.f43156e = taskCompletionSource2;
        Objects.requireNonNull(qVar);
        this.f43157f = qVar;
    }

    @Override // iu.m0
    protected final void b() {
        q qVar = this.f43157f;
        if (q.j(qVar)) {
            super.a(new StandardIntegrityException(-2, false, null));
            return;
        }
        int i11 = this.f43154c;
        if (q.i(qVar, i11)) {
            super.a(new StandardIntegrityException(-14, false, null));
            return;
        }
        try {
            ((i0) qVar.f43178f.e()).c0(q.b(qVar, this.f43155d, i11), new o(qVar, this.f43156e));
        } catch (RemoteException e11) {
            this.f43157f.f43173a.a(e11, "warmUpIntegrityToken(%s)", Long.valueOf(this.f43155d));
            this.f43156e.trySetException(new StandardIntegrityException(-100, false, e11));
        }
    }
}
