package ym;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import pk.k;
import tk.h;
import xm.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class<?> f125706f = b.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f125707g = {-1, -39};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xm.d f125708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f125709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f125710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PreverificationHelper f125711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final u5.f<ByteBuffer> f125712e;

    public b(xm.d dVar, u5.f<ByteBuffer> fVar, f fVar2) {
        this.f125711d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f125708a = dVar;
        if (dVar instanceof m) {
            this.f125709b = fVar2.getAvoidPoolGet();
            this.f125710c = fVar2.getAvoidPoolRelease();
        }
        this.f125712e = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:36:0x007d, B:39:0x0087, B:49:0x009f, B:68:0x00c7, B:64:0x00c0, B:65:0x00c3, B:62:0x00ba), top: B:98:0x007d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private tk.a<Bitmap> c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ByteBuffer byteBufferB;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        k.g(inputStream);
        int i11 = options.outWidth;
        int iHeight = options.outHeight;
        ?? r11 = i11;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r11 = iWidth;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z11 = i12 >= 26 && (preverificationHelper = this.f125711d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                if (rect != null || !z11) {
                    if (rect != null && z11) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.f125709b) {
                        bitmap = this.f125708a.get(d(r11, iHeight, options));
                        if (bitmap == null) {
                            bitmap2 = bitmap;
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                    }
                    bitmap2 = bitmap;
                    options.inBitmap = bitmap2;
                    if (i12 >= 26) {
                        if (colorSpace == null) {
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        options.inPreferredColorSpace = colorSpace;
                    }
                    byteBufferB = this.f125712e.b();
                    if (byteBufferB == null) {
                        byteBufferB = ByteBuffer.allocate(sk.b.e());
                    }
                    options.inTempStorage = byteBufferB.array();
                    if (rect != null || bitmap2 == 0) {
                        bitmapDecodeStream = null;
                    } else {
                        Bitmap.Config config = options.inPreferredConfig;
                        try {
                            if (config != null) {
                                try {
                                    bitmap2.reconfigure(r11, iHeight, config);
                                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        try {
                                            bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                        } catch (IOException unused) {
                                            qk.a.k(f125706f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                            if (bitmapRegionDecoderNewInstance != null) {
                                                bitmapRegionDecoderNewInstance.recycle();
                                            }
                                            bitmapDecodeStream = null;
                                        }
                                    } else {
                                        bitmapDecodeStream = null;
                                    }
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                } catch (IOException unused2) {
                                    bitmapRegionDecoderNewInstance = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (bitmapRegionDecoder != 0) {
                                        bitmapRegionDecoder.recycle();
                                    }
                                    throw th;
                                }
                            } else {
                                bitmapDecodeStream = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bitmapRegionDecoder = r11;
                        }
                    }
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    }
                    this.f125712e.a(byteBufferB);
                    if (bitmap2 != 0 || bitmap2 == bitmapDecodeStream) {
                        return this.f125710c ? tk.a.k0(bitmapDecodeStream, a.f125713a) : tk.a.k0(bitmapDecodeStream, this.f125708a);
                    }
                    this.f125708a.a(bitmap2);
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    throw new IllegalStateException();
                }
                options.inMutable = false;
                options.inTempStorage = byteBufferB.array();
                if (rect != null) {
                    bitmapDecodeStream = null;
                } else {
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream == null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                }
                this.f125712e.a(byteBufferB);
                if (bitmap2 != 0) {
                }
                if (this.f125710c) {
                }
            } catch (Throwable th4) {
                this.f125712e.a(byteBufferB);
                throw th4;
            }
        } catch (IllegalArgumentException e11) {
            if (bitmap2 != 0) {
                this.f125708a.a(bitmap2);
            }
            try {
                inputStream.reset();
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream2 == null) {
                    throw e11;
                }
                tk.a<Bitmap> aVarK0 = tk.a.k0(bitmapDecodeStream2, mm.f.b());
                this.f125712e.a(byteBufferB);
                return aVarK0;
            } catch (IOException unused3) {
                throw e11;
            }
        } catch (RuntimeException e12) {
            if (bitmap2 != 0) {
                this.f125708a.a(bitmap2);
            }
            throw e12;
        }
        bitmap2 = 0;
        bitmap2 = bitmap;
        options.inBitmap = bitmap2;
        if (i12 >= 26) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        byteBufferB = this.f125712e.b();
        if (byteBufferB == null) {
            byteBufferB = ByteBuffer.allocate(sk.b.e());
        }
    }

    private static BitmapFactory.Options e(um.k kVar, Bitmap.Config config, boolean z11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = kVar.b0();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z12 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z12) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z11) {
            BitmapFactory.decodeStream(kVar.J(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z12) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // ym.d
    public tk.a<Bitmap> a(um.k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsE = e(kVar, config, this.f125709b);
        boolean z11 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c((InputStream) k.g(kVar.J()), optionsE, rect, colorSpace);
        } catch (RuntimeException e11) {
            if (z11) {
                return a(kVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e11;
        }
    }

    @Override // ym.d
    public tk.a<Bitmap> b(um.k kVar, Bitmap.Config config, Rect rect, int i11, ColorSpace colorSpace) {
        boolean zR0 = kVar.r0(i11);
        BitmapFactory.Options optionsE = e(kVar, config, this.f125709b);
        InputStream inputStreamJ = kVar.J();
        k.g(inputStreamJ);
        if (kVar.c0() > i11) {
            inputStreamJ = new vk.a(inputStreamJ, i11);
        }
        if (!zR0) {
            inputStreamJ = new vk.b(inputStreamJ, f125707g);
        }
        boolean z11 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                tk.a<Bitmap> aVarC = c(inputStreamJ, optionsE, rect, colorSpace);
                try {
                    inputStreamJ.close();
                    return aVarC;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    return aVarC;
                }
            } catch (Throwable th2) {
                try {
                    inputStreamJ.close();
                    throw th2;
                } catch (IOException e12) {
                    e12.printStackTrace();
                    throw th2;
                }
            }
        } catch (RuntimeException e13) {
            if (!z11) {
                throw e13;
            }
            tk.a<Bitmap> aVarB = b(kVar, Bitmap.Config.ARGB_8888, rect, i11, colorSpace);
            try {
                inputStreamJ.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
            return aVarB;
        }
    }

    public abstract int d(int i11, int i12, BitmapFactory.Options options);

    private static final class a implements h<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f125713a = new a();

        private a() {
        }

        @Override // tk.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
        }
    }
}
