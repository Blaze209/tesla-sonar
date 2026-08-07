package ml;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ll.g;
import ll.j;
import ll.k;
import ll.l;
import ll.m;
import ll.o;
import ll.p;
import ll.s;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Drawable f92327a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            k kVar = new k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), eVar.i());
            b(kVar, eVar);
            return kVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            o oVar = new o((NinePatchDrawable) drawable);
            b(oVar, eVar);
            return oVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            qk.a.K("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        l lVarA = l.a((ColorDrawable) drawable);
        b(lVarA, eVar);
        return lVarA;
    }

    static void b(j jVar, e eVar) {
        jVar.d(eVar.j());
        jVar.t(eVar.d());
        jVar.b(eVar.b(), eVar.c());
        jVar.f(eVar.g());
        jVar.q(eVar.l());
        jVar.j(eVar.h());
        jVar.h(eVar.i());
    }

    static ll.c c(ll.c cVar) {
        while (true) {
            Object objA = cVar.a();
            if (objA == cVar || !(objA instanceof ll.c)) {
                break;
            }
            cVar = (ll.c) objA;
        }
        return cVar;
    }

    static Drawable d(Drawable drawable, e eVar, Resources resources) {
        try {
            if (bn.b.d()) {
                bn.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && eVar != null && eVar.k() == e.a.BITMAP_ONLY) {
                if (!(drawable instanceof g)) {
                    return a(drawable, eVar, resources);
                }
                ll.c cVarC = c((g) drawable);
                cVarC.o(a(cVarC.o(f92327a), eVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            if (bn.b.d()) {
                bn.b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, e eVar) {
        try {
            if (bn.b.d()) {
                bn.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && eVar != null && eVar.k() == e.a.OVERLAY_COLOR) {
                m mVar = new m(drawable);
                b(mVar, eVar);
                mVar.z(eVar.f());
                return mVar;
            }
            return drawable;
        } finally {
            if (bn.b.d()) {
                bn.b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, s sVar) {
        return g(drawable, sVar, null);
    }

    static Drawable g(Drawable drawable, s sVar, PointF pointF) {
        if (bn.b.d()) {
            bn.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || sVar == null) {
            if (bn.b.d()) {
                bn.b.b();
            }
            return drawable;
        }
        p pVar = new p(drawable, sVar);
        if (pointF != null) {
            pVar.C(pointF);
        }
        if (bn.b.d()) {
            bn.b.b();
        }
        return pVar;
    }

    static void h(j jVar) {
        jVar.d(false);
        jVar.g(BitmapDescriptorFactory.HUE_RED);
        jVar.b(0, BitmapDescriptorFactory.HUE_RED);
        jVar.f(BitmapDescriptorFactory.HUE_RED);
        jVar.q(false);
        jVar.j(false);
        jVar.h(k.n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void i(ll.c cVar, e eVar, Resources resources) {
        ll.c cVarC = c(cVar);
        Drawable drawableA = cVarC.a();
        if (eVar == null || eVar.k() != e.a.BITMAP_ONLY) {
            if (drawableA instanceof j) {
                h((j) drawableA);
            }
        } else if (drawableA instanceof j) {
            b((j) drawableA, eVar);
        } else if (drawableA != 0) {
            cVarC.o(f92327a);
            cVarC.o(a(drawableA, eVar, resources));
        }
    }

    static void j(ll.c cVar, e eVar) {
        Drawable drawableA = cVar.a();
        if (eVar == null || eVar.k() != e.a.OVERLAY_COLOR) {
            if (drawableA instanceof m) {
                Drawable drawable = f92327a;
                cVar.o(((m) drawableA).w(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawableA instanceof m)) {
            cVar.o(e(cVar.o(f92327a), eVar));
            return;
        }
        m mVar = (m) drawableA;
        b(mVar, eVar);
        mVar.z(eVar.f());
    }

    static p k(ll.c cVar, s sVar) {
        Drawable drawableF = f(cVar.o(f92327a), sVar);
        cVar.o(drawableF);
        pk.k.h(drawableF, "Parent has no child drawable!");
        return (p) drawableF;
    }
}
