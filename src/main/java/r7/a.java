package r7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.dataflow.qual.Pure;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f107066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f107067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f107068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f107069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f107070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f107071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f107073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f107074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f107075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f107076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f107077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f107078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f107079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f107080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f107081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f107082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f107083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final a f107058s = new b().o("").a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f107059t = q0.N0(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f107060u = q0.N0(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f107061v = q0.N0(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f107062w = q0.N0(2);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f107063x = q0.N0(3);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f107064y = q0.N0(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f107065z = q0.N0(4);
    private static final String A = q0.N0(5);
    private static final String B = q0.N0(6);
    private static final String C = q0.N0(7);
    private static final String D = q0.N0(8);
    private static final String E = q0.N0(9);
    private static final String F = q0.N0(10);
    private static final String G = q0.N0(11);
    private static final String H = q0.N0(12);
    private static final String I = q0.N0(13);
    private static final String J = q0.N0(14);
    private static final String K = q0.N0(15);
    private static final String L = q0.N0(16);
    private static final String M = q0.N0(19);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f107084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f107085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f107086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f107087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f107088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f107089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f107090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f107091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f107092i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f107093j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f107094k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f107095l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f107096m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f107097n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f107098o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f107099p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f107100q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f107101r;

        public a a() {
            return new a(this.f107084a, this.f107086c, this.f107087d, this.f107085b, this.f107088e, this.f107089f, this.f107090g, this.f107091h, this.f107092i, this.f107093j, this.f107094k, this.f107095l, this.f107096m, this.f107097n, this.f107098o, this.f107099p, this.f107100q, this.f107101r);
        }

        public b b() {
            this.f107097n = false;
            return this;
        }

        @Pure
        public int c() {
            return this.f107090g;
        }

        @Pure
        public int d() {
            return this.f107092i;
        }

        @Pure
        public CharSequence e() {
            return this.f107084a;
        }

        public b f(Bitmap bitmap) {
            this.f107085b = bitmap;
            this.f107084a = null;
            return this;
        }

        public b g(float f11) {
            this.f107096m = f11;
            return this;
        }

        public b h(float f11, int i11) {
            this.f107088e = f11;
            this.f107089f = i11;
            return this;
        }

        public b i(int i11) {
            this.f107090g = i11;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f107087d = alignment;
            return this;
        }

        public b k(float f11) {
            this.f107091h = f11;
            return this;
        }

        public b l(int i11) {
            this.f107092i = i11;
            return this;
        }

        public b m(float f11) {
            this.f107100q = f11;
            return this;
        }

        public b n(float f11) {
            this.f107095l = f11;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f107084a = charSequence;
            this.f107085b = null;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f107086c = alignment;
            return this;
        }

        public b q(float f11, int i11) {
            this.f107094k = f11;
            this.f107093j = i11;
            return this;
        }

        public b r(int i11) {
            this.f107099p = i11;
            return this;
        }

        public b s(int i11) {
            this.f107098o = i11;
            this.f107097n = true;
            return this;
        }

        public b t(int i11) {
            this.f107101r = i11;
            return this;
        }

        public b() {
            this.f107084a = null;
            this.f107085b = null;
            this.f107086c = null;
            this.f107087d = null;
            this.f107088e = -3.4028235E38f;
            this.f107089f = Integer.MIN_VALUE;
            this.f107090g = Integer.MIN_VALUE;
            this.f107091h = -3.4028235E38f;
            this.f107092i = Integer.MIN_VALUE;
            this.f107093j = Integer.MIN_VALUE;
            this.f107094k = -3.4028235E38f;
            this.f107095l = -3.4028235E38f;
            this.f107096m = -3.4028235E38f;
            this.f107097n = false;
            this.f107098o = -16777216;
            this.f107099p = Integer.MIN_VALUE;
        }

        private b(a aVar) {
            this.f107084a = aVar.f107066a;
            this.f107085b = aVar.f107069d;
            this.f107086c = aVar.f107067b;
            this.f107087d = aVar.f107068c;
            this.f107088e = aVar.f107070e;
            this.f107089f = aVar.f107071f;
            this.f107090g = aVar.f107072g;
            this.f107091h = aVar.f107073h;
            this.f107092i = aVar.f107074i;
            this.f107093j = aVar.f107079n;
            this.f107094k = aVar.f107080o;
            this.f107095l = aVar.f107075j;
            this.f107096m = aVar.f107076k;
            this.f107097n = aVar.f107077l;
            this.f107098o = aVar.f107078m;
            this.f107099p = aVar.f107081p;
            this.f107100q = aVar.f107082q;
            this.f107101r = aVar.f107083r;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f107059t);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f107060u);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    f.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f107061v);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f107062w);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f107063x);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f107064y);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f107065z;
        if (bundle.containsKey(str)) {
            String str2 = A;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = B;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = C;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = D;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = F;
        if (bundle.containsKey(str6)) {
            String str7 = E;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = G;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = H;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = I;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(J, false)) {
            bVar.b();
        }
        String str11 = K;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = L;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        String str13 = M;
        if (bundle.containsKey(str13)) {
            bVar.t(bundle.getInt(str13));
        }
        return bVar.a();
    }

    private Bundle d() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f107066a;
        if (charSequence != null) {
            bundle.putCharSequence(f107059t, charSequence);
            CharSequence charSequence2 = this.f107066a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListA = f.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f107060u, arrayListA);
                }
            }
        }
        bundle.putSerializable(f107061v, this.f107067b);
        bundle.putSerializable(f107062w, this.f107068c);
        bundle.putFloat(f107065z, this.f107070e);
        bundle.putInt(A, this.f107071f);
        bundle.putInt(B, this.f107072g);
        bundle.putFloat(C, this.f107073h);
        bundle.putInt(D, this.f107074i);
        bundle.putInt(E, this.f107079n);
        bundle.putFloat(F, this.f107080o);
        bundle.putFloat(G, this.f107075j);
        bundle.putFloat(H, this.f107076k);
        bundle.putBoolean(J, this.f107077l);
        bundle.putInt(I, this.f107078m);
        bundle.putInt(K, this.f107081p);
        bundle.putFloat(L, this.f107082q);
        bundle.putInt(M, this.f107083r);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle c() {
        Bundle bundleD = d();
        Bitmap bitmap = this.f107069d;
        if (bitmap != null) {
            bundleD.putParcelable(f107063x, bitmap);
        }
        return bundleD;
    }

    public Bundle e() {
        Bundle bundleD = d();
        if (this.f107069d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            s7.a.h(this.f107069d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleD.putByteArray(f107064y, byteArrayOutputStream.toByteArray());
        }
        return bundleD;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f107066a, aVar.f107066a) && this.f107067b == aVar.f107067b && this.f107068c == aVar.f107068c && ((bitmap = this.f107069d) != null ? !((bitmap2 = aVar.f107069d) == null || !bitmap.sameAs(bitmap2)) : aVar.f107069d == null) && this.f107070e == aVar.f107070e && this.f107071f == aVar.f107071f && this.f107072g == aVar.f107072g && this.f107073h == aVar.f107073h && this.f107074i == aVar.f107074i && this.f107075j == aVar.f107075j && this.f107076k == aVar.f107076k && this.f107077l == aVar.f107077l && this.f107078m == aVar.f107078m && this.f107079n == aVar.f107079n && this.f107080o == aVar.f107080o && this.f107081p == aVar.f107081p && this.f107082q == aVar.f107082q && this.f107083r == aVar.f107083r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f107066a, this.f107067b, this.f107068c, this.f107069d, Float.valueOf(this.f107070e), Integer.valueOf(this.f107071f), Integer.valueOf(this.f107072g), Float.valueOf(this.f107073h), Integer.valueOf(this.f107074i), Float.valueOf(this.f107075j), Float.valueOf(this.f107076k), Boolean.valueOf(this.f107077l), Integer.valueOf(this.f107078m), Integer.valueOf(this.f107079n), Float.valueOf(this.f107080o), Integer.valueOf(this.f107081p), Float.valueOf(this.f107082q), Integer.valueOf(this.f107083r));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f11, int i11, int i12, float f12, int i13, int i14, float f13, float f14, float f15, boolean z11, int i15, int i16, float f16, int i17) {
        if (charSequence == null) {
            s7.a.f(bitmap);
        } else {
            s7.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f107066a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f107066a = charSequence.toString();
        } else {
            this.f107066a = null;
        }
        this.f107067b = alignment;
        this.f107068c = alignment2;
        this.f107069d = bitmap;
        this.f107070e = f11;
        this.f107071f = i11;
        this.f107072g = i12;
        this.f107073h = f12;
        this.f107074i = i13;
        this.f107075j = f14;
        this.f107076k = f15;
        this.f107077l = z11;
        this.f107078m = i15;
        this.f107079n = i14;
        this.f107080o = f13;
        this.f107081p = i16;
        this.f107082q = f16;
        this.f107083r = i17;
    }
}
