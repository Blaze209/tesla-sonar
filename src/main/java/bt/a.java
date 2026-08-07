package bt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.x;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;
import pt.d;
import st.g;
import st.k;
import zs.l;

/* JADX INFO: loaded from: classes5.dex */
public class a extends Drawable implements x.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f18052n = l.f128812u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f18053o = zs.c.f128559c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final WeakReference<Context> f18054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final g f18055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final x f18056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Rect f18057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final b f18058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f18059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f18060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f18062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f18063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f18064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference<View> f18065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference<FrameLayout> f18066m;

    /* JADX INFO: renamed from: bt.a$a, reason: collision with other inner class name */
    class RunnableC0360a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f18067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f18068b;

        RunnableC0360a(View view, FrameLayout frameLayout) {
            this.f18067a = view;
            this.f18068b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.Z(this.f18067a, this.f18068b);
        }
    }

    private a(@NonNull Context context, int i11, int i12, int i13, b.a aVar) {
        this.f18054a = new WeakReference<>(context);
        a0.c(context);
        this.f18057d = new Rect();
        x xVar = new x(this);
        this.f18056c = xVar;
        xVar.g().setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, i11, i12, i13, aVar);
        this.f18058e = bVar;
        this.f18055b = new g(k.b(context, C() ? bVar.o() : bVar.k(), C() ? bVar.n() : bVar.j()).m());
        R();
    }

    private int A() {
        int iT = C() ? this.f18058e.t() : this.f18058e.u();
        if (this.f18058e.f18080k == 1) {
            iT += C() ? this.f18058e.f18079j : this.f18058e.f18078i;
        }
        return iT + this.f18058e.d();
    }

    private int B() {
        int iE = this.f18058e.E();
        if (C()) {
            iE = this.f18058e.D();
            Context context = this.f18054a.get();
            if (context != null) {
                iE = at.b.c(iE, iE - this.f18058e.v(), at.b.b(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.3f, 1.0f, pt.c.f(context) - 1.0f));
            }
        }
        if (this.f18058e.f18080k == 0) {
            iE -= Math.round(this.f18064k);
        }
        return iE + this.f18058e.e();
    }

    private boolean C() {
        return E() || D();
    }

    private boolean F() {
        FrameLayout frameLayoutL = l();
        return frameLayoutL != null && frameLayoutL.getId() == zs.g.H;
    }

    private void G() {
        this.f18056c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void H() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f18058e.g());
        if (this.f18055b.x() != colorStateListValueOf) {
            this.f18055b.b0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void I() {
        this.f18056c.l(true);
        K();
        a0();
        invalidateSelf();
    }

    private void J() {
        WeakReference<View> weakReference = this.f18065l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f18065l.get();
        WeakReference<FrameLayout> weakReference2 = this.f18066m;
        Z(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void K() {
        Context context = this.f18054a.get();
        if (context == null) {
            return;
        }
        this.f18055b.setShapeAppearanceModel(k.b(context, C() ? this.f18058e.o() : this.f18058e.k(), C() ? this.f18058e.n() : this.f18058e.j()).m());
        invalidateSelf();
    }

    private void L() {
        d dVar;
        Context context = this.f18054a.get();
        if (context == null || this.f18056c.e() == (dVar = new d(context, this.f18058e.C()))) {
            return;
        }
        this.f18056c.k(dVar, context);
        M();
        a0();
        invalidateSelf();
    }

    private void M() {
        this.f18056c.g().setColor(this.f18058e.l());
        invalidateSelf();
    }

    private void N() {
        b0();
        this.f18056c.l(true);
        a0();
        invalidateSelf();
    }

    private void O() {
        if (E()) {
            return;
        }
        I();
    }

    private void P() {
        I();
    }

    private void Q() {
        boolean zI = this.f18058e.I();
        setVisible(zI, false);
        if (!c.f18107a || l() == null || zI) {
            return;
        }
        ((ViewGroup) l().getParent()).invalidate();
    }

    private void R() {
        K();
        L();
        N();
        I();
        G();
        H();
        M();
        J();
        a0();
        Q();
    }

    private void X(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != zs.g.H) {
            WeakReference<FrameLayout> weakReference = this.f18066m;
            if (weakReference == null || weakReference.get() != viewGroup) {
                Y(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(zs.g.H);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f18066m = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC0360a(view, frameLayout));
            }
        }
    }

    private static void Y(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void a0() {
        Context context = this.f18054a.get();
        WeakReference<View> weakReference = this.f18065l;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f18057d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f18066m;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || c.f18107a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        c.f(this.f18057d, this.f18059f, this.f18060g, this.f18063j, this.f18064k);
        float f11 = this.f18062i;
        if (f11 != -1.0f) {
            this.f18055b.Y(f11);
        }
        if (rect.equals(this.f18057d)) {
            return;
        }
        this.f18055b.setBounds(this.f18057d);
    }

    private void b(@NonNull View view) {
        float y11;
        float x11;
        View viewL = l();
        if (viewL == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y12 = view.getY();
            x11 = view.getX();
            viewL = (View) view.getParent();
            y11 = y12;
        } else if (!F()) {
            y11 = 0.0f;
            x11 = 0.0f;
        } else {
            if (!(viewL.getParent() instanceof View)) {
                return;
            }
            y11 = viewL.getY();
            x11 = viewL.getX();
            viewL = (View) viewL.getParent();
        }
        float fZ = z(viewL, y11);
        float fO = o(viewL, x11);
        float fJ = j(viewL, y11);
        float fU = u(viewL, x11);
        if (fZ < BitmapDescriptorFactory.HUE_RED) {
            this.f18060g += Math.abs(fZ);
        }
        if (fO < BitmapDescriptorFactory.HUE_RED) {
            this.f18059f += Math.abs(fO);
        }
        if (fJ > BitmapDescriptorFactory.HUE_RED) {
            this.f18060g -= Math.abs(fJ);
        }
        if (fU > BitmapDescriptorFactory.HUE_RED) {
            this.f18059f -= Math.abs(fU);
        }
    }

    private void b0() {
        if (p() != -2) {
            this.f18061h = ((int) Math.pow(10.0d, ((double) p()) - 1.0d)) - 1;
        } else {
            this.f18061h = q();
        }
    }

    private void c(@NonNull Rect rect, @NonNull View view) {
        float f11 = C() ? this.f18058e.f18073d : this.f18058e.f18072c;
        this.f18062i = f11;
        if (f11 != -1.0f) {
            this.f18063j = f11;
            this.f18064k = f11;
        } else {
            this.f18063j = Math.round((C() ? this.f18058e.f18076g : this.f18058e.f18074e) / 2.0f);
            this.f18064k = Math.round((C() ? this.f18058e.f18077h : this.f18058e.f18075f) / 2.0f);
        }
        if (C()) {
            String strI = i();
            this.f18063j = Math.max(this.f18063j, (this.f18056c.h(strI) / 2.0f) + this.f18058e.i());
            float fMax = Math.max(this.f18064k, (this.f18056c.f(strI) / 2.0f) + this.f18058e.m());
            this.f18064k = fMax;
            this.f18063j = Math.max(this.f18063j, fMax);
        }
        int iB = B();
        int iH = this.f18058e.h();
        if (iH == 8388691 || iH == 8388693) {
            this.f18060g = rect.bottom - iB;
        } else {
            this.f18060g = rect.top + iB;
        }
        int iA = A();
        int iH2 = this.f18058e.h();
        if (iH2 == 8388659 || iH2 == 8388691) {
            this.f18059f = ViewCompat.A(view) == 0 ? (rect.left - this.f18063j) + iA : (rect.right + this.f18063j) - iA;
        } else {
            this.f18059f = ViewCompat.A(view) == 0 ? (rect.right + this.f18063j) - iA : (rect.left - this.f18063j) + iA;
        }
        if (this.f18058e.H()) {
            b(view);
        }
    }

    @NonNull
    public static a f(@NonNull Context context) {
        return new a(context, 0, f18053o, f18052n, null);
    }

    @NonNull
    static a g(@NonNull Context context, @NonNull b.a aVar) {
        return new a(context, 0, f18053o, f18052n, aVar);
    }

    private void h(Canvas canvas) {
        String strI = i();
        if (strI != null) {
            Rect rect = new Rect();
            this.f18056c.g().getTextBounds(strI, 0, strI.length(), rect);
            float fExactCenterY = this.f18060g - rect.exactCenterY();
            canvas.drawText(strI, this.f18059f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f18056c.g());
        }
    }

    private String i() {
        if (E()) {
            return x();
        }
        if (D()) {
            return s();
        }
        return null;
    }

    private float j(View view, float f11) {
        if (!(view.getParent() instanceof View)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((this.f18060g + this.f18064k) - (((View) view.getParent()).getHeight() - view.getY())) + f11;
    }

    private CharSequence m() {
        return this.f18058e.r();
    }

    private float o(View view, float f11) {
        return (this.f18059f - this.f18063j) + view.getX() + f11;
    }

    @NonNull
    private String s() {
        if (this.f18061h == -2 || r() <= this.f18061h) {
            return NumberFormat.getInstance(this.f18058e.z()).format(r());
        }
        Context context = this.f18054a.get();
        return context == null ? "" : String.format(this.f18058e.z(), context.getString(zs.k.f128790y), Integer.valueOf(this.f18061h), Marker.ANY_NON_NULL_MARKER);
    }

    private String t() {
        Context context;
        if (this.f18058e.s() == 0 || (context = this.f18054a.get()) == null) {
            return null;
        }
        return (this.f18061h == -2 || r() <= this.f18061h) ? context.getResources().getQuantityString(this.f18058e.s(), r(), Integer.valueOf(r())) : context.getString(this.f18058e.p(), Integer.valueOf(this.f18061h));
    }

    private float u(View view, float f11) {
        if (!(view.getParent() instanceof View)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((this.f18059f + this.f18063j) - (((View) view.getParent()).getWidth() - view.getX())) + f11;
    }

    private String x() {
        String strW = w();
        int iP = p();
        if (iP == -2 || strW == null || strW.length() <= iP) {
            return strW;
        }
        Context context = this.f18054a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(zs.k.f128774i), strW.substring(0, iP - 1), "…");
    }

    private CharSequence y() {
        CharSequence charSequenceQ = this.f18058e.q();
        return charSequenceQ != null ? charSequenceQ : w();
    }

    private float z(View view, float f11) {
        return (this.f18060g - this.f18064k) + view.getY() + f11;
    }

    public boolean D() {
        return !this.f18058e.G() && this.f18058e.F();
    }

    public boolean E() {
        return this.f18058e.G();
    }

    public void S(int i11) {
        this.f18058e.L(i11);
        H();
    }

    public void T(int i11) {
        if (this.f18056c.g().getColor() != i11) {
            this.f18058e.M(i11);
            M();
        }
    }

    public void U(int i11) {
        int iMax = Math.max(0, i11);
        if (this.f18058e.y() != iMax) {
            this.f18058e.N(iMax);
            O();
        }
    }

    public void V(String str) {
        if (TextUtils.equals(this.f18058e.B(), str)) {
            return;
        }
        this.f18058e.O(str);
        P();
    }

    public void W(boolean z11) {
        this.f18058e.P(z11);
        Q();
    }

    public void Z(@NonNull View view, FrameLayout frameLayout) {
        this.f18065l = new WeakReference<>(view);
        boolean z11 = c.f18107a;
        if (z11 && frameLayout == null) {
            X(view);
        } else {
            this.f18066m = new WeakReference<>(frameLayout);
        }
        if (!z11) {
            Y(view);
        }
        a0();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.x.b
    public void a() {
        invalidateSelf();
    }

    public void d() {
        if (this.f18058e.F()) {
            this.f18058e.a();
            O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f18055b.draw(canvas);
        if (C()) {
            h(canvas);
        }
    }

    public void e() {
        if (this.f18058e.G()) {
            this.f18058e.b();
            P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18058e.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18057d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18057d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public CharSequence k() {
        if (!isVisible()) {
            return null;
        }
        if (E()) {
            return y();
        }
        return D() ? t() : m();
    }

    public FrameLayout l() {
        WeakReference<FrameLayout> weakReference = this.f18066m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int n() {
        return this.f18058e.u();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.x.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int p() {
        return this.f18058e.w();
    }

    public int q() {
        return this.f18058e.x();
    }

    public int r() {
        if (this.f18058e.F()) {
            return this.f18058e.y();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f18058e.K(i11);
        G();
    }

    @NonNull
    b.a v() {
        return this.f18058e.A();
    }

    public String w() {
        return this.f18058e.B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
