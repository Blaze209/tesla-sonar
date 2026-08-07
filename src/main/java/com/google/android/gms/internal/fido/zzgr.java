package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes5.dex */
final class zzgr extends zzgu {
    private final int zzc;
    private final int zzd;

    zzgr(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzgx.zzj(i11, i11 + i12, bArr.length);
        this.zzc = i11;
        this.zzd = i12;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zza(int i11) {
        int i12 = this.zzd;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.zza[this.zzc + i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    final byte zzb(int i11) {
        return this.zza[this.zzc + i11];
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    protected final void zze(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i13);
    }
}
