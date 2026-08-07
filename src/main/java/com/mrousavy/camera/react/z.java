package com.mrousavy.camera.react;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/mrousavy/camera/react/z;", "", "Lcom/mrousavy/camera/react/z$a;", "callback", "<init>", "(Lcom/mrousavy/camera/react/z$a;)V", "Ljn0/h0;", "e", "()V", "f", DateTokenConverter.CONVERTER_KEY, "a", "Lcom/mrousavy/camera/react/z$a;", "c", "()Lcom/mrousavy/camera/react/z$a;", "", "", "b", "Ljava/util/List;", "timestamps", "Ljava/util/Timer;", "Ljava/util/Timer;", "timer", "", "()D", "averageFps", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a callback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<Long> timestamps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Timer timer;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mrousavy/camera/react/z$a;", "", "", "averageFps", "Ljn0/h0;", "a", "(D)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void a(double averageFps);
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/mrousavy/camera/react/z$b", "Ljava/util/TimerTask;", "Ljn0/h0;", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z.this.getCallback().a(z.this.b());
        }
    }

    public z(a callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.callback = callback;
        this.timestamps = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double b() {
        Long l11 = (Long) p013kotlin.collections.v.q0(this.timestamps);
        Long l12 = (Long) p013kotlin.collections.v.C0(this.timestamps);
        if (l11 == null || l12 == null) {
            return 0.0d;
        }
        return 1000.0d / ((l12.longValue() - l11.longValue()) / ((double) (this.timestamps.size() - 1)));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getCallback() {
        return this.callback;
    }

    public final void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.timestamps.add(Long.valueOf(jCurrentTimeMillis));
        List<Long> list = this.timestamps;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (jCurrentTimeMillis - ((Number) obj).longValue() < 1000) {
                arrayList.add(obj);
            }
        }
        this.timestamps = p013kotlin.collections.v.p1(arrayList);
    }

    public final void e() {
        Timer timer = new Timer("VisionCamera FPS Sample Collector");
        this.timer = timer;
        timer.schedule(new b(), 1000L, 1000L);
    }

    public final void f() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timer = null;
    }
}
