package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class zze extends AutocompletePrediction {
    private final String zza;
    private final Integer zzb;
    private final List zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final List zzg;
    private final List zzh;
    private final List zzi;

    zze(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.zza = str;
        this.zzb = num;
        if (list == null) {
            throw new NullPointerException("Null placeTypes");
        }
        this.zzc = list;
        if (str2 == null) {
            throw new NullPointerException("Null fullText");
        }
        this.zzd = str2;
        if (str3 == null) {
            throw new NullPointerException("Null primaryText");
        }
        this.zze = str3;
        if (str4 == null) {
            throw new NullPointerException("Null secondaryText");
        }
        this.zzf = str4;
        this.zzg = list2;
        this.zzh = list3;
        this.zzi = list4;
    }

    public final boolean equals(Object obj) {
        Integer num;
        List list;
        List list2;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletePrediction) {
            AutocompletePrediction autocompletePrediction = (AutocompletePrediction) obj;
            if (this.zza.equals(autocompletePrediction.getPlaceId()) && ((num = this.zzb) != null ? num.equals(autocompletePrediction.getDistanceMeters()) : autocompletePrediction.getDistanceMeters() == null) && this.zzc.equals(autocompletePrediction.getPlaceTypes()) && this.zzd.equals(autocompletePrediction.zza()) && this.zze.equals(autocompletePrediction.zzb()) && this.zzf.equals(autocompletePrediction.zzc()) && ((list = this.zzg) != null ? list.equals(autocompletePrediction.zzd()) : autocompletePrediction.zzd() == null) && ((list2 = this.zzh) != null ? list2.equals(autocompletePrediction.zze()) : autocompletePrediction.zze() == null) && ((list3 = this.zzi) != null ? list3.equals(autocompletePrediction.zzf()) : autocompletePrediction.zzf() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List<Place.Type> getPlaceTypes() {
        return this.zzc;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        Integer num = this.zzb;
        int iHashCode2 = (((((((((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003;
        List list = this.zzg;
        int iHashCode3 = (iHashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.zzh;
        int iHashCode4 = (iHashCode3 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.zzi;
        return iHashCode4 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "AutocompletePrediction{placeId=" + this.zza + ", distanceMeters=" + this.zzb + ", placeTypes=" + this.zzc.toString() + ", fullText=" + this.zzd + ", primaryText=" + this.zze + ", secondaryText=" + this.zzf + ", fullTextMatchedSubstrings=" + String.valueOf(this.zzg) + ", primaryTextMatchedSubstrings=" + String.valueOf(this.zzh) + ", secondaryTextMatchedSubstrings=" + String.valueOf(this.zzi) + "}";
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zzc() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zzd() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zze() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zzf() {
        return this.zzi;
    }
}
