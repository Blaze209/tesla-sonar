package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzhl;
import j7.a;

/* JADX INFO: loaded from: classes5.dex */
public final class AppMeasurementReceiver extends a implements zzhl.zza {
    private zzhl zza;

    @NonNull
    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhl.zza
    public void doStartService(@NonNull Context context, @NonNull Intent intent) {
        a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzhl(this);
        }
        this.zza.zza(context, intent);
    }
}
