package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.classic.Level;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f20838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f20839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final File f20840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile v f20841h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20844c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f20845d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20842a = Level.INFO_INT;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f20838e = i11 < 29;
        f20839f = i11 >= 28;
        f20840g = new File("/proc/self/fd");
    }

    v() {
    }

    private boolean a() {
        return f20838e && !this.f20845d.get();
    }

    public static v b() {
        if (f20841h == null) {
            synchronized (v.class) {
                try {
                    if (f20841h == null) {
                        f20841h = new v();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f20841h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f20842a;
    }

    private synchronized boolean d() {
        try {
            boolean z11 = true;
            int i11 = this.f20843b + 1;
            this.f20843b = i11;
            if (i11 >= 50) {
                this.f20843b = 0;
                int length = f20840g.list().length;
                long jC = c();
                if (length >= jC) {
                    z11 = false;
                }
                this.f20844c = z11;
                if (!z11 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20844c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i11, int i12, boolean z11, boolean z12) {
        if (!z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f20839f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i11 < 0 || i12 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    boolean g(int i11, int i12, BitmapFactory.Options options, boolean z11, boolean z12) {
        boolean zF = f(i11, i12, z11, z12);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        xj.l.b();
        this.f20845d.set(true);
    }
}
