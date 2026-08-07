package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzox implements zzgw {
    final /* synthetic */ String zza;
    final /* synthetic */ zzpj zzb;
    final /* synthetic */ zzpg zzc;

    zzox(zzpg zzpgVar, String str, zzpj zzpjVar) {
        this.zza = str;
        this.zzb = zzpjVar;
        Objects.requireNonNull(zzpgVar);
        this.zzc = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void zza(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        this.zzc.zzQ(this.zza, i11, th2, bArr, this.zzb);
    }
}
