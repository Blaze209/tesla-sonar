package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzhi {
    private final zzhk zza = new zzhk(null);

    public final zzhi zza(byte[] bArr) {
        this.zza.zzc = bArr;
        return this;
    }

    public final zzhi zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzd = parcelFileDescriptor;
        return this;
    }

    public final zzhi zzc(String str) {
        this.zza.zzm = str;
        return this;
    }

    public final zzhi zzd(long j11) {
        this.zza.zza = j11;
        return this;
    }

    public final zzhi zze(boolean z11) {
        this.zza.zzj = z11;
        return this;
    }

    public final zzhi zzf(String str) {
        this.zza.zze = str;
        return this;
    }

    public final zzhi zzg(long j11) {
        this.zza.zzf = j11;
        return this;
    }

    public final zzhi zzh(long j11) {
        this.zza.zzi = j11;
        return this;
    }

    public final zzhi zzi(String str) {
        this.zza.zzn = str;
        return this;
    }

    public final zzhi zzj(long j11) {
        this.zza.zzl = j11;
        return this;
    }

    public final zzhi zzk(zzhg zzhgVar) {
        this.zza.zzk = zzhgVar;
        return this;
    }

    public final zzhi zzl(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzg = parcelFileDescriptor;
        return this;
    }

    public final zzhi zzm(int i11) {
        this.zza.zzb = i11;
        return this;
    }

    public final zzhi zzn(Uri uri) {
        this.zza.zzh = uri;
        return this;
    }

    public final zzhk zzo() {
        return this.zza;
    }
}
