package q1;

import android.view.View;
import android.widget.Magnifier;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lq1/r0;", "Lq1/q0;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Lw4/k;", "size", "Lw4/h;", "cornerRadius", "elevation", "clippingEnabled", "Lw4/d;", "density", "", "initialZoom", "Lq1/r0$a;", "c", "(Landroid/view/View;ZJFFZLw4/d;F)Lq1/r0$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r0 implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f104311b = new r0();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = false;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lq1/r0$a;", "Lq1/p0;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "Ljn0/h0;", "g", "()V", "Lj3/g;", "sourceCenter", "magnifierCenter", "", "zoom", "f", "(JJF)V", "dismiss", "a", "Landroid/widget/Magnifier;", "()Landroid/widget/Magnifier;", "Lw4/r;", "e", "()J", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Magnifier magnifier;

        public a(Magnifier magnifier) {
            this.magnifier = magnifier;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // q1.p0
        public void dismiss() {
            this.magnifier.dismiss();
        }

        @Override // q1.p0
        public long e() {
            return w4.s.a(this.magnifier.getWidth(), this.magnifier.getHeight());
        }

        @Override // q1.p0
        public void f(long sourceCenter, long magnifierCenter, float zoom) {
            this.magnifier.show(j3.g.m(sourceCenter), j3.g.n(sourceCenter));
        }

        @Override // q1.p0
        public void g() {
            this.magnifier.update();
        }
    }

    private r0() {
    }

    @Override // q1.q0
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // q1.q0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, w4.d density, float initialZoom) {
        return new a(new Magnifier(view));
    }
}
