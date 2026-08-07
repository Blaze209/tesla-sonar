package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i11, int i12, zzfx zzfxVar, int i13, boolean z11, int[] iArr2, int i14, int i15, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i11;
        this.zzf = i12;
        this.zzh = iArr2;
        this.zzi = i14;
        this.zzj = i15;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i11, int i12) {
        zzhj.zzn(obj, zzl(i12) & 1048575, i11);
    }

    private final void zzB(Object obj, int i11, Object obj2) {
        zzb.putObject(obj, zzo(i11) & 1048575, obj2);
        zzz(obj, i11);
    }

    private final void zzC(Object obj, int i11, int i12, Object obj2) {
        zzb.putObject(obj, zzo(i12) & 1048575, obj2);
        zzA(obj, i11, i12);
    }

    private final boolean zzD(Object obj, Object obj2, int i11) {
        return zzE(obj, i11) == zzE(obj2, i11);
    }

    private final boolean zzE(Object obj, int i11) {
        int iZzl = zzl(i11);
        long j11 = iZzl & 1048575;
        if (j11 != 1048575) {
            return (zzhj.zzc(obj, j11) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i11);
        long j12 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j12)) != 0;
            case 2:
                return zzhj.zzd(obj, j12) != 0;
            case 3:
                return zzhj.zzd(obj, j12) != 0;
            case 4:
                return zzhj.zzc(obj, j12) != 0;
            case 5:
                return zzhj.zzd(obj, j12) != 0;
            case 6:
                return zzhj.zzc(obj, j12) != 0;
            case 7:
                return zzhj.zzt(obj, j12);
            case 8:
                Object objZzf = zzhj.zzf(obj, j12);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j12) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j12));
            case 11:
                return zzhj.zzc(obj, j12) != 0;
            case 12:
                return zzhj.zzc(obj, j12) != 0;
            case 13:
                return zzhj.zzc(obj, j12) != 0;
            case 14:
                return zzhj.zzd(obj, j12) != 0;
            case 15:
                return zzhj.zzc(obj, j12) != 0;
            case 16:
                return zzhj.zzd(obj, j12) != 0;
            case 17:
                return zzhj.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return zzE(obj, i11);
        }
        return (i13 & i14) != 0;
    }

    private static boolean zzG(Object obj, int i11, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i11 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i11, int i12) {
        return zzhj.zzc(obj, (long) (zzl(i12) & 1048575)) == i11;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x025a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0270  */
    /* JADX WARN: Code duplicated, block: B:129:0x0273  */
    static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i11;
        int iCharAt;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
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
        zzgh zzghVar;
        int i29;
        int i31;
        int i32;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Field fieldZzv;
        char cCharAt9;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldZzv2;
        int i36;
        Object obj2;
        Field fieldZzv3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i41;
        char cCharAt13;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String strZzd = zzghVar2.zzd();
        int length = strZzd.length();
        char c11 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i11 = i42 + 1;
                if (strZzd.charAt(i42) < 55296) {
                    break;
                }
                i42 = i11;
            }
        } else {
            i11 = 1;
        }
        int i43 = i11 + 1;
        int iCharAt2 = strZzd.charAt(i11);
        if (iCharAt2 >= 55296) {
            int i44 = iCharAt2 & 8191;
            int i45 = 13;
            while (true) {
                i41 = i43 + 1;
                cCharAt13 = strZzd.charAt(i43);
                if (cCharAt13 < 55296) {
                    break;
                }
                i44 |= (cCharAt13 & 8191) << i45;
                i45 += 13;
                i43 = i41;
            }
            iCharAt2 = i44 | (cCharAt13 << i45);
            i43 = i41;
        }
        if (iCharAt2 == 0) {
            i14 = 0;
            iCharAt = 0;
            i13 = 0;
            i15 = 0;
            i12 = 0;
            i16 = 0;
            iArr = zza;
            i17 = 0;
        } else {
            int i46 = i43 + 1;
            int iCharAt3 = strZzd.charAt(i43);
            if (iCharAt3 >= 55296) {
                int i47 = iCharAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i26 = i46 + 1;
                    cCharAt8 = strZzd.charAt(i46);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i26;
                }
                iCharAt3 = i47 | (cCharAt8 << i48);
                i46 = i26;
            }
            int i49 = i46 + 1;
            int iCharAt4 = strZzd.charAt(i46);
            if (iCharAt4 >= 55296) {
                int i51 = iCharAt4 & 8191;
                int i52 = 13;
                while (true) {
                    i25 = i49 + 1;
                    cCharAt7 = strZzd.charAt(i49);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt7 & 8191) << i52;
                    i52 += 13;
                    i49 = i25;
                }
                iCharAt4 = i51 | (cCharAt7 << i52);
                i49 = i25;
            }
            int i53 = i49 + 1;
            int iCharAt5 = strZzd.charAt(i49);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = 13;
                while (true) {
                    i24 = i53 + 1;
                    cCharAt6 = strZzd.charAt(i53);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i24;
                }
                iCharAt5 = i54 | (cCharAt6 << i55);
                i53 = i24;
            }
            int i56 = i53 + 1;
            int iCharAt6 = strZzd.charAt(i53);
            if (iCharAt6 >= 55296) {
                int i57 = iCharAt6 & 8191;
                int i58 = 13;
                while (true) {
                    i23 = i56 + 1;
                    cCharAt5 = strZzd.charAt(i56);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i23;
                }
                iCharAt6 = i57 | (cCharAt5 << i58);
                i56 = i23;
            }
            int i59 = i56 + 1;
            iCharAt = strZzd.charAt(i56);
            if (iCharAt >= 55296) {
                int i61 = iCharAt & 8191;
                int i62 = 13;
                while (true) {
                    i22 = i59 + 1;
                    cCharAt4 = strZzd.charAt(i59);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt4 & 8191) << i62;
                    i62 += 13;
                    i59 = i22;
                }
                iCharAt = i61 | (cCharAt4 << i62);
                i59 = i22;
            }
            int i63 = i59 + 1;
            int iCharAt7 = strZzd.charAt(i59);
            if (iCharAt7 >= 55296) {
                int i64 = iCharAt7 & 8191;
                int i65 = 13;
                while (true) {
                    i21 = i63 + 1;
                    cCharAt3 = strZzd.charAt(i63);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i21;
                }
                iCharAt7 = i64 | (cCharAt3 << i65);
                i63 = i21;
            }
            int i66 = i63 + 1;
            int iCharAt8 = strZzd.charAt(i63);
            if (iCharAt8 >= 55296) {
                int i67 = iCharAt8 & 8191;
                int i68 = 13;
                while (true) {
                    i19 = i66 + 1;
                    cCharAt2 = strZzd.charAt(i66);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i19;
                }
                iCharAt8 = i67 | (cCharAt2 << i68);
                i66 = i19;
            }
            int i69 = i66 + 1;
            int iCharAt9 = strZzd.charAt(i66);
            if (iCharAt9 >= 55296) {
                int i71 = iCharAt9 & 8191;
                int i72 = 13;
                while (true) {
                    i18 = i69 + 1;
                    cCharAt = strZzd.charAt(i69);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i71 |= (cCharAt & 8191) << i72;
                    i72 += 13;
                    i69 = i18;
                }
                iCharAt9 = i71 | (cCharAt << i72);
                i69 = i18;
            }
            i12 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i73 = iCharAt7;
            i13 = iCharAt5;
            i14 = i73;
            iArr = iArr2;
            i15 = iCharAt6;
            i16 = iCharAt9;
            i17 = iCharAt3;
            i43 = i69;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i74 = i16 + i14;
        int i75 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i75];
        int i76 = 0;
        int i77 = 0;
        int i78 = i16;
        int i79 = i74;
        while (i43 < length) {
            int i81 = i43 + 1;
            int iCharAt10 = strZzd.charAt(i43);
            if (iCharAt10 >= c11) {
                int i82 = iCharAt10 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i39 = i83 + 1;
                    cCharAt12 = strZzd.charAt(i83);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i82 |= (cCharAt12 & 8191) << i84;
                    i84 += 13;
                    i83 = i39;
                }
                iCharAt10 = i82 | (cCharAt12 << i84);
                i27 = i39;
            } else {
                i27 = i81;
            }
            int i85 = i27 + 1;
            int iCharAt11 = strZzd.charAt(i27);
            if (iCharAt11 >= c11) {
                int i86 = iCharAt11 & 8191;
                int i87 = i85;
                int i88 = 13;
                while (true) {
                    i38 = i87 + 1;
                    cCharAt11 = strZzd.charAt(i87);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i86 |= (cCharAt11 & 8191) << i88;
                    i88 += 13;
                    i87 = i38;
                }
                iCharAt11 = i86 | (cCharAt11 << i88);
                i28 = i38;
            } else {
                i28 = i85;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i89 = iCharAt11 & 255;
            if (i89 >= 51) {
                int i91 = i28 + 1;
                int iCharAt12 = strZzd.charAt(i28);
                zzghVar = zzghVar2;
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i92 = iCharAt12 & 8191;
                    int i93 = 13;
                    while (true) {
                        i37 = i91 + 1;
                        cCharAt10 = strZzd.charAt(i91);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i92 |= (cCharAt10 & 8191) << i93;
                        i93 += 13;
                        i91 = i37;
                        c12 = 55296;
                    }
                    iCharAt12 = i92 | (cCharAt10 << i93);
                    i91 = i37;
                }
                int i94 = i89 - 51;
                if (i94 == 9 || i94 == 17) {
                    int i95 = i77 / 3;
                    i34 = i12 + 1;
                    objArr[i95 + i95 + 1] = objArrZze[i12];
                } else {
                    if (i94 == 12 && (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i96 = i77 / 3;
                        i34 = i12 + 1;
                        objArr[i96 + i96 + 1] = objArrZze[i12];
                    }
                    i35 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i35];
                    if (obj instanceof Field) {
                        fieldZzv2 = (Field) obj;
                    } else {
                        fieldZzv2 = zzv(cls2, (String) obj);
                        objArrZze[i35] = fieldZzv2;
                    }
                    int i97 = i91;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv2);
                    i36 = i35 + 1;
                    obj2 = objArrZze[i36];
                    if (obj2 instanceof Field) {
                        fieldZzv3 = (Field) obj2;
                    } else {
                        fieldZzv3 = zzv(cls2, (String) obj2);
                        objArrZze[i36] = fieldZzv3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv3);
                    strZzd = strZzd;
                    i31 = i97;
                    i32 = 0;
                }
                i12 = i34;
                i35 = iCharAt12 + iCharAt12;
                obj = objArrZze[i35];
                if (obj instanceof Field) {
                    fieldZzv2 = (Field) obj;
                } else {
                    fieldZzv2 = zzv(cls2, (String) obj);
                    objArrZze[i35] = fieldZzv2;
                }
                int i98 = i91;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv2);
                i36 = i35 + 1;
                obj2 = objArrZze[i36];
                if (obj2 instanceof Field) {
                    fieldZzv3 = (Field) obj2;
                } else {
                    fieldZzv3 = zzv(cls2, (String) obj2);
                    objArrZze[i36] = fieldZzv3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv3);
                strZzd = strZzd;
                i31 = i98;
                i32 = 0;
            } else {
                zzghVar = zzghVar2;
                int i99 = i12 + 1;
                Field fieldZzv4 = zzv(cls2, (String) objArrZze[i12]);
                if (i89 == 9 || i89 == 17) {
                    i29 = i99;
                    int i100 = i77 / 3;
                    objArr[i100 + i100 + 1] = fieldZzv4.getType();
                } else {
                    if (i89 == 27 || i89 == 49) {
                        int i101 = i77 / 3;
                        i33 = i12 + 2;
                        objArr[i101 + i101 + 1] = objArrZze[i99];
                    } else if (i89 == 12 || i89 == 30 || i89 == 44) {
                        i29 = i99;
                        if (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i102 = i77 / 3;
                            i33 = i12 + 2;
                            objArr[i102 + i102 + 1] = objArrZze[i29];
                        }
                    } else if (i89 == 50) {
                        int i103 = i78 + 1;
                        iArr[i78] = i77;
                        int i104 = i77 / 3;
                        i29 = i12 + 2;
                        int i105 = i104 + i104;
                        objArr[i105] = objArrZze[i99];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i105 + 1] = objArrZze[i29];
                            i29 = i12 + 3;
                        }
                        i78 = i103;
                    } else {
                        i29 = i99;
                    }
                    i29 = i33;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzv4);
                int iObjectFieldOffset4 = 1048575;
                if ((iCharAt11 & 4096) == 0 || i89 > 17) {
                    i31 = i28;
                    i32 = 0;
                } else {
                    int i106 = i28 + 1;
                    int iCharAt13 = strZzd.charAt(i28);
                    if (iCharAt13 >= 55296) {
                        int i107 = iCharAt13 & 8191;
                        int i108 = 13;
                        while (true) {
                            i31 = i106 + 1;
                            cCharAt9 = strZzd.charAt(i106);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i107 |= (cCharAt9 & 8191) << i108;
                            i108 += 13;
                            i106 = i31;
                        }
                        iCharAt13 = i107 | (cCharAt9 << i108);
                    } else {
                        i31 = i106;
                    }
                    int i109 = i17 + i17 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i109];
                    if (obj3 instanceof Field) {
                        fieldZzv = (Field) obj3;
                    } else {
                        fieldZzv = zzv(cls2, (String) obj3);
                        objArrZze[i109] = fieldZzv;
                    }
                    i32 = iCharAt13 % 32;
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzv);
                }
                if (i89 >= 18 && i89 <= 49) {
                    iArr[i79] = iObjectFieldOffset3;
                    i79++;
                }
                iObjectFieldOffset = iObjectFieldOffset3;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i12 = i29;
            }
            int i110 = i77 + 1;
            iArr3[i77] = iCharAt10;
            int i111 = i77 + 2;
            iArr3[i110] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i89 << 20) | iObjectFieldOffset;
            i77 += 3;
            iArr3[i111] = (i32 << 20) | iObjectFieldOffset2;
            i43 = i31;
            zzghVar2 = zzghVar;
            strZzd = strZzd;
            length = length;
            c11 = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr3, objArr, i13, i15, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i16, i74, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j11) {
        return ((Integer) zzhj.zzf(obj, j11)).intValue();
    }

    private final int zzl(int i11) {
        return this.zzc[i11 + 2];
    }

    private final int zzm(int i11, int i12) {
        int length = (this.zzc.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.zzc[i14];
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

    private static int zzn(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzo(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzp(Object obj, long j11) {
        return ((Long) zzhj.zzf(obj, j11)).longValue();
    }

    private final zzey zzq(int i11) {
        int i12 = i11 / 3;
        return (zzey) this.zzd[i12 + i12 + 1];
    }

    private final zzgi zzr(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzgi zzgiVar = (zzgi) this.zzd[i13];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i13 + 1]);
        this.zzd[i13] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private final Object zzt(Object obj, int i11) {
        zzgi zzgiVarZzr = zzr(i11);
        int iZzo = zzo(i11) & 1048575;
        if (!zzE(obj, i11)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i11, int i12) {
        zzgi zzgiVarZzr = zzr(i12);
        if (!zzI(obj, i11, i12)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i12) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
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

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i11) {
        if (zzE(obj2, i11)) {
            int iZzo = zzo(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = iZzo;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i11);
            if (!zzE(obj, i11)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j11, objZzd);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzz(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j11, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i11) {
        int i12 = this.zzc[i11];
        if (zzI(obj2, i12, i11)) {
            int iZzo = zzo(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = iZzo;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i11);
            if (!zzI(obj, i12, i11)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j11, objZzd);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzA(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j11, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i11) {
        int iZzl = zzl(i11);
        long j11 = 1048575 & iZzl;
        if (j11 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j11, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j11));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i11;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzo = zzo(i13);
            int i14 = this.zzc[i13];
            long j11 = 1048575 & iZzo;
            int iHashCode = 37;
            switch (zzn(iZzo)) {
                case 0:
                    i11 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j11));
                    byte[] bArr = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 1:
                    i11 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j11));
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 2:
                    i11 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr2 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 3:
                    i11 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr3 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j11);
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 5:
                    i11 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr4 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j11);
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 7:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.zzt(obj, j11));
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iFloatToIntBits = ((String) zzhj.zzf(obj, j11)).hashCode();
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j11);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j11).hashCode();
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j11);
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j11);
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j11);
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 14:
                    i11 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr5 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j11);
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 16:
                    i11 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr6 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j11);
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
                    iFloatToIntBits = zzhj.zzf(obj, j11).hashCode();
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 50:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j11).hashCode();
                    i12 = i11 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j11)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j11)).floatValue());
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j11);
                        byte[] bArr8 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j11);
                        byte[] bArr9 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzk(obj, j11);
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j11);
                        byte[] bArr10 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzk(obj, j11);
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j11)).booleanValue());
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = ((String) zzhj.zzf(obj, j11)).hashCode();
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j11).hashCode();
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j11).hashCode();
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzk(obj, j11);
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzk(obj, j11);
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzk(obj, j11);
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j11);
                        byte[] bArr11 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzk(obj, j11);
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j11);
                        byte[] bArr12 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j11).hashCode();
                        i12 = i11 + iFloatToIntBits;
                    }
                    break;
            }
        }
        return (i12 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzb(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.auth.zzdt r41) throws com.google.android.gms.internal.auth.zzfb {
        /*
            Method dump skipped, instruction units count: 3684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int iZzo = zzo(i11);
                int i12 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j11 = i12;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzE(obj, i11)) {
                                    zzr(i11).zze(zzb.getObject(obj, j11));
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
                                this.zzk.zza(obj, j11);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j11, object);
                                }
                                break;
                        }
                    } else if (zzI(obj, this.zzc[i11], i11)) {
                        zzr(i11).zze(zzb.getObject(obj, j11));
                    }
                } else if (zzE(obj, i11)) {
                    zzr(i11).zze(zzb.getObject(obj, j11));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzo = zzo(i11);
            int i12 = this.zzc[i11];
            long j11 = 1048575 & iZzo;
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i11)) {
                        zzhj.zzl(obj, j11, zzhj.zza(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 1:
                    if (zzE(obj2, i11)) {
                        zzhj.zzm(obj, j11, zzhj.zzb(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 2:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 3:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 4:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 5:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 6:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 7:
                    if (zzE(obj2, i11)) {
                        zzhj.zzk(obj, j11, zzhj.zzt(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 8:
                    if (zzE(obj2, i11)) {
                        zzhj.zzp(obj, j11, zzhj.zzf(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 9:
                    zzx(obj, obj2, i11);
                    break;
                case 10:
                    if (zzE(obj2, i11)) {
                        zzhj.zzp(obj, j11, zzhj.zzf(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 11:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 12:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 13:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 14:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 15:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 16:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                    }
                    break;
                case 17:
                    zzx(obj, obj2, i11);
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
                    this.zzk.zzb(obj, obj2, j11);
                    break;
                case 50:
                    int i13 = zzgk.zza;
                    zzhj.zzp(obj, j11, zzfs.zza(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11)));
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
                    if (zzI(obj2, i12, i11)) {
                        zzhj.zzp(obj, j11, zzhj.zzf(obj2, j11));
                        zzA(obj, i12, i11);
                    }
                    break;
                case 60:
                    zzy(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i12, i11)) {
                        zzhj.zzp(obj, j11, zzhj.zzf(obj2, j11));
                        zzA(obj, i12, i11);
                    }
                    break;
                case 68:
                    zzy(obj, obj2, i11);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i11, int i12, zzdt zzdtVar) throws zzfb {
        zzb(obj, bArr, i11, i12, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iZzo = zzo(i11);
            long j11 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i11) || Double.doubleToLongBits(zzhj.zza(obj, j11)) != Double.doubleToLongBits(zzhj.zza(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i11) || Float.floatToIntBits(zzhj.zzb(obj, j11)) != Float.floatToIntBits(zzhj.zzb(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i11) || zzhj.zzd(obj, j11) != zzhj.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i11) || zzhj.zzd(obj, j11) != zzhj.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i11) || zzhj.zzc(obj, j11) != zzhj.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i11) || zzhj.zzd(obj, j11) != zzhj.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i11) || zzhj.zzc(obj, j11) != zzhj.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i11) || zzhj.zzt(obj, j11) != zzhj.zzt(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i11) || !zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i11) || !zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i11) || !zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i11) || zzhj.zzc(obj, j11) != zzhj.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i11) || zzhj.zzc(obj, j11) != zzhj.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i11) || zzhj.zzc(obj, j11) != zzhj.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i11) || zzhj.zzd(obj, j11) != zzhj.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i11) || zzhj.zzc(obj, j11) != zzhj.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i11) || zzhj.zzd(obj, j11) != zzhj.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i11) || !zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
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
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11));
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
                    long jZzl = zzl(i11) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i11;
        int i12;
        List list;
        zzgi zzgiVarZzr;
        int i13;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i14 < this.zzi) {
            int i17 = this.zzh[i14];
            int i18 = this.zzc[i17];
            int iZzo = zzo(i17);
            int i19 = this.zzc[i17 + 2];
            int i21 = i19 & 1048575;
            int i22 = 1 << (i19 >>> 20);
            if (i21 != i16) {
                if (i21 != 1048575) {
                    i15 = zzb.getInt(obj, i21);
                }
                i12 = i15;
                i11 = i21;
            } else {
                i11 = i16;
                i12 = i15;
            }
            Object obj2 = obj;
            if ((268435456 & iZzo) != 0 && !zzF(obj2, i17, i11, i12, i22)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzF(obj2, i17, i11, i12, i22) && !zzG(obj2, iZzo, zzr(i17))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzhj.zzf(obj2, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgiVarZzr = zzr(i17);
                    for (i13 = 0; i13 < list.size(); i13++) {
                        if (!zzgiVarZzr.zzi(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzI(obj2, i18, i17) && !zzG(obj2, iZzo, zzr(i17))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzhj.zzf(obj2, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzgiVarZzr = zzr(i17);
                    while (i13 < list.size()) {
                        if (!zzgiVarZzr.zzi(list.get(i13))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn == 50 && !((zzfr) zzhj.zzf(obj2, iZzo & 1048575)).isEmpty()) {
                throw null;
            }
            i14++;
            obj = obj2;
            i16 = i11;
            i15 = i12;
        }
        return true;
    }
}
