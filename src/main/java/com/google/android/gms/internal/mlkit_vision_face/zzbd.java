package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes5.dex */
final class zzbd extends AbstractMap implements Serializable {
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

    zzbd() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    static /* synthetic */ int zzb(zzbd zzbdVar) {
        int i11 = zzbdVar.zzg;
        zzbdVar.zzg = i11 - 1;
        return i11;
    }

    static /* synthetic */ Object zzg(zzbd zzbdVar, int i11) {
        return zzbdVar.zzA()[i11];
    }

    static /* synthetic */ Object zzj(zzbd zzbdVar, int i11) {
        return zzbdVar.zzB()[i11];
    }

    static /* synthetic */ Object zzk(zzbd zzbdVar) {
        Object obj = zzbdVar.zze;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ void zzm(zzbd zzbdVar, int i11, Object obj) {
        zzbdVar.zzB()[i11] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int iZza = zzbf.zza(obj);
        int iZzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzc = zzbe.zzc(obj2, iZza & iZzu);
        if (iZzc != 0) {
            int i11 = ~iZzu;
            int i12 = iZza & i11;
            do {
                int i13 = iZzc - 1;
                int i14 = zzz()[i13];
                if ((i14 & i11) == i12 && zzx.zza(obj, zzA()[i13])) {
                    return i13;
                }
                iZzc = i14 & iZzu;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzw(int i11, int i12, int i13, int i14) {
        Object objZzd = zzbe.zzd(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            zzbe.zze(objZzd, i13 & i15, i14 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzz = zzz();
        for (int i16 = 0; i16 <= i11; i16++) {
            int iZzc = zzbe.zzc(obj, i16);
            while (iZzc != 0) {
                int i17 = iZzc - 1;
                int i18 = iArrZzz[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int iZzc2 = zzbe.zzc(objZzd, i21);
                zzbe.zze(objZzd, i21, iZzc);
                iArrZzz[i17] = ((~i15) & i19) | (iZzc2 & i15);
                iZzc = i18 & i11;
            }
        }
        this.zze = objZzd;
        zzy(i15);
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(Object obj) {
        if (zzq()) {
            return zzd;
        }
        int iZzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzb = zzbe.zzb(obj, null, iZzu, obj2, zzz(), zzA(), null);
        if (iZzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[iZzb];
        zzp(iZzb, iZzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i11) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzcn.zza(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i11 = 0; i11 < this.zzg; i11++) {
            if (zzx.zza(obj, zzB()[i11])) {
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
        zzay zzayVar = new zzay(this);
        this.zzi = zzayVar;
        return zzayVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzv = zzv(obj);
        if (iZzv == -1) {
            return null;
        }
        return zzB()[iZzv];
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
        zzba zzbaVar = new zzba(this);
        this.zzh = zzbaVar;
        return zzbaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i11;
        if (zzq()) {
            zzab.zzd(zzq(), "Arrays already allocated");
            int i12 = this.zzf;
            int iMax = Math.max(i12 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzbe.zzd(iMax2);
            zzy(iMax2 - 1);
            this.zza = new int[i12];
            this.zzb = new Object[i12];
            this.zzc = new Object[i12];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int i13 = this.zzg;
        int i14 = i13 + 1;
        int iZza = zzbf.zza(obj);
        int iZzu = zzu();
        int i15 = iZza & iZzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int iZzc = zzbe.zzc(obj3, i15);
        if (iZzc == 0) {
            if (i14 > iZzu) {
                iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i13);
            } else {
                Object obj4 = this.zze;
                obj4.getClass();
                zzbe.zze(obj4, i15, i14);
            }
            i11 = 1;
        } else {
            int i16 = ~iZzu;
            int i17 = iZza & i16;
            int i18 = 0;
            while (true) {
                int i19 = iZzc - 1;
                int i21 = iArrZzz[i19];
                i11 = 1;
                int i22 = i21 & i16;
                if (i22 == i17 && zzx.zza(obj, objArrZzA[i19])) {
                    Object obj5 = objArrZzB[i19];
                    objArrZzB[i19] = obj2;
                    return obj5;
                }
                int i23 = i21 & iZzu;
                i18++;
                if (i23 == 0) {
                    if (i18 < 9) {
                        if (i14 <= iZzu) {
                            iArrZzz[i19] = (i14 & iZzu) | i22;
                            break;
                        }
                        iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i13);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzA()[iZze], zzB()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzn();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i23;
            }
        }
        int length = zzz().length;
        if (i14 > length) {
            int i24 = i11;
            int iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(i24, length >>> 1) + length) | i24);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzz(), iMin);
                this.zzb = Arrays.copyOf(zzA(), iMin);
                this.zzc = Arrays.copyOf(zzB(), iMin);
            }
        }
        zzz()[i13] = (~iZzu) & iZza;
        zzA()[i13] = obj;
        zzB()[i13] = obj2;
        this.zzg = i14;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzx = zzx(obj);
        if (objZzx == zzd) {
            return null;
        }
        return objZzx;
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
        zzbc zzbcVar = new zzbc(this);
        this.zzj = zzbcVar;
        return zzbcVar;
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

    final void zzn() {
        this.zzf += 32;
    }

    final void zzo(int i11) {
        this.zzf = zzcn.zza(12, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final void zzp(int i11, int i12) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int size = size();
        int i13 = size - 1;
        if (i11 >= i13) {
            objArrZzA[i11] = null;
            objArrZzB[i11] = null;
            iArrZzz[i11] = 0;
            return;
        }
        Object obj2 = objArrZzA[i13];
        objArrZzA[i11] = obj2;
        objArrZzB[i11] = objArrZzB[i13];
        objArrZzA[i13] = null;
        objArrZzB[i13] = null;
        iArrZzz[i11] = iArrZzz[i13];
        iArrZzz[i13] = 0;
        int iZza = zzbf.zza(obj2) & i12;
        int iZzc = zzbe.zzc(obj, iZza);
        if (iZzc == size) {
            zzbe.zze(obj, iZza, i11 + 1);
            return;
        }
        while (true) {
            int i14 = iZzc - 1;
            int i15 = iArrZzz[i14];
            int i16 = i15 & i12;
            if (i16 == size) {
                iArrZzz[i14] = ((i11 + 1) & i12) | (i15 & (~i12));
                return;
            }
            iZzc = i16;
        }
    }

    final boolean zzq() {
        return this.zze == null;
    }

    zzbd(int i11) {
        zzo(12);
    }
}
