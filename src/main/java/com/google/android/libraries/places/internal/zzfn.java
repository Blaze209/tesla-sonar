package com.google.android.libraries.places.internal;

import android.content.Context;
import com.android.volley.j;
import com.android.volley.toolbox.n;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.libraries.places.api.net.PlacesClient;

/* JADX INFO: loaded from: classes5.dex */
final class zzfn implements zzfq {
    private final zzfs zza;
    private final Context zzb;
    private final zzfz zzc;
    private final zzfn zzd = this;
    private final zzaif zze = zzaie.zza(zzbz.zza());

    /* synthetic */ zzfn(Context context, zzfs zzfsVar, zzfz zzfzVar, zzfm zzfmVar) {
        this.zza = zzfsVar;
        this.zzb = context;
        this.zzc = zzfzVar;
    }

    private final zzcp zzb() {
        return zzcq.zza(new zzgd(this.zzb), this.zzc, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzfq
    public final PlacesClient zza() {
        zzfs zzfsVar = this.zza;
        zzgf zzgfVar = new zzgf(this.zzb);
        Context applicationContext = this.zzb.getApplicationContext();
        zzaid.zza(applicationContext);
        j jVarA = n.a(applicationContext);
        zzaid.zza(jVarA);
        zzcx zzcxVarZza = zzcy.zza(jVarA, new zzej());
        Context applicationContext2 = this.zzb.getApplicationContext();
        zzaid.zza(applicationContext2);
        j jVarA2 = n.a(applicationContext2);
        zzaid.zza(jVarA2);
        zzeu zzeuVarZza = zzev.zza(zzfsVar, zzgfVar, zzcxVarZza, zzde.zza(jVarA2), zzb(), (zzbx) this.zze.zzb(), zzdw.zza(), zzea.zza(zzey.zza()), zzee.zza(), zzei.zza(zzey.zza()));
        Context applicationContext3 = this.zzb.getApplicationContext();
        zzaid.zza(applicationContext3);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(applicationContext3);
        zzaid.zza(fusedLocationProviderClient);
        zzci zzciVarZza = zzcj.zza(fusedLocationProviderClient, new zzfj(new zzff()));
        Context applicationContext4 = this.zzb.getApplicationContext();
        zzaid.zza(applicationContext4);
        return zzdp.zza(zzeuVarZza, zzciVarZza, zzco.zza(applicationContext4, (zzbx) this.zze.zzb()), zzb(), (zzbx) this.zze.zzb());
    }
}
