package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.nearby.zziv;
import com.google.android.gms.internal.nearby.zzix;
import com.google.android.gms.internal.nearby.zzja;
import com.google.android.gms.internal.nearby.zzjb;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* JADX INFO: loaded from: classes5.dex */
public final class zzai extends GmsClient {
    private final zzjb zze;
    private final ClientAppContext zzf;
    private final int zzg;

    @TargetApi(14)
    private zzai(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        super(context, looper, 62, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = new zzjb();
        String realClientPackageName = clientSettings.getRealClientPackageName();
        int iZzp = zzp(context);
        if (messagesOptions != null) {
            this.zzf = new ClientAppContext(1, realClientPackageName, null, false, iZzp, null);
            this.zzg = messagesOptions.zzc;
        } else {
            this.zzf = new ClientAppContext(1, realClientPackageName, null, false, iZzp, null);
            this.zzg = -1;
        }
    }

    static int zzp(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        return context instanceof Service ? 3 : 0;
    }

    public static zzai zzq(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        zzai zzaiVar = new zzai(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, messagesOptions);
        if (zzp(context) == 1 && PlatformVersion.isAtLeastIceCreamSandwich()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new zzah(activity, zzaiVar, null));
        }
        return zzaiVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return iInterfaceQueryLocalInterface instanceof zzs ? (zzs) iInterfaceQueryLocalInterface : new zzs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        try {
            zzr(2);
        } catch (RemoteException e11) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", e11));
            }
        }
        this.zze.zzb();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle getServiceRequestExtraArgs = super.getGetServiceRequestExtraArgs();
        getServiceRequestExtraArgs.putInt("NearbyPermissions", this.zzg);
        getServiceRequestExtraArgs.putParcelable("ClientAppContext", this.zzf);
        return getServiceRequestExtraArgs;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    protected final String getStartServiceAction() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzA(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        zzix zzixVar = new zzix(listenerHolder);
        if (!this.zze.zze(listenerKey)) {
            zzixVar.zzd(new Status(0));
            return;
        }
        zzcb zzcbVar = new zzcb(zzixVar, (IBinder) this.zze.zza(listenerKey));
        zzcbVar.zzd = false;
        ((zzs) getService()).zzg(zzcbVar);
        this.zze.zzd(listenerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzB(ListenerHolder listenerHolder, PendingIntent pendingIntent) {
        ((zzs) getService()).zzj(new zzcg(null, new zzix(listenerHolder), pendingIntent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzC(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        zzix zzixVar = new zzix(listenerHolder);
        if (!this.zze.zze(listenerKey)) {
            zzixVar.zzd(new Status(0));
            return;
        }
        ((zzs) getService()).zzj(new zzcg((IBinder) this.zze.zza(listenerKey), zzixVar, null));
        this.zze.zzd(listenerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzr(int i11) {
        String str = i11 != 1 ? "CLIENT_DISCONNECTED" : "ACTIVITY_STOPPED";
        if (!isConnected()) {
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", str));
            }
        } else {
            zzj zzjVar = new zzj(1, null, i11);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", str));
            }
            ((zzs) getService()).zze(zzjVar);
        }
    }

    @Deprecated
    final void zzs(ListenerHolder listenerHolder, zzae zzaeVar, zzu zzuVar, PublishOptions publishOptions) {
        zzt(listenerHolder, zzaeVar, zzuVar, publishOptions, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzt(ListenerHolder listenerHolder, zzae zzaeVar, zzu zzuVar, PublishOptions publishOptions, int i11) {
        ((zzs) getService()).zzf(new zzbz(2, zzaeVar, publishOptions.getStrategy(), new zzix(listenerHolder), null, null, false, zzuVar, false, null, i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzu(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        if (!this.zze.zze(listenerKey)) {
            this.zze.zzc(listenerKey, new zzja(listenerHolder2));
        }
        zzcb zzcbVar = new zzcb(new zzix(listenerHolder), (IBinder) this.zze.zza(listenerKey));
        zzcbVar.zzd = true;
        ((zzs) getService()).zzg(zzcbVar);
    }

    @Deprecated
    final void zzv(ListenerHolder listenerHolder, PendingIntent pendingIntent, zzaa zzaaVar, SubscribeOptions subscribeOptions) {
        zzw(listenerHolder, pendingIntent, zzaaVar, subscribeOptions, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzw(ListenerHolder listenerHolder, PendingIntent pendingIntent, zzaa zzaaVar, SubscribeOptions subscribeOptions, int i11) {
        ((zzs) getService()).zzh(new SubscribeRequest(null, subscribeOptions.getStrategy(), new zzix(listenerHolder), subscribeOptions.getFilter(), pendingIntent, null, zzaaVar, false, 0, this.zzf.zze));
    }

    @Deprecated
    final void zzx(ListenerHolder listenerHolder, ListenerHolder listenerHolder2, zzaa zzaaVar, SubscribeOptions subscribeOptions, byte[] bArr) {
        zzy(listenerHolder, listenerHolder2, zzaaVar, subscribeOptions, null, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzy(ListenerHolder listenerHolder, ListenerHolder listenerHolder2, zzaa zzaaVar, SubscribeOptions subscribeOptions, byte[] bArr, int i11) {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        if (!this.zze.zze(listenerKey)) {
            this.zze.zzc(listenerKey, new zziv(listenerHolder2));
        }
        ((zzs) getService()).zzh(new SubscribeRequest((IBinder) this.zze.zza(listenerKey), subscribeOptions.getStrategy(), new zzix(listenerHolder), subscribeOptions.getFilter(), null, null, zzaaVar, false, 0, i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzz(ListenerHolder listenerHolder, zzae zzaeVar) {
        ((zzs) getService()).zzi(new zzce(1, zzaeVar, new zzix(listenerHolder), null, null, false, null));
    }
}
