package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzch implements Continuation {
    final /* synthetic */ zzci zza;

    zzch(zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (task.isCanceled()) {
            taskCompletionSource.trySetException(new ApiException(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (task.getException() == null && task.getResult() == null) {
            taskCompletionSource.trySetException(new ApiException(new Status(8, "Location unavailable.")));
        }
        return taskCompletionSource.getTask().getException() != null ? taskCompletionSource.getTask() : task;
    }
}
