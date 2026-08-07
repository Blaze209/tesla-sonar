package com.plaid.internal.core.analytics.batch;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.y;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/plaid/internal/core/analytics/batch/AnalyticsBatchUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnalyticsBatchUploadWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsBatchUploadWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        s.k(appContext, "appContext");
        s.k(workerParams, "workerParams");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(Continuation<? super y.a> continuation) {
        y.a aVarE = y.a.e();
        s.j(aVarE, "success(...)");
        return aVarE;
    }
}
