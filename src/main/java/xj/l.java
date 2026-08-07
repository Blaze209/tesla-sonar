package xj;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import jj.m;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f123614a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f123615b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Handler f123616c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123617a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f123617a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123617a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123617a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f123617a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f123617a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private l() {
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.a<?> aVar2) {
        if (aVar == null) {
            return aVar2 == null;
        }
        return aVar.isEquivalentTo(aVar2);
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof m ? ((m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    private static String f(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f123614a;
            cArr[i12] = cArr2[(b11 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    @NonNull
    public static <T> Queue<T> g(int i11) {
        return new ArrayDeque(i11);
    }

    public static int h(int i11, int i12, Bitmap.Config config) {
        return i11 * i12 * j(config);
    }

    @TargetApi(19)
    public static int i(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i11 = a.f123617a[config.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 3) {
                return i11 != 4 ? 4 : 8;
            }
        }
        return i12;
    }

    @NonNull
    public static <T> List<T> k(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t11 : collection) {
            if (t11 != null) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    private static Handler l() {
        if (f123616c == null) {
            synchronized (l.class) {
                try {
                    if (f123616c == null) {
                        f123616c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f123616c;
    }

    public static int m(float f11) {
        return n(f11, 17);
    }

    public static int n(float f11, int i11) {
        return o(Float.floatToIntBits(f11), i11);
    }

    public static int o(int i11, int i12) {
        return (i12 * 31) + i11;
    }

    public static int p(Object obj, int i11) {
        return o(obj == null ? 0 : obj.hashCode(), i11);
    }

    public static int q(boolean z11, int i11) {
        return o(z11 ? 1 : 0, i11);
    }

    public static boolean r() {
        return !s();
    }

    public static boolean s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean t(int i11) {
        return i11 > 0 || i11 == Integer.MIN_VALUE;
    }

    public static boolean u(int i11, int i12) {
        return t(i11) && t(i12);
    }

    public static void v(Runnable runnable) {
        l().post(runnable);
    }

    public static void w(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    @NonNull
    public static String x(@NonNull byte[] bArr) {
        String strF;
        char[] cArr = f123615b;
        synchronized (cArr) {
            strF = f(bArr, cArr);
        }
        return strF;
    }
}
