package hg;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import q1.p;

/* JADX INFO: loaded from: classes3.dex */
public class k {
    private static final Matrix B = new Matrix();
    private hg.b A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f72728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f72729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f72730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RectF f72731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f72732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f72733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f72734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f72735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f72736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f72737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f72738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bitmap f72739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Canvas f72740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f72741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private uf.a f72742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Matrix f72743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float[] f72744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Bitmap f72745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bitmap f72746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Canvas f72747t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Canvas f72748u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private uf.a f72749v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private BlurMaskFilter f72750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f72751x = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private RenderNode f72752y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private RenderNode f72753z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k5.b f72755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f72756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public hg.b f72757d;

        public a() {
            f();
        }

        public boolean a() {
            k5.b bVar = this.f72755b;
            return (bVar == null || bVar == k5.b.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f72756c != null;
        }

        public boolean c() {
            return this.f72757d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f72754a < 255;
        }

        public void f() {
            this.f72754a = 255;
            this.f72755b = null;
            this.f72756c = null;
            this.f72757d = null;
        }
    }

    protected enum b {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    private Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap((int) Math.ceil(((double) rectF.width()) * 1.05d), (int) Math.ceil(((double) rectF.height()) * 1.05d), config);
    }

    private RectF b(RectF rectF, hg.b bVar) {
        if (this.f72732e == null) {
            this.f72732e = new RectF();
        }
        if (this.f72734g == null) {
            this.f72734g = new RectF();
        }
        this.f72732e.set(rectF);
        this.f72732e.offsetTo(rectF.left + bVar.f(), rectF.top + bVar.g());
        this.f72732e.inset(-bVar.h(), -bVar.h());
        this.f72734g.set(rectF);
        this.f72732e.union(this.f72734g);
        return this.f72732e;
    }

    private b c(Canvas canvas, a aVar) {
        if (aVar.d()) {
            return b.DIRECT;
        }
        if (!aVar.c()) {
            return b.SAVE_LAYER;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || !canvas.isHardwareAccelerated()) {
            return b.BITMAP;
        }
        return i11 <= 31 ? b.BITMAP : b.RENDER_NODE;
    }

