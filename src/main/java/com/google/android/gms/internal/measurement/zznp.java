package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i11, int i12, zznm zznmVar, boolean z11, int[] iArr2, int i13, int i14, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i11;
        this.zzf = i12;
        boolean z12 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzC(Object obj, long j11) {
        return ((Double) zzop.zzn(obj, j11)).doubleValue();
    }

    private static float zzD(Object obj, long j11) {
        return ((Float) zzop.zzn(obj, j11)).floatValue();
    }

    private static int zzE(Object obj, long j11) {
        return ((Integer) zzop.zzn(obj, j11)).intValue();
    }

    private static long zzF(Object obj, long j11) {
        return ((Long) zzop.zzn(obj, j11)).longValue();
    }

    private static boolean zzG(Object obj, long j11) {
        return ((Boolean) zzop.zzn(obj, j11)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i11) {
        return zzJ(obj, i11) == zzJ(obj2, i11);
    }

    private final boolean zzI(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return zzJ(obj, i11);
        }
        return (i13 & i14) != 0;
    }

    private final boolean zzJ(Object obj, int i11) {
        int iZzy = zzy(i11);
        long j11 = iZzy & 1048575;
        if (j11 != 1048575) {
            return (zzop.zzd(obj, j11) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzx = zzx(i11);
        long j12 = iZzx & 1048575;
        switch (zzz(iZzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j12)) != 0;
            case 2:
                return zzop.zzf(obj, j12) != 0;
            case 3:
                return zzop.zzf(obj, j12) != 0;
            case 4:
                return zzop.zzd(obj, j12) != 0;
            case 5:
                return zzop.zzf(obj, j12) != 0;
            case 6:
                return zzop.zzd(obj, j12) != 0;
            case 7:
                return zzop.zzh(obj, j12);
            case 8:
                Object objZzn = zzop.zzn(obj, j12);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzlh) {
                    return !zzlh.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j12) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j12));
            case 11:
                return zzop.zzd(obj, j12) != 0;
            case 12:
                return zzop.zzd(obj, j12) != 0;
            case 13:
                return zzop.zzd(obj, j12) != 0;
            case 14:
                return zzop.zzf(obj, j12) != 0;
            case 15:
                return zzop.zzd(obj, j12) != 0;
            case 16:
                return zzop.zzf(obj, j12) != 0;
            case 17:
                return zzop.zzn(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i11) {
        int iZzy = zzy(i11);
        long j11 = 1048575 & iZzy;
        if (j11 == 1048575) {
            return;
        }
        zzop.zze(obj, j11, (1 << (iZzy >>> 20)) | zzop.zzd(obj, j11));
    }

    private final boolean zzL(Object obj, int i11, int i12) {
        return zzop.zzd(obj, (long) (zzy(i12) & 1048575)) == i11;
    }

    private final void zzM(Object obj, int i11, int i12) {
        zzop.zze(obj, zzy(i12) & 1048575, i11);
    }

    private final int zzN(int i11, int i12) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = iArr[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private static final int zzO(byte[] bArr, int i11, int i12, zzot zzotVar, Class cls, zzkw zzkwVar) {
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                int i13 = i11 + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i11)));
                return i13;
            case 1:
                int i14 = i11 + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i11)));
                return i14;
            case 2:
            case 3:
                int iZzc = zzkx.zzc(bArr, i11, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzkx.zza(bArr, i11, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return iZza;
            case 5:
            case 15:
                int i15 = i11 + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i11));
                return i15;
            case 6:
            case 14:
                int i16 = i11 + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i11));
                return i16;
            case 7:
                int iZzc2 = zzkx.zzc(bArr, i11, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzkx.zzf(bArr, i11, zzkwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i11, i12, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i11, zzkwVar);
            case 16:
                int iZza2 = zzkx.zza(bArr, i11, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzkx.zzc(bArr, i11, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzP(int i11, Object obj, zzov zzovVar) {
        if (obj instanceof String) {
            zzovVar.zzm(i11, (String) obj);
        } else {
            zzovVar.zzn(i11, (zzlh) obj);
        }
    }

    static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzojVarZzb = zzoj.zzb();
        zzmfVar.zzc = zzojVarZzb;
        return zzojVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        int i11;
        int iCharAt;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        char cCharAt2;
        int i21;
        char cCharAt3;
        int i22;
        char cCharAt4;
        int i23;
        char cCharAt5;
        int i24;
        char cCharAt6;
        int i25;
        char cCharAt7;
        int i26;
        char cCharAt8;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        char c11;
        int iObjectFieldOffset2;
        int i31;
        int i32;
        int i33;
        Field fieldZzm;
        char cCharAt9;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field fieldZzm2;
        int i39;
        Object obj2;
        Field fieldZzm3;
        int i41;
        char cCharAt10;
        int i42;
        char cCharAt11;
        int i43;
        char cCharAt12;
        int i44;
        char cCharAt13;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar = (zznw) zznjVar;
        String strZzd = zznwVar.zzd();
        int length = strZzd.length();
        char c12 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i45 = 1;
            while (true) {
                i11 = i45 + 1;
                if (strZzd.charAt(i45) < 55296) {
                    break;
                }
                i45 = i11;
            }
        } else {
            i11 = 1;
        }
        int i46 = i11 + 1;
        int iCharAt2 = strZzd.charAt(i11);
        if (iCharAt2 >= 55296) {
            int i47 = iCharAt2 & 8191;
            int i48 = 13;
            while (true) {
                i44 = i46 + 1;
                cCharAt13 = strZzd.charAt(i46);
                if (cCharAt13 < 55296) {
                    break;
                }
                i47 |= (cCharAt13 & 8191) << i48;
                i48 += 13;
                i46 = i44;
            }
            iCharAt2 = i47 | (cCharAt13 << i48);
            i46 = i44;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            i16 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i15 = 0;
            iArr = zza;
            i17 = 0;
        } else {
            int i49 = i46 + 1;
            int iCharAt3 = strZzd.charAt(i46);
            if (iCharAt3 >= 55296) {
                int i51 = iCharAt3 & 8191;
                int i52 = 13;
                while (true) {
                    i26 = i49 + 1;
                    cCharAt8 = strZzd.charAt(i49);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt8 & 8191) << i52;
                    i52 += 13;
                    i49 = i26;
                }
                iCharAt3 = i51 | (cCharAt8 << i52);
                i49 = i26;
            }
            int i53 = i49 + 1;
            int iCharAt4 = strZzd.charAt(i49);
            if (iCharAt4 >= 55296) {
                int i54 = iCharAt4 & 8191;
                int i55 = 13;
                while (true) {
                    i25 = i53 + 1;
                    cCharAt7 = strZzd.charAt(i53);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i25;
                }
                iCharAt4 = i54 | (cCharAt7 << i55);
                i53 = i25;
            }
            int i56 = i53 + 1;
            int iCharAt5 = strZzd.charAt(i53);
            if (iCharAt5 >= 55296) {
                int i57 = iCharAt5 & 8191;
                int i58 = 13;
                while (true) {
                    i24 = i56 + 1;
                    cCharAt6 = strZzd.charAt(i56);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i24;
                }
                iCharAt5 = i57 | (cCharAt6 << i58);
                i56 = i24;
            }
            int i59 = i56 + 1;
            int iCharAt6 = strZzd.charAt(i56);
            if (iCharAt6 >= 55296) {
                int i61 = iCharAt6 & 8191;
                int i62 = 13;
                while (true) {
                    i23 = i59 + 1;
                    cCharAt5 = strZzd.charAt(i59);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt5 & 8191) << i62;
                    i62 += 13;
                    i59 = i23;
                }
                iCharAt6 = i61 | (cCharAt5 << i62);
                i59 = i23;
            }
            int i63 = i59 + 1;
            iCharAt = strZzd.charAt(i59);
            if (iCharAt >= 55296) {
                int i64 = iCharAt & 8191;
                int i65 = 13;
                while (true) {
                    i22 = i63 + 1;
                    cCharAt4 = strZzd.charAt(i63);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt4 & 8191) << i65;
                    i65 += 13;
                    i63 = i22;
                }
                iCharAt = i64 | (cCharAt4 << i65);
                i63 = i22;
            }
            int i66 = i63 + 1;
            int iCharAt7 = strZzd.charAt(i63);
            if (iCharAt7 >= 55296) {
                int i67 = iCharAt7 & 8191;
                int i68 = 13;
                while (true) {
                    i21 = i66 + 1;
                    cCharAt3 = strZzd.charAt(i66);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt3 & 8191) << i68;
                    i68 += 13;
                    i66 = i21;
                }
                iCharAt7 = i67 | (cCharAt3 << i68);
                i66 = i21;
            }
            int i69 = i66 + 1;
            int iCharAt8 = strZzd.charAt(i66);
            if (iCharAt8 >= 55296) {
                int i71 = iCharAt8 & 8191;
                int i72 = 13;
                while (true) {
                    i19 = i69 + 1;
                    cCharAt2 = strZzd.charAt(i69);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt2 & 8191) << i72;
                    i72 += 13;
                    i69 = i19;
                }
                iCharAt8 = i71 | (cCharAt2 << i72);
                i69 = i19;
            }
            int i73 = i69 + 1;
            int iCharAt9 = strZzd.charAt(i69);
            if (iCharAt9 >= 55296) {
                int i74 = iCharAt9 & 8191;
                int i75 = 13;
                while (true) {
                    i18 = i73 + 1;
                    cCharAt = strZzd.charAt(i73);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i74 |= (cCharAt & 8191) << i75;
                    i75 += 13;
                    i73 = i18;
                }
                iCharAt9 = i74 | (cCharAt << i75);
                i73 = i18;
            }
            int i76 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i77 = iCharAt7;
            i12 = iCharAt5;
            i13 = i77;
            i14 = iCharAt6;
            i15 = iCharAt9;
            i16 = i76;
            iArr = iArr2;
            i17 = iCharAt3;
            i46 = i73;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zznwVar.zze();
        Class<?> cls2 = zznwVar.zzb().getClass();
        int i78 = i15 + i13;
        int i79 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i79];
        int i81 = i15;
        int i82 = i78;
        int i83 = 0;
        int i84 = 0;
        while (i46 < length) {
            int i85 = i46 + 1;
            int iCharAt10 = strZzd.charAt(i46);
            if (iCharAt10 >= c12) {
                int i86 = iCharAt10 & 8191;
                int i87 = i85;
                int i88 = 13;
                while (true) {
                    i43 = i87 + 1;
                    cCharAt12 = strZzd.charAt(i87);
                    if (cCharAt12 < c12) {
                        break;
                    }
                    i86 |= (cCharAt12 & 8191) << i88;
                    i88 += 13;
                    i87 = i43;
                }
                iCharAt10 = i86 | (cCharAt12 << i88);
                i27 = i43;
            } else {
                i27 = i85;
            }
            int i89 = i27 + 1;
            int iCharAt11 = strZzd.charAt(i27);
            if (iCharAt11 >= c12) {
                int i91 = iCharAt11 & 8191;
                int i92 = i89;
                int i93 = 13;
                while (true) {
                    i42 = i92 + 1;
                    cCharAt11 = strZzd.charAt(i92);
                    if (cCharAt11 < c12) {
                        break;
                    }
                    i91 |= (cCharAt11 & 8191) << i93;
                    i93 += 13;
                    i92 = i42;
                }
                iCharAt11 = i91 | (cCharAt11 << i93);
                i28 = i42;
            } else {
                i28 = i89;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i83] = i84;
                i83++;
            }
            int i94 = iCharAt11 & 255;
            zznw zznwVar2 = zznwVar;
            int i95 = iCharAt11 & 2048;
            if (i94 >= 51) {
                int i96 = i28 + 1;
                int iCharAt12 = strZzd.charAt(i28);
                char c13 = 55296;
                if (iCharAt12 >= 55296) {
                    int i97 = iCharAt12 & 8191;
                    int i98 = i96;
                    int i99 = 13;
                    while (true) {
                        i41 = i98 + 1;
                        cCharAt10 = strZzd.charAt(i98);
                        if (cCharAt10 < c13) {
                            break;
                        }
                        i97 |= (cCharAt10 & 8191) << i99;
                        i99 += 13;
                        i98 = i41;
                        c13 = 55296;
                    }
                    iCharAt12 = i97 | (cCharAt10 << i99);
                    i35 = i41;
                } else {
                    i35 = i96;
                }
                int i100 = i35;
                int i101 = i94 - 51;
                if (i101 == 9 || i101 == 17) {
                    i36 = i16 + 1;
                    int i102 = i84 / 3;
                    objArr[i102 + i102 + 1] = objArrZze[i16];
                } else {
                    if (i101 != 12) {
                        i37 = i95;
                    } else if (zznwVar2.zzc() == 1 || i95 != 0) {
                        i36 = i16 + 1;
                        int i103 = i84 / 3;
                        objArr[i103 + i103 + 1] = objArrZze[i16];
                    } else {
                        i37 = 0;
                    }
                    i38 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i38];
                    int i104 = i37;
                    if (obj instanceof Field) {
                        fieldZzm2 = (Field) obj;
                    } else {
                        fieldZzm2 = zzm(cls2, (String) obj);
                        objArrZze[i38] = fieldZzm2;
                    }
                    int i105 = i17;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm2);
                    i39 = i38 + 1;
                    obj2 = objArrZze[i39];
                    i29 = i105;
                    if (obj2 instanceof Field) {
                        fieldZzm3 = (Field) obj2;
                    } else {
                        fieldZzm3 = zzm(cls2, (String) obj2);
                        objArrZze[i39] = fieldZzm3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm3);
                    strZzd = strZzd;
                    i32 = i104;
                    i28 = i100;
                    i31 = 0;
                    c11 = 55296;
                }
                i16 = i36;
                i37 = i95;
                i38 = iCharAt12 + iCharAt12;
                obj = objArrZze[i38];
                int i106 = i37;
                if (obj instanceof Field) {
                    fieldZzm2 = (Field) obj;
                } else {
                    fieldZzm2 = zzm(cls2, (String) obj);
                    objArrZze[i38] = fieldZzm2;
                }
                int i107 = i17;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm2);
                i39 = i38 + 1;
                obj2 = objArrZze[i39];
                i29 = i107;
                if (obj2 instanceof Field) {
                    fieldZzm3 = (Field) obj2;
                } else {
                    fieldZzm3 = zzm(cls2, (String) obj2);
                    objArrZze[i39] = fieldZzm3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm3);
                strZzd = strZzd;
                i32 = i106;
                i28 = i100;
                i31 = 0;
                c11 = 55296;
            } else {
                i29 = i17;
                int i108 = i16 + 1;
                Field fieldZzm4 = zzm(cls2, (String) objArrZze[i16]);
                if (i94 == 9 || i94 == 17) {
                    int i109 = i84 / 3;
                    objArr[i109 + i109 + 1] = fieldZzm4.getType();
                } else {
                    if (i94 != 27) {
                        if (i94 == 49) {
                            i16 += 2;
                            i34 = 1;
                        } else if (i94 == 12 || i94 == 30 || i94 == 44) {
                            if (zznwVar2.zzc() == 1 || i95 != 0) {
                                i16 += 2;
                                int i110 = i84 / 3;
                                objArr[i110 + i110 + 1] = objArrZze[i108];
                            } else {
                                i16 = i108;
                                i95 = 0;
                            }
                        } else if (i94 == 50) {
                            int i111 = i16 + 2;
                            int i112 = i81 + 1;
                            iArr[i81] = i84;
                            int i113 = i84 / 3;
                            int i114 = i113 + i113;
                            objArr[i114] = objArrZze[i108];
                            if (i95 != 0) {
                                objArr[i114 + 1] = objArrZze[i111];
                                i16 += 3;
                                i81 = i112;
                            } else {
                                i16 = i111;
                                i81 = i112;
                                i95 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                        if ((iCharAt11 & 4096) != 0 || i94 > 17) {
                            c11 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i31 = 0;
                        } else {
                            int i115 = i28 + 1;
                            int iCharAt13 = strZzd.charAt(i28);
                            if (iCharAt13 >= 55296) {
                                int i116 = iCharAt13 & 8191;
                                int i117 = 13;
                                while (true) {
                                    i33 = i115 + 1;
                                    cCharAt9 = strZzd.charAt(i115);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i116 |= (cCharAt9 & 8191) << i117;
                                    i117 += 13;
                                    i115 = i33;
                                }
                                iCharAt13 = i116 | (cCharAt9 << i117);
                            } else {
                                i33 = i115;
                            }
                            int i118 = i29 + i29 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i118];
                            if (obj3 instanceof Field) {
                                fieldZzm = (Field) obj3;
                            } else {
                                fieldZzm = zzm(cls2, (String) obj3);
                                objArrZze[i118] = fieldZzm;
                            }
                            int i119 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzm);
                            i31 = i119 % 32;
                            i28 = i33;
                            c11 = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i94 >= 18 && i94 <= 49) {
                            iArr[i82] = iObjectFieldOffset;
                            i82++;
                        }
                        i32 = i95;
                    } else {
                        i34 = 1;
                        i16 += 2;
                    }
                    int i120 = i84 / 3;
                    objArr[i120 + i120 + i34] = objArrZze[i108];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                    if ((iCharAt11 & 4096) != 0) {
                        c11 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i31 = 0;
                    } else {
                        c11 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i31 = 0;
                    }
                    if (i94 >= 18) {
                        iArr[i82] = iObjectFieldOffset;
                        i82++;
                    }
                    i32 = i95;
                }
                i16 = i108;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                if ((iCharAt11 & 4096) != 0) {
                    c11 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i31 = 0;
                } else {
                    c11 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i31 = 0;
                }
                if (i94 >= 18) {
                    iArr[i82] = iObjectFieldOffset;
                    i82++;
                }
                i32 = i95;
            }
            int i121 = i84 + 1;
            iArr3[i84] = iCharAt10;
            int i122 = i84 + 2;
            iArr3[i121] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i32 != 0 ? Integer.MIN_VALUE : 0) | (i94 << 20) | iObjectFieldOffset;
            i84 += 3;
            iArr3[i122] = (i31 << 20) | iObjectFieldOffset2;
            i46 = i28;
            strZzd = strZzd;
            c12 = c11;
            zznwVar = zznwVar2;
            length = length;
            i17 = i29;
        }
        return new zznp(iArr3, objArr, i12, i14, zznwVar.zzb(), false, iArr, i15, i78, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e11) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    private final void zzn(Object obj, Object obj2, int i11) {
        if (zzJ(obj2, i11)) {
            int iZzx = zzx(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = iZzx;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                int i12 = this.zzc[i11];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zznx zznxVarZzp = zzp(i11);
            if (!zzJ(obj, i11)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j11, objZza);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzK(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j11, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i11) {
        int[] iArr = this.zzc;
        int i12 = iArr[i11];
        if (zzL(obj2, i12, i11)) {
            int iZzx = zzx(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = iZzx;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                int i13 = iArr[i11];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i13);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zznx zznxVarZzp = zzp(i11);
            if (!zzL(obj, i12, i11)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j11, objZza);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzM(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j11, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i11) {
        Object[] objArr = this.zzd;
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zznx zznxVar = (zznx) objArr[i13];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zznxVarZzb = zznu.zza().zzb((Class) objArr[i13 + 1]);
        objArr[i13] = zznxVarZzb;
        return zznxVarZzb;
    }

    private final Object zzq(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private final zzmk zzr(int i11) {
        int i12 = i11 / 3;
        return (zzmk) this.zzd[i12 + i12 + 1];
    }

    private final Object zzs(Object obj, int i11) {
        zznx zznxVarZzp = zzp(i11);
        int iZzx = zzx(i11) & 1048575;
        if (!zzJ(obj, i11)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, iZzx);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzt(Object obj, int i11, Object obj2) {
        zzb.putObject(obj, zzx(i11) & 1048575, obj2);
        zzK(obj, i11);
    }

    private final Object zzu(Object obj, int i11, int i12) {
        zznx zznxVarZzp = zzp(i12);
        if (!zzL(obj, i11, i12)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i12) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzv(Object obj, int i11, int i12, Object obj2) {
        zzb.putObject(obj, zzx(i12) & 1048575, obj2);
        zzM(obj, i11, i12);
    }

    private static boolean zzw(Object obj, int i11, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i11 & 1048575));
    }

    private final int zzx(int i11) {
        return this.zzc[i11 + 1];
    }

    private final int zzy(int i11) {
        return this.zzc[i11 + 2];
    }

    private static int zzz(int i11) {
        return (i11 >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzB;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzx = zzx(i11);
            long j11 = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (!zzH(obj, obj2, i11) || Double.doubleToLongBits(zzop.zzl(obj, j11)) != Double.doubleToLongBits(zzop.zzl(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i11) || Float.floatToIntBits(zzop.zzj(obj, j11)) != Float.floatToIntBits(zzop.zzj(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i11) || zzop.zzf(obj, j11) != zzop.zzf(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i11) || zzop.zzf(obj, j11) != zzop.zzf(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i11) || zzop.zzd(obj, j11) != zzop.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i11) || zzop.zzf(obj, j11) != zzop.zzf(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i11) || zzop.zzd(obj, j11) != zzop.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i11) || zzop.zzh(obj, j11) != zzop.zzh(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i11) || !zznz.zzB(zzop.zzn(obj, j11), zzop.zzn(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i11) || !zznz.zzB(zzop.zzn(obj, j11), zzop.zzn(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i11) || !zznz.zzB(zzop.zzn(obj, j11), zzop.zzn(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i11) || zzop.zzd(obj, j11) != zzop.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i11) || zzop.zzd(obj, j11) != zzop.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i11) || zzop.zzd(obj, j11) != zzop.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i11) || zzop.zzf(obj, j11) != zzop.zzf(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i11) || zzop.zzd(obj, j11) != zzop.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i11) || zzop.zzf(obj, j11) != zzop.zzf(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i11) || !zznz.zzB(zzop.zzn(obj, j11), zzop.zzn(obj2, j11))) {
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
                    zZzB = zznz.zzB(zzop.zzn(obj, j11), zzop.zzn(obj2, j11));
                    break;
                case 50:
                    zZzB = zznz.zzB(zzop.zzn(obj, j11), zzop.zzn(obj2, j11));
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
                    long jZzy = zzy(i11) & 1048575;
                    if (zzop.zzd(obj, jZzy) != zzop.zzd(obj2, jZzy) || !zznz.zzB(zzop.zzn(obj, j11), zzop.zzn(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i11;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i13 >= iArr.length) {
                int iHashCode = (i14 * 53) + ((zzmf) obj).zzc.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzx = zzx(i13);
            int i15 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i16 = iArr[i13];
            long j11 = i15;
            int iHashCode2 = 37;
            switch (iZzz) {
                case 0:
                    i11 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j11));
                    byte[] bArr = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 1:
                    i11 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j11));
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 2:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j11);
                    byte[] bArr2 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 3:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j11);
                    byte[] bArr3 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 4:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j11);
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 5:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j11);
                    byte[] bArr4 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 6:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j11);
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 7:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzmp.zzb(zzop.zzh(obj, j11));
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 8:
                    i11 = i14 * 53;
                    iFloatToIntBits = ((String) zzop.zzn(obj, j11)).hashCode();
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 9:
                    i12 = i14 * 53;
                    Object objZzn = zzop.zzn(obj, j11);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i14 = i12 + iHashCode2;
                    break;
                case 10:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j11).hashCode();
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 11:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j11);
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 12:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j11);
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 13:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j11);
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 14:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j11);
                    byte[] bArr5 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 15:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j11);
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 16:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j11);
                    byte[] bArr6 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 17:
                    i12 = i14 * 53;
                    Object objZzn2 = zzop.zzn(obj, j11);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i14 = i12 + iHashCode2;
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
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j11).hashCode();
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 50:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j11).hashCode();
                    i14 = i11 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzC(obj, j11));
                        byte[] bArr7 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzD(obj, j11));
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzF(obj, j11);
                        byte[] bArr8 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzF(obj, j11);
                        byte[] bArr9 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzE(obj, j11);
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzF(obj, j11);
                        byte[] bArr10 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzE(obj, j11);
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzmp.zzb(zzG(obj, j11));
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((String) zzop.zzn(obj, j11)).hashCode();
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j11).hashCode();
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j11).hashCode();
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzE(obj, j11);
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzE(obj, j11);
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzE(obj, j11);
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzF(obj, j11);
                        byte[] bArr11 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzE(obj, j11);
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzF(obj, j11);
                        byte[] bArr12 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzL(obj, i16, i13)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j11).hashCode();
                        i14 = i11 + iFloatToIntBits;
                    }
                    break;
            }
            i13 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i11 >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzx = zzx(i11);
            int i12 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i13 = iArr[i11];
            long j11 = i12;
            switch (iZzz) {
                case 0:
                    if (zzJ(obj2, i11)) {
                        zzop.zzm(obj, j11, zzop.zzl(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 1:
                    if (zzJ(obj2, i11)) {
                        zzop.zzk(obj, j11, zzop.zzj(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 2:
                    if (zzJ(obj2, i11)) {
                        zzop.zzg(obj, j11, zzop.zzf(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 3:
                    if (zzJ(obj2, i11)) {
                        zzop.zzg(obj, j11, zzop.zzf(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 4:
                    if (zzJ(obj2, i11)) {
                        zzop.zze(obj, j11, zzop.zzd(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 5:
                    if (zzJ(obj2, i11)) {
                        zzop.zzg(obj, j11, zzop.zzf(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 6:
                    if (zzJ(obj2, i11)) {
                        zzop.zze(obj, j11, zzop.zzd(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 7:
                    if (zzJ(obj2, i11)) {
                        zzop.zzi(obj, j11, zzop.zzh(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 8:
                    if (zzJ(obj2, i11)) {
                        zzop.zzo(obj, j11, zzop.zzn(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 9:
                    zzn(obj, obj2, i11);
                    break;
                case 10:
                    if (zzJ(obj2, i11)) {
                        zzop.zzo(obj, j11, zzop.zzn(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 11:
                    if (zzJ(obj2, i11)) {
                        zzop.zze(obj, j11, zzop.zzd(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 12:
                    if (zzJ(obj2, i11)) {
                        zzop.zze(obj, j11, zzop.zzd(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 13:
                    if (zzJ(obj2, i11)) {
                        zzop.zze(obj, j11, zzop.zzd(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 14:
                    if (zzJ(obj2, i11)) {
                        zzop.zzg(obj, j11, zzop.zzf(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 15:
                    if (zzJ(obj2, i11)) {
                        zzop.zze(obj, j11, zzop.zzd(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 16:
                    if (zzJ(obj2, i11)) {
                        zzop.zzg(obj, j11, zzop.zzf(obj2, j11));
                        zzK(obj, i11);
                    }
                    break;
                case 17:
                    zzn(obj, obj2, i11);
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
                    zzmo zzmoVarZzg = (zzmo) zzop.zzn(obj, j11);
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj2, j11);
                    int size = zzmoVarZzg.size();
                    int size2 = zzmoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVarZzg.zza()) {
                            zzmoVarZzg = zzmoVarZzg.zzg(size2 + size);
                        }
                        zzmoVarZzg.addAll(zzmoVar);
                    }
                    if (size > 0) {
                        zzmoVar = zzmoVarZzg;
                    }
                    zzop.zzo(obj, j11, zzmoVar);
                    break;
                case 50:
                    int i14 = zznz.zza;
                    zzop.zzo(obj, j11, zznh.zza(zzop.zzn(obj, j11), zzop.zzn(obj2, j11)));
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
                    if (zzL(obj2, i13, i11)) {
                        zzop.zzo(obj, j11, zzop.zzn(obj2, j11));
                        zzM(obj, i13, i11);
                    }
                    break;
                case 60:
                    zzo(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzL(obj2, i13, i11)) {
                        zzop.zzo(obj, j11, zzop.zzn(obj2, j11));
                        zzM(obj, i13, i11);
                    }
                    break;
                case 68:
                    zzo(obj, obj2, i11);
                    break;
            }
            i11 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x038e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i11;
        int iZzz;
        int iZzz2;
        int iZzA;
        int iZzz3;
        int iZzz4;
        int iZzz5;
        int iZzc;
        int iZzz6;
        int iZzz7;
        int iZzo;
        int size;
        int iZzp;
        int iZzz8;
        int iZzz9;
        int iZzz10;
        int iZzA2;
        int iZzx;
        int iZzz11;
        int iZzz12;
        int iZzG;
        int iZzz13;
        int iZzz14;
        int iZzz15;
        int iZzc2;
        int iZzz16;
        zznp<T> zznpVar = this;
        Unsafe unsafe = zzb;
        int i12 = 0;
        int i13 = 0;
        int iZzz17 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = zznpVar.zzc;
            if (i12 >= iArr.length) {
                int iZzi = iZzz17 + ((zzmf) obj).zzc.zzi();
                if (!zznpVar.zzh) {
                    return iZzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int iZzc3 = zzoeVar.zzc();
                int iZzj = 0;
                for (int i15 = 0; i15 < iZzc3; i15++) {
                    Map.Entry entryZzd = zzoeVar.zzd(i15);
                    iZzj += zzlw.zzj((zzlv) ((zzob) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    iZzj += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzx2 = zznpVar.zzx(i12);
            int iZzz18 = zzz(iZzx2);
            int i16 = iArr[i12];
            int i17 = iArr[i12 + 2];
            int i18 = i17 & 1048575;
            if (iZzz18 <= 17) {
                if (i18 != i14) {
                    i13 = i18 == 1048575 ? 0 : unsafe.getInt(obj, i18);
                    i14 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i11 = 0;
            }
            int i19 = iZzx2 & 1048575;
            if (iZzz18 >= zzlx.zzJ.zza()) {
                zzlx.zzW.zza();
            }
            long j11 = i19;
            switch (iZzz18) {
                case 0:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz17 += zzlm.zzz(i16 << 3) + 8;
                    }
                    break;
                case 1:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz = zzlm.zzz(i16 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        long j12 = unsafe.getLong(obj, j11);
                        iZzz2 = zzlm.zzz(i16 << 3);
                        iZzA = zzlm.zzA(j12);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        long j13 = unsafe.getLong(obj, j11);
                        iZzz2 = zzlm.zzz(i16 << 3);
                        iZzA = zzlm.zzA(j13);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        long j14 = unsafe.getInt(obj, j11);
                        iZzz2 = zzlm.zzz(i16 << 3);
                        iZzA = zzlm.zzA(j14);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz3 = zzlm.zzz(i16 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz = zzlm.zzz(i16 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz4 = zzlm.zzz(i16 << 3) + 1;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        int i21 = i16 << 3;
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof zzlh) {
                            iZzz5 = zzlm.zzz(i21);
                            iZzc = ((zzlh) object).zzc();
                            iZzz6 = zzlm.zzz(iZzc);
                            iZzz4 = iZzz5 + iZzz6 + iZzc;
                            iZzz17 += iZzz4;
                        } else {
                            iZzz2 = zzlm.zzz(i21);
                            iZzA = zzlm.zzB((String) object);
                            iZzz4 = iZzz2 + iZzA;
                            iZzz17 += iZzz4;
                        }
                    }
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz7 = zznz.zzz(i16, unsafe.getObject(obj, j11), zznpVar.zzp(i12));
                        iZzz17 += iZzz7;
                    }
                    break;
                case 10:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj, j11);
                        iZzz5 = zzlm.zzz(i16 << 3);
                        iZzc = zzlhVar.zzc();
                        iZzz6 = zzlm.zzz(iZzc);
                        iZzz4 = iZzz5 + iZzz6 + iZzc;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        int i22 = unsafe.getInt(obj, j11);
                        iZzz2 = zzlm.zzz(i16 << 3);
                        iZzA = zzlm.zzz(i22);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        long j15 = unsafe.getInt(obj, j11);
                        iZzz2 = zzlm.zzz(i16 << 3);
                        iZzA = zzlm.zzA(j15);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz = zzlm.zzz(i16 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz3 = zzlm.zzz(i16 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        int i23 = unsafe.getInt(obj, j11);
                        iZzz2 = zzlm.zzz(i16 << 3);
                        iZzA = zzlm.zzz((i23 >> 31) ^ (i23 + i23));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        long j16 = unsafe.getLong(obj, j11);
                        iZzz2 = zzlm.zzz(i16 << 3);
                        iZzA = zzlm.zzA((j16 >> 63) ^ (j16 + j16));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz17 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj, i12, i14, i13, i11)) {
                        iZzz7 = zzlm.zzG(i16, (zznm) unsafe.getObject(obj, j11), zznpVar.zzp(i12));
                        iZzz17 += iZzz7;
                    }
                    break;
                case 18:
                    iZzz7 = zznz.zzy(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzz17 += iZzz7;
                    break;
                case 19:
                    iZzz7 = zznz.zzw(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzz17 += iZzz7;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j11);
                    int i24 = zznz.zza;
                    if (list.size() == 0) {
                        iZzo = 0;
                    } else {
                        iZzo = zznz.zzo(list) + (list.size() * zzlm.zzz(i16 << 3));
                    }
                    iZzz17 += iZzo;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j11);
                    int i25 = zznz.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzp(list2);
                        iZzz8 = zzlm.zzz(i16 << 3);
                        iZzA2 = size * iZzz8;
                        iZzz7 = iZzp + iZzA2;
                    }
                    iZzz17 += iZzz7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j11);
                    int i26 = zznz.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzs(list3);
                        iZzz8 = zzlm.zzz(i16 << 3);
                        iZzA2 = size * iZzz8;
                        iZzz7 = iZzp + iZzA2;
                    }
                    iZzz17 += iZzz7;
                    break;
                case 23:
                    iZzz7 = zznz.zzy(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzz17 += iZzz7;
                    break;
                case 24:
                    iZzz7 = zznz.zzw(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzz17 += iZzz7;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j11);
                    int i27 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = size2 * (zzlm.zzz(i16 << 3) + 1);
                    }
                    iZzz17 += iZzz7;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j11);
                    int i28 = zznz.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzo = 0;
                    } else {
                        iZzo = zzlm.zzz(i16 << 3) * size3;
                        if (list5 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) list5;
                            for (int i29 = 0; i29 < size3; i29++) {
                                Object objZzc = zzmxVar.zzc();
                                if (objZzc instanceof zzlh) {
                                    int iZzc4 = ((zzlh) objZzc).zzc();
                                    iZzo += zzlm.zzz(iZzc4) + iZzc4;
                                } else {
                                    iZzo += zzlm.zzB((String) objZzc);
                                }
                            }
                        } else {
                            for (int i31 = 0; i31 < size3; i31++) {
                                Object obj2 = list5.get(i31);
                                if (obj2 instanceof zzlh) {
                                    int iZzc5 = ((zzlh) obj2).zzc();
                                    iZzo += zzlm.zzz(iZzc5) + iZzc5;
                                } else {
                                    iZzo += zzlm.zzB((String) obj2);
                                }
                            }
                        }
                    }
                    iZzz17 += iZzo;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j11);
                    zznx zznxVarZzp = zznpVar.zzp(i12);
                    int i32 = zznz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzz9 = 0;
                    } else {
                        iZzz9 = zzlm.zzz(i16 << 3) * size4;
                        for (int i33 = 0; i33 < size4; i33++) {
                            Object obj3 = list6.get(i33);
                            if (obj3 instanceof zzmw) {
                                int iZzb = ((zzmw) obj3).zzb();
                                iZzz9 += zzlm.zzz(iZzb) + iZzb;
                            } else {
                                iZzz9 += zzlm.zzD((zznm) obj3, zznxVarZzp);
                            }
                        }
                    }
                    iZzz17 += iZzz9;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j11);
                    int i34 = zznz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzz10 = 0;
                    } else {
                        iZzz10 = size5 * zzlm.zzz(i16 << 3);
                        for (int i35 = 0; i35 < list7.size(); i35++) {
                            int iZzc6 = ((zzlh) list7.get(i35)).zzc();
                            iZzz10 += zzlm.zzz(iZzc6) + iZzc6;
                        }
                    }
                    iZzz17 += iZzz10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j11);
                    int i36 = zznz.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzt(list8);
                        iZzz8 = zzlm.zzz(i16 << 3);
                        iZzA2 = size * iZzz8;
                        iZzz7 = iZzp + iZzA2;
                    }
                    iZzz17 += iZzz7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j11);
                    int i37 = zznz.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzr(list9);
                        iZzz8 = zzlm.zzz(i16 << 3);
                        iZzA2 = size * iZzz8;
                        iZzz7 = iZzp + iZzA2;
                    }
                    iZzz17 += iZzz7;
                    break;
                case 31:
                    iZzz7 = zznz.zzw(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzz17 += iZzz7;
                    break;
                case 32:
                    iZzz7 = zznz.zzy(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzz17 += iZzz7;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j11);
                    int i38 = zznz.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzu(list10);
                        iZzz8 = zzlm.zzz(i16 << 3);
                        iZzA2 = size * iZzz8;
                        iZzz7 = iZzp + iZzA2;
                    }
                    iZzz17 += iZzz7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j11);
                    int i39 = zznz.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzq(list11);
                        iZzz8 = zzlm.zzz(i16 << 3);
                        iZzA2 = size * iZzz8;
                        iZzz7 = iZzp + iZzA2;
                    }
                    iZzz17 += iZzz7;
                    break;
                case 35:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 36:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 37:
                    iZzx = zznz.zzo((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 38:
                    iZzx = zznz.zzp((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 39:
                    iZzx = zznz.zzs((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 40:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 41:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j11);
                    int i41 = zznz.zza;
                    iZzx = list12.size();
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 43:
                    iZzx = zznz.zzt((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 44:
                    iZzx = zznz.zzr((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 45:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 46:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 47:
                    iZzx = zznz.zzu((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 48:
                    iZzx = zznz.zzq((List) unsafe.getObject(obj, j11));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i16 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz17 += iZzz10;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j11);
                    zznx zznxVarZzp2 = zznpVar.zzp(i12);
                    int i42 = zznz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzG = 0;
                    } else {
                        iZzG = 0;
                        for (int i43 = 0; i43 < size6; i43++) {
                            iZzG += zzlm.zzG(i16, (zznm) list13.get(i43), zznxVarZzp2);
                        }
                    }
                    iZzz17 += iZzG;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj, j11);
                    zznf zznfVar = (zznf) zznpVar.zzq(i12);
                    if (zzngVar.isEmpty()) {
                        iZzo = 0;
                    } else {
                        iZzo = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            iZzo += zznfVar.zzd(i16, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzz17 += iZzo;
                    break;
                case 51:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz13 = zzlm.zzz(i16 << 3);
                        iZzz7 = iZzz13 + 8;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 52:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz14 = zzlm.zzz(i16 << 3);
                        iZzz7 = iZzz14 + 4;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 53:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        long jZzF = zzF(obj, j11);
                        iZzp = zzlm.zzz(i16 << 3);
                        iZzA2 = zzlm.zzA(jZzF);
                        iZzz7 = iZzp + iZzA2;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 54:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        long jZzF2 = zzF(obj, j11);
                        iZzp = zzlm.zzz(i16 << 3);
                        iZzA2 = zzlm.zzA(jZzF2);
                        iZzz7 = iZzp + iZzA2;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 55:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        long jZzE = zzE(obj, j11);
                        iZzp = zzlm.zzz(i16 << 3);
                        iZzA2 = zzlm.zzA(jZzE);
                        iZzz7 = iZzp + iZzA2;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 56:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz13 = zzlm.zzz(i16 << 3);
                        iZzz7 = iZzz13 + 8;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 57:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz14 = zzlm.zzz(i16 << 3);
                        iZzz7 = iZzz14 + 4;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 58:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz7 = zzlm.zzz(i16 << 3) + 1;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 59:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        int i44 = i16 << 3;
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof zzlh) {
                            iZzz15 = zzlm.zzz(i44);
                            iZzc2 = ((zzlh) object2).zzc();
                            iZzz16 = zzlm.zzz(iZzc2);
                            iZzz7 = iZzz15 + iZzz16 + iZzc2;
                            iZzz17 += iZzz7;
                        } else {
                            iZzp = zzlm.zzz(i44);
                            iZzA2 = zzlm.zzB((String) object2);
                            iZzz7 = iZzp + iZzA2;
                            iZzz17 += iZzz7;
                        }
                    }
                    break;
                case 60:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz7 = zznz.zzz(i16, unsafe.getObject(obj, j11), zznpVar.zzp(i12));
                        iZzz17 += iZzz7;
                    }
                    break;
                case 61:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj, j11);
                        iZzz15 = zzlm.zzz(i16 << 3);
                        iZzc2 = zzlhVar2.zzc();
                        iZzz16 = zzlm.zzz(iZzc2);
                        iZzz7 = iZzz15 + iZzz16 + iZzc2;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 62:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        int iZzE = zzE(obj, j11);
                        iZzp = zzlm.zzz(i16 << 3);
                        iZzA2 = zzlm.zzz(iZzE);
                        iZzz7 = iZzp + iZzA2;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 63:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        long jZzE2 = zzE(obj, j11);
                        iZzp = zzlm.zzz(i16 << 3);
                        iZzA2 = zzlm.zzA(jZzE2);
                        iZzz7 = iZzp + iZzA2;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 64:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz14 = zzlm.zzz(i16 << 3);
                        iZzz7 = iZzz14 + 4;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 65:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz13 = zzlm.zzz(i16 << 3);
                        iZzz7 = iZzz13 + 8;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 66:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        int iZzE2 = zzE(obj, j11);
                        iZzp = zzlm.zzz(i16 << 3);
                        iZzA2 = zzlm.zzz((iZzE2 >> 31) ^ (iZzE2 + iZzE2));
                        iZzz7 = iZzp + iZzA2;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 67:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        long jZzF3 = zzF(obj, j11);
                        iZzp = zzlm.zzz(i16 << 3);
                        iZzA2 = zzlm.zzA((jZzF3 >> 63) ^ (jZzF3 + jZzF3));
                        iZzz7 = iZzp + iZzA2;
                        iZzz17 += iZzz7;
                    }
                    break;
                case 68:
                    if (zznpVar.zzL(obj, i16, i12)) {
                        iZzz7 = zzlm.zzG(i16, (zznm) unsafe.getObject(obj, j11), zznpVar.zzp(i12));
                        iZzz17 += iZzz7;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzf(Object obj, zzov zzovVar) {
        Map.Entry entry;
        int i11;
        zznp<T> zznpVar = this;
        if (zznpVar.zzh) {
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (zzlwVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzlwVar.zzc().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zznpVar.zzc;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < iArr.length) {
            int iZzx = zznpVar.zzx(i14);
            int iZzz = zzz(iZzx);
            int i16 = iArr[i14];
            if (iZzz <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i11 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j11 = iZzx & i12;
            switch (iZzz) {
                case 0:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzf(i16, zzop.zzl(obj, j11));
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 1:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zze(i16, zzop.zzj(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzc(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzh(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzi(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzj(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzk(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzl(i16, zzop.zzh(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzP(i16, unsafe.getObject(obj, j11), zzovVar);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzr(i16, unsafe.getObject(obj, j11), zznpVar.zzp(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 10:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzn(i16, (zzlh) unsafe.getObject(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzo(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzg(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzb(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzd(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzp(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzq(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj, i14, i13, i15, i11)) {
                        zzovVar.zzs(i16, unsafe.getObject(obj, j11), zznpVar.zzp(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 18:
                    zznz.zza(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 19:
                    zznz.zzb(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 20:
                    zznz.zzc(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 21:
                    zznz.zzd(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 22:
                    zznz.zzh(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 23:
                    zznz.zzf(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 24:
                    zznz.zzk(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 25:
                    zznz.zzn(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 26:
                    int i19 = iArr[i14];
                    List list = (List) unsafe.getObject(obj, j11);
                    int i21 = zznz.zza;
                    if (list != null && !list.isEmpty()) {
                        zzovVar.zzF(i19, list);
                    }
                    break;
                case 27:
                    int i22 = iArr[i14];
                    List list2 = (List) unsafe.getObject(obj, j11);
                    zznx zznxVarZzp = zznpVar.zzp(i14);
                    int i23 = zznz.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((zzln) zzovVar).zzr(i22, list2.get(i24), zznxVarZzp);
                        }
                    }
                    break;
                case 28:
                    int i25 = iArr[i14];
                    List list3 = (List) unsafe.getObject(obj, j11);
                    int i26 = zznz.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzovVar.zzG(i25, list3);
                    }
                    break;
                case 29:
                    zznz.zzi(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 30:
                    zznz.zzm(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 31:
                    zznz.zzl(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 32:
                    zznz.zzg(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 33:
                    zznz.zzj(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 34:
                    zznz.zze(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zznpVar = this;
                    break;
                case 35:
                    zznz.zza(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 36:
                    zznz.zzb(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 37:
                    zznz.zzc(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 38:
                    zznz.zzd(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 39:
                    zznz.zzh(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 40:
                    zznz.zzf(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 41:
                    zznz.zzk(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 42:
                    zznz.zzn(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 43:
                    zznz.zzi(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 44:
                    zznz.zzm(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 45:
                    zznz.zzl(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 46:
                    zznz.zzg(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 47:
                    zznz.zzj(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 48:
                    zznz.zze(iArr[i14], (List) unsafe.getObject(obj, j11), zzovVar, true);
                    break;
                case 49:
                    int i27 = iArr[i14];
                    List list4 = (List) unsafe.getObject(obj, j11);
                    zznx zznxVarZzp2 = zznpVar.zzp(i14);
                    int i28 = zznz.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            ((zzln) zzovVar).zzs(i27, list4.get(i29), zznxVarZzp2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j11);
                    if (object != null) {
                        zzovVar.zzM(i16, ((zznf) zznpVar.zzq(i14)).zze(), (zzng) object);
                    }
                    break;
                case 51:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzf(i16, zzC(obj, j11));
                    }
                    break;
                case 52:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zze(i16, zzD(obj, j11));
                    }
                    break;
                case 53:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzc(i16, zzF(obj, j11));
                    }
                    break;
                case 54:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzh(i16, zzF(obj, j11));
                    }
                    break;
                case 55:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzi(i16, zzE(obj, j11));
                    }
                    break;
                case 56:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzj(i16, zzF(obj, j11));
                    }
                    break;
                case 57:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzk(i16, zzE(obj, j11));
                    }
                    break;
                case 58:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzl(i16, zzG(obj, j11));
                    }
                    break;
                case 59:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzP(i16, unsafe.getObject(obj, j11), zzovVar);
                    }
                    break;
                case 60:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzr(i16, unsafe.getObject(obj, j11), zznpVar.zzp(i14));
                    }
                    break;
                case 61:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzn(i16, (zzlh) unsafe.getObject(obj, j11));
                    }
                    break;
                case 62:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzo(i16, zzE(obj, j11));
                    }
                    break;
                case 63:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzg(i16, zzE(obj, j11));
                    }
                    break;
                case 64:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzb(i16, zzE(obj, j11));
                    }
                    break;
                case 65:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzd(i16, zzF(obj, j11));
                    }
                    break;
                case 66:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzp(i16, zzE(obj, j11));
                    }
                    break;
                case 67:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzq(i16, zzF(obj, j11));
                    }
                    break;
                case 68:
                    if (zznpVar.zzL(obj, i16, i14)) {
                        zzovVar.zzs(i16, unsafe.getObject(obj, j11), zznpVar.zzp(i14));
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
            zznpVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzmf) obj).zzc.zzg(zzovVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzh(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.zzkw r40) {
        /*
            Method dump skipped, instruction units count: 4198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i11, int i12, zzkw zzkwVar) {
        zzh(obj, bArr, i11, i12, 0, zzkwVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        if (zzA(obj)) {
            if (obj instanceof zzmf) {
                zzmf zzmfVar = (zzmf) obj;
                zzmfVar.zzcm(Integer.MAX_VALUE);
                zzmfVar.zza = 0;
                zzmfVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i11 = 0; i11 < iArr.length; i11 += 3) {
                int iZzx = zzx(i11);
                int i12 = 1048575 & iZzx;
                int iZzz = zzz(iZzx);
                long j11 = i12;
                if (iZzz != 9) {
                    if (iZzz != 60 && iZzz != 68) {
                        switch (iZzz) {
                            case 17:
                                if (zzJ(obj, i11)) {
                                    zzp(i11).zzj(zzb.getObject(obj, j11));
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
                                ((zzmo) zzop.zzn(obj, j11)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((zzng) object).zzd();
                                    unsafe.putObject(obj, j11, object);
                                }
                                break;
                        }
                    } else if (zzL(obj, iArr[i11], i11)) {
                        zzp(i11).zzj(zzb.getObject(obj, j11));
                    }
                } else if (zzJ(obj, i11)) {
                    zzp(i11).zzj(zzb.getObject(obj, j11));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzk(Object obj) {
        int i11;
        int i12;
        List list;
        zznx zznxVarZzp;
        int i13;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i15 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i17 = iArr[i15];
            int i18 = iArr2[i17];
            int iZzx = zzx(i17);
            int i19 = iArr2[i17 + 2];
            int i21 = i19 & 1048575;
            int i22 = 1 << (i19 >>> 20);
            if (i21 != i16) {
                if (i21 != 1048575) {
                    i14 = zzb.getInt(obj, i21);
                }
                i12 = i14;
                i11 = i21;
            } else {
                int i23 = i14;
                i11 = i16;
                i12 = i23;
            }
            if ((268435456 & iZzx) != 0 && !zzI(obj, i17, i11, i12, i22)) {
                return false;
            }
            int iZzz = zzz(iZzx);
            if (iZzz == 9 || iZzz == 17) {
                if (zzI(obj, i17, i11, i12, i22) && !zzw(obj, iZzx, zzp(i17))) {
                    return false;
                }
            } else if (iZzz == 27) {
                list = (List) zzop.zzn(obj, iZzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznxVarZzp = zzp(i17);
                    for (i13 = 0; i13 < list.size(); i13++) {
                        if (!zznxVarZzp.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (iZzz == 60 || iZzz == 68) {
                if (zzL(obj, i18, i17) && !zzw(obj, iZzx, zzp(i17))) {
                    return false;
                }
            } else if (iZzz == 49) {
                list = (List) zzop.zzn(obj, iZzx & 1048575);
                if (list.isEmpty()) {
                    zznxVarZzp = zzp(i17);
                    while (i13 < list.size()) {
                        if (!zznxVarZzp.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzz != 50) {
                continue;
            } else {
                zzng zzngVar = (zzng) zzop.zzn(obj, iZzx & 1048575);
                if (!zzngVar.isEmpty() && ((zznf) zzq(i17)).zze().zzc.zza() == zzou.MESSAGE) {
                    zznx zznxVarZzb = null;
                    for (Object obj2 : zzngVar.values()) {
                        if (zznxVarZzb == null) {
                            zznxVarZzb = zznu.zza().zzb(obj2.getClass());
                        }
                        if (!zznxVarZzb.zzk(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i15++;
            i16 = i11;
            i14 = i12;
        }
        return !this.zzh || ((zzmc) obj).zzb.zze();
    }
}
