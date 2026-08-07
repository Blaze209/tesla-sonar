package ju;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.renderscript.Range2d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "function", "Landroid/graphics/Bitmap;", "inputBitmap", "", "alphaAllowed", "Ljn0/h0;", "b", "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "a", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "tag", "bitmap", "Lcom/google/android/renderscript/Range2d;", "restriction", "e", "(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V", "", "sizeX", "sizeY", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;IILcom/google/android/renderscript/Range2d;)V", "f", "(Landroid/graphics/Bitmap;)I", "renderscript-toolkit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ju.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C1788a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84338a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84338a = iArr;
        }
    }

    public static final Bitmap a(Bitmap inputBitmap) {
        s.k(inputBitmap, "inputBitmap");
        int width = inputBitmap.getWidth();
        int height = inputBitmap.getHeight();
        Bitmap.Config config = inputBitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static final void b(String function, Bitmap inputBitmap, boolean z11) {
        s.k(function, "function");
        s.k(inputBitmap, "inputBitmap");
        if (z11) {
            if (inputBitmap.getConfig() != Bitmap.Config.ARGB_8888 && inputBitmap.getConfig() != Bitmap.Config.ALPHA_8) {
                throw new IllegalArgumentException(("RenderScript Toolkit. " + function + " supports only ARGB_8888 and ALPHA_8 bitmaps. " + inputBitmap.getConfig() + " provided.").toString());
            }
        } else if (inputBitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException(("RenderScript Toolkit. " + function + " supports only ARGB_8888. " + inputBitmap.getConfig() + " provided.").toString());
        }
        if (inputBitmap.getWidth() * f(inputBitmap) == inputBitmap.getRowBytes()) {
            return;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit " + function + ". Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=" + inputBitmap.getRowBytes() + ", width={" + inputBitmap.getWidth() + ", and vectorSize=" + f(inputBitmap) + ".").toString());
    }

    public static /* synthetic */ void c(String str, Bitmap bitmap, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        b(str, bitmap, z11);
    }

    public static final void d(String tag, int i11, int i12, Range2d range2d) {
        s.k(tag, "tag");
        if (range2d == null) {
            return;
        }
        if (range2d.getStartX() >= i11 || range2d.getEndX() > i11) {
            throw new IllegalArgumentException(("RenderScript Toolkit " + tag + ". sizeX should be greater than restriction.startX and greater or equal to restriction.endX. " + i11 + ", " + range2d.getStartX() + ", and " + range2d.getEndX() + " were provided respectively.").toString());
        }
        if (range2d.getStartY() >= i12 || range2d.getEndY() > i12) {
            throw new IllegalArgumentException(("RenderScript Toolkit " + tag + ". sizeY should be greater than restriction.startY and greater or equal to restriction.endY. " + i12 + ", " + range2d.getStartY() + ", and " + range2d.getEndY() + " were provided respectively.").toString());
        }
        if (range2d.getStartX() >= range2d.getEndX()) {
            throw new IllegalArgumentException(("RenderScript Toolkit " + tag + ". Restriction startX should be less than endX. " + range2d.getStartX() + " and " + range2d.getEndX() + " were provided respectively.").toString());
        }
        if (range2d.getStartY() < range2d.getEndY()) {
            return;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit " + tag + ". Restriction startY should be less than endY. " + range2d.getStartY() + " and " + range2d.getEndY() + " were provided respectively.").toString());
    }

    public static final void e(String tag, Bitmap bitmap, Range2d range2d) {
        s.k(tag, "tag");
        s.k(bitmap, "bitmap");
        d(tag, bitmap.getWidth(), bitmap.getHeight(), range2d);
    }

    public static final int f(Bitmap bitmap) {
        s.k(bitmap, "bitmap");
        Bitmap.Config config = bitmap.getConfig();
        int i11 = config == null ? -1 : C1788a.f84338a[config.ordinal()];
        if (i11 == 1) {
            return 4;
        }
        if (i11 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }
}
