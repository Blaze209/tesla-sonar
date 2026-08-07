package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes5.dex */
public final class zzno extends GmsClient {
    private final com.google.android.gms.nearby.uwb.zze zze;

    public zzno(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, com.google.android.gms.nearby.uwb.zze zzeVar) {
        super(context, looper, EnumC4419g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = zzeVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
        return iInterfaceQueryLocalInterface instanceof zzkr ? (zzkr) iInterfaceQueryLocalInterface : new zzkr(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                ((zzkr) getService()).zzf(new zzjy());
            } catch (RemoteException e11) {
                Log.w("NearbyUwbClient", "Failed to notify client disconnect.", e11);
            }
        }
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return new Feature[]{com.google.android.gms.nearby.zza.zzH, com.google.android.gms.nearby.zza.zzI, com.google.android.gms.nearby.zza.zzJ, com.google.android.gms.nearby.zza.zzK, com.google.android.gms.nearby.zza.zzM, com.google.android.gms.nearby.zza.zzO, com.google.android.gms.nearby.zza.zzN, com.google.android.gms.nearby.zza.zzP};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        com.google.android.gms.nearby.uwb.zze zzeVar = this.zze;
        if (zzeVar != null) {
            bundle.putLong("clientId", zzeVar.hashCode());
            bundle.putInt("deviceType", this.zze.zza());
            bundle.putBoolean("isTestOnly", false);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 211600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.uwb.internal.INearbyUwbService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.nearby.uwb.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }
}
