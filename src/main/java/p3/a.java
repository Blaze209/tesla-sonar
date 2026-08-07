package p3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.b1;
import k3.i3;
import k3.j1;
import k3.j3;
import k3.k3;
import k3.l1;
import k3.p1;
import k3.q1;
import p013kotlin.Metadata;
import w4.s;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007JD\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u001c\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lp3/a;", "", "<init>", "()V", "Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V", "Lk3/j3;", "config", "Lw4/r;", "size", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Lkotlin/Function1;", "block", "b", "(IJLw4/d;Lw4/t;Lwn0/l;)V", "target", "", "alpha", "Lk3/q1;", "colorFilter", "c", "(Lm3/f;FLk3/q1;)V", "Lk3/i3;", "Lk3/i3;", DateTokenConverter.CONVERTER_KEY, "()Lk3/i3;", "setMCachedImage", "(Lk3/i3;)V", "getMCachedImage$annotations", "mCachedImage", "Lk3/j1;", "Lk3/j1;", "cachedCanvas", "Lw4/d;", "scopeDensity", "Lw4/t;", "e", "J", "f", "I", "Lm3/a;", "g", "Lm3/a;", "cacheScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private i3 mCachedImage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private j1 cachedCanvas;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private w4.d scopeDensity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long size = w4.r.INSTANCE.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int config = j3.INSTANCE.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m3.a cacheScope = new m3.a();

    private final void a(m3.f fVar) {
        m3.f.C0(fVar, p1.INSTANCE.a(), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, b1.INSTANCE.a(), 62, null);
    }

    public final void b(int config, long size, w4.d density, t layoutDirection, wn0.l<? super m3.f, h0> block) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        i3 i3VarB = this.mCachedImage;
        j1 j1VarA = this.cachedCanvas;
        if (i3VarB == null || j1VarA == null || w4.r.g(size) > i3VarB.getWidth() || w4.r.f(size) > i3VarB.getHeight() || !j3.i(this.config, config)) {
            i3VarB = k3.b(w4.r.g(size), w4.r.f(size), config, false, null, 24, null);
            j1VarA = l1.a(i3VarB);
            this.mCachedImage = i3VarB;
            this.cachedCanvas = j1VarA;
            this.config = config;
        }
        this.size = size;
        m3.a aVar = this.cacheScope;
        long jD = s.d(size);
        m3.a.DrawParams drawParams = aVar.getDrawParams();
        w4.d density2 = drawParams.getDensity();
        t layoutDirection2 = drawParams.getLayoutDirection();
        j1 canvas = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        m3.a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(density);
        drawParams2.k(layoutDirection);
        drawParams2.i(j1VarA);
        drawParams2.l(jD);
        j1VarA.u();
        a(aVar);
        block.invoke(aVar);
        j1VarA.o();
        m3.a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density2);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas);
        drawParams3.l(size2);
        i3VarB.a();
    }

    public final void c(m3.f target, float alpha, q1 colorFilter) {
        i3 i3Var = this.mCachedImage;
        if (!(i3Var != null)) {
            y3.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        m3.f.S1(target, i3Var, 0L, this.size, 0L, 0L, alpha, null, colorFilter, 0, 0, 858, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i3 getMCachedImage() {
        return this.mCachedImage;
    }
}
