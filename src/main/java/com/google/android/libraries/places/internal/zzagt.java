package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzagt {
    private static final Class zza;
    private static final zzahi zzb;
    private static final zzahi zzc;
    private static final zzahi zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzZ(false);
        zzc = zzZ(true);
        zzd = new zzahk();
    }

    public static zzahi zzA() {
        return zzc;
    }

    public static zzahi zzB() {
        return zzd;
    }

    static void zzC(zzaeo zzaeoVar, Object obj, Object obj2) {
        zzaeoVar.zza(obj2);
        throw null;
    }

    static void zzD(zzahi zzahiVar, Object obj, Object obj2) {
        zzahiVar.zzf(obj, zzahiVar.zzd(zzahiVar.zzc(obj), zzahiVar.zzc(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzaey.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzF(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzc(i11, list, z11);
    }

    public static void zzG(int i11, List list, zzahz zzahzVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zze(i11, list);
    }

    public static void zzH(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzg(i11, list, z11);
    }

    public static void zzI(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzi(i11, list, z11);
    }

    public static void zzJ(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzk(i11, list, z11);
    }

    public static void zzK(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzm(i11, list, z11);
    }

    public static void zzL(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzo(i11, list, z11);
    }

    public static void zzM(int i11, List list, zzahz zzahzVar, zzagr zzagrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((zzaem) zzahzVar).zzp(i11, list.get(i12), zzagrVar);
        }
    }

    public static void zzN(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzr(i11, list, z11);
    }

    public static void zzO(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzt(i11, list, z11);
    }

    public static void zzP(int i11, List list, zzahz zzahzVar, zzagr zzagrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((zzaem) zzahzVar).zzu(i11, list.get(i12), zzagrVar);
        }
    }

    public static void zzQ(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzw(i11, list, z11);
    }

    public static void zzR(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzy(i11, list, z11);
    }

    public static void zzS(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzA(i11, list, z11);
    }

    public static void zzT(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzC(i11, list, z11);
    }

    public static void zzU(int i11, List list, zzahz zzahzVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzE(i11, list);
    }

    public static void zzV(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzG(i11, list, z11);
    }

    public static void zzW(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzI(i11, list, z11);
    }

    static boolean zzX(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzY(zzagb zzagbVar, Object obj, Object obj2, long j11) {
        zzaga zzagaVarZza = (zzaga) zzahs.zzf(obj, j11);
        zzaga zzagaVar = (zzaga) zzahs.zzf(obj2, j11);
        if (!zzagaVar.isEmpty()) {
            if (!zzagaVarZza.zzd()) {
                zzagaVarZza = zzagaVarZza.zza();
            }
            zzagaVarZza.zzc(zzagaVar);
        }
        zzahs.zzs(obj, j11, zzagaVarZza);
    }

    private static zzahi zzZ(boolean z11) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzahi) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zza(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzael.zzA(i11 << 3) + 1);
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = size * zzael.zzz(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzz += zzael.zzt((zzaed) list.get(i12));
        }
        return iZzz;
    }

    static int zzd(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzael.zzz(i11));
    }

    static int zze(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaez)) {
            int iZzv = 0;
            while (i11 < size) {
                iZzv += zzael.zzv(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzv;
        }
        zzaez zzaezVar = (zzaez) list;
        int iZzv2 = 0;
        while (i11 < size) {
            iZzv2 += zzael.zzv(zzaezVar.zzd(i11));
            i11++;
        }
        return iZzv2;
    }

    static int zzf(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzael.zzA(i11 << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzael.zzA(i11 << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i11, List list, zzagr zzagrVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzu = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iZzu += zzael.zzu(i11, (zzagg) list.get(i12), zzagrVar);
        }
        return iZzu;
    }

    static int zzk(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzael.zzz(i11));
    }

    static int zzl(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaez)) {
            int iZzv = 0;
            while (i11 < size) {
                iZzv += zzael.zzv(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzv;
        }
        zzaez zzaezVar = (zzaez) list;
        int iZzv2 = 0;
        while (i11 < size) {
            iZzv2 += zzael.zzv(zzaezVar.zzd(i11));
            i11++;
        }
        return iZzv2;
    }

    static int zzm(int i11, List list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzael.zzz(i11));
    }

    static int zzn(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzafv)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzael.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iZzB;
        }
        zzafv zzafvVar = (zzafv) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzael.zzB(zzafvVar.zzd(i11));
            i11++;
        }
        return iZzB2;
    }

    static int zzo(int i11, Object obj, zzagr zzagrVar) {
        if (!(obj instanceof zzafm)) {
            return zzael.zzA(i11 << 3) + zzael.zzx((zzagg) obj, zzagrVar);
        }
        int iZzA = zzael.zzA(i11 << 3);
        int iZza = ((zzafm) obj).zza();
        return iZzA + zzael.zzA(iZza) + iZza;
    }

    static int zzp(int i11, List list, zzagr zzagrVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzael.zzz(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            iZzz += obj instanceof zzafm ? zzael.zzw((zzafm) obj) : zzael.zzx((zzagg) obj, zzagrVar);
        }
        return iZzz;
    }

    static int zzq(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzael.zzz(i11));
    }

    static int zzr(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaez)) {
            int iZzA = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                iZzA += zzael.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return iZzA;
        }
        zzaez zzaezVar = (zzaez) list;
        int iZzA2 = 0;
        while (i11 < size) {
            int iZzd = zzaezVar.zzd(i11);
            iZzA2 += zzael.zzA((iZzd >> 31) ^ (iZzd + iZzd));
            i11++;
        }
        return iZzA2;
    }

    static int zzs(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzael.zzz(i11));
    }

    static int zzt(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzafv)) {
            int iZzB = 0;
            while (i11 < size) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                iZzB += zzael.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return iZzB;
        }
        zzafv zzafvVar = (zzafv) list;
        int iZzB2 = 0;
        while (i11 < size) {
            long jZzd = zzafvVar.zzd(i11);
            iZzB2 += zzael.zzB((jZzd >> 63) ^ (jZzd + jZzd));
            i11++;
        }
        return iZzB2;
    }

    static int zzu(int i11, List list) {
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzz = zzael.zzz(i11) * size;
        if (!(list instanceof zzafo)) {
            while (i12 < size) {
                Object obj = list.get(i12);
                iZzz += obj instanceof zzaed ? zzael.zzt((zzaed) obj) : zzael.zzy((String) obj);
                i12++;
            }
            return iZzz;
        }
        zzafo zzafoVar = (zzafo) list;
        while (i12 < size) {
            Object objZze = zzafoVar.zze(i12);
            iZzz += objZze instanceof zzaed ? zzael.zzt((zzaed) objZze) : zzael.zzy((String) objZze);
            i12++;
        }
        return iZzz;
    }

    static int zzv(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzael.zzz(i11));
    }

    static int zzw(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaez)) {
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzael.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzA;
        }
        zzaez zzaezVar = (zzaez) list;
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzael.zzA(zzaezVar.zzd(i11));
            i11++;
        }
        return iZzA2;
    }

    static int zzx(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzael.zzz(i11));
    }

    static int zzy(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzafv)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzael.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iZzB;
        }
        zzafv zzafvVar = (zzafv) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzael.zzB(zzafvVar.zzd(i11));
            i11++;
        }
        return iZzB2;
    }

    public static zzahi zzz() {
        return zzb;
    }
}
