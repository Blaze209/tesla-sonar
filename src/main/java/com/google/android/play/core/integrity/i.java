package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import iu.m0;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class i extends m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f43152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f43153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(q qVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f43152b = context;
        Objects.requireNonNull(qVar);
        this.f43153c = qVar;
    }

    @Override // iu.m0
    protected final void b() {
        this.f43153c.f43175c.trySetResult(Integer.valueOf(iu.i.a(this.f43152b)));
    }
}
