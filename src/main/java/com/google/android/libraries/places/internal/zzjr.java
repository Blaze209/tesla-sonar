package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class zzjr extends zzjb {
    static final zzjb zza = new zzjr(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzjr(Object obj, Object[] objArr, int i11) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i11;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    static zzjr zzf(int i11, Object[] objArr, zzja zzjaVar) {
        int iHighestOneBit;
        boolean z11;
        int i12;
        ?? r11;
        int i13;
        short[] sArr;
        boolean z12;
        ?? r16;
        boolean z13;
        ?? r12;
        boolean z14;
        int i14 = i11;
        Object[] objArrCopyOf = objArr;
        if (i14 == 0) {
            return (zzjr) zza;
        }
        zziz zzizVar = null;
        ?? r13 = 0;
        zziz zzizVar2 = null;
        zziz zzizVar3 = null;
        boolean z15 = false;
        int i15 = 1;
        if (i14 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            zzin.zza(obj, obj2);
            return new zzjr(null, objArrCopyOf, 1);
        }
        zzig.zzb(i14, objArrCopyOf.length >> 1, "index");
        int iMax = Math.max(i14, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            zzig.zze(iMax < 1073741824, "collection too large");
        }
        if (i14 != 1) {
            int i16 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i14) {
                    int i19 = i17 + i17;
                    int i21 = i18 + i18;
                    Object obj3 = objArrCopyOf[i19];
                    obj3.getClass();
                    Object obj4 = objArrCopyOf[i19 ^ 1];
                    obj4.getClass();
                    zzin.zza(obj3, obj4);
                    int iZza = zziu.zza(obj3.hashCode());
                    while (true) {
                        int i22 = iZza & i16;
                        z12 = z15;
                        int i23 = bArr[i22] & 255;
                        if (i23 == 255) {
                            bArr[i22] = (byte) i21;
                            if (i18 < i17) {
                                objArrCopyOf[i21] = obj3;
                                objArrCopyOf[i21 ^ 1] = obj4;
                            }
                            i18++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i23 == true ? 1 : 0])) {
                            int i24 = ~i23;
                            Object obj5 = objArrCopyOf[i24 == true ? 1 : 0];
                            obj5.getClass();
                            zziz zzizVar4 = new zziz(obj3, obj4, obj5);
                            objArrCopyOf[i24 == true ? 1 : 0] = obj4;
                            zzizVar2 = zzizVar4;
                            break;
                        }
                        iZza = i22 + 1;
                        z15 = z12;
                    }
                    i17++;
                    z15 = z12;
                }
                z11 = z15;
                if (i18 == i14) {
                    i12 = 1;
                    r11 = bArr;
                    r16 = z11;
                } else {
                    sArr = new Object[3];
                    sArr[z11 ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i18);
                    sArr[2] = zzizVar2;
                    r13 = sArr;
                    z14 = z11;
                }
            } else {
                z11 = false;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i25 = 0;
                    for (int i26 = 0; i26 < i14; i26++) {
                        int i27 = i26 + i26;
                        int i28 = i25 + i25;
                        Object obj6 = objArrCopyOf[i27];
                        obj6.getClass();
                        Object obj7 = objArrCopyOf[i27 ^ 1];
                        obj7.getClass();
                        zzin.zza(obj6, obj7);
                        int iZza2 = zziu.zza(obj6.hashCode());
                        while (true) {
                            int i29 = iZza2 & i16;
                            char c11 = (char) sArr[i29];
                            if (c11 == 65535) {
                                sArr[i29] = (short) i28;
                                if (i25 < i26) {
                                    objArrCopyOf[i28] = obj6;
                                    objArrCopyOf[i28 ^ 1] = obj7;
                                }
                                i25++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c11])) {
                                int i31 = c11 ^ 1;
                                Object obj8 = objArrCopyOf[i31 == true ? 1 : 0];
                                obj8.getClass();
                                zziz zzizVar5 = new zziz(obj6, obj7, obj8);
                                objArrCopyOf[i31 == true ? 1 : 0] = obj7;
                                zzizVar3 = zzizVar5;
                                break;
                            }
                            iZza2 = i29 + 1;
                        }
                    }
                    if (i25 == i14) {
                        r13 = sArr;
                        z14 = z11;
                    } else {
                        i12 = 1;
                        r11 = new Object[]{sArr, Integer.valueOf(i25), zzizVar3};
                        r16 = z11;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < i14) {
                        int i34 = i32 + i32;
                        int i35 = i33 + i33;
                        Object obj9 = objArrCopyOf[i34];
                        obj9.getClass();
                        Object obj10 = objArrCopyOf[i34 ^ i15];
                        obj10.getClass();
                        zzin.zza(obj9, obj10);
                        int iZza3 = zziu.zza(obj9.hashCode());
                        while (true) {
                            int i36 = iZza3 & i16;
                            int i37 = iArr[i36];
                            if (i37 == -1) {
                                iArr[i36] = i35;
                                if (i33 < i32) {
                                    objArrCopyOf[i35] = obj9;
                                    objArrCopyOf[i35 ^ 1] = obj10;
                                }
                                i33++;
                                i13 = i15;
                                break;
                            }
                            i13 = i15;
                            if (obj9.equals(objArrCopyOf[i37])) {
                                int i38 = i37 ^ 1;
                                Object obj11 = objArrCopyOf[i38];
                                obj11.getClass();
                                zziz zzizVar6 = new zziz(obj9, obj10, obj11);
                                objArrCopyOf[i38] = obj10;
                                zzizVar = zzizVar6;
                                break;
                            }
                            iZza3 = i36 + 1;
                            i15 = i13;
                        }
                        i32++;
                        i15 = i13;
                    }
                    i12 = i15;
                    if (i33 == i14) {
                        r11 = iArr;
                        r16 = z11;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i12] = Integer.valueOf(i33);
                        objArr2[2] = zzizVar;
                        r11 = objArr2;
                        r16 = z11;
                    }
                }
            }
            z13 = r11 instanceof Object[];
            r12 = r11;
            if (z13) {
                Object[] objArr3 = (Object[]) r11;
                zzjaVar.zzc = (zziz) objArr3[2];
                Object obj12 = objArr3[r16];
                int iIntValue = ((Integer) objArr3[i12]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r12 = obj12;
                i14 = iIntValue;
            }
            return new zzjr(r12, objArrCopyOf, i14);
        }
        Object obj13 = objArrCopyOf[0];
        obj13.getClass();
        Object obj14 = objArrCopyOf[1];
        obj14.getClass();
        zzin.zza(obj13, obj14);
        z14 = false;
        i12 = 1;
        r11 = r13;
        r16 = z14;
        z13 = r11 instanceof Object[];
        r12 = r11;
        if (z13) {
            Object[] objArr4 = (Object[]) r11;
            zzjaVar.zzc = (zziz) objArr4[2];
            Object obj15 = objArr4[r16];
            int iIntValue2 = ((Integer) objArr4[i12]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r12 = obj15;
            i14 = iIntValue2;
        }
        return new zzjr(r12, objArrCopyOf, i14);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // com.google.android.libraries.places.internal.zzjb, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i11 = this.zzd;
        if (obj == null) {
            obj2 = null;
        } else if (i11 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            if (obj4.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else if (obj3 == null) {
            obj2 = null;
        } else if (obj3 instanceof byte[]) {
            byte[] bArr = (byte[]) obj3;
            int length = bArr.length - 1;
            int iZza = zziu.zza(obj.hashCode());
            while (true) {
                int i12 = iZza & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    break;
                }
                if (obj.equals(objArr[i13])) {
                    obj2 = objArr[i13 ^ 1];
                } else {
                    iZza = i12 + 1;
                }
            }
            obj2 = null;
        } else if (obj3 instanceof short[]) {
            short[] sArr = (short[]) obj3;
            int length2 = sArr.length - 1;
            int iZza2 = zziu.zza(obj.hashCode());
            while (true) {
                int i14 = iZza2 & length2;
                char c11 = (char) sArr[i14];
                if (c11 == 65535) {
                    break;
                }
                if (obj.equals(objArr[c11])) {
                    obj2 = objArr[c11 ^ 1];
                } else {
                    iZza2 = i14 + 1;
                }
            }
            obj2 = null;
        } else {
            int[] iArr = (int[]) obj3;
            int length3 = iArr.length - 1;
            int iZza3 = zziu.zza(obj.hashCode());
            while (true) {
                int i15 = iZza3 & length3;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    break;
                }
                if (obj.equals(objArr[i16])) {
                    obj2 = objArr[i16 ^ 1];
                } else {
                    iZza3 = i15 + 1;
                }
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzjb
    final zziv zza() {
        return new zzjq(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzjb
    final zzjc zzc() {
        return new zzjo(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzjb
    final zzjc zzd() {
        return new zzjp(this, new zzjq(this.zzb, 0, this.zzd));
    }
}
