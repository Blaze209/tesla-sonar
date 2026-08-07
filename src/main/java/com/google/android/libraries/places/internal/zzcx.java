package com.google.android.libraries.places.internal;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.k;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcx {
    private final j zza;
    private final zzej zzb;

    zzcx(j jVar, zzej zzejVar, byte[] bArr) {
        this.zza = jVar;
        this.zzb = zzejVar;
    }

    static /* synthetic */ void zzc(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        try {
            taskCompletionSource.trySetException(zzcr.zza(volleyError));
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final Task zza(zzdf zzdfVar, final Class cls) {
        String strZzc = zzdfVar.zzc();
        Map mapZzd = zzdfVar.zzd();
        CancellationToken cancellationTokenZza = zzdfVar.zza();
        final TaskCompletionSource taskCompletionSource = cancellationTokenZza != null ? new TaskCompletionSource(cancellationTokenZza) : new TaskCompletionSource();
        final zzcw zzcwVar = new zzcw(this, 0, strZzc, null, new k.b() { // from class: com.google.android.libraries.places.internal.zzct
            @Override // com.android.volley.k.b
            public final void onResponse(Object obj) {
                this.zza.zzb(cls, taskCompletionSource, (JSONObject) obj);
            }
        }, new k.a() { // from class: com.google.android.libraries.places.internal.zzcu
            @Override // com.android.volley.k.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzcx.zzc(taskCompletionSource, volleyError);
            }
        }, mapZzd);
        if (cancellationTokenZza != null) {
            cancellationTokenZza.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzcv
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    zzcwVar.cancel();
                }
            });
        }
        this.zza.a(zzcwVar);
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ void zzb(Class cls, TaskCompletionSource taskCompletionSource, JSONObject jSONObject) {
        try {
            try {
                taskCompletionSource.trySetResult((zzdg) this.zzb.zza(jSONObject.toString(), cls));
            } catch (zzdh e11) {
                taskCompletionSource.trySetException(new ApiException(new Status(8, e11.getMessage())));
            }
        } catch (Error | RuntimeException e12) {
            zzgb.zzb(e12);
            throw e12;
        }
    }
}
