package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

/* JADX INFO: loaded from: classes5.dex */
final class zzaq extends zzbq {
    final /* synthetic */ OnStreetViewPanoramaReadyCallback zza;

    zzaq(zzar zzarVar, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.zza = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbr
    public final void zzb(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.zza.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
