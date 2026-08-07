package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
final class l implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3 f10362a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements e3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AudioManager f10363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioDeviceCallback f10364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private s7.g<Boolean> f10365c;

        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f10365c.g(Boolean.valueOf(b.this.h()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f10365c.g(Boolean.valueOf(b.this.h()));
            }
        }

        private b() {
        }

        public static /* synthetic */ void d(b bVar, Context context) {
            AudioManager audioManager;
            s7.a.f(bVar.f10365c);
            if (s7.q0.W0(context) && (audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) != null) {
                bVar.f10363a = audioManager;
                a aVar = bVar.new a();
                bVar.f10364b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) s7.a.f(Looper.myLooper())));
                bVar.f10365c.g(Boolean.valueOf(bVar.h()));
            }
        }

        public static /* synthetic */ void e(b bVar) {
            AudioManager audioManager = bVar.f10363a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) s7.a.f(bVar.f10364b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) s7.a.j(this.f10363a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i11 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i11 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i11 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.e3
        public boolean a() {
            s7.g<Boolean> gVar = this.f10365c;
            if (gVar == null) {
                return true;
            }
            return gVar.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.e3
        public void b(final e3.a aVar, final Context context, Looper looper, Looper looper2, s7.j jVar) {
            s7.g<Boolean> gVar = new s7.g<>(Boolean.TRUE, looper2, looper, jVar, new s7.g.a() { // from class: androidx.media3.exoplayer.n
                @Override // s7.g.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f10365c = gVar;
            gVar.e(new Runnable() { // from class: androidx.media3.exoplayer.o
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.d(this.f10597a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.e3
        public void disable() {
            ((s7.g) s7.a.f(this.f10365c)).e(new Runnable() { // from class: androidx.media3.exoplayer.m
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.e(this.f10378a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements e3 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final RouteDiscoveryPreference f10367e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediaRouter2 f10368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaRouter2$RouteCallback f10369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaRouter2$ControllerCallback f10370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private s7.g<Boolean> f10371d;

        class a extends MediaRouter2$RouteCallback {
            a() {
            }
        }

        class b extends MediaRouter2$ControllerCallback {
            b() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f10371d.g(Boolean.valueOf(c.j(c.this.f10368a)));
            }
        }

        static {
            z7.f.a();
            f10367e = z7.e.a(com.google.common.collect.x.r(), false).build();
        }

        private c() {
        }

        public static /* synthetic */ void c(c cVar) {
            ((MediaRouter2) s7.a.f(cVar.f10368a)).unregisterControllerCallback((MediaRouter2$ControllerCallback) s7.a.f(cVar.f10370c));
            cVar.f10370c = null;
            cVar.f10368a.unregisterRouteCallback((MediaRouter2$RouteCallback) s7.a.f(cVar.f10369b));
        }

        public static /* synthetic */ void e(c cVar, Context context) {
            s7.a.f(cVar.f10371d);
            cVar.f10368a = MediaRouter2.getInstance(context);
            cVar.f10369b = cVar.new a();
            final s7.g<Boolean> gVar = cVar.f10371d;
            Objects.requireNonNull(gVar);
            Executor executor = new Executor() { // from class: z7.i
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    gVar.e(runnable);
                }
            };
            cVar.f10368a.registerRouteCallback(executor, cVar.f10369b, f10367e);
            b bVar = cVar.new b();
            cVar.f10370c = bVar;
            cVar.f10368a.registerControllerCallback(executor, bVar);
            cVar.f10371d.g(Boolean.valueOf(j(cVar.f10368a)));
        }

        private static boolean i(MediaRoute2Info mediaRoute2Info, int i11, boolean z11) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                return (i11 == 1 || i11 == 2) && z11;
            }
            return suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean j(MediaRouter2 mediaRouter2) {
            int transferReason = z7.g.a(s7.a.f(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator<MediaRoute2Info> it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (i(z7.h.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.e3
        public boolean a() {
            s7.g<Boolean> gVar = this.f10371d;
            if (gVar == null) {
                return true;
            }
            return gVar.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.e3
        @SuppressLint({"ThreadSafe"})
        public void b(final e3.a aVar, final Context context, Looper looper, Looper looper2, s7.j jVar) {
            s7.g<Boolean> gVar = new s7.g<>(Boolean.TRUE, looper2, looper, jVar, new s7.g.a() { // from class: androidx.media3.exoplayer.q
                @Override // s7.g.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f10371d = gVar;
            gVar.e(new Runnable() { // from class: androidx.media3.exoplayer.r
                @Override // java.lang.Runnable
                public final void run() {
                    l.c.e(this.f10639a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.e3
        public void disable() {
            ((s7.g) s7.a.j(this.f10371d)).e(new Runnable() { // from class: androidx.media3.exoplayer.p
                @Override // java.lang.Runnable
                public final void run() {
                    l.c.c(this.f10607a);
                }
            });
        }
    }

    public l() {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f10362a = new c();
        } else {
            this.f10362a = new b();
        }
    }

    @Override // androidx.media3.exoplayer.e3
    public boolean a() {
        e3 e3Var = this.f10362a;
        return e3Var == null || e3Var.a();
    }

    @Override // androidx.media3.exoplayer.e3
    public void b(e3.a aVar, Context context, Looper looper, Looper looper2, s7.j jVar) {
        e3 e3Var = this.f10362a;
        if (e3Var != null) {
            e3Var.b(aVar, context, looper, looper2, jVar);
        }
    }

    @Override // androidx.media3.exoplayer.e3
    public void disable() {
        e3 e3Var = this.f10362a;
        if (e3Var != null) {
            e3Var.disable();
        }
    }
}
