package com.google.android.gms.internal.fido;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class zzfz extends zzfp {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzfz(MessageDigest messageDigest, int i11, zzfy zzfyVar) {
        this.zza = messageDigest;
        this.zzb = i11;
    }

    private final void zzd() {
        zzbm.zzf(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.gms.internal.fido.zzfp
    protected final void zzb(byte[] bArr, int i11, int i12) {
        zzd();
        this.zza.update(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.fido.zzfv
    public final zzft zzc() {
        zzd();
        this.zzc = true;
        int i11 = this.zzb;
        if (i11 == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i12 = zzft.zzb;
            return new zzfs(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i11);
        int i13 = zzft.zzb;
        return new zzfs(bArrCopyOf);
    }
}
