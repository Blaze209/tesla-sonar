package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzahm implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzahn zzb;

    zzahm(zzahn zzahnVar) {
        this.zzb = zzahnVar;
        this.zza = zzahnVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
