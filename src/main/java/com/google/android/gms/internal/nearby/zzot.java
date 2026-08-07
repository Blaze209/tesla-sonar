package com.google.android.gms.internal.nearby;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.RangingMeasurement;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzot extends zzkw {
    final /* synthetic */ zzou zza;
    private final ListenerHolder zzb;
    private final RangingSessionCallback zzc;

    zzot(zzou zzouVar, RangingSessionCallback rangingSessionCallback) {
        this.zza = zzouVar;
        this.zzb = zzouVar.registerListener(rangingSessionCallback, RangingSessionCallback.class.getName());
        this.zzc = rangingSessionCallback;
    }

    static /* bridge */ /* synthetic */ RangingPosition zzb(zzot zzotVar, zzmk zzmkVar) {
        return new RangingPosition(zzi(zzmkVar.zze()), zzmkVar.zzd() != null ? zzi(zzmkVar.zzd()) : null, zzmkVar.zzf() != null ? zzi(zzmkVar.zzf()) : null, zzmkVar.zzb(), zzmkVar.zza(), zzmkVar.zzc());
    }

    @SuppressLint({"WrongConstant"})
    private static final RangingMeasurement zzi(zzme zzmeVar) {
        return new RangingMeasurement(zzmeVar.zzb(), zzmeVar.zza());
    }

    @Override // com.google.android.gms.internal.nearby.zzkx
    public final void zzd(final zzlo zzloVar) {
        int i11 = zzou.zza;
        final Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.nearby.zzon
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(zzloVar);
            }
        };
        this.zza.doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzoo
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                runnable.run();
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzop
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).withHolder(this.zzb).setFeatures(com.google.android.gms.nearby.zza.zzH).setMethodKey(1304).build());
    }

    @Override // com.google.android.gms.internal.nearby.zzkx
    public final void zze(zzlq zzlqVar) {
        int i11 = zzou.zza;
        this.zzb.notifyListener(new zzor(this, zzlqVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzkx
    @SuppressLint({"WrongConstant"})
    public final void zzf(zzls zzlsVar) {
        int i11 = zzou.zza;
        this.zzb.notifyListener(new zzos(this, zzlsVar));
    }

    final /* synthetic */ void zzh(zzlo zzloVar) {
        this.zzb.notifyListener(new zzoq(this, zzloVar));
    }
}
