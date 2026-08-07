package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
final class zzfs extends zzft implements Serializable {
    final byte[] zza;

    zzfs(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzbo.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i11 = bArr[0] & 255;
        int i12 = bArr[1] & 255;
        int i13 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i11 | (i12 << 8) | (i13 << 16);
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final boolean zzc(zzft zzftVar) {
        if (this.zza.length != zzftVar.zze().length) {
            return false;
        }
        boolean z11 = true;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i11 >= bArr.length) {
                return z11;
            }
            z11 &= bArr[i11] == zzftVar.zze()[i11];
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final byte[] zze() {
        return this.zza;
    }
}
