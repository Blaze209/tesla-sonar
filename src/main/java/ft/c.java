package ft;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f66557j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f66558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final View f66559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Path f66560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Paint f66561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Paint f66562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.e f66563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f66564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66566i;

    public interface a {
        void b(Canvas canvas);

        boolean c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar) {
        this.f66558a = aVar;
        View view = (View) aVar;
        this.f66559b = view;
        view.setWillNotDraw(false);
        this.f66560c = new Path();
        this.f66561d = new Paint(7);
        Paint paint = new Paint(1);
        this.f66562e = paint;
        paint.setColor(0);
    }

    private void d(@NonNull Canvas canvas) {
        if (o()) {
            Rect bounds = this.f66564g.getBounds();
            float fWidth = this.f66563f.f66571a - (bounds.width() / 2.0f);
            float fHeight = this.f66563f.f66572b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f66564g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float g(@NonNull d.e eVar) {
        return mt.a.b(eVar.f66571a, eVar.f66572b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f66559b.getWidth(), this.f66559b.getHeight());
    }

    private void i() {
        if (f66557j == 1) {
            this.f66560c.rewind();
            d.e eVar = this.f66563f;
            if (eVar != null) {
                this.f66560c.addCircle(eVar.f66571a, eVar.f66572b, eVar.f66573c, Path.Direction.CW);
            }
        }
        this.f66559b.invalidate();
    }

    private boolean n() {
        d.e eVar = this.f66563f;
        boolean z11 = eVar == null || eVar.a();
        if (f66557j == 0) {
            return !z11 && this.f66566i;
        }
        return !z11;
    }

    private boolean o() {
        return (this.f66565h || this.f66564g == null || this.f66563f == null) ? false : true;
    }

    private boolean p() {
        return (this.f66565h || Color.alpha(this.f66562e.getColor()) == 0) ? false : true;
    }

    public void a() {
        if (f66557j == 0) {
            this.f66565h = true;
            this.f66566i = false;
            this.f66559b.buildDrawingCache();
            Bitmap drawingCache = this.f66559b.getDrawingCache();
            if (drawingCache == null && this.f66559b.getWidth() != 0 && this.f66559b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f66559b.getWidth(), this.f66559b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f66559b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f66561d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f66565h = false;
            this.f66566i = true;
        }
    }

    public void b() {
        if (f66557j == 0) {
            this.f66566i = false;
            this.f66559b.destroyDrawingCache();
            this.f66561d.setShader(null);
            this.f66559b.invalidate();
        }
    }

    public void c(@NonNull Canvas canvas) {
        Canvas canvas2;
        if (n()) {
            int i11 = f66557j;
            if (i11 == 0) {
                canvas2 = canvas;
                d.e eVar = this.f66563f;
                canvas2.drawCircle(eVar.f66571a, eVar.f66572b, eVar.f66573c, this.f66561d);
                if (p()) {
                    d.e eVar2 = this.f66563f;
                    canvas2.drawCircle(eVar2.f66571a, eVar2.f66572b, eVar2.f66573c, this.f66562e);
                }
            } else if (i11 == 1) {
                canvas2 = canvas;
                int iSave = canvas2.save();
                canvas2.clipPath(this.f66560c);
                this.f66558a.b(canvas2);
                if (p()) {
                    canvas2.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f66559b.getWidth(), this.f66559b.getHeight(), this.f66562e);
                }
                canvas2.restoreToCount(iSave);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i11);
                }
                this.f66558a.b(canvas);
                if (p()) {
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f66559b.getWidth(), this.f66559b.getHeight(), this.f66562e);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
            }
        } else {
            canvas2 = canvas;
            this.f66558a.b(canvas2);
            if (p()) {
                canvas2.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f66559b.getWidth(), this.f66559b.getHeight(), this.f66562e);
            }
        }
        d(canvas2);
    }

    public Drawable e() {
        return this.f66564g;
    }

    public int f() {
        return this.f66562e.getColor();
    }

    public d.e h() {
        d.e eVar = this.f66563f;
        if (eVar == null) {
            return null;
        }
        d.e eVar2 = new d.e(eVar);
        if (eVar2.a()) {
            eVar2.f66573c = g(eVar2);
        }
        return eVar2;
    }

    public boolean j() {
        return this.f66558a.c() && !n();
    }

    public void k(Drawable drawable) {
        this.f66564g = drawable;
        this.f66559b.invalidate();
    }

    public void l(int i11) {
        this.f66562e.setColor(i11);
        this.f66559b.invalidate();
    }

    public void m(d.e eVar) {
        if (eVar == null) {
            this.f66563f = null;
        } else {
            d.e eVar2 = this.f66563f;
            if (eVar2 == null) {
                this.f66563f = new d.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (mt.a.c(eVar.f66573c, g(eVar), 1.0E-4f)) {
                this.f66563f.f66573c = Float.MAX_VALUE;
            }
        }
        i();
    }
}
