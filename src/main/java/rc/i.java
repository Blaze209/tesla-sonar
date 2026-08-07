package rc;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;
import androidx.p003lifecycle.Lifecycle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ec.Extras;
import k3.w2;
import p013kotlin.Metadata;
import vc.ImageViewTarget;
import yc.g0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015\"\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015\"\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015\"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0015\"\u0015\u0010)\u001a\u00020\f*\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0015\u0010+\u001a\u00020\u0017*\u00020&8F¢\u0006\u0006\u001a\u0004\b$\u0010*\"\u0015\u0010+\u001a\u00020\u0017*\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014*\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0017\u00104\u001a\u0004\u0018\u00010\u0019*\u00020,8G¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0015\u00107\u001a\u00020\u001c*\u00020,8F¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0017\u0010:\u001a\u0004\u0018\u00010\u001f*\u00020&8F¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0015\u0010<\u001a\u00020\u001c*\u00020&8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010;\"\u0015\u0010=\u001a\u00020\u001c*\u00020&8F¢\u0006\u0006\u001a\u0004\b \u0010;\"\u0015\u0010=\u001a\u00020\u001c*\u00020,8F¢\u0006\u0006\u001a\u0004\b\"\u00106\"\u001b\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014*\u00020/8F¢\u0006\u0006\u001a\u0004\b\u001d\u00101¨\u0006>"}, d2 = {"Lrc/g$a;", "Landroid/widget/ImageView;", "imageView", "o", "(Lrc/g$a;Landroid/widget/ImageView;)Lrc/g$a;", "", "durationMillis", "b", "(Lrc/g$a;I)Lrc/g$a;", "Lec/r$a;", "a", "(Lec/r$a;I)Lec/r$a;", "Lxc/d$a;", "n", "(I)Lxc/d$a;", "factory", "q", "(Lrc/g$a;Lxc/d$a;)Lrc/g$a;", "p", "(Lec/r$a;Lxc/d$a;)Lec/r$a;", "Lec/l$c;", "Lec/l$c;", "transitionFactoryKey", "Landroid/graphics/Bitmap$Config;", "bitmapConfigKey", "Landroid/graphics/ColorSpace;", "c", "colorSpaceKey", "", DateTokenConverter.CONVERTER_KEY, "premultipliedAlphaKey", "Landroidx/lifecycle/Lifecycle;", "e", "lifecycleKey", "f", "allowHardwareKey", "g", "allowRgb565Key", "Lrc/g;", "m", "(Lrc/g;)Lxc/d$a;", "transitionFactory", "(Lrc/g;)Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lrc/n;", "h", "(Lrc/n;)Landroid/graphics/Bitmap$Config;", "Lec/l$c$a;", IntegerTokenConverter.CONVERTER_KEY, "(Lec/l$c$a;)Lec/l$c;", "j", "(Lrc/n;)Landroid/graphics/ColorSpace;", "colorSpace", "l", "(Lrc/n;)Z", "premultipliedAlpha", "k", "(Lrc/g;)Landroidx/lifecycle/Lifecycle;", "lifecycle", "(Lrc/g;)Z", "allowHardware", "allowRgb565", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Extras.c<xc.d.a> f107599a = new Extras.c<>(xc.d.a.f123221b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<Bitmap.Config> f107600b = new Extras.c<>(g0.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Extras.c<ColorSpace> f107601c = new Extras.c<>(g0.c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Extras.c<Boolean> f107602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Extras.c<Lifecycle> f107603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Extras.c<Boolean> f107604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Extras.c<Boolean> f107605g;

    static {
        Boolean bool = Boolean.TRUE;
        f107602d = new Extras.c<>(bool);
        f107603e = new Extras.c<>(null);
        f107604f = new Extras.c<>(bool);
        f107605g = new Extras.c<>(Boolean.FALSE);
    }

    public static final ec.r.a a(ec.r.a aVar, int i11) {
        return p(aVar, n(i11));
    }

    public static final ImageRequest.a b(ImageRequest.a aVar, int i11) {
        return q(aVar, n(i11));
    }

    public static final boolean c(ImageRequest imageRequest) {
        return ((Boolean) ec.m.a(imageRequest, f107604f)).booleanValue();
    }

    public static final Extras.c<Boolean> d(Extras.c.Companion companion) {
        return f107605g;
    }

    public static final boolean e(ImageRequest imageRequest) {
        return ((Boolean) ec.m.a(imageRequest, f107605g)).booleanValue();
    }

    public static final boolean f(Options options) {
        return ((Boolean) ec.m.b(options, f107605g)).booleanValue();
    }

    public static final Bitmap.Config g(ImageRequest imageRequest) {
        return (Bitmap.Config) ec.m.a(imageRequest, f107600b);
    }

    public static final Bitmap.Config h(Options options) {
        return (Bitmap.Config) ec.m.b(options, f107600b);
    }

    public static final Extras.c<Bitmap.Config> i(Extras.c.Companion companion) {
        return f107600b;
    }

    public static final ColorSpace j(Options options) {
        return w2.a(ec.m.b(options, f107601c));
    }

    public static final Lifecycle k(ImageRequest imageRequest) {
        return (Lifecycle) ec.m.a(imageRequest, f107603e);
    }

    public static final boolean l(Options options) {
        return ((Boolean) ec.m.b(options, f107602d)).booleanValue();
    }

    public static final xc.d.a m(ImageRequest imageRequest) {
        return (xc.d.a) ec.m.a(imageRequest, f107599a);
    }

    private static final xc.d.a n(int i11) {
        if (i11 <= 0) {
            return xc.d.a.f123221b;
        }
        return new xc.b.a(i11, false, 2, null);
    }

    public static final ImageRequest.a o(ImageRequest.a aVar, ImageView imageView) {
        return aVar.p(new ImageViewTarget(imageView));
    }

    public static final ec.r.a p(ec.r.a aVar, xc.d.a aVar2) {
        aVar.getExtras().b(f107599a, aVar2);
        return aVar;
    }

    public static final ImageRequest.a q(ImageRequest.a aVar, xc.d.a aVar2) {
        aVar.f().b(f107599a, aVar2);
        return aVar;
    }
}
