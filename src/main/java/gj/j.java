package gj;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class j implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f68978k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f68979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f68980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f68981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f68982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f68983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f68984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f68988j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    j(long j11, k kVar, Set<Bitmap.Config> set) {
        this.f68981c = j11;
        this.f68983e = j11;
        this.f68979a = kVar;
        this.f68980b = set;
        this.f68982d = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    private static Bitmap g(int i11, int i12, Bitmap.Config config) {
        if (config == null) {
            config = f68978k;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f68985g + ", misses=" + this.f68986h + ", puts=" + this.f68987i + ", evictions=" + this.f68988j + ", currentSize=" + this.f68984f + ", maxSize=" + this.f68983e + "\nStrategy=" + this.f68979a);
    }

    private void j() {
        q(this.f68983e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i11 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i11 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f68979a.d(i11, i12, config != null ? config : f68978k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f68979a.a(i11, i12, config));
                }
                this.f68986h++;
            } else {
                this.f68985g++;
                this.f68984f -= (long) this.f68979a.b(bitmapD);
                this.f68982d.b(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f68979a.a(i11, i12, config));
            }
            h();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapD;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j11) {
        while (this.f68984f > j11) {
            try {
                Bitmap bitmapRemoveLast = this.f68979a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f68984f = 0L;
                    return;
                }
                this.f68982d.b(bitmapRemoveLast);
                this.f68984f -= (long) this.f68979a.b(bitmapRemoveLast);
                this.f68988j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f68979a.e(bitmapRemoveLast));
                }
                h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gj.d
    @SuppressLint({"InlinedApi"})
    public void a(int i11) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i11);
        }
        if (i11 >= 40 || i11 >= 20) {
            b();
        } else if (i11 >= 20 || i11 == 15) {
            q(n() / 2);
        }
    }

    @Override // gj.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // gj.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f68979a.b(bitmap) <= this.f68983e && this.f68980b.contains(bitmap.getConfig())) {
                int iB = this.f68979a.b(bitmap);
                this.f68979a.c(bitmap);
                this.f68982d.a(bitmap);
                this.f68987i++;
                this.f68984f += (long) iB;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f68979a.e(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f68979a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f68980b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // gj.d
    @NonNull
    public Bitmap d(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmapM = m(i11, i12, config);
        if (bitmapM == null) {
            return g(i11, i12, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // gj.d
    @NonNull
    public Bitmap e(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmapM = m(i11, i12, config);
        return bitmapM == null ? g(i11, i12, config) : bitmapM;
    }

    public long n() {
        return this.f68983e;
    }

    public j(long j11) {
        this(j11, l(), k());
    }

    private static final class b implements a {
        b() {
        }

        @Override // gj.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // gj.j.a
        public void b(Bitmap bitmap) {
        }
    }
}
