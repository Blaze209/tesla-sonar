package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaed implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzaed zzb = new zzaea(zzafh.zzd);
    private static final zzaec zzd;
    private int zzc = 0;

    static {
        int i11 = zzads.zza;
        zzd = new zzaec(null);
        zza = new zzadv();
    }

    zzaed() {
    }

    static int zzj(int i11, int i12, int i13) {
        if (((i13 - i12) | i12) >= 0) {
            return i12;
        }
        throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
    }

    public static zzaed zzl(String str) {
        return new zzaea(str.getBytes(zzafh.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzadu(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzahg.zza(this) : zzahg.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i11);

    abstract byte zzb(int i11);

    public abstract int zzd();

    protected abstract int zze(int i11, int i12, int i13);

    public abstract zzaed zzf(int i11, int i12);

    protected abstract String zzg(Charset charset);

    abstract void zzh(zzadt zzadtVar);

    public abstract boolean zzi();

    protected final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
