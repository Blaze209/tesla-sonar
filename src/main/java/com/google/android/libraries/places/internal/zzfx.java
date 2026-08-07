package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzfx extends zzfz {
    private final String zza;
    private final int zzb;
    private final int zzc;

    /* synthetic */ zzfx(String str, int i11, int i12, zzfw zzfwVar) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfz) {
            zzfz zzfzVar = (zzfz) obj;
            if (this.zza.equals(zzfzVar.zzb()) && this.zzb == zzfzVar.zza() && this.zzc == zzfzVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        return "ClientProfile{packageName=" + this.zza + ", versionCode=" + this.zzb + ", requestSource=" + (this.zzc != 1 ? "AUTOCOMPLETE_WIDGET" : "PROGRAMMATIC_API") + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzfz
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzfz
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzfz
    public final int zzc() {
        return this.zzc;
    }
}
