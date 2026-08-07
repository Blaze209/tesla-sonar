package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzcc {
    private final String zza;
    private final long zzb;

    zzcc(String str, long j11) {
        this.zza = str;
        this.zzb = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcc) {
            zzcc zzccVar = (zzcc) obj;
            if (Objects.equal(this.zza, zzccVar.zza)) {
                if (Objects.equal(Long.valueOf(this.zzb), Long.valueOf(zzccVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb));
    }

    public final String zza() {
        return this.zza;
    }
}
