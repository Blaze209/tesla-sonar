package com.github.barteksc.pdfviewer;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SizeF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.legere.pdfiumandroid.PdfDocument;

/* JADX INFO: loaded from: classes4.dex */
class d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f39229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f39230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GestureDetector f39231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScaleGestureDetector f39232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39233e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39234f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39235g = false;

    d(e eVar, a aVar) {
        this.f39229a = eVar;
        this.f39230b = aVar;
        this.f39231c = new GestureDetector(eVar.getContext(), this);
        this.f39232d = new ScaleGestureDetector(eVar.getContext(), this);
        eVar.setOnTouchListener(this);
    }

    private boolean a(float f11, float f12) {
        float fAbs = Math.abs(f11);
        float fAbs2 = Math.abs(f12);
        if (this.f39229a.M()) {
            return fAbs2 > fAbs;
        }
        return fAbs > fAbs2;
    }

    private boolean b(float f11, float f12) {
        int iR;
        int iM;
        e eVar = this.f39229a;
        g gVar = eVar.f39243h;
        if (gVar == null) {
            return false;
        }
        float f13 = (-eVar.getCurrentXOffset()) + f11;
        float f14 = (-this.f39229a.getCurrentYOffset()) + f12;
        int iJ = gVar.j(this.f39229a.M() ? f14 : f13, this.f39229a.getZoom());
        SizeF sizeFQ = gVar.q(iJ, this.f39229a.getZoom());
        if (this.f39229a.M()) {
            iM = (int) gVar.r(iJ, this.f39229a.getZoom());
            iR = (int) gVar.m(iJ, this.f39229a.getZoom());
        } else {
            iR = (int) gVar.r(iJ, this.f39229a.getZoom());
            iM = (int) gVar.m(iJ, this.f39229a.getZoom());
        }
        for (PdfDocument.Link link : gVar.l(iJ)) {
            RectF rectFS = gVar.s(iJ, iM, iR, (int) sizeFQ.getWidth(), (int) sizeFQ.getHeight(), link.getBounds());
            rectFS.sort();
            if (rectFS.contains(f13, f14)) {
                this.f39229a.f39254s.a(new aq.a(f11, f12, f13, f14, rectFS, link));
                return true;
            }
        }
        return false;
    }

    private void e() {
        this.f39229a.getScrollHandle();
    }

    private void f(float f11, float f12) {
        float height;
        float f13;
        int currentXOffset = (int) this.f39229a.getCurrentXOffset();
        int currentYOffset = (int) this.f39229a.getCurrentYOffset();
        e eVar = this.f39229a;
        g gVar = eVar.f39243h;
        float f14 = -gVar.m(eVar.getCurrentPage(), this.f39229a.getZoom());
        float fK = f14 - gVar.k(this.f39229a.getCurrentPage(), this.f39229a.getZoom());
        boolean zM = this.f39229a.M();
        float f15 = BitmapDescriptorFactory.HUE_RED;
        if (zM) {
            f13 = -(this.f39229a.j0(gVar.h()) - this.f39229a.getWidth());
            height = fK + this.f39229a.getHeight();
            f15 = f14;
            f14 = 0.0f;
        } else {
            float width = fK + this.f39229a.getWidth();
            height = -(this.f39229a.j0(gVar.f()) - this.f39229a.getHeight());
            f13 = width;
        }
        this.f39230b.g(currentXOffset, currentYOffset, (int) f11, (int) f12, (int) f13, (int) f14, (int) height, (int) f15);
    }

    private void g(MotionEvent motionEvent) {
        this.f39229a.V();
        e();
        if (this.f39230b.f()) {
            return;
        }
        this.f39229a.c0();
    }

    private void h(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        float x11;
        float x12;
        if (a(f11, f12)) {
            int i11 = -1;
            if (!this.f39229a.M() ? f11 <= BitmapDescriptorFactory.HUE_RED : f12 <= BitmapDescriptorFactory.HUE_RED) {
                i11 = 1;
            }
            if (this.f39229a.M()) {
                x11 = motionEvent2.getY();
                x12 = motionEvent.getY();
            } else {
                x11 = motionEvent2.getX();
                x12 = motionEvent.getX();
            }
            float f13 = x11 - x12;
            int iMax = Math.max(0, Math.min(this.f39229a.getPageCount() - 1, this.f39229a.x(this.f39229a.getCurrentXOffset() - (this.f39229a.getZoom() * f13), this.f39229a.getCurrentYOffset() - (f13 * this.f39229a.getZoom())) + i11));
            this.f39230b.h(-this.f39229a.i0(iMax, this.f39229a.y(iMax)));
        }
    }

    void c() {
        this.f39235g = false;
    }

    void d() {
        this.f39235g = true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.f39229a.F()) {
            return false;
        }
        if (this.f39229a.getZoom() < this.f39229a.getMidZoom()) {
            this.f39229a.o0(motionEvent.getX(), motionEvent.getY(), this.f39229a.getMidZoom());
            return true;
        }
        if (this.f39229a.getZoom() < this.f39229a.getMaxZoom()) {
            this.f39229a.o0(motionEvent.getX(), motionEvent.getY(), this.f39229a.getMaxZoom());
            return true;
        }
        this.f39229a.g0();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f39230b.m();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        float f13;
        float fJ0;
        int height;
        if (!this.f39229a.L()) {
            return false;
        }
        if (this.f39229a.J()) {
            if (this.f39229a.b0()) {
                f(f11, f12);
            } else {
                h(motionEvent, motionEvent2, f11, f12);
            }
            return true;
        }
        int currentXOffset = (int) this.f39229a.getCurrentXOffset();
        int currentYOffset = (int) this.f39229a.getCurrentYOffset();
        e eVar = this.f39229a;
        g gVar = eVar.f39243h;
        if (eVar.M()) {
            f13 = -(this.f39229a.j0(gVar.h()) - this.f39229a.getWidth());
            fJ0 = gVar.e(this.f39229a.getZoom());
            height = this.f39229a.getHeight();
        } else {
            f13 = -(gVar.e(this.f39229a.getZoom()) - this.f39229a.getWidth());
            fJ0 = this.f39229a.j0(gVar.f());
            height = this.f39229a.getHeight();
        }
        this.f39230b.g(currentXOffset, currentYOffset, (int) f11, (int) f12, (int) f13, 0, (int) (-(fJ0 - height)), 0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f39229a.f39254s.c(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom = this.f39229a.getZoom() * scaleFactor;
        float fMin = Math.min(dq.a.b.f60820b, this.f39229a.getMinZoom());
        float fMin2 = Math.min(dq.a.b.f60819a, this.f39229a.getMaxZoom());
        if (zoom < fMin) {
            scaleFactor = fMin / this.f39229a.getZoom();
        } else if (zoom > fMin2) {
            scaleFactor = fMin2 / this.f39229a.getZoom();
        }
        this.f39229a.k0(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f39234f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f39229a.V();
        e();
        this.f39234f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        this.f39233e = true;
        if (this.f39229a.N() || this.f39229a.L()) {
            this.f39229a.W(-f11, -f12);
        }
        if (!this.f39234f || this.f39229a.r()) {
            this.f39229a.U();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean zH = this.f39229a.f39254s.h(motionEvent);
        boolean zB = b(motionEvent.getX(), motionEvent.getY());
        if (!zH && !zB) {
            this.f39229a.getScrollHandle();
        }
        this.f39229a.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f39235g) {
            return false;
        }
        boolean z11 = this.f39231c.onTouchEvent(motionEvent) || this.f39232d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f39233e) {
            this.f39233e = false;
            g(motionEvent);
        }
        return z11;
    }
}
