package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class zzdp extends zzcs implements RandomAccess, zzeo {
    private double[] zza;
    private int zzb;

    static {
        new zzdp(new double[0], 0, false);
    }

    zzdp() {
        this(new double[10], 0, true);
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
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i11));
        }
        int i13 = i11 + 1;
        double[] dArr = this.zza;
        if (i12 < dArr.length) {
            System.arraycopy(dArr, i11, dArr, i13, i12 - i11);
        } else {
            double[] dArr2 = new double[((i12 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            System.arraycopy(this.zza, i11, dArr2, i13, this.zzb - i11);
            this.zza = dArr2;
        }
        this.zza[i11] = dDoubleValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzdp)) {
            return super.addAll(collection);
        }
        zzdp zzdpVar = (zzdp) collection;
        int i11 = zzdpVar.zzb;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zzb;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.zza;
        if (i13 > dArr.length) {
            this.zza = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(zzdpVar.zza, 0, this.zza, this.zzb, zzdpVar.zzb);
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
        if (!(obj instanceof zzdp)) {
            return super.equals(obj);
        }
        zzdp zzdpVar = (zzdp) obj;
        if (this.zzb != zzdpVar.zzb) {
            return false;
        }
        double[] dArr = zzdpVar.zza;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (Double.doubleToLongBits(this.zza[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzh(i11);
        return Double.valueOf(this.zza[i11]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zza[i12]);
            byte[] bArr = zzep.zzb;
            i11 = (i11 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i11 = this.zzb;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zza[i12] == dDoubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        zzh(i11);
        double[] dArr = this.zza;
        double d11 = dArr[i11];
        int i12 = this.zzb;
        if (i11 < i12 - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (i12 - i11) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zza;
        System.arraycopy(dArr, i12, dArr, i11, this.zzb - i12);
        this.zzb -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i11);
        double[] dArr = this.zza;
        double d11 = dArr[i11];
        dArr[i11] = dDoubleValue;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i11) {
        if (i11 >= this.zzb) {
            return new zzdp(Arrays.copyOf(this.zza, i11), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i11) {
        zzh(i11);
        return this.zza[i11];
    }

    public final void zzf(double d11) {
        zza();
        int i11 = this.zzb;
        double[] dArr = this.zza;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        dArr3[i12] = d11;
    }

    private zzdp(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.zza = dArr;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
