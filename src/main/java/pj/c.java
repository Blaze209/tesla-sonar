package pj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import dj.l;
import java.nio.ByteBuffer;
import java.util.List;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f103084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f103086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f103087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f103088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f103089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f103090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f103091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f103092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f103093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f103094k;

    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f103095a;

        a(g gVar) {
            this.f103095a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, bj.a aVar, l<Bitmap> lVar, int i11, int i12, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.e(context), aVar, i11, i12, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f103093j == null) {
            this.f103093j = new Rect();
        }
        return this.f103093j;
    }

    private Paint h() {
        if (this.f103092i == null) {
            this.f103092i = new Paint(2);
        }
        return this.f103092i;
    }

    private void j() {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f103094k;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f103094k.get(i11).b(this);
            }
        }
    }

    private void l() {
        this.f103089f = 0;
    }

    private void n() {
        k.a(!this.f103087d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f103084a.f103095a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f103085b) {
                return;
            }
            this.f103085b = true;
            this.f103084a.f103095a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f103085b = false;
        this.f103084a.f103095a.s(this);
    }

    @Override // pj.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f103089f++;
        }
        int i11 = this.f103090g;
        if (i11 == -1 || this.f103089f < i11) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f103084a.f103095a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f103087d) {
            return;
        }
        if (this.f103091h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f103091h = false;
        }
        canvas.drawBitmap(this.f103084a.f103095a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f103084a.f103095a.e();
    }

    public int f() {
        return this.f103084a.f103095a.f();
    }

    public int g() {
        return this.f103084a.f103095a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f103084a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f103084a.f103095a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f103084a.f103095a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f103084a.f103095a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f103085b;
    }

    public void k() {
        this.f103087d = true;
        this.f103084a.f103095a.a();
    }

    public void m(l<Bitmap> lVar, Bitmap bitmap) {
        this.f103084a.f103095a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f103091h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        h().setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        k.a(!this.f103087d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f103088e = z11;
        if (!z11) {
            o();
        } else if (this.f103086c) {
            n();
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f103086c = true;
        l();
        if (this.f103088e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f103086c = false;
        o();
    }

    c(a aVar) {
        this.f103088e = true;
        this.f103090g = -1;
        this.f103084a = (a) k.d(aVar);
    }
}
