package com.google.android.gms.internal.nearby;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzpt extends zzpq implements List, RandomAccess {
    private static final zzpx zza = new zzpr(zzpv.zza, 0);

    zzpt() {
    }

    static zzpt zzi(Object[] objArr, int i11) {
        return i11 == 0 ? zzpv.zza : new zzpv(objArr, i11);
    }

    public static zzpt zzj(Collection collection) {
        if (!(collection instanceof zzpq)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzpu.zza(array, length);
            return zzi(array, length);
        }
        zzpt zzptVarZzd = ((zzpq) collection).zzd();
        if (!zzptVarZzd.zzf()) {
            return zzptVarZzd;
        }
        Object[] array2 = zzptVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zzpt zzk() {
        return zzpv.zza;
    }

    public static zzpt zzl(Object obj) {
        Object[] objArr = {obj};
        zzpu.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzpt zzm(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzpu.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzpt zzn(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"/", "\\", "../"};
        zzpu.zza(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzpt zzo(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = {obj, obj2, obj3, obj4};
        zzpu.zza(objArr, 4);
        return zzi(objArr, 4);
    }

    public static zzpt zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzpu.zza(objArr, 5);
        return zzi(objArr, 5);
    }

    @SafeVarargs
    public static zzpt zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i11 = length + 12;
        Object[] objArr2 = new Object[i11];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzpu.zza(objArr2, i11);
        return zzi(objArr2, i11);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i11 = 0; i11 < size; i11++) {
                if (!zzpk.zza(get(i11), list.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzpk.zza(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i11 = 0; i11 < size; i11++) {
            iHashCode = (iHashCode * 31) + get(i11).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (obj.equals(get(i11))) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    int zza(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = get(i12);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    @Deprecated
    public final zzpt zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    /* JADX INFO: renamed from: zze */
    public final zzpw iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzpt subList(int i11, int i12) {
        zzpm.zzh(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        return i13 == 0 ? zzpv.zza : new zzps(this, i11, i13);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzpx listIterator(int i11) {
        zzpm.zzb(i11, size(), "index");
        return isEmpty() ? zza : new zzpr(this, i11);
    }
}
