package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.soloader.g;
import java.util.Locale;
import pk.p;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@pk.d
public abstract class DalvikPurgeableDecoder implements ym.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final byte[] f21719b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xm.b f21720a = xm.c.a();

    @g
    private static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f21719b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(tk.a<PooledByteBuffer> aVar, int i11) {
        PooledByteBuffer pooledByteBufferH = aVar.H();
        return i11 >= 2 && pooledByteBufferH.Q(i11 + (-2)) == -1 && pooledByteBufferH.Q(i11 - 1) == -39;
    }

    public static BitmapFactory.Options f(int i11, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i11;
        options.inMutable = true;
        return options;
    }

    @pk.d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // ym.d
    public tk.a<Bitmap> a(k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(kVar.b0(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        tk.a<PooledByteBuffer> aVarT = kVar.t();
        pk.k.g(aVarT);
        try {
            return g(c(aVarT, optionsF));
        } finally {
            tk.a.C(aVarT);
        }
    }

    @Override // ym.d
    public tk.a<Bitmap> b(k kVar, Bitmap.Config config, Rect rect, int i11, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(kVar.b0(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        tk.a<PooledByteBuffer> aVarT = kVar.t();
        pk.k.g(aVarT);
        try {
            return g(d(aVarT, i11, optionsF));
        } finally {
            tk.a.C(aVarT);
        }
    }

    protected abstract Bitmap c(tk.a<PooledByteBuffer> aVar, BitmapFactory.Options options);

    protected abstract Bitmap d(tk.a<PooledByteBuffer> aVar, int i11, BitmapFactory.Options options);

    public tk.a<Bitmap> g(Bitmap bitmap) {
        pk.k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f21720a.g(bitmap)) {
                return tk.a.k0(bitmap, this.f21720a.e());
            }
            int iJ = fn.c.j(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iJ), Integer.valueOf(this.f21720a.b()), Long.valueOf(this.f21720a.f()), Integer.valueOf(this.f21720a.c()), Integer.valueOf(this.f21720a.d())));
        } catch (Exception e11) {
            bitmap.recycle();
            throw p.a(e11);
        }
    }
}
