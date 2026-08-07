package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb;

    zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.zza;
        if (this.zzb < zzaeVar.zzh()) {
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            return zzaeVar.zzl(i11);
        }
        int i12 = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i12);
        throw new NoSuchElementException(sb2.toString());
    }
}
