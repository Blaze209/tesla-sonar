package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import iu.l0;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class n extends l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final l0 f43167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f43168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ q f43169r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(q qVar, TaskCompletionSource taskCompletionSource, long j11) {
        super(qVar, taskCompletionSource);
        Objects.requireNonNull(qVar);
        this.f43169r = qVar;
        this.f43167p = new l0("OnRequestIntegrityTokenCallback");
        this.f43168q = j11;
    }

    @Override // com.google.android.play.core.integrity.l, iu.k0
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.f43167p.b("onRequestExpressIntegrityToken", new Object[0]);
        q qVar = this.f43169r;
        ApiException apiExceptionA = qVar.f43177e.a(bundle);
        if (apiExceptionA != null) {
            this.f43164n.trySetException(apiExceptionA);
            return;
        }
        long j11 = bundle.getLong("request.token.sid");
        m mVar = new m(this, qVar.f43174b, j11);
        TaskCompletionSource taskCompletionSource = this.f43164n;
        e eVar = new e();
        eVar.c(bundle.getString("token"));
        eVar.a(mVar);
        eVar.b(j11);
        taskCompletionSource.trySetResult(eVar.d());
    }
}
