package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
final class zzlu implements Iterator {
    final /* synthetic */ zzlv zza;
    private int zzb = 0;

    zzlu(zzlv zzlvVar) {
        this.zza = zzlvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.zzb;
        zzlv zzlvVar = this.zza;
        return i11 < zzlvVar.zza() - zzlvVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.zzb;
        zzlv zzlvVar = this.zza;
        if (i11 >= zzlvVar.zza() - zzlvVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzlv zzlvVar2 = this.zza;
        Object obj = zzlvVar2.zzb.zzb[zzlvVar2.zzb() + i11];
        this.zzb = i11 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
