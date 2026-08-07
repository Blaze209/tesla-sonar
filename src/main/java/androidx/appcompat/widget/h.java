package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f2696b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static h f2697c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r0 f2698a;

    class a implements r0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f2699a = {i.e.R, i.e.P, i.e.f73774a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f2700b = {i.e.f73788o, i.e.B, i.e.f73793t, i.e.f73789p, i.e.f73790q, i.e.f73792s, i.e.f73791r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f2701c = {i.e.O, i.e.Q, i.e.f73784k, i.e.K, i.e.L, i.e.M, i.e.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f2702d = {i.e.f73796w, i.e.f73782i, i.e.f73795v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f2703e = {i.e.J, i.e.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f2704f = {i.e.f73776c, i.e.f73780g, i.e.f73777d, i.e.f73781h};

        a() {
        }

        private boolean f(int[] iArr, int i11) {
            for (int i12 : iArr) {
                if (i12 == i11) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(@NonNull Context context) {
            return h(context, 0);
        }

        private ColorStateList h(@NonNull Context context, int i11) {
            int iC = w0.c(context, i.a.f73746w);
            return new ColorStateList(new int[][]{w0.f2892b, w0.f2895e, w0.f2893c, w0.f2899i}, new int[]{w0.b(context, i.a.f73744u), k5.d.h(iC, i11), k5.d.h(iC, i11), i11});
        }

        private ColorStateList i(@NonNull Context context) {
            return h(context, w0.c(context, i.a.f73743t));
        }

        private ColorStateList j(@NonNull Context context) {
            return h(context, w0.c(context, i.a.f73744u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = w0.e(context, i.a.A);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = w0.f2892b;
                iArr2[0] = w0.b(context, i.a.A);
                iArr[1] = w0.f2896f;
                iArr2[1] = w0.c(context, i.a.f73745v);
                iArr[2] = w0.f2899i;
                iArr2[2] = w0.c(context, i.a.A);
            } else {
                int[] iArr3 = w0.f2892b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = w0.f2896f;
                iArr2[1] = w0.c(context, i.a.f73745v);
                iArr[2] = w0.f2899i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(@NonNull r0 r0Var, @NonNull Context context, int i11) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
            Drawable drawableI = r0Var.i(context, i.e.F);
            Drawable drawableI2 = r0Var.i(context, i.e.G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i11, PorterDuff.Mode mode) {
            if (j0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = h.f2696b;
            }
            drawable.setColorFilter(h.e(i11, mode));
        }

        @Override // androidx.appcompat.widget.r0.c
        public Drawable a(@NonNull r0 r0Var, @NonNull Context context, int i11) {
            if (i11 == i.e.f73783j) {
                return new LayerDrawable(new Drawable[]{r0Var.i(context, i.e.f73782i), r0Var.i(context, i.e.f73784k)});
            }
            if (i11 == i.e.f73798y) {
                return l(r0Var, context, i.d.f73767i);
            }
            if (i11 == i.e.f73797x) {
                return l(r0Var, context, i.d.f73768j);
            }
            if (i11 == i.e.f73799z) {
                return l(r0Var, context, i.d.f73769k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.r0.c
        public ColorStateList b(@NonNull Context context, int i11) {
            if (i11 == i.e.f73786m) {
                return j.a.a(context, i.c.f73755e);
            }
            if (i11 == i.e.I) {
                return j.a.a(context, i.c.f73758h);
            }
            if (i11 == i.e.H) {
                return k(context);
            }
            if (i11 == i.e.f73779f) {
                return j(context);
            }
            if (i11 == i.e.f73775b) {
                return g(context);
            }
            if (i11 == i.e.f73778e) {
                return i(context);
            }
            if (i11 == i.e.D || i11 == i.e.E) {
                return j.a.a(context, i.c.f73757g);
            }
            if (f(this.f2700b, i11)) {
                return w0.e(context, i.a.f73747x);
            }
            if (f(this.f2703e, i11)) {
                return j.a.a(context, i.c.f73754d);
            }
            if (f(this.f2704f, i11)) {
                return j.a.a(context, i.c.f73753c);
            }
            if (i11 == i.e.A) {
                return j.a.a(context, i.c.f73756f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.r0.c
        public PorterDuff.Mode c(int i11) {
            if (i11 == i.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.r0.c
        public boolean d(@NonNull Context context, int i11, @NonNull Drawable drawable) {
            if (i11 == i.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), w0.c(context, i.a.f73747x), h.f2696b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), w0.c(context, i.a.f73747x), h.f2696b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), w0.c(context, i.a.f73745v), h.f2696b);
                return true;
            }
            if (i11 != i.e.f73798y && i11 != i.e.f73797x && i11 != i.e.f73799z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), w0.b(context, i.a.f73747x), h.f2696b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), w0.c(context, i.a.f73745v), h.f2696b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), w0.c(context, i.a.f73745v), h.f2696b);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0056  */
        /* JADX WARN: Code duplicated, block: B:28:0x0067  */
        /* JADX WARN: Code duplicated, block: B:30:0x006b A[RETURN] */
        @Override // androidx.appcompat.widget.r0.c
        public boolean e(@NonNull Context context, int i11, @NonNull Drawable drawable) {
            int i12;
            boolean z11;
            int iRound;
            PorterDuff.Mode mode = h.f2696b;
            if (!f(this.f2699a, i11)) {
                if (f(this.f2701c, i11)) {
                    i12 = i.a.f73745v;
                } else {
                    if (f(this.f2702d, i11)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i11 == i.e.f73794u) {
                            iRound = Math.round(40.8f);
                            i12 = 16842800;
                            mode = mode;
                        } else if (i11 != i.e.f73785l) {
                            i12 = 0;
                            z11 = false;
                            iRound = -1;
                        }
                        z11 = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i12 = 16842801;
                    z11 = true;
                }
                if (z11) {
                    return false;
                }
                if (j0.a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(h.e(w0.c(context, i12), mode));
                if (iRound != -1) {
                    drawable.setAlpha(iRound);
                }
                return true;
            }
            i12 = i.a.f73747x;
            z11 = true;
            iRound = -1;
            if (z11) {
                return false;
            }
            if (j0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(h.e(w0.c(context, i12), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }
    }

    public static synchronized h b() {
        try {
            if (f2697c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2697c;
    }

    public static synchronized PorterDuffColorFilter e(int i11, PorterDuff.Mode mode) {
        return r0.k(i11, mode);
    }

    public static synchronized void h() {
        if (f2697c == null) {
            h hVar = new h();
            f2697c = hVar;
            hVar.f2698a = r0.g();
            f2697c.f2698a.t(new a());
        }
    }

    static void i(Drawable drawable, z0 z0Var, int[] iArr) {
        r0.v(drawable, z0Var, iArr);
    }

    public synchronized Drawable c(@NonNull Context context, int i11) {
        return this.f2698a.i(context, i11);
    }

    synchronized Drawable d(@NonNull Context context, int i11, boolean z11) {
        return this.f2698a.j(context, i11, z11);
    }

    synchronized ColorStateList f(@NonNull Context context, int i11) {
        return this.f2698a.l(context, i11);
    }

    public synchronized void g(@NonNull Context context) {
        this.f2698a.r(context);
    }
}
