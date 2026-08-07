package q1;

import android.view.View;
import android.widget.Magnifier;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lq1/s0;", "Lq1/q0;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Lw4/k;", "size", "Lw4/h;", "cornerRadius", "elevation", "clippingEnabled", "Lw4/d;", "density", "", "initialZoom", "Lq1/s0$a;", "c", "(Landroid/view/View;ZJFFZLw4/d;F)Lq1/s0$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s0 implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f104325b = new s0();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = true;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Lq1/s0$a;", "Lq1/r0$a;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "Lj3/g;", "sourceCenter", "magnifierCenter", "", "zoom", "Ljn0/h0;", "f", "(JJF)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends r0.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // q1.r0.a, q1.p0
        public void f(long sourceCenter, long magnifierCenter, float zoom) {
            if (!Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if (j3.h.c(magnifierCenter)) {
                getMagnifier().show(j3.g.m(sourceCenter), j3.g.n(sourceCenter), j3.g.m(magnifierCenter), j3.g.n(magnifierCenter));
            } else {
                getMagnifier().show(j3.g.m(sourceCenter), j3.g.n(sourceCenter));
            }
        }
    }

    private s0() {
    }

    @Override // q1.q0
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // q1.q0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, w4.d density, float initialZoom) {
        if (useTextDefault) {
            return new a(new Magnifier(view));
        }
        long jC = density.C(size);
        float fO1 = density.O1(cornerRadius);
        float fO2 = density.O1(elevation);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jC != 9205357640488583168L) {
            builder.setSize(yn0.a.d(j3.m.k(jC)), yn0.a.d(j3.m.i(jC)));
        }
        if (!Float.isNaN(fO1)) {
            builder.setCornerRadius(fO1);
        }
        if (!Float.isNaN(fO2)) {
            builder.setElevation(fO2);
        }
        if (!Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(clippingEnabled);
        return new a(builder.build());
    }
}
