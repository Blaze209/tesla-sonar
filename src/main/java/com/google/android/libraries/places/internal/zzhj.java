package com.google.android.libraries.places.internal;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import co0.d;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhj implements ViewModelProvider.Factory {
    private final zzgy zza;
    private final zzho zzb;
    private final zzhp zzc;

    public zzhj(zzgy zzgyVar, zzho zzhoVar, zzhp zzhpVar) {
        this.zza = zzgyVar;
        this.zzb = zzhoVar;
        this.zzc = zzhpVar;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* bridge */ /* synthetic */ c1 create(d dVar, CreationExtras creationExtras) {
        return super.create(dVar, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final c1 create(Class cls) {
        zzig.zze(cls == zzhl.class, "This factory can only be used to instantiate its enclosing class.");
        return new zzhl(this.zza, this.zzb, this.zzc, null);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final c1 create(Class cls, CreationExtras creationExtras) {
        return create(cls);
    }
}
