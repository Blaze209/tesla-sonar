package yc;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Looper;
import android.widget.ImageView;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ec.BitmapImage;
import ec.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\f\u0010\u0019\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0018\u0010#\u001a\u00020\u0000*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0018\u0010&\u001a\u00020\u001c*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0018\u0010'\u001a\u00020\u001c*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010%\"\u0018\u0010,\u001a\u00020)*\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"", IntegerTokenConverter.CONVERTER_KEY, "()Z", "Lec/g0;", "uri", "h", "(Lec/g0;)Z", "Lec/n;", "Ljn0/h0;", "k", "(Lec/n;)V", "Landroid/graphics/ColorSpace;", "a", "Landroid/graphics/ColorSpace;", "c", "()Landroid/graphics/ColorSpace;", "NULL_COLOR_SPACE", "", "Landroid/graphics/Bitmap$Config;", "b", "[Landroid/graphics/Bitmap$Config;", "f", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Landroid/content/res/Configuration;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/res/Configuration;)I", "nightMode", "Landroid/graphics/drawable/Drawable;", "j", "(Landroid/graphics/drawable/Drawable;)Z", "isVector", "g", "(Landroid/graphics/drawable/Drawable;)I", Snapshot.WIDTH, Snapshot.HEIGHT, "Landroid/widget/ImageView;", "Lsc/f;", "e", "(Landroid/widget/ImageView;)Lsc/f;", "scale", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ColorSpace f125343a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config[] f125344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Bitmap.Config f125345c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f125347b;

        static {
            int[] iArr = new int[t.a.values().length];
            try {
                iArr[t.a.Verbose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.a.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.a.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.a.Warn.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.a.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f125346a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f125347b = iArr2;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f125344b = i11 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f125345c = i11 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final Bitmap.Config a() {
        return f125345c;
    }

    public static final int b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final ColorSpace c() {
        return f125343a;
    }

    public static final int d(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final sc.f e(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i11 = scaleType == null ? -1 : a.f125347b[scaleType.ordinal()];
        return (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? sc.f.FIT : sc.f.FILL;
    }

    public static final Bitmap.Config[] f() {
        return f125344b;
    }

    public static final int g(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean h(ec.g0 g0Var) {
        return p013kotlin.jvm.internal.s.f(g0Var.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String(), Action.FILE_ATTRIBUTE) && p013kotlin.jvm.internal.s.f(p013kotlin.collections.v.q0(h0.f(g0Var)), "android_asset");
    }

    public static final boolean i() {
        return p013kotlin.jvm.internal.s.f(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean j(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.g);
    }

    public static final void k(ec.n nVar) {
        if (nVar instanceof BitmapImage) {
            ((BitmapImage) nVar).getBitmap().prepareToDraw();
        }
    }
}
