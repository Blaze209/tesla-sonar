package g3;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import j3.m;
import jn0.h0;
import k3.f0;
import k3.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import w4.t;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lg3/a;", "Landroid/view/View$DragShadowBuilder;", "Lw4/d;", "density", "Lj3/m;", "decorationSize", "Lkotlin/Function1;", "Lm3/f;", "Ljn0/h0;", "drawDragDecoration", "<init>", "(Lw4/d;JLwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "a", "Lw4/d;", "b", "J", "c", "Lwn0/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w4.d density;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long decorationSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<m3.f, h0> drawDragDecoration;

    public /* synthetic */ a(w4.d dVar, long j11, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        m3.a aVar = new m3.a();
        w4.d dVar = this.density;
        long j11 = this.decorationSize;
        t tVar = t.Ltr;
        j1 j1VarB = f0.b(canvas);
        l<m3.f, h0> lVar = this.drawDragDecoration;
        m3.a.DrawParams drawParams = aVar.getDrawParams();
        w4.d density = drawParams.getDensity();
        t layoutDirection = drawParams.getLayoutDirection();
        j1 canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        m3.a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(dVar);
        drawParams2.k(tVar);
        drawParams2.i(j1VarB);
        drawParams2.l(j11);
        j1VarB.u();
        lVar.invoke(aVar);
        j1VarB.o();
        m3.a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection);
        drawParams3.i(canvas2);
        drawParams3.l(size);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        w4.d dVar = this.density;
        outShadowSize.set(dVar.i1(dVar.x(m.k(this.decorationSize))), dVar.i1(dVar.x(m.i(this.decorationSize))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(w4.d dVar, long j11, l<? super m3.f, h0> lVar) {
        this.density = dVar;
        this.decorationSize = j11;
        this.drawDragDecoration = lVar;
    }
}
