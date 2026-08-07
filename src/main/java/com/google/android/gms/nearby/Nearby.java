package com.google.android.gms.nearby;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.nearby.zzdq;
import com.google.android.gms.internal.nearby.zzer;
import com.google.android.gms.internal.nearby.zzo;
import com.google.android.gms.internal.nearby.zzou;
import com.google.android.gms.internal.nearby.zzoz;
import com.google.android.gms.internal.nearby.zzr;
import com.google.android.gms.internal.nearby.zzz;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.fastpair.FastPairClient;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.internal.zzbh;
import com.google.android.gms.nearby.messages.internal.zzbx;
import com.google.android.gms.nearby.messages.internal.zzby;
import com.google.android.gms.nearby.messages.zzc;
import com.google.android.gms.nearby.uwb.UwbClient;

/* JADX INFO: loaded from: classes5.dex */
public final class Nearby {

    @NonNull
    @Deprecated
    public static final Api<ConnectionsOptions> CONNECTIONS_API = new Api<>("Nearby.CONNECTIONS_API", zzer.zzb, zzer.zza);

    @NonNull
    @Deprecated
    public static final Connections Connections = new zzer();

    @NonNull
    @Deprecated
    public static final Api<MessagesOptions> MESSAGES_API = new Api<>("Nearby.MESSAGES_API", zzbx.zzc, zzbx.zzb);

    @NonNull
    @Deprecated
    public static final Messages Messages = zzbx.zza;

    @ShowFirstParty
    public static final zzc zza = new zzby();

    @NonNull
    @ShowFirstParty
    @Deprecated
    public static final Api zzb = new Api("Nearby.BOOTSTRAP_API", zzr.zzb, zzr.zza);

    @ShowFirstParty
    @Deprecated
    public static final zzo zzc = new zzr();

    private Nearby() {
    }

    @NonNull
    public static final ConnectionsClient getConnectionsClient(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        return zzdq.zza(activity, null);
    }

    @NonNull
    public static FastPairClient getFastPairClient(@NonNull Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        return new zzz(context);
    }

    @NonNull
    @Deprecated
    public static final MessagesClient getMessagesClient(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        return new zzbh(activity, (MessagesOptions) null);
    }

    @NonNull
    public static UwbClient getUwbControleeClient(@NonNull Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        com.google.android.gms.nearby.uwb.zzc zzcVar = new com.google.android.gms.nearby.uwb.zzc();
        zzcVar.zza(2);
        return new zzou(context, zzcVar.zzb());
    }

    @NonNull
    public static UwbClient getUwbControllerClient(@NonNull Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        com.google.android.gms.nearby.uwb.zzc zzcVar = new com.google.android.gms.nearby.uwb.zzc();
        zzcVar.zza(1);
        return new zzou(context, zzcVar.zzb());
    }

    public static boolean zza(@NonNull Context context) {
        if (Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return zzoz.zza(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }

    @NonNull
    public static final ConnectionsClient getConnectionsClient(@NonNull Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        return zzdq.zzb(context, null);
    }

    @NonNull
    @Deprecated
    public static final MessagesClient getMessagesClient(@NonNull Activity activity, @NonNull MessagesOptions messagesOptions) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        Preconditions.checkNotNull(messagesOptions, "Options must not be null");
        return new zzbh(activity, messagesOptions);
    }

    @NonNull
    @Deprecated
    public static final MessagesClient getMessagesClient(@NonNull Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        return new zzbh(context, (MessagesOptions) null);
    }

    @NonNull
    @Deprecated
    public static final MessagesClient getMessagesClient(@NonNull Context context, @NonNull MessagesOptions messagesOptions) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(messagesOptions, "Options must not be null");
        return new zzbh(context, messagesOptions);
    }
}
