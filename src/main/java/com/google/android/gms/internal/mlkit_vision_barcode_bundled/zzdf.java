package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.slf4j.Marker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzdf implements Iterable, Serializable {
    public static final zzdf zzb = new zzde(zzep.zzb);
    private int zza = 0;

    static {
        int i11 = zzct.zza;
    }

    zzdf() {
    }

    private static zzdf zzc(Iterator it, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i11)));
        }
        if (i11 == 1) {
            return (zzdf) it.next();
        }
        int i12 = i11 >>> 1;
        zzdf zzdfVarZzc = zzc(it, i12);
        zzdf zzdfVarZzc2 = zzc(it, i11 - i12);
        if (Integer.MAX_VALUE - zzdfVarZzc.zzd() >= zzdfVarZzc2.zzd()) {
            return zzgd.zzy(zzdfVarZzc, zzdfVarZzc2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zzdfVarZzc.zzd() + Marker.ANY_NON_NULL_MARKER + zzdfVarZzc2.zzd());
    }

    static int zzo(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i11 + " < 0");
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i11 + ", " + i12);
        }
        throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
    }

    public static zzdf zzr(byte[] bArr, int i11, int i12) {
        zzo(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzde(bArr2);
    }

    public static zzdf zzs(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = inputStream.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    break;
                }
                i11 += i12;
            }
            zzdf zzdfVarZzr = i11 == 0 ? null : zzr(bArr, 0, i11);
            if (zzdfVarZzr == null) {
                break;
            }
            arrayList.add(zzdfVarZzr);
            iMin = Math.min(iMin + iMin, PKIFailureInfo.certRevoked);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    static void zzu(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzgq.zza(this) : zzgq.zza(zzk(0, 47)).concat("..."));
    }

    public abstract byte zza(int i11);

    abstract byte zzb(int i11);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i11, int i12, int i13);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i11, int i12, int i13);

    protected abstract int zzj(int i11, int i12, int i13);

    public abstract zzdf zzk(int i11, int i12);

    protected abstract String zzl(Charset charset);

    abstract void zzm(zzcx zzcxVar);

    public abstract boolean zzn();

    protected final int zzp() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzdb iterator() {
        return new zzcy(this);
    }

    public final String zzt() {
        return zzd() == 0 ? "" : zzl(zzep.zza);
    }

    @Deprecated
    public final void zzv(byte[] bArr, int i11, int i12, int i13) {
        zzo(0, i13, zzd());
        zzo(i12, i12 + i13, bArr.length);
        if (i13 > 0) {
            zze(bArr, 0, i12, i13);
        }
    }

    public final byte[] zzw() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzep.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
