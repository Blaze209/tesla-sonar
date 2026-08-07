package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import iu.l0;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class o extends l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final l0 f43170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ q f43171q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, TaskCompletionSource taskCompletionSource) {
        super(qVar, taskCompletionSource);
        Objects.requireNonNull(qVar);
        this.f43171q = qVar;
        this.f43170p = new l0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.l, iu.k0
    public final void R0(Bundle bundle) {
        super.R0(bundle);
        this.f43170p.b("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f43171q.f43177e.a(bundle);
        if (apiExceptionA != null) {
            this.f43164n.trySetException(apiExceptionA);
        } else {
            this.f43164n.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
