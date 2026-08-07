package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class zzci {
    private static final long zza = TimeUnit.SECONDS.toMillis(30);
    private final FusedLocationProviderClient zzb;
    private final zzfj zzc;

    zzci(FusedLocationProviderClient fusedLocationProviderClient, zzfj zzfjVar) {
        this.zzb = fusedLocationProviderClient;
        this.zzc = zzfjVar;
    }

    public final Task zza(CancellationToken cancellationToken) {
        Task<Location> currentLocation;
        CurrentLocationRequest.Builder priority = new CurrentLocationRequest.Builder().setPriority(100);
        long j11 = zza;
        CurrentLocationRequest currentLocationRequestBuild = priority.setDurationMillis(j11).build();
        if (FusedLocationProviderClient.class.isInterface()) {
            currentLocation = this.zzb.getCurrentLocation(currentLocationRequestBuild, cancellationToken);
        } else {
            try {
                currentLocation = (Task) FusedLocationProviderClient.class.getMethod("getCurrentLocation", CurrentLocationRequest.class, CancellationToken.class).invoke(this.zzb, currentLocationRequestBuild, cancellationToken);
            } catch (ReflectiveOperationException e11) {
                throw new IllegalStateException(e11);
            }
        }
        final zzfj zzfjVar = this.zzc;
        final TaskCompletionSource taskCompletionSource = cancellationToken == null ? new TaskCompletionSource() : new TaskCompletionSource(cancellationToken);
        zzfjVar.zza(taskCompletionSource, j11, "Location timeout.");
        currentLocation.continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzfh
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Exception exception = task.getException();
                if (task.isSuccessful()) {
                    taskCompletionSource2.setResult(task.getResult());
                } else if (!task.isCanceled() && exception != null) {
                    taskCompletionSource2.setException(exception);
                }
                return taskCompletionSource2.getTask();
            }
        });
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzfi
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzfjVar.zzb(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask().continueWithTask(new zzch(this));
    }
}
