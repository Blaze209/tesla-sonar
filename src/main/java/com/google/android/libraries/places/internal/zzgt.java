package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgt {
    public static zzgt zzg() {
        return zzr(3).zzf();
    }

    public static zzgt zzh(String str) {
        str.getClass();
        zzgs zzgsVarZzr = zzr(6);
        zzgsVarZzr.zzd(str);
        return zzgsVarZzr.zzf();
    }

    public static zzgt zzi(String str, Status status) {
        str.getClass();
        status.getClass();
        zzgs zzgsVarZzr = zzr(7);
        zzgsVarZzr.zzd(str);
        zzgsVarZzr.zze(status);
        return zzgsVarZzr.zzf();
    }

    public static zzgt zzj(List list) {
        list.getClass();
        zzgs zzgsVarZzr = zzr(5);
        zzgsVarZzr.zzc(list);
        return zzgsVarZzr.zzf();
    }

    public static zzgt zzk() {
        return zzr(2).zzf();
    }

    public static zzgt zzl() {
        zzgs zzgsVarZzr = zzr(10);
        zzgsVarZzr.zze(new Status(16));
        return zzgsVarZzr.zzf();
    }

    public static zzgt zzm(AutocompletePrediction autocompletePrediction, Status status) {
        status.getClass();
        zzgs zzgsVarZzr = zzr(9);
        zzgsVarZzr.zzb(autocompletePrediction);
        zzgsVarZzr.zze(status);
        return zzgsVarZzr.zzf();
    }

    public static zzgt zzn(Place place) {
        place.getClass();
        zzgs zzgsVarZzr = zzr(8);
        zzgsVarZzr.zza(place);
        return zzgsVarZzr.zzf();
    }

    public static zzgt zzo() {
        return zzr(1).zzf();
    }

    public static zzgt zzp() {
        return zzr(4).zzf();
    }

    public static zzgt zzq(Status status) {
        status.getClass();
        zzgs zzgsVarZzr = zzr(10);
        zzgsVarZzr.zze(status);
        return zzgsVarZzr.zzf();
    }

    private static zzgs zzr(int i11) {
        zzgl zzglVar = new zzgl();
        zzglVar.zzg(i11);
        return zzglVar;
    }

    public abstract Status zza();

    public abstract AutocompletePrediction zzb();

    public abstract Place zzc();

    public abstract zziy zzd();

    public abstract String zze();

    public abstract int zzf();
}
