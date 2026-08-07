package com.google.android.libraries.places.internal;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zzagj<T> implements zzagr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzahs.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzagg zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final zzafu zzj;
    private final zzahi zzk;
    private final zzaeo zzl;
    private final zzagl zzm;
    private final zzagb zzn;

    private zzagj(int[] iArr, Object[] objArr, int i11, int i12, zzagg zzaggVar, boolean z11, boolean z12, int[] iArr2, int i13, int i14, zzagl zzaglVar, zzafu zzafuVar, zzahi zzahiVar, zzaeo zzaeoVar, zzagb zzagbVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzg = z11;
        boolean z13 = false;
        if (zzaeoVar != null && zzaeoVar.zzc(zzaggVar)) {
            z13 = true;
        }
        this.zzf = z13;
        this.zzh = iArr2;
        this.zzi = i13;
        this.zzm = zzaglVar;
        this.zzj = zzafuVar;
        this.zzk = zzahiVar;
        this.zzl = zzaeoVar;
        this.zze = zzaggVar;
        this.zzn = zzagbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzA(Object obj, zzahz zzahzVar) {
        int i11;
        boolean z11;
        if (this.zzf) {
            this.zzl.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iZzr = zzr(i14);
            int[] iArr = this.zzc;
            int i16 = iArr[i14];
            int iZzq = zzq(iZzr);
            if (iZzq <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i11 = 0;
            }
            long j11 = iZzr & i12;
            switch (iZzq) {
                case 0:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzf(i16, zzahs.zza(obj, j11));
                    }
                    break;
                case 1:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzn(i16, zzahs.zzb(obj, j11));
                    }
                    break;
                case 2:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzs(i16, unsafe.getLong(obj, j11));
                    }
                    break;
                case 3:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzH(i16, unsafe.getLong(obj, j11));
                    }
                    break;
                case 4:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzq(i16, unsafe.getInt(obj, j11));
                    }
                    break;
                case 5:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzl(i16, unsafe.getLong(obj, j11));
                    }
                    break;
                case 6:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzj(i16, unsafe.getInt(obj, j11));
                    }
                    break;
                case 7:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzb(i16, zzahs.zzw(obj, j11));
                    }
                    break;
                case 8:
                    if ((i15 & i11) != 0) {
                        zzJ(i16, unsafe.getObject(obj, j11), zzahzVar);
                    }
                    break;
                case 9:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzu(i16, unsafe.getObject(obj, j11), zzt(i14));
                    }
                    break;
                case 10:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzd(i16, (zzaed) unsafe.getObject(obj, j11));
                    }
                    break;
                case 11:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzF(i16, unsafe.getInt(obj, j11));
                    }
                    break;
                case 12:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzh(i16, unsafe.getInt(obj, j11));
                    }
                    break;
                case 13:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzv(i16, unsafe.getInt(obj, j11));
                    }
                    break;
                case 14:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzx(i16, unsafe.getLong(obj, j11));
                    }
                    break;
                case 15:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzz(i16, unsafe.getInt(obj, j11));
                    }
                    break;
                case 16:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzB(i16, unsafe.getLong(obj, j11));
                    }
                    break;
                case 17:
                    if ((i15 & i11) != 0) {
                        zzahzVar.zzp(i16, unsafe.getObject(obj, j11), zzt(i14));
                    }
                    break;
                case 18:
                    zzagt.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 19:
                    zzagt.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 20:
                    zzagt.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 21:
                    zzagt.zzW(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 22:
                    zzagt.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 23:
                    zzagt.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 24:
                    zzagt.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 25:
                    zzagt.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 26:
                    zzagt.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar);
                    break;
                case 27:
                    zzagt.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, zzt(i14));
                    break;
                case 28:
                    zzagt.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar);
                    break;
                case 29:
                    z11 = false;
                    zzagt.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 30:
                    z11 = false;
                    zzagt.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 31:
                    z11 = false;
                    zzagt.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 32:
                    z11 = false;
                    zzagt.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 33:
                    z11 = false;
                    zzagt.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 34:
                    z11 = false;
                    zzagt.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                    break;
                case 35:
                    zzagt.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 36:
                    zzagt.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 37:
                    zzagt.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 38:
                    zzagt.zzW(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 39:
                    zzagt.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 40:
                    zzagt.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 41:
                    zzagt.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 42:
                    zzagt.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 43:
                    zzagt.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 44:
                    zzagt.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 45:
                    zzagt.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 46:
                    zzagt.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 47:
                    zzagt.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 48:
                    zzagt.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                    break;
                case 49:
                    zzagt.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, zzt(i14));
                    break;
                case 50:
                    zzB(zzahzVar, i16, unsafe.getObject(obj, j11), i14);
                    break;
                case 51:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzf(i16, zzk(obj, j11));
                    }
                    break;
                case 52:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzn(i16, zzl(obj, j11));
                    }
                    break;
                case 53:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzs(i16, zzs(obj, j11));
                    }
                    break;
                case 54:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzH(i16, zzs(obj, j11));
                    }
                    break;
                case 55:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzq(i16, zzo(obj, j11));
                    }
                    break;
                case 56:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzl(i16, zzs(obj, j11));
                    }
                    break;
                case 57:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzj(i16, zzo(obj, j11));
                    }
                    break;
                case 58:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzb(i16, zzI(obj, j11));
                    }
                    break;
                case 59:
                    if (zzH(obj, i16, i14)) {
                        zzJ(i16, unsafe.getObject(obj, j11), zzahzVar);
                    }
                    break;
                case 60:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzu(i16, unsafe.getObject(obj, j11), zzt(i14));
                    }
                    break;
                case 61:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzd(i16, (zzaed) unsafe.getObject(obj, j11));
                    }
                    break;
                case 62:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzF(i16, zzo(obj, j11));
                    }
                    break;
                case 63:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzh(i16, zzo(obj, j11));
                    }
                    break;
                case 64:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzv(i16, zzo(obj, j11));
                    }
                    break;
                case 65:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzx(i16, zzs(obj, j11));
                    }
                    break;
                case 66:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzz(i16, zzo(obj, j11));
                    }
                    break;
                case 67:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzB(i16, zzs(obj, j11));
                    }
                    break;
                case 68:
                    if (zzH(obj, i16, i14)) {
                        zzahzVar.zzp(i16, unsafe.getObject(obj, j11), zzt(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        zzahi zzahiVar = this.zzk;
        zzahiVar.zzg(zzahiVar.zzc(obj), zzahzVar);
    }

    private final void zzB(zzahz zzahzVar, int i11, Object obj, int i12) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzC(Object obj, Object obj2, int i11) {
        return zzD(obj, i11) == zzD(obj2, i11);
    }

    private final boolean zzD(Object obj, int i11) {
        int iZzp = zzp(i11);
        long j11 = iZzp & 1048575;
        if (j11 != 1048575) {
            return (zzahs.zzc(obj, j11) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzr = zzr(i11);
        long j12 = iZzr & 1048575;
        switch (zzq(iZzr)) {
            case 0:
                return Double.doubleToRawLongBits(zzahs.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzahs.zzb(obj, j12)) != 0;
            case 2:
                return zzahs.zzd(obj, j12) != 0;
            case 3:
                return zzahs.zzd(obj, j12) != 0;
            case 4:
                return zzahs.zzc(obj, j12) != 0;
            case 5:
                return zzahs.zzd(obj, j12) != 0;
            case 6:
                return zzahs.zzc(obj, j12) != 0;
            case 7:
                return zzahs.zzw(obj, j12);
            case 8:
                Object objZzf = zzahs.zzf(obj, j12);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzaed) {
                    return !zzaed.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzahs.zzf(obj, j12) != null;
            case 10:
                return !zzaed.zzb.equals(zzahs.zzf(obj, j12));
            case 11:
                return zzahs.zzc(obj, j12) != 0;
            case 12:
                return zzahs.zzc(obj, j12) != 0;
            case 13:
                return zzahs.zzc(obj, j12) != 0;
            case 14:
                return zzahs.zzd(obj, j12) != 0;
            case 15:
                return zzahs.zzc(obj, j12) != 0;
            case 16:
                return zzahs.zzd(obj, j12) != 0;
            case 17:
                return zzahs.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzE(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return zzD(obj, i11);
        }
        return (i13 & i14) != 0;
    }

    private static boolean zzF(Object obj, int i11, zzagr zzagrVar) {
        return zzagrVar.zzh(zzahs.zzf(obj, i11 & 1048575));
    }

    private static boolean zzG(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaey) {
            return ((zzaey) obj).zzL();
        }
        return true;
    }

    private final boolean zzH(Object obj, int i11, int i12) {
        return zzahs.zzc(obj, (long) (zzp(i12) & 1048575)) == i11;
    }

    private static boolean zzI(Object obj, long j11) {
        return ((Boolean) zzahs.zzf(obj, j11)).booleanValue();
    }

    private static final void zzJ(int i11, Object obj, zzahz zzahzVar) {
        if (obj instanceof String) {
            zzahzVar.zzD(i11, (String) obj);
        } else {
            zzahzVar.zzd(i11, (zzaed) obj);
        }
    }

    static zzagj zzi(Class cls, zzagd zzagdVar, zzagl zzaglVar, zzafu zzafuVar, zzahi zzahiVar, zzaeo zzaeoVar, zzagb zzagbVar) {
        if (zzagdVar instanceof zzagq) {
            return zzj((zzagq) zzagdVar, zzaglVar, zzafuVar, zzahiVar, zzaeoVar, zzagbVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0263  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:129:0x027e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0375  */
    /* JADX WARN: Code duplicated, block: B:184:0x038c  */
    static zzagj zzj(zzagq zzagqVar, zzagl zzaglVar, zzafu zzafuVar, zzahi zzahiVar, zzaeo zzaeoVar, zzagb zzagbVar) {
        int i11;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int i27;
        int i28;
        int i29;
        Field fieldZzv;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldZzv2;
        int i34;
        Object obj2;
        Field fieldZzv3;
        int i35;
        char cCharAt10;
        int i36;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        boolean z11 = zzagqVar.zzc() == 2;
        String strZzd = zzagqVar.zzd();
        int length = strZzd.length();
        char c11 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i11 = i41 + 1;
                if (strZzd.charAt(i41) < 55296) {
                    break;
                }
                i41 = i11;
            }
        } else {
            i11 = 1;
        }
        int i42 = i11 + 1;
        int iCharAt5 = strZzd.charAt(i11);
        if (iCharAt5 >= 55296) {
            int i43 = iCharAt5 & 8191;
            int i44 = 13;
            while (true) {
                i39 = i42 + 1;
                cCharAt13 = strZzd.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i39;
            }
            iCharAt5 = i43 | (cCharAt13 << i44);
            i42 = i39;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i13 = 0;
            iCharAt4 = 0;
            i12 = 0;
            iArr = zza;
            i14 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt8 = strZzd.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt6 = i46 | (cCharAt8 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt7 = strZzd.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i51 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt7 = strZzd.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i51;
                    i51 += 13;
                    i48 = i22;
                }
                iCharAt7 = i49 | (cCharAt7 << i51);
                i48 = i22;
            }
            int i52 = i48 + 1;
            iCharAt = strZzd.charAt(i48);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i21 = i52 + 1;
                    cCharAt6 = strZzd.charAt(i52);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i21;
                }
                iCharAt = i53 | (cCharAt6 << i54);
                i52 = i21;
            }
            int i55 = i52 + 1;
            iCharAt2 = strZzd.charAt(i52);
            if (iCharAt2 >= 55296) {
                int i56 = iCharAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i19 = i55 + 1;
                    cCharAt5 = strZzd.charAt(i55);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i19;
                }
                iCharAt2 = i56 | (cCharAt5 << i57);
                i55 = i19;
            }
            int i58 = i55 + 1;
            iCharAt3 = strZzd.charAt(i55);
            if (iCharAt3 >= 55296) {
                int i59 = iCharAt3 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i58 + 1;
                    cCharAt4 = strZzd.charAt(i58);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt4 & 8191) << i61;
                    i61 += 13;
                    i58 = i18;
                }
                iCharAt3 = i59 | (cCharAt4 << i61);
                i58 = i18;
            }
            int i62 = i58 + 1;
            int iCharAt8 = strZzd.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    cCharAt3 = strZzd.charAt(i62);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                iCharAt8 = i63 | (cCharAt3 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strZzd.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    cCharAt2 = strZzd.charAt(i65);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                iCharAt9 = i66 | (cCharAt2 << i67);
                i65 = i16;
            }
            int i68 = i65 + 1;
            iCharAt4 = strZzd.charAt(i65);
            if (iCharAt4 >= 55296) {
                int i69 = iCharAt4 & 8191;
                int i71 = 13;
                while (true) {
                    i15 = i68 + 1;
                    cCharAt = strZzd.charAt(i68);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i69 |= (cCharAt & 8191) << i71;
                    i71 += 13;
                    i68 = i15;
                }
                iCharAt4 = i69 | (cCharAt << i71);
                i68 = i15;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i12 = iCharAt6 + iCharAt6 + iCharAt7;
            i13 = iCharAt8;
            iArr = iArr2;
            i14 = iCharAt6;
            i42 = i68;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzagqVar.zze();
        Class<?> cls = zzagqVar.zza().getClass();
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 + iCharAt3];
        int i72 = i13 + iCharAt4;
        int i73 = i72;
        int i74 = iCharAt4;
        int i75 = 0;
        int i76 = 0;
        while (i42 < length) {
            int i77 = i42 + 1;
            int iCharAt10 = strZzd.charAt(i42);
            if (iCharAt10 >= c11) {
                int i78 = iCharAt10 & 8191;
                int i79 = i77;
                int i81 = 13;
                while (true) {
                    i38 = i79 + 1;
                    cCharAt12 = strZzd.charAt(i79);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i78 |= (cCharAt12 & 8191) << i81;
                    i81 += 13;
                    i79 = i38;
                }
                iCharAt10 = i78 | (cCharAt12 << i81);
                i24 = i38;
            } else {
                i24 = i77;
            }
            int i82 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c11) {
                int i83 = iCharAt11 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i37 = i84 + 1;
                    cCharAt11 = strZzd.charAt(i84);
                    i25 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i83 |= (cCharAt11 & 8191) << i85;
                    i85 += 13;
                    i84 = i37;
                    length = i25;
                }
                iCharAt11 = i83 | (cCharAt11 << i85);
                i26 = i37;
            } else {
                i25 = length;
                i26 = i82;
            }
            int i86 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i76] = i75;
                i76++;
            }
            if (i86 >= 51) {
                int i87 = i26 + 1;
                int iCharAt12 = strZzd.charAt(i26);
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = i87;
                    int i91 = 13;
                    while (true) {
                        i35 = i89 + 1;
                        cCharAt10 = strZzd.charAt(i89);
                        i36 = i88;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i88 = i36 | ((cCharAt10 & 8191) << i91);
                        i91 += 13;
                        i89 = i35;
                    }
                    iCharAt12 = i36 | (cCharAt10 << i91);
                    i31 = i35;
                } else {
                    i31 = i87;
                }
                int i92 = iCharAt12;
                int i93 = i86 - 51;
                int i94 = i31;
                if (i93 == 9 || i93 == 17) {
                    int i95 = i75 / 3;
                    i32 = i12 + 1;
                    objArr[i95 + i95 + 1] = objArrZze[i12];
                } else {
                    if (i93 == 12 && !z11) {
                        int i96 = i75 / 3;
                        i32 = i12 + 1;
                        objArr[i96 + i96 + 1] = objArrZze[i12];
                    }
                    i33 = i92 + i92;
                    obj = objArrZze[i33];
                    if (obj instanceof Field) {
                        fieldZzv2 = (Field) obj;
                    } else {
                        fieldZzv2 = zzv(cls, (String) obj);
                        objArrZze[i33] = fieldZzv2;
                    }
                    int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv2);
                    i34 = i33 + 1;
                    obj2 = objArrZze[i34];
                    if (obj2 instanceof Field) {
                        fieldZzv3 = (Field) obj2;
                    } else {
                        fieldZzv3 = zzv(cls, (String) obj2);
                        objArrZze[i34] = fieldZzv3;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv3);
                    i28 = iObjectFieldOffset2;
                    strZzd = strZzd;
                    i42 = i94;
                    i27 = 0;
                }
                i12 = i32;
                i33 = i92 + i92;
                obj = objArrZze[i33];
                if (obj instanceof Field) {
                    fieldZzv2 = (Field) obj;
                } else {
                    fieldZzv2 = zzv(cls, (String) obj);
                    objArrZze[i33] = fieldZzv2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzv2);
                i34 = i33 + 1;
                obj2 = objArrZze[i34];
                if (obj2 instanceof Field) {
                    fieldZzv3 = (Field) obj2;
                } else {
                    fieldZzv3 = zzv(cls, (String) obj2);
                    objArrZze[i34] = fieldZzv3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv3);
                i28 = iObjectFieldOffset3;
                strZzd = strZzd;
                i42 = i94;
                i27 = 0;
            } else {
                int i97 = i12 + 1;
                Field fieldZzv4 = zzv(cls, (String) objArrZze[i12]);
                if (i86 == 9 || i86 == 17) {
                    int i98 = i75 / 3;
                    objArr[i98 + i98 + 1] = fieldZzv4.getType();
                } else {
                    if (i86 == 27 || i86 == 49) {
                        int i99 = i75 / 3;
                        i12 += 2;
                        objArr[i99 + i99 + 1] = objArrZze[i97];
                    } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                        if (!z11) {
                            int i100 = i75 / 3;
                            i12 += 2;
                            objArr[i100 + i100 + 1] = objArrZze[i97];
                        }
                    } else if (i86 == 50) {
                        int i101 = i74 + 1;
                        iArr[i74] = i75;
                        int i102 = i75 / 3;
                        int i103 = i102 + i102;
                        int i104 = i12 + 2;
                        objArr[i103] = objArrZze[i97];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i103 + 1] = objArrZze[i104];
                            i12 += 3;
                        } else {
                            i12 = i104;
                        }
                        i74 = i101;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzv4);
                    iObjectFieldOffset = 1048575;
                    if ((iCharAt11 & 4096) == 4096 || i86 > 17) {
                        i42 = i26;
                        i27 = 0;
                    } else {
                        int i105 = i26 + 1;
                        int iCharAt13 = strZzd.charAt(i26);
                        if (iCharAt13 >= 55296) {
                            int i106 = iCharAt13 & 8191;
                            int i107 = 13;
                            while (true) {
                                i29 = i105 + 1;
                                cCharAt9 = strZzd.charAt(i105);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i106 |= (cCharAt9 & 8191) << i107;
                                i107 += 13;
                                i105 = i29;
                            }
                            iCharAt13 = i106 | (cCharAt9 << i107);
                        } else {
                            i29 = i105;
                        }
                        int i108 = i14 + i14 + (iCharAt13 / 32);
                        Object obj3 = objArrZze[i108];
                        if (obj3 instanceof Field) {
                            fieldZzv = (Field) obj3;
                        } else {
                            fieldZzv = zzv(cls, (String) obj3);
                            objArrZze[i108] = fieldZzv;
                        }
                        i27 = iCharAt13 % 32;
                        int i109 = i29;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv);
                        i42 = i109;
                    }
                    if (i86 < 18 && i86 <= 49) {
                        iArr[i73] = iObjectFieldOffset4;
                        i73++;
                    }
                    i28 = iObjectFieldOffset4;
                }
                i12 = i97;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzv4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 4096) {
                    i42 = i26;
                    i27 = 0;
                } else {
                    i42 = i26;
                    i27 = 0;
                }
                if (i86 < 18) {
                }
                i28 = iObjectFieldOffset5;
            }
            int i110 = i75 + 1;
            iArr4[i75] = iCharAt10;
            int i111 = i75 + 2;
            int i112 = i27;
            iArr4[i110] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i86 << 20) | i28;
            i75 += 3;
            iArr4[i111] = (i112 << 20) | iObjectFieldOffset;
            iArr3 = iArr4;
            length = i25;
            strZzd = strZzd;
            c11 = 55296;
        }
        return new zzagj(iArr3, objArr, iCharAt, iCharAt2, zzagqVar.zza(), z11, false, iArr, iCharAt4, i72, zzaglVar, zzafuVar, zzahiVar, zzaeoVar, zzagbVar, null);
    }

    private static double zzk(Object obj, long j11) {
        return ((Double) zzahs.zzf(obj, j11)).doubleValue();
    }

    private static float zzl(Object obj, long j11) {
        return ((Float) zzahs.zzf(obj, j11)).floatValue();
    }

    private final int zzm(Object obj) {
        int i11;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i12;
        Unsafe unsafe = zzb;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        for (int i16 = 0; i16 < this.zzc.length; i16 += 3) {
            int iZzr = zzr(i16);
            int[] iArr = this.zzc;
            int i17 = iArr[i16];
            int iZzq = zzq(iZzr);
            if (iZzq <= 17) {
                int i18 = iArr[i16 + 2];
                int i19 = i18 & 1048575;
                i11 = 1 << (i18 >>> 20);
                if (i19 != i15) {
                    i14 = unsafe.getInt(obj, i19);
                    i15 = i19;
                }
            } else {
                i11 = 0;
            }
            long j11 = iZzr & 1048575;
            switch (iZzq) {
                case 0:
                    if ((i14 & i11) != 0) {
                        iZzA = zzael.zzA(i17 << 3);
                        iZzo = iZzA + 8;
                        i13 += iZzo;
                    }
                    break;
                case 1:
                    if ((i14 & i11) != 0) {
                        iZzA2 = zzael.zzA(i17 << 3);
                        iZzo = iZzA2 + 4;
                        i13 += iZzo;
                    }
                    break;
                case 2:
                    if ((i14 & i11) != 0) {
                        long j12 = unsafe.getLong(obj, j11);
                        iZzA3 = zzael.zzA(i17 << 3);
                        iZzB = zzael.zzB(j12);
                        i13 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if ((i14 & i11) != 0) {
                        long j13 = unsafe.getLong(obj, j11);
                        iZzA3 = zzael.zzA(i17 << 3);
                        iZzB = zzael.zzB(j13);
                        i13 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if ((i14 & i11) != 0) {
                        int i21 = unsafe.getInt(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzv(i21);
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 5:
                    if ((i14 & i11) != 0) {
                        iZzA = zzael.zzA(i17 << 3);
                        iZzo = iZzA + 8;
                        i13 += iZzo;
                    }
                    break;
                case 6:
                    if ((i14 & i11) != 0) {
                        iZzA2 = zzael.zzA(i17 << 3);
                        iZzo = iZzA2 + 4;
                        i13 += iZzo;
                    }
                    break;
                case 7:
                    if ((i14 & i11) != 0) {
                        iZzA5 = zzael.zzA(i17 << 3);
                        iZzo = iZzA5 + 1;
                        i13 += iZzo;
                    }
                    break;
                case 8:
                    if ((i14 & i11) != 0) {
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof zzaed) {
                            iZzA6 = zzael.zzA(i17 << 3);
                            iZzd = ((zzaed) object).zzd();
                            iZzA7 = zzael.zzA(iZzd);
                            i12 = iZzA6 + iZzA7 + iZzd;
                            i13 += i12;
                        } else {
                            iZzA4 = zzael.zzA(i17 << 3);
                            iZzv = zzael.zzy((String) object);
                            i12 = iZzA4 + iZzv;
                            i13 += i12;
                        }
                    }
                    break;
                case 9:
                    if ((i14 & i11) != 0) {
                        iZzo = zzagt.zzo(i17, unsafe.getObject(obj, j11), zzt(i16));
                        i13 += iZzo;
                    }
                    break;
                case 10:
                    if ((i14 & i11) != 0) {
                        zzaed zzaedVar = (zzaed) unsafe.getObject(obj, j11);
                        iZzA6 = zzael.zzA(i17 << 3);
                        iZzd = zzaedVar.zzd();
                        iZzA7 = zzael.zzA(iZzd);
                        i12 = iZzA6 + iZzA7 + iZzd;
                        i13 += i12;
                    }
                    break;
                case 11:
                    if ((i14 & i11) != 0) {
                        int i22 = unsafe.getInt(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzA(i22);
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 12:
                    if ((i14 & i11) != 0) {
                        int i23 = unsafe.getInt(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzv(i23);
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 13:
                    if ((i14 & i11) != 0) {
                        iZzA2 = zzael.zzA(i17 << 3);
                        iZzo = iZzA2 + 4;
                        i13 += iZzo;
                    }
                    break;
                case 14:
                    if ((i14 & i11) != 0) {
                        iZzA = zzael.zzA(i17 << 3);
                        iZzo = iZzA + 8;
                        i13 += iZzo;
                    }
                    break;
                case 15:
                    if ((i14 & i11) != 0) {
                        int i24 = unsafe.getInt(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzA((i24 >> 31) ^ (i24 + i24));
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 16:
                    if ((i11 & i14) != 0) {
                        long j14 = unsafe.getLong(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzB((j14 >> 63) ^ (j14 + j14));
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 17:
                    if ((i14 & i11) != 0) {
                        iZzo = zzael.zzu(i17, (zzagg) unsafe.getObject(obj, j11), zzt(i16));
                        i13 += iZzo;
                    }
                    break;
                case 18:
                    iZzo = zzagt.zzh(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 19:
                    iZzo = zzagt.zzf(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 20:
                    iZzo = zzagt.zzm(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 21:
                    iZzo = zzagt.zzx(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 22:
                    iZzo = zzagt.zzk(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 23:
                    iZzo = zzagt.zzh(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 24:
                    iZzo = zzagt.zzf(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 25:
                    iZzo = zzagt.zza(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 26:
                    iZzo = zzagt.zzu(i17, (List) unsafe.getObject(obj, j11));
                    i13 += iZzo;
                    break;
                case 27:
                    iZzo = zzagt.zzp(i17, (List) unsafe.getObject(obj, j11), zzt(i16));
                    i13 += iZzo;
                    break;
                case 28:
                    iZzo = zzagt.zzc(i17, (List) unsafe.getObject(obj, j11));
                    i13 += iZzo;
                    break;
                case 29:
                    iZzo = zzagt.zzv(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 30:
                    iZzo = zzagt.zzd(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 31:
                    iZzo = zzagt.zzf(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 32:
                    iZzo = zzagt.zzh(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 33:
                    iZzo = zzagt.zzq(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 34:
                    iZzo = zzagt.zzs(i17, (List) unsafe.getObject(obj, j11), false);
                    i13 += iZzo;
                    break;
                case 35:
                    iZzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 36:
                    iZzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 37:
                    iZzv = zzagt.zzn((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 38:
                    iZzv = zzagt.zzy((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 39:
                    iZzv = zzagt.zzl((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 40:
                    iZzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 41:
                    iZzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 42:
                    iZzv = zzagt.zzb((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 43:
                    iZzv = zzagt.zzw((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 44:
                    iZzv = zzagt.zze((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 45:
                    iZzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 46:
                    iZzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 47:
                    iZzv = zzagt.zzr((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 48:
                    iZzv = zzagt.zzt((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i17);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 49:
                    iZzo = zzagt.zzj(i17, (List) unsafe.getObject(obj, j11), zzt(i16));
                    i13 += iZzo;
                    break;
                case 50:
                    zzagb.zza(i17, unsafe.getObject(obj, j11), zzu(i16));
                    break;
                case 51:
                    if (zzH(obj, i17, i16)) {
                        iZzA = zzael.zzA(i17 << 3);
                        iZzo = iZzA + 8;
                        i13 += iZzo;
                    }
                    break;
                case 52:
                    if (zzH(obj, i17, i16)) {
                        iZzA2 = zzael.zzA(i17 << 3);
                        iZzo = iZzA2 + 4;
                        i13 += iZzo;
                    }
                    break;
                case 53:
                    if (zzH(obj, i17, i16)) {
                        long jZzs = zzs(obj, j11);
                        iZzA3 = zzael.zzA(i17 << 3);
                        iZzB = zzael.zzB(jZzs);
                        i13 += iZzA3 + iZzB;
                    }
                    break;
                case 54:
                    if (zzH(obj, i17, i16)) {
                        long jZzs2 = zzs(obj, j11);
                        iZzA3 = zzael.zzA(i17 << 3);
                        iZzB = zzael.zzB(jZzs2);
                        i13 += iZzA3 + iZzB;
                    }
                    break;
                case 55:
                    if (zzH(obj, i17, i16)) {
                        int iZzo2 = zzo(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzv(iZzo2);
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 56:
                    if (zzH(obj, i17, i16)) {
                        iZzA = zzael.zzA(i17 << 3);
                        iZzo = iZzA + 8;
                        i13 += iZzo;
                    }
                    break;
                case 57:
                    if (zzH(obj, i17, i16)) {
                        iZzA2 = zzael.zzA(i17 << 3);
                        iZzo = iZzA2 + 4;
                        i13 += iZzo;
                    }
                    break;
                case 58:
                    if (zzH(obj, i17, i16)) {
                        iZzA5 = zzael.zzA(i17 << 3);
                        iZzo = iZzA5 + 1;
                        i13 += iZzo;
                    }
                    break;
                case 59:
                    if (zzH(obj, i17, i16)) {
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof zzaed) {
                            iZzA6 = zzael.zzA(i17 << 3);
                            iZzd = ((zzaed) object2).zzd();
                            iZzA7 = zzael.zzA(iZzd);
                            i12 = iZzA6 + iZzA7 + iZzd;
                            i13 += i12;
                        } else {
                            iZzA4 = zzael.zzA(i17 << 3);
                            iZzv = zzael.zzy((String) object2);
                            i12 = iZzA4 + iZzv;
                            i13 += i12;
                        }
                    }
                    break;
                case 60:
                    if (zzH(obj, i17, i16)) {
                        iZzo = zzagt.zzo(i17, unsafe.getObject(obj, j11), zzt(i16));
                        i13 += iZzo;
                    }
                    break;
                case 61:
                    if (zzH(obj, i17, i16)) {
                        zzaed zzaedVar2 = (zzaed) unsafe.getObject(obj, j11);
                        iZzA6 = zzael.zzA(i17 << 3);
                        iZzd = zzaedVar2.zzd();
                        iZzA7 = zzael.zzA(iZzd);
                        i12 = iZzA6 + iZzA7 + iZzd;
                        i13 += i12;
                    }
                    break;
                case 62:
                    if (zzH(obj, i17, i16)) {
                        int iZzo3 = zzo(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzA(iZzo3);
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 63:
                    if (zzH(obj, i17, i16)) {
                        int iZzo4 = zzo(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzv(iZzo4);
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 64:
                    if (zzH(obj, i17, i16)) {
                        iZzA2 = zzael.zzA(i17 << 3);
                        iZzo = iZzA2 + 4;
                        i13 += iZzo;
                    }
                    break;
                case 65:
                    if (zzH(obj, i17, i16)) {
                        iZzA = zzael.zzA(i17 << 3);
                        iZzo = iZzA + 8;
                        i13 += iZzo;
                    }
                    break;
                case 66:
                    if (zzH(obj, i17, i16)) {
                        int iZzo5 = zzo(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzA((iZzo5 >> 31) ^ (iZzo5 + iZzo5));
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 67:
                    if (zzH(obj, i17, i16)) {
                        long jZzs3 = zzs(obj, j11);
                        iZzA4 = zzael.zzA(i17 << 3);
                        iZzv = zzael.zzB((jZzs3 >> 63) ^ (jZzs3 + jZzs3));
                        i12 = iZzA4 + iZzv;
                        i13 += i12;
                    }
                    break;
                case 68:
                    if (zzH(obj, i17, i16)) {
                        iZzo = zzael.zzu(i17, (zzagg) unsafe.getObject(obj, j11), zzt(i16));
                        i13 += iZzo;
                    }
                    break;
            }
        }
        zzahi zzahiVar = this.zzk;
        int iZza = i13 + zzahiVar.zza(zzahiVar.zzc(obj));
        if (!this.zzf) {
            return iZza;
        }
        this.zzl.zza(obj);
        throw null;
    }

    private final int zzn(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i11;
        Unsafe unsafe = zzb;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int iZzr = zzr(i13);
            int iZzq = zzq(iZzr);
            int i14 = this.zzc[i13];
            long j11 = iZzr & 1048575;
            if (iZzq >= zzaet.zzJ.zza() && iZzq <= zzaet.zzW.zza()) {
                int i15 = this.zzc[i13 + 2];
            }
            switch (iZzq) {
                case 0:
                    if (zzD(obj, i13)) {
                        iZzA = zzael.zzA(i14 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                    }
                    break;
                case 1:
                    if (zzD(obj, i13)) {
                        iZzA2 = zzael.zzA(i14 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                    }
                    break;
                case 2:
                    if (zzD(obj, i13)) {
                        long jZzd = zzahs.zzd(obj, j11);
                        iZzA3 = zzael.zzA(i14 << 3);
                        iZzB = zzael.zzB(jZzd);
                        i12 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if (zzD(obj, i13)) {
                        long jZzd2 = zzahs.zzd(obj, j11);
                        iZzA3 = zzael.zzA(i14 << 3);
                        iZzB = zzael.zzB(jZzd2);
                        i12 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if (zzD(obj, i13)) {
                        int iZzc = zzahs.zzc(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzv(iZzc);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 5:
                    if (zzD(obj, i13)) {
                        iZzA = zzael.zzA(i14 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                    }
                    break;
                case 6:
                    if (zzD(obj, i13)) {
                        iZzA2 = zzael.zzA(i14 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                    }
                    break;
                case 7:
                    if (zzD(obj, i13)) {
                        iZzA5 = zzael.zzA(i14 << 3);
                        iZzo = iZzA5 + 1;
                        i12 += iZzo;
                    }
                    break;
                case 8:
                    if (zzD(obj, i13)) {
                        Object objZzf = zzahs.zzf(obj, j11);
                        if (objZzf instanceof zzaed) {
                            iZzA6 = zzael.zzA(i14 << 3);
                            iZzd = ((zzaed) objZzf).zzd();
                            iZzA7 = zzael.zzA(iZzd);
                            i11 = iZzA6 + iZzA7 + iZzd;
                            i12 += i11;
                        } else {
                            iZzA4 = zzael.zzA(i14 << 3);
                            iZzv = zzael.zzy((String) objZzf);
                            i11 = iZzA4 + iZzv;
                            i12 += i11;
                        }
                    }
                    break;
                case 9:
                    if (zzD(obj, i13)) {
                        iZzo = zzagt.zzo(i14, zzahs.zzf(obj, j11), zzt(i13));
                        i12 += iZzo;
                    }
                    break;
                case 10:
                    if (zzD(obj, i13)) {
                        zzaed zzaedVar = (zzaed) zzahs.zzf(obj, j11);
                        iZzA6 = zzael.zzA(i14 << 3);
                        iZzd = zzaedVar.zzd();
                        iZzA7 = zzael.zzA(iZzd);
                        i11 = iZzA6 + iZzA7 + iZzd;
                        i12 += i11;
                    }
                    break;
                case 11:
                    if (zzD(obj, i13)) {
                        int iZzc2 = zzahs.zzc(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzA(iZzc2);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 12:
                    if (zzD(obj, i13)) {
                        int iZzc3 = zzahs.zzc(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzv(iZzc3);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 13:
                    if (zzD(obj, i13)) {
                        iZzA2 = zzael.zzA(i14 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                    }
                    break;
                case 14:
                    if (zzD(obj, i13)) {
                        iZzA = zzael.zzA(i14 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                    }
                    break;
                case 15:
                    if (zzD(obj, i13)) {
                        int iZzc4 = zzahs.zzc(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzA((iZzc4 >> 31) ^ (iZzc4 + iZzc4));
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 16:
                    if (zzD(obj, i13)) {
                        long jZzd3 = zzahs.zzd(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 17:
                    if (zzD(obj, i13)) {
                        iZzo = zzael.zzu(i14, (zzagg) zzahs.zzf(obj, j11), zzt(i13));
                        i12 += iZzo;
                    }
                    break;
                case 18:
                    iZzo = zzagt.zzh(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 19:
                    iZzo = zzagt.zzf(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 20:
                    iZzo = zzagt.zzm(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 21:
                    iZzo = zzagt.zzx(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 22:
                    iZzo = zzagt.zzk(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 23:
                    iZzo = zzagt.zzh(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 24:
                    iZzo = zzagt.zzf(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 25:
                    iZzo = zzagt.zza(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 26:
                    iZzo = zzagt.zzu(i14, (List) zzahs.zzf(obj, j11));
                    i12 += iZzo;
                    break;
                case 27:
                    iZzo = zzagt.zzp(i14, (List) zzahs.zzf(obj, j11), zzt(i13));
                    i12 += iZzo;
                    break;
                case 28:
                    iZzo = zzagt.zzc(i14, (List) zzahs.zzf(obj, j11));
                    i12 += iZzo;
                    break;
                case 29:
                    iZzo = zzagt.zzv(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 30:
                    iZzo = zzagt.zzd(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 31:
                    iZzo = zzagt.zzf(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 32:
                    iZzo = zzagt.zzh(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 33:
                    iZzo = zzagt.zzq(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 34:
                    iZzo = zzagt.zzs(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += iZzo;
                    break;
                case 35:
                    iZzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 36:
                    iZzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 37:
                    iZzv = zzagt.zzn((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 38:
                    iZzv = zzagt.zzy((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 39:
                    iZzv = zzagt.zzl((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 40:
                    iZzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 41:
                    iZzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 42:
                    iZzv = zzagt.zzb((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 43:
                    iZzv = zzagt.zzw((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 44:
                    iZzv = zzagt.zze((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 45:
                    iZzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 46:
                    iZzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 47:
                    iZzv = zzagt.zzr((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 48:
                    iZzv = zzagt.zzt((List) unsafe.getObject(obj, j11));
                    if (iZzv > 0) {
                        iZzz = zzael.zzz(i14);
                        iZzA8 = zzael.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 49:
                    iZzo = zzagt.zzj(i14, (List) zzahs.zzf(obj, j11), zzt(i13));
                    i12 += iZzo;
                    break;
                case 50:
                    zzagb.zza(i14, zzahs.zzf(obj, j11), zzu(i13));
                    break;
                case 51:
                    if (zzH(obj, i14, i13)) {
                        iZzA = zzael.zzA(i14 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                    }
                    break;
                case 52:
                    if (zzH(obj, i14, i13)) {
                        iZzA2 = zzael.zzA(i14 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                    }
                    break;
                case 53:
                    if (zzH(obj, i14, i13)) {
                        long jZzs = zzs(obj, j11);
                        iZzA3 = zzael.zzA(i14 << 3);
                        iZzB = zzael.zzB(jZzs);
                        i12 += iZzA3 + iZzB;
                    }
                    break;
                case 54:
                    if (zzH(obj, i14, i13)) {
                        long jZzs2 = zzs(obj, j11);
                        iZzA3 = zzael.zzA(i14 << 3);
                        iZzB = zzael.zzB(jZzs2);
                        i12 += iZzA3 + iZzB;
                    }
                    break;
                case 55:
                    if (zzH(obj, i14, i13)) {
                        int iZzo2 = zzo(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzv(iZzo2);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 56:
                    if (zzH(obj, i14, i13)) {
                        iZzA = zzael.zzA(i14 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                    }
                    break;
                case 57:
                    if (zzH(obj, i14, i13)) {
                        iZzA2 = zzael.zzA(i14 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                    }
                    break;
                case 58:
                    if (zzH(obj, i14, i13)) {
                        iZzA5 = zzael.zzA(i14 << 3);
                        iZzo = iZzA5 + 1;
                        i12 += iZzo;
                    }
                    break;
                case 59:
                    if (zzH(obj, i14, i13)) {
                        Object objZzf2 = zzahs.zzf(obj, j11);
                        if (objZzf2 instanceof zzaed) {
                            iZzA6 = zzael.zzA(i14 << 3);
                            iZzd = ((zzaed) objZzf2).zzd();
                            iZzA7 = zzael.zzA(iZzd);
                            i11 = iZzA6 + iZzA7 + iZzd;
                            i12 += i11;
                        } else {
                            iZzA4 = zzael.zzA(i14 << 3);
                            iZzv = zzael.zzy((String) objZzf2);
                            i11 = iZzA4 + iZzv;
                            i12 += i11;
                        }
                    }
                    break;
                case 60:
                    if (zzH(obj, i14, i13)) {
                        iZzo = zzagt.zzo(i14, zzahs.zzf(obj, j11), zzt(i13));
                        i12 += iZzo;
                    }
                    break;
                case 61:
                    if (zzH(obj, i14, i13)) {
                        zzaed zzaedVar2 = (zzaed) zzahs.zzf(obj, j11);
                        iZzA6 = zzael.zzA(i14 << 3);
                        iZzd = zzaedVar2.zzd();
                        iZzA7 = zzael.zzA(iZzd);
                        i11 = iZzA6 + iZzA7 + iZzd;
                        i12 += i11;
                    }
                    break;
                case 62:
                    if (zzH(obj, i14, i13)) {
                        int iZzo3 = zzo(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzA(iZzo3);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 63:
                    if (zzH(obj, i14, i13)) {
                        int iZzo4 = zzo(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzv(iZzo4);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 64:
                    if (zzH(obj, i14, i13)) {
                        iZzA2 = zzael.zzA(i14 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                    }
                    break;
                case 65:
                    if (zzH(obj, i14, i13)) {
                        iZzA = zzael.zzA(i14 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                    }
                    break;
                case 66:
                    if (zzH(obj, i14, i13)) {
                        int iZzo5 = zzo(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzA((iZzo5 >> 31) ^ (iZzo5 + iZzo5));
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 67:
                    if (zzH(obj, i14, i13)) {
                        long jZzs3 = zzs(obj, j11);
                        iZzA4 = zzael.zzA(i14 << 3);
                        iZzv = zzael.zzB((jZzs3 >> 63) ^ (jZzs3 + jZzs3));
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                    }
                    break;
                case 68:
                    if (zzH(obj, i14, i13)) {
                        iZzo = zzael.zzu(i14, (zzagg) zzahs.zzf(obj, j11), zzt(i13));
                        i12 += iZzo;
                    }
                    break;
            }
        }
        zzahi zzahiVar = this.zzk;
        return i12 + zzahiVar.zza(zzahiVar.zzc(obj));
    }

    private static int zzo(Object obj, long j11) {
        return ((Integer) zzahs.zzf(obj, j11)).intValue();
    }

    private final int zzp(int i11) {
        return this.zzc[i11 + 2];
    }

    private static int zzq(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzr(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzs(Object obj, long j11) {
        return ((Long) zzahs.zzf(obj, j11)).longValue();
    }

    private final zzagr zzt(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzagr zzagrVar = (zzagr) this.zzd[i13];
        if (zzagrVar != null) {
            return zzagrVar;
        }
        zzagr zzagrVarZzb = zzago.zza().zzb((Class) this.zzd[i13 + 1]);
        this.zzd[i13] = zzagrVarZzb;
        return zzagrVarZzb;
    }

    private final Object zzu(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzw(Object obj, Object obj2, int i11) {
        if (zzD(obj2, i11)) {
            long jZzr = zzr(i11) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, jZzr);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzagr zzagrVarZzt = zzt(i11);
            if (!zzD(obj, i11)) {
                if (zzG(object)) {
                    Object objZzc = zzagrVarZzt.zzc();
                    zzagrVarZzt.zze(objZzc, object);
                    unsafe.putObject(obj, jZzr, objZzc);
                } else {
                    unsafe.putObject(obj, jZzr, object);
                }
                zzy(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZzr);
            if (!zzG(object2)) {
                Object objZzc2 = zzagrVarZzt.zzc();
                zzagrVarZzt.zze(objZzc2, object2);
                unsafe.putObject(obj, jZzr, objZzc2);
                object2 = objZzc2;
            }
            zzagrVarZzt.zze(object2, object);
        }
    }

    private final void zzx(Object obj, Object obj2, int i11) {
        int i12 = this.zzc[i11];
        if (zzH(obj2, i12, i11)) {
            long jZzr = zzr(i11) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, jZzr);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzagr zzagrVarZzt = zzt(i11);
            if (!zzH(obj, i12, i11)) {
                if (zzG(object)) {
                    Object objZzc = zzagrVarZzt.zzc();
                    zzagrVarZzt.zze(objZzc, object);
                    unsafe.putObject(obj, jZzr, objZzc);
                } else {
                    unsafe.putObject(obj, jZzr, object);
                }
                zzz(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZzr);
            if (!zzG(object2)) {
                Object objZzc2 = zzagrVarZzt.zzc();
                zzagrVarZzt.zze(objZzc2, object2);
                unsafe.putObject(obj, jZzr, objZzc2);
                object2 = objZzc2;
            }
            zzagrVarZzt.zze(object2, object);
        }
    }

    private final void zzy(Object obj, int i11) {
        int iZzp = zzp(i11);
        long j11 = 1048575 & iZzp;
        if (j11 == 1048575) {
            return;
        }
        zzahs.zzq(obj, j11, (1 << (iZzp >>> 20)) | zzahs.zzc(obj, j11));
    }

    private final void zzz(Object obj, int i11, int i12) {
        zzahs.zzq(obj, zzp(i12) & 1048575, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final int zza(Object obj) {
        return this.zzg ? zzn(obj) : zzm(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final int zzb(Object obj) {
        int i11;
        int iZzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzr = zzr(i13);
            int i14 = this.zzc[i13];
            long j11 = 1048575 & iZzr;
            int iHashCode = 37;
            switch (zzq(iZzr)) {
                case 0:
                    i11 = i12 * 53;
                    iZzc = zzafh.zzc(Double.doubleToLongBits(zzahs.zza(obj, j11)));
                    i12 = i11 + iZzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    iZzc = Float.floatToIntBits(zzahs.zzb(obj, j11));
                    i12 = i11 + iZzc;
                    break;
                case 2:
                    i11 = i12 * 53;
                    iZzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + iZzc;
                    break;
                case 3:
                    i11 = i12 * 53;
                    iZzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + iZzc;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzc(obj, j11);
                    i12 = i11 + iZzc;
                    break;
                case 5:
                    i11 = i12 * 53;
                    iZzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + iZzc;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzc(obj, j11);
                    i12 = i11 + iZzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    iZzc = zzafh.zza(zzahs.zzw(obj, j11));
                    i12 = i11 + iZzc;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iZzc = ((String) zzahs.zzf(obj, j11)).hashCode();
                    i12 = i11 + iZzc;
                    break;
                case 9:
                    Object objZzf = zzahs.zzf(obj, j11);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzf(obj, j11).hashCode();
                    i12 = i11 + iZzc;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzc(obj, j11);
                    i12 = i11 + iZzc;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzc(obj, j11);
                    i12 = i11 + iZzc;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzc(obj, j11);
                    i12 = i11 + iZzc;
                    break;
                case 14:
                    i11 = i12 * 53;
                    iZzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + iZzc;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzc(obj, j11);
                    i12 = i11 + iZzc;
                    break;
                case 16:
                    i11 = i12 * 53;
                    iZzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzahs.zzf(obj, j11);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzf(obj, j11).hashCode();
                    i12 = i11 + iZzc;
                    break;
                case 50:
                    i11 = i12 * 53;
                    iZzc = zzahs.zzf(obj, j11).hashCode();
                    i12 = i11 + iZzc;
                    break;
                case 51:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzafh.zzc(Double.doubleToLongBits(zzk(obj, j11)));
                        i12 = i11 + iZzc;
                    }
                    break;
                case 52:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = Float.floatToIntBits(zzl(obj, j11));
                        i12 = i11 + iZzc;
                    }
                    break;
                case 53:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + iZzc;
                    }
                    break;
                case 54:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + iZzc;
                    }
                    break;
                case 55:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzo(obj, j11);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 56:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + iZzc;
                    }
                    break;
                case 57:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzo(obj, j11);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 58:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzafh.zza(zzI(obj, j11));
                        i12 = i11 + iZzc;
                    }
                    break;
                case 59:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = ((String) zzahs.zzf(obj, j11)).hashCode();
                        i12 = i11 + iZzc;
                    }
                    break;
                case 60:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzahs.zzf(obj, j11).hashCode();
                        i12 = i11 + iZzc;
                    }
                    break;
                case 61:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzahs.zzf(obj, j11).hashCode();
                        i12 = i11 + iZzc;
                    }
                    break;
                case 62:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzo(obj, j11);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 63:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzo(obj, j11);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 64:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzo(obj, j11);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 65:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + iZzc;
                    }
                    break;
                case 66:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzo(obj, j11);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 67:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + iZzc;
                    }
                    break;
                case 68:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzahs.zzf(obj, j11).hashCode();
                        i12 = i11 + iZzc;
                    }
                    break;
            }
        }
        int iHashCode2 = (i12 * 53) + this.zzk.zzc(obj).hashCode();
        if (!this.zzf) {
            return iHashCode2;
        }
        this.zzl.zza(obj);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final Object zzc() {
        return ((zzaey) this.zze).zzy();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zzd(Object obj) {
        if (zzG(obj)) {
            if (obj instanceof zzaey) {
                zzaey zzaeyVar = (zzaey) obj;
                zzaeyVar.zzJ(Integer.MAX_VALUE);
                zzaeyVar.zza = 0;
                zzaeyVar.zzH();
            }
            int length = this.zzc.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int iZzr = zzr(i11);
                long j11 = 1048575 & iZzr;
                int iZzq = zzq(iZzr);
                if (iZzq != 9) {
                    switch (iZzq) {
                        case 17:
                            if (zzD(obj, i11)) {
                                zzt(i11).zzd(zzb.getObject(obj, j11));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzj.zza(obj, j11);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j11);
                            if (object != null) {
                                ((zzaga) object).zzb();
                                unsafe.putObject(obj, j11, object);
                            }
                            break;
                    }
                } else if (zzD(obj, i11)) {
                    zzt(i11).zzd(zzb.getObject(obj, j11));
                }
            }
            this.zzk.zze(obj);
            if (this.zzf) {
                this.zzl.zzb(obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zze(Object obj, Object obj2) {
        if (!zzG(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzr = zzr(i11);
            long j11 = 1048575 & iZzr;
            int i12 = this.zzc[i11];
            switch (zzq(iZzr)) {
                case 0:
                    if (zzD(obj2, i11)) {
                        zzahs.zzo(obj, j11, zzahs.zza(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 1:
                    if (zzD(obj2, i11)) {
                        zzahs.zzp(obj, j11, zzahs.zzb(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 2:
                    if (zzD(obj2, i11)) {
                        zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 3:
                    if (zzD(obj2, i11)) {
                        zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 4:
                    if (zzD(obj2, i11)) {
                        zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 5:
                    if (zzD(obj2, i11)) {
                        zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 6:
                    if (zzD(obj2, i11)) {
                        zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 7:
                    if (zzD(obj2, i11)) {
                        zzahs.zzm(obj, j11, zzahs.zzw(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 8:
                    if (zzD(obj2, i11)) {
                        zzahs.zzs(obj, j11, zzahs.zzf(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 9:
                    zzw(obj, obj2, i11);
                    break;
                case 10:
                    if (zzD(obj2, i11)) {
                        zzahs.zzs(obj, j11, zzahs.zzf(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 11:
                    if (zzD(obj2, i11)) {
                        zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 12:
                    if (zzD(obj2, i11)) {
                        zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 13:
                    if (zzD(obj2, i11)) {
                        zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 14:
                    if (zzD(obj2, i11)) {
                        zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 15:
                    if (zzD(obj2, i11)) {
                        zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 16:
                    if (zzD(obj2, i11)) {
                        zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                        zzy(obj, i11);
                    }
                    break;
                case 17:
                    zzw(obj, obj2, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzj.zzb(obj, obj2, j11);
                    break;
                case 50:
                    zzagt.zzY(this.zzn, obj, obj2, j11);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzH(obj2, i12, i11)) {
                        zzahs.zzs(obj, j11, zzahs.zzf(obj2, j11));
                        zzz(obj, i12, i11);
                    }
                    break;
                case 60:
                    zzx(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzH(obj2, i12, i11)) {
                        zzahs.zzs(obj, j11, zzahs.zzf(obj2, j11));
                        zzz(obj, i12, i11);
                    }
                    break;
                case 68:
                    zzx(obj, obj2, i11);
                    break;
            }
        }
        zzagt.zzD(this.zzk, obj, obj2);
        if (this.zzf) {
            zzagt.zzC(this.zzl, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zzf(Object obj, zzahz zzahzVar) {
        if (!this.zzg) {
            zzA(obj, zzahzVar);
            return;
        }
        if (this.zzf) {
            this.zzl.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iZzr = zzr(i11);
            int i12 = this.zzc[i11];
            switch (zzq(iZzr)) {
                case 0:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzf(i12, zzahs.zza(obj, iZzr & 1048575));
                    }
                    break;
                case 1:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzn(i12, zzahs.zzb(obj, iZzr & 1048575));
                    }
                    break;
                case 2:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzs(i12, zzahs.zzd(obj, iZzr & 1048575));
                    }
                    break;
                case 3:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzH(i12, zzahs.zzd(obj, iZzr & 1048575));
                    }
                    break;
                case 4:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzq(i12, zzahs.zzc(obj, iZzr & 1048575));
                    }
                    break;
                case 5:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzl(i12, zzahs.zzd(obj, iZzr & 1048575));
                    }
                    break;
                case 6:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzj(i12, zzahs.zzc(obj, iZzr & 1048575));
                    }
                    break;
                case 7:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzb(i12, zzahs.zzw(obj, iZzr & 1048575));
                    }
                    break;
                case 8:
                    if (zzD(obj, i11)) {
                        zzJ(i12, zzahs.zzf(obj, iZzr & 1048575), zzahzVar);
                    }
                    break;
                case 9:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzu(i12, zzahs.zzf(obj, iZzr & 1048575), zzt(i11));
                    }
                    break;
                case 10:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzd(i12, (zzaed) zzahs.zzf(obj, iZzr & 1048575));
                    }
                    break;
                case 11:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzF(i12, zzahs.zzc(obj, iZzr & 1048575));
                    }
                    break;
                case 12:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzh(i12, zzahs.zzc(obj, iZzr & 1048575));
                    }
                    break;
                case 13:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzv(i12, zzahs.zzc(obj, iZzr & 1048575));
                    }
                    break;
                case 14:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzx(i12, zzahs.zzd(obj, iZzr & 1048575));
                    }
                    break;
                case 15:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzz(i12, zzahs.zzc(obj, iZzr & 1048575));
                    }
                    break;
                case 16:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzB(i12, zzahs.zzd(obj, iZzr & 1048575));
                    }
                    break;
                case 17:
                    if (zzD(obj, i11)) {
                        zzahzVar.zzp(i12, zzahs.zzf(obj, iZzr & 1048575), zzt(i11));
                    }
                    break;
                case 18:
                    zzagt.zzH(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 19:
                    zzagt.zzL(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 20:
                    zzagt.zzO(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 21:
                    zzagt.zzW(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 22:
                    zzagt.zzN(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 23:
                    zzagt.zzK(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 24:
                    zzagt.zzJ(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 25:
                    zzagt.zzF(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 26:
                    zzagt.zzU(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar);
                    break;
                case 27:
                    zzagt.zzP(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, zzt(i11));
                    break;
                case 28:
                    zzagt.zzG(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar);
                    break;
                case 29:
                    zzagt.zzV(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 30:
                    zzagt.zzI(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 31:
                    zzagt.zzQ(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 32:
                    zzagt.zzR(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 33:
                    zzagt.zzS(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 34:
                    zzagt.zzT(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, false);
                    break;
                case 35:
                    zzagt.zzH(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 36:
                    zzagt.zzL(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 37:
                    zzagt.zzO(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 38:
                    zzagt.zzW(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 39:
                    zzagt.zzN(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 40:
                    zzagt.zzK(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 41:
                    zzagt.zzJ(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 42:
                    zzagt.zzF(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 43:
                    zzagt.zzV(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 44:
                    zzagt.zzI(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 45:
                    zzagt.zzQ(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 46:
                    zzagt.zzR(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 47:
                    zzagt.zzS(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 48:
                    zzagt.zzT(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, true);
                    break;
                case 49:
                    zzagt.zzM(i12, (List) zzahs.zzf(obj, iZzr & 1048575), zzahzVar, zzt(i11));
                    break;
                case 50:
                    zzB(zzahzVar, i12, zzahs.zzf(obj, iZzr & 1048575), i11);
                    break;
                case 51:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzf(i12, zzk(obj, iZzr & 1048575));
                    }
                    break;
                case 52:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzn(i12, zzl(obj, iZzr & 1048575));
                    }
                    break;
                case 53:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzs(i12, zzs(obj, iZzr & 1048575));
                    }
                    break;
                case 54:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzH(i12, zzs(obj, iZzr & 1048575));
                    }
                    break;
                case 55:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzq(i12, zzo(obj, iZzr & 1048575));
                    }
                    break;
                case 56:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzl(i12, zzs(obj, iZzr & 1048575));
                    }
                    break;
                case 57:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzj(i12, zzo(obj, iZzr & 1048575));
                    }
                    break;
                case 58:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzb(i12, zzI(obj, iZzr & 1048575));
                    }
                    break;
                case 59:
                    if (zzH(obj, i12, i11)) {
                        zzJ(i12, zzahs.zzf(obj, iZzr & 1048575), zzahzVar);
                    }
                    break;
                case 60:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzu(i12, zzahs.zzf(obj, iZzr & 1048575), zzt(i11));
                    }
                    break;
                case 61:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzd(i12, (zzaed) zzahs.zzf(obj, iZzr & 1048575));
                    }
                    break;
                case 62:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzF(i12, zzo(obj, iZzr & 1048575));
                    }
                    break;
                case 63:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzh(i12, zzo(obj, iZzr & 1048575));
                    }
                    break;
                case 64:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzv(i12, zzo(obj, iZzr & 1048575));
                    }
                    break;
                case 65:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzx(i12, zzs(obj, iZzr & 1048575));
                    }
                    break;
                case 66:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzz(i12, zzo(obj, iZzr & 1048575));
                    }
                    break;
                case 67:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzB(i12, zzs(obj, iZzr & 1048575));
                    }
                    break;
                case 68:
                    if (zzH(obj, i12, i11)) {
                        zzahzVar.zzp(i12, zzahs.zzf(obj, iZzr & 1048575), zzt(i11));
                    }
                    break;
            }
        }
        zzahi zzahiVar = this.zzk;
        zzahiVar.zzg(zzahiVar.zzc(obj), zzahzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final boolean zzg(Object obj, Object obj2) {
        boolean zZzX;
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iZzr = zzr(i11);
            long j11 = iZzr & 1048575;
            switch (zzq(iZzr)) {
                case 0:
                    if (!zzC(obj, obj2, i11) || Double.doubleToLongBits(zzahs.zza(obj, j11)) != Double.doubleToLongBits(zzahs.zza(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzC(obj, obj2, i11) || Float.floatToIntBits(zzahs.zzb(obj, j11)) != Float.floatToIntBits(zzahs.zzb(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzC(obj, obj2, i11) || zzahs.zzd(obj, j11) != zzahs.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzC(obj, obj2, i11) || zzahs.zzd(obj, j11) != zzahs.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzC(obj, obj2, i11) || zzahs.zzc(obj, j11) != zzahs.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzC(obj, obj2, i11) || zzahs.zzd(obj, j11) != zzahs.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzC(obj, obj2, i11) || zzahs.zzc(obj, j11) != zzahs.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzC(obj, obj2, i11) || zzahs.zzw(obj, j11) != zzahs.zzw(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzC(obj, obj2, i11) || !zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzC(obj, obj2, i11) || !zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzC(obj, obj2, i11) || !zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzC(obj, obj2, i11) || zzahs.zzc(obj, j11) != zzahs.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzC(obj, obj2, i11) || zzahs.zzc(obj, j11) != zzahs.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzC(obj, obj2, i11) || zzahs.zzc(obj, j11) != zzahs.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzC(obj, obj2, i11) || zzahs.zzd(obj, j11) != zzahs.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzC(obj, obj2, i11) || zzahs.zzc(obj, j11) != zzahs.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzC(obj, obj2, i11) || zzahs.zzd(obj, j11) != zzahs.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzC(obj, obj2, i11) || !zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzX = zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11));
                    break;
                case 50:
                    zZzX = zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzp = zzp(i11) & 1048575;
                    if (zzahs.zzc(obj, jZzp) != zzahs.zzc(obj2, jZzp) || !zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzX) {
                return false;
            }
        }
        if (!this.zzk.zzc(obj).equals(this.zzk.zzc(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzl.zza(obj);
        this.zzl.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8 A[LOOP:1: B:45:0x00a7->B:50:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzagr
    public final boolean zzh(Object obj) {
        int i11;
        int i12;
        List list;
        zzagr zzagrVarZzt;
        int i13;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < this.zzi) {
            int i17 = this.zzh[i16];
            int i18 = this.zzc[i17];
            int iZzr = zzr(i17);
            int i19 = this.zzc[i17 + 2];
            int i21 = i19 & 1048575;
            int i22 = 1 << (i19 >>> 20);
            if (i21 != i14) {
                if (i21 != 1048575) {
                    i15 = zzb.getInt(obj, i21);
                }
                i12 = i15;
                i11 = i21;
            } else {
                int i23 = i15;
                i11 = i14;
                i12 = i23;
            }
            if ((268435456 & iZzr) != 0 && !zzE(obj, i17, i11, i12, i22)) {
                return false;
            }
            int iZzq = zzq(iZzr);
            if (iZzq == 9 || iZzq == 17) {
                if (zzE(obj, i17, i11, i12, i22) && !zzF(obj, iZzr, zzt(i17))) {
                    return false;
                }
            } else if (iZzq == 27) {
                list = (List) zzahs.zzf(obj, iZzr & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzagrVarZzt = zzt(i17);
                    for (i13 = 0; i13 < list.size(); i13++) {
                        if (!zzagrVarZzt.zzh(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (iZzq == 60 || iZzq == 68) {
                if (zzH(obj, i18, i17) && !zzF(obj, iZzr, zzt(i17))) {
                    return false;
                }
            } else if (iZzq == 49) {
                list = (List) zzahs.zzf(obj, iZzr & 1048575);
                if (list.isEmpty()) {
                    zzagrVarZzt = zzt(i17);
                    while (i13 < list.size()) {
                        if (!zzagrVarZzt.zzh(list.get(i13))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzq == 50 && !((zzaga) zzahs.zzf(obj, iZzr & 1048575)).isEmpty()) {
                throw null;
            }
            i16++;
            i14 = i11;
            i15 = i12;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzl.zza(obj);
        throw null;
    }
}
