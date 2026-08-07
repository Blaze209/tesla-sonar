package com.google.android.gms.maps;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes5.dex */
final class zzy extends com.google.android.gms.maps.internal.zzak {
    final /* synthetic */ GoogleMap.OnMapClickListener zza;

    zzy(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
        this.zza = onMapClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzal
    public final void zzb(LatLng latLng) {
        this.zza.onMapClick(latLng);
    }
}
