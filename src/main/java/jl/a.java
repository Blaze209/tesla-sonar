package jl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kl.b;
import ll.s;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Drawable implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f83955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f83957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f83958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f83960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f83961g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f83963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f83964j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f83970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f83971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f83972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f83973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f83974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f83975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f83976v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap<String, String> f83962h = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f83965k = 80;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f83966l = new Paint(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Matrix f83967m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f83968n = new Rect();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f83969o = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f83977w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f83978x = 0;

    public a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i11) {
        String str3 = str + ": ";
        float fMeasureText = this.f83966l.measureText(str3);
        float fMeasureText2 = this.f83966l.measureText(str2);
        this.f83966l.setColor(1711276032);
        int i12 = this.f83973s;
        int i13 = this.f83974t;
        canvas.drawRect(i12 - 4, i13 + 8, i12 + fMeasureText + fMeasureText2 + 4.0f, i13 + this.f83972r + 8, this.f83966l);
        this.f83966l.setColor(-1);
        canvas.drawText(str3, this.f83973s, this.f83974t, this.f83966l);
        this.f83966l.setColor(i11);
        canvas.drawText(str2, this.f83973s + fMeasureText, this.f83974t, this.f83966l);
        this.f83974t += this.f83972r;
    }

    private static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i11, int i12) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i12, rect.height() / i11)));
        this.f83966l.setTextSize(iMin);
        int i13 = iMin + 8;
        this.f83972r = i13;
        int i14 = this.f83965k;
        if (i14 == 80) {
            this.f83972r = i13 * (-1);
        }
        this.f83970p = rect.left + 10;
        this.f83971q = i14 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // kl.b
    public void a(long j11) {
        this.f83975u = j11;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f83962h.put(str, str2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f83966l.setStyle(Paint.Style.STROKE);
        this.f83966l.setStrokeWidth(2.0f);
        this.f83966l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f83966l);
        Paint paint = this.f83966l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f83966l.setColor(this.f83978x);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f83966l);
        this.f83966l.setStyle(style);
        this.f83966l.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        this.f83966l.setColor(-1);
        this.f83973s = this.f83970p;
        this.f83974t = this.f83971q;
        String str = this.f83956b;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f83955a, str));
        } else {
            d(canvas, "ID", this.f83955a);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f83957c), Integer.valueOf(this.f83958d)), f(this.f83957c, this.f83958d, this.f83961g));
        int i11 = this.f83958d;
        if (i11 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f83957c / i11));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f83959e / 1024)));
        String str2 = this.f83960f;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i12 = this.f83963i;
        if (i12 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i12), Integer.valueOf(this.f83964j)));
        }
        s sVar = this.f83961g;
        if (sVar != null) {
            c(canvas, "scale", sVar);
        }
        long j11 = this.f83975u;
        if (j11 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j11)));
        }
        String str3 = this.f83976v;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f83977w);
        }
        for (Map.Entry<String, String> entry : this.f83962h.entrySet()) {
            d(canvas, entry.getKey(), entry.getValue());
        }
    }

    int f(int i11, int i12, s sVar) {
        int i13;
        int i14;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i11 > 0 && i12 > 0) {
            if (sVar != null) {
                Rect rect = this.f83968n;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f83967m.reset();
                i13 = i11;
                i14 = i12;
                sVar.a(this.f83967m, this.f83968n, i13, i14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                RectF rectF = this.f83969o;
                rectF.top = BitmapDescriptorFactory.HUE_RED;
                rectF.left = BitmapDescriptorFactory.HUE_RED;
                rectF.right = i13;
                rectF.bottom = i14;
                this.f83967m.mapRect(rectF);
                int iWidth2 = (int) this.f83969o.width();
                int iHeight2 = (int) this.f83969o.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            } else {
                i13 = i11;
                i14 = i12;
            }
            float f11 = iWidth;
            float f12 = f11 * 0.1f;
            float f13 = f11 * 0.5f;
            float f14 = iHeight;
            float f15 = 0.1f * f14;
            float f16 = f14 * 0.5f;
            int iAbs = Math.abs(i13 - iWidth);
            int iAbs2 = Math.abs(i14 - iHeight);
            float f17 = iAbs;
            if (f17 < f12 && iAbs2 < f15) {
                return -16711936;
            }
            if (f17 < f13 && iAbs2 < f16) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f83957c = -1;
        this.f83958d = -1;
        this.f83959e = -1;
        this.f83962h = new HashMap<>();
        this.f83963i = -1;
        this.f83964j = -1;
        this.f83960f = null;
        j(null);
        this.f83975u = -1L;
        this.f83976v = null;
        this.f83977w = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f83955a = str;
        invalidateSelf();
    }

    public void k(int i11, int i12) {
        this.f83957c = i11;
        this.f83958d = i12;
        invalidateSelf();
    }

    public void l(int i11) {
        this.f83959e = i11;
    }

    public void m(s sVar) {
        this.f83961g = sVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
