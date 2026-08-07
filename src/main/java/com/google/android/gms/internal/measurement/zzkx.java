package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes5.dex */
final class zzkx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i11, zzkw zzkwVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zzb(b11, bArr, i12, zzkwVar);
        }
        zzkwVar.zza = b11;
        return i12;
    }

    static int zzb(int i11, byte[] bArr, int i12, zzkw zzkwVar) {
        byte b11 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b11 >= 0) {
            zzkwVar.zza = i14 | (b11 << 7);
            return i13;
        }
        int i15 = i14 | ((b11 & 127) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            zzkwVar.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzkwVar.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzkwVar.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & 127) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzkwVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int zzc(byte[] bArr, int i11, zzkw zzkwVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzkwVar.zzb = j11;
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
        zzkwVar.zzb = j12;
        return i13;
    }

    static int zzd(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    static long zze(byte[] bArr, int i11) {
        return (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    static int zzf(byte[] bArr, int i11, zzkw zzkwVar) throws zzmr {
        int i12;
        int iZza = zza(bArr, i11, zzkwVar);
        int i13 = zzkwVar.zza;
        if (i13 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i13 == 0) {
            zzkwVar.zzc = "";
            return iZza;
        }
        int i14 = zzos.zza;
        int length = bArr.length;
        if ((((length - iZza) - i13) | iZza | i13) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZza), Integer.valueOf(i13)));
        }
        int i15 = iZza + i13;
        char[] cArr = new char[i13];
        int i16 = 0;
        while (iZza < i15) {
            byte b11 = bArr[iZza];
            if (!zzoq.zza(b11)) {
                break;
            }
            iZza++;
            cArr[i16] = (char) b11;
            i16++;
        }
        int i17 = i16;
        while (iZza < i15) {
            int i18 = iZza + 1;
            byte b12 = bArr[iZza];
            if (zzoq.zza(b12)) {
                cArr[i17] = (char) b12;
                i17++;
                iZza = i18;
                while (iZza < i15) {
                    byte b13 = bArr[iZza];
                    if (!zzoq.zza(b13)) {
                        break;
                    }
                    iZza++;
                    cArr[i17] = (char) b13;
                    i17++;
                }
            } else {
                if (b12 < -32) {
                    if (i18 >= i15) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i12 = i17 + 1;
                    iZza += 2;
                    zzoq.zzb(b12, bArr[i18], cArr, i17);
                } else if (b12 < -16) {
                    if (i18 >= i15 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i12 = i17 + 1;
                    int i19 = iZza + 2;
                    iZza += 3;
                    zzoq.zzc(b12, bArr[i18], bArr[i19], cArr, i17);
                } else {
                    if (i18 >= i15 - 2) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    byte b14 = bArr[i18];
                    int i21 = iZza + 3;
                    byte b15 = bArr[iZza + 2];
                    iZza += 4;
                    zzoq.zzd(b12, b14, b15, bArr[i21], cArr, i17);
                    i17 += 2;
                }
                i17 = i12;
            }
        }
        zzkwVar.zzc = new String(cArr, 0, i17);
        return i15;
    }

    static int zzg(byte[] bArr, int i11, zzkw zzkwVar) throws zzmr {
        int iZza = zza(bArr, i11, zzkwVar);
        int i12 = zzkwVar.zza;
        if (i12 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - iZza) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            zzkwVar.zzc = zzlh.zzb;
            return iZza;
        }
        zzkwVar.zzc = zzlh.zzh(bArr, iZza, i12);
        return iZza + i12;
    }

    static int zzh(zznx zznxVar, byte[] bArr, int i11, int i12, zzkw zzkwVar) throws zzmr {
        Object objZza = zznxVar.zza();
        int iZzj = zzj(objZza, zznxVar, bArr, i11, i12, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzj;
    }

    static int zzi(zznx zznxVar, byte[] bArr, int i11, int i12, int i13, zzkw zzkwVar) throws zzmr {
        Object objZza = zznxVar.zza();
        int iZzk = zzk(objZza, zznxVar, bArr, i11, i12, i13, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzk;
    }

    static int zzj(Object obj, zznx zznxVar, byte[] bArr, int i11, int i12, zzkw zzkwVar) throws zzmr {
        int iZzb = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iZzb = zzb(i13, bArr, iZzb, zzkwVar);
            i13 = zzkwVar.zza;
        }
        int i14 = iZzb;
        if (i13 < 0 || i13 > i12 - i14) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = zzkwVar.zze + 1;
        zzkwVar.zze = i15;
        zzq(i15);
        int i16 = i14 + i13;
        zznxVar.zzi(obj, bArr, i14, i16, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return i16;
    }

    static int zzk(Object obj, zznx zznxVar, byte[] bArr, int i11, int i12, int i13, zzkw zzkwVar) throws zzmr {
        int i14 = zzkwVar.zze + 1;
        zzkwVar.zze = i14;
        zzq(i14);
        int iZzh = ((zznp) zznxVar).zzh(obj, bArr, i11, i12, i13, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return iZzh;
    }

    static int zzl(int i11, byte[] bArr, int i12, int i13, zzmo zzmoVar, zzkw zzkwVar) {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i12, zzkwVar);
        zzmgVar.zzh(zzkwVar.zza);
        while (iZza < i13) {
            int iZza2 = zza(bArr, iZza, zzkwVar);
            if (i11 != zzkwVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        return iZza;
    }

    static int zzm(byte[] bArr, int i11, zzmo zzmoVar, zzkw zzkwVar) throws zzmr {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i11, zzkwVar);
        int i12 = zzkwVar.zza + iZza;
        while (iZza < i12) {
            iZza = zza(bArr, iZza, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        if (iZza == i12) {
            return iZza;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(zznx zznxVar, int i11, byte[] bArr, int i12, int i13, zzmo zzmoVar, zzkw zzkwVar) throws zzmr {
        int iZzh = zzh(zznxVar, bArr, i12, i13, zzkwVar);
        zzmoVar.add(zzkwVar.zzc);
        while (iZzh < i13) {
            int iZza = zza(bArr, iZzh, zzkwVar);
            if (i11 != zzkwVar.zza) {
                break;
            }
            iZzh = zzh(zznxVar, bArr, iZza, i13, zzkwVar);
            zzmoVar.add(zzkwVar.zzc);
        }
        return iZzh;
    }

    static int zzo(int i11, byte[] bArr, int i12, int i13, zzoj zzojVar, zzkw zzkwVar) throws zzmr {
        if ((i11 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int iZzc = zzc(bArr, i12, zzkwVar);
            zzojVar.zzk(i11, Long.valueOf(zzkwVar.zzb));
            return iZzc;
        }
        if (i14 == 1) {
            zzojVar.zzk(i11, Long.valueOf(zze(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iZza = zza(bArr, i12, zzkwVar);
            int i15 = zzkwVar.zza;
            if (i15 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - iZza) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                zzojVar.zzk(i11, zzlh.zzb);
            } else {
                zzojVar.zzk(i11, zzlh.zzh(bArr, iZza, i15));
            }
            return iZza + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            zzojVar.zzk(i11, Integer.valueOf(zzd(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzoj zzojVarZzb = zzoj.zzb();
        int i17 = zzkwVar.zze + 1;
        zzkwVar.zze = i17;
        zzq(i17);
        int i18 = 0;
        while (i12 < i13) {
            int iZza2 = zza(bArr, i12, zzkwVar);
            int i19 = zzkwVar.zza;
            if (i19 == i16) {
                i18 = i19;
                i12 = iZza2;
                break;
            }
            i12 = zzo(i19, bArr, iZza2, i13, zzojVarZzb, zzkwVar);
            i18 = i19;
        }
        zzkwVar.zze--;
        if (i12 > i13 || i18 != i16) {
            throw new zzmr("Failed to parse the message.");
        }
        zzojVar.zzk(i11, zzojVarZzb);
        return i12;
    }

    static int zzp(int i11, byte[] bArr, int i12, int i13, zzkw zzkwVar) throws zzmr {
        if ((i11 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return zzc(bArr, i12, zzkwVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return zza(bArr, i12, zzkwVar) + zzkwVar.zza;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = zza(bArr, i12, zzkwVar);
            i16 = zzkwVar.zza;
            if (i16 == i15) {
                break;
            }
            i12 = zzp(i16, bArr, i12, i13, zzkwVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw new zzmr("Failed to parse the message.");
        }
        return i12;
    }

    private static void zzq(int i11) throws zzmr {
        if (i11 >= zzb) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
