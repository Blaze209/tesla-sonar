package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
final class zzcy extends zzcz {
    final /* synthetic */ zzdf zza;
    private int zzb = 0;
    private final int zzc;

    zzcy(zzdf zzdfVar) {
        this.zza = zzdfVar;
        this.zzc = zzdfVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza() {
        int i11 = this.zzb;
        if (i11 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i11 + 1;
        return this.zza.zzb(i11);
    }
}
