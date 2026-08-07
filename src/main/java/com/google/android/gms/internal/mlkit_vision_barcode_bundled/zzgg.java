package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzgg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgs zzb;

    static {
        int i11 = zzfu.zza;
        zzb = new zzgu();
    }

    public static void zzA(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzC(i11, list, z11);
    }

    public static void zzB(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzE(i11, list, z11);
    }

    public static void zzC(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzJ(i11, list, z11);
    }

    public static void zzD(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzL(i11, list, z11);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzdn.zzB(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzB;
        }
        zzei zzeiVar = (zzei) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzdn.zzB(zzeiVar.zze(i11));
            i11++;
        }
        return iZzB2;
    }

    static int zzb(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzdn.zzA(i11 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzdn.zzA(i11 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzdn.zzB(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzB;
        }
        zzei zzeiVar = (zzei) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzdn.zzB(zzeiVar.zze(i11));
            i11++;
        }
        return iZzB2;
    }

    static int zzg(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzdn.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iZzB;
        }
        zzfb zzfbVar = (zzfb) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzdn.zzB(zzfbVar.zze(i11));
            i11++;
        }
        return iZzB2;
    }

    static int zzh(int i11, Object obj, zzge zzgeVar) {
        int i12 = i11 << 3;
        if (!(obj instanceof zzex)) {
            return zzdn.zzA(i12) + zzdn.zzy((zzfm) obj, zzgeVar);
        }
        int iZzA = zzdn.zzA(i12);
        int iZza = ((zzex) obj).zza();
        return iZzA + zzdn.zzA(iZza) + iZza;
    }

    static int zzi(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int iZzA = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                iZzA += zzdn.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return iZzA;
        }
        zzei zzeiVar = (zzei) list;
        int iZzA2 = 0;
        while (i11 < size) {
            int iZze = zzeiVar.zze(i11);
            iZzA2 += zzdn.zzA((iZze >> 31) ^ (iZze + iZze));
            i11++;
        }
        return iZzA2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int iZzB = 0;
            while (i11 < size) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                iZzB += zzdn.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return iZzB;
        }
        zzfb zzfbVar = (zzfb) list;
        int iZzB2 = 0;
        while (i11 < size) {
            long jZze = zzfbVar.zze(i11);
            iZzB2 += zzdn.zzB((jZze >> 63) ^ (jZze + jZze));
            i11++;
        }
        return iZzB2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzdn.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzA;
        }
        zzei zzeiVar = (zzei) list;
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzdn.zzA(zzeiVar.zze(i11));
            i11++;
        }
        return iZzA2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzdn.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iZzB;
        }
        zzfb zzfbVar = (zzfb) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzdn.zzB(zzfbVar.zze(i11));
            i11++;
        }
        return iZzB2;
    }

    public static zzgs zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i11, int i12, Object obj2, zzgs zzgsVar) {
        zzeh zzehVar;
        zzgt zzgtVar;
        Object obj3 = obj2;
        if (obj2 == null && (zzgtVar = (zzehVar = (zzeh) obj).zzc) == zzgt.zzc()) {
            obj3 = zzgtVar;
            zzgt zzgtVarZzf = zzgt.zzf();
            zzehVar.zzc = zzgtVarZzf;
            obj3 = zzgtVarZzf;
        }
        obj3 = zzgtVar;
        ((zzgt) obj3).zzj(i11 << 3, Long.valueOf(i12));
        return obj3;
    }

    static void zzo(zzdt zzdtVar, Object obj, Object obj2) {
        zzdx zzdxVar = ((zzed) obj2).zzb;
        if (zzdxVar.zza.isEmpty()) {
            return;
        }
        ((zzed) obj).zzc().zzh(zzdxVar);
    }

    static void zzp(zzgs zzgsVar, Object obj, Object obj2) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVarZze = zzehVar.zzc;
        zzgt zzgtVar = ((zzeh) obj2).zzc;
        if (!zzgt.zzc().equals(zzgtVar)) {
            if (zzgt.zzc().equals(zzgtVarZze)) {
                zzgtVarZze = zzgt.zze(zzgtVarZze, zzgtVar);
            } else {
                zzgtVarZze.zzd(zzgtVar);
            }
        }
        zzehVar.zzc = zzgtVarZze;
    }

    public static void zzq(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzc(i11, list, z11);
    }

    public static void zzr(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzg(i11, list, z11);
    }

    public static void zzs(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzj(i11, list, z11);
    }

    public static void zzt(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzl(i11, list, z11);
    }

    public static void zzu(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzn(i11, list, z11);
    }

    public static void zzv(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzp(i11, list, z11);
    }

    public static void zzw(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzs(i11, list, z11);
    }

    public static void zzx(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzu(i11, list, z11);
    }

    public static void zzy(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzy(i11, list, z11);
    }

    public static void zzz(int i11, List list, zzhh zzhhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzA(i11, list, z11);
    }
}
