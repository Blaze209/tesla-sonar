package gs;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import org.checkerframework.dataflow.qual.Pure;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f69473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f69474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f69475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f69476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f69477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f69478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f69479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f69480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f69481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f69482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f69483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f69484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f69485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f69486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f69487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f69488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f69489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f69464r = new C1421b().o("").a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f69465s = p0.t0(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f69466t = p0.t0(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f69467u = p0.t0(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f69468v = p0.t0(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f69469w = p0.t0(4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f69470x = p0.t0(5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f69471y = p0.t0(6);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f69472z = p0.t0(7);
    private static final String A = p0.t0(8);
    private static final String B = p0.t0(9);
    private static final String C = p0.t0(10);
    private static final String D = p0.t0(11);
    private static final String E = p0.t0(12);
    private static final String F = p0.t0(13);
    private static final String G = p0.t0(14);
    private static final String H = p0.t0(15);
    private static final String I = p0.t0(16);
    public static final com.google.android.exoplayer2.g.a<b> J = new com.google.android.exoplayer2.g.a() { // from class: gs.a
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return b.c(bundle);
        }
    };

    /* JADX INFO: renamed from: gs.b$b, reason: collision with other inner class name */
    public static final class C1421b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f69490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f69491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f69492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f69493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f69494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f69495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f69496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f69497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f69498i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f69499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f69500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f69501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f69502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f69503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f69504o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f69505p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f69506q;

        public b a() {
            return new b(this.f69490a, this.f69492c, this.f69493d, this.f69491b, this.f69494e, this.f69495f, this.f69496g, this.f69497h, this.f69498i, this.f69499j, this.f69500k, this.f69501l, this.f69502m, this.f69503n, this.f69504o, this.f69505p, this.f69506q);
        }

        public C1421b b() {
            this.f69503n = false;
            return this;
        }

        @Pure
        public int c() {
            return this.f69496g;
        }

        @Pure
        public int d() {
            return this.f69498i;
        }

        @Pure
        public CharSequence e() {
            return this.f69490a;
        }

        public C1421b f(Bitmap bitmap) {
            this.f69491b = bitmap;
            return this;
        }

        public C1421b g(float f11) {
            this.f69502m = f11;
            return this;
        }

        public C1421b h(float f11, int i11) {
            this.f69494e = f11;
            this.f69495f = i11;
            return this;
        }

        public C1421b i(int i11) {
            this.f69496g = i11;
            return this;
        }

        public C1421b j(Layout.Alignment alignment) {
            this.f69493d = alignment;
            return this;
        }

        public C1421b k(float f11) {
            this.f69497h = f11;
            return this;
        }

        public C1421b l(int i11) {
            this.f69498i = i11;
            return this;
        }

        public C1421b m(float f11) {
            this.f69506q = f11;
            return this;
        }

        public C1421b n(float f11) {
            this.f69501l = f11;
            return this;
        }

        public C1421b o(CharSequence charSequence) {
            this.f69490a = charSequence;
            return this;
        }

        public C1421b p(Layout.Alignment alignment) {
            this.f69492c = alignment;
            return this;
        }

        public C1421b q(float f11, int i11) {
            this.f69500k = f11;
            this.f69499j = i11;
            return this;
        }

        public C1421b r(int i11) {
            this.f69505p = i11;
            return this;
        }

        public C1421b s(int i11) {
            this.f69504o = i11;
            this.f69503n = true;
            return this;
        }

        public C1421b() {
            this.f69490a = null;
            this.f69491b = null;
            this.f69492c = null;
            this.f69493d = null;
            this.f69494e = -3.4028235E38f;
            this.f69495f = Integer.MIN_VALUE;
            this.f69496g = Integer.MIN_VALUE;
            this.f69497h = -3.4028235E38f;
            this.f69498i = Integer.MIN_VALUE;
            this.f69499j = Integer.MIN_VALUE;
            this.f69500k = -3.4028235E38f;
            this.f69501l = -3.4028235E38f;
            this.f69502m = -3.4028235E38f;
            this.f69503n = false;
            this.f69504o = -16777216;
            this.f69505p = Integer.MIN_VALUE;
        }

        private C1421b(b bVar) {
            this.f69490a = bVar.f69473a;
            this.f69491b = bVar.f69476d;
            this.f69492c = bVar.f69474b;
            this.f69493d = bVar.f69475c;
            this.f69494e = bVar.f69477e;
            this.f69495f = bVar.f69478f;
            this.f69496g = bVar.f69479g;
            this.f69497h = bVar.f69480h;
            this.f69498i = bVar.f69481i;
            this.f69499j = bVar.f69486n;
            this.f69500k = bVar.f69487o;
            this.f69501l = bVar.f69482j;
            this.f69502m = bVar.f69483k;
            this.f69503n = bVar.f69484l;
            this.f69504o = bVar.f69485m;
            this.f69505p = bVar.f69488p;
            this.f69506q = bVar.f69489q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C1421b c1421b = new C1421b();
        CharSequence charSequence = bundle.getCharSequence(f69465s);
        if (charSequence != null) {
            c1421b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f69466t);
        if (alignment != null) {
            c1421b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f69467u);
        if (alignment2 != null) {
            c1421b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f69468v);
        if (bitmap != null) {
            c1421b.f(bitmap);
        }
        String str = f69469w;
        if (bundle.containsKey(str)) {
            String str2 = f69470x;
            if (bundle.containsKey(str2)) {
                c1421b.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f69471y;
        if (bundle.containsKey(str3)) {
            c1421b.i(bundle.getInt(str3));
        }
        String str4 = f69472z;
        if (bundle.containsKey(str4)) {
            c1421b.k(bundle.getFloat(str4));
        }
        String str5 = A;
        if (bundle.containsKey(str5)) {
            c1421b.l(bundle.getInt(str5));
        }
        String str6 = C;
        if (bundle.containsKey(str6)) {
            String str7 = B;
            if (bundle.containsKey(str7)) {
                c1421b.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = D;
        if (bundle.containsKey(str8)) {
            c1421b.n(bundle.getFloat(str8));
        }
        String str9 = E;
        if (bundle.containsKey(str9)) {
            c1421b.g(bundle.getFloat(str9));
        }
        String str10 = F;
        if (bundle.containsKey(str10)) {
            c1421b.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(G, false)) {
            c1421b.b();
        }
        String str11 = H;
        if (bundle.containsKey(str11)) {
            c1421b.r(bundle.getInt(str11));
        }
        String str12 = I;
        if (bundle.containsKey(str12)) {
            c1421b.m(bundle.getFloat(str12));
        }
        return c1421b.a();
    }

    public C1421b b() {
        return new C1421b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f69473a, bVar.f69473a) && this.f69474b == bVar.f69474b && this.f69475c == bVar.f69475c && ((bitmap = this.f69476d) != null ? !((bitmap2 = bVar.f69476d) == null || !bitmap.sameAs(bitmap2)) : bVar.f69476d == null) && this.f69477e == bVar.f69477e && this.f69478f == bVar.f69478f && this.f69479g == bVar.f69479g && this.f69480h == bVar.f69480h && this.f69481i == bVar.f69481i && this.f69482j == bVar.f69482j && this.f69483k == bVar.f69483k && this.f69484l == bVar.f69484l && this.f69485m == bVar.f69485m && this.f69486n == bVar.f69486n && this.f69487o == bVar.f69487o && this.f69488p == bVar.f69488p && this.f69489q == bVar.f69489q) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ou.l.b(this.f69473a, this.f69474b, this.f69475c, this.f69476d, Float.valueOf(this.f69477e), Integer.valueOf(this.f69478f), Integer.valueOf(this.f69479g), Float.valueOf(this.f69480h), Integer.valueOf(this.f69481i), Float.valueOf(this.f69482j), Float.valueOf(this.f69483k), Boolean.valueOf(this.f69484l), Integer.valueOf(this.f69485m), Integer.valueOf(this.f69486n), Float.valueOf(this.f69487o), Integer.valueOf(this.f69488p), Float.valueOf(this.f69489q));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f69465s, this.f69473a);
        bundle.putSerializable(f69466t, this.f69474b);
        bundle.putSerializable(f69467u, this.f69475c);
        bundle.putParcelable(f69468v, this.f69476d);
        bundle.putFloat(f69469w, this.f69477e);
        bundle.putInt(f69470x, this.f69478f);
        bundle.putInt(f69471y, this.f69479g);
        bundle.putFloat(f69472z, this.f69480h);
        bundle.putInt(A, this.f69481i);
        bundle.putInt(B, this.f69486n);
        bundle.putFloat(C, this.f69487o);
        bundle.putFloat(D, this.f69482j);
        bundle.putFloat(E, this.f69483k);
        bundle.putBoolean(G, this.f69484l);
        bundle.putInt(F, this.f69485m);
        bundle.putInt(H, this.f69488p);
        bundle.putFloat(I, this.f69489q);
        return bundle;
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f11, int i11, int i12, float f12, int i13, int i14, float f13, float f14, float f15, boolean z11, int i15, int i16, float f16) {
        if (charSequence == null) {
            ts.a.e(bitmap);
        } else {
            ts.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f69473a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f69473a = charSequence.toString();
        } else {
            this.f69473a = null;
        }
        this.f69474b = alignment;
        this.f69475c = alignment2;
        this.f69476d = bitmap;
        this.f69477e = f11;
        this.f69478f = i11;
        this.f69479g = i12;
        this.f69480h = f12;
        this.f69481i = i13;
        this.f69482j = f14;
        this.f69483k = f15;
        this.f69484l = z11;
        this.f69485m = i15;
        this.f69486n = i14;
        this.f69487o = f13;
        this.f69488p = i16;
        this.f69489q = f16;
    }
}
