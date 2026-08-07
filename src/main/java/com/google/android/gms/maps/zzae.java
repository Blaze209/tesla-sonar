package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@VisibleForTesting
final class zzae extends DeferredLifecycleHelper<zzad> {
    protected OnDelegateCreatedListener<zzad> zza;
    private final Fragment zzb;
    private Activity zzc;
    private final List<OnMapReadyCallback> zzd = new ArrayList();

    @VisibleForTesting
    zzae(Fragment fragment) {
        this.zzb = fragment;
    }

    static /* synthetic */ void zza(zzae zzaeVar, Activity activity) {
        zzaeVar.zzc = activity;
        zzaeVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(OnDelegateCreatedListener<zzad> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            getDelegate().getMapAsync(onMapReadyCallback);
        } else {
            this.zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            IMapFragmentDelegate iMapFragmentDelegateZzf = zzca.zza(this.zzc, null).zzf(ObjectWrapper.wrap(this.zzc));
            if (iMapFragmentDelegateZzf == null) {
                return;
            }
            this.zza.onDelegateCreated(new zzad(this.zzb, iMapFragmentDelegateZzf));
            Iterator<OnMapReadyCallback> it = this.zzd.iterator();
            while (it.hasNext()) {
                getDelegate().getMapAsync(it.next());
            }
            this.zzd.clear();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
