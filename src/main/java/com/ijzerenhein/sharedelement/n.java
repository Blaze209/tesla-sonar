package com.ijzerenhein.sharedelement;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes6.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f45633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f45635c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45636d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f45637e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f45638f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45639g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f45640h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RectF f45641i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f45642j = false;

    n(g gVar, String str) {
        this.f45633a = gVar;
        this.f45634b = str;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[LOOP:0: B:10:0x0027->B:32:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x007d A[EDGE_INSN: B:38:0x007d->B:33:0x007d BREAK  A[LOOP:0: B:10:0x0027->B:32:0x0078], SYNTHETIC] */
    RectF a() {
        RectF rectF = this.f45641i;
        if (rectF != null) {
            return rectF;
        }
        if (this.f45638f == null) {
            return null;
        }
        View viewK = this.f45635c.k();
        RectF rectF2 = new RectF(this.f45638f.f45599a);
        RectF rectF3 = new RectF();
        for (ViewParent parent = i().getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getClipChildren()) {
                j.i(viewGroup, rectF3);
                if (!rectF2.intersect(rectF3)) {
                    float f11 = rectF2.bottom;
                    float f12 = rectF3.top;
                    if (f11 < f12) {
                        rectF2.top = f12;
                        rectF2.bottom = rectF3.top;
                    }
                    float f13 = rectF2.top;
                    float f14 = rectF3.bottom;
                    if (f13 > f14) {
                        rectF2.top = f14;
                        rectF2.bottom = f14;
                    }
                    float f15 = rectF2.right;
                    float f16 = rectF3.left;
                    if (f15 < f16) {
                        rectF2.left = f16;
                        rectF2.right = rectF3.left;
                    }
                    float f17 = rectF2.left;
                    float f18 = rectF3.right;
                    if (f17 <= f18) {
                        break;
                    }
                    rectF2.left = f18;
                    rectF2.right = f18;
                    break;
                }
                if (parent == viewK) {
                    break;
                }
            } else {
                if (parent == viewK) {
                    break;
                    break;
                }
            }
        }
        this.f45641i = rectF2;
        return rectF2;
    }

    c b() {
        return this.f45640h;
    }

    boolean c() {
        return this.f45642j;
    }

    String d() {
        return this.f45634b;
    }

    boolean e() {
        return this.f45639g;
    }

    boolean f() {
        return this.f45637e;
    }

    f g() {
        return this.f45635c;
    }

    j h() {
        return this.f45638f;
    }

    View i() {
        f fVar = this.f45635c;
        if (fVar != null) {
            return fVar.m();
        }
        return null;
    }

    void j(c cVar) {
        this.f45640h = cVar;
    }

    void k(boolean z11) {
        this.f45642j = z11;
    }

    void l(boolean z11) {
        if (this.f45636d == z11) {
            return;
        }
        this.f45636d = z11;
        f fVar = this.f45635c;
        if (fVar == null) {
            return;
        }
        if (z11) {
            fVar.g();
        } else {
            fVar.n();
        }
    }

    void m(boolean z11) {
        this.f45639g = z11;
    }

    void n(boolean z11) {
        this.f45637e = z11;
    }

    void o(f fVar) {
        f fVar2 = this.f45635c;
        if (fVar2 == fVar) {
            if (fVar != null) {
                this.f45633a.c(fVar);
                return;
            }
            return;
        }
        if (fVar2 != null) {
            if (this.f45636d) {
                fVar2.n();
            }
            this.f45633a.c(this.f45635c);
        }
        this.f45635c = fVar;
        this.f45637e = fVar != null;
        this.f45638f = null;
        this.f45639g = fVar != null;
        this.f45640h = null;
        if (fVar == null || !this.f45636d) {
            return;
        }
        fVar.g();
    }

    void p(j jVar) {
        this.f45638f = jVar;
    }
}
