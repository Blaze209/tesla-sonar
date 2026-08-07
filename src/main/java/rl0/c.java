package rl0;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float[] f108574x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f108575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f108576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f108577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f108578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f108579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f108580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final int f108581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final int f108582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f108583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final int f108584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final int f108585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final int f108586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final int f108587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Typeface f108588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Typeface f108589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final int f108590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final int f108591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final int f108592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final int f108593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final Typeface f108594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final float[] f108595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final int f108596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final int f108597w;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f108598a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f108600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f108601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f108602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f108603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f108604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f108605h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f108606i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f108607j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f108608k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f108609l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f108610m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Typeface f108611n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Typeface f108612o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f108613p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f108614q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f108616s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Typeface f108617t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private float[] f108618u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f108619v;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f108599b = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f108615r = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f108620w = -1;

        a() {
        }

        @NonNull
        public a A(int i11) {
            this.f108604g = i11;
            return this;
        }

        @NonNull
        public a B(int i11) {
            this.f108610m = i11;
            return this;
        }

        @NonNull
        public a C(int i11) {
            this.f108615r = i11;
            return this;
        }

        @NonNull
        public a D(int i11) {
            this.f108620w = i11;
            return this;
        }

        @NonNull
        public a x(int i11) {
            this.f108600c = i11;
            return this;
        }

        @NonNull
        public a y(int i11) {
            this.f108601d = i11;
            return this;
        }

        @NonNull
        public c z() {
            return new c(this);
        }
    }

    protected c(@NonNull a aVar) {
        this.f108575a = aVar.f108598a;
        this.f108576b = aVar.f108599b;
        this.f108577c = aVar.f108600c;
        this.f108578d = aVar.f108601d;
        this.f108579e = aVar.f108602e;
        this.f108580f = aVar.f108603f;
        this.f108581g = aVar.f108604g;
        this.f108582h = aVar.f108605h;
        this.f108583i = aVar.f108606i;
        this.f108584j = aVar.f108607j;
        this.f108585k = aVar.f108608k;
        this.f108586l = aVar.f108609l;
        this.f108587m = aVar.f108610m;
        this.f108588n = aVar.f108611n;
        this.f108589o = aVar.f108612o;
        this.f108590p = aVar.f108613p;
        this.f108591q = aVar.f108614q;
        this.f108592r = aVar.f108615r;
        this.f108593s = aVar.f108616s;
        this.f108594t = aVar.f108617t;
        this.f108595u = aVar.f108618u;
        this.f108596v = aVar.f108619v;
        this.f108597w = aVar.f108620w;
    }

    @NonNull
    public static a i(@NonNull Context context) {
        xl0.b bVarA = xl0.b.a(context);
        return new a().B(bVarA.b(8)).x(bVarA.b(24)).y(bVarA.b(4)).A(bVarA.b(1)).C(bVarA.b(1)).D(bVarA.b(4));
    }

    public void a(@NonNull Paint paint) {
        int iA = this.f108579e;
        if (iA == 0) {
            iA = xl0.a.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
    }

    public void b(@NonNull Paint paint) {
        int i11 = this.f108584j;
        if (i11 == 0) {
            i11 = this.f108583i;
        }
        if (i11 != 0) {
            paint.setColor(i11);
        }
        Typeface typeface = this.f108589o;
        if (typeface == null) {
            typeface = this.f108588n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i12 = this.f108591q;
            if (i12 <= 0) {
                i12 = this.f108590p;
            }
            if (i12 > 0) {
                paint.setTextSize(i12);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i13 = this.f108591q;
        if (i13 <= 0) {
            i13 = this.f108590p;
        }
        if (i13 > 0) {
            paint.setTextSize(i13);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i11 = this.f108583i;
        if (i11 != 0) {
            paint.setColor(i11);
        }
        Typeface typeface = this.f108588n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i12 = this.f108590p;
            if (i12 > 0) {
                paint.setTextSize(i12);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i13 = this.f108590p;
        if (i13 > 0) {
            paint.setTextSize(i13);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int iA = this.f108593s;
        if (iA == 0) {
            iA = xl0.a.a(paint.getColor(), 75);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f108592r;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public void e(@NonNull Paint paint, int i11) {
        Typeface typeface = this.f108594t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f108595u;
        if (fArr == null) {
            fArr = f108574x;
        }
        if (fArr == null || fArr.length < i11) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i11), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i11 - 1]);
    }

    public void f(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.f108576b);
        int i11 = this.f108575a;
        if (i11 != 0) {
            textPaint.setColor(i11);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void g(@NonNull Paint paint) {
        int color = this.f108580f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i11 = this.f108581g;
        if (i11 != 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public void h(@NonNull Paint paint) {
        int iA = this.f108596v;
        if (iA == 0) {
            iA = xl0.a.a(paint.getColor(), 25);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f108597w;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public int j() {
        return this.f108577c;
    }

    public int k() {
        int i11 = this.f108578d;
        return i11 == 0 ? (int) ((this.f108577c * 0.25f) + 0.5f) : i11;
    }

    public int l(int i11) {
        int iMin = Math.min(this.f108577c, i11) / 2;
        int i12 = this.f108582h;
        return (i12 == 0 || i12 > iMin) ? iMin : i12;
    }

    public int m(@NonNull Paint paint) {
        int i11 = this.f108585k;
        return i11 != 0 ? i11 : xl0.a.a(paint.getColor(), 25);
    }

    public int n(@NonNull Paint paint) {
        int i11 = this.f108586l;
        if (i11 == 0) {
            i11 = this.f108585k;
        }
        return i11 != 0 ? i11 : xl0.a.a(paint.getColor(), 25);
    }

    public int o() {
        return this.f108587m;
    }
}
