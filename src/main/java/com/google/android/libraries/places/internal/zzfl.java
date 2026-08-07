package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
final class zzfl implements zzfp {
    private Context zza;
    private zzfs zzb;
    private zzfz zzc;

    private zzfl() {
    }

    @Override // com.google.android.libraries.places.internal.zzfp
    public final /* synthetic */ zzfp zza(zzfs zzfsVar) {
        this.zzb = zzfsVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfp
    public final /* synthetic */ zzfp zzb(zzfz zzfzVar) {
        this.zzc = zzfzVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfp
    public final /* synthetic */ zzfp zzc(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfp
    public final zzfq zzd() {
        zzaid.zzb(this.zza, Context.class);
        zzaid.zzb(this.zzb, zzfs.class);
        zzaid.zzb(this.zzc, zzfz.class);
        return new zzfn(this.zza, this.zzb, this.zzc, null);
    }

    /* synthetic */ zzfl(zzfk zzfkVar) {
    }
}
