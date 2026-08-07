package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class zzfb extends zzcs implements RandomAccess, zzeo {
    private long[] zza;
    private int zzb;

    static {
        new zzfb(new long[0], 0, false);
    }

    zzfb() {
        this(new long[10], 0, true);
    }

    private final String zzg(int i11) {
        return "Index:" + i11 + ", Size:" + this.zzb;
    }

    private final void zzh(int i11) {
        if (i11 < 0 || i11 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i11));
        }
        int i13 = i11 + 1;
        long[] jArr = this.zza;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i13, i12 - i11);
        } else {
            long[] jArr2 = new long[((i12 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            System.arraycopy(this.zza, i11, jArr2, i13, this.zzb - i11);
            this.zza = jArr2;
        }
        this.zza[i11] = jLongValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzfb)) {
            return super.addAll(collection);
        }
        zzfb zzfbVar = (zzfb) collection;
        int i11 = zzfbVar.zzb;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zzb;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.zza;
        if (i13 > jArr.length) {
            this.zza = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(zzfbVar.zza, 0, this.zza, this.zzb, zzfbVar.zzb);
        this.zzb = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfb)) {
            return super.equals(obj);
        }
        zzfb zzfbVar = (zzfb) obj;
        if (this.zzb != zzfbVar.zzb) {
            return false;
        }
        long[] jArr = zzfbVar.zza;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zza[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzh(i11);
        return Long.valueOf(this.zza[i11]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            long j11 = this.zza[i12];
            byte[] bArr = zzep.zzb;
            i11 = (i11 * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i11 = this.zzb;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zza[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        zzh(i11);
        long[] jArr = this.zza;
        long j11 = jArr[i11];
        int i12 = this.zzb;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zza;
        System.arraycopy(jArr, i12, jArr, i11, this.zzb - i12);
        this.zzb -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzh(i11);
        long[] jArr = this.zza;
        long j11 = jArr[i11];
        jArr[i11] = jLongValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i11) {
        if (i11 >= this.zzb) {
            return new zzfb(Arrays.copyOf(this.zza, i11), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i11) {
        zzh(i11);
        return this.zza[i11];
    }

    public final void zzf(long j11) {
        zza();
        int i11 = this.zzb;
        long[] jArr = this.zza;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.zza = jArr2;
        }
        long[] jArr3 = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        jArr3[i12] = j11;
    }

    private zzfb(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.zza = jArr;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
