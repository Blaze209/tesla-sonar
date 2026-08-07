package sj0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sj0.a f111287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f111288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f111289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f111290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f111292g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f111297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f111298m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f111286a = 16.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f111293h = new int[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f111294i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f111295j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f111296k = true;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            g.this.k();
            return true;
        }
    }

    public g(@NonNull View view, @NonNull ViewGroup viewGroup, int i11, sj0.a aVar) {
        this.f111292g = viewGroup;
        this.f111290e = view;
        this.f111291f = i11;
        this.f111287b = aVar;
        if (aVar instanceof i) {
            ((i) aVar).f(view.getContext());
        }
        i(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private void h() {
        this.f111289d = this.f111287b.e(this.f111289d, this.f111286a);
        if (this.f111287b.b()) {
            return;
        }
        this.f111288c.setBitmap(this.f111289d);
    }

    private void j() {
        this.f111292g.getLocationOnScreen(this.f111293h);
        this.f111290e.getLocationOnScreen(this.f111294i);
        int[] iArr = this.f111294i;
        int i11 = iArr[0];
        int[] iArr2 = this.f111293h;
        int i12 = i11 - iArr2[0];
        int i13 = iArr[1] - iArr2[1];
        float height = this.f111290e.getHeight() / this.f111289d.getHeight();
        float width = this.f111290e.getWidth() / this.f111289d.getWidth();
        this.f111288c.translate((-i12) / width, (-i13) / height);
        this.f111288c.scale(1.0f / width, 1.0f / height);
    }

    @Override // sj0.b
    public boolean a(Canvas canvas) {
        if (this.f111296k && this.f111297l) {
            if (canvas instanceof d) {
                return false;
            }
            float height = this.f111290e.getHeight() / this.f111289d.getHeight();
            float width = this.f111290e.getWidth() / this.f111289d.getWidth();
            canvas.save();
            canvas.scale(width, height);
            this.f111287b.d(canvas, this.f111289d);
            canvas.restore();
            int i11 = this.f111291f;
            if (i11 != 0) {
                canvas.drawColor(i11);
            }
        }
        return true;
    }

    @Override // sj0.e
    public e b(boolean z11) {
        this.f111296k = z11;
        f(z11);
        this.f111290e.invalidate();
        return this;
    }

    @Override // sj0.b
    public void c() {
        i(this.f111290e.getMeasuredWidth(), this.f111290e.getMeasuredHeight());
    }

    @Override // sj0.e
    public e d(float f11) {
        this.f111286a = f11;
        return this;
    }

    @Override // sj0.b
    public void destroy() {
        f(false);
        this.f111287b.destroy();
        this.f111297l = false;
    }

    @Override // sj0.e
    public e e(int i11) {
        if (this.f111291f != i11) {
            this.f111291f = i11;
            this.f111290e.invalidate();
        }
        return this;
    }

    @Override // sj0.e
    public e f(boolean z11) {
        this.f111292g.getViewTreeObserver().removeOnPreDrawListener(this.f111295j);
        this.f111290e.getViewTreeObserver().removeOnPreDrawListener(this.f111295j);
        if (z11) {
            this.f111292g.getViewTreeObserver().addOnPreDrawListener(this.f111295j);
            if (this.f111292g.getWindowId() != this.f111290e.getWindowId()) {
                this.f111290e.getViewTreeObserver().addOnPreDrawListener(this.f111295j);
            }
        }
        return this;
    }

    @Override // sj0.e
    public e g(Drawable drawable) {
        this.f111298m = drawable;
        return this;
    }

    void i(int i11, int i12) {
        f(true);
        k kVar = new k(this.f111287b.c());
        if (kVar.b(i11, i12)) {
            this.f111290e.setWillNotDraw(true);
            return;
        }
        this.f111290e.setWillNotDraw(false);
        k.a aVarD = kVar.d(i11, i12);
        this.f111289d = Bitmap.createBitmap(aVarD.f111315a, aVarD.f111316b, this.f111287b.a());
        this.f111288c = new d(this.f111289d);
        this.f111297l = true;
        k();
    }

    void k() {
        if (this.f111296k && this.f111297l) {
            Drawable drawable = this.f111298m;
            if (drawable == null) {
                this.f111289d.eraseColor(0);
            } else {
                drawable.draw(this.f111288c);
            }
            this.f111288c.save();
            j();
            this.f111292g.draw(this.f111288c);
            this.f111288c.restore();
            h();
        }
    }
}
