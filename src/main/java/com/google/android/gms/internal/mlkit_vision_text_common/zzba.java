package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes5.dex */
final class zzba extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzba() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object zzg(zzba zzbaVar, int i11) {
        return zzbaVar.zzB()[i11];
    }

    static /* synthetic */ Object zzi(zzba zzbaVar) {
        Object obj = zzbaVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    static /* synthetic */ Object zzj(zzba zzbaVar, int i11) {
        return zzbaVar.zzC()[i11];
    }

    static /* synthetic */ void zzn(zzba zzbaVar, int i11, Object obj) {
        zzbaVar.zzC()[i11] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzbc.zza(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzbb.zzc(obj2, iZza & iZzv);
        if (iZzc != 0) {
            int i11 = ~iZzv;
            int i12 = iZza & i11;
            do {
                int i13 = iZzc - 1;
                int i14 = zzA()[i13];
                if ((i14 & i11) == i12 && zzw.zza(obj, zzB()[i13])) {
                    return i13;
                }
                iZzc = i14 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i11, int i12, int i13, int i14) {
        int i15 = i12 - 1;
        Object objZzd = zzbb.zzd(i12);
        if (i14 != 0) {
            zzbb.zze(objZzd, i13 & i15, i14 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i16 = 0; i16 <= i11; i16++) {
            int iZzc = zzbb.zzc(obj, i16);
            while (iZzc != 0) {
                int i17 = iZzc - 1;
                int i18 = iArrZzA[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int iZzc2 = zzbb.zzc(objZzd, i21);
                zzbb.zze(objZzd, i21, iZzc);
                iArrZzA[i17] = ((~i15) & i19) | (iZzc2 & i15);
                iZzc = i18 & i11;
            }
        }
        this.zze = objZzd;
        zzz(i15);
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzbb.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i11) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzcq.zza(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i11 = 0; i11 < this.zzg; i11++) {
            if (zzw.zza(obj, zzC()[i11])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzau zzauVar = new zzau(this);
        this.zzi = zzauVar;
        return zzauVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzax zzaxVar = new zzax(this);
        this.zzh = zzaxVar;
        return zzaxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i11;
        if (zzr()) {
            zzx.zzd(zzr(), "Arrays already allocated");
            int i12 = this.zzf;
            int iMax = Math.max(i12 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzbb.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i12];
            this.zzb = new Object[i12];
            this.zzc = new Object[i12];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i13 = this.zzg;
        int i14 = i13 + 1;
        int iZza = zzbc.zza(obj);
        int iZzv = zzv();
        int i15 = iZza & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzbb.zzc(obj3, i15);
        if (iZzc == 0) {
            if (i14 > iZzv) {
                iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i13);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzbb.zze(obj4, i15, i14);
            }
            i11 = 1;
        } else {
            int i16 = ~iZzv;
            int i17 = iZza & i16;
            int i18 = 0;
            while (true) {
                int i19 = iZzc - 1;
                int i21 = iArrZzA[i19];
                i11 = 1;
                int i22 = i21 & i16;
                if (i22 == i17 && zzw.zza(obj, objArrZzB[i19])) {
                    Object obj5 = objArrZzC[i19];
                    objArrZzC[i19] = obj2;
                    return obj5;
                }
                int i23 = i21 & iZzv;
                i18++;
                if (i23 == 0) {
                    if (i18 < 9) {
                        if (i14 <= iZzv) {
                            iArrZzA[i19] = (i14 & iZzv) | i22;
                            break;
                        }
                        iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i13);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzo();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i23;
            }
        }
        int length = zzA().length;
        if (i14 > length) {
            int i24 = i11;
            int iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(i24, length >>> 1) + length) | i24);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzA(), iMin);
                this.zzb = Arrays.copyOf(zzB(), iMin);
                this.zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i13] = (~iZzv) & iZza;
        zzB()[i13] = obj;
        zzC()[i13] = obj2;
        this.zzg = i14;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzaz zzazVar = new zzaz(this);
        this.zzj = zzazVar;
        return zzazVar;
    }

    final int zze() {
        return isEmpty() ? -1 : 0;
    }

    final int zzf(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.zzg) {
            return i12;
        }
        return -1;
    }

    final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzo() {
        this.zzf += 32;
    }

    final void zzp(int i11) {
        this.zzf = zzcq.zza(i11, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final void zzq(int i11, int i12) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i13 = size - 1;
        if (i11 >= i13) {
            objArrZzB[i11] = null;
            objArrZzC[i11] = null;
            iArrZzA[i11] = 0;
            return;
        }
        int i14 = i11 + 1;
        Object obj2 = objArrZzB[i13];
        objArrZzB[i11] = obj2;
        objArrZzC[i11] = objArrZzC[i13];
        objArrZzB[i13] = null;
        objArrZzC[i13] = null;
        iArrZzA[i11] = iArrZzA[i13];
        iArrZzA[i13] = 0;
        int iZza = zzbc.zza(obj2) & i12;
        int iZzc = zzbb.zzc(obj, iZza);
        if (iZzc == size) {
            zzbb.zze(obj, iZza, i14);
            return;
        }
        while (true) {
            int i15 = iZzc - 1;
            int i16 = iArrZzA[i15];
            int i17 = i16 & i12;
            if (i17 == size) {
                iArrZzA[i15] = (i16 & (~i12)) | (i12 & i14);
                return;
            }
            iZzc = i17;
        }
    }

    final boolean zzr() {
        return this.zze == null;
    }

    zzba(int i11) {
        zzp(12);
    }
}
