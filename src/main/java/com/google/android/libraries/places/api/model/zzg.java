package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzg extends zzbb {
    private final int zza;
    private final int zzb;

    zzg(int i11, int i12) {
        this.zza = i11;
        this.zzb = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            if (this.zza == zzbbVar.zzb() && this.zzb == zzbbVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        return "SubstringMatch{offset=" + this.zza + ", length=" + this.zzb + "}";
    }

    @Override // com.google.android.libraries.places.api.model.zzbb
    final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzbb
    final int zzb() {
        return this.zza;
    }
}
