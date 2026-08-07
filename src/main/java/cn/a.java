package cn;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcn/a;", "", "<init>", "()V", "Lom/g;", "rotationOptions", "Lom/f;", "resizeOptions", "Lum/k;", "encodedImage", "", "maxBitmapDimension", "b", "(Lom/g;Lom/f;Lum/k;I)I", "pixelSize", "maxBitmapSizeInBytes", "c", "(Lum/k;II)I", "", "a", "(Lom/g;Lom/f;Lum/k;)F", "ratio", "e", "(F)I", "f", DateTokenConverter.CONVERTER_KEY, "(Lom/g;Lum/k;)I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19429a = new a();

    private a() {
    }

    public static final float a(om.g rotationOptions, om.f resizeOptions, k encodedImage) {
        s.k(rotationOptions, "rotationOptions");
        s.k(encodedImage, "encodedImage");
        if (!k.s0(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        if (resizeOptions == null || resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String <= 0 || resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int iD = f19429a.d(rotationOptions, encodedImage);
        boolean z11 = iD == 90 || iD == 270;
        int height = z11 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z11 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f11 = resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String / height;
        float f12 = resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String / width;
        float fE = n.e(f11, f12);
        qk.a.D("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String), Integer.valueOf(resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(fE));
        return fE;
    }

    public static final int b(om.g rotationOptions, om.f resizeOptions, k encodedImage, int maxBitmapDimension) {
        s.k(rotationOptions, "rotationOptions");
        s.k(encodedImage, "encodedImage");
        if (!k.s0(encodedImage)) {
            return 1;
        }
        float fA = a(rotationOptions, resizeOptions, encodedImage);
        int iF = encodedImage.I() == gm.b.JPEG ? f(fA) : e(fA);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f11 = resizeOptions != null ? resizeOptions.maxBitmapDimension : maxBitmapDimension;
        while (iMax / iF > f11) {
            iF = encodedImage.I() == gm.b.JPEG ? iF * 2 : iF + 1;
        }
        return iF;
    }

    public static final int c(k encodedImage, int pixelSize, int maxBitmapSizeInBytes) {
        s.k(encodedImage, "encodedImage");
        int iB0 = encodedImage.b0();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * pixelSize) / iB0) / iB0 > maxBitmapSizeInBytes) {
            iB0 *= 2;
        }
        return iB0;
    }

    private final int d(om.g rotationOptions, k encodedImage) {
        if (!rotationOptions.j()) {
            return 0;
        }
        int iU2 = encodedImage.U2();
        if (iU2 == 0 || iU2 == 90 || iU2 == 180 || iU2 == 270) {
            return iU2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final int e(float ratio) {
        if (ratio > 0.6666667f) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            double d11 = i11;
            if ((1.0d / d11) + ((1.0d / (Math.pow(d11, 2.0d) - d11)) * ((double) 0.33333334f)) <= ratio) {
                return i11 - 1;
            }
            i11++;
        }
    }

    public static final int f(float ratio) {
        if (ratio > 0.6666667f) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            int i12 = i11 * 2;
            double d11 = 1.0d / ((double) i12);
            if (d11 + (((double) 0.33333334f) * d11) <= ratio) {
                return i11;
            }
            i11 = i12;
        }
    }
}
