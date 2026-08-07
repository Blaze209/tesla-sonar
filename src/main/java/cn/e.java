package cn;

import android.graphics.Matrix;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ1\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u001a\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,¨\u0006."}, d2 = {"Lcn/e;", "", "<init>", "()V", "", "degrees", "", "j", "(I)Z", "exifOrientation", IntegerTokenConverter.CONVERTER_KEY, "Lom/g;", "rotationOptions", "Lom/f;", "resizeOptions", "Lum/k;", "encodedImage", "resizingEnabled", "f", "(Lom/g;Lom/f;Lum/k;Z)I", "e", "(Lom/g;Lum/k;)I", DateTokenConverter.CONVERTER_KEY, Snapshot.WIDTH, Snapshot.HEIGHT, "", "b", "(Lom/f;II)F", "maxRatio", "roundUpFraction", "k", "(FF)I", "downsampleRatio", "a", "(I)I", "Landroid/graphics/Matrix;", "g", "(Lum/k;Lom/g;)Landroid/graphics/Matrix;", "orientation", "h", "(I)Landroid/graphics/Matrix;", "c", "(Lum/k;)I", "Lpk/f;", "Lpk/f;", "INVERTED_EXIF_ORIENTATIONS", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f19431a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final pk.f<Integer> INVERTED_EXIF_ORIENTATIONS;

    static {
        pk.f<Integer> fVarB = pk.f.b(2, 7, 4, 5);
        s.j(fVarB, "of(...)");
        INVERTED_EXIF_ORIENTATIONS = fVarB;
    }

    private e() {
    }

    public static final int a(int downsampleRatio) {
        return Math.max(1, 8 / downsampleRatio);
    }

    public static final float b(om.f resizeOptions, int width, int height) {
        if (resizeOptions == null) {
            return 1.0f;
        }
        float f11 = width;
        float f12 = height;
        float fMax = Math.max(resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String / f11, resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String / f12);
        float f13 = f11 * fMax;
        float f14 = resizeOptions.maxBitmapDimension;
        if (f13 > f14) {
            fMax = f14 / f11;
        }
        return f12 * fMax > f14 ? f14 / f12 : fMax;
    }

    private final int c(k encodedImage) {
        int iU2 = encodedImage.U2();
        if (iU2 == 90 || iU2 == 180 || iU2 == 270) {
            return encodedImage.U2();
        }
        return 0;
    }

    public static final int d(om.g rotationOptions, k encodedImage) {
        s.k(rotationOptions, "rotationOptions");
        s.k(encodedImage, "encodedImage");
        int iL0 = encodedImage.L0();
        pk.f<Integer> fVar = INVERTED_EXIF_ORIENTATIONS;
        int iIndexOf = fVar.indexOf(Integer.valueOf(iL0));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        Integer num = fVar.get((iIndexOf + ((!rotationOptions.j() ? rotationOptions.h() : 0) / 90)) % fVar.size());
        s.j(num, "get(...)");
        return num.intValue();
    }

    public static final int e(om.g rotationOptions, k encodedImage) {
        s.k(rotationOptions, "rotationOptions");
        s.k(encodedImage, "encodedImage");
        if (!rotationOptions.i()) {
            return 0;
        }
        int iC = f19431a.c(encodedImage);
        return rotationOptions.j() ? iC : (iC + rotationOptions.h()) % 360;
    }

    public static final int f(om.g rotationOptions, om.f resizeOptions, k encodedImage, boolean resizingEnabled) {
        s.k(rotationOptions, "rotationOptions");
        s.k(encodedImage, "encodedImage");
        if (!resizingEnabled || resizeOptions == null) {
            return 8;
        }
        int iE = e(rotationOptions, encodedImage);
        int iD = INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.L0())) ? d(rotationOptions, encodedImage) : 0;
        boolean z11 = iE == 90 || iE == 270 || iD == 5 || iD == 7;
        int iK = k(b(resizeOptions, z11 ? encodedImage.getHeight() : encodedImage.getWidth(), z11 ? encodedImage.getWidth() : encodedImage.getHeight()), resizeOptions.roundUpFraction);
        if (iK > 8) {
            return 8;
        }
        if (iK < 1) {
            return 1;
        }
        return iK;
    }

    public static final Matrix g(k encodedImage, om.g rotationOptions) {
        s.k(encodedImage, "encodedImage");
        s.k(rotationOptions, "rotationOptions");
        if (INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.L0()))) {
            return f19431a.h(d(rotationOptions, encodedImage));
        }
        int iE = e(rotationOptions, encodedImage);
        if (iE == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iE);
        return matrix;
    }

    private final Matrix h(int orientation) {
        Matrix matrix = new Matrix();
        if (orientation == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }

    public static final boolean i(int exifOrientation) {
        switch (exifOrientation) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int degrees) {
        return degrees >= 0 && degrees <= 270 && degrees % 90 == 0;
    }

    public static final int k(float maxRatio, float roundUpFraction) {
        return (int) (roundUpFraction + (maxRatio * 8));
    }
}
