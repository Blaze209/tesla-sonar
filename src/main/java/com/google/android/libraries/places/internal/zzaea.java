package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
class zzaea extends zzadz {
    protected final byte[] zza;

    zzaea(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaed) || zzd() != ((zzaed) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzaea)) {
            return obj.equals(this);
        }
        zzaea zzaeaVar = (zzaea) obj;
        int iZzk = zzk();
        int iZzk2 = zzaeaVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzaeaVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzaeaVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzaeaVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzaeaVar.zza;
        zzaeaVar.zzc();
        int i11 = 0;
        int i12 = 0;
        while (i11 < iZzd) {
            if (bArr[i11] != bArr2[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public byte zza(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    byte zzb(int i11) {
        return this.zza[i11];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    protected final int zze(int i11, int i12, int i13) {
        return zzafh.zzd(i11, this.zza, 0, i13);
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public final zzaed zzf(int i11, int i12) {
        zzaed.zzj(0, i12, zzd());
        return i12 == 0 ? zzaed.zzb : new zzadx(this.zza, 0, i12);
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    final void zzh(zzadt zzadtVar) {
        ((zzaei) zzadtVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public final boolean zzi() {
        return zzahw.zze(this.zza, 0, zzd());
    }
}
