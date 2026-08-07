package pt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j5.h;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f103988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f103989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f103990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f103991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f103992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f103993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f103994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f103995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f103996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f103997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f103998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f103999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f104000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f104001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f104002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f104003p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Typeface f104004q;

    class a extends h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f104005a;

        a(f fVar) {
            this.f104005a = fVar;
        }

        @Override // j5.h.f
        public void f(int i11) {
            d.this.f104003p = true;
            this.f104005a.a(i11);
        }

        @Override // j5.h.f
        public void g(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f104004q = Typeface.create(typeface, dVar.f103992e);
            d.this.f104003p = true;
            this.f104005a.b(d.this.f104004q, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f104007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f104008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f104009c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f104007a = context;
            this.f104008b = textPaint;
            this.f104009c = fVar;
        }

        @Override // pt.f
        public void a(int i11) {
            this.f104009c.a(i11);
        }

        @Override // pt.f
        public void b(@NonNull Typeface typeface, boolean z11) {
            d.this.p(this.f104007a, this.f104008b, typeface);
            this.f104009c.b(typeface, z11);
        }
    }

    public d(@NonNull Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, m.f129125z8);
        l(typedArrayObtainStyledAttributes.getDimension(m.A8, BitmapDescriptorFactory.HUE_RED));
        k(c.a(context, typedArrayObtainStyledAttributes, m.D8));
        this.f103988a = c.a(context, typedArrayObtainStyledAttributes, m.E8);
        this.f103989b = c.a(context, typedArrayObtainStyledAttributes, m.F8);
        this.f103992e = typedArrayObtainStyledAttributes.getInt(m.C8, 0);
        this.f103993f = typedArrayObtainStyledAttributes.getInt(m.B8, 1);
        int iG = c.g(typedArrayObtainStyledAttributes, m.L8, m.K8);
        this.f104002o = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f103991d = typedArrayObtainStyledAttributes.getString(iG);
        this.f103994g = typedArrayObtainStyledAttributes.getBoolean(m.M8, false);
        this.f103990c = c.a(context, typedArrayObtainStyledAttributes, m.G8);
        this.f103995h = typedArrayObtainStyledAttributes.getFloat(m.H8, BitmapDescriptorFactory.HUE_RED);
        this.f103996i = typedArrayObtainStyledAttributes.getFloat(m.I8, BitmapDescriptorFactory.HUE_RED);
        this.f103997j = typedArrayObtainStyledAttributes.getFloat(m.J8, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i11, m.N5);
        this.f103998k = typedArrayObtainStyledAttributes2.hasValue(m.O5);
        this.f103999l = typedArrayObtainStyledAttributes2.getFloat(m.O5, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f104004q == null && (str = this.f103991d) != null) {
            this.f104004q = Typeface.create(str, this.f103992e);
        }
        if (this.f104004q == null) {
            int i11 = this.f103993f;
            if (i11 == 1) {
                this.f104004q = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f104004q = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f104004q = Typeface.DEFAULT;
            } else {
                this.f104004q = Typeface.MONOSPACE;
            }
            this.f104004q = Typeface.create(this.f104004q, this.f103992e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i11 = this.f104002o;
        return (i11 != 0 ? h.c(context, i11) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f104004q;
    }

    @NonNull
    public Typeface f(@NonNull Context context) {
        if (this.f104003p) {
            return this.f104004q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = h.h(context, this.f104002o);
                this.f104004q = typefaceH;
                if (typefaceH != null) {
                    this.f104004q = Typeface.create(typefaceH, this.f103992e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e11) {
                Log.d("TextAppearance", "Error loading font " + this.f103991d, e11);
            }
        }
        d();
        this.f104003p = true;
        return this.f104004q;
    }

    public void g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(@NonNull Context context, @NonNull f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i11 = this.f104002o;
        if (i11 == 0) {
            this.f104003p = true;
        }
        if (this.f104003p) {
            fVar.b(this.f104004q, true);
            return;
        }
        try {
            h.j(context, i11, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f104003p = true;
            fVar.a(1);
        } catch (Exception e11) {
            Log.d("TextAppearance", "Error loading font " + this.f103991d, e11);
            this.f104003p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f104000m;
    }

    public float j() {
        return this.f104001n;
    }

    public void k(ColorStateList colorStateList) {
        this.f104000m = colorStateList;
    }

    public void l(float f11) {
        this.f104001n = f11;
    }

    public void n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f104000m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f11 = this.f103997j;
        float f12 = this.f103995h;
        float f13 = this.f103996i;
        ColorStateList colorStateList2 = this.f103990c;
        textPaint.setShadowLayer(f11, f12, f13, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceA = g.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i11 = this.f103992e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i11 & 1) != 0);
        textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : BitmapDescriptorFactory.HUE_RED);
        textPaint.setTextSize(this.f104001n);
        if (this.f103998k) {
            textPaint.setLetterSpacing(this.f103999l);
        }
    }
}
