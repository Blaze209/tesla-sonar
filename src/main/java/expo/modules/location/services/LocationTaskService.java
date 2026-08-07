package expo.modules.location.services;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import ch.qos.logback.core.CoreConstants;
import com.brentvatne.exoplayer.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ga.c;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 02\u00020\u0001:\u000210B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lexpo/modules/location/services/LocationTaskService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/os/Bundle;", "serviceOptions", "Landroid/app/Notification;", "buildServiceNotification", "(Landroid/os/Bundle;)Landroid/app/Notification;", "", "id", "Ljn0/h0;", "prepareChannel", "(Ljava/lang/String;)V", "color", "", "colorStringToInteger", "(Ljava/lang/String;)Ljava/lang/Integer;", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "setParentContext", "(Landroid/content/Context;)V", "stop", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "startForeground", "(Landroid/os/Bundle;)V", "mChannelId", "Ljava/lang/String;", "", "mKillService", "Z", "mParentContext", "Landroid/content/Context;", "mServiceId", "I", "mBinder", "Landroid/os/IBinder;", "Companion", "ServiceBinder", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationTaskService extends Service {
    private static int sServiceId = 481756;
    private final IBinder mBinder;
    private String mChannelId;
    private boolean mKillService;
    private Context mParentContext;
    private final int mServiceId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/location/services/LocationTaskService$ServiceBinder;", "Landroid/os/Binder;", "<init>", "(Lexpo/modules/location/services/LocationTaskService;)V", "service", "Lexpo/modules/location/services/LocationTaskService;", "getService", "()Lexpo/modules/location/services/LocationTaskService;", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ServiceBinder extends Binder {
        public ServiceBinder() {
        }

        /* JADX INFO: renamed from: getService, reason: from getter */
        public final LocationTaskService getThis$0() {
            return LocationTaskService.this;
        }
    }

    public LocationTaskService() {
        int i11 = sServiceId;
        sServiceId = i11 + 1;
        this.mServiceId = i11;
        this.mBinder = new ServiceBinder();
    }

    @TargetApi(26)
    private final Notification buildServiceNotification(Bundle serviceOptions) {
        prepareChannel(this.mChannelId);
        b.a();
        Notification.Builder builderA = a.a(this, this.mChannelId);
        String string = serviceOptions.getString("notificationTitle");
        String string2 = serviceOptions.getString("notificationBody");
        Integer numColorStringToInteger = colorStringToInteger(serviceOptions.getString("notificationColor"));
        if (string != null) {
            builderA.setContentTitle(string);
        }
        if (string2 != null) {
            builderA.setContentText(string2);
        }
        if (numColorStringToInteger == null || builderA.setColorized(true).setColor(numColorStringToInteger.intValue()) == null) {
            s.j(builderA.setColorized(false), "setColorized(...)");
        }
        Context context = this.mParentContext;
        Context context2 = null;
        if (context == null) {
            s.B("mParentContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        Context context3 = this.mParentContext;
        if (context3 == null) {
            s.B("mParentContext");
        } else {
            context2 = context3;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context2.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(PKIFailureInfo.duplicateCertReq);
            builderA.setContentIntent(PendingIntent.getActivity(this, 0, launchIntentForPackage, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728));
        }
        Notification notificationBuild = builderA.setCategory("service").setSmallIcon(getApplicationInfo().icon).build();
        s.j(notificationBuild, "build(...)");
        return notificationBuild;
    }

    private final Integer colorStringToInteger(String color) {
        try {
            return Integer.valueOf(Color.parseColor(color));
        } catch (Exception unused) {
            return null;
        }
    }

    @TargetApi(26)
    private final void prepareChannel(String id2) {
        Object systemService = getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null) {
            return;
        }
        String string = getApplicationInfo().loadLabel(getPackageManager()).toString();
        if (notificationManager.getNotificationChannel(id2) == null) {
            v0.a();
            NotificationChannel notificationChannelA = c.a(id2, string, 2);
            notificationChannelA.setDescription("Background location notification channel");
            notificationManager.createNotificationChannel(notificationChannelA);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        s.k(intent, "intent");
        return this.mBinder;
    }

    @Override // android.app.Service
    @TargetApi(26)
    public int onStartCommand(Intent intent, int flags, int startId) {
        s.k(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return 3;
        }
        this.mChannelId = extras.getString("appId") + ":" + extras.getString("taskName");
        this.mKillService = extras.getBoolean("killService", false);
        return 3;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        s.k(rootIntent, "rootIntent");
        if (this.mKillService) {
            super.onTaskRemoved(rootIntent);
            stop();
        }
    }

    public final void setParentContext(Context context) {
        s.k(context, "context");
        this.mParentContext = context;
    }

    public final void startForeground(Bundle serviceOptions) {
        s.k(serviceOptions, "serviceOptions");
        startForeground(this.mServiceId, buildServiceNotification(serviceOptions));
    }

    public final void stop() {
        stopForeground(true);
        stopSelf();
    }
}
