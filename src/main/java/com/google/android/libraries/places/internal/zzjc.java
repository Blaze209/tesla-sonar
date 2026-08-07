package com.google.android.libraries.places.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzjc extends zziv implements Set {
    private transient zziy zza;

    zzjc() {
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
        return zzjs.zza(this);
    }

    @Override // com.google.android.libraries.places.internal.zziv
    public zziy zzd() {
        zziy zziyVar = this.zza;
        if (zziyVar != null) {
            return zziyVar;
        }
        zziy zziyVarZzh = zzh();
        this.zza = zziyVarZzh;
        return zziyVarZzh;
    }

    @Override // com.google.android.libraries.places.internal.zziv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract zzjv iterator();

    zziy zzh() {
        return zziy.zzi(toArray());
    }
}
