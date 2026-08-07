package st;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.BitSet;

/* JADX INFO: loaded from: classes5.dex */
public class g extends Drawable implements n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f111779x = "g";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Paint f111780y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f111781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m.g[] f111782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m.g[] f111783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BitSet f111784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f111785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f111786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f111787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Path f111788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f111789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f111790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Region f111791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Region f111792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f111793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f111794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f111795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final rt.a f111796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final l.b f111797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f111798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f111799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f111800t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f111801u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    private final RectF f111802v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f111803w;

    class a implements l.b {
        a() {
        }

        @Override // st.l.b
        public void a(@NonNull m mVar, Matrix matrix, int i11) {
            g.this.f111784d.set(i11 + 4, mVar.e());
            g.this.f111783c[i11] = mVar.f(matrix);
        }

        @Override // st.l.b
        public void b(@NonNull m mVar, Matrix matrix, int i11) {
            g.this.f111784d.set(i11, mVar.e());
            g.this.f111782b[i11] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f111805a;

        b(float f11) {
            this.f111805a = f11;
        }

        @Override // st.k.c
        @NonNull
        public st.c a(@NonNull st.c cVar) {
            return cVar instanceof i ? cVar : new st.b(this.f111805a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f111780y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float G() {
        return P() ? this.f111795o.getStrokeWidth() / 2.0f : BitmapDescriptorFactory.HUE_RED;
    }

    private boolean N() {
        c cVar = this.f111781a;
        int i11 = cVar.f111823q;
        if (i11 == 1 || cVar.f111824r <= 0) {
            return false;
        }
        return i11 == 2 || X();
    }

    private boolean O() {
        Paint.Style style = this.f111781a.f111828v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean P() {
        Paint.Style style = this.f111781a.f111828v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f111795o.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED;
    }

    private void R() {
        super.invalidateSelf();
    }

    private void U(@NonNull Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.f111803w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f111802v.width() - getBounds().width());
            int iHeight = (int) (this.f111802v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f111802v.width()) + (this.f111781a.f111824r * 2) + iWidth, ((int) this.f111802v.height()) + (this.f111781a.f111824r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f11 = (getBounds().left - this.f111781a.f111824r) - iWidth;
            float f12 = (getBounds().top - this.f111781a.f111824r) - iHeight;
            canvas2.translate(-f11, -f12);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f11, f12, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int V(int i11, int i12) {
        return (i11 * (i12 + (i12 >>> 7))) >>> 8;
    }

    private void W(@NonNull Canvas canvas) {
        canvas.translate(B(), C());
    }

    private PorterDuffColorFilter f(@NonNull Paint paint, boolean z11) {
        if (!z11) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f111801u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.f111781a.f111816j != 1.0f) {
            this.f111786f.reset();
            Matrix matrix = this.f111786f;
            float f11 = this.f111781a.f111816j;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f111786f);
        }
        path.computeBounds(this.f111802v, true);
    }

    private void i() {
        k kVarY = E().y(new b(-G()));
        this.f111793m = kVarY;
        this.f111798r.d(kVarY, this.f111781a.f111817k, v(), this.f111788h);
    }

    @NonNull
    private PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z11) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z11) {
            colorForState = l(colorForState);
        }
        this.f111801u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @NonNull
    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, @NonNull Paint paint, boolean z11) {
        return (colorStateList == null || mode == null) ? f(paint, z11) : j(colorStateList, mode, z11);
    }

    @NonNull
    public static g m(@NonNull Context context, float f11, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ht.a.c(context, zs.c.f128599w, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.Q(context);
        gVar.b0(colorStateList);
        gVar.a0(f11);
        return gVar;
    }

    private void n(@NonNull Canvas canvas) {
        if (this.f111784d.cardinality() > 0) {
            Log.w(f111779x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f111781a.f111825s != 0) {
            canvas.drawPath(this.f111787g, this.f111796p.c());
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.f111782b[i11].b(this.f111796p, this.f111781a.f111824r, canvas);
            this.f111783c[i11].b(this.f111796p, this.f111781a.f111824r, canvas);
        }
        if (this.f111803w) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f111787g, f111780y);
            canvas.translate(iB, iC);
        }
    }

    private boolean n0(int[] iArr) {
        boolean z11;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f111781a.f111810d == null || color2 == (colorForState2 = this.f111781a.f111810d.getColorForState(iArr, (color2 = this.f111794n.getColor())))) {
            z11 = false;
        } else {
            this.f111794n.setColor(colorForState2);
            z11 = true;
        }
        if (this.f111781a.f111811e == null || color == (colorForState = this.f111781a.f111811e.getColorForState(iArr, (color = this.f111795o.getColor())))) {
            return z11;
        }
        this.f111795o.setColor(colorForState);
        return true;
    }

    private void o(@NonNull Canvas canvas) {
        q(canvas, this.f111794n, this.f111787g, this.f111781a.f111807a, u());
    }

    private boolean o0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f111799s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f111800t;
        c cVar = this.f111781a;
        this.f111799s = k(cVar.f111813g, cVar.f111814h, this.f111794n, true);
        c cVar2 = this.f111781a;
        this.f111800t = k(cVar2.f111812f, cVar2.f111814h, this.f111795o, false);
        c cVar3 = this.f111781a;
        if (cVar3.f111827u) {
            this.f111796p.d(cVar3.f111813g.getColorForState(getState(), 0));
        }
        return (u5.c.a(porterDuffColorFilter, this.f111799s) && u5.c.a(porterDuffColorFilter2, this.f111800t)) ? false : true;
    }

    private void p0() {
        float fM = M();
        this.f111781a.f111824r = (int) Math.ceil(0.75f * fM);
        this.f111781a.f111825s = (int) Math.ceil(fM * 0.25f);
        o0();
        R();
    }

    private void q(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull k kVar, @NonNull RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f111781a.f111817k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    @NonNull
    private RectF v() {
        this.f111790j.set(u());
        float fG = G();
        this.f111790j.inset(fG, fG);
        return this.f111790j;
    }

    public int A() {
        return this.f111801u;
    }

    public int B() {
        c cVar = this.f111781a;
        return (int) (((double) cVar.f111825s) * Math.sin(Math.toRadians(cVar.f111826t)));
    }

    public int C() {
        c cVar = this.f111781a;
        return (int) (((double) cVar.f111825s) * Math.cos(Math.toRadians(cVar.f111826t)));
    }

    public int D() {
        return this.f111781a.f111824r;
    }

    @NonNull
    public k E() {
        return this.f111781a.f111807a;
    }

    public ColorStateList F() {
        return this.f111781a.f111811e;
    }

    public float H() {
        return this.f111781a.f111818l;
    }

    public ColorStateList I() {
        return this.f111781a.f111813g;
    }

    public float J() {
        return this.f111781a.f111807a.r().a(u());
    }

    public float K() {
        return this.f111781a.f111807a.t().a(u());
    }

    public float L() {
        return this.f111781a.f111822p;
    }

    public float M() {
        return w() + L();
    }

    public void Q(Context context) {
        this.f111781a.f111808b = new kt.a(context);
        p0();
    }

    public boolean S() {
        kt.a aVar = this.f111781a.f111808b;
        return aVar != null && aVar.d();
    }

    public boolean T() {
        return this.f111781a.f111807a.u(u());
    }

    public boolean X() {
        return (T() || this.f111787g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(float f11) {
        setShapeAppearanceModel(this.f111781a.f111807a.w(f11));
    }

    public void Z(@NonNull st.c cVar) {
        setShapeAppearanceModel(this.f111781a.f111807a.x(cVar));
    }

    public void a0(float f11) {
        c cVar = this.f111781a;
        if (cVar.f111821o != f11) {
            cVar.f111821o = f11;
            p0();
        }
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f111781a;
        if (cVar.f111810d != colorStateList) {
            cVar.f111810d = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f11) {
        c cVar = this.f111781a;
        if (cVar.f111817k != f11) {
            cVar.f111817k = f11;
            this.f111785e = true;
            invalidateSelf();
        }
    }

    public void d0(int i11, int i12, int i13, int i14) {
        c cVar = this.f111781a;
        if (cVar.f111815i == null) {
            cVar.f111815i = new Rect();
        }
        this.f111781a.f111815i.set(i11, i12, i13, i14);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f111794n.setColorFilter(this.f111799s);
        int alpha = this.f111794n.getAlpha();
        this.f111794n.setAlpha(V(alpha, this.f111781a.f111819m));
        this.f111795o.setColorFilter(this.f111800t);
        this.f111795o.setStrokeWidth(this.f111781a.f111818l);
        int alpha2 = this.f111795o.getAlpha();
        this.f111795o.setAlpha(V(alpha2, this.f111781a.f111819m));
        if (this.f111785e) {
            i();
            g(u(), this.f111787g);
            this.f111785e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f111794n.setAlpha(alpha);
        this.f111795o.setAlpha(alpha2);
    }

    public void e0(Paint.Style style) {
        this.f111781a.f111828v = style;
        R();
    }

    public void f0(float f11) {
        c cVar = this.f111781a;
        if (cVar.f111820n != f11) {
            cVar.f111820n = f11;
            p0();
        }
    }

    public void g0(boolean z11) {
        this.f111803w = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f111781a.f111819m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f111781a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f111781a.f111823q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f111781a.f111817k);
        } else {
            g(u(), this.f111787g);
            com.google.android.material.drawable.c.l(outline, this.f111787g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f111781a.f111815i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f111791k.set(getBounds());
        g(u(), this.f111787g);
        this.f111792l.setPath(this.f111787g, this.f111791k);
        this.f111791k.op(this.f111792l, Region.Op.DIFFERENCE);
        return this.f111791k;
    }

    protected final void h(@NonNull RectF rectF, @NonNull Path path) {
        l lVar = this.f111798r;
        c cVar = this.f111781a;
        lVar.e(cVar.f111807a, cVar.f111817k, rectF, this.f111797q, path);
    }

    public void h0(int i11) {
        this.f111796p.d(i11);
        this.f111781a.f111827u = false;
        R();
    }

    public void i0(int i11) {
        c cVar = this.f111781a;
        if (cVar.f111823q != i11) {
            cVar.f111823q = i11;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f111785e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f111781a.f111813g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f111781a.f111812f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f111781a.f111811e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f111781a.f111810d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    public void j0(float f11, int i11) {
        m0(f11);
        l0(ColorStateList.valueOf(i11));
    }

    public void k0(float f11, ColorStateList colorStateList) {
        m0(f11);
        l0(colorStateList);
    }

    protected int l(int i11) {
        float fM = M() + z();
        kt.a aVar = this.f111781a.f111808b;
        return aVar != null ? aVar.c(i11, fM) : i11;
    }

    public void l0(ColorStateList colorStateList) {
        c cVar = this.f111781a;
        if (cVar.f111811e != colorStateList) {
            cVar.f111811e = colorStateList;
            onStateChange(getState());
        }
    }

    public void m0(float f11) {
        this.f111781a.f111818l = f11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f111781a = new c(this.f111781a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f111785e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.x.b
    protected boolean onStateChange(int[] iArr) {
        boolean z11 = n0(iArr) || o0();
        if (z11) {
            invalidateSelf();
        }
        return z11;
    }

    protected void p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        q(canvas, paint, path, this.f111781a.f111807a, rectF);
    }

    protected void r(@NonNull Canvas canvas) {
        q(canvas, this.f111795o, this.f111788h, this.f111793m, v());
    }

    public float s() {
        return this.f111781a.f111807a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        c cVar = this.f111781a;
        if (cVar.f111819m != i11) {
            cVar.f111819m = i11;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f111781a.f111809c = colorFilter;
        R();
    }

    @Override // st.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f111781a.f111807a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f111781a.f111813g = colorStateList;
        o0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f111781a;
        if (cVar.f111814h != mode) {
            cVar.f111814h = mode;
            o0();
            R();
        }
    }

    public float t() {
        return this.f111781a.f111807a.l().a(u());
    }

    @NonNull
    protected RectF u() {
        this.f111789i.set(getBounds());
        return this.f111789i;
    }

    public float w() {
        return this.f111781a.f111821o;
    }

    public ColorStateList x() {
        return this.f111781a.f111810d;
    }

    public float y() {
        return this.f111781a.f111817k;
    }

    public float z() {
        return this.f111781a.f111820n;
    }

    public g(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        this(k.e(context, attributeSet, i11, i12).m());
    }

    public g(@NonNull k kVar) {
        this(new c(kVar, null));
    }

    protected g(@NonNull c cVar) {
        l lVar;
        this.f111782b = new m.g[4];
        this.f111783c = new m.g[4];
        this.f111784d = new BitSet(8);
        this.f111786f = new Matrix();
        this.f111787g = new Path();
        this.f111788h = new Path();
        this.f111789i = new RectF();
        this.f111790j = new RectF();
        this.f111791k = new Region();
        this.f111792l = new Region();
        Paint paint = new Paint(1);
        this.f111794n = paint;
        Paint paint2 = new Paint(1);
        this.f111795o = paint2;
        this.f111796p = new rt.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f111798r = lVar;
        this.f111802v = new RectF();
        this.f111803w = true;
        this.f111781a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        o0();
        n0(getState());
        this.f111797q = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        k f111807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        kt.a f111808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorFilter f111809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorStateList f111810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f111811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f111812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f111813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f111814h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Rect f111815i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f111816j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f111817k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f111818l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f111819m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f111820n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f111821o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f111822p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f111823q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f111824r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f111825s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f111826t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f111827u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Paint.Style f111828v;

        public c(@NonNull k kVar, kt.a aVar) {
            this.f111810d = null;
            this.f111811e = null;
            this.f111812f = null;
            this.f111813g = null;
            this.f111814h = PorterDuff.Mode.SRC_IN;
            this.f111815i = null;
            this.f111816j = 1.0f;
            this.f111817k = 1.0f;
            this.f111819m = 255;
            this.f111820n = BitmapDescriptorFactory.HUE_RED;
            this.f111821o = BitmapDescriptorFactory.HUE_RED;
            this.f111822p = BitmapDescriptorFactory.HUE_RED;
            this.f111823q = 0;
            this.f111824r = 0;
            this.f111825s = 0;
            this.f111826t = 0;
            this.f111827u = false;
            this.f111828v = Paint.Style.FILL_AND_STROKE;
            this.f111807a = kVar;
            this.f111808b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f111785e = true;
            return gVar;
        }

        public c(@NonNull c cVar) {
            this.f111810d = null;
            this.f111811e = null;
            this.f111812f = null;
            this.f111813g = null;
            this.f111814h = PorterDuff.Mode.SRC_IN;
            this.f111815i = null;
            this.f111816j = 1.0f;
            this.f111817k = 1.0f;
            this.f111819m = 255;
            this.f111820n = BitmapDescriptorFactory.HUE_RED;
            this.f111821o = BitmapDescriptorFactory.HUE_RED;
            this.f111822p = BitmapDescriptorFactory.HUE_RED;
            this.f111823q = 0;
            this.f111824r = 0;
            this.f111825s = 0;
            this.f111826t = 0;
            this.f111827u = false;
            this.f111828v = Paint.Style.FILL_AND_STROKE;
            this.f111807a = cVar.f111807a;
            this.f111808b = cVar.f111808b;
            this.f111818l = cVar.f111818l;
            this.f111809c = cVar.f111809c;
            this.f111810d = cVar.f111810d;
            this.f111811e = cVar.f111811e;
            this.f111814h = cVar.f111814h;
            this.f111813g = cVar.f111813g;
            this.f111819m = cVar.f111819m;
            this.f111816j = cVar.f111816j;
            this.f111825s = cVar.f111825s;
            this.f111823q = cVar.f111823q;
            this.f111827u = cVar.f111827u;
            this.f111817k = cVar.f111817k;
            this.f111820n = cVar.f111820n;
            this.f111821o = cVar.f111821o;
            this.f111822p = cVar.f111822p;
            this.f111824r = cVar.f111824r;
            this.f111826t = cVar.f111826t;
            this.f111812f = cVar.f111812f;
            this.f111828v = cVar.f111828v;
            if (cVar.f111815i != null) {
                this.f111815i = new Rect(cVar.f111815i);
            }
        }
    }
}
