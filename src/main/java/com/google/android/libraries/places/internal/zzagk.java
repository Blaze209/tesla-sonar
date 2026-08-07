package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzagk implements zzagr {
    private final zzagg zza;
    private final zzahi zzb;
    private final boolean zzc;
    private final zzaeo zzd;

    private zzagk(zzahi zzahiVar, zzaeo zzaeoVar, zzagg zzaggVar) {
        this.zzb = zzahiVar;
        this.zzc = zzaeoVar.zzc(zzaggVar);
        this.zzd = zzaeoVar;
        this.zza = zzaggVar;
    }

    static zzagk zzi(zzahi zzahiVar, zzaeo zzaeoVar, zzagg zzaggVar) {
        return new zzagk(zzahiVar, zzaeoVar, zzaggVar);
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final int zza(Object obj) {
        zzahi zzahiVar = this.zzb;
        int iZzb = zzahiVar.zzb(zzahiVar.zzc(obj));
        if (!this.zzc) {
            return iZzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzc(obj).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final Object zzc() {
        zzagg zzaggVar = this.zza;
        return zzaggVar instanceof zzaey ? ((zzaey) zzaggVar).zzy() : zzaggVar.zzD().zzs();
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zzd(Object obj) {
        this.zzb.zze(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zze(Object obj, Object obj2) {
        zzagt.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            zzagt.zzC(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zzf(Object obj, zzahz zzahzVar) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final boolean zzg(Object obj, Object obj2) {
        if (!this.zzb.zzc(obj).equals(this.zzb.zzc(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final boolean zzh(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }
}
