package com.google.android.gms.internal.nearby;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.fastpair.AudioUsage;
import com.google.android.gms.nearby.fastpair.FastPairClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class zzz extends GoogleApi implements FastPairClient {
    private static final Api zza = new Api("Nearby.FAST_PAIR", new zzw(), new Api.ClientKey());

    public zzz(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions>) zza, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.nearby.fastpair.FastPairClient
    public final Task<Boolean> isSassDeviceAvailable(@AudioUsage final int i11) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzx zzxVar = new zzx(this.zza, (TaskCompletionSource) obj2);
                zzad zzadVar = (zzad) ((zzt) obj).getService();
                zzae zzaeVar = new zzae();
                zzaeVar.zza(i11);
                zzaeVar.zzb(zzxVar);
                zzadVar.zzd(zzaeVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzj).setMethodKey(1340).build());
    }

    @Override // com.google.android.gms.nearby.fastpair.FastPairClient
    public final Task<Boolean> triggerSassForUsage(@AudioUsage final int i11) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzy zzyVar = new zzy(this.zza, (TaskCompletionSource) obj2);
                zzad zzadVar = (zzad) ((zzt) obj).getService();
                zzai zzaiVar = new zzai();
                zzaiVar.zza(i11);
                zzaiVar.zzb(zzyVar);
                zzadVar.zze(zzaiVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzj).setMethodKey(1341).build());
    }
}
