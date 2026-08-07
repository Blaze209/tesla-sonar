package cn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.OutputStream;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u001a\u0010%\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006&"}, d2 = {"Lcn/g;", "Lcn/c;", "", "resizingEnabled", "", "maxBitmapSize", "<init>", "(ZI)V", "Lum/k;", "encodedImage", "Lom/g;", "rotationOptions", "Lom/f;", "resizeOptions", "e", "(Lum/k;Lom/g;Lom/f;)I", "Ljava/io/OutputStream;", "outputStream", "Lgm/c;", "outputFormat", "quality", "Landroid/graphics/ColorSpace;", "colorSpace", "Lcn/b;", "c", "(Lum/k;Ljava/io/OutputStream;Lom/g;Lom/f;Lgm/c;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Lcn/b;", DateTokenConverter.CONVERTER_KEY, "(Lum/k;Lom/g;Lom/f;)Z", "imageFormat", "b", "(Lgm/c;)Z", "a", "Z", "I", "", "Ljava/lang/String;", "()Ljava/lang/String;", "identifier", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean resizingEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxBitmapSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String identifier = "SimpleImageTranscoder";

    /* JADX INFO: renamed from: cn.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcn/g$a;", "", "<init>", "()V", "Lgm/c;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "b", "(Lgm/c;)Landroid/graphics/Bitmap$CompressFormat;", "", "TAG", "Ljava/lang/String;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap.CompressFormat b(gm.c format) {
            if (format == null) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (format == gm.b.JPEG) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (format == gm.b.PNG) {
                return Bitmap.CompressFormat.PNG;
            }
            return gm.b.a(format) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }

        private Companion() {
        }
    }

    public g(boolean z11, int i11) {
        this.resizingEnabled = z11;
        this.maxBitmapSize = i11;
    }

    private final int e(k encodedImage, om.g rotationOptions, om.f resizeOptions) {
        if (this.resizingEnabled) {
            return a.b(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize);
        }
        return 1;
    }

    @Override // cn.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // cn.c
    public boolean b(gm.c imageFormat) {
        s.k(imageFormat, "imageFormat");
        return imageFormat == gm.b.HEIF || imageFormat == gm.b.JPEG;
    }

    @Override // cn.c
    public b c(k encodedImage, OutputStream outputStream, om.g rotationOptions, om.f resizeOptions, gm.c outputFormat, Integer quality, ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        s.k(encodedImage, "encodedImage");
        s.k(outputStream, "outputStream");
        Integer num = quality == null ? 85 : quality;
        om.g gVarA = rotationOptions == null ? om.g.INSTANCE.a() : rotationOptions;
        int iE = e(encodedImage, gVarA, resizeOptions);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iE;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.J(), null, options);
            if (bitmapDecodeStream == null) {
                qk.a.m("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix matrixG = e.g(encodedImage, gVarA);
            if (matrixG != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixG, false);
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    qk.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(INSTANCE.b(outputFormat), num.intValue(), outputStream);
                    b bVar2 = new b(iE > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar2;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    qk.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar3 = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar3;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e13) {
            qk.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e13);
            return new b(2);
        }
    }

    @Override // cn.c
    public boolean d(k encodedImage, om.g rotationOptions, om.f resizeOptions) {
        s.k(encodedImage, "encodedImage");
        if (rotationOptions == null) {
            rotationOptions = om.g.INSTANCE.a();
        }
        return this.resizingEnabled && a.b(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize) > 1;
    }
}
