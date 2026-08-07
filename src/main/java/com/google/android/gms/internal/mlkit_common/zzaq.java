package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i11) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i11;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static zzaq zzg(int i11, Object[] objArr, zzah zzahVar) {
        int iHighestOneBit;
        boolean z11;
        int i12;
        char c11;
        ?? r11;
        char c12;
        short[] sArr;
        boolean z12;
        int i13;
        ?? r16;
        boolean z13;
        ?? r12;
        Object[] objArr2;
        zzag zzagVar;
        boolean z14;
        int i14 = i11;
        Object[] objArrCopyOf = objArr;
        if (i14 == 0) {
            return (zzaq) zza;
        }
        zzag zzagVar2 = null;
        ?? r13 = 0;
        zzag zzagVar3 = null;
        zzag zzagVar4 = null;
        boolean z15 = false;
        int i15 = 1;
        if (i14 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzw.zza(obj, obj2);
            return new zzaq(null, objArrCopyOf, 1);
        }
        zzt.zzb(i14, objArrCopyOf.length >> 1, "index");
        char c13 = 2;
        int iMax = Math.max(i14, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i14 != 1) {
            int i16 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i14) {
                    int i19 = i18 + i18;
                    int i21 = i17 + i17;
                    Object obj3 = objArrCopyOf[i21];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i21 ^ i15];
                    Objects.requireNonNull(obj4);
                    zzw.zza(obj3, obj4);
                    int iZza = zzy.zza(obj3.hashCode());
                    while (true) {
                        int i22 = iZza & i16;
                        z12 = z15;
                        i13 = i15;
                        int i23 = bArr[i22] & 255;
                        if (i23 == 255) {
                            bArr[i22] = (byte) i19;
                            if (i18 < i17) {
                                objArrCopyOf[i19] = obj3;
                                objArrCopyOf[i19 ^ 1] = obj4;
                            }
                            i18++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i23 == true ? 1 : 0])) {
                            int i24 = ~i23;
                            Object obj5 = objArrCopyOf[i24 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zzag zzagVar5 = new zzag(obj3, obj4, obj5);
                            objArrCopyOf[i24 == true ? 1 : 0] = obj4;
                            zzagVar3 = zzagVar5;
                            break;
                        }
                        iZza = i22 + 1;
                        z15 = z12;
                        i15 = i13;
                    }
                    i17++;
                    z15 = z12;
                    i15 = i13;
                }
                z11 = z15;
                i12 = i15;
                if (i18 == i14) {
                    c11 = 2;
                    r11 = bArr;
                    r16 = z11;
                } else {
                    sArr = new Object[3];
                    sArr[z11 ? 1 : 0] = bArr;
                    sArr[i12] = Integer.valueOf(i18);
                    sArr[2] = zzagVar3;
                    r13 = sArr;
                    z14 = z11;
                }
            } else {
                z11 = false;
                i12 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i25 = 0;
                    for (int i26 = 0; i26 < i14; i26++) {
                        int i27 = i25 + i25;
                        int i28 = i26 + i26;
                        Object obj6 = objArrCopyOf[i28];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i28 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzw.zza(obj6, obj7);
                        int iZza2 = zzy.zza(obj6.hashCode());
                        while (true) {
                            int i29 = iZza2 & i16;
                            char c14 = (char) sArr[i29];
                            if (c14 == 65535) {
                                sArr[i29] = (short) i27;
                                if (i25 < i26) {
                                    objArrCopyOf[i27] = obj6;
                                    objArrCopyOf[i27 ^ 1] = obj7;
                                }
                                i25++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c14])) {
                                int i31 = c14 ^ 1;
                                Object obj8 = objArrCopyOf[i31 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzag zzagVar6 = new zzag(obj6, obj7, obj8);
                                objArrCopyOf[i31 == true ? 1 : 0] = obj7;
                                zzagVar4 = zzagVar6;
                                break;
                            }
                            iZza2 = i29 + 1;
                        }
                    }
                    if (i25 == i14) {
                        r13 = sArr;
                        z14 = z11;
                    } else {
                        r13 = new Object[]{sArr, Integer.valueOf(i25), zzagVar4};
                        z14 = z11;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < i14) {
                        int i34 = i33 + i33;
                        int i35 = i32 + i32;
                        Object obj9 = objArrCopyOf[i35];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i35 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzw.zza(obj9, obj10);
                        int iZza3 = zzy.zza(obj9.hashCode());
                        while (true) {
                            int i36 = iZza3 & i16;
                            int i37 = iArr[i36];
                            if (i37 == -1) {
                                iArr[i36] = i34;
                                if (i33 < i32) {
                                    objArrCopyOf[i34] = obj9;
                                    objArrCopyOf[i34 ^ 1] = obj10;
                                }
                                i33++;
                                c12 = c13;
                                break;
                            }
                            c12 = c13;
                            if (obj9.equals(objArrCopyOf[i37])) {
                                int i38 = i37 ^ 1;
                                Object obj11 = objArrCopyOf[i38];
                                Objects.requireNonNull(obj11);
                                zzag zzagVar7 = new zzag(obj9, obj10, obj11);
                                objArrCopyOf[i38] = obj10;
                                zzagVar2 = zzagVar7;
                                break;
                            }
                            iZza3 = i36 + 1;
                            c13 = c12;
                        }
                        i32++;
                        c13 = c12;
                    }
                    c11 = c13;
                    if (i33 == i14) {
                        r11 = iArr;
                        r16 = z11;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i33);
                        objArr3[c11] = zzagVar2;
                        r11 = objArr3;
                        r16 = z11;
                    }
                }
            }
            z13 = r11 instanceof Object[];
            r12 = r11;
            if (z13) {
                objArr2 = (Object[]) r11;
                zzagVar = (zzag) objArr2[c11];
                if (zzahVar != null) {
                    throw zzagVar.zza();
                }
                zzahVar.zzc = zzagVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i12]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r12 = obj12;
                i14 = iIntValue;
            }
            return new zzaq(r12, objArrCopyOf, i14);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzw.zza(obj13, obj14);
        z14 = false;
        i14 = 1;
        i12 = 1;
        c11 = 2;
        r11 = r13;
        r16 = z14;
        z13 = r11 instanceof Object[];
        r12 = r11;
        if (z13) {
            objArr2 = (Object[]) r11;
            zzagVar = (zzag) objArr2[c11];
            if (zzahVar != null) {
                throw zzagVar.zza();
            }
            zzahVar.zzc = zzagVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i12]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r12 = obj15;
            i14 = iIntValue2;
        }
        return new zzaq(r12, objArrCopyOf, i14);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i11 = this.zzd;
            Object[] objArr = this.zzb;
            if (i11 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzy.zza(obj.hashCode());
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
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzy.zza(obj.hashCode());
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
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzy.zza(obj.hashCode());
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
            }
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

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
