package com.oney.WebRTCModule;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes6.dex */
public class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f46082e = "com.oney.WebRTCModule.s0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, a> f46083a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f46084b = new Timer("VideoTrackMutedTimer");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WebRTCModule f46086d;

    private class a implements VideoSink {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TimerTask f46087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f46088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AtomicInteger f46089c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f46090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f46091e;

        /* JADX INFO: renamed from: com.oney.WebRTCModule.s0$a$a, reason: collision with other inner class name */
        class C0714a extends TimerTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f46093a;

            C0714a() {
                this.f46093a = a.this.f46089c.get();
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (a.this.f46088b) {
                    return;
                }
                boolean z11 = this.f46093a == a.this.f46089c.get();
                if (z11 != a.this.f46090d) {
                    a.this.f46090d = z11;
                    a.this.h(z11);
                }
                this.f46093a = a.this.f46089c.get();
            }
        }

        a(String str) {
            this.f46091e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(boolean z11) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("pcId", s0.this.f46085c);
            writableMapCreateMap.putString("trackId", this.f46091e);
            writableMapCreateMap.putBoolean("muted", z11);
            String str = s0.f46082e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z11 ? "Mute" : "Unmute");
            sb2.append(" event pcId: ");
            sb2.append(s0.this.f46085c);
            sb2.append(" trackId: ");
            sb2.append(this.f46091e);
            Log.d(str, sb2.toString());
            s0.this.f46086d.sendEvent("mediaStreamTrackMuteChanged", writableMapCreateMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            if (this.f46088b) {
                return;
            }
            synchronized (this) {
                try {
                    TimerTask timerTask = this.f46087a;
                    if (timerTask != null) {
                        timerTask.cancel();
                    }
                    this.f46087a = new C0714a();
                    s0.this.f46084b.schedule(this.f46087a, 3000L, 1500L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void g() {
            this.f46088b = true;
            synchronized (this) {
                try {
                    TimerTask timerTask = this.f46087a;
                    if (timerTask != null) {
                        timerTask.cancel();
                        this.f46087a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            this.f46089c.addAndGet(1);
        }
    }

    public s0(WebRTCModule webRTCModule, int i11) {
        this.f46085c = i11;
        this.f46086d = webRTCModule;
    }

    public void d(VideoTrack videoTrack) {
        String strId = videoTrack.id();
        if (this.f46083a.containsKey(strId)) {
            Log.w(f46082e, "Attempted to add adapter twice for track ID: " + strId);
            return;
        }
        a aVar = new a(strId);
        Log.d(f46082e, "Created adapter for " + strId);
        this.f46083a.put(strId, aVar);
        videoTrack.addSink(aVar);
        aVar.i();
    }

    public void e(VideoTrack videoTrack) {
        String strId = videoTrack.id();
        a aVarRemove = this.f46083a.remove(strId);
        if (aVarRemove == null) {
            Log.w(f46082e, "removeAdapter - no adapter for " + strId);
            return;
        }
        videoTrack.removeSink(aVarRemove);
        aVarRemove.g();
        Log.d(f46082e, "Deleted adapter for " + strId);
    }
}
