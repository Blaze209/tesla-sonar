package com.brentvatne.exoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.bb;
import androidx.media3.session.se;
import androidx.media3.session.t7;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.Util;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 G2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u000fJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0003J)\u0010.\u001a\u00020+2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010D\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010C¨\u0006I"}, d2 = {"Lcom/brentvatne/exoplayer/w0;", "Landroidx/media3/session/bb;", "<init>", "()V", "Landroidx/media3/session/t7;", "session", "Ljn0/h0;", "A", "(Landroidx/media3/session/t7;)V", "Landroid/app/Notification;", "x", "(Landroidx/media3/session/t7;)Landroid/app/Notification;", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "C", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "B", "y", "z", "()Landroid/app/Notification;", "Ljava/lang/Class;", "Landroid/app/Activity;", "from", "D", "(Landroidx/media3/exoplayer/ExoPlayer;Ljava/lang/Class;)V", "E", "Landroidx/media3/session/t7$g;", "controllerInfo", "r", "(Landroidx/media3/session/t7$g;)Landroidx/media3/session/t7;", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "startInForegroundRequired", "t", "(Landroidx/media3/session/t7;Z)V", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "onDestroy", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "", "h", "Ljava/util/Map;", "mediaSessionsList", "Lcom/brentvatne/exoplayer/v;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/brentvatne/exoplayer/v;", "binder", "j", "Ljava/lang/Class;", "sourceActivity", "Landroidx/media3/session/se;", "k", "Landroidx/media3/session/se;", "commandSeekForward", "l", "commandSeekBackward", "Landroidx/media3/session/a;", "m", "Landroidx/media3/session/a;", "seekForwardBtn", "n", "seekBackwardBtn", "o", "a", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w0 extends bb {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Map<ExoPlayer, t7> mediaSessionsList = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private v binder = new v(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Class<Activity> sourceActivity;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final se commandSeekForward;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final se commandSeekBackward;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SuppressLint({"PrivateResource"})
    private final androidx.media3.session.a seekForwardBtn;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SuppressLint({"PrivateResource"})
    private final androidx.media3.session.a seekBackwardBtn;

    /* JADX INFO: renamed from: com.brentvatne.exoplayer.w0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/brentvatne/exoplayer/w0$a;", "", "<init>", "()V", "", "value", "Lcom/brentvatne/exoplayer/w0$a$a;", "a", "(Ljava/lang/String;)Lcom/brentvatne/exoplayer/w0$a$a;", "command", "Landroidx/media3/session/t7;", "session", "Ljn0/h0;", "b", "(Lcom/brentvatne/exoplayer/w0$a$a;Landroidx/media3/session/t7;)V", "", "SEEK_INTERVAL_MS", "J", "TAG", "Ljava/lang/String;", "", "PLACEHOLDER_NOTIFICATION_ID", "I", "NOTIFICATION_CHANEL_ID", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.brentvatne.exoplayer.w0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/brentvatne/exoplayer/w0$a$a;", "", "", "stringValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getStringValue", "()Ljava/lang/String;", "NONE", "SEEK_FORWARD", "SEEK_BACKWARD", "TOGGLE_PLAY", "PLAY", "PAUSE", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum EnumC0414a {
            NONE("NONE"),
            SEEK_FORWARD("COMMAND_SEEK_FORWARD"),
            SEEK_BACKWARD("COMMAND_SEEK_BACKWARD"),
            TOGGLE_PLAY("COMMAND_TOGGLE_PLAY"),
            PLAY("COMMAND_PLAY"),
            PAUSE("COMMAND_PAUSE");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String stringValue;

            EnumC0414a(String str) {
                this.stringValue = str;
            }

            public static EnumEntries<EnumC0414a> getEntries() {
                return $ENTRIES;
            }

            public final String getStringValue() {
                return this.stringValue;
            }
        }

        /* JADX INFO: renamed from: com.brentvatne.exoplayer.w0$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20438a;

            static {
                int[] iArr = new int[EnumC0414a.values().length];
                try {
                    iArr[EnumC0414a.SEEK_BACKWARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0414a.SEEK_FORWARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0414a.TOGGLE_PLAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC0414a.PLAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC0414a.PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f20438a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0414a a(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            EnumC0414a enumC0414a = EnumC0414a.SEEK_FORWARD;
            if (p013kotlin.jvm.internal.s.f(value, enumC0414a.getStringValue())) {
                return enumC0414a;
            }
            EnumC0414a enumC0414a2 = EnumC0414a.SEEK_BACKWARD;
            if (p013kotlin.jvm.internal.s.f(value, enumC0414a2.getStringValue())) {
                return enumC0414a2;
            }
            EnumC0414a enumC0414a3 = EnumC0414a.TOGGLE_PLAY;
            if (p013kotlin.jvm.internal.s.f(value, enumC0414a3.getStringValue())) {
                return enumC0414a3;
            }
            EnumC0414a enumC0414a4 = EnumC0414a.PLAY;
            if (p013kotlin.jvm.internal.s.f(value, enumC0414a4.getStringValue())) {
                return enumC0414a4;
            }
            EnumC0414a enumC0414a5 = EnumC0414a.PAUSE;
            return p013kotlin.jvm.internal.s.f(value, enumC0414a5.getStringValue()) ? enumC0414a5 : EnumC0414a.NONE;
        }

        public final void b(EnumC0414a command, t7 session) {
            p013kotlin.jvm.internal.s.k(command, "command");
            p013kotlin.jvm.internal.s.k(session, "session");
            int i11 = b.f20438a[command.ordinal()];
            if (i11 == 1) {
                session.k().seekTo(session.k().Q() - 10000);
                return;
            }
            if (i11 == 2) {
                session.k().seekTo(session.k().Q() + 10000);
                return;
            }
            if (i11 == 3) {
                b(session.k().isPlaying() ? EnumC0414a.PAUSE : EnumC0414a.PLAY, session);
                return;
            }
            if (i11 == 4) {
                session.k().f();
            } else if (i11 != 5) {
                xi.a.f("VideoPlaybackService", "Received COMMAND.NONE - was there an error?");
            } else {
                session.k().d();
            }
        }

        private Companion() {
        }
    }

    public w0() {
        String stringValue = Companion.EnumC0414a.SEEK_FORWARD.getStringValue();
        Bundle bundle = Bundle.EMPTY;
        se seVar = new se(stringValue, bundle);
        this.commandSeekForward = seVar;
        se seVar2 = new se(Companion.EnumC0414a.SEEK_BACKWARD.getStringValue(), bundle);
        this.commandSeekBackward = seVar2;
        androidx.media3.session.a aVarA = new androidx.media3.session.a.b().c("forward").i(seVar).f(ia.r.f77211i).a();
        p013kotlin.jvm.internal.s.j(aVarA, "build(...)");
        this.seekForwardBtn = aVarA;
        androidx.media3.session.a aVarA2 = new androidx.media3.session.a.b().c("backward").i(seVar2).f(ia.r.f77212j).a();
        p013kotlin.jvm.internal.s.j(aVarA2, "build(...)");
        this.seekBackwardBtn = aVarA2;
    }

    private final void A(t7 session) {
        Object systemService = getSystemService("notification");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            v0.a();
            notificationManager.createNotificationChannel(ga.c.a("RNVIDEO_SESSION_NOTIFICATION", "RNVIDEO_SESSION_NOTIFICATION", 2));
        }
        if (session.k().U0() == null) {
            notificationManager.cancel(session.k().hashCode());
        } else {
            notificationManager.notify(session.k().hashCode(), x(session));
        }
    }

    private final void B() {
        Object systemService = getSystemService("notification");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancelAll();
    }

    private final void C(ExoPlayer player) {
        Object systemService = getSystemService("notification");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(player.hashCode());
    }

    private final Notification x(t7 session) {
        Class<Activity> cls = this.sourceActivity;
        if (cls == null) {
            cls = w0.class;
        }
        Intent intent = new Intent(this, cls);
        intent.setFlags(603979776);
        if (Build.VERSION.SDK_INT >= 33) {
            Notification notificationC = new androidx.core.app.o.e(this, "RNVIDEO_SESSION_NOTIFICATION").D(ga.s.f67717h).F(new ga.r(session)).k(PendingIntent.getActivity(this, 0, intent, 201326592)).c();
            p013kotlin.jvm.internal.s.h(notificationC);
            return notificationC;
        }
        int iHashCode = session.k().hashCode();
        Intent intent2 = new Intent(this, (Class<?>) w0.class);
        intent2.putExtra("PLAYER_ID", iHashCode);
        intent2.putExtra("ACTION", Companion.EnumC0414a.SEEK_BACKWARD.getStringValue());
        int i11 = iHashCode * 10;
        PendingIntent service = PendingIntent.getService(this, i11, intent2, 167772160);
        Intent intent3 = new Intent(this, (Class<?>) w0.class);
        intent3.putExtra("PLAYER_ID", iHashCode);
        intent3.putExtra("ACTION", Companion.EnumC0414a.TOGGLE_PLAY.getStringValue());
        PendingIntent service2 = PendingIntent.getService(this, i11 + 1, intent3, 167772160);
        Intent intent4 = new Intent(this, (Class<?>) w0.class);
        intent4.putExtra("PLAYER_ID", iHashCode);
        intent4.putExtra("ACTION", Companion.EnumC0414a.SEEK_FORWARD.getStringValue());
        androidx.core.app.o.e eVarK = new androidx.core.app.o.e(this, "RNVIDEO_SESSION_NOTIFICATION").K(1).D(ga.s.f67717h).a(ga.s.S, "Seek Backward", service).a(session.k().isPlaying() ? ga.s.f67743u : ga.s.f67745v, "Toggle Play", service2).a(ga.s.f67723k, "Seek Forward", PendingIntent.getService(this, i11 + 2, intent4, 167772160)).F(new ga.r(session).h(0, 1, 2)).m(session.k().V().f101276a).l(session.k().V().f101282g).k(PendingIntent.getActivity(this, 0, intent, 201326592));
        Uri uri = session.k().V().f101288m;
        Notification notificationC2 = eVarK.u(uri != null ? session.c().c(uri).get() : null).y(true).c();
        p013kotlin.jvm.internal.s.h(notificationC2);
        return notificationC2;
    }

    private final void y() {
        B();
        Iterator<Map.Entry<ExoPlayer, t7>> it = this.mediaSessionsList.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().s();
        }
        this.mediaSessionsList.clear();
    }

    private final Notification z() {
        Object systemService = getSystemService("notification");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            v0.a();
            notificationManager.createNotificationChannel(ga.c.a("RNVIDEO_SESSION_NOTIFICATION", "RNVIDEO_SESSION_NOTIFICATION", 2));
        }
        Notification notificationC = new androidx.core.app.o.e(this, "RNVIDEO_SESSION_NOTIFICATION").D(ga.s.f67717h).m(getString(yi.a.f125602e)).l(getString(yi.a.f125601d)).c();
        p013kotlin.jvm.internal.s.j(notificationC, "build(...)");
        return notificationC;
    }

    public final void D(ExoPlayer player, Class<Activity> from) {
        p013kotlin.jvm.internal.s.k(player, "player");
        p013kotlin.jvm.internal.s.k(from, "from");
        if (this.mediaSessionsList.containsKey(player)) {
            return;
        }
        this.sourceActivity = from;
        t7 t7VarD = new t7.b(this, player).g("RNVideoPlaybackService_" + player.hashCode()).e(new u0()).f(Util.immutableListOf(this.seekForwardBtn, this.seekBackwardBtn)).d();
        p013kotlin.jvm.internal.s.j(t7VarD, "build(...)");
        this.mediaSessionsList.put(player, t7VarD);
        f(t7VarD);
        startForeground(player.hashCode(), x(t7VarD));
    }

    public final void E(ExoPlayer player) {
        p013kotlin.jvm.internal.s.k(player, "player");
        C(player);
        t7 t7VarRemove = this.mediaSessionsList.remove(player);
        if (t7VarRemove != null) {
            t7VarRemove.s();
        }
        if (this.mediaSessionsList.isEmpty()) {
            y();
            stopSelf();
        }
    }

    @Override // androidx.media3.session.bb, android.app.Service
    public IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.binder;
    }

    @Override // androidx.media3.session.bb, android.app.Service
    public void onDestroy() {
        y();
        Object systemService = getSystemService("notification");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.deleteNotificationChannel("RNVIDEO_SESSION_NOTIFICATION");
        }
        super.onDestroy();
    }

    @Override // androidx.media3.session.bb, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Object next;
        if (Build.VERSION.SDK_INT >= 26) {
            startForeground(9999, z());
        }
        if (intent != null) {
            int intExtra = intent.getIntExtra("PLAYER_ID", -1);
            String stringExtra = intent.getStringExtra("ACTION");
            if (intExtra < 0) {
                xi.a.f("VideoPlaybackService", "Received Command without playerId");
                return super.onStartCommand(intent, flags, startId);
            }
            if (stringExtra == null) {
                xi.a.f("VideoPlaybackService", "Received Command without action command");
                return super.onStartCommand(intent, flags, startId);
            }
            Iterator<T> it = this.mediaSessionsList.values().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((t7) next).k().hashCode() != intExtra);
            t7 t7Var = (t7) next;
            if (t7Var == null) {
                return super.onStartCommand(intent, flags, startId);
            }
            Companion companion = INSTANCE;
            companion.b(companion.a(stringExtra), t7Var);
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override // androidx.media3.session.bb, android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        y();
        stopSelf();
    }

    @Override // androidx.media3.session.bb
    public t7 r(t7.g controllerInfo) {
        p013kotlin.jvm.internal.s.k(controllerInfo, "controllerInfo");
        return null;
    }

    @Override // androidx.media3.session.bb
    public void t(t7 session, boolean startInForegroundRequired) {
        p013kotlin.jvm.internal.s.k(session, "session");
        A(session);
    }
}