    private void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    private boolean f(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    private void g(Canvas canvas, hg.b bVar) {
        uf.a aVar;
        RectF rectF = this.f72731d;
        if (rectF == null || this.f72739l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, bVar);
        if (this.f72733f == null) {
            this.f72733f = new Rect();
        }
        this.f72733f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f72744q;
        float f11 = fArr != null ? fArr[0] : 1.0f;
        float f12 = fArr != null ? fArr[4] : 1.0f;
        if (this.f72735h == null) {
            this.f72735h = new RectF();
        }
        this.f72735h.set(rectFB.left * f11, rectFB.top * f12, rectFB.right * f11, rectFB.bottom * f12);
        if (this.f72736i == null) {
            this.f72736i = new Rect();
        }
        this.f72736i.set(0, 0, Math.round(this.f72735h.width()), Math.round(this.f72735h.height()));
        if (f(this.f72745r, this.f72735h)) {
            Bitmap bitmap = this.f72745r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f72746s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f72745r = a(this.f72735h, Bitmap.Config.ARGB_8888);
            this.f72746s = a(this.f72735h, Bitmap.Config.ALPHA_8);
            this.f72747t = new Canvas(this.f72745r);
            this.f72748u = new Canvas(this.f72746s);
        } else {
            Canvas canvas2 = this.f72747t;
            if (canvas2 == null || this.f72748u == null || (aVar = this.f72742o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f72736i, aVar);
            this.f72748u.drawRect(this.f72736i, this.f72742o);
        }
        if (this.f72746s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f72749v == null) {
            this.f72749v = new uf.a(1);
        }
        RectF rectF2 = this.f72731d;
        this.f72748u.drawBitmap(this.f72739l, Math.round((rectF2.left - rectFB.left) * f11), Math.round((rectF2.top - rectFB.top) * f12), (Paint) null);
        if (this.f72750w == null || this.f72751x != bVar.h()) {
            float fH = (bVar.h() * (f11 + f12)) / 2.0f;
            if (fH > BitmapDescriptorFactory.HUE_RED) {
                this.f72750w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f72750w = null;
            }
            this.f72751x = bVar.h();
        }
        this.f72749v.setColor(bVar.e());
        if (bVar.h() > BitmapDescriptorFactory.HUE_RED) {
            this.f72749v.setMaskFilter(this.f72750w);
        } else {
            this.f72749v.setMaskFilter(null);
        }
        this.f72749v.setFilterBitmap(true);
        this.f72747t.drawBitmap(this.f72746s, Math.round(bVar.f() * f11), Math.round(bVar.g() * f12), this.f72749v);
        canvas.drawBitmap(this.f72745r, this.f72736i, this.f72733f, this.f72738k);
    }

    private void h(Canvas canvas, hg.b bVar) {
        if (this.f72752y == null || this.f72753z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f72744q;
        float f11 = fArr != null ? fArr[0] : 1.0f;
        float f12 = fArr != null ? fArr[4] : 1.0f;
        hg.b bVar2 = this.A;
        if (bVar2 == null || !bVar.j(bVar2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.e(), PorterDuff.Mode.SRC_IN));
            if (bVar.h() > BitmapDescriptorFactory.HUE_RED) {
                float fH = (bVar.h() * (f11 + f12)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f72753z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.A = bVar;
        }
        RectF rectFB = b(this.f72731d, bVar);
        RectF rectF = new RectF(rectFB.left * f11, rectFB.top * f12, rectFB.right * f11, rectFB.bottom * f12);
        this.f72753z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f72753z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (bVar.f() * f11), (-rectF.top) + (bVar.g() * f12));
        recordingCanvasBeginRecording.drawRenderNode(this.f72752y);
        this.f72753z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f72753z);
        canvas.restore();
    }

    public void e() {
        if (this.f72728a == null || this.f72729b == null || this.f72744q == null || this.f72731d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f72730c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f72728a.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.f72752y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f72728a.save();
                Canvas canvas = this.f72728a;
                float[] fArr = this.f72744q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f72752y.endRecording();
                if (this.f72729b.c()) {
                    h(this.f72728a, this.f72729b.f72757d);
                }
                this.f72728a.drawRenderNode(this.f72752y);
                this.f72728a.restore();
            }
        } else {
            if (this.f72739l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f72729b.c()) {
                g(this.f72728a, this.f72729b.f72757d);
            }
            if (this.f72741n == null) {
                this.f72741n = new Rect();
            }
            this.f72741n.set(0, 0, (int) (this.f72731d.width() * this.f72744q[0]), (int) (this.f72731d.height() * this.f72744q[4]));
            this.f72728a.drawBitmap(this.f72739l, this.f72741n, this.f72731d, this.f72738k);
        }
        this.f72728a = null;
    }

    public Canvas i(Canvas canvas, RectF rectF, a aVar) {
        if (this.f72728a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f72744q == null) {
            this.f72744q = new float[9];
        }
        if (this.f72743p == null) {
            this.f72743p = new Matrix();
        }
        canvas.getMatrix(this.f72743p);
        this.f72743p.getValues(this.f72744q);
        float[] fArr = this.f72744q;
        float f11 = fArr[0];
        float f12 = fArr[4];
        if (this.f72737j == null) {
            this.f72737j = new RectF();
        }
        this.f72737j.set(rectF.left * f11, rectF.top * f12, rectF.right * f11, rectF.bottom * f12);
        this.f72728a = canvas;
        this.f72729b = aVar;
        this.f72730c = c(canvas, aVar);
        if (this.f72731d == null) {
            this.f72731d = new RectF();
        }
        this.f72731d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f72738k == null) {
            this.f72738k = new uf.a();
        }
        this.f72738k.reset();
        int iOrdinal = this.f72730c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f72738k.setAlpha(aVar.f72754a);
            this.f72738k.setColorFilter(aVar.f72756c);
            if (aVar.a()) {
                k5.f.b(this.f72738k, aVar.f72755b);
            }
            l.n(canvas, rectF, this.f72738k);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.f72742o == null) {
                uf.a aVar2 = new uf.a();
                this.f72742o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (f(this.f72739l, this.f72737j)) {
                Bitmap bitmap = this.f72739l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f72739l = a(this.f72737j, Bitmap.Config.ARGB_8888);
                this.f72740m = new Canvas(this.f72739l);
            } else {
                Canvas canvas2 = this.f72740m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(B);
                this.f72740m.drawRect(-1.0f, -1.0f, this.f72737j.width() + 1.0f, this.f72737j.height() + 1.0f, this.f72742o);
            }
            k5.f.b(this.f72738k, aVar.f72755b);
            this.f72738k.setColorFilter(aVar.f72756c);
            this.f72738k.setAlpha(aVar.f72754a);
            Canvas canvas3 = this.f72740m;
            canvas3.scale(f11, f12);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f72752y == null) {
            this.f72752y = p.a("OffscreenLayer.main");
        }
        if (aVar.c() && this.f72753z == null) {
            this.f72753z = p.a("OffscreenLayer.shadow");
            this.A = null;
        }
        if (aVar.a() || aVar.b()) {
            if (this.f72738k == null) {
                this.f72738k = new uf.a();
            }
            this.f72738k.reset();
            k5.f.b(this.f72738k, aVar.f72755b);
            this.f72738k.setColorFilter(aVar.f72756c);
            this.f72752y.setUseCompositingLayer(true, this.f72738k);
            if (aVar.c()) {
                RenderNode renderNode = this.f72753z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f72738k);
            }
        }
        this.f72752y.setAlpha(aVar.f72754a / 255.0f);
        if (aVar.c()) {
            RenderNode renderNode2 = this.f72753z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f72754a / 255.0f);
        }
        this.f72752y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f72752y;
        RectF rectF2 = this.f72737j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f72752y.beginRecording((int) this.f72737j.width(), (int) this.f72737j.height());
        recordingCanvasBeginRecording.setMatrix(B);
        recordingCanvasBeginRecording.scale(f11, f12);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
