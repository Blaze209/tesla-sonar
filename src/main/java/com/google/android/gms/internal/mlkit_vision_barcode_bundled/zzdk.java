package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.nearby.uwb.RangingPosition;

/* JADX INFO: loaded from: classes5.dex */
final class zzdk extends zzdn {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzdk(byte[] bArr, int i11, int i12) {
        super(null);
        int length = bArr.length;
        if (((length - i12) | i12) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzb(byte b11) throws zzdl {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr[i11] = b11;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    public final void zzc(byte[] bArr, int i11, int i12) {
        try {
            System.arraycopy(bArr, i11, this.zzb, this.zzd, i12);
            this.zzd += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i12)), e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzd(int i11, boolean z11) throws zzdl {
        zzt(i11 << 3);
        zzb(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zze(int i11, zzdf zzdfVar) throws zzdl {
        zzt((i11 << 3) | 2);
        zzt(zzdfVar.zzd());
        zzdfVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzf(int i11, int i12) throws zzdl {
        zzt((i11 << 3) | 5);
        zzg(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzg(int i11) throws zzdl {
        try {
            byte[] bArr = this.zzb;
            int i12 = this.zzd;
            int i13 = i12 + 1;
            this.zzd = i13;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i12 + 2;
            this.zzd = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i12 + 3;
            this.zzd = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.zzd = i12 + 4;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzh(int i11, long j11) throws zzdl {
        zzt((i11 << 3) | 1);
        zzi(j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzi(long j11) throws zzdl {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            int i12 = i11 + 1;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) j11) & 255);
            int i13 = i11 + 2;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
            int i14 = i11 + 3;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
            int i15 = i11 + 4;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
            int i16 = i11 + 5;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i11 + 6;
            this.zzd = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i11 + 7;
            this.zzd = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.zzd = i11 + 8;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzj(int i11, int i12) throws zzdl {
        zzt(i11 << 3);
        zzk(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzk(int i11) throws zzdl {
        if (i11 >= 0) {
            zzt(i11);
        } else {
            zzv(i11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzl(byte[] bArr, int i11, int i12) {
        zzc(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    final void zzm(int i11, zzfm zzfmVar, zzge zzgeVar) throws zzdl {
        zzt((i11 << 3) | 2);
        zzt(((zzcq) zzfmVar).zzB(zzgeVar));
        zzgeVar.zzi(zzfmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzn(int i11, zzfm zzfmVar) throws zzdl {
        zzt(11);
        zzs(2, i11);
        zzt(26);
        zzt(zzfmVar.zzF());
        zzfmVar.zzab(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzo(int i11, zzdf zzdfVar) throws zzdl {
        zzt(11);
        zzs(2, i11);
        zze(3, zzdfVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzp(int i11, String str) throws zzdl {
        zzt((i11 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws zzdl {
        int i11 = this.zzd;
        try {
            int iZzA = zzdn.zzA(str.length() * 3);
            int iZzA2 = zzdn.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzt(zzhe.zze(str));
                byte[] bArr = this.zzb;
                int i12 = this.zzd;
                this.zzd = zzhe.zzd(str, bArr, i12, this.zzc - i12);
                return;
            }
            int i13 = i11 + iZzA2;
            this.zzd = i13;
            int iZzd = zzhe.zzd(str, this.zzb, i13, this.zzc - i13);
            this.zzd = i11;
            zzt((iZzd - i11) - iZzA2);
            this.zzd = iZzd;
        } catch (zzhd e11) {
            this.zzd = i11;
            zzD(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzdl(e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzr(int i11, int i12) throws zzdl {
        zzt((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzs(int i11, int i12) throws zzdl {
        zzt(i11 << 3);
        zzt(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzt(int i11) throws zzdl {
        while ((i11 & RangingPosition.RSSI_UNKNOWN) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr[i12] = (byte) ((i11 | 128) & 255);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
            }
        }
        byte[] bArr2 = this.zzb;
        int i13 = this.zzd;
        this.zzd = i13 + 1;
        bArr2[i13] = (byte) i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzu(int i11, long j11) throws zzdl {
        zzt(i11 << 3);
        zzv(j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzv(long j11) throws zzdl {
        if (!zzdn.zzc || this.zzc - this.zzd < 10) {
            while ((j11 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr[i11] = (byte) ((((int) j11) | 128) & 255);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
                }
            }
            byte[] bArr2 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr2[i12] = (byte) j11;
            return;
        }
        while (true) {
            int i13 = (int) j11;
            if ((j11 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i14 = this.zzd;
                this.zzd = i14 + 1;
                zzgz.zzn(bArr3, i14, (byte) i13);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i15 = this.zzd;
            this.zzd = i15 + 1;
            zzgz.zzn(bArr4, i15, (byte) ((i13 | 128) & 255));
            j11 >>>= 7;
        }
    }
}
