package com.google.android.gms.internal.measurement;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
final class zzlk extends zzlm {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzlk(byte[] bArr, int i11, int i12) {
        super(null);
        int length = bArr.length;
        if (((length - i12) | i12) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zza(int i11, int i12) throws zzll {
        zzr((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzb(int i11, int i12) throws zzll {
        zzr(i11 << 3);
        zzq(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzc(int i11, int i12) throws zzll {
        zzr(i11 << 3);
        zzr(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd(int i11, int i12) throws zzll {
        zzr((i11 << 3) | 5);
        zzs(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zze(int i11, long j11) throws zzll {
        zzr(i11 << 3);
        zzt(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzf(int i11, long j11) throws zzll {
        zzr((i11 << 3) | 1);
        zzu(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzg(int i11, boolean z11) throws zzll {
        zzr(i11 << 3);
        zzp(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzh(int i11, String str) throws zzll {
        zzr((i11 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzi(int i11, zzlh zzlhVar) throws zzll {
        zzr((i11 << 3) | 2);
        zzj(zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzj(zzlh zzlhVar) throws zzll {
        zzr(zzlhVar.zzc());
        zzlhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzk(byte[] bArr, int i11, int i12) throws zzll {
        zzr(i12);
        zzv(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    final void zzl(int i11, zznm zznmVar, zznx zznxVar) throws zzll {
        zzr((i11 << 3) | 2);
        zzr(((zzks) zznmVar).zzcd(zznxVar));
        zznxVar.zzf(zznmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzm(int i11, zznm zznmVar) throws zzll {
        zzr(11);
        zzc(2, i11);
        zzr(26);
        zzo(zznmVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzn(int i11, zzlh zzlhVar) throws zzll {
        zzr(11);
        zzc(2, i11);
        zzi(3, zzlhVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzo(zznm zznmVar) throws zzll {
        zzr(zznmVar.zzcn());
        zznmVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzp(byte b11) throws zzll {
        int i11 = this.zze;
        try {
            int i12 = i11 + 1;
            try {
                this.zzc[i11] = b11;
                this.zze = i12;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                i11 = i12;
                throw new zzll(i11, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e12) {
            e = e12;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzq(int i11) throws zzll {
        if (i11 >= 0) {
            zzr(i11);
        } else {
            zzt(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzr(int i11) throws zzll {
        int i12;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i13 = this.zze;
        while ((i11 & RangingPosition.RSSI_UNKNOWN) != 0) {
            try {
                i12 = i13 + 1;
                try {
                    this.zzc[i13] = (byte) (i11 | 128);
                    i11 >>>= 7;
                    i13 = i12;
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i13 = i12;
                    throw new zzll(i13, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                throw new zzll(i13, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i12 = i13 + 1;
        this.zzc[i13] = (byte) i11;
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzs(int i11) throws zzll {
        int i12 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i12] = (byte) i11;
            bArr[i12 + 1] = (byte) (i11 >> 8);
            bArr[i12 + 2] = (byte) (i11 >> 16);
            bArr[i12 + 3] = (byte) (i11 >> 24);
            this.zze = i12 + 4;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzll(i12, this.zzd, 4, e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzt(long j11) throws zzll {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z11 = zzlm.zzd;
        int i12 = this.zze;
        if (!z11 || this.zzd - i12 < 10) {
            while ((j11 & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.zzc[i12] = (byte) (((int) j11) | 128);
                        j11 >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e11) {
                        indexOutOfBoundsException = e11;
                        i12 = i13;
                        throw new zzll(i12, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    indexOutOfBoundsException = e12;
                }
            }
            i11 = i12 + 1;
            try {
                this.zzc[i12] = (byte) j11;
            } catch (IndexOutOfBoundsException e13) {
                indexOutOfBoundsException = e13;
                i12 = i11;
                throw new zzll(i12, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j11 & (-128)) != 0) {
                zzop.zzp(this.zzc, i12, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i12++;
            }
            i11 = i12 + 1;
            zzop.zzp(this.zzc, i12, (byte) j11);
        }
        this.zze = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzu(long j11) throws zzll {
        int i11 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i11] = (byte) j11;
            bArr[i11 + 1] = (byte) (j11 >> 8);
            bArr[i11 + 2] = (byte) (j11 >> 16);
            bArr[i11 + 3] = (byte) (j11 >> 24);
            bArr[i11 + 4] = (byte) (j11 >> 32);
            bArr[i11 + 5] = (byte) (j11 >> 40);
            bArr[i11 + 6] = (byte) (j11 >> 48);
            bArr[i11 + 7] = (byte) (j11 >> 56);
            this.zze = i11 + 8;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzll(i11, this.zzd, 8, e11);
        }
    }

    public final void zzv(byte[] bArr, int i11, int i12) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i12);
            this.zze += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzll(this.zze, this.zzd, i12, e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzw(byte[] bArr, int i11, int i12) {
        zzv(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzx(String str) throws zzll {
        int i11 = this.zze;
        try {
            int iZzz = zzlm.zzz(str.length() * 3);
            int iZzz2 = zzlm.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzos.zzb(str));
                byte[] bArr = this.zzc;
                int i12 = this.zze;
                this.zze = zzos.zzc(str, bArr, i12, this.zzd - i12);
                return;
            }
            int i13 = i11 + iZzz2;
            this.zze = i13;
            int iZzc = zzos.zzc(str, this.zzc, i13, this.zzd - i13);
            this.zze = i11;
            zzr((iZzc - i11) - iZzz2);
            this.zze = iZzc;
        } catch (zzor e11) {
            this.zze = i11;
            zzF(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzll(e12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
