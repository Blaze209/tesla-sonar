package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@VisibleForTesting
final class zzao extends DeferredLifecycleHelper<zzan> {
    protected OnDelegateCreatedListener<zzan> zza;
    private final Fragment zzb;
    private Activity zzc;
    private final List<OnStreetViewPanoramaReadyCallback> zzd = new ArrayList();

    @VisibleForTesting
    zzao(Fragment fragment) {
        this.zzb = fragment;
    }

    static /* synthetic */ void zza(zzao zzaoVar, Activity activity) {
        zzaoVar.zzc = activity;
        zzaoVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(OnDelegateCreatedListener<zzan> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zzd.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            this.zza.onDelegateCreated(new zzan(this.zzb, zzca.zza(this.zzc, null).zzh(ObjectWrapper.wrap(this.zzc))));
            Iterator<OnStreetViewPanoramaReadyCallback> it = this.zzd.iterator();
            while (it.hasNext()) {
                getDelegate().getStreetViewPanoramaAsync(it.next());
            }
            this.zzd.clear();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
