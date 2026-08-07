package com.google.android.gms.internal.nearby;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class zzqj extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    zzqj(int[] iArr, int i11, int i12) {
        this.zza = iArr;
        this.zzb = i11;
        this.zzc = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzqk.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqj)) {
            return super.equals(obj);
        }
        zzqj zzqjVar = (zzqj) obj;
        int i11 = this.zzc - this.zzb;
        if (zzqjVar.zzc - zzqjVar.zzb != i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zza[this.zzb + i12] != zzqjVar.zza[zzqjVar.zzb + i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        zzpm.zza(i11, this.zzc - this.zzb, "index");
        return Integer.valueOf(this.zza[this.zzb + i11]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = this.zzb; i12 < this.zzc; i12++) {
            i11 = (i11 * 31) + this.zza[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iZza;
        if (!(obj instanceof Integer) || (iZza = zzqk.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc)) < 0) {
            return -1;
        }
        return iZza - this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.zzb;
            int i12 = this.zzc - 1;
            while (i12 >= i11) {
                if (iArr[i12] != iIntValue) {
                    i12--;
                } else if (i12 >= 0) {
                    return i12 - this.zzb;
                }
            }
            i12 = -1;
            if (i12 >= 0) {
                return i12 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        Integer num = (Integer) obj;
        zzpm.zza(i11, this.zzc - this.zzb, "index");
        int[] iArr = this.zza;
        int i12 = this.zzb + i11;
        int i13 = iArr[i12];
        num.getClass();
        iArr[i12] = num.intValue();
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i11, int i12) {
        zzpm.zzh(i11, i12, this.zzc - this.zzb);
        if (i11 == i12) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = this.zza;
        int i13 = this.zzb;
        return new zzqj(iArr, i13 + i11, i12 + i13);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.zzc - this.zzb) * 5);
        sb2.append('[');
        sb2.append(this.zza[this.zzb]);
        int i11 = this.zzb;
        while (true) {
            i11++;
            if (i11 >= this.zzc) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.zza[i11]);
        }
    }
}
