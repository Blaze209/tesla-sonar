package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class zznv extends zzku implements RandomAccess {
    private static final Object[] zza;
    private static final zznv zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zznv(objArr, 0, false);
    }

    zznv() {
        this(zza, 0, true);
    }

    public static zznv zzd() {
        return zzb;
    }

    private static int zzf(int i11) {
        return Math.max(((i11 * 3) / 2) + 1, 10);
    }

    private final void zzh(int i11) {
        if (i11 < 0 || i11 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i11));
        }
    }

    private final String zzi(int i11) {
        return zzkw.zza(this.zzd, i11, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zzcF();
        if (i11 < 0 || i11 > (i12 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i11));
        }
        int i13 = i11 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i12 < length) {
            System.arraycopy(objArr, i11, objArr, i13, i12 - i11);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i11);
            System.arraycopy(this.zzc, i11, objArr2, i13, this.zzd - i11);
            this.zzc = objArr2;
        }
        this.zzc[i11] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        zzh(i11);
        return this.zzc[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zzcF();
        zzh(i11);
        Object[] objArr = this.zzc;
        Object obj = objArr[i11];
        int i12 = this.zzd;
        if (i11 < i12 - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (i12 - i11) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zzcF();
        zzh(i11);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    final void zze(int i11) {
        int length = this.zzc.length;
        if (i11 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i11, 10)];
            return;
        }
        while (length < i11) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    public final /* bridge */ /* synthetic */ zzmo zzg(int i11) {
        if (i11 >= this.zzd) {
            return new zznv(i11 == 0 ? zza : Arrays.copyOf(this.zzc, i11), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zznv(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.zzc = objArr;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzcF();
        int i11 = this.zzd;
        int length = this.zzc.length;
        if (i11 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
