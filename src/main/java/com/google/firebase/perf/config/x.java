package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kw.a f44444c = kw.a.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static x f44445d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile SharedPreferences f44446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f44447b;

    public x(ExecutorService executorService) {
        this.f44447b = executorService;
    }

    public static /* synthetic */ void a(x xVar, Context context) {
        if (xVar.f44446a != null || context == null) {
            return;
        }
        xVar.f44446a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    private Context e() {
        try {
            com.google.firebase.f.l();
            return com.google.firebase.f.l().k();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized x f() {
        try {
            if (f44445d == null) {
                f44445d = new x(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44445d;
    }

    public void b(String str) {
        if (str == null) {
            f44444c.a("Key is null. Cannot clear nullable key");
        } else {
            this.f44446a.edit().remove(str).apply();
        }
    }

    public com.google.firebase.perf.util.g<Boolean> c(String str) {
        if (str == null) {
            f44444c.a("Key is null when getting boolean value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f44446a == null) {
            i(e());
            if (this.f44446a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f44446a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(Boolean.valueOf(this.f44446a.getBoolean(str, false)));
        } catch (ClassCastException e11) {
            f44444c.b("Key %s from sharedPreferences has type other than long: %s", str, e11.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public com.google.firebase.perf.util.g<Double> d(String str) {
        if (str == null) {
            f44444c.a("Key is null when getting double value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f44446a == null) {
            i(e());
            if (this.f44446a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f44446a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            try {
                return com.google.firebase.perf.util.g.e(Double.valueOf(Double.longBitsToDouble(this.f44446a.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return com.google.firebase.perf.util.g.e(Double.valueOf(Float.valueOf(this.f44446a.getFloat(str, BitmapDescriptorFactory.HUE_RED)).doubleValue()));
            }
        } catch (ClassCastException e11) {
            f44444c.b("Key %s from sharedPreferences has type other than double: %s", str, e11.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public com.google.firebase.perf.util.g<Long> g(String str) {
        if (str == null) {
            f44444c.a("Key is null when getting long value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f44446a == null) {
            i(e());
            if (this.f44446a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f44446a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(Long.valueOf(this.f44446a.getLong(str, 0L)));
        } catch (ClassCastException e11) {
            f44444c.b("Key %s from sharedPreferences has type other than long: %s", str, e11.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public com.google.firebase.perf.util.g<String> h(String str) {
        if (str == null) {
            f44444c.a("Key is null when getting String value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f44446a == null) {
            i(e());
            if (this.f44446a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f44446a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(this.f44446a.getString(str, ""));
        } catch (ClassCastException e11) {
            f44444c.b("Key %s from sharedPreferences has type other than String: %s", str, e11.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public synchronized void i(final Context context) {
        if (this.f44446a == null && context != null) {
            this.f44447b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.a(this.f44442a, context);
                }
            });
        }
    }

    public boolean j(String str, double d11) {
        if (str == null) {
            f44444c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f44446a == null) {
            i(e());
            if (this.f44446a == null) {
                return false;
            }
        }
        this.f44446a.edit().putLong(str, Double.doubleToRawLongBits(d11)).apply();
        return true;
    }

    public boolean k(String str, long j11) {
        if (str == null) {
            f44444c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f44446a == null) {
            i(e());
            if (this.f44446a == null) {
                return false;
            }
        }
        this.f44446a.edit().putLong(str, j11).apply();
        return true;
    }

    public boolean l(String str, String str2) {
        if (str == null) {
            f44444c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f44446a == null) {
            i(e());
            if (this.f44446a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f44446a.edit().remove(str).apply();
            return true;
        }
        this.f44446a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean m(String str, boolean z11) {
        if (str == null) {
            f44444c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f44446a == null) {
            i(e());
            if (this.f44446a == null) {
                return false;
            }
        }
        this.f44446a.edit().putBoolean(str, z11).apply();
        return true;
    }
}
