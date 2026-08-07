package com.ijzerenhein.sharedelement;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ll.s;

/* JADX INFO: loaded from: classes6.dex */
class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v0 f45555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f45556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f45557c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f45558d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f45559e = b.NONE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f45560f = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45561g = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f45562h = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45563a;

        static {
            int[] iArr = new int[b.values().length];
            f45563a = iArr;
            try {
                iArr[b.REACTIMAGEVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45563a[b.IMAGEVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45563a[b.PLAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45563a[b.GENERIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum b {
        NONE("none"),
        REACTIMAGEVIEW("image"),
        IMAGEVIEW("image"),
        PLAIN("view"),
        GENERIC("generic");

        private final String value;

        b(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public d(v0 v0Var) {
        this.f45555a = null;
        this.f45556b = null;
        this.f45555a = v0Var;
        this.f45556b = new View(v0Var);
    }

    private void a(Canvas canvas) {
        this.f45557c.f45553a.draw(canvas);
    }

    private void b(Canvas canvas) {
        ImageView imageView = (ImageView) this.f45557c.f45553a;
        j jVar = this.f45558d;
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            return;
        }
        Rect rect = new Rect(drawable.getBounds());
        RectF rectF = this.f45557c.f45554b;
        int i11 = (int) rectF.right;
        int i12 = (int) rectF.bottom;
        drawable.setBounds(0, 0, i11, i12);
        Matrix matrix = new Matrix();
        jVar.f45603e.a(matrix, getBounds(), i11, i12, 0.5f, 0.5f);
        int iSave = canvas.save();
        canvas.concat(matrix);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
        drawable.setBounds(rect);
    }

    private void c(Canvas canvas) {
        j jVar = this.f45558d;
        com.facebook.react.uimanager.a.o(this.f45556b, Integer.valueOf(jVar.f45604f));
        com.facebook.react.uimanager.a.s(this.f45556b, so.f.fromString(jVar.f45612n));
        View view = this.f45556b;
        so.n nVar = so.n.ALL;
        com.facebook.react.uimanager.a.q(view, nVar, Integer.valueOf(jVar.f45611m));
        com.facebook.react.uimanager.a.t(this.f45556b, nVar, Float.valueOf(jVar.f45610l / 2.0f));
        View view2 = this.f45556b;
        so.d dVar = so.d.BORDER_TOP_LEFT_RADIUS;
        float f11 = jVar.f45606h;
        com.facebook.react.uimanager.p pVar = com.facebook.react.uimanager.p.POINT;
        com.facebook.react.uimanager.a.r(view2, dVar, new LengthPercentage(f11, pVar));
        com.facebook.react.uimanager.a.r(this.f45556b, so.d.BORDER_TOP_RIGHT_RADIUS, new LengthPercentage(jVar.f45607i, pVar));
        com.facebook.react.uimanager.a.r(this.f45556b, so.d.BORDER_BOTTOM_RIGHT_RADIUS, new LengthPercentage(jVar.f45609k, pVar));
        com.facebook.react.uimanager.a.r(this.f45556b, so.d.BORDER_BOTTOM_LEFT_RADIUS, new LengthPercentage(jVar.f45608j, pVar));
        Drawable background = this.f45556b.getBackground();
        background.setBounds(getBounds());
        background.draw(canvas);
    }

    private void d(Canvas canvas) {
        com.facebook.react.views.image.h hVar = (com.facebook.react.views.image.h) this.f45557c.f45553a;
        j jVar = this.f45558d;
        ml.a hierarchy = hVar.getHierarchy();
        Drawable drawableB = hierarchy.b();
        if (drawableB == null) {
            return;
        }
        Rect rect = new Rect(drawableB.getBounds());
        s sVarN = hierarchy.n();
        ml.e eVarQ = hierarchy.q();
        int iO = hierarchy.o();
        drawableB.setBounds(getBounds());
        hierarchy.v(jVar.f45603e);
        ml.e eVar = new ml.e();
        eVar.m(jVar.f45611m);
        eVar.n(jVar.f45610l);
        eVar.u(ml.e.a.BITMAP_ONLY);
        eVar.o(jVar.f45606h, jVar.f45607i, jVar.f45609k, jVar.f45608j);
        hierarchy.C(eVar);
        hierarchy.w(null);
        hierarchy.y(0);
        drawableB.draw(canvas);
        hierarchy.y(iO);
        hierarchy.w(null);
        hierarchy.C(eVarQ);
        hierarchy.v(sVarN);
        drawableB.setBounds(rect);
    }

    static b e(View view, j jVar) {
        if (view == null) {
            return b.NONE;
        }
        if (view instanceof com.facebook.react.views.image.h) {
            return b.REACTIMAGEVIEW;
        }
        if (view instanceof ImageView) {
            return b.IMAGEVIEW;
        }
        if ((view instanceof com.facebook.react.views.view.e) && ((com.facebook.react.views.view.e) view).getChildCount() == 0) {
            return jVar.j() ? b.PLAIN : b.NONE;
        }
        return b.GENERIC;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11 = a.f45563a[this.f45559e.ordinal()];
        if (i11 == 1) {
            d(canvas);
            return;
        }
        if (i11 == 2) {
            b(canvas);
        } else if (i11 == 3) {
            c(canvas);
        } else {
            if (i11 != 4) {
                return;
            }
            a(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    b f(c cVar, j jVar, float f11) {
        boolean z11;
        boolean z12 = true;
        if (this.f45557c != cVar) {
            this.f45557c = cVar;
            z11 = true;
        } else {
            z11 = false;
        }
        c cVar2 = this.f45557c;
        b bVarE = cVar2 != null ? e(cVar2.f45553a, jVar) : b.NONE;
        if (this.f45559e != bVarE) {
            this.f45559e = bVarE;
            z11 = true;
        }
        if (this.f45558d != null && jVar != null && !z11) {
            int i11 = a.f45563a[bVarE.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if ((this.f45558d.a(jVar) & (j.B | j.f45592t | j.C)) == 0) {
                    z12 = false;
                }
                z11 = z12;
            } else if (i11 == 3) {
                if ((this.f45558d.a(jVar) & (j.B | j.f45592t)) == 0) {
                    z12 = false;
                }
                z11 = z12;
            }
        }
        this.f45558d = jVar;
        this.f45560f = f11;
        if (z11) {
            invalidateSelf();
        }
        return bVarE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45561g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        j jVar = this.f45558d;
        if (jVar == null) {
            outline.setRect(getBounds());
            return;
        }
        if (jVar.f45606h == BitmapDescriptorFactory.HUE_RED && jVar.f45607i == BitmapDescriptorFactory.HUE_RED && jVar.f45608j == BitmapDescriptorFactory.HUE_RED && jVar.f45609k == BitmapDescriptorFactory.HUE_RED) {
            outline.setRect(getBounds());
            return;
        }
        Path path = this.f45562h;
        if (path == null) {
            this.f45562h = new Path();
        } else {
            path.reset();
        }
        float f11 = this.f45558d.f45610l / 2.0f;
        Path path2 = this.f45562h;
        RectF rectF = new RectF(getBounds());
        j jVar2 = this.f45558d;
        float f12 = jVar2.f45606h;
        float f13 = jVar2.f45607i;
        float f14 = jVar2.f45609k;
        float f15 = jVar2.f45608j;
        path2.addRoundRect(rectF, new float[]{f12 + f11, f12 + f11, f13 + f11, f13 + f11, f14 + f11, f14 + f11, f15 + f11, f15 + f11}, Path.Direction.CW);
        outline.setConvexPath(this.f45562h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f45561g) {
            this.f45561g = i11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
