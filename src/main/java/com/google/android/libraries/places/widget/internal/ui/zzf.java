package com.google.android.libraries.places.widget.internal.ui;

import androidx.p002activity.b0;

/* JADX INFO: loaded from: classes5.dex */
final class zzf extends b0 {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(AutocompleteImplFragment autocompleteImplFragment, boolean z11) {
        super(true);
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.p002activity.b0
    public final void handleOnBackPressed() {
        this.zza.zze.zzj();
    }
}
