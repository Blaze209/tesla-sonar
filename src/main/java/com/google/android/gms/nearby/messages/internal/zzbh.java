package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zziv;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbh extends GoogleApi implements MessagesClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api.ClientKey zzb;
    private static final Api.AbstractClientBuilder zzc;
    private static final Api zzd;
    private final int zze;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzb = clientKey;
        zzav zzavVar = new zzav();
        zzc = zzavVar;
        zzd = new Api("Nearby.MESSAGES_API", zzavVar, clientKey);
    }

    public zzbh(Activity activity, MessagesOptions messagesOptions) {
        super(activity, (Api<MessagesOptions>) zzd, messagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = 1;
        activity.getApplication().registerActivityLifecycleCallbacks(new zzbb(activity, this, null));
    }

    static /* bridge */ /* synthetic */ void zza(zzbh zzbhVar, int i11) {
        final int i12 = 1;
        zzbhVar.zzl(new zzbc(i12) { // from class: com.google.android.gms.nearby.messages.internal.zzal
            @Override // com.google.android.gms.nearby.messages.internal.zzbc
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) {
                int i13 = zzbh.zza;
                zzaiVar.zzr(1);
            }
        }, 0);
    }

    private final ListenerHolder zzh(Object obj) {
        if (obj == null) {
            return null;
        }
        return registerListener(obj, obj.getClass().getName());
    }

    private final ListenerHolder zzi(TaskCompletionSource taskCompletionSource) {
        return registerListener(new zzay(this, taskCompletionSource), Status.class.getName());
    }

    private final Task zzj(ListenerHolder listenerHolder, final zzbc zzbcVar, final zzbc zzbcVar2, int i11) {
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.nearby.messages.internal.zzat
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                this.zza.zzd(zzbcVar, (zzai) obj, (TaskCompletionSource) obj2);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.nearby.messages.internal.zzau
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                this.zza.zzc(zzbcVar2, (zzai) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(i11).build());
    }

    private final Task zzk(Object obj, int i11) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Preconditions.checkNotNull(obj);
        doUnregisterEventListener(ListenerHolders.createListenerKey(obj, obj.getClass().getName()), i11).addOnCompleteListener(new zzaz(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private final Task zzl(final zzbc zzbcVar, int i11) {
        return doWrite(TaskApiCall.builder().setMethodKey(i11).run(new RemoteCall() { // from class: com.google.android.gms.nearby.messages.internal.zzas
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                this.zza.zzg(zzbcVar, (zzai) obj, (TaskCompletionSource) obj2);
            }
        }).build());
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    protected final ClientSettings.Builder createClientSettingsBuilder() {
        ClientSettings.Builder builderCreateClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            String str = ((MessagesOptions) getApiOptions()).zze;
        }
        return builderCreateClientSettingsBuilder;
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final void handleIntent(Intent intent, MessageListener messageListener) {
        zziv.zzb(intent, messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> publish(Message message) {
        PublishOptions publishOptions = PublishOptions.DEFAULT;
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder listenerHolderZzh = zzh(message);
        return zzj(listenerHolderZzh, new zzam(this, message, new zzaw(this, zzh(publishOptions.getCallback()), listenerHolderZzh), publishOptions), new zzan(message), 1291);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> registerStatusCallback(StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        final ListenerHolder listenerHolderZzh = zzh(statusCallback);
        return zzj(listenerHolderZzh, new zzbc() { // from class: com.google.android.gms.nearby.messages.internal.zzao
            @Override // com.google.android.gms.nearby.messages.internal.zzbc
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) {
                int i11 = zzbh.zza;
                zzaiVar.zzu(listenerHolder, listenerHolderZzh);
            }
        }, new zzbc() { // from class: com.google.android.gms.nearby.messages.internal.zzap
            @Override // com.google.android.gms.nearby.messages.internal.zzbc
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) {
                int i11 = zzbh.zza;
                zzaiVar.zzA(listenerHolder, listenerHolderZzh);
            }
        }, 1270);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(PendingIntent pendingIntent) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder listenerHolderZzh = zzh(subscribeOptions.getCallback());
        return zzl(new zzak(this, pendingIntent, listenerHolderZzh == null ? null : new zzbg(listenerHolderZzh), subscribeOptions), 1288);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unpublish(Message message) {
        Preconditions.checkNotNull(message);
        return zzk(message, 1290);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unregisterStatusCallback(StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        return zzk(statusCallback, 1271);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unsubscribe(final PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent);
        return zzl(new zzbc() { // from class: com.google.android.gms.nearby.messages.internal.zzaj
            @Override // com.google.android.gms.nearby.messages.internal.zzbc
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) {
                int i11 = zzbh.zza;
                zzaiVar.zzB(listenerHolder, pendingIntent);
            }
        }, 1287);
    }

    final /* synthetic */ void zzb(Message message, zzbe zzbeVar, PublishOptions publishOptions, zzai zzaiVar, ListenerHolder listenerHolder) {
        zzaiVar.zzt(listenerHolder, zzae.zza(message), zzbeVar, publishOptions, this.zze);
    }

    final /* synthetic */ void zzc(zzbc zzbcVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) {
        zzbcVar.zza(zzaiVar, zzi(taskCompletionSource));
    }

    final /* synthetic */ void zzd(zzbc zzbcVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) {
        zzbcVar.zza(zzaiVar, zzi(taskCompletionSource));
    }

    final /* synthetic */ void zze(ListenerHolder listenerHolder, zzbg zzbgVar, SubscribeOptions subscribeOptions, zzai zzaiVar, ListenerHolder listenerHolder2) {
        zzaiVar.zzy(listenerHolder2, listenerHolder, zzbgVar, subscribeOptions, null, this.zze);
    }

    final /* synthetic */ void zzf(PendingIntent pendingIntent, zzbg zzbgVar, SubscribeOptions subscribeOptions, zzai zzaiVar, ListenerHolder listenerHolder) {
        zzaiVar.zzw(listenerHolder, pendingIntent, zzbgVar, subscribeOptions, this.zze);
    }

    final /* synthetic */ void zzg(zzbc zzbcVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) {
        zzbcVar.zza(zzaiVar, zzi(taskCompletionSource));
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unsubscribe(MessageListener messageListener) {
        Preconditions.checkNotNull(messageListener);
        return zzk(messageListener, 1286);
    }

    public zzbh(Context context, MessagesOptions messagesOptions) {
        super(context, (Api<MessagesOptions>) zzd, messagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = zzai.zzp(context);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> publish(Message message, PublishOptions publishOptions) {
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder listenerHolderZzh = zzh(message);
        return zzj(listenerHolderZzh, new zzam(this, message, new zzaw(this, zzh(publishOptions.getCallback()), listenerHolderZzh), publishOptions), new zzan(message), 1291);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(PendingIntent pendingIntent, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder listenerHolderZzh = zzh(subscribeOptions.getCallback());
        return zzl(new zzak(this, pendingIntent, listenerHolderZzh == null ? null : new zzbg(listenerHolderZzh), subscribeOptions), 1288);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(MessageListener messageListener) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderZzh = zzh(messageListener);
        ListenerHolder listenerHolderZzh2 = zzh(subscribeOptions.getCallback());
        return zzj(listenerHolderZzh, new zzaq(this, listenerHolderZzh, new zzax(this, listenerHolderZzh2, listenerHolderZzh2), subscribeOptions), new zzar(listenerHolderZzh), 1289);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(MessageListener messageListener, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderZzh = zzh(messageListener);
        ListenerHolder listenerHolderZzh2 = zzh(subscribeOptions.getCallback());
        return zzj(listenerHolderZzh, new zzaq(this, listenerHolderZzh, new zzax(this, listenerHolderZzh2, listenerHolderZzh2), subscribeOptions), new zzar(listenerHolderZzh), 1289);
    }
}
