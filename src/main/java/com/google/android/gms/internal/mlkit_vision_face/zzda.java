package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import rv.b;
import rv.f;

/* JADX INFO: loaded from: classes5.dex */
final class zzda implements f {
    private boolean zza = false;
    private boolean zzb = false;
    private b zzc;
    private final zzcw zzd;

    zzda(zzcw zzcwVar) {
        this.zzd = zzcwVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @NonNull
    public final f add(double d11) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d11, this.zzb);
        return this;
    }

    final void zza(b bVar, boolean z11) {
        this.zza = false;
        this.zzc = bVar;
        this.zzb = z11;
    }

    @NonNull
    public final f add(float f11) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f11, this.zzb);
        return this;
    }

    @NonNull
    public final f add(int i11) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i11, this.zzb);
        return this;
    }

    @NonNull
    public final f add(long j11) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j11, this.zzb);
        return this;
    }

    @Override // rv.f
    @NonNull
    public final f add(String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // rv.f
    @NonNull
    public final f add(boolean z11) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z11 ? 1 : 0, this.zzb);
        return this;
    }

    @NonNull
    public final f add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
