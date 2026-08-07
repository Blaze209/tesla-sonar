package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzdj implements Continuation {
    public static final /* synthetic */ zzdj zza = new zzdj();

    private /* synthetic */ zzdj() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            return Tasks.forException(exception instanceof ApiException ? (ApiException) exception : new ApiException(new Status(13, exception.toString())));
        }
        return task;
    }
}
