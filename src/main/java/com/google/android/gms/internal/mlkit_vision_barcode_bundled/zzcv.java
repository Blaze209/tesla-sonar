package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes5.dex */
final class zzcv {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i11, zzcu zzcuVar) throws zzer {
        int iZzj = zzj(bArr, i11, zzcuVar);
        int i12 = zzcuVar.zza;
        if (i12 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - iZzj) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            zzcuVar.zzc = zzdf.zzb;
            return iZzj;
        }
        zzcuVar.zzc = zzdf.zzr(bArr, iZzj, i12);
        return iZzj + i12;
    }

    static int zzb(int i11, byte[] bArr, int i12, int i13, zzed zzedVar, zzef zzefVar, zzgs zzgsVar, zzcu zzcuVar) throws zzer {
        zzdx zzdxVar = zzedVar.zzb;
        zzhf zzhfVar = zzefVar.zzb.zzb;
        Object objValueOf = null;
        if (zzhfVar == zzhf.zzn) {
            zzj(bArr, i12, zzcuVar);
            throw null;
        }
        switch (zzhfVar.ordinal()) {
            case 0:
                i12 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zzq(bArr, i12)));
                break;
            case 1:
                i12 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zzc(bArr, i12)));
                break;
            case 2:
            case 3:
                i12 = zzm(bArr, i12, zzcuVar);
                objValueOf = Long.valueOf(zzcuVar.zzb);
                break;
            case 4:
            case 12:
                i12 = zzj(bArr, i12, zzcuVar);
                objValueOf = Integer.valueOf(zzcuVar.zza);
                break;
            case 5:
            case 15:
                i12 += 8;
                objValueOf = Long.valueOf(zzq(bArr, i12));
                break;
            case 6:
            case 14:
                i12 += 4;
                objValueOf = Integer.valueOf(zzc(bArr, i12));
                break;
            case 7:
                i12 = zzm(bArr, i12, zzcuVar);
                objValueOf = Boolean.valueOf(zzcuVar.zzb != 0);
                break;
            case 8:
                i12 = zzh(bArr, i12, zzcuVar);
                objValueOf = zzcuVar.zzc;
                break;
            case 9:
                int i14 = ((i11 >>> 3) << 3) | 4;
                zzge zzgeVarZzb = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object objZze = zzdxVar.zze(zzefVar.zzb);
                if (objZze == null) {
                    objZze = zzgeVarZzb.zze();
                    zzdxVar.zzi(zzefVar.zzb, objZze);
                }
                return zzn(objZze, zzgeVarZzb, bArr, i12, i13, i14, zzcuVar);
            case 10:
                zzge zzgeVarZzb2 = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object objZze2 = zzdxVar.zze(zzefVar.zzb);
                if (objZze2 == null) {
                    objZze2 = zzgeVarZzb2.zze();
                    zzdxVar.zzi(zzefVar.zzb, objZze2);
                }
                return zzo(objZze2, zzgeVarZzb2, bArr, i12, i13, zzcuVar);
            case 11:
                i12 = zza(bArr, i12, zzcuVar);
                objValueOf = zzcuVar.zzc;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i12 = zzj(bArr, i12, zzcuVar);
                objValueOf = Integer.valueOf(zzdj.zzb(zzcuVar.zza));
                break;
            case 17:
                i12 = zzm(bArr, i12, zzcuVar);
                objValueOf = Long.valueOf(zzdj.zzc(zzcuVar.zzb));
                break;
        }
        zzdxVar.zzi(zzefVar.zzb, objValueOf);
        return i12;
    }

    static int zzc(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    static int zzd(zzge zzgeVar, byte[] bArr, int i11, int i12, int i13, zzcu zzcuVar) throws zzer {
        Object objZze = zzgeVar.zze();
        int iZzn = zzn(objZze, zzgeVar, bArr, i11, i12, i13, zzcuVar);
        zzgeVar.zzf(objZze);
        zzcuVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzge zzgeVar, byte[] bArr, int i11, int i12, zzcu zzcuVar) throws zzer {
        Object objZze = zzgeVar.zze();
        int iZzo = zzo(objZze, zzgeVar, bArr, i11, i12, zzcuVar);
        zzgeVar.zzf(objZze);
        zzcuVar.zzc = objZze;
        return iZzo;
    }

    static int zzf(zzge zzgeVar, int i11, byte[] bArr, int i12, int i13, zzeo zzeoVar, zzcu zzcuVar) throws zzer {
        int iZze = zze(zzgeVar, bArr, i12, i13, zzcuVar);
        zzeoVar.add(zzcuVar.zzc);
        while (iZze < i13) {
            int iZzj = zzj(bArr, iZze, zzcuVar);
            if (i11 != zzcuVar.zza) {
                break;
            }
            iZze = zze(zzgeVar, bArr, iZzj, i13, zzcuVar);
            zzeoVar.add(zzcuVar.zzc);
        }
        return iZze;
    }

    static int zzg(byte[] bArr, int i11, zzeo zzeoVar, zzcu zzcuVar) throws zzer {
        zzei zzeiVar = (zzei) zzeoVar;
        int iZzj = zzj(bArr, i11, zzcuVar);
        int i12 = zzcuVar.zza + iZzj;
        while (iZzj < i12) {
            iZzj = zzj(bArr, iZzj, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        if (iZzj == i12) {
            return iZzj;
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzh(byte[] bArr, int i11, zzcu zzcuVar) throws zzer {
        int iZzj = zzj(bArr, i11, zzcuVar);
        int i12 = zzcuVar.zza;
        if (i12 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zzcuVar.zzc = "";
            return iZzj;
        }
        zzcuVar.zzc = new String(bArr, iZzj, i12, zzep.zza);
        return iZzj + i12;
    }

    static int zzi(int i11, byte[] bArr, int i12, int i13, zzgt zzgtVar, zzcu zzcuVar) throws zzer {
        if ((i11 >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int iZzm = zzm(bArr, i12, zzcuVar);
            zzgtVar.zzj(i11, Long.valueOf(zzcuVar.zzb));
            return iZzm;
        }
        if (i14 == 1) {
            zzgtVar.zzj(i11, Long.valueOf(zzq(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iZzj = zzj(bArr, i12, zzcuVar);
            int i15 = zzcuVar.zza;
            if (i15 < 0) {
                throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - iZzj) {
                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                zzgtVar.zzj(i11, zzdf.zzb);
            } else {
                zzgtVar.zzj(i11, zzdf.zzr(bArr, iZzj, i15));
            }
            return iZzj + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zzer("Protocol message contained an invalid tag (zero).");
            }
            zzgtVar.zzj(i11, Integer.valueOf(zzc(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzgt zzgtVarZzf = zzgt.zzf();
        int i17 = zzcuVar.zze + 1;
        zzcuVar.zze = i17;
        zzr(i17);
        int i18 = 0;
        while (i12 < i13) {
            int iZzj2 = zzj(bArr, i12, zzcuVar);
            int i19 = zzcuVar.zza;
            if (i19 == i16) {
                i18 = i19;
                i12 = iZzj2;
                break;
            }
            i12 = zzi(i19, bArr, iZzj2, i13, zzgtVarZzf, zzcuVar);
            i18 = i19;
        }
        zzcuVar.zze--;
        if (i12 > i13 || i18 != i16) {
            throw new zzer("Failed to parse the message.");
        }
        zzgtVar.zzj(i11, zzgtVarZzf);
        return i12;
    }

    static int zzj(byte[] bArr, int i11, zzcu zzcuVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zzk(b11, bArr, i12, zzcuVar);
        }
        zzcuVar.zza = b11;
        return i12;
    }

    static int zzk(int i11, byte[] bArr, int i12, zzcu zzcuVar) {
        byte b11 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b11 >= 0) {
            zzcuVar.zza = i14 | (b11 << 7);
            return i13;
        }
        int i15 = i14 | ((b11 & 127) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            zzcuVar.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzcuVar.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzcuVar.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & 127) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzcuVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int zzl(int i11, byte[] bArr, int i12, int i13, zzeo zzeoVar, zzcu zzcuVar) {
        zzei zzeiVar = (zzei) zzeoVar;
        int iZzj = zzj(bArr, i12, zzcuVar);
        zzeiVar.zzg(zzcuVar.zza);
        while (iZzj < i13) {
            int iZzj2 = zzj(bArr, iZzj, zzcuVar);
            if (i11 != zzcuVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        return iZzj;
    }

    static int zzm(byte[] bArr, int i11, zzcu zzcuVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzcuVar.zzb = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b11 = bArr[i12];
        long j12 = (j11 & 127) | (((long) (b11 & 127)) << 7);
        int i14 = 7;
        while (b11 < 0) {
            int i15 = i13 + 1;
            byte b12 = bArr[i13];
            i14 += 7;
            j12 |= ((long) (b12 & 127)) << i14;
            b11 = b12;
            i13 = i15;
        }
        zzcuVar.zzb = j12;
        return i13;
    }

    static int zzn(Object obj, zzge zzgeVar, byte[] bArr, int i11, int i12, int i13, zzcu zzcuVar) throws zzer {
        int i14 = zzcuVar.zze + 1;
        zzcuVar.zze = i14;
        zzr(i14);
        int iZzc = ((zzfp) zzgeVar).zzc(obj, bArr, i11, i12, i13, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return iZzc;
    }

    static int zzo(Object obj, zzge zzgeVar, byte[] bArr, int i11, int i12, zzcu zzcuVar) throws zzer {
        int iZzk = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iZzk = zzk(i13, bArr, iZzk, zzcuVar);
            i13 = zzcuVar.zza;
        }
        int i14 = iZzk;
        if (i13 < 0 || i13 > i12 - i14) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = zzcuVar.zze + 1;
        zzcuVar.zze = i15;
        zzr(i15);
        int i16 = i14 + i13;
        zzgeVar.zzh(obj, bArr, i14, i16, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return i16;
    }

    static int zzp(int i11, byte[] bArr, int i12, int i13, zzcu zzcuVar) throws zzer {
        if ((i11 >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return zzm(bArr, i12, zzcuVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return zzj(bArr, i12, zzcuVar) + zzcuVar.zza;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = zzj(bArr, i12, zzcuVar);
            i16 = zzcuVar.zza;
            if (i16 == i15) {
                break;
            }
            i12 = zzp(i16, bArr, i12, i13, zzcuVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw new zzer("Failed to parse the message.");
        }
        return i12;
    }

    static long zzq(byte[] bArr, int i11) {
        return (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    private static void zzr(int i11) throws zzer {
        if (i11 >= zzb) {
            throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
