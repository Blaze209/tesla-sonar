package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import android.util.SizeF;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f39289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f39291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f39292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f39293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f39294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f39295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f39296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f39297i = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f39298j;

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f39300b;

        private b() {
        }

        public String toString() {
            return "GridSize{rows=" + this.f39299a + ", cols=" + this.f39300b + CoreConstants.CURLY_RIGHT;
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f39303b;

        private c() {
        }

        public String toString() {
            return "Holder{row=" + this.f39302a + ", col=" + this.f39303b + CoreConstants.CURLY_RIGHT;
        }
    }

    private class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39305a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f39306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f39307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f39308d;

        d() {
            this.f39306b = new b();
            this.f39307c = new c();
            this.f39308d = new c();
        }

        public String toString() {
            return "RenderRange{page=" + this.f39305a + ", gridSize=" + this.f39306b + ", leftTop=" + this.f39307c + ", rightBottom=" + this.f39308d + CoreConstants.CURLY_RIGHT;
        }
    }

    f(e eVar) {
        this.f39289a = eVar;
        this.f39298j = dq.f.a(eVar.getContext(), dq.a.f60816d);
    }

    private void a(b bVar) {
        float f11 = 1.0f / bVar.f39300b;
        this.f39293e = f11;
        float f12 = 1.0f / bVar.f39299a;
        this.f39294f = f12;
        float f13 = dq.a.f60815c;
        this.f39295g = f13 / f11;
        this.f39296h = f13 / f12;
    }

    private void b(b bVar, int i11) {
        SizeF sizeFN = this.f39289a.f39243h.n(i11);
        float width = 1.0f / sizeFN.getWidth();
        float height = (dq.a.f60815c * (1.0f / sizeFN.getHeight())) / this.f39289a.getZoom();
        float zoom = (dq.a.f60815c * width) / this.f39289a.getZoom();
        bVar.f39299a = dq.c.a(1.0f / height);
        bVar.f39300b = dq.c.a(1.0f / zoom);
    }

    private List<d> c(float f11, float f12, float f13, float f14) {
        float fM;
        float width;
        float height;
        float f15;
        boolean z11;
        float width2;
        float height2;
        float f16 = -dq.c.d(f11, BitmapDescriptorFactory.HUE_RED);
        float f17 = -dq.c.d(f12, BitmapDescriptorFactory.HUE_RED);
        float f18 = -dq.c.d(f13, BitmapDescriptorFactory.HUE_RED);
        float f19 = -dq.c.d(f14, BitmapDescriptorFactory.HUE_RED);
        float f21 = this.f39289a.M() ? f17 : f16;
        float f22 = this.f39289a.M() ? f19 : f18;
        e eVar = this.f39289a;
        int iJ = eVar.f39243h.j(f21, eVar.getZoom());
        e eVar2 = this.f39289a;
        int iJ2 = eVar2.f39243h.j(f22, eVar2.getZoom());
        int i11 = 1;
        int i12 = (iJ2 - iJ) + 1;
        LinkedList linkedList = new LinkedList();
        int i13 = iJ;
        while (i13 <= iJ2) {
            d dVar = new d();
            dVar.f39305a = i13;
            if (i13 != iJ) {
                if (i13 == iJ2) {
                    e eVar3 = this.f39289a;
                    fM = eVar3.f39243h.m(i13, eVar3.getZoom());
                    if (this.f39289a.M()) {
                        f15 = fM;
                        fM = f16;
                    } else {
                        f15 = f17;
                    }
                    height = f19;
                    f17 = f15;
                } else {
                    e eVar4 = this.f39289a;
                    fM = eVar4.f39243h.m(i13, eVar4.getZoom());
                    e eVar5 = this.f39289a;
                    SizeF sizeFQ = eVar5.f39243h.q(i13, eVar5.getZoom());
                    if (this.f39289a.M()) {
                        f17 = fM;
                        height = sizeFQ.getHeight() + fM;
                        fM = f16;
                    } else {
                        width = sizeFQ.getWidth() + fM;
                        height = f19;
                    }
                }
                width = f18;
            } else if (i12 == i11) {
                fM = f16;
                width = f18;
                height = f19;
            } else {
                e eVar6 = this.f39289a;
                float fM2 = eVar6.f39243h.m(i13, eVar6.getZoom());
                e eVar7 = this.f39289a;
                SizeF sizeFQ2 = eVar7.f39243h.q(i13, eVar7.getZoom());
                if (this.f39289a.M()) {
                    height2 = fM2 + sizeFQ2.getHeight();
                    width2 = f18;
                } else {
                    width2 = fM2 + sizeFQ2.getWidth();
                    height2 = f19;
                }
                f17 = f17;
                height = height2;
                width = width2;
                fM = f16;
            }
            b(dVar.f39306b, dVar.f39305a);
            e eVar8 = this.f39289a;
            float f23 = f16;
            SizeF sizeFQ3 = eVar8.f39243h.q(dVar.f39305a, eVar8.getZoom());
            float height3 = sizeFQ3.getHeight() / dVar.f39306b.f39299a;
            float width3 = sizeFQ3.getWidth() / dVar.f39306b.f39300b;
            e eVar9 = this.f39289a;
            float fR = eVar9.f39243h.r(i13, eVar9.getZoom());
            if (this.f39289a.M()) {
                c cVar = dVar.f39307c;
                e eVar10 = this.f39289a;
                cVar.f39302a = dq.c.b(Math.abs(f17 - eVar10.f39243h.m(dVar.f39305a, eVar10.getZoom())) / height3);
                dVar.f39307c.f39303b = dq.c.b(dq.c.e(fM - fR, BitmapDescriptorFactory.HUE_RED) / width3);
                c cVar2 = dVar.f39308d;
                e eVar11 = this.f39289a;
                cVar2.f39302a = dq.c.a(Math.abs(height - eVar11.f39243h.m(dVar.f39305a, eVar11.getZoom())) / height3);
                dVar.f39308d.f39303b = dq.c.b(dq.c.e(width - fR, BitmapDescriptorFactory.HUE_RED) / width3);
                z11 = false;
            } else {
                c cVar3 = dVar.f39307c;
                e eVar12 = this.f39289a;
                cVar3.f39303b = dq.c.b(Math.abs(fM - eVar12.f39243h.m(dVar.f39305a, eVar12.getZoom())) / width3);
                dVar.f39307c.f39302a = dq.c.b(dq.c.e(f17 - fR, BitmapDescriptorFactory.HUE_RED) / height3);
                c cVar4 = dVar.f39308d;
                e eVar13 = this.f39289a;
                cVar4.f39303b = dq.c.b(Math.abs(width - eVar13.f39243h.m(dVar.f39305a, eVar13.getZoom())) / width3);
                z11 = false;
                dVar.f39308d.f39302a = dq.c.b(dq.c.e(height - fR, BitmapDescriptorFactory.HUE_RED) / height3);
            }
            linkedList.add(dVar);
            i13++;
            f16 = f23;
            f17 = f17;
            i11 = 1;
        }
        return linkedList;
    }

    private boolean d(int i11, int i12, int i13, float f11, float f12) {
        float f13 = i13 * f11;
        float f14 = i12 * f12;
        float f15 = this.f39295g;
        float f16 = this.f39296h;
        float f17 = f13 + f11 > 1.0f ? 1.0f - f13 : f11;
        float f18 = f14 + f12 > 1.0f ? 1.0f - f14 : f12;
        float f19 = f15 * f17;
        float f21 = f16 * f18;
        RectF rectF = new RectF(f13, f14, f17 + f13, f18 + f14);
        if (f19 <= BitmapDescriptorFactory.HUE_RED || f21 <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        if (!this.f39289a.f39240e.k(i11, rectF, this.f39290b)) {
            e eVar = this.f39289a;
            eVar.f39252q.b(i11, f19, f21, rectF, false, this.f39290b, eVar.E(), this.f39289a.C());
        }
        this.f39290b++;
        return true;
    }

    private int e(int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = 0;
        for (int i18 = i12; i18 <= i13; i18++) {
            int i19 = i14;
            while (i19 <= i15) {
                int i21 = i11;
                if (d(i21, i18, i19, this.f39293e, this.f39294f)) {
                    i17++;
                }
                if (i17 >= i16) {
                    return i17;
                }
                i19++;
                i11 = i21;
            }
        }
        return i17;
    }

    private void g(int i11) {
        SizeF sizeFN = this.f39289a.f39243h.n(i11);
        float width = sizeFN.getWidth() * dq.a.f60814b;
        float height = sizeFN.getHeight() * dq.a.f60814b;
        if (this.f39289a.f39240e.d(i11, this.f39297i)) {
            return;
        }
        e eVar = this.f39289a;
        eVar.f39252q.b(i11, width, height, this.f39297i, true, 0, eVar.E(), this.f39289a.C());
    }

    private void h() {
        float f11 = this.f39298j;
        float f12 = this.f39291c;
        float f13 = (-f12) + f11;
        float width = ((-f12) - this.f39289a.getWidth()) - f11;
        float f14 = this.f39292d;
        List<d> listC = c(f13, (-f14) + f11, width, ((-f14) - this.f39289a.getHeight()) - f11);
        Iterator<d> it = listC.iterator();
        while (it.hasNext()) {
            g(it.next().f39305a);
        }
        int iE = 0;
        for (d dVar : listC) {
            a(dVar.f39306b);
            int i11 = dVar.f39305a;
            c cVar = dVar.f39307c;
            int i12 = cVar.f39302a;
            c cVar2 = dVar.f39308d;
            iE += e(i11, i12, cVar2.f39302a, cVar.f39303b, cVar2.f39303b, dq.a.C1240a.f60817a - iE);
            if (iE >= dq.a.C1240a.f60817a) {
                return;
            }
        }
    }

    void f() {
        this.f39290b = 1;
        this.f39291c = -dq.c.d(this.f39289a.getCurrentXOffset(), BitmapDescriptorFactory.HUE_RED);
        this.f39292d = -dq.c.d(this.f39289a.getCurrentYOffset(), BitmapDescriptorFactory.HUE_RED);
        h();
    }
}
