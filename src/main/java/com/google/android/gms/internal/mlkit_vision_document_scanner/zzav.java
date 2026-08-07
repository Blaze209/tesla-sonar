package com.google.android.gms.internal.mlkit_vision_document_scanner;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import rv.b;
import rv.f;

/* JADX INFO: loaded from: classes5.dex */
final class zzav implements f {
    private boolean zza = false;
    private boolean zzb = false;
    private b zzc;
    private final zzar zzd;

    zzav(zzar zzarVar) {
        this.zzd = zzarVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @NonNull
    public final f add(double d11) {
        zzb();
        this.zzd.zzb(this.zzc, d11, this.zzb);
        return this;
    }

    final void zza(b bVar, boolean z11) {
        this.zza = false;
        this.zzc = bVar;
        this.zzb = z11;
    }

    @NonNull
    public final f add(float f11) {
        zzb();
        this.zzd.zzc(this.zzc, f11, this.zzb);
        return this;
    }

    @NonNull
    public final f add(int i11) {
        zzb();
        this.zzd.zzd(this.zzc, i11, this.zzb);
        return this;
    }

    @NonNull
    public final f add(long j11) {
        zzb();
        this.zzd.zze(this.zzc, j11, this.zzb);
        return this;
    }

    @Override // rv.f
    @NonNull
    public final f add(String str) {
        zzb();
        this.zzd.zza(this.zzc, str, this.zzb);
        return this;
    }

    @Override // rv.f
    @NonNull
    public final f add(boolean z11) {
        zzb();
        this.zzd.zzd(this.zzc, z11 ? 1 : 0, this.zzb);
        return this;
    }

    @NonNull
    public final f add(@NonNull byte[] bArr) {
        zzb();
        this.zzd.zza(this.zzc, bArr, this.zzb);
        return this;
    }
}
