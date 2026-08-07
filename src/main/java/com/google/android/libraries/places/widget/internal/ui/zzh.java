package com.google.android.libraries.places.widget.internal.ui;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzbx;
import com.google.android.libraries.places.internal.zzca;
import com.google.android.libraries.places.internal.zzfy;
import com.google.android.libraries.places.internal.zzfz;
import com.google.android.libraries.places.internal.zzgd;
import com.google.android.libraries.places.internal.zzgr;
import com.google.android.libraries.places.internal.zzhp;
import com.google.android.libraries.places.internal.zzhq;

/* JADX INFO: loaded from: classes5.dex */
public final class zzh extends y {
    private final int zza;
    private final PlacesClient zzb;
    private final zzgr zzc;
    private final zzhp zzd;
    private final zzbx zze;

    public zzh(int i11, Context context, zzgr zzgrVar) {
        this.zza = i11;
        Context applicationContext = context.getApplicationContext();
        zzfy zzfyVarZzd = zzfz.zzd(applicationContext);
        zzfyVarZzd.zzd(2);
        zzfz zzfzVarZze = zzfyVarZzd.zze();
        zzgd zzgdVar = new zzgd(applicationContext);
        this.zzb = Places.zza(applicationContext, zzfzVarZze);
        this.zzc = zzgrVar;
        this.zzd = new zzhq(zzgdVar, zzfzVarZze, null);
        this.zze = new zzca();
    }

    @Override // androidx.fragment.app.y
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        return y.loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class ? new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze) : super.instantiate(classLoader, str);
    }
}
