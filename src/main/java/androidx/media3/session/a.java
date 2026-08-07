package androidx.media3.session;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f11447j = s7.q0.N0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f11448k = s7.q0.N0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f11449l = s7.q0.N0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f11450m = s7.q0.N0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f11451n = s7.q0.N0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f11452o = s7.q0.N0(5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f11453p = s7.q0.N0(6);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f11454q = s7.q0.N0(7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f11455r = s7.q0.N0(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se f11456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f11460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f11461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f11462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ru.e f11463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f11464i;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private se f11466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Uri f11469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CharSequence f11470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f11471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f11472h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ru.e f11473i;

        @Deprecated
        public b() {
            this(0);
        }

        public a a() {
            s7.a.i((this.f11466b == null) != (this.f11467c == -1), "Exactly one of sessionCommand and playerCommand should be set");
            if (this.f11473i == null) {
                this.f11473i = ru.e.h(a.g(this.f11467c, this.f11465a));
            }
            return new a(this.f11466b, this.f11467c, this.f11465a, this.f11468d, this.f11469e, this.f11470f, this.f11471g, this.f11472h, this.f11473i);
        }

        public b b(int i11) {
            this.f11468d = i11;
            return this;
        }

        public b c(CharSequence charSequence) {
            this.f11470f = charSequence;
            return this;
        }

        public b d(boolean z11) {
            this.f11472h = z11;
            return this;
        }

        public b e(Bundle bundle) {
            this.f11471g = new Bundle(bundle);
            return this;
        }

        @Deprecated
        public b f(int i11) {
            return b(i11);
        }

        public b g(Uri uri) {
            s7.a.b(Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"), "Only content or resource Uris are supported for CommandButton");
            this.f11469e = uri;
            return this;
        }

        public b h(int i11) {
            s7.a.b(this.f11466b == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            this.f11467c = i11;
            return this;
        }

        public b i(se seVar) {
            s7.a.g(seVar, "sessionCommand should not be null.");
            s7.a.b(this.f11467c == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
            this.f11466b = seVar;
            return this;
        }

        public b j(int... iArr) {
            s7.a.a(iArr.length != 0);
            this.f11473i = ru.e.b(iArr);
            return this;
        }

        public b(int i11) {
            this(i11, a.h(i11));
        }

        b(int i11, int i12) {
            this.f11465a = i11;
            this.f11468d = i12;
            this.f11470f = "";
            this.f11471g = Bundle.EMPTY;
            this.f11467c = -1;
            this.f11472h = true;
        }
    }

    static boolean a(List<a> list, int i11) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (list.get(i12).f11463h.c(0) == i11) {
                return true;
            }
        }
        return false;
    }

    static com.google.common.collect.x<a> d(List<a> list, te teVar, p7.j0.b bVar) {
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        for (int i11 = 0; i11 < list.size(); i11++) {
            a aVar2 = list.get(i11);
            if (j(aVar2, teVar, bVar)) {
                aVar.a(aVar2);
            } else {
                aVar.a(aVar2.b(false));
            }
        }
        return aVar.k();
    }

    public static a e(Bundle bundle, int i11) {
        Bundle bundle2 = bundle.getBundle(f11447j);
        se seVarA = bundle2 == null ? null : se.a(bundle2);
        int i12 = bundle.getInt(f11448k, -1);
        int i13 = bundle.getInt(f11449l, 0);
        CharSequence charSequence = bundle.getCharSequence(f11450m, "");
        Bundle bundle3 = bundle.getBundle(f11451n);
        boolean z11 = i11 < 3 || bundle.getBoolean(f11452o, true);
        Uri uri = (Uri) bundle.getParcelable(f11453p);
        int i14 = bundle.getInt(f11454q, 0);
        int[] intArray = bundle.getIntArray(f11455r);
        b bVar = new b(i14, i13);
        if (seVarA != null) {
            bVar.i(seVarA);
        }
        if (i12 != -1) {
            bVar.h(i12);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            bVar.g(uri);
        }
        b bVarC = bVar.c(charSequence);
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        b bVarD = bVarC.e(bundle3).d(z11);
        if (intArray == null) {
            intArray = new int[]{6};
        }
        return bVarD.j(intArray).a();
    }

    static com.google.common.collect.x<a> f(List<a> list, boolean z11, boolean z12) {
        se seVar;
        se seVar2;
        int iC;
        if (list.isEmpty()) {
            return com.google.common.collect.x.r();
        }
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < list.size(); i13++) {
            a aVar = list.get(i13);
            if (aVar.f11464i && (seVar2 = aVar.f11456a) != null && seVar2.f12347a == 0) {
                for (int i14 = 0; i14 < aVar.f11463h.f() && (iC = aVar.f11463h.c(i14)) != 6; i14++) {
                    if (z11 && i11 == -1 && iC == 2) {
                        i11 = i13;
                        break;
                    }
                    if (z12 && i12 == -1 && iC == 3) {
                        i12 = i13;
                        break;
                    }
                }
            }
        }
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        if (i11 != -1) {
            aVarK.a(list.get(i11).c(ru.e.h(2)));
        }
        if (i12 != -1) {
            aVarK.a(list.get(i12).c(ru.e.h(3)));
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            a aVar2 = list.get(i15);
            if (aVar2.f11464i && (seVar = aVar2.f11456a) != null && seVar.f12347a == 0 && i15 != i11 && i15 != i12 && aVar2.f11463h.a(6)) {
                aVarK.a(aVar2.c(ru.e.h(6)));
            }
        }
        return aVarK.k();
    }

    public static int g(int i11, int i12) {
        if (i11 == 1 || i12 == 57399 || i12 == 57396) {
            return 1;
        }
        if (i11 == 11 || i11 == 7 || i11 == 6 || i12 == 57413 || i12 == 57376 || i12 == 57410 || i12 == 57435 || i12 == 57433 || i12 == 1040473 || i12 == 57434) {
            return 2;
        }
        return (i11 == 12 || i11 == 9 || i11 == 8 || i12 == 57412 || i12 == 57375 || i12 == 63220 || i12 == 57432 || i12 == 57430 || i12 == 1040470 || i12 == 57431) ? 3 : 6;
    }

    public static int h(int i11) {
        switch (i11) {
            case 57369:
                return ga.s.f67703a;
            case 57370:
                return ga.s.f67705b;
            case 57372:
                return ga.s.f67719i;
            case 57375:
                return ga.s.f67723k;
            case 57376:
                return ga.s.S;
            case 57396:
                return ga.s.f67743u;
            case 57399:
                return ga.s.f67745v;
            case 57403:
                return ga.s.E;
            case 57408:
                return ga.s.P;
            case 57409:
                return ga.s.R;
            case 57410:
                return ga.s.Z;
            case 57411:
                return ga.s.W;
            case 57412:
                return ga.s.f67741t;
            case 57413:
                return ga.s.J;
            case 57415:
                return ga.s.f67726l0;
            case 57416:
                return ga.s.f67728m0;
            case 57421:
                return ga.s.f67742t0;
            case 57423:
                return ga.s.f67744u0;
            case 57424:
                return ga.s.f67746v0;
            case 57430:
                return ga.s.f67714f0;
            case 57431:
                return ga.s.f67718h0;
            case 57432:
                return ga.s.f67720i0;
            case 57433:
                return ga.s.f67704a0;
            case 57434:
                return ga.s.f67708c0;
            case 57435:
                return ga.s.f67710d0;
            case 57436:
                return ga.s.L;
            case 57446:
                return ga.s.M;
            case 57447:
                return ga.s.N;
            case 57448:
                return ga.s.f67747w;
            case 57573:
                return ga.s.f67725l;
            case 57669:
                return ga.s.G;
            case 57671:
                return ga.s.I;
            case 57675:
                return ga.s.f67707c;
            case 57683:
                return ga.s.f67729n;
            case 57691:
                return ga.s.f67735q;
            case 58409:
                return ga.s.K;
            case 58654:
                return ga.s.O;
            case 58919:
                return ga.s.f67732o0;
            case 59405:
                return ga.s.U;
            case 59448:
                return ga.s.f67724k0;
            case 59494:
                return ga.s.f67711e;
            case 59500:
                return ga.s.f67715g;
            case 59517:
                return ga.s.f67733p;
            case 59576:
                return ga.s.T;
            case 59611:
                return ga.s.f67736q0;
            case 59612:
                return ga.s.f67740s0;
            case 60288:
                return ga.s.F;
            case 61298:
                return ga.s.f67730n0;
            case 61389:
                return ga.s.f67751z;
            case 61512:
                return ga.s.Y;
            case 61916:
                return ga.s.f67721j;
            case 62688:
                return ga.s.B;
            case 62689:
                return ga.s.A;
            case 62690:
                return ga.s.f67749x;
            case 62699:
                return ga.s.D;
            case 63220:
                return ga.s.f67712e0;
            case 1040448:
                return ga.s.Q;
            case 1040451:
                return ga.s.X;
            case 1040452:
                return ga.s.V;
            case 1040470:
                return ga.s.f67716g0;
            case 1040473:
                return ga.s.f67706b0;
            case 1040711:
                return ga.s.H;
            case 1040712:
                return ga.s.f67737r;
            case 1040713:
                return ga.s.f67739s;
            case 1040723:
                return ga.s.f67727m;
            case 1042488:
                return ga.s.f67722j0;
            case 1042534:
                return ga.s.f67709d;
            case 1042540:
                return ga.s.f67713f;
            case 1042557:
                return ga.s.f67731o;
            case 1042651:
                return ga.s.f67734p0;
            case 1042652:
                return ga.s.f67738r0;
            case 1045728:
                return ga.s.C;
            case 1045730:
                return ga.s.f67750y;
            default:
                return 0;
        }
    }

    static com.google.common.collect.x<a> i(List<a> list, p7.j0.b bVar, Bundle bundle) {
        if (list.isEmpty()) {
            return com.google.common.collect.x.r();
        }
        boolean zD = bVar.d(7, 6);
        boolean zD2 = bVar.d(9, 8);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i11 = (zD || z11) ? -1 : 0;
        int i12 = (zD2 || z12) ? -1 : i11 == 0 ? 1 : 0;
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        for (int i13 = 0; i13 < list.size(); i13++) {
            a aVar = list.get(i13);
            if (i13 == i11) {
                if (i12 == -1) {
                    aVarK.a(aVar.c(ru.e.i(2, 6)));
                } else {
                    aVarK.a(aVar.c(ru.e.j(2, 3, 6)));
                }
            } else if (i13 == i12) {
                aVarK.a(aVar.c(ru.e.i(3, 6)));
            } else {
                aVarK.a(aVar.c(ru.e.h(6)));
            }
        }
        return aVarK.k();
    }

    static boolean j(a aVar, te teVar, p7.j0.b bVar) {
        se seVar = aVar.f11456a;
        if (seVar != null && teVar.c(seVar)) {
            return true;
        }
        int i11 = aVar.f11457b;
        return i11 != -1 && bVar.c(i11);
    }

    a b(boolean z11) {
        return this.f11464i == z11 ? this : new a(this.f11456a, this.f11457b, this.f11458c, this.f11459d, this.f11460e, this.f11461f, new Bundle(this.f11462g), z11, this.f11463h);
    }

    a c(ru.e eVar) {
        return this.f11463h.equals(eVar) ? this : new a(this.f11456a, this.f11457b, this.f11458c, this.f11459d, this.f11460e, this.f11461f, new Bundle(this.f11462g), this.f11464i, eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f11456a, aVar.f11456a) && this.f11457b == aVar.f11457b && this.f11458c == aVar.f11458c && this.f11459d == aVar.f11459d && Objects.equals(this.f11460e, aVar.f11460e) && TextUtils.equals(this.f11461f, aVar.f11461f) && this.f11464i == aVar.f11464i && this.f11463h.equals(aVar.f11463h);
    }

    public int hashCode() {
        return Objects.hash(this.f11456a, Integer.valueOf(this.f11457b), Integer.valueOf(this.f11458c), Integer.valueOf(this.f11459d), this.f11461f, Boolean.valueOf(this.f11464i), this.f11460e, this.f11463h);
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        se seVar = this.f11456a;
        if (seVar != null) {
            bundle.putBundle(f11447j, seVar.b());
        }
        int i11 = this.f11457b;
        if (i11 != -1) {
            bundle.putInt(f11448k, i11);
        }
        int i12 = this.f11458c;
        if (i12 != 0) {
            bundle.putInt(f11454q, i12);
        }
        int i13 = this.f11459d;
        if (i13 != 0) {
            bundle.putInt(f11449l, i13);
        }
        CharSequence charSequence = this.f11461f;
        if (charSequence != "") {
            bundle.putCharSequence(f11450m, charSequence);
        }
        if (!this.f11462g.isEmpty()) {
            bundle.putBundle(f11451n, this.f11462g);
        }
        Uri uri = this.f11460e;
        if (uri != null) {
            bundle.putParcelable(f11453p, uri);
        }
        boolean z11 = this.f11464i;
        if (!z11) {
            bundle.putBoolean(f11452o, z11);
        }
        if (this.f11463h.f() == 1 && this.f11463h.c(0) == 6) {
            return bundle;
        }
        bundle.putIntArray(f11455r, this.f11463h.k());
        return bundle;
    }

    private a(se seVar, int i11, int i12, int i13, Uri uri, CharSequence charSequence, Bundle bundle, boolean z11, ru.e eVar) {
        this.f11456a = seVar;
        this.f11457b = i11;
        this.f11458c = i12;
        this.f11459d = i13;
        this.f11460e = uri;
        this.f11461f = charSequence;
        this.f11462g = new Bundle(bundle);
        this.f11464i = z11;
        this.f11463h = eVar;
    }
}
