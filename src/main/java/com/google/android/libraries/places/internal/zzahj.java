package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzahj {
    private static final zzahj zza = new zzahj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzahj(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z11;
    }

    public static zzahj zzc() {
        return zza;
    }

    static zzahj zze(zzahj zzahjVar, zzahj zzahjVar2) {
        int i11 = zzahjVar.zzb;
        int i12 = zzahjVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzahjVar.zzc, 0);
        System.arraycopy(zzahjVar2.zzc, 0, iArrCopyOf, 0, 0);
        Object[] objArrCopyOf = Arrays.copyOf(zzahjVar.zzd, 0);
        System.arraycopy(zzahjVar2.zzd, 0, objArrCopyOf, 0, 0);
        return new zzahj(0, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzahj)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zza() {
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        this.zze = 0;
        return 0;
    }

    public final int zzb() {
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        this.zze = 0;
        return 0;
    }

    final zzahj zzd(zzahj zzahjVar) {
        if (zzahjVar.equals(zza)) {
            return this;
        }
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int[] iArr = this.zzc;
        int length = iArr.length;
        System.arraycopy(zzahjVar.zzc, 0, iArr, 0, 0);
        System.arraycopy(zzahjVar.zzd, 0, this.zzd, 0, 0);
        this.zzb = 0;
        return this;
    }

    public final void zzf() {
        this.zzf = false;
    }

    final void zzg(StringBuilder sb2, int i11) {
    }

    private zzahj() {
        this(0, new int[8], new Object[8], true);
    }
}
