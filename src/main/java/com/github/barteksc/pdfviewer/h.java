package com.github.barteksc.pdfviewer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
class h extends Handler {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f39332f = "com.github.barteksc.pdfviewer.h";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f39333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RectF f39334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f39335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f39336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39337e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ aq.b f39338a;

        a(aq.b bVar) {
            this.f39338a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f39333a.Z(this.f39338a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PageRenderingException f39340a;

        b(PageRenderingException pageRenderingException) {
            this.f39340a = pageRenderingException;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f39333a.a0(this.f39340a);
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f39342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f39343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RectF f39344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f39346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f39347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f39348g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f39349h;

        c(float f11, float f12, RectF rectF, int i11, boolean z11, int i12, boolean z12, boolean z13) {
            this.f39345d = i11;
            this.f39342a = f11;
            this.f39343b = f12;
            this.f39344c = rectF;
            this.f39346e = z11;
            this.f39347f = i12;
            this.f39348g = z12;
            this.f39349h = z13;
        }
    }

    h(Looper looper, e eVar) {
        super(looper);
        this.f39334b = new RectF();
        this.f39335c = new Rect();
        this.f39336d = new Matrix();
        this.f39337e = false;
        this.f39333a = eVar;
    }

    private void c(int i11, int i12, RectF rectF) {
        this.f39336d.reset();
        float f11 = i11;
        float f12 = i12;
        this.f39336d.postTranslate((-rectF.left) * f11, (-rectF.top) * f12);
        this.f39336d.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f39334b.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, f12);
        this.f39336d.mapRect(this.f39334b);
        this.f39334b.round(this.f39335c);
    }

    private aq.b d(c cVar) {
        g gVar = this.f39333a.f39243h;
        gVar.t(cVar.f39345d);
        int iRound = Math.round(cVar.f39342a);
        int iRound2 = Math.round(cVar.f39343b);
        if (iRound != 0 && iRound2 != 0 && !gVar.u(cVar.f39345d)) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, cVar.f39348g ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                c(iRound, iRound2, cVar.f39344c);
                gVar.z(bitmapCreateBitmap, cVar.f39345d, this.f39335c, cVar.f39349h);
                return new aq.b(cVar.f39345d, bitmapCreateBitmap, cVar.f39344c, cVar.f39346e, cVar.f39347f);
            } catch (IllegalArgumentException e11) {
                Log.e(f39332f, "Cannot create bitmap", e11);
            }
        }
        return null;
    }

    void b(int i11, float f11, float f12, RectF rectF, boolean z11, int i12, boolean z12, boolean z13) {
        sendMessage(obtainMessage(1, new c(f11, f12, rectF, i11, z11, i12, z12, z13)));
    }

    void e() {
        this.f39337e = true;
    }

    void f() {
        this.f39337e = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            aq.b bVarD = d((c) message.obj);
            if (bVarD != null) {
                if (this.f39337e) {
                    this.f39333a.post(new a(bVarD));
                } else {
                    bVarD.d().recycle();
                }
            }
        } catch (PageRenderingException e11) {
            this.f39333a.post(new b(e11));
        }
    }
}
