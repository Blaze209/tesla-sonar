package pl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import ll.h0;
import ll.i0;
import ol.b;
import pk.i;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class b<DH extends ol.b> implements i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DH f103172d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f103169a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103170b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f103171c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ol.a f103173e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hl.c f103174f = hl.c.a();

    public b(DH dh2) {
        if (dh2 != null) {
            p(dh2);
        }
    }

    private void a() {
        if (this.f103169a) {
            return;
        }
        this.f103174f.b(hl.c.a.ON_ATTACH_CONTROLLER);
        this.f103169a = true;
        ol.a aVar = this.f103173e;
        if (aVar == null || aVar.f() == null) {
            return;
        }
        this.f103173e.b();
    }

    private void b() {
        if (this.f103170b && this.f103171c) {
            a();
        } else {
            d();
        }
    }

    public static <DH extends ol.b> b<DH> c(DH dh2, Context context) {
        b<DH> bVar = new b<>(dh2);
        bVar.l(context);
        return bVar;
    }

    private void d() {
        if (this.f103169a) {
            this.f103174f.b(hl.c.a.ON_DETACH_CONTROLLER);
            this.f103169a = false;
            if (h()) {
                this.f103173e.d();
            }
        }
    }

    private void q(i0 i0Var) {
        Object objG = g();
        if (objG instanceof h0) {
            ((h0) objG).s(i0Var);
        }
    }

    public ol.a e() {
        return this.f103173e;
    }

    public DH f() {
        return (DH) k.g(this.f103172d);
    }

    public Drawable g() {
        DH dh2 = this.f103172d;
        if (dh2 == null) {
            return null;
        }
        return dh2.b();
    }

    public boolean h() {
        ol.a aVar = this.f103173e;
        return aVar != null && aVar.f() == this.f103172d;
    }

    public void i() {
        this.f103174f.b(hl.c.a.ON_HOLDER_ATTACH);
        this.f103170b = true;
        b();
    }

    public void j() {
        this.f103174f.b(hl.c.a.ON_HOLDER_DETACH);
        this.f103170b = false;
        b();
    }

    public boolean k(MotionEvent motionEvent) {
        if (h()) {
            return this.f103173e.c(motionEvent);
        }
        return false;
    }

    public void m() {
        n(null);
    }

    public void n(ol.a aVar) {
        boolean z11 = this.f103169a;
        if (z11) {
            d();
        }
        if (h()) {
            this.f103174f.b(hl.c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f103173e.e(null);
        }
        this.f103173e = aVar;
        if (aVar != null) {
            this.f103174f.b(hl.c.a.ON_SET_CONTROLLER);
            this.f103173e.e(this.f103172d);
        } else {
            this.f103174f.b(hl.c.a.ON_CLEAR_CONTROLLER);
        }
        if (z11) {
            a();
        }
    }

    @Override // ll.i0
    public void o(boolean z11) {
        if (this.f103171c == z11) {
            return;
        }
        this.f103174f.b(z11 ? hl.c.a.ON_DRAWABLE_SHOW : hl.c.a.ON_DRAWABLE_HIDE);
        this.f103171c = z11;
        b();
    }

    @Override // ll.i0
    public void onDraw() {
        if (this.f103169a) {
            return;
        }
        qk.a.G(hl.c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f103173e)), toString());
        this.f103170b = true;
        this.f103171c = true;
        b();
    }

    public void p(DH dh2) {
        this.f103174f.b(hl.c.a.ON_SET_HIERARCHY);
        boolean zH = h();
        q(null);
        DH dh3 = (DH) k.g(dh2);
        this.f103172d = dh3;
        Drawable drawableB = dh3.b();
        o(drawableB == null || drawableB.isVisible());
        q(this);
        if (zH) {
            this.f103173e.e(dh2);
        }
    }

    public String toString() {
        return i.b(this).c("controllerAttached", this.f103169a).c("holderAttached", this.f103170b).c("drawableVisible", this.f103171c).b("events", this.f103174f.toString()).toString();
    }

    public void l(Context context) {
    }
}
