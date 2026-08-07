package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
class zzde extends zzdd {
    protected final byte[] zza;

    zzde(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf) || zzd() != ((zzdf) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzde)) {
            return obj.equals(this);
        }
        zzde zzdeVar = (zzde) obj;
        int iZzp = zzp();
        int iZzp2 = zzdeVar.zzp();
        if (iZzp == 0 || iZzp2 == 0 || iZzp == iZzp2) {
            return zzg(zzdeVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zza(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    byte zzb(int i11) {
        return this.zza[i11];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected void zze(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.zza, i11, bArr, i12, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdd
    final boolean zzg(zzdf zzdfVar, int i11, int i12) {
        if (i12 > zzdfVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i12 + zzd());
        }
        int i13 = i11 + i12;
        if (i13 > zzdfVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + zzdfVar.zzd());
        }
        if (!(zzdfVar instanceof zzde)) {
            return zzdfVar.zzk(i11, i13).equals(zzk(0, i12));
        }
        zzde zzdeVar = (zzde) zzdfVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzdeVar.zza;
        int iZzc = zzc() + i12;
        int iZzc2 = zzc();
        int iZzc3 = zzdeVar.zzc() + i11;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzi(int i11, int i12, int i13) {
        return zzep.zzb(i11, this.zza, zzc() + i12, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzj(int i11, int i12, int i13) {
        int iZzc = zzc() + i12;
        return zzhe.zzf(i11, this.zza, iZzc, i13 + iZzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i11, int i12) {
        int iZzo = zzdf.zzo(i11, i12, zzd());
        return iZzo == 0 ? zzdf.zzb : new zzda(this.zza, zzc() + i11, iZzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    final void zzm(zzcx zzcxVar) {
        ((zzdk) zzcxVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        int iZzc = zzc();
        return zzhe.zzg(this.zza, iZzc, zzd() + iZzc);
    }
}
