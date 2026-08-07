package com.google.android.gms.maps;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes5.dex */
final class zzz extends com.google.android.gms.maps.internal.zzao {
    final /* synthetic */ GoogleMap.OnMapLongClickListener zza;

    zzz(GoogleMap googleMap, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.zza = onMapLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zzb(LatLng latLng) {
        this.zza.onMapLongClick(latLng);
    }
}
