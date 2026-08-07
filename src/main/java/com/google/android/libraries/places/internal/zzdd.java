package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.h;
import com.android.volley.j;
import com.android.volley.k;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzdd {
    private final j zza;

    zzdd(j jVar) {
        this.zza = jVar;
    }

    static /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        ApiException apiExceptionZza;
        try {
            h hVar = volleyError.f20155a;
            if (hVar != null) {
                int i11 = hVar.f20191a;
                if (i11 != 400) {
                    apiExceptionZza = i11 != 403 ? zzcr.zza(volleyError) : new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                } else {
                    apiExceptionZza = new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                }
            }
            taskCompletionSource.trySetException(apiExceptionZza);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    static /* synthetic */ void zzc(zzds zzdsVar, TaskCompletionSource taskCompletionSource, Bitmap bitmap) {
        try {
            zzdsVar.zzb(bitmap);
            taskCompletionSource.trySetResult(zzdsVar.zza());
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final Task zzb(zzdf zzdfVar, final zzds zzdsVar) {
        String strZzc = zzdfVar.zzc();
        Map mapZzd = zzdfVar.zzd();
        CancellationToken cancellationTokenZza = zzdfVar.zza();
        final TaskCompletionSource taskCompletionSource = cancellationTokenZza != null ? new TaskCompletionSource(cancellationTokenZza) : new TaskCompletionSource();
        final byte[] bArr = null;
        final zzdc zzdcVar = new zzdc(this, strZzc, new k.b(taskCompletionSource, bArr) { // from class: com.google.android.libraries.places.internal.zzcz
            public final /* synthetic */ TaskCompletionSource zza;

            @Override // com.android.volley.k.b
            public final void onResponse(Object obj) {
                zzdd.zzc(this.zzb, this.zza, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new k.a() { // from class: com.google.android.libraries.places.internal.zzda
            @Override // com.android.volley.k.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzdd.zza(taskCompletionSource, volleyError);
            }
        }, mapZzd);
        if (cancellationTokenZza != null) {
            cancellationTokenZza.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzdb
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    zzdcVar.cancel();
                }
            });
        }
        this.zza.a(zzdcVar);
        return taskCompletionSource.getTask();
    }
}
