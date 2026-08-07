package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import j5.k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class g extends androidx.vectordrawable.graphics.drawable.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f14225k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f14226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f14227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f14228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f14231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f14232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f14233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f14234j;

    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f14261b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f14260a = k5.g.d(string2);
            }
            this.f14262c = k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14198d);
                f(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        C0241g f14282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f14283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f14284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f14285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f14286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f14287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f14288h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f14289i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f14290j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f14291k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f14292l;

        public h(h hVar) {
            this.f14283c = null;
            this.f14284d = g.f14225k;
            if (hVar != null) {
                this.f14281a = hVar.f14281a;
                C0241g c0241g = new C0241g(hVar.f14282b);
                this.f14282b = c0241g;
                if (hVar.f14282b.f14269e != null) {
                    c0241g.f14269e = new Paint(hVar.f14282b.f14269e);
                }
                if (hVar.f14282b.f14268d != null) {
                    this.f14282b.f14268d = new Paint(hVar.f14282b.f14268d);
                }
                this.f14283c = hVar.f14283c;
                this.f14284d = hVar.f14284d;
                this.f14285e = hVar.f14285e;
            }
        }

        public boolean a(int i11, int i12) {
            return i11 == this.f14286f.getWidth() && i12 == this.f14286f.getHeight();
        }

        public boolean b() {
            return !this.f14291k && this.f14287g == this.f14283c && this.f14288h == this.f14284d && this.f14290j == this.f14285e && this.f14289i == this.f14282b.getRootAlpha();
        }

        public void c(int i11, int i12) {
            if (this.f14286f == null || !a(i11, i12)) {
                this.f14286f = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                this.f14291k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f14286f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f14292l == null) {
                Paint paint = new Paint();
                this.f14292l = paint;
                paint.setFilterBitmap(true);
            }
            this.f14292l.setAlpha(this.f14282b.getRootAlpha());
            this.f14292l.setColorFilter(colorFilter);
            return this.f14292l;
        }

        public boolean f() {
            return this.f14282b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f14282b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14281a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f14282b.g(iArr);
            this.f14291k |= zG;
            return zG;
        }

        public void i() {
            this.f14287g = this.f14283c;
            this.f14288h = this.f14284d;
            this.f14289i = this.f14282b.getRootAlpha();
            this.f14290j = this.f14285e;
            this.f14291k = false;
        }

        public void j(int i11, int i12) {
            this.f14286f.eraseColor(0);
            this.f14282b.b(new Canvas(this.f14286f), i11, i12, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public h() {
            this.f14283c = null;
            this.f14284d = g.f14225k;
            this.f14282b = new C0241g();
        }
    }

    g() {
        this.f14230f = true;
        this.f14232h = new float[9];
        this.f14233i = new Matrix();
        this.f14234j = new Rect();
        this.f14226b = new h();
    }

    static int a(int i11, float f11) {
        return (i11 & 16777215) | (((int) (Color.alpha(i11) * f11)) << 24);
    }

    public static g b(@NonNull Resources resources, int i11, Resources.Theme theme) {
        g gVar = new g();
        gVar.f14224a = j5.h.f(resources, i11, theme);
        gVar.f14231g = new i(gVar.f14224a.getConstantState());
        return gVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f14226b;
        C0241g c0241g = hVar.f14282b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0241g.f14272h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z11 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f14248b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0241g.f14280p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f14281a = cVar.f14263d | hVar.f14281a;
                    z11 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f14248b.add(bVar);
                    if (bVar.getPathName() != null) {
                        c0241g.f14280p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f14281a = bVar.f14263d | hVar.f14281a;
                } else if (Kind.GROUP.equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f14248b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0241g.f14280p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f14281a = dVar2.f14257k | hVar.f14281a;
                }
            } else if (eventType == 3 && Kind.GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z11) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && l5.a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f14226b;
        C0241g c0241g = hVar.f14282b;
        hVar.f14284d = f(k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f14283c = colorStateListG;
        }
        hVar.f14285e = k.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f14285e);
        c0241g.f14275k = k.j(typedArray, xmlPullParser, "viewportWidth", 7, c0241g.f14275k);
        float fJ = k.j(typedArray, xmlPullParser, "viewportHeight", 8, c0241g.f14276l);
        c0241g.f14276l = fJ;
        if (c0241g.f14275k <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0241g.f14273i = typedArray.getDimension(3, c0241g.f14273i);
        float dimension = typedArray.getDimension(2, c0241g.f14274j);
        c0241g.f14274j = dimension;
        if (c0241g.f14273i <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0241g.setAlpha(k.j(typedArray, xmlPullParser, "alpha", 4, c0241g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0241g.f14278n = string;
            c0241g.f14280p.put(string, c0241g);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f14226b.f14282b.f14280p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f14224a;
        if (drawable == null) {
            return false;
        }
        l5.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f14234j);
        if (this.f14234j.width() <= 0 || this.f14234j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f14228d;
        if (colorFilter == null) {
            colorFilter = this.f14227c;
        }
        canvas.getMatrix(this.f14233i);
        this.f14233i.getValues(this.f14232h);
        float fAbs = Math.abs(this.f14232h[0]);
        float fAbs2 = Math.abs(this.f14232h[4]);
        float fAbs3 = Math.abs(this.f14232h[1]);
        float fAbs4 = Math.abs(this.f14232h[3]);
        if (fAbs3 != BitmapDescriptorFactory.HUE_RED || fAbs4 != BitmapDescriptorFactory.HUE_RED) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f14234j.width() * fAbs);
        int iHeight = (int) (this.f14234j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f14234j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f14234j.width(), BitmapDescriptorFactory.HUE_RED);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f14234j.offsetTo(0, 0);
        this.f14226b.c(iMin, iMin2);
        if (!this.f14230f) {
            this.f14226b.j(iMin, iMin2);
        } else if (!this.f14226b.b()) {
            this.f14226b.j(iMin, iMin2);
            this.f14226b.i();
        }
        this.f14226b.d(canvas, colorFilter, this.f14234j);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z11) {
        this.f14230f = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f14224a;
        return drawable != null ? l5.a.d(drawable) : this.f14226b.f14282b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f14226b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f14224a;
        return drawable != null ? l5.a.e(drawable) : this.f14228d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f14224a != null) {
            return new i(this.f14224a.getConstantState());
        }
        this.f14226b.f14281a = getChangingConfigurations();
        return this.f14226b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f14226b.f14282b.f14274j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f14226b.f14282b.f14273i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f14224a;
        return drawable != null ? l5.a.h(drawable) : this.f14226b.f14285e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f14226b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f14226b.f14283c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f14229e && super.mutate() == this) {
            this.f14226b = new h(this.f14226b);
            this.f14229e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z11;
        PorterDuff.Mode mode;
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f14226b;
        ColorStateList colorStateList = hVar.f14283c;
        if (colorStateList == null || (mode = hVar.f14284d) == null) {
            z11 = false;
        } else {
            this.f14227c = i(this.f14227c, colorStateList, mode);
            invalidateSelf();
            z11 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z11;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j11) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j11);
        } else {
            super.scheduleSelf(runnable, j11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else if (this.f14226b.f14282b.getRootAlpha() != i11) {
            this.f14226b.f14282b.setRootAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.j(drawable, z11);
        } else {
            this.f14226b.f14285e = z11;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i11) {
        super.setChangingConfigurations(i11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i11, PorterDuff.Mode mode) {
        super.setColorFilter(i11, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z11) {
        super.setFilterBitmap(z11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f11, float f12) {
        super.setHotspot(f11, f12);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i11, int i12, int i13, int i14) {
        super.setHotspotBounds(i11, i12, i13, i14);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.n(drawable, i11);
        } else {
            setTintList(ColorStateList.valueOf(i11));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f14226b;
        if (hVar.f14283c != colorStateList) {
            hVar.f14283c = colorStateList;
            this.f14227c = i(this.f14227c, colorStateList, hVar.f14284d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.p(drawable, mode);
            return;
        }
        h hVar = this.f14226b;
        if (hVar.f14284d != mode) {
            hVar.f14284d = mode;
            this.f14227c = i(this.f14227c, hVar.f14283c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.setVisible(z11, z12) : super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f14293a;

        public i(Drawable.ConstantState constantState) {
            this.f14293a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f14293a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14293a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f14224a = (VectorDrawable) this.f14293a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f14224a = (VectorDrawable) this.f14293a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f14224a = (VectorDrawable) this.f14293a.newDrawable(resources, theme);
            return gVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14228d = colorFilter;
            invalidateSelf();
        }
    }

    private static abstract class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected k5.g.b[] f14260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f14261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14263d;

        public f() {
            super();
            this.f14260a = null;
            this.f14262c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            k5.g.b[] bVarArr = this.f14260a;
            if (bVarArr != null) {
                k5.g.b.h(bVarArr, path);
            }
        }

        public k5.g.b[] getPathData() {
            return this.f14260a;
        }

        public String getPathName() {
            return this.f14261b;
        }

        public void setPathData(k5.g.b[] bVarArr) {
            if (k5.g.b(this.f14260a, bVarArr)) {
                k5.g.k(this.f14260a, bVarArr);
            } else {
                this.f14260a = k5.g.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f14260a = null;
            this.f14262c = 0;
            this.f14261b = fVar.f14261b;
            this.f14263d = fVar.f14263d;
            this.f14260a = k5.g.f(fVar.f14260a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f14226b;
        hVar.f14282b = new C0241g();
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14195a);
        h(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        hVar.f14281a = getChangingConfigurations();
        hVar.f14291k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f14227c = i(this.f14227c, hVar.f14283c, hVar.f14284d);
    }

    g(@NonNull h hVar) {
        this.f14230f = true;
        this.f14232h = new float[9];
        this.f14233i = new Matrix();
        this.f14234j = new Rect();
        this.f14226b = hVar;
        this.f14227c = i(this.f14227c, hVar.f14283c, hVar.f14284d);
    }

    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f14235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        j5.d f14236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f14237g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        j5.d f14238h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f14239i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f14240j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f14241k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f14242l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f14243m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f14244n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f14245o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f14246p;

        c() {
            this.f14237g = BitmapDescriptorFactory.HUE_RED;
            this.f14239i = 1.0f;
            this.f14240j = 1.0f;
            this.f14241k = BitmapDescriptorFactory.HUE_RED;
            this.f14242l = 1.0f;
            this.f14243m = BitmapDescriptorFactory.HUE_RED;
            this.f14244n = Paint.Cap.BUTT;
            this.f14245o = Paint.Join.MITER;
            this.f14246p = 4.0f;
        }

        private Paint.Cap e(int i11, Paint.Cap cap) {
            if (i11 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i11 != 1) {
                return i11 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i11, Paint.Join join) {
            if (i11 == 0) {
                return Paint.Join.MITER;
            }
            if (i11 != 1) {
                return i11 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f14235e = null;
            if (k.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f14261b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f14260a = k5.g.d(string2);
                }
                this.f14238h = k.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f14240j = k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f14240j);
                this.f14244n = e(k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f14244n);
                this.f14245o = f(k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f14245o);
                this.f14246p = k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f14246p);
                this.f14236f = k.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f14239i = k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f14239i);
                this.f14237g = k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f14237g);
                this.f14242l = k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f14242l);
                this.f14243m = k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f14243m);
                this.f14241k = k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f14241k);
                this.f14262c = k.k(typedArray, xmlPullParser, "fillType", 13, this.f14262c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f14238h.i() || this.f14236f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f14236f.j(iArr) | this.f14238h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14197c);
            h(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        float getFillAlpha() {
            return this.f14240j;
        }

        int getFillColor() {
            return this.f14238h.e();
        }

        float getStrokeAlpha() {
            return this.f14239i;
        }

        int getStrokeColor() {
            return this.f14236f.e();
        }

        float getStrokeWidth() {
            return this.f14237g;
        }

        float getTrimPathEnd() {
            return this.f14242l;
        }

        float getTrimPathOffset() {
            return this.f14243m;
        }

        float getTrimPathStart() {
            return this.f14241k;
        }

        void setFillAlpha(float f11) {
            this.f14240j = f11;
        }

        void setFillColor(int i11) {
            this.f14238h.k(i11);
        }

        void setStrokeAlpha(float f11) {
            this.f14239i = f11;
        }

        void setStrokeColor(int i11) {
            this.f14236f.k(i11);
        }

        void setStrokeWidth(float f11) {
            this.f14237g = f11;
        }

        void setTrimPathEnd(float f11) {
            this.f14242l = f11;
        }

        void setTrimPathOffset(float f11) {
            this.f14243m = f11;
        }

        void setTrimPathStart(float f11) {
            this.f14241k = f11;
        }

        c(c cVar) {
            super(cVar);
            this.f14237g = BitmapDescriptorFactory.HUE_RED;
            this.f14239i = 1.0f;
            this.f14240j = 1.0f;
            this.f14241k = BitmapDescriptorFactory.HUE_RED;
            this.f14242l = 1.0f;
            this.f14243m = BitmapDescriptorFactory.HUE_RED;
            this.f14244n = Paint.Cap.BUTT;
            this.f14245o = Paint.Join.MITER;
            this.f14246p = 4.0f;
            this.f14235e = cVar.f14235e;
            this.f14236f = cVar.f14236f;
            this.f14237g = cVar.f14237g;
            this.f14239i = cVar.f14239i;
            this.f14238h = cVar.f14238h;
            this.f14262c = cVar.f14262c;
            this.f14240j = cVar.f14240j;
            this.f14241k = cVar.f14241k;
            this.f14242l = cVar.f14242l;
            this.f14243m = cVar.f14243m;
            this.f14244n = cVar.f14244n;
            this.f14245o = cVar.f14245o;
            this.f14246p = cVar.f14246p;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$g, reason: collision with other inner class name */
    private static class C0241g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f14264q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f14265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f14266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f14267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f14268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f14269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f14270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14271g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f14272h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f14273i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f14274j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f14275k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f14276l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f14277m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f14278n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f14279o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final androidx.collection.a<String, Object> f14280p;

        public C0241g() {
            this.f14267c = new Matrix();
            this.f14273i = BitmapDescriptorFactory.HUE_RED;
            this.f14274j = BitmapDescriptorFactory.HUE_RED;
            this.f14275k = BitmapDescriptorFactory.HUE_RED;
            this.f14276l = BitmapDescriptorFactory.HUE_RED;
            this.f14277m = 255;
            this.f14278n = null;
            this.f14279o = null;
            this.f14280p = new androidx.collection.a<>();
            this.f14272h = new d();
            this.f14265a = new Path();
            this.f14266b = new Path();
        }

        private static float a(float f11, float f12, float f13, float f14) {
            return (f11 * f14) - (f12 * f13);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f14247a.set(matrix);
            dVar2.f14247a.preConcat(dVar2.f14256j);
            canvas.save();
            int i13 = 0;
            while (i13 < dVar2.f14248b.size()) {
                e eVar = dVar2.f14248b.get(i13);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f14247a, canvas, i11, i12, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar2, (f) eVar, canvas, i11, i12, colorFilter);
                }
                i13++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            float f11 = i11 / this.f14275k;
            float f12 = i12 / this.f14276l;
            float fMin = Math.min(f11, f12);
            Matrix matrix = dVar.f14247a;
            this.f14267c.set(matrix);
            this.f14267c.postScale(f11, f12);
            float fE = e(matrix);
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            fVar.d(this.f14265a);
            Path path = this.f14265a;
            this.f14266b.reset();
            if (fVar.c()) {
                this.f14266b.setFillType(fVar.f14262c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f14266b.addPath(path, this.f14267c);
                canvas.clipPath(this.f14266b);
                return;
            }
            c cVar = (c) fVar;
            float f13 = cVar.f14241k;
            if (f13 != BitmapDescriptorFactory.HUE_RED || cVar.f14242l != 1.0f) {
                float f14 = cVar.f14243m;
                float f15 = (f13 + f14) % 1.0f;
                float f16 = (cVar.f14242l + f14) % 1.0f;
                if (this.f14270f == null) {
                    this.f14270f = new PathMeasure();
                }
                this.f14270f.setPath(this.f14265a, false);
                float length = this.f14270f.getLength();
                float f17 = f15 * length;
                float f18 = f16 * length;
                path.reset();
                if (f17 > f18) {
                    this.f14270f.getSegment(f17, length, path, true);
                    this.f14270f.getSegment(BitmapDescriptorFactory.HUE_RED, f18, path, true);
                } else {
                    this.f14270f.getSegment(f17, f18, path, true);
                }
                path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            this.f14266b.addPath(path, this.f14267c);
            if (cVar.f14238h.l()) {
                j5.d dVar2 = cVar.f14238h;
                if (this.f14269e == null) {
                    Paint paint = new Paint(1);
                    this.f14269e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f14269e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f14267c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f14240j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f14240j));
                }
                paint2.setColorFilter(colorFilter);
                this.f14266b.setFillType(cVar.f14262c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f14266b, paint2);
            }
            if (cVar.f14236f.l()) {
                j5.d dVar3 = cVar.f14236f;
                if (this.f14268d == null) {
                    Paint paint3 = new Paint(1);
                    this.f14268d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f14268d;
                Paint.Join join = cVar.f14245o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f14244n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f14246p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f14267c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f14239i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f14239i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f14237g * fMin * fE);
                canvas.drawPath(this.f14266b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            return fMax > BitmapDescriptorFactory.HUE_RED ? Math.abs(fA) / fMax : BitmapDescriptorFactory.HUE_RED;
        }

        public void b(Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            c(this.f14272h, f14264q, canvas, i11, i12, colorFilter);
        }

        public boolean f() {
            if (this.f14279o == null) {
                this.f14279o = Boolean.valueOf(this.f14272h.a());
            }
            return this.f14279o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f14272h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f14277m;
        }

        public void setAlpha(float f11) {
            setRootAlpha((int) (f11 * 255.0f));
        }

        public void setRootAlpha(int i11) {
            this.f14277m = i11;
        }

        public C0241g(C0241g c0241g) {
            this.f14267c = new Matrix();
            this.f14273i = BitmapDescriptorFactory.HUE_RED;
            this.f14274j = BitmapDescriptorFactory.HUE_RED;
            this.f14275k = BitmapDescriptorFactory.HUE_RED;
            this.f14276l = BitmapDescriptorFactory.HUE_RED;
            this.f14277m = 255;
            this.f14278n = null;
            this.f14279o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f14280p = aVar;
            this.f14272h = new d(c0241g.f14272h, aVar);
            this.f14265a = new Path(c0241g.f14265a);
            this.f14266b = new Path(c0241g.f14266b);
            this.f14273i = c0241g.f14273i;
            this.f14274j = c0241g.f14274j;
            this.f14275k = c0241g.f14275k;
            this.f14276l = c0241g.f14276l;
            this.f14271g = c0241g.f14271g;
            this.f14277m = c0241g.f14277m;
            this.f14278n = c0241g.f14278n;
            String str = c0241g.f14278n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f14279o = c0241g.f14279o;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f14247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<e> f14248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f14249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f14250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f14251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f14252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f14253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f14254h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f14255i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f14256j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f14257k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f14258l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f14259m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            f bVar;
            super();
            this.f14247a = new Matrix();
            this.f14248b = new ArrayList<>();
            this.f14249c = BitmapDescriptorFactory.HUE_RED;
            this.f14250d = BitmapDescriptorFactory.HUE_RED;
            this.f14251e = BitmapDescriptorFactory.HUE_RED;
            this.f14252f = 1.0f;
            this.f14253g = 1.0f;
            this.f14254h = BitmapDescriptorFactory.HUE_RED;
            this.f14255i = BitmapDescriptorFactory.HUE_RED;
            Matrix matrix = new Matrix();
            this.f14256j = matrix;
            this.f14259m = null;
            this.f14249c = dVar.f14249c;
            this.f14250d = dVar.f14250d;
            this.f14251e = dVar.f14251e;
            this.f14252f = dVar.f14252f;
            this.f14253g = dVar.f14253g;
            this.f14254h = dVar.f14254h;
            this.f14255i = dVar.f14255i;
            this.f14258l = dVar.f14258l;
            String str = dVar.f14259m;
            this.f14259m = str;
            this.f14257k = dVar.f14257k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f14256j);
            ArrayList<e> arrayList = dVar.f14248b;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                e eVar = arrayList.get(i11);
                if (eVar instanceof d) {
                    this.f14248b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f14248b.add(bVar);
                    String str2 = bVar.f14261b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f14256j.reset();
            this.f14256j.postTranslate(-this.f14250d, -this.f14251e);
            this.f14256j.postScale(this.f14252f, this.f14253g);
            this.f14256j.postRotate(this.f14249c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f14256j.postTranslate(this.f14254h + this.f14250d, this.f14255i + this.f14251e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f14258l = null;
            this.f14249c = k.j(typedArray, xmlPullParser, "rotation", 5, this.f14249c);
            this.f14250d = typedArray.getFloat(1, this.f14250d);
            this.f14251e = typedArray.getFloat(2, this.f14251e);
            this.f14252f = k.j(typedArray, xmlPullParser, "scaleX", 3, this.f14252f);
            this.f14253g = k.j(typedArray, xmlPullParser, "scaleY", 4, this.f14253g);
            this.f14254h = k.j(typedArray, xmlPullParser, "translateX", 6, this.f14254h);
            this.f14255i = k.j(typedArray, xmlPullParser, "translateY", 7, this.f14255i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f14259m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i11 = 0; i11 < this.f14248b.size(); i11++) {
                if (this.f14248b.get(i11).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i11 = 0; i11 < this.f14248b.size(); i11++) {
                zB |= this.f14248b.get(i11).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14196b);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public String getGroupName() {
            return this.f14259m;
        }

        public Matrix getLocalMatrix() {
            return this.f14256j;
        }

        public float getPivotX() {
            return this.f14250d;
        }

        public float getPivotY() {
            return this.f14251e;
        }

        public float getRotation() {
            return this.f14249c;
        }

        public float getScaleX() {
            return this.f14252f;
        }

        public float getScaleY() {
            return this.f14253g;
        }

        public float getTranslateX() {
            return this.f14254h;
        }

        public float getTranslateY() {
            return this.f14255i;
        }

        public void setPivotX(float f11) {
            if (f11 != this.f14250d) {
                this.f14250d = f11;
                d();
            }
        }

        public void setPivotY(float f11) {
            if (f11 != this.f14251e) {
                this.f14251e = f11;
                d();
            }
        }

        public void setRotation(float f11) {
            if (f11 != this.f14249c) {
                this.f14249c = f11;
                d();
            }
        }

        public void setScaleX(float f11) {
            if (f11 != this.f14252f) {
                this.f14252f = f11;
                d();
            }
        }

        public void setScaleY(float f11) {
            if (f11 != this.f14253g) {
                this.f14253g = f11;
                d();
            }
        }

        public void setTranslateX(float f11) {
            if (f11 != this.f14254h) {
                this.f14254h = f11;
                d();
            }
        }

        public void setTranslateY(float f11) {
            if (f11 != this.f14255i) {
                this.f14255i = f11;
                d();
            }
        }

        public d() {
            super();
            this.f14247a = new Matrix();
            this.f14248b = new ArrayList<>();
            this.f14249c = BitmapDescriptorFactory.HUE_RED;
            this.f14250d = BitmapDescriptorFactory.HUE_RED;
            this.f14251e = BitmapDescriptorFactory.HUE_RED;
            this.f14252f = 1.0f;
            this.f14253g = 1.0f;
            this.f14254h = BitmapDescriptorFactory.HUE_RED;
            this.f14255i = BitmapDescriptorFactory.HUE_RED;
            this.f14256j = new Matrix();
            this.f14259m = null;
        }
    }
}
