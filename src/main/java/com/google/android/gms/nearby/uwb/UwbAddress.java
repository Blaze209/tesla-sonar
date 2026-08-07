package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.nearby.zzqf;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class UwbAddress {
    private static final zzqf zza = zzqf.zzh().zze(":", 2);
    private final byte[] zzb;

    public UwbAddress(@NonNull byte[] bArr) {
        this.zzb = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbAddress) {
            return Arrays.equals(this.zzb, ((UwbAddress) obj).zzb);
        }
        return false;
    }

    @NonNull
    public byte[] getAddress() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(this.zzb);
    }

    @NonNull
    public String toString() {
        zzqf zzqfVar = zza;
        byte[] bArr = this.zzb;
        return zzqfVar.zzi(bArr, 0, bArr.length);
    }

    public UwbAddress(@NonNull String str) {
        this.zzb = zza.zzj(str);
    }
}
