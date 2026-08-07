package h0;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f70074a = new Rational(4, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rational f70075b = new Rational(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rational f70076c = new Rational(16, 9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rational f70077d = new Rational(9, 16);

    /* JADX INFO: renamed from: h0.a$a, reason: collision with other inner class name */
    public static final class C1445a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rational f70078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RectF f70079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rational f70080c;

        public C1445a(@NonNull Rational rational, Rational rational2) {
            this.f70078a = rational;
            this.f70080c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f70079b = f(rational);
        }

        private float b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        private float c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private RectF f(Rational rational) {
            if (rational.floatValue() == this.f70080c.floatValue()) {
                return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f70080c.getNumerator(), this.f70080c.getDenominator());
            }
            return rational.floatValue() > this.f70080c.floatValue() ? new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f70080c.getNumerator(), (rational.getDenominator() * this.f70080c.getNumerator()) / rational.getNumerator()) : new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (rational.getNumerator() * this.f70080c.getDenominator()) / rational.getDenominator(), this.f70080c.getDenominator());
        }

        private boolean h(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF rectFF = f(rational);
            RectF rectFF2 = f(rational2);
            boolean zH = h(rectFF, this.f70079b);
            boolean zH2 = h(rectFF2, this.f70079b);
            if (zH && zH2) {
                return (int) Math.signum(b(rectFF) - b(rectFF2));
            }
            if (zH) {
                return -1;
            }
            if (zH2) {
                return 1;
            }
            return -((int) Math.signum(c(rectFF, this.f70079b) - c(rectFF2, this.f70079b)));
        }
    }

    public static boolean a(@NonNull Size size, Rational rational) {
        return b(size, rational, o0.c.f95563c);
    }

    public static boolean b(@NonNull Size size, Rational rational, @NonNull Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (o0.c.c(size) >= o0.c.c(size2)) {
            return c(size, rational);
        }
        return false;
    }

    private static boolean c(@NonNull Size size, @NonNull Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i11 = width % 16;
        if (i11 == 0 && height % 16 == 0) {
            return d(Math.max(0, height + (-16)), width, rational) || d(Math.max(0, width + (-16)), height, rational2);
        }
        if (i11 == 0) {
            return d(height, width, rational);
        }
        if (height % 16 == 0) {
            return d(width, height, rational2);
        }
        return false;
    }

    private static boolean d(int i11, int i12, Rational rational) {
        u5.h.a(i12 % 16 == 0);
        double numerator = ((double) (i11 * rational.getNumerator())) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i12 + (-16))) && numerator < ((double) (i12 + 16));
    }
}
