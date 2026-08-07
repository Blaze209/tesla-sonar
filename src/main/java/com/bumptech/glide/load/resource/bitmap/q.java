package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final dj.g<dj.b> f20820f = dj.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", dj.b.DEFAULT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dj.g<dj.i> f20821g = dj.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final dj.g<m> f20822h = m.f20818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final dj.g<Boolean> f20823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final dj.g<Boolean> f20824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set<String> f20825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f20826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f20827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f20828n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj.d f20829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f20830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gj.b f20831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f20832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f20833e = v.b();

    public interface b {
        void a();

        void b(gj.d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f20823i = dj.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f20824j = dj.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f20825k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f20826l = new a();
        f20827m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f20828n = xj.l.g(0);
    }

    public q(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, gj.d dVar, gj.b bVar) {
        this.f20832d = list;
        this.f20830b = (DisplayMetrics) xj.k.d(displayMetrics);
        this.f20829a = (gj.d) xj.k.d(dVar);
        this.f20831c = (gj.b) xj.k.d(bVar);
    }

    private static int a(double d11) {
        int iL = l(d11);
        int iX = x(((double) iL) * d11);
        return x((d11 / ((double) (iX / iL))) * ((double) iX));
    }

    private void b(w wVar, dj.b bVar, boolean z11, boolean z12, BitmapFactory.Options options, int i11, int i12) {
        boolean zHasAlpha;
        if (this.f20833e.g(i11, i12, options, z11, z12)) {
            return;
        }
        if (bVar == dj.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = wVar.d().hasAlpha();
        } catch (IOException e11) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e11);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, w wVar, b bVar, gj.d dVar, m mVar, int i11, int i12, int i13, int i14, int i15, BitmapFactory.Options options) {
        int i16;
        int i17;
        int i18;
        int iFloor;
        int iFloor2;
        if (i12 <= 0 || i13 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i14 + "x" + i15 + "]");
                return;
            }
            return;
        }
        if (r(i11)) {
            i17 = i12;
            i16 = i13;
        } else {
            i16 = i12;
            i17 = i13;
        }
        float fB = mVar.b(i16, i17, i14, i15);
        if (fB <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + mVar + ", source: [" + i12 + "x" + i13 + "], target: [" + i14 + "x" + i15 + "]");
        }
        m.g gVarA = mVar.a(i16, i17, i14, i15);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f11 = i16;
        float f12 = i17;
        int i19 = i16;
        int i21 = i17;
        int iX = i19 / x(fB * f11);
        int iX2 = i21 / x(fB * f12);
        m.g gVar = m.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (gVarA == gVar && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            i18 = 0;
            iFloor = (int) Math.ceil(f11 / fMin);
            iFloor2 = (int) Math.ceil(f12 / fMin);
            int i22 = iMax / 8;
            if (i22 > 0) {
                iFloor /= i22;
                iFloor2 /= i22;
            }
        } else {
            i18 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f13 = iMax;
                iFloor = (int) Math.floor(f11 / f13);
                iFloor2 = (int) Math.floor(f12 / f13);
            } else if (imageType.isWebp()) {
                float f14 = iMax;
                iFloor = Math.round(f11 / f14);
                iFloor2 = Math.round(f12 / f14);
            } else if (i19 % iMax == 0 && i21 % iMax == 0) {
                iFloor = i19 / iMax;
                iFloor2 = i21 / iMax;
            } else {
                int[] iArrM = m(wVar, options, bVar, dVar);
                iFloor = iArrM[0];
                iFloor2 = iArrM[1];
            }
        }
        double dB = mVar.b(iFloor, iFloor2, i14, i15);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            int i23 = i18;
            options.inTargetDensity = i23;
            options.inDensity = i23;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i12 + "x" + i13 + "], degreesToRotate: " + i11 + ", target: [" + i14 + "x" + i15 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fB + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private fj.c<Bitmap> e(w wVar, int i11, int i12, dj.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f20831c.c(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        dj.b bVar2 = (dj.b) hVar.c(f20820f);
        dj.i iVar = (dj.i) hVar.c(f20821g);
        m mVar = (m) hVar.c(m.f20818h);
        boolean zBooleanValue = ((Boolean) hVar.c(f20823i)).booleanValue();
        dj.g<Boolean> gVar = f20824j;
        try {
            return f.c(h(wVar, optionsK, mVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i11, i12, zBooleanValue, bVar), this.f20829a);
        } finally {
            v(optionsK);
            this.f20831c.put(bArr);
        }
    }

    private Bitmap h(w wVar, BitmapFactory.Options options, m mVar, dj.b bVar, dj.i iVar, boolean z11, int i11, int i12, boolean z12, b bVar2) {
        String str;
        ColorSpace colorSpace;
        long jB = xj.g.b();
        int[] iArrM = m(wVar, options, bVar2, this.f20829a);
        int i13 = iArrM[0];
        int i14 = iArrM[1];
        String str2 = options.outMimeType;
        boolean z13 = (i13 == -1 || i14 == -1) ? false : z11;
        int iB = wVar.b();
        int iJ = d0.j(iB);
        boolean zM = d0.m(iB);
        int i15 = i11;
        if (i15 == Integer.MIN_VALUE) {
            i15 = r(iJ) ? i14 : i13;
        }
        if (i12 == -2147483648) {
            i12 = r(iJ) ? i13 : i14;
        }
        ImageHeaderParser.ImageType imageTypeD = wVar.d();
        c(imageTypeD, wVar, bVar2, this.f20829a, mVar, iJ, i13, i14, i15, i12, options);
        int i16 = i15;
        int i17 = i12;
        b(wVar, bVar, z13, zM, options, i16, i17);
        int i18 = Build.VERSION.SDK_INT;
        if (z(imageTypeD)) {
            if (i13 < 0 || i14 < 0 || !z12) {
                float f11 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i19 = options.inSampleSize;
                float f12 = i19;
                int iCeil = (int) Math.ceil(i13 / f12);
                int iCeil2 = (int) Math.ceil(i14 / f12);
                int iRound = Math.round(iCeil * f11);
                int iRound2 = Math.round(iCeil2 * f11);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i13 + "x" + i14 + "], sampleSize: " + i19 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f11);
                }
                i16 = iRound;
                i17 = iRound2;
            } else {
                str = "Downsampler";
            }
            if (i16 > 0 && i17 > 0) {
                y(options, this.f20829a, i16, i17);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar != null) {
            if (i18 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((iVar == dj.i.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i18 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(wVar, options, bVar2, this.f20829a);
        bVar2.b(this.f20829a, bitmapI);
        if (Log.isLoggable(str, 2)) {
            t(i13, i14, str2, options, bitmapI, i11, i12, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f20830b.densityDpi);
        Bitmap bitmapN = d0.n(this.f20829a, bitmapI, iB);
        if (!bitmapI.equals(bitmapN)) {
            this.f20829a.c(bitmapI);
        }
        return bitmapN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.w r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.q.b r7, gj.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.a()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.d0.i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.c(r6)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L47
        L1d:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.d0.i()
            r6.unlock()
            return r5
        L25:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L36
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
        L36:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L46
            r8.c(r0)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            goto L1d
        L45:
            throw r1     // Catch: java.lang.Throwable -> L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.d0.i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.q.i(com.bumptech.glide.load.resource.bitmap.w, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.q$b, gj.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f20828n;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            w(optionsPoll);
        }
        return optionsPoll;
    }

    private static int l(double d11) {
        if (d11 > 1.0d) {
            d11 = 1.0d / d11;
        }
        return (int) Math.round(d11 * 2.147483647E9d);
    }

    private static int[] m(w wVar, BitmapFactory.Options options, b bVar, gj.d dVar) {
        options.inJustDecodeBounds = true;
        i(wVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i11) {
        return i11 == 90 || i11 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i11;
        int i12 = options.inTargetDensity;
        return i12 > 0 && (i11 = options.inDensity) > 0 && i12 != i11;
    }

    private static void t(int i11, int i12, String str, BitmapFactory.Options options, Bitmap bitmap, int i13, int i14, long j11) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i11 + "x" + i12 + "] " + str + " with inBitmap " + n(options) + " for [" + i13 + "x" + i14 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + xj.g.a(j11));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i11, int i12, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i11 + ", outHeight: " + i12 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f20828n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d11) {
        return (int) (d11 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, gj.d dVar, int i11, int i12) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i11, i12, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public fj.c<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, dj.h hVar) {
        return e(new w.c(parcelFileDescriptor, this.f20832d, this.f20831c), i11, i12, hVar, f20826l);
    }

    public fj.c<Bitmap> f(InputStream inputStream, int i11, int i12, dj.h hVar, b bVar) {
        return e(new w.b(inputStream, this.f20832d, this.f20831c), i11, i12, hVar, bVar);
    }

    public fj.c<Bitmap> g(ByteBuffer byteBuffer, int i11, int i12, dj.h hVar) {
        return e(new w.a(byteBuffer, this.f20832d, this.f20831c), i11, i12, hVar, f20826l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q.b
        public void b(gj.d dVar, Bitmap bitmap) {
        }
    }
}
