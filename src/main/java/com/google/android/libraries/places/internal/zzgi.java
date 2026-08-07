package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzgi extends zzgr {
    private final AutocompleteActivityMode zza;
    private final zziy zzb;
    private final zzgp zzc;
    private final String zzd;
    private final String zze;
    private final LocationBias zzf;
    private final LocationRestriction zzg;
    private final zziy zzh;
    private final TypeFilter zzi;
    private final zziy zzj;
    private final int zzk;
    private final int zzl;

    zzgi(AutocompleteActivityMode autocompleteActivityMode, zziy zziyVar, zzgp zzgpVar, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, zziy zziyVar2, TypeFilter typeFilter, zziy zziyVar3, int i11, int i12) {
        if (autocompleteActivityMode == null) {
            throw new NullPointerException("Null mode");
        }
        this.zza = autocompleteActivityMode;
        if (zziyVar == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.zzb = zziyVar;
        if (zzgpVar == null) {
            throw new NullPointerException("Null origin");
        }
        this.zzc = zzgpVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = locationBias;
        this.zzg = locationRestriction;
        if (zziyVar2 == null) {
            throw new NullPointerException("Null countries");
        }
        this.zzh = zziyVar2;
        this.zzi = typeFilter;
        if (zziyVar3 == null) {
            throw new NullPointerException("Null typesFilter");
        }
        this.zzj = zziyVar3;
        this.zzk = i11;
        this.zzl = i12;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        LocationBias locationBias;
        LocationRestriction locationRestriction;
        TypeFilter typeFilter;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgr) {
            zzgr zzgrVar = (zzgr) obj;
            if (this.zza.equals(zzgrVar.zzh()) && this.zzb.equals(zzgrVar.zzj()) && this.zzc.equals(zzgrVar.zzf()) && ((str = this.zzd) != null ? str.equals(zzgrVar.zzm()) : zzgrVar.zzm() == null) && ((str2 = this.zze) != null ? str2.equals(zzgrVar.zzl()) : zzgrVar.zzl() == null) && ((locationBias = this.zzf) != null ? locationBias.equals(zzgrVar.zzc()) : zzgrVar.zzc() == null) && ((locationRestriction = this.zzg) != null ? locationRestriction.equals(zzgrVar.zzd()) : zzgrVar.zzd() == null) && this.zzh.equals(zzgrVar.zzi()) && ((typeFilter = this.zzi) != null ? typeFilter.equals(zzgrVar.zze()) : zzgrVar.zze() == null) && this.zzj.equals(zzgrVar.zzk()) && this.zzk == zzgrVar.zza() && this.zzl == zzgrVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003;
        String str = this.zzd;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zze;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LocationBias locationBias = this.zzf;
        int iHashCode4 = (iHashCode3 ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzg;
        int iHashCode5 = (((iHashCode4 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        TypeFilter typeFilter = this.zzi;
        return ((((((iHashCode5 ^ (typeFilter != null ? typeFilter.hashCode() : 0)) * 1000003) ^ this.zzj.hashCode()) * 1000003) ^ this.zzk) * 1000003) ^ this.zzl;
    }

    public final String toString() {
        return "AutocompleteOptions{mode=" + this.zza.toString() + ", placeFields=" + this.zzb.toString() + ", origin=" + this.zzc.toString() + ", initialQuery=" + this.zzd + ", hint=" + this.zze + ", locationBias=" + String.valueOf(this.zzf) + ", locationRestriction=" + String.valueOf(this.zzg) + ", countries=" + this.zzh.toString() + ", typeFilter=" + String.valueOf(this.zzi) + ", typesFilter=" + this.zzj.toString() + ", primaryColor=" + this.zzk + ", primaryColorDark=" + this.zzl + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final int zzb() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final LocationBias zzc() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final LocationRestriction zzd() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    @Deprecated
    public final TypeFilter zze() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zzgp zzf() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zzgq zzg() {
        return new zzgh(this, null);
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final AutocompleteActivityMode zzh() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zziy zzi() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zziy zzj() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zziy zzk() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final String zzl() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final String zzm() {
        return this.zzd;
    }
}
