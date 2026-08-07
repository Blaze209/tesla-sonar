package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zzoi zzb;

    static {
        int i11 = zznu.zza;
        zzb = new zzok();
    }

    public static zzoi zzA() {
        return zzb;
    }

    static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzC(zzls zzlsVar, Object obj, Object obj2) {
        if (((zzmc) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzD(zzoi zzoiVar, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVarZzc = zzmfVar.zzc;
        zzoj zzojVar = ((zzmf) obj2).zzc;
        if (!zzoj.zza().equals(zzojVar)) {
            if (zzoj.zza().equals(zzojVarZzc)) {
                zzojVarZzc = zzoj.zzc(zzojVarZzc, zzojVar);
            } else {
                zzojVarZzc.zzl(zzojVar);
            }
        }
        zzmfVar.zzc = zzojVarZzc;
    }

    static Object zzE(Object obj, int i11, int i12, Object obj2, zzoi zzoiVar) {
        if (obj2 == null) {
            obj2 = zzoiVar.zza(obj);
        }
        ((zzoj) obj2).zzk(i11 << 3, Long.valueOf(i12));
        return obj2;
    }

    public static void zza(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzC(i11, list, z11);
    }

    public static void zzb(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzB(i11, list, z11);
    }

    public static void zzc(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzy(i11, list, z11);
    }

    public static void zzd(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzz(i11, list, z11);
    }

    public static void zze(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzL(i11, list, z11);
    }

    public static void zzf(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzA(i11, list, z11);
    }

    public static void zzg(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzJ(i11, list, z11);
    }

    public static void zzh(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzw(i11, list, z11);
    }

    public static void zzi(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzH(i11, list, z11);
    }

    public static void zzj(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzK(i11, list, z11);
    }

    public static void zzk(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzx(i11, list, z11);
    }

    public static void zzl(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzI(i11, list, z11);
    }

    public static void zzm(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzD(i11, list, z11);
    }

    public static void zzn(int i11, List list, zzov zzovVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzE(i11, list, z11);
    }

    static int zzo(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i11));
            i11++;
        }
        return iZzA2;
    }

    static int zzp(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i11));
            i11++;
        }
        return iZzA2;
    }

    static int zzq(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i11 < size) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                iZzA += zzlm.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i11 < size) {
            long jZzc = zznaVar.zzc(i11);
            iZzA2 += zzlm.zzA((jZzc >> 63) ^ (jZzc + jZzc));
            i11++;
        }
        return iZzA2;
    }

    static int zzr(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i11));
            i11++;
        }
        return iZzA2;
    }

    static int zzs(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i11));
            i11++;
        }
        return iZzA2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i11 < size) {
                iZzz += zzlm.zzz(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i11 < size) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i11));
            i11++;
        }
        return iZzz2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                iZzz += zzlm.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i11 < size) {
            int iZzf = zzmgVar.zzf(i11);
            iZzz2 += zzlm.zzz((iZzf >> 31) ^ (iZzf + iZzf));
            i11++;
        }
        return iZzz2;
    }

    static int zzv(List list) {
        return list.size() * 4;
    }

    static int zzw(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlm.zzz(i11 << 3) + 4);
    }

    static int zzx(List list) {
        return list.size() * 8;
    }

    static int zzy(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlm.zzz(i11 << 3) + 8);
    }

    static int zzz(int i11, Object obj, zznx zznxVar) {
        int i12 = i11 << 3;
        if (!(obj instanceof zzmw)) {
            return zzlm.zzz(i12) + zzlm.zzD((zznm) obj, zznxVar);
        }
        int iZzz = zzlm.zzz(i12);
        int iZzb = ((zzmw) obj).zzb();
        return iZzz + zzlm.zzz(iZzb) + iZzb;
    }
}
