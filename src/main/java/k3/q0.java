package k3;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u0017*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001d\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\r\u001a\u0017\u0010\u001e\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a\u001f\u0010\u001f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a\u0017\u0010!\u001a\u00020 *\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b!\u0010\"\u001a\"\u0010#\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010\r\u001a\u0017\u0010%\u001a\u00020$*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b%\u0010\"\u001a\"\u0010&\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020$H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010\r\u001a\u0017\u0010'\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b'\u0010\u0014\u001a\u001f\u0010(\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b(\u0010\u0016\u001a\u0017\u0010*\u001a\u00020)*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b*\u0010\"\u001a\"\u0010+\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020)H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010\r\u001a'\u0010.\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\u000f\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0000¢\u0006\u0004\b.\u0010/\u001a!\u00101\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102*\n\u00103\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Lk3/r3;", "a", "()Lk3/r3;", "Landroid/graphics/Paint;", "b", "(Landroid/graphics/Paint;)Lk3/r3;", "j", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "Lk3/b1;", "mode", "Ljn0/h0;", "l", "(Landroid/graphics/Paint;I)V", "Lk3/q1;", "value", "n", "(Landroid/graphics/Paint;Lk3/q1;)V", "", "c", "(Landroid/graphics/Paint;)F", "k", "(Landroid/graphics/Paint;F)V", "Lk3/p1;", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Paint;)J", "m", "(Landroid/graphics/Paint;J)V", "Lk3/s3;", "v", IntegerTokenConverter.CONVERTER_KEY, "u", "Lk3/i4;", "f", "(Landroid/graphics/Paint;)I", "r", "Lk3/j4;", "g", "s", "h", "t", "Lk3/d3;", "e", "o", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "q", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Lk3/u3;", "p", "(Landroid/graphics/Paint;Lk3/u3;)V", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f84867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f84868c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f84866a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f84867b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f84868c = iArr3;
        }
    }

    public static final r3 a() {
        return new p0();
    }

    public static final r3 b(Paint paint) {
        return new p0(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return r1.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? d3.INSTANCE.b() : d3.INSTANCE.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i11 = strokeCap == null ? -1 : a.f84867b[strokeCap.ordinal()];
        if (i11 == 1) {
            return i4.INSTANCE.a();
        }
        if (i11 != 2) {
            return i11 != 3 ? i4.INSTANCE.a() : i4.INSTANCE.c();
        }
        return i4.INSTANCE.b();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i11 = strokeJoin == null ? -1 : a.f84868c[strokeJoin.ordinal()];
        if (i11 == 1) {
            return j4.INSTANCE.b();
        }
        if (i11 != 2) {
            return i11 != 3 ? j4.INSTANCE.b() : j4.INSTANCE.c();
        }
        return j4.INSTANCE.a();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f11) {
        paint.setAlpha((int) Math.rint(f11 * 255.0f));
    }

    public static final void l(Paint paint, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            p4.f84865a.a(paint, i11);
        } else {
            paint.setXfermode(new PorterDuffXfermode(d0.c(i11)));
        }
    }

    public static final void m(Paint paint, long j11) {
        paint.setColor(r1.k(j11));
    }

    public static final void n(Paint paint, q1 q1Var) {
        paint.setColorFilter(q1Var != null ? g0.b(q1Var) : null);
    }

    public static final void o(Paint paint, int i11) {
        paint.setFilterBitmap(!d3.d(i11, d3.INSTANCE.b()));
    }

    public static final void p(Paint paint, u3 u3Var) {
        s0 s0Var = (s0) u3Var;
        paint.setPathEffect(s0Var != null ? s0Var.getNativePathEffect() : null);
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i11) {
        Paint.Cap cap;
        i4.Companion companion = i4.INSTANCE;
        if (i4.e(i11, companion.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (i4.e(i11, companion.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i4.e(i11, companion.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void s(Paint paint, int i11) {
        Paint.Join join;
        j4.Companion companion = j4.INSTANCE;
        if (j4.e(i11, companion.b())) {
            join = Paint.Join.MITER;
        } else if (j4.e(i11, companion.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = j4.e(i11, companion.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void t(Paint paint, float f11) {
        paint.setStrokeMiter(f11);
    }

    public static final void u(Paint paint, float f11) {
        paint.setStrokeWidth(f11);
    }

    public static final void v(Paint paint, int i11) {
        paint.setStyle(s3.d(i11, s3.INSTANCE.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
