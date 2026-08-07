package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaa extends zzt implements Set {
    private transient zzx zza;

    zzaa() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzah.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zza */
    public abstract zzai iterator();

    public final zzx zzf() {
        zzx zzxVar = this.zza;
        if (zzxVar != null) {
            return zzxVar;
        }
        zzx zzxVarZzg = zzg();
        this.zza = zzxVarZzg;
        return zzxVarZzg;
    }

    zzx zzg() {
        Object[] array = toArray();
        int i11 = zzx.zzd;
        return zzx.zzg(array, array.length);
    }
}
