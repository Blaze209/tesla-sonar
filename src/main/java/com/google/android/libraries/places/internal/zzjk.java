package com.google.android.libraries.places.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzjk extends zzjl implements Serializable {
    private static final zzjk zzc = new zzjk(zzir.zzb, zzip.zzb);
    final zzit zza;
    final zzit zzb;

    private zzjk(zzit zzitVar, zzit zzitVar2) {
        this.zza = zzitVar;
        this.zzb = zzitVar2;
        if (zzitVar.compareTo(zzitVar2) > 0 || zzitVar == zzip.zzb || zzitVar2 == zzir.zzb) {
            throw new IllegalArgumentException("Invalid range: ".concat(zzf(zzitVar, zzitVar2)));
        }
    }

    static int zza(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static zzjk zzb(Comparable comparable) {
        return new zzjk(new zzis(comparable), zzip.zzb);
    }

    public static zzjk zzc(Comparable comparable, Comparable comparable2) {
        return new zzjk(new zzis(comparable), new zziq(comparable2));
    }

    public static zzjk zzd(Comparable comparable, Comparable comparable2) {
        return new zzjk(new zzis(comparable), new zzis(comparable2));
    }

    private static String zzf(zzit zzitVar, zzit zzitVar2) {
        StringBuilder sb2 = new StringBuilder(16);
        zzitVar.zzc(sb2);
        sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
        zzitVar2.zzd(sb2);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjk) {
            zzjk zzjkVar = (zzjk) obj;
            if (this.zza.equals(zzjkVar.zza) && this.zzb.equals(zzjkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return zzf(this.zza, this.zzb);
    }

    public final boolean zze(Comparable comparable) {
        comparable.getClass();
        return this.zza.zze(comparable) && !this.zzb.zze(comparable);
    }
}
