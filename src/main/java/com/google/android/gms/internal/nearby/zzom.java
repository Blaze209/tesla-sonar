package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbAvailabilityObserver;

/* JADX INFO: loaded from: classes5.dex */
final class zzom extends zzlf {
    private final UwbAvailabilityObserver zza;

    zzom(zzou zzouVar, UwbAvailabilityObserver uwbAvailabilityObserver) {
        zzouVar.registerListener(uwbAvailabilityObserver, UwbAvailabilityObserver.class.getName());
        this.zza = uwbAvailabilityObserver;
    }

    @Override // com.google.android.gms.internal.nearby.zzlg
    public final void zzd(boolean z11, int i11) {
        this.zza.onUwbStateChanged(z11, i11);
    }
}
