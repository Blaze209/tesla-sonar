package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static r0 f2797i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, androidx.collection.y0<ColorStateList>> f2799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.collection.x0<String, b> f2800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.collection.y0<String> f2801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.v<WeakReference<Drawable.ConstantState>>> f2802d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f2803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f2805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f2796h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f2798j = new a(6);

    private static class a extends androidx.collection.x<Integer, PorterDuffColorFilter> {
        public a(int i11) {
            super(i11);
        }

        private static int a(int i11, PorterDuff.Mode mode) {
            return ((i11 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter b(int i11, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i11, mode)));
        }

        PorterDuffColorFilter c(int i11, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i11, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(@NonNull r0 r0Var, @NonNull Context context, int i11);

        ColorStateList b(@NonNull Context context, int i11);

        PorterDuff.Mode c(int i11);

        boolean d(@NonNull Context context, int i11, @NonNull Drawable drawable);

        boolean e(@NonNull Context context, int i11, @NonNull Drawable drawable);
    }

    private synchronized boolean a(@NonNull Context context, long j11, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.v<WeakReference<Drawable.ConstantState>> vVar = this.f2802d.get(context);
            if (vVar == null) {
                vVar = new androidx.collection.v<>();
                this.f2802d.put(context, vVar);
            }
            vVar.h(j11, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b(@NonNull Context context, int i11, @NonNull ColorStateList colorStateList) {
        if (this.f2799a == null) {
            this.f2799a = new WeakHashMap<>();
        }
        androidx.collection.y0<ColorStateList> y0Var = this.f2799a.get(context);
        if (y0Var == null) {
            y0Var = new androidx.collection.y0<>();
            this.f2799a.put(context, y0Var);
        }
        y0Var.a(i11, colorStateList);
    }

    private void c(@NonNull Context context) {
        if (this.f2804f) {
            return;
        }
        this.f2804f = true;
        Drawable drawableI = i(context, l.a.f89455a);
        if (drawableI == null || !p(drawableI)) {
            this.f2804f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(@NonNull Context context, int i11) {
        if (this.f2803e == null) {
            this.f2803e = new TypedValue();
        }
        TypedValue typedValue = this.f2803e;
        context.getResources().getValue(i11, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f2805g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i11);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized r0 g() {
        try {
            if (f2797i == null) {
                r0 r0Var = new r0();
                f2797i = r0Var;
                o(r0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2797i;
    }

    private synchronized Drawable h(@NonNull Context context, long j11) {
        androidx.collection.v<WeakReference<Drawable.ConstantState>> vVar = this.f2802d.get(context);
        if (vVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceD = vVar.d(j11);
        if (weakReferenceD != null) {
            Drawable.ConstantState constantState = weakReferenceD.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            vVar.i(j11);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterB;
        a aVar = f2798j;
        porterDuffColorFilterB = aVar.b(i11, mode);
        if (porterDuffColorFilterB == null) {
            porterDuffColorFilterB = new PorterDuffColorFilter(i11, mode);
            aVar.c(i11, mode, porterDuffColorFilterB);
        }
        return porterDuffColorFilterB;
    }

    private ColorStateList m(@NonNull Context context, int i11) {
        androidx.collection.y0<ColorStateList> y0Var;
        WeakHashMap<Context, androidx.collection.y0<ColorStateList>> weakHashMap = this.f2799a;
        if (weakHashMap == null || (y0Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return y0Var.e(i11);
    }

    private static void o(@NonNull r0 r0Var) {
    }

    private static boolean p(@NonNull Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(@NonNull Context context, int i11) {
        int next;
        androidx.collection.x0<String, b> x0Var = this.f2800b;
        if (x0Var == null || x0Var.isEmpty()) {
            return null;
        }
        androidx.collection.y0<String> y0Var = this.f2801c;
        if (y0Var != null) {
            String strE = y0Var.e(i11);
            if ("appcompat_skip_skip".equals(strE) || (strE != null && this.f2800b.get(strE) == null)) {
                return null;
            }
        } else {
            this.f2801c = new androidx.collection.y0<>();
        }
        if (this.f2803e == null) {
            this.f2803e = new TypedValue();
        }
        TypedValue typedValue = this.f2803e;
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i11);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f2801c.a(i11, name);
                b bVar = this.f2800b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (drawableH == null) {
            this.f2801c.a(i11, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(@NonNull Context context, int i11, boolean z11, @NonNull Drawable drawable) {
        ColorStateList colorStateListL = l(context, i11);
        if (colorStateListL == null) {
            c cVar = this.f2805g;
            if ((cVar == null || !cVar.d(context, i11, drawable)) && !w(context, i11, drawable) && z11) {
                return null;
            }
            return drawable;
        }
        if (j0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = l5.a.r(drawable);
        l5.a.o(drawableR, colorStateListL);
        PorterDuff.Mode modeN = n(i11);
        if (modeN != null) {
            l5.a.p(drawableR, modeN);
        }
        return drawableR;
    }

    static void v(Drawable drawable, z0 z0Var, int[] iArr) {
        if (j0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z11 = z0Var.f2910d;
        if (z11 || z0Var.f2909c) {
            drawable.setColorFilter(f(z11 ? z0Var.f2907a : null, z0Var.f2909c ? z0Var.f2908b : f2796h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(@NonNull Context context, int i11) {
        return j(context, i11, false);
    }

    synchronized Drawable j(@NonNull Context context, int i11, boolean z11) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i11);
            if (drawableQ == null) {
                drawableQ = e(context, i11);
            }
            if (drawableQ == null) {
                drawableQ = androidx.core.content.b.getDrawable(context, i11);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i11, z11, drawableQ);
            }
            if (drawableQ != null) {
                j0.b(drawableQ);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(@NonNull Context context, int i11) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i11);
        if (colorStateListM == null) {
            c cVar = this.f2805g;
            colorStateListM = cVar == null ? null : cVar.b(context, i11);
            if (colorStateListM != null) {
                b(context, i11, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i11) {
        c cVar = this.f2805g;
        if (cVar == null) {
            return null;
        }
        return cVar.c(i11);
    }

    public synchronized void r(@NonNull Context context) {
        androidx.collection.v<WeakReference<Drawable.ConstantState>> vVar = this.f2802d.get(context);
        if (vVar != null) {
            vVar.a();
        }
    }

    synchronized Drawable s(@NonNull Context context, @NonNull g1 g1Var, int i11) {
        try {
            Drawable drawableQ = q(context, i11);
            if (drawableQ == null) {
                drawableQ = g1Var.c(i11);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i11, false, drawableQ);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(c cVar) {
        this.f2805g = cVar;
    }

    boolean w(@NonNull Context context, int i11, @NonNull Drawable drawable) {
        c cVar = this.f2805g;
        return cVar != null && cVar.e(context, i11, drawable);
    }
}
