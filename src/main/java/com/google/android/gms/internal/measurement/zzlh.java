package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzlh implements Iterable, Serializable {
    public static final zzlh zzb = new zzlg(zzmp.zzb);
    private int zza = 0;

    static {
        int i11 = zzkv.zza;
    }

    zzlh() {
    }

    public static zzlh zzh(byte[] bArr, int i11, int i12) {
        zzj(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzlg(bArr2);
    }

    static int zzj(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i11);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < i11) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 44 + String.valueOf(i12).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 15 + String.valueOf(i13).length());
        sb4.append("End index: ");
        sb4.append(i12);
        sb4.append(" >= ");
        sb4.append(i13);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzla(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzog.zza(this) : zzog.zza(zze(0, 47)).concat("..."));
    }

    public abstract byte zza(int i11);

    abstract byte zzb(int i11);

    public abstract int zzc();

    public abstract zzlh zze(int i11, int i12);

    abstract void zzf(zzkz zzkzVar);

    protected abstract int zzg(int i11, int i12, int i13);

    protected final int zzi() {
        return this.zza;
    }
}
