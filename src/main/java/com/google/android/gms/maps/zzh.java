package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes5.dex */
final class zzh extends com.google.android.gms.maps.internal.zzaw {
    final /* synthetic */ GoogleMap.OnMyLocationButtonClickListener zza;

    zzh(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.zza = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final boolean zzb() {
        return this.zza.onMyLocationButtonClick();
    }
}
