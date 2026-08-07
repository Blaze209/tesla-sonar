package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzdq extends GoogleApi implements ConnectionsClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api.ClientKey zzb;
    private static final Api.AbstractClientBuilder zzc;
    private static final Api zzd;
    private zzao zze;
    private final zzfy zzf;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzb = clientKey;
        zzdh zzdhVar = new zzdh();
        zzc = zzdhVar;
        zzd = new Api("Nearby.CONNECTIONS_API", zzdhVar, clientKey);
    }

    private zzdq(Activity activity, ConnectionsOptions connectionsOptions) {
        super(activity, (Api<Api.ApiOptions>) zzd, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzf = zzfy.zza(activity);
    }

    public static zzdq zza(Activity activity, ConnectionsOptions connectionsOptions) {
        zzdq zzdqVar = new zzdq(activity, (ConnectionsOptions) null);
        zzdqVar.zze = zzao.zzd(zzdqVar, null);
        return zzdqVar;
    }

    public static zzdq zzb(Context context, ConnectionsOptions connectionsOptions) {
        zzdq zzdqVar = new zzdq(context, (ConnectionsOptions) null);
        zzdqVar.zze = zzao.zzd(zzdqVar, null);
        return zzdqVar;
    }

    private final Task zzh(final zzdm zzdmVar) {
        return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcp
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzdo zzdoVar = new zzdo(this.zza, (TaskCompletionSource) obj2);
                zzdmVar.zza((zzch) obj, zzdoVar);
            }
        }).build());
    }

    private final Task zzi(final zzdp zzdpVar) {
        return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcv
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i11 = zzdq.zza;
                zzdpVar.zza((zzch) obj);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(String str) {
        this.zze.zze(this, RegistrationMethods.builder().withHolder(this.zze.zzc(this, str, "connection")).register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i11 = zzdq.zza;
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
            }
        }).setMethodKey(1268).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(String str) {
        zzao zzaoVar = this.zze;
        zzaoVar.zzg(this, zzaoVar.zza(str, "connection"));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> acceptConnection(final String str, PayloadCallback payloadCallback) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(payloadCallback, PayloadCallback.class.getName());
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcr
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzch) obj).zzr(new zzdo(this.zza, (TaskCompletionSource) obj2), str, listenerHolderRegisterListener);
            }
        }).setMethodKey(1227).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> cancelPayload(final long j11) {
        return zzh(new zzdm() { // from class: com.google.android.gms.internal.nearby.zzco
            @Override // com.google.android.gms.internal.nearby.zzdm
            public final void zza(zzch zzchVar, BaseImplementation.ResultHolder resultHolder) {
                int i11 = zzdq.zza;
                zzchVar.zzs(resultHolder, j11);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void disconnectFromEndpoint(final String str) {
        zzi(new zzdp() { // from class: com.google.android.gms.internal.nearby.zzcn
            @Override // com.google.android.gms.internal.nearby.zzdp
            public final void zza(zzch zzchVar) {
                int i11 = zzdq.zza;
                zzchVar.zzt(str);
            }
        });
        zzk(str);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> rejectConnection(final String str) {
        return zzh(new zzdm() { // from class: com.google.android.gms.internal.nearby.zzcw
            @Override // com.google.android.gms.internal.nearby.zzdm
            public final void zza(zzch zzchVar, BaseImplementation.ResultHolder resultHolder) {
                int i11 = zzdq.zza;
                zzchVar.zzu(resultHolder, str);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzdn(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzj(str2);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcm
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzch) obj).zzv(new zzdo(this.zza, (TaskCompletionSource) obj2), str, str2, listenerHolderRegisterListener);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzdl(this, str2));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> sendPayload(final String str, final Payload payload) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws Throwable {
                ((zzch) obj).zzz(new zzdo(this.zza, (TaskCompletionSource) obj2), new String[]{str}, payload, false);
            }
        }).setMethodKey(1228).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startAdvertising(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback, final AdvertisingOptions advertisingOptions) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzdn(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(this.zze.zzb(this, new Object(), "advertising")).register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzck
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzch) obj).zzA(new zzdo(this.zza, (TaskCompletionSource) obj2), str, str2, listenerHolderRegisterListener, advertisingOptions);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzct
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i11 = zzdq.zza;
                ((zzch) obj).zzD();
                ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
            }
        }).setMethodKey(1266).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startDiscovery(final String str, EndpointDiscoveryCallback endpointDiscoveryCallback, final DiscoveryOptions discoveryOptions) {
        final ListenerHolder listenerHolderZzb = this.zze.zzb(this, endpointDiscoveryCallback, "discovery");
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(listenerHolderZzb).register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcy
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzch) obj).zzC(new zzdo(this.zza, (TaskCompletionSource) obj2), str, listenerHolderZzb, discoveryOptions);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzdd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i11 = zzdq.zza;
                ((zzch) obj).zzF();
                ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
            }
        }).setMethodKey(1267).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.nearby.zzde
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.zza.zze(discoveryOptions, (Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.nearby.zzdf
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Log.w("NearbyConnections", "Failed to start discovery.", exc);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopAdvertising() {
        this.zze.zzf(this, "advertising");
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopAllEndpoints() {
        this.zze.zzf(this, "advertising");
        this.zze.zzf(this, "discovery").addOnSuccessListener(new zzcq(this));
        zzi(new zzdp() { // from class: com.google.android.gms.internal.nearby.zzda
            @Override // com.google.android.gms.internal.nearby.zzdp
            public final void zza(zzch zzchVar) {
                int i11 = zzdq.zza;
                zzchVar.zzE();
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.nearby.zzdb
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzf(task);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopDiscovery() {
        this.zze.zzf(this, "discovery").addOnSuccessListener(new zzcq(this));
    }

    final /* synthetic */ void zze(DiscoveryOptions discoveryOptions, Void r11) {
        if (discoveryOptions.zzK()) {
            zzfy zzfyVar = this.zzf;
            if (zzfyVar == null) {
                Log.d("NearbyConnections", "Discovery started with NFC requested, but there is no NfcDispatcher available. Discovery will continue over other mediums instead. To use NFC discovery, pass in an Activity when calling Nearby.getConnectionsClient().");
            } else {
                zzfyVar.zze();
            }
        }
    }

    final /* synthetic */ void zzf(Task task) {
        this.zze.zzf(this, "connection");
        disconnectService();
    }

    final /* synthetic */ void zzg(Void r11) {
        zzfy zzfyVar = this.zzf;
        if (zzfyVar != null) {
            zzfyVar.zzf();
        }
    }

    private zzdq(Context context, ConnectionsOptions connectionsOptions) {
        super(context, (Api<Api.ApiOptions>) zzd, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzf = null;
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> sendPayload(final List<String> list, final Payload payload) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcx
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws Throwable {
                ((zzch) obj).zzz(new zzdo(this.zza, (TaskCompletionSource) obj2), (String[]) list.toArray(new String[0]), payload, false);
            }
        }).setMethodKey(1228).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback, final ConnectionOptions connectionOptions) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzdn(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzj(str2);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zzf).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzdg
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzch) obj).zzx(new zzdo(this.zza, (TaskCompletionSource) obj2), str, str2, listenerHolderRegisterListener, connectionOptions);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzdi(this, str2));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startAdvertising(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback, final AdvertisingOptions advertisingOptions) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzdn(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(this.zze.zzb(this, new Object(), "advertising")).setFeatures(com.google.android.gms.nearby.zza.zzf).register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcs
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzch) obj).zzB(new zzdo(this.zza, (TaskCompletionSource) obj2), bArr, str, listenerHolderRegisterListener, advertisingOptions);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzcu
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i11 = zzdq.zza;
                ((zzch) obj).zzD();
                ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
            }
        }).setMethodKey(1266).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzdn(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzj(str);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zzf).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzdc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzch) obj).zzw(new zzdo(this.zza, (TaskCompletionSource) obj2), bArr, str, listenerHolderRegisterListener);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzdk(this, str));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback, final ConnectionOptions connectionOptions) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzdn(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzj(str);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zzf).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzci
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzch) obj).zzy(new zzdo(this.zza, (TaskCompletionSource) obj2), bArr, str, listenerHolderRegisterListener, connectionOptions);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzdj(this, str));
    }
}
