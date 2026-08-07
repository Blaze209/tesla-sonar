package bt;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.internal.a0;
import java.util.Locale;
import pt.d;
import zs.e;
import zs.j;
import zs.k;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f18072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f18073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f18074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f18075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f18076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f18077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f18078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f18079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f18080k;

    b(Context context, int i11, int i12, int i13, a aVar) {
        a aVar2 = new a();
        this.f18071b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i11 != 0) {
            aVar.f18081a = i11;
        }
        TypedArray typedArrayC = c(context, aVar.f18081a, i12, i13);
        Resources resources = context.getResources();
        this.f18072c = typedArrayC.getDimensionPixelSize(m.J, -1);
        this.f18078i = context.getResources().getDimensionPixelSize(e.f128623c0);
        this.f18079j = context.getResources().getDimensionPixelSize(e.f128627e0);
        this.f18073d = typedArrayC.getDimensionPixelSize(m.T, -1);
        this.f18074e = typedArrayC.getDimension(m.R, resources.getDimension(e.f128662w));
        this.f18076g = typedArrayC.getDimension(m.W, resources.getDimension(e.f128664x));
        this.f18075f = typedArrayC.getDimension(m.I, resources.getDimension(e.f128662w));
        this.f18077h = typedArrayC.getDimension(m.S, resources.getDimension(e.f128664x));
        boolean z11 = true;
        this.f18080k = typedArrayC.getInt(m.f128855d0, 1);
        aVar2.f18089i = aVar.f18089i == -2 ? 255 : aVar.f18089i;
        if (aVar.f18091k != -2) {
            aVar2.f18091k = aVar.f18091k;
        } else if (typedArrayC.hasValue(m.f128843c0)) {
            aVar2.f18091k = typedArrayC.getInt(m.f128843c0, 0);
        } else {
            aVar2.f18091k = -1;
        }
        if (aVar.f18090j != null) {
            aVar2.f18090j = aVar.f18090j;
        } else if (typedArrayC.hasValue(m.M)) {
            aVar2.f18090j = typedArrayC.getString(m.M);
        }
        aVar2.f18095o = aVar.f18095o;
        aVar2.f18096p = aVar.f18096p == null ? context.getString(k.f128784s) : aVar.f18096p;
        aVar2.f18097q = aVar.f18097q == 0 ? j.f128765a : aVar.f18097q;
        aVar2.f18098r = aVar.f18098r == 0 ? k.f128789x : aVar.f18098r;
        if (aVar.f18100t != null && !aVar.f18100t.booleanValue()) {
            z11 = false;
        }
        aVar2.f18100t = Boolean.valueOf(z11);
        aVar2.f18092l = aVar.f18092l == -2 ? typedArrayC.getInt(m.f128819a0, -2) : aVar.f18092l;
        aVar2.f18093m = aVar.f18093m == -2 ? typedArrayC.getInt(m.f128831b0, -2) : aVar.f18093m;
        aVar2.f18085e = Integer.valueOf(aVar.f18085e == null ? typedArrayC.getResourceId(m.K, l.f128793b) : aVar.f18085e.intValue());
        aVar2.f18086f = Integer.valueOf(aVar.f18086f == null ? typedArrayC.getResourceId(m.L, 0) : aVar.f18086f.intValue());
        aVar2.f18087g = Integer.valueOf(aVar.f18087g == null ? typedArrayC.getResourceId(m.U, l.f128793b) : aVar.f18087g.intValue());
        aVar2.f18088h = Integer.valueOf(aVar.f18088h == null ? typedArrayC.getResourceId(m.V, 0) : aVar.f18088h.intValue());
        aVar2.f18082b = Integer.valueOf(aVar.f18082b == null ? J(context, typedArrayC, m.G) : aVar.f18082b.intValue());
        aVar2.f18084d = Integer.valueOf(aVar.f18084d == null ? typedArrayC.getResourceId(m.N, l.f128795d) : aVar.f18084d.intValue());
        if (aVar.f18083c != null) {
            aVar2.f18083c = aVar.f18083c;
        } else if (typedArrayC.hasValue(m.O)) {
            aVar2.f18083c = Integer.valueOf(J(context, typedArrayC, m.O));
        } else {
            aVar2.f18083c = Integer.valueOf(new d(context, aVar2.f18084d.intValue()).i().getDefaultColor());
        }
        aVar2.f18099s = Integer.valueOf(aVar.f18099s == null ? typedArrayC.getInt(m.H, 8388661) : aVar.f18099s.intValue());
        aVar2.f18101u = Integer.valueOf(aVar.f18101u == null ? typedArrayC.getDimensionPixelSize(m.Q, resources.getDimensionPixelSize(e.f128625d0)) : aVar.f18101u.intValue());
        aVar2.f18102v = Integer.valueOf(aVar.f18102v == null ? typedArrayC.getDimensionPixelSize(m.P, resources.getDimensionPixelSize(e.f128666y)) : aVar.f18102v.intValue());
        aVar2.f18103w = Integer.valueOf(aVar.f18103w == null ? typedArrayC.getDimensionPixelOffset(m.X, 0) : aVar.f18103w.intValue());
        aVar2.f18104x = Integer.valueOf(aVar.f18104x == null ? typedArrayC.getDimensionPixelOffset(m.f128867e0, 0) : aVar.f18104x.intValue());
        aVar2.f18105y = Integer.valueOf(aVar.f18105y == null ? typedArrayC.getDimensionPixelOffset(m.Y, aVar2.f18103w.intValue()) : aVar.f18105y.intValue());
        aVar2.f18106z = Integer.valueOf(aVar.f18106z == null ? typedArrayC.getDimensionPixelOffset(m.f128879f0, aVar2.f18104x.intValue()) : aVar.f18106z.intValue());
        aVar2.C = Integer.valueOf(aVar.C == null ? typedArrayC.getDimensionPixelOffset(m.Z, 0) : aVar.C.intValue());
        aVar2.A = Integer.valueOf(aVar.A == null ? 0 : aVar.A.intValue());
        aVar2.B = Integer.valueOf(aVar.B == null ? 0 : aVar.B.intValue());
        aVar2.D = Boolean.valueOf(aVar.D == null ? typedArrayC.getBoolean(m.F, false) : aVar.D.booleanValue());
        typedArrayC.recycle();
        if (aVar.f18094n == null) {
            aVar2.f18094n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f18094n = aVar.f18094n;
        }
        this.f18070a = aVar;
    }

    private static int J(Context context, @NonNull TypedArray typedArray, int i11) {
        return pt.c.a(context, typedArray, i11).getDefaultColor();
    }

    private TypedArray c(Context context, int i11, int i12, int i13) {
        AttributeSet attributeSetK;
        int styleAttribute;
        if (i11 != 0) {
            attributeSetK = com.google.android.material.drawable.c.k(context, i11, "badge");
            styleAttribute = attributeSetK.getStyleAttribute();
        } else {
            attributeSetK = null;
            styleAttribute = 0;
        }
        return a0.i(context, attributeSetK, m.E, i12, styleAttribute == 0 ? i13 : styleAttribute, new int[0]);
    }

    a A() {
        return this.f18070a;
    }

    String B() {
        return this.f18071b.f18090j;
    }

    int C() {
        return this.f18071b.f18084d.intValue();
    }

    int D() {
        return this.f18071b.f18106z.intValue();
    }

    int E() {
        return this.f18071b.f18104x.intValue();
    }

    boolean F() {
        return this.f18071b.f18091k != -1;
    }

    boolean G() {
        return this.f18071b.f18090j != null;
    }

    boolean H() {
        return this.f18071b.D.booleanValue();
    }

    boolean I() {
        return this.f18071b.f18100t.booleanValue();
    }

    void K(int i11) {
        this.f18070a.f18089i = i11;
        this.f18071b.f18089i = i11;
    }

    void L(int i11) {
        this.f18070a.f18082b = Integer.valueOf(i11);
        this.f18071b.f18082b = Integer.valueOf(i11);
    }

    void M(int i11) {
        this.f18070a.f18083c = Integer.valueOf(i11);
        this.f18071b.f18083c = Integer.valueOf(i11);
    }

    void N(int i11) {
        this.f18070a.f18091k = i11;
        this.f18071b.f18091k = i11;
    }

    void O(String str) {
        this.f18070a.f18090j = str;
        this.f18071b.f18090j = str;
    }

    void P(boolean z11) {
        this.f18070a.f18100t = Boolean.valueOf(z11);
        this.f18071b.f18100t = Boolean.valueOf(z11);
    }

    void a() {
        N(-1);
    }

    void b() {
        O(null);
    }

    int d() {
        return this.f18071b.A.intValue();
    }

    int e() {
        return this.f18071b.B.intValue();
    }

    int f() {
        return this.f18071b.f18089i;
    }

    int g() {
        return this.f18071b.f18082b.intValue();
    }

    int h() {
        return this.f18071b.f18099s.intValue();
    }

    int i() {
        return this.f18071b.f18101u.intValue();
    }

    int j() {
        return this.f18071b.f18086f.intValue();
    }

    int k() {
        return this.f18071b.f18085e.intValue();
    }

    int l() {
        return this.f18071b.f18083c.intValue();
    }

    int m() {
        return this.f18071b.f18102v.intValue();
    }

    int n() {
        return this.f18071b.f18088h.intValue();
    }

    int o() {
        return this.f18071b.f18087g.intValue();
    }

    int p() {
        return this.f18071b.f18098r;
    }

    CharSequence q() {
        return this.f18071b.f18095o;
    }

    CharSequence r() {
        return this.f18071b.f18096p;
    }

    int s() {
        return this.f18071b.f18097q;
    }

    int t() {
        return this.f18071b.f18105y.intValue();
    }

    int u() {
        return this.f18071b.f18103w.intValue();
    }

    int v() {
        return this.f18071b.C.intValue();
    }

    int w() {
        return this.f18071b.f18092l;
    }

    int x() {
        return this.f18071b.f18093m;
    }

    int y() {
        return this.f18071b.f18091k;
    }

    Locale z() {
        return this.f18071b.f18094n;
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0361a();
        private Integer A;
        private Integer B;
        private Integer C;
        private Boolean D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f18082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f18083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f18084d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f18085e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f18086f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f18087g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f18088h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f18089i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f18090j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f18091k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f18092l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f18093m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Locale f18094n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private CharSequence f18095o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private CharSequence f18096p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f18097q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f18098r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Integer f18099s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Boolean f18100t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f18101u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f18102v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f18103w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Integer f18104x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Integer f18105y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Integer f18106z;

        /* JADX INFO: renamed from: bt.b$a$a, reason: collision with other inner class name */
        class C0361a implements Parcelable.Creator<a> {
            C0361a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(@NonNull Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a() {
            this.f18089i = 255;
            this.f18091k = -2;
            this.f18092l = -2;
            this.f18093m = -2;
            this.f18100t = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeInt(this.f18081a);
            parcel.writeSerializable(this.f18082b);
            parcel.writeSerializable(this.f18083c);
            parcel.writeSerializable(this.f18084d);
            parcel.writeSerializable(this.f18085e);
            parcel.writeSerializable(this.f18086f);
            parcel.writeSerializable(this.f18087g);
            parcel.writeSerializable(this.f18088h);
            parcel.writeInt(this.f18089i);
            parcel.writeString(this.f18090j);
            parcel.writeInt(this.f18091k);
            parcel.writeInt(this.f18092l);
            parcel.writeInt(this.f18093m);
            CharSequence charSequence = this.f18095o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f18096p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f18097q);
            parcel.writeSerializable(this.f18099s);
            parcel.writeSerializable(this.f18101u);
            parcel.writeSerializable(this.f18102v);
            parcel.writeSerializable(this.f18103w);
            parcel.writeSerializable(this.f18104x);
            parcel.writeSerializable(this.f18105y);
            parcel.writeSerializable(this.f18106z);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.f18100t);
            parcel.writeSerializable(this.f18094n);
            parcel.writeSerializable(this.D);
        }

        a(@NonNull Parcel parcel) {
            this.f18089i = 255;
            this.f18091k = -2;
            this.f18092l = -2;
            this.f18093m = -2;
            this.f18100t = Boolean.TRUE;
            this.f18081a = parcel.readInt();
            this.f18082b = (Integer) parcel.readSerializable();
            this.f18083c = (Integer) parcel.readSerializable();
            this.f18084d = (Integer) parcel.readSerializable();
            this.f18085e = (Integer) parcel.readSerializable();
            this.f18086f = (Integer) parcel.readSerializable();
            this.f18087g = (Integer) parcel.readSerializable();
            this.f18088h = (Integer) parcel.readSerializable();
            this.f18089i = parcel.readInt();
            this.f18090j = parcel.readString();
            this.f18091k = parcel.readInt();
            this.f18092l = parcel.readInt();
            this.f18093m = parcel.readInt();
            this.f18095o = parcel.readString();
            this.f18096p = parcel.readString();
            this.f18097q = parcel.readInt();
            this.f18099s = (Integer) parcel.readSerializable();
            this.f18101u = (Integer) parcel.readSerializable();
            this.f18102v = (Integer) parcel.readSerializable();
            this.f18103w = (Integer) parcel.readSerializable();
            this.f18104x = (Integer) parcel.readSerializable();
            this.f18105y = (Integer) parcel.readSerializable();
            this.f18106z = (Integer) parcel.readSerializable();
            this.C = (Integer) parcel.readSerializable();
            this.A = (Integer) parcel.readSerializable();
            this.B = (Integer) parcel.readSerializable();
            this.f18100t = (Boolean) parcel.readSerializable();
            this.f18094n = (Locale) parcel.readSerializable();
            this.D = (Boolean) parcel.readSerializable();
        }
    }
}
