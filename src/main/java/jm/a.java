package jm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hm.e;

/* JADX INFO: loaded from: classes3.dex */
public class a implements hm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final km.a f83982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f83983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hm.c f83984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f83985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f83986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f83987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f83988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final hm.b[] f83989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f83990i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f83991j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f83992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f83993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f83994m;

    public a(km.a aVar, e eVar, Rect rect, boolean z11) {
        this.f83982a = aVar;
        this.f83983b = eVar;
        hm.c cVarD = eVar.d();
        this.f83984c = cVarD;
        int[] iArrZ = cVarD.z();
        this.f83986e = iArrZ;
        aVar.a(iArrZ);
        this.f83988g = aVar.c(iArrZ);
        this.f83987f = aVar.b(iArrZ);
        this.f83985d = m(cVarD, rect);
        this.f83992k = z11;
        this.f83989h = new hm.b[cVarD.a()];
        for (int i11 = 0; i11 < this.f83984c.a(); i11++) {
            this.f83989h[i11] = this.f83984c.c(i11);
        }
        Paint paint = new Paint();
        this.f83993l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private synchronized void l() {
        Bitmap bitmap = this.f83994m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f83994m = null;
        }
    }

    private static Rect m(hm.c cVar, Rect rect) {
        return rect == null ? new Rect(0, 0, cVar.getWidth(), cVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    private void n(Canvas canvas, float f11, float f12, hm.b bVar) {
        if (bVar.f73169g == hm.b.EnumC1538b.DISPOSE_TO_BACKGROUND) {
            int iCeil = (int) Math.ceil(bVar.f73166d * f11);
            int iCeil2 = (int) Math.ceil(bVar.f73167e * f12);
            int iCeil3 = (int) Math.ceil(bVar.f73164b * f11);
            int iCeil4 = (int) Math.ceil(bVar.f73165c * f12);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.f83993l);
        }
    }

    private synchronized Bitmap o(int i11, int i12) {
        try {
            Bitmap bitmap = this.f83994m;
            if (bitmap != null && (bitmap.getWidth() < i11 || this.f83994m.getHeight() < i12)) {
                l();
            }
            if (this.f83994m == null) {
                this.f83994m = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            }
            this.f83994m.eraseColor(0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f83994m;
    }

    private void p(Canvas canvas, hm.d dVar) {
        int width;
        int height;
        int iB;
        int iC;
        if (this.f83992k) {
            float fMax = Math.max(dVar.getWidth() / Math.min(dVar.getWidth(), canvas.getWidth()), dVar.getHeight() / Math.min(dVar.getHeight(), canvas.getHeight()));
            width = (int) (dVar.getWidth() / fMax);
            height = (int) (dVar.getHeight() / fMax);
            iB = (int) (dVar.b() / fMax);
            iC = (int) (dVar.c() / fMax);
        } else {
            width = dVar.getWidth();
            height = dVar.getHeight();
            iB = dVar.b();
            iC = dVar.c();
        }
        synchronized (this) {
            Bitmap bitmapO = o(width, height);
            this.f83994m = bitmapO;
            dVar.a(width, height, bitmapO);
            canvas.save();
            canvas.translate(iB, iC);
            canvas.drawBitmap(this.f83994m, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            canvas.restore();
        }
    }

    private void q(Canvas canvas, hm.d dVar) {
        double dWidth = ((double) this.f83985d.width()) / ((double) this.f83984c.getWidth());
        double dHeight = ((double) this.f83985d.height()) / ((double) this.f83984c.getHeight());
        int iRound = (int) Math.round(((double) dVar.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) dVar.getHeight()) * dHeight);
        int iB = (int) (((double) dVar.b()) * dWidth);
        int iC = (int) (((double) dVar.c()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f83985d.width();
                int iHeight = this.f83985d.height();
                o(iWidth, iHeight);
                Bitmap bitmap = this.f83994m;
                if (bitmap != null) {
                    dVar.a(iRound, iRound2, bitmap);
                }
                this.f83990i.set(0, 0, iWidth, iHeight);
                this.f83991j.set(iB, iC, iWidth + iB, iHeight + iC);
                Bitmap bitmap2 = this.f83994m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f83990i, this.f83991j, (Paint) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void r(Canvas canvas, hm.d dVar, hm.b bVar, hm.b bVar2) {
        Rect rect = this.f83985d;
        if (rect == null || rect.width() <= 0 || this.f83985d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f83985d.width();
        if (bVar2 != null) {
            n(canvas, width, width, bVar2);
        }
        int width2 = dVar.getWidth();
        int height = dVar.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i11 = (int) (width2 * width);
        int i12 = (int) (height * width);
        int iB = (int) (dVar.b() * width);
        int iC = (int) (dVar.c() * width);
        Rect rect3 = new Rect(iB, iC, i11 + iB, i12 + iC);
        if (bVar.f73168f == hm.b.a.NO_BLEND) {
            canvas.drawRect(rect3, this.f83993l);
        }
        synchronized (this) {
            Bitmap bitmapO = o(width2, height);
            dVar.a(width2, height, bitmapO);
            canvas.drawBitmap(bitmapO, rect2, rect3, (Paint) null);
        }
    }

    private void s(Canvas canvas, hm.d dVar, hm.b bVar, hm.b bVar2) {
        float f11;
        float f12;
        float f13;
        float f14;
        int width = this.f83984c.getWidth();
        int height = this.f83984c.getHeight();
        float f15 = width;
        float f16 = height;
        int width2 = dVar.getWidth();
        int height2 = dVar.getHeight();
        int iB = dVar.b();
        int iC = dVar.c();
        if (f15 > canvas.getWidth() || f16 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f17 = f15 / f16;
            if (iMin > iMin2) {
                f12 = iMin;
                f11 = f12 / f17;
            } else {
                f11 = iMin2;
                f12 = f11 * f17;
            }
            f13 = f12 / f15;
            f14 = f11 / f16;
            width2 = (int) Math.ceil(dVar.getWidth() * f13);
            height2 = (int) Math.ceil(dVar.getHeight() * f14);
            iB = (int) Math.ceil(dVar.b() * f13);
            iC = (int) Math.ceil(dVar.c() * f14);
        } else {
            f13 = 1.0f;
            f14 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(iB, iC, iB + width2, iC + height2);
        if (bVar2 != null) {
            n(canvas, f13, f14, bVar2);
        }
        if (bVar.f73168f == hm.b.a.NO_BLEND) {
            canvas.drawRect(rect2, this.f83993l);
        }
        synchronized (this) {
            Bitmap bitmapO = o(width2, height2);
            dVar.a(width2, height2, bitmapO);
            canvas.drawBitmap(bitmapO, rect, rect2, (Paint) null);
        }
    }

    @Override // hm.a
    public int a() {
        return this.f83984c.a();
    }

    @Override // hm.a
    public int b() {
        return this.f83984c.b();
    }

    @Override // hm.a
    public hm.b c(int i11) {
        return this.f83989h[i11];
    }

    @Override // hm.a
    public int d(int i11) {
        return this.f83986e[i11];
    }

    @Override // hm.a
    public int e() {
        return this.f83985d.width();
    }

    @Override // hm.a
    public e f() {
        return this.f83983b;
    }

    @Override // hm.a
    public int g() {
        return this.f83988g;
    }

    @Override // hm.a
    public int getHeight() {
        return this.f83984c.getHeight();
    }

    @Override // hm.a
    public int getWidth() {
        return this.f83984c.getWidth();
    }

    @Override // hm.a
    public void h(int i11, Canvas canvas) {
        hm.d dVarX = this.f83984c.x(i11);
        try {
            if (dVarX.getWidth() > 0 && dVarX.getHeight() > 0) {
                if (this.f83984c.w()) {
                    q(canvas, dVarX);
                } else {
                    p(canvas, dVarX);
                }
            }
        } finally {
            dVarX.dispose();
        }
    }

    @Override // hm.a
    public hm.a i(Rect rect) {
        return m(this.f83984c, rect).equals(this.f83985d) ? this : new a(this.f83982a, this.f83983b, rect, this.f83992k);
    }

    @Override // hm.a
    public int j() {
        return this.f83985d.height();
    }

    @Override // hm.a
    public void k(int i11, Canvas canvas) {
        hm.d dVarX = this.f83984c.x(i11);
        hm.b bVarC = this.f83984c.c(i11);
        hm.b bVarC2 = i11 == 0 ? null : this.f83984c.c(i11 - 1);
        try {
            if (dVarX.getWidth() > 0 && dVarX.getHeight() > 0) {
                if (this.f83984c.w()) {
                    s(canvas, dVarX, bVarC, bVarC2);
                } else {
                    r(canvas, dVarX, bVarC, bVarC2);
                }
            }
        } finally {
            dVarX.dispose();
        }
    }
}
