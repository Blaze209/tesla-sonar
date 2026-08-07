package net.time4j.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.time4j.android.spi.AndroidResourceLoader;
import net.time4j.b0;
import net.time4j.base.d;
import net.time4j.format.e;
import net.time4j.g0;
import net.time4j.h0;
import net.time4j.p0;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.p;

/* JADX INFO: loaded from: classes9.dex */
public class ApplicationStarter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f93930a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f93931b = new AtomicBoolean(false);

    private static class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jNanoTime = System.nanoTime();
            k kVarP = p.p(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000);
            Locale locale = Locale.getDefault();
            try {
                b0 b0VarB = p0.b();
                kVarP = l.O().z();
                Log.i("TIME4A", "System time zone at start: [" + kVarP.a() + "]");
                Log.i("TIME4A", "System locale at start: [" + locale.toString() + "]");
                e eVar = e.FULL;
                Log.i("TIME4A", net.time4j.format.expert.c.B(eVar, eVar, locale, kVarP).l(b0VarB));
                Log.i("TIME4A", "Prefetch thread consumed (in ms): " + ((System.nanoTime() - jNanoTime) / 1000000));
            } catch (Throwable th2) {
                Log.e("TIME4A", "Error on prefetch thread with: time zone=" + kVarP.a() + ", locale=" + locale + "!", th2);
                throw new IllegalStateException(th2);
            }
        }
    }

    private static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.b.a();
            Log.i("TIME4A", "Event ACTION_TIMEZONE_CHANGED received, system timezone changed to: [" + l.O().z().a() + "]. Original tz-id reported by Android: [" + intent.getStringExtra("time-zone") + "]");
        }
    }

    private ApplicationStarter() {
    }

    public static void a(Context context, Runnable runnable) {
        long jNanoTime = System.nanoTime();
        c(context, null);
        d(context.getApplicationContext());
        Log.i("TIME4A", "Starting Time4A (v4.8-2021a published on " + g0.I0(2021, 3, 27).n0(h0.E0()).d0() + ")");
        if (runnable != null) {
            Executors.defaultThreadFactory().newThread(runnable).start();
        }
        Log.i("TIME4A", "Main-Thread consumed in ms: " + ((System.nanoTime() - jNanoTime) / 1000000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context, boolean z11) {
        a(context, z11 ? new b() : null);
    }

    public static void c(Context context, cp0.a aVar) {
        if (f93930a.getAndSet(true)) {
            return;
        }
        System.setProperty("net.time4j.base.ResourceLoader", "net.time4j.android.spi.AndroidResourceLoader");
        ((AndroidResourceLoader) d.c()).j(context, aVar);
    }

    public static void d(Context context) {
        if (context == null || f93931b.getAndSet(true)) {
            return;
        }
        System.setProperty("net.time4j.allow.system.tz.override", "true");
        context.registerReceiver(new c(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    }
}
