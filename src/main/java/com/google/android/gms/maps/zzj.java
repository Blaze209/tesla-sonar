package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes5.dex */
final class zzj extends com.google.android.gms.maps.internal.zzam {
    final /* synthetic */ GoogleMap.OnMapLoadedCallback zza;

    zzj(GoogleMap googleMap, GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.zza = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void zzb() {
        this.zza.onMapLoaded();
    }
}
