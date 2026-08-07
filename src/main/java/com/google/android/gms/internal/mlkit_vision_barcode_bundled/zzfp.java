package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zzfp<T> implements zzge<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzgs zzl;
    private final zzdt zzm;

    private zzfp(int[] iArr, Object[] objArr, int i11, int i12, zzfm zzfmVar, boolean z11, int[] iArr2, int i13, int i14, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i11;
        this.zzf = i12;
        boolean z12 = false;
        if (zzdtVar != null && (zzfmVar instanceof zzed)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzl = zzgsVar;
        this.zzm = zzdtVar;
        this.zzg = zzfmVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i11) {
        if (zzI(obj2, i11)) {
            int iZzs = zzs(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = iZzs;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzge zzgeVarZzv = zzv(i11);
            if (!zzI(obj, i11)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j11, objZze);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzD(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j11, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i11) {
        int i12 = this.zzc[i11];
        if (zzM(obj2, i12, i11)) {
            int iZzs = zzs(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = iZzs;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzge zzgeVarZzv = zzv(i11);
            if (!zzM(obj, i12, i11)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j11, objZze);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzE(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j11, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i11) {
        int iZzp = zzp(i11);
        long j11 = 1048575 & iZzp;
        if (j11 == 1048575) {
            return;
        }
        zzgz.zzq(obj, j11, (1 << (iZzp >>> 20)) | zzgz.zzc(obj, j11));
    }

    private final void zzE(Object obj, int i11, int i12) {
        zzgz.zzq(obj, zzp(i12) & 1048575, i11);
    }

    private final void zzF(Object obj, int i11, Object obj2) {
        zzb.putObject(obj, zzs(i11) & 1048575, obj2);
        zzD(obj, i11);
    }

    private final void zzG(Object obj, int i11, int i12, Object obj2) {
        zzb.putObject(obj, zzs(i12) & 1048575, obj2);
        zzE(obj, i11, i12);
    }

    private final boolean zzH(Object obj, Object obj2, int i11) {
        return zzI(obj, i11) == zzI(obj2, i11);
    }

    private final boolean zzI(Object obj, int i11) {
        int iZzp = zzp(i11);
        long j11 = iZzp & 1048575;
        if (j11 != 1048575) {
            return (zzgz.zzc(obj, j11) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i11);
        long j12 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.zzb(obj, j12)) != 0;
            case 2:
                return zzgz.zzd(obj, j12) != 0;
            case 3:
                return zzgz.zzd(obj, j12) != 0;
            case 4:
                return zzgz.zzc(obj, j12) != 0;
            case 5:
                return zzgz.zzd(obj, j12) != 0;
            case 6:
                return zzgz.zzc(obj, j12) != 0;
            case 7:
                return zzgz.zzw(obj, j12);
            case 8:
                Object objZzf = zzgz.zzf(obj, j12);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzdf) {
                    return !zzdf.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.zzf(obj, j12) != null;
            case 10:
                return !zzdf.zzb.equals(zzgz.zzf(obj, j12));
            case 11:
                return zzgz.zzc(obj, j12) != 0;
            case 12:
                return zzgz.zzc(obj, j12) != 0;
            case 13:
                return zzgz.zzc(obj, j12) != 0;
            case 14:
                return zzgz.zzd(obj, j12) != 0;
            case 15:
                return zzgz.zzc(obj, j12) != 0;
            case 16:
                return zzgz.zzd(obj, j12) != 0;
            case 17:
                return zzgz.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return zzI(obj, i11);
        }
        return (i13 & i14) != 0;
    }

    private static boolean zzK(Object obj, int i11, zzge zzgeVar) {
        return zzgeVar.zzk(zzgz.zzf(obj, i11 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i11, int i12) {
        return zzgz.zzc(obj, (long) (zzp(i12) & 1048575)) == i11;
    }

    private static boolean zzN(Object obj, long j11) {
        return ((Boolean) zzgz.zzf(obj, j11)).booleanValue();
    }

    private static final void zzO(int i11, Object obj, zzhh zzhhVar) {
        if (obj instanceof String) {
            zzhhVar.zzG(i11, (String) obj);
        } else {
            zzhhVar.zzd(i11, (zzdf) obj);
        }
    }

    static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != zzgt.zzc()) {
            return zzgtVar;
        }
        zzgt zzgtVarZzf = zzgt.zzf();
        zzehVar.zzc = zzgtVarZzf;
        return zzgtVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static zzfp zzl(Class cls, zzfj zzfjVar, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
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
        Field fieldZzz;
        char cCharAt9;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field fieldZzz2;
        int i39;
        Object obj2;
        Field fieldZzz3;
        int i41;
        char cCharAt10;
        int i42;
        char cCharAt11;
        int i43;
        char cCharAt12;
        int i44;
        char cCharAt13;
        if (!(zzfjVar instanceof zzfw)) {
            throw null;
        }
        zzfw zzfwVar = (zzfw) zzfjVar;
        String strZzd = zzfwVar.zzd();
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
        Object[] objArrZze = zzfwVar.zze();
        Class<?> cls2 = zzfwVar.zza().getClass();
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
            zzfw zzfwVar2 = zzfwVar;
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
                    } else if (zzfwVar2.zzc() == 1 || i95 != 0) {
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
                        fieldZzz2 = (Field) obj;
                    } else {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i38] = fieldZzz2;
                    }
                    int i105 = i17;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                    i39 = i38 + 1;
                    obj2 = objArrZze[i39];
                    i29 = i105;
                    if (obj2 instanceof Field) {
                        fieldZzz3 = (Field) obj2;
                    } else {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i39] = fieldZzz3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
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
                    fieldZzz2 = (Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (String) obj);
                    objArrZze[i38] = fieldZzz2;
                }
                int i107 = i17;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                i39 = i38 + 1;
                obj2 = objArrZze[i39];
                i29 = i107;
                if (obj2 instanceof Field) {
                    fieldZzz3 = (Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (String) obj2);
                    objArrZze[i39] = fieldZzz3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                strZzd = strZzd;
                i32 = i106;
                i28 = i100;
                i31 = 0;
                c11 = 55296;
            } else {
                i29 = i17;
                int i108 = i16 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i16]);
                if (i94 == 9 || i94 == 17) {
                    int i109 = i84 / 3;
                    objArr[i109 + i109 + 1] = fieldZzz4.getType();
                } else {
                    if (i94 != 27) {
                        if (i94 == 49) {
                            i16 += 2;
                            i34 = 1;
                        } else if (i94 == 12 || i94 == 30 || i94 == 44) {
                            if (zzfwVar2.zzc() == 1 || i95 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                                fieldZzz = (Field) obj3;
                            } else {
                                fieldZzz = zzz(cls2, (String) obj3);
                                objArrZze[i118] = fieldZzz;
                            }
                            int i119 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
            zzfwVar = zzfwVar2;
            length = length;
            i17 = i29;
        }
        return new zzfp(iArr3, objArr, i12, i14, zzfwVar.zza(), false, iArr, i15, i78, zzfsVar, zzezVar, zzgsVar, zzdtVar, zzfhVar);
    }

    private static double zzm(Object obj, long j11) {
        return ((Double) zzgz.zzf(obj, j11)).doubleValue();
    }

    private static float zzn(Object obj, long j11) {
        return ((Float) zzgz.zzf(obj, j11)).floatValue();
    }

    private static int zzo(Object obj, long j11) {
        return ((Integer) zzgz.zzf(obj, j11)).intValue();
    }

    private final int zzp(int i11) {
        return this.zzc[i11 + 2];
    }

    private final int zzq(int i11, int i12) {
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

    private static int zzr(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzs(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzt(Object obj, long j11) {
        return ((Long) zzgz.zzf(obj, j11)).longValue();
    }

    private final zzel zzu(int i11) {
        int i12 = i11 / 3;
        return (zzel) this.zzd[i12 + i12 + 1];
    }

    private final zzge zzv(int i11) {
        Object[] objArr = this.zzd;
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzge zzgeVar = (zzge) objArr[i13];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzgeVarZzb = zzfu.zza().zzb((Class) objArr[i13 + 1]);
        this.zzd[i13] = zzgeVarZzb;
        return zzgeVarZzb;
    }

    private final Object zzw(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private final Object zzx(Object obj, int i11) {
        zzge zzgeVarZzv = zzv(i11);
        int iZzs = zzs(i11) & 1048575;
        if (!zzI(obj, i11)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i11, int i12) {
        zzge zzgeVarZzv = zzv(i12);
        if (!zzM(obj, i11, i12)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i12) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x038a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0481  */
    /* JADX WARN: Code duplicated, block: B:280:0x0714 A[PHI: r0
      0x0714: PHI (r0v2 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>) = 
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v39 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
     binds: [B:18:0x004f, B:278:0x0707, B:248:0x0643, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(Object obj) {
        int i11;
        int iZzA;
        int iZzA2;
        int iZzB;
        int iZzA3;
        int iZzA4;
        int iZzA5;
        int iZzd;
        int iZzA6;
        int iZzh;
        int iZzg;
        int size;
        int iZzl;
        int iZzA7;
        int iZzA8;
        int iZzA9;
        int iZzB2;
        int iZze;
        int iZzA10;
        int iZzA11;
        int iZzw;
        int iZzA12;
        int iZzA13;
        int iZzA14;
        int iZzd2;
        int iZzA15;
        zzfp<T> zzfpVar = this;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int iZzA16 = 0;
        int i15 = 1048575;
        while (i13 < zzfpVar.zzc.length) {
            int iZzs = zzfpVar.zzs(i13);
            int iZzr = zzr(iZzs);
            int[] iArr = zzfpVar.zzc;
            int i16 = iArr[i13];
            int i17 = iArr[i13 + 2];
            int i18 = i17 & i12;
            if (iZzr <= 17) {
                if (i18 != i15) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i15 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i11 = 0;
            }
            int i19 = iZzs & i12;
            if (iZzr >= zzdy.zzJ.zza()) {
                zzdy.zzW.zza();
            }
            int i21 = iZzA16;
            long j11 = i19;
            switch (iZzr) {
                case 0:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzA16 = i21 + zzdn.zzA(i16 << 3) + 8;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 1:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzA = zzdn.zzA(i16 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 2:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        long j12 = unsafe.getLong(obj, j11);
                        iZzA2 = zzdn.zzA(i16 << 3);
                        iZzB = zzdn.zzB(j12);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 3:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        long j13 = unsafe.getLong(obj, j11);
                        iZzA2 = zzdn.zzA(i16 << 3);
                        iZzB = zzdn.zzB(j13);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 4:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        long j14 = unsafe.getInt(obj, j11);
                        iZzA2 = zzdn.zzA(i16 << 3);
                        iZzB = zzdn.zzB(j14);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 5:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzA3 = zzdn.zzA(i16 << 3);
                        iZzA4 = iZzA3 + 8;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 6:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzA = zzdn.zzA(i16 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 7:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzA4 = zzdn.zzA(i16 << 3) + 1;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 8:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        int i22 = i16 << 3;
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof zzdf) {
                            iZzA5 = zzdn.zzA(i22);
                            iZzd = ((zzdf) object).zzd();
                            iZzA6 = zzdn.zzA(iZzd);
                            iZzA4 = iZzA5 + iZzA6 + iZzd;
                            iZzA16 = i21 + iZzA4;
                            zzfpVar = this;
                            i13 += 3;
                            i12 = 1048575;
                        } else {
                            iZzA2 = zzdn.zzA(i22);
                            iZzB = zzdn.zzz((String) object);
                            iZzA4 = iZzA2 + iZzB;
                            iZzA16 = i21 + iZzA4;
                            zzfpVar = this;
                            i13 += 3;
                            i12 = 1048575;
                        }
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 9:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzh = zzgg.zzh(i16, unsafe.getObject(obj, j11), zzfpVar.zzv(i13));
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 10:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        zzdf zzdfVar = (zzdf) unsafe.getObject(obj, j11);
                        iZzA5 = zzdn.zzA(i16 << 3);
                        iZzd = zzdfVar.zzd();
                        iZzA6 = zzdn.zzA(iZzd);
                        iZzA4 = iZzA5 + iZzA6 + iZzd;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 11:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        int i23 = unsafe.getInt(obj, j11);
                        iZzA2 = zzdn.zzA(i16 << 3);
                        iZzB = zzdn.zzA(i23);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 12:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        long j15 = unsafe.getInt(obj, j11);
                        iZzA2 = zzdn.zzA(i16 << 3);
                        iZzB = zzdn.zzB(j15);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 13:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzA = zzdn.zzA(i16 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 14:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzA3 = zzdn.zzA(i16 << 3);
                        iZzA4 = iZzA3 + 8;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 15:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        int i24 = unsafe.getInt(obj, j11);
                        iZzA2 = zzdn.zzA(i16 << 3);
                        iZzB = zzdn.zzA((i24 >> 31) ^ (i24 + i24));
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 16:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        long j16 = unsafe.getLong(obj, j11);
                        iZzA2 = zzdn.zzA(i16 << 3);
                        iZzB = zzdn.zzB((j16 >> 63) ^ (j16 + j16));
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i21 + iZzA4;
                        zzfpVar = this;
                        i13 += 3;
                        i12 = 1048575;
                    }
                    zzfpVar = this;
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 17:
                    if (zzfpVar.zzJ(obj, i13, i15, i14, i11)) {
                        iZzh = zzdn.zzw(i16, (zzfm) unsafe.getObject(obj, j11), zzfpVar.zzv(i13));
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 18:
                    iZzh = zzgg.zzd(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 19:
                    iZzh = zzgg.zzb(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j11);
                    int i25 = zzgg.zza;
                    if (list.size() == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzgg.zzg(list) + (list.size() * zzdn.zzA(i16 << 3));
                    }
                    iZzA16 = iZzg + i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j11);
                    int i26 = zzgg.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgg.zzl(list2);
                        iZzA7 = zzdn.zzA(i16 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                    }
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j11);
                    int i27 = zzgg.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgg.zzf(list3);
                        iZzA7 = zzdn.zzA(i16 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                    }
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 23:
                    iZzh = zzgg.zzd(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 24:
                    iZzh = zzgg.zzb(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j11);
                    int i28 = zzgg.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzdn.zzA(i16 << 3) + 1);
                    }
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j11);
                    int i29 = zzgg.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzdn.zzA(i16 << 3) * size3;
                        if (list5 instanceof zzey) {
                            zzey zzeyVar = (zzey) list5;
                            for (int i31 = 0; i31 < size3; i31++) {
                                Object objZza = zzeyVar.zza();
                                if (objZza instanceof zzdf) {
                                    int iZzd3 = ((zzdf) objZza).zzd();
                                    iZzg += zzdn.zzA(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzdn.zzz((String) objZza);
                                }
                            }
                        } else {
                            for (int i32 = 0; i32 < size3; i32++) {
                                Object obj2 = list5.get(i32);
                                if (obj2 instanceof zzdf) {
                                    int iZzd4 = ((zzdf) obj2).zzd();
                                    iZzg += zzdn.zzA(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzdn.zzz((String) obj2);
                                }
                            }
                        }
                    }
                    iZzA16 = iZzg + i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j11);
                    zzge zzgeVarZzv = zzfpVar.zzv(i13);
                    int i33 = zzgg.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzA8 = 0;
                    } else {
                        iZzA8 = zzdn.zzA(i16 << 3) * size4;
                        for (int i34 = 0; i34 < size4; i34++) {
                            Object obj3 = list6.get(i34);
                            if (obj3 instanceof zzex) {
                                int iZza = ((zzex) obj3).zza();
                                iZzA8 += zzdn.zzA(iZza) + iZza;
                            } else {
                                iZzA8 += zzdn.zzy((zzfm) obj3, zzgeVarZzv);
                            }
                        }
                    }
                    iZzA16 = i21 + iZzA8;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j11);
                    int i35 = zzgg.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzA9 = 0;
                    } else {
                        iZzA9 = size5 * zzdn.zzA(i16 << 3);
                        for (int i36 = 0; i36 < list7.size(); i36++) {
                            int iZzd5 = ((zzdf) list7.get(i36)).zzd();
                            iZzA9 += zzdn.zzA(iZzd5) + iZzd5;
                        }
                    }
                    iZzA16 = i21 + iZzA9;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j11);
                    int i37 = zzgg.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgg.zzk(list8);
                        iZzA7 = zzdn.zzA(i16 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                    }
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j11);
                    int i38 = zzgg.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgg.zza(list9);
                        iZzA7 = zzdn.zzA(i16 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                    }
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 31:
                    iZzh = zzgg.zzb(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 32:
                    iZzh = zzgg.zzd(i16, (List) unsafe.getObject(obj, j11), false);
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j11);
                    int i39 = zzgg.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgg.zzi(list10);
                        iZzA7 = zzdn.zzA(i16 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                    }
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j11);
                    int i41 = zzgg.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgg.zzj(list11);
                        iZzA7 = zzdn.zzA(i16 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                    }
                    iZzA16 = i21 + iZzh;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 35:
                    iZze = zzgg.zze((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 36:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 37:
                    iZze = zzgg.zzg((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 38:
                    iZze = zzgg.zzl((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 39:
                    iZze = zzgg.zzf((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 40:
                    iZze = zzgg.zze((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 41:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j11);
                    int i42 = zzgg.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 43:
                    iZze = zzgg.zzk((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 44:
                    iZze = zzgg.zza((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 45:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 46:
                    iZze = zzgg.zze((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 47:
                    iZze = zzgg.zzi((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 48:
                    iZze = zzgg.zzj((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i16 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i21 + iZzA9;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j11);
                    zzge zzgeVarZzv2 = zzfpVar.zzv(i13);
                    int i43 = zzgg.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw = 0;
                    } else {
                        iZzw = 0;
                        for (int i44 = 0; i44 < size6; i44++) {
                            iZzw += zzdn.zzw(i16, (zzfm) list13.get(i44), zzgeVarZzv2);
                        }
                    }
                    iZzA16 = i21 + iZzw;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 50:
                    zzfg zzfgVar = (zzfg) unsafe.getObject(obj, j11);
                    if (!zzfgVar.isEmpty()) {
                        Iterator it = zzfgVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 51:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzA12 = zzdn.zzA(i16 << 3);
                        iZzh = iZzA12 + 8;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 52:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzA13 = zzdn.zzA(i16 << 3);
                        iZzh = iZzA13 + 4;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 53:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        long jZzt = zzt(obj, j11);
                        iZzl = zzdn.zzA(i16 << 3);
                        iZzB2 = zzdn.zzB(jZzt);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 54:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        long jZzt2 = zzt(obj, j11);
                        iZzl = zzdn.zzA(i16 << 3);
                        iZzB2 = zzdn.zzB(jZzt2);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 55:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        long jZzo = zzo(obj, j11);
                        iZzl = zzdn.zzA(i16 << 3);
                        iZzB2 = zzdn.zzB(jZzo);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 56:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzA12 = zzdn.zzA(i16 << 3);
                        iZzh = iZzA12 + 8;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 57:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzA13 = zzdn.zzA(i16 << 3);
                        iZzh = iZzA13 + 4;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 58:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzh = zzdn.zzA(i16 << 3) + 1;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 59:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        int i45 = i16 << 3;
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof zzdf) {
                            iZzA14 = zzdn.zzA(i45);
                            iZzd2 = ((zzdf) object2).zzd();
                            iZzA15 = zzdn.zzA(iZzd2);
                            iZzh = iZzA14 + iZzA15 + iZzd2;
                            iZzA16 = i21 + iZzh;
                        } else {
                            iZzl = zzdn.zzA(i45);
                            iZzB2 = zzdn.zzz((String) object2);
                            iZzh = iZzl + iZzB2;
                            iZzA16 = i21 + iZzh;
                        }
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 60:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzh = zzgg.zzh(i16, unsafe.getObject(obj, j11), zzfpVar.zzv(i13));
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 61:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        zzdf zzdfVar2 = (zzdf) unsafe.getObject(obj, j11);
                        iZzA14 = zzdn.zzA(i16 << 3);
                        iZzd2 = zzdfVar2.zzd();
                        iZzA15 = zzdn.zzA(iZzd2);
                        iZzh = iZzA14 + iZzA15 + iZzd2;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 62:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        int iZzo = zzo(obj, j11);
                        iZzl = zzdn.zzA(i16 << 3);
                        iZzB2 = zzdn.zzA(iZzo);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 63:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        long jZzo2 = zzo(obj, j11);
                        iZzl = zzdn.zzA(i16 << 3);
                        iZzB2 = zzdn.zzB(jZzo2);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 64:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzA13 = zzdn.zzA(i16 << 3);
                        iZzh = iZzA13 + 4;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 65:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzA12 = zzdn.zzA(i16 << 3);
                        iZzh = iZzA12 + 8;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 66:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        int iZzo2 = zzo(obj, j11);
                        iZzl = zzdn.zzA(i16 << 3);
                        iZzB2 = zzdn.zzA((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 67:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        long jZzt3 = zzt(obj, j11);
                        iZzl = zzdn.zzA(i16 << 3);
                        iZzB2 = zzdn.zzB((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                case 68:
                    if (zzfpVar.zzM(obj, i16, i13)) {
                        iZzh = zzdn.zzw(i16, (zzfm) unsafe.getObject(obj, j11), zzfpVar.zzv(i13));
                        iZzA16 = i21 + iZzh;
                    } else {
                        iZzA16 = i21;
                    }
                    i13 += 3;
                    i12 = 1048575;
                    break;
                default:
                    iZzA16 = i21;
                    i13 += 3;
                    i12 = 1048575;
                    break;
            }
        }
        int iZza2 = iZzA16 + ((zzeh) obj).zzc.zza();
        if (!zzfpVar.zzh) {
            return iZza2;
        }
        zzdx zzdxVar = ((zzed) obj).zzb;
        int iZzc = zzdxVar.zza.zzc();
        int iZza3 = 0;
        for (int i46 = 0; i46 < iZzc; i46++) {
            Map.Entry entryZzg = zzdxVar.zza.zzg(i46);
            iZza3 += zzdx.zza((zzdw) ((zzgi) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzdxVar.zza.zzd()) {
            iZza3 += zzdx.zza((zzdw) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZza3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int i11;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzs = zzs(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i16 = iArr[i14];
            long j11 = i15;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i11 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzgz.zza(obj, j11));
                    byte[] bArr = zzep.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzgz.zzb(obj, j11));
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 2:
                    i11 = i13 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr2 = zzep.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 3:
                    i11 = i13 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr3 = zzep.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 4:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzc(obj, j11);
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 5:
                    i11 = i13 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr4 = zzep.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 6:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzc(obj, j11);
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 7:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzep.zza(zzgz.zzw(obj, j11));
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iFloatToIntBits = ((String) zzgz.zzf(obj, j11)).hashCode();
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object objZzf = zzgz.zzf(obj, j11);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j11).hashCode();
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 11:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzc(obj, j11);
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 12:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzc(obj, j11);
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 13:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzc(obj, j11);
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 14:
                    i11 = i13 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr5 = zzep.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 15:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzc(obj, j11);
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 16:
                    i11 = i13 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr6 = zzep.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object objZzf2 = zzgz.zzf(obj, j11);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i13 = i12 + iHashCode;
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
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j11).hashCode();
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j11).hashCode();
                    i13 = i11 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j11));
                        byte[] bArr7 = zzep.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j11));
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j11);
                        byte[] bArr8 = zzep.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j11);
                        byte[] bArr9 = zzep.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzo(obj, j11);
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j11);
                        byte[] bArr10 = zzep.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzo(obj, j11);
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzep.zza(zzN(obj, j11));
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = ((String) zzgz.zzf(obj, j11)).hashCode();
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j11).hashCode();
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j11).hashCode();
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzo(obj, j11);
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzo(obj, j11);
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzo(obj, j11);
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j11);
                        byte[] bArr11 = zzep.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzo(obj, j11);
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j11);
                        byte[] bArr12 = zzep.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j11).hashCode();
                        i13 = i11 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i13 * 53) + ((zzeh) obj).zzc.hashCode();
        return this.zzh ? (iHashCode2 * 53) + ((zzed) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 39481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu r39) {
        /*
            Method dump skipped, instruction units count: 3948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return ((zzeh) this.zzg).zzK();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzeh) {
                zzeh zzehVar = (zzeh) obj;
                zzehVar.zzW(Integer.MAX_VALUE);
                zzehVar.zza = 0;
                zzehVar.zzU();
            }
            int[] iArr = this.zzc;
            for (int i11 = 0; i11 < iArr.length; i11 += 3) {
                int iZzs = zzs(i11);
                int i12 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j11 = i12;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i11)) {
                                    zzv(i11).zzf(zzb.getObject(obj, j11));
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
                                ((zzeo) zzgz.zzf(obj, j11)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((zzfg) object).zzc();
                                    unsafe.putObject(obj, j11, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, this.zzc[i11], i11)) {
                        zzv(i11).zzf(zzb.getObject(obj, j11));
                    }
                } else if (zzI(obj, i11)) {
                    zzv(i11).zzf(zzb.getObject(obj, j11));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzs = zzs(i11);
            int i12 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i13 = iArr[i11];
            long j11 = i12;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i11)) {
                        zzgz.zzo(obj, j11, zzgz.zza(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i11)) {
                        zzgz.zzp(obj, j11, zzgz.zzb(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i11)) {
                        zzgz.zzm(obj, j11, zzgz.zzw(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i11)) {
                        zzgz.zzs(obj, j11, zzgz.zzf(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i11);
                    break;
                case 10:
                    if (zzI(obj2, i11)) {
                        zzgz.zzs(obj, j11, zzgz.zzf(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i11);
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
                    zzeo zzeoVarZzd = (zzeo) zzgz.zzf(obj, j11);
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj2, j11);
                    int size = zzeoVarZzd.size();
                    int size2 = zzeoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzeoVarZzd.zzc()) {
                            zzeoVarZzd = zzeoVarZzd.zzd(size2 + size);
                        }
                        zzeoVarZzd.addAll(zzeoVar);
                    }
                    if (size > 0) {
                        zzeoVar = zzeoVarZzd;
                    }
                    zzgz.zzs(obj, j11, zzeoVar);
                    break;
                case 50:
                    int i14 = zzgg.zza;
                    zzgz.zzs(obj, j11, zzfh.zza(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11)));
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
                    if (zzM(obj2, i13, i11)) {
                        zzgz.zzs(obj, j11, zzgz.zzf(obj2, j11));
                        zzE(obj, i13, i11);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i13, i11)) {
                        zzgz.zzs(obj, j11, zzgz.zzf(obj2, j11));
                        zzE(obj, i13, i11);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i11);
                    break;
            }
        }
        zzgg.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzgg.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i11, int i12, zzcu zzcuVar) {
        zzc(obj, bArr, i11, i12, 0, zzcuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzi(Object obj, zzhh zzhhVar) {
        Map.Entry entry;
        Iterator it;
        int i11;
        int i12;
        int i13;
        int i14;
        zzfp<T> zzfpVar = this;
        if (zzfpVar.zzh) {
            zzdx zzdxVar = ((zzed) obj).zzb;
            if (zzdxVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzdxVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzfpVar.zzc;
        Unsafe unsafe = zzb;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        while (i15 < iArr.length) {
            int iZzs = zzfpVar.zzs(i15);
            int[] iArr2 = zzfpVar.zzc;
            int iZzr = zzr(iZzs);
            int i18 = iArr2[i15];
            if (iZzr <= 17) {
                int i19 = iArr2[i15 + 2];
                int i21 = i19 & 1048575;
                if (i21 != i16) {
                    i11 = 1;
                    i17 = i21 == 1048575 ? 0 : unsafe.getInt(obj, i21);
                    i16 = i21;
                } else {
                    i11 = 1;
                }
                i12 = i16;
                i13 = i17;
                i14 = i11 << (i19 >>> 20);
            } else {
                i11 = 1;
                i12 = i16;
                i13 = i17;
                i14 = 0;
            }
            while (entry != null && ((zzee) entry.getKey()).zza <= i18) {
                zzfpVar.zzm.zzb(zzhhVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j11 = iZzs & 1048575;
            switch (iZzr) {
                case 0:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzf(i18, zzgz.zza(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 1:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzo(i18, zzgz.zzb(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 2:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzt(i18, unsafe.getLong(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 3:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzK(i18, unsafe.getLong(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 4:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzr(i18, unsafe.getInt(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 5:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzm(i18, unsafe.getLong(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 6:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzk(i18, unsafe.getInt(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 7:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzb(i18, zzgz.zzw(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 8:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzO(i18, unsafe.getObject(obj, j11), zzhhVar);
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 9:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzv(i18, unsafe.getObject(obj, j11), zzfpVar.zzv(i15));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 10:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzd(i18, (zzdf) unsafe.getObject(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 11:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzI(i18, unsafe.getInt(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 12:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzi(i18, unsafe.getInt(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 13:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzx(i18, unsafe.getInt(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 14:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzz(i18, unsafe.getLong(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 15:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzB(i18, unsafe.getInt(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 16:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzD(i18, unsafe.getLong(obj, j11));
                    }
                    zzfpVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 17:
                    if (zzfpVar.zzJ(obj, i15, i12, i13, i14)) {
                        zzhhVar.zzq(i18, unsafe.getObject(obj, j11), zzfpVar.zzv(i15));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 18:
                    zzgg.zzr(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 19:
                    zzgg.zzv(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 20:
                    zzgg.zzx(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 21:
                    zzgg.zzD(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 22:
                    zzgg.zzw(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 23:
                    zzgg.zzu(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 24:
                    zzgg.zzt(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 25:
                    zzgg.zzq(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 26:
                    int i22 = zzfpVar.zzc[i15];
                    List list = (List) unsafe.getObject(obj, j11);
                    int i23 = zzgg.zza;
                    if (list != null && !list.isEmpty()) {
                        zzhhVar.zzH(i22, list);
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 27:
                    int i24 = zzfpVar.zzc[i15];
                    List list2 = (List) unsafe.getObject(obj, j11);
                    zzge zzgeVarZzv = zzfpVar.zzv(i15);
                    int i25 = zzgg.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i26 = 0; i26 < list2.size(); i26++) {
                            ((zzdo) zzhhVar).zzv(i24, list2.get(i26), zzgeVarZzv);
                        }
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 28:
                    int i27 = zzfpVar.zzc[i15];
                    List list3 = (List) unsafe.getObject(obj, j11);
                    int i28 = zzgg.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzhhVar.zze(i27, list3);
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 29:
                    zzgg.zzC(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 30:
                    zzgg.zzs(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 31:
                    zzgg.zzy(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 32:
                    zzgg.zzz(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 33:
                    zzgg.zzA(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 34:
                    zzgg.zzB(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 35:
                    zzgg.zzr(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 36:
                    zzgg.zzv(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 37:
                    zzgg.zzx(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 38:
                    zzgg.zzD(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 39:
                    zzgg.zzw(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 40:
                    zzgg.zzu(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 41:
                    zzgg.zzt(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 42:
                    zzgg.zzq(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 43:
                    zzgg.zzC(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 44:
                    zzgg.zzs(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 45:
                    zzgg.zzy(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 46:
                    zzgg.zzz(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 47:
                    zzgg.zzA(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 48:
                    zzgg.zzB(zzfpVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzhhVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 49:
                    int i29 = zzfpVar.zzc[i15];
                    List list4 = (List) unsafe.getObject(obj, j11);
                    zzge zzgeVarZzv2 = zzfpVar.zzv(i15);
                    int i31 = zzgg.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i32 = 0; i32 < list4.size(); i32++) {
                            ((zzdo) zzhhVar).zzq(i29, list4.get(i32), zzgeVarZzv2);
                        }
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j11) != null) {
                        throw null;
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 51:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzf(i18, zzm(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 52:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzo(i18, zzn(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 53:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzt(i18, zzt(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 54:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzK(i18, zzt(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 55:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzr(i18, zzo(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 56:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzm(i18, zzt(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 57:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzk(i18, zzo(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 58:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzb(i18, zzN(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 59:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzO(i18, unsafe.getObject(obj, j11), zzhhVar);
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 60:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzv(i18, unsafe.getObject(obj, j11), zzfpVar.zzv(i15));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 61:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzd(i18, (zzdf) unsafe.getObject(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 62:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzI(i18, zzo(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 63:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzi(i18, zzo(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 64:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzx(i18, zzo(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 65:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzz(i18, zzt(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 66:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzB(i18, zzo(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 67:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzD(i18, zzt(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 68:
                    if (zzfpVar.zzM(obj, i18, i15)) {
                        zzhhVar.zzq(i18, unsafe.getObject(obj, j11), zzfpVar.zzv(i15));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                default:
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzfpVar.zzm.zzb(zzhhVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zzeh) obj).zzc.zzl(zzhhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzs = zzs(i11);
            long j11 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i11) || Double.doubleToLongBits(zzgz.zza(obj, j11)) != Double.doubleToLongBits(zzgz.zza(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i11) || Float.floatToIntBits(zzgz.zzb(obj, j11)) != Float.floatToIntBits(zzgz.zzb(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i11) || zzgz.zzd(obj, j11) != zzgz.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i11) || zzgz.zzd(obj, j11) != zzgz.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i11) || zzgz.zzc(obj, j11) != zzgz.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i11) || zzgz.zzd(obj, j11) != zzgz.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i11) || zzgz.zzc(obj, j11) != zzgz.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i11) || zzgz.zzw(obj, j11) != zzgz.zzw(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i11) || !zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i11) || !zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i11) || !zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i11) || zzgz.zzc(obj, j11) != zzgz.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i11) || zzgz.zzc(obj, j11) != zzgz.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i11) || zzgz.zzc(obj, j11) != zzgz.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i11) || zzgz.zzd(obj, j11) != zzgz.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i11) || zzgz.zzc(obj, j11) != zzgz.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i11) || zzgz.zzd(obj, j11) != zzgz.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i11) || !zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
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
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11));
                    break;
                case 50:
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11));
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
                    if (zzgz.zzc(obj, jZzp) != zzgz.zzc(obj2, jZzp) || !zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        int i11;
        int i12;
        List list;
        zzge zzgeVarZzv;
        int i13;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i14 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i17 = iArr[i14];
            int i18 = iArr2[i17];
            int iZzs = zzs(i17);
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
            if ((268435456 & iZzs) != 0 && !zzJ(obj2, i17, i11, i12, i22)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj2, i17, i11, i12, i22) && !zzK(obj2, iZzs, zzv(i17))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (List) zzgz.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgeVarZzv = zzv(i17);
                    for (i13 = 0; i13 < list.size(); i13++) {
                        if (!zzgeVarZzv.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj2, i18, i17) && !zzK(obj2, iZzs, zzv(i17))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (List) zzgz.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    zzgeVarZzv = zzv(i17);
                    while (i13 < list.size()) {
                        if (!zzgeVarZzv.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((zzfg) zzgz.zzf(obj2, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i14++;
            obj = obj2;
            i16 = i11;
            i15 = i12;
        }
        return !this.zzh || ((zzed) obj).zzb.zzk();
    }
}
