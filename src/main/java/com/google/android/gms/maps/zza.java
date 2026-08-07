package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes5.dex */
final class zza extends com.google.android.gms.maps.internal.zzas {
    final /* synthetic */ GoogleMap.OnMarkerClickListener zza;

    zza(GoogleMap googleMap, GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.zza = onMarkerClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final boolean zzb(com.google.android.gms.internal.maps.zzx zzxVar) {
        return this.zza.onMarkerClick(new Marker(zzxVar));
    }
}
