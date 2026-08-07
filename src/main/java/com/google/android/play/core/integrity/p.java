package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import iu.m0;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
abstract class p extends m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f43172b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        Objects.requireNonNull(qVar);
        this.f43172b = qVar;
    }

    @Override // iu.m0
    public final void a(Exception exc) {
        if (!(exc instanceof af)) {
            super.a(exc);
        } else if (q.j(this.f43172b)) {
            super.a(new StandardIntegrityException(-2, false, exc));
        } else {
            super.a(new StandardIntegrityException(-9, false, exc));
        }
    }
}
