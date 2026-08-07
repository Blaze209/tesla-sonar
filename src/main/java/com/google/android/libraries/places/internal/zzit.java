package com.google.android.libraries.places.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzit implements Comparable, Serializable {
    final Comparable zza;

    zzit(Comparable comparable) {
        this.zza = comparable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzit) {
            try {
                if (compareTo((zzit) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzit zzitVar) {
        if (zzitVar != zzir.zzb) {
            if (zzitVar == zzip.zzb) {
                return -1;
            }
            int iZza = zzjk.zza(this.zza, zzitVar.zza);
            if (iZza != 0) {
                return iZza;
            }
            boolean z11 = this instanceof zziq;
            if (z11 == (zzitVar instanceof zziq)) {
                return 0;
            }
            if (!z11) {
                return -1;
            }
        }
        return 1;
    }

    abstract void zzc(StringBuilder sb2);

    abstract void zzd(StringBuilder sb2);

    abstract boolean zze(Comparable comparable);
}
