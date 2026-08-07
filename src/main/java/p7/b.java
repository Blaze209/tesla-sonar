package p7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f101195g = new b(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f101196h = new a(0).l(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f101197i = s7.q0.N0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f101198j = s7.q0.N0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f101199k = s7.q0.N0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f101200l = s7.q0.N0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f101201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f101204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f101206f;

    public static final class a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f101207l = s7.q0.N0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f101208m = s7.q0.N0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f101209n = s7.q0.N0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f101210o = s7.q0.N0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f101211p = s7.q0.N0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f101212q = s7.q0.N0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f101213r = s7.q0.N0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f101214s = s7.q0.N0(7);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final String f101215t = s7.q0.N0(8);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        static final String f101216u = s7.q0.N0(9);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final String f101217v = s7.q0.N0(10);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f101218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f101219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f101220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Uri[] f101221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final y[] f101222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f101223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f101224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String[] f101225h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f101226i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f101227j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f101228k;

        public a(long j11) {
            this(j11, -1, -1, new int[0], new y[0], new long[0], 0L, false, new String[0], false);
        }

        private static long[] a(long[] jArr, int i11) {
            int length = jArr.length;
            int iMax = Math.max(i11, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static int[] b(int[] iArr, int i11) {
            int length = iArr.length;
            int iMax = Math.max(i11, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public static a c(Bundle bundle) {
            long j11 = bundle.getLong(f101207l);
            int i11 = bundle.getInt(f101208m);
            int i12 = bundle.getInt(f101214s);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f101209n);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f101215t);
            int[] intArray = bundle.getIntArray(f101210o);
            long[] longArray = bundle.getLongArray(f101211p);
            long j12 = bundle.getLong(f101212q);
            boolean z11 = bundle.getBoolean(f101213r);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f101216u);
            boolean z12 = bundle.getBoolean(f101217v);
            if (intArray == null) {
                intArray = new int[0];
            }
            y[] yVarArrF = f(parcelableArrayList2, parcelableArrayList);
            if (longArray == null) {
                longArray = new long[0];
            }
            String[] strArr = new String[0];
            if (stringArrayList != null) {
                strArr = (String[]) stringArrayList.toArray(strArr);
            }
            return new a(j11, i11, i12, intArray, yVarArrF, longArray, j12, z11, strArr, z12);
        }

        private ArrayList<Bundle> e() {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            y[] yVarArr = this.f101222e;
            int length = yVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                y yVar = yVarArr[i11];
                arrayList.add(yVar == null ? null : yVar.g());
            }
            return arrayList;
        }

        private static y[] f(ArrayList<Bundle> arrayList, ArrayList<Uri> arrayList2) {
            int i11 = 0;
            if (arrayList != null) {
                y[] yVarArr = new y[arrayList.size()];
                while (i11 < arrayList.size()) {
                    Bundle bundle = arrayList.get(i11);
                    yVarArr[i11] = bundle == null ? null : y.b(bundle);
                    i11++;
                }
                return yVarArr;
            }
            if (arrayList2 == null) {
                return new y[0];
            }
            y[] yVarArr2 = new y[arrayList2.size()];
            while (i11 < arrayList2.size()) {
                Uri uri = arrayList2.get(i11);
                yVarArr2[i11] = uri == null ? null : y.c(uri);
                i11++;
            }
            return yVarArr2;
        }

        public int d() {
            return g(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f101218a == aVar.f101218a && this.f101219b == aVar.f101219b && this.f101220c == aVar.f101220c && Arrays.equals(this.f101222e, aVar.f101222e) && Arrays.equals(this.f101223f, aVar.f101223f) && Arrays.equals(this.f101224g, aVar.f101224g) && this.f101226i == aVar.f101226i && this.f101227j == aVar.f101227j && Arrays.equals(this.f101225h, aVar.f101225h) && this.f101228k == aVar.f101228k) {
                    return true;
                }
            }
            return false;
        }

        public int g(int i11) {
            int i12;
            int i13 = i11 + 1;
            while (true) {
                int[] iArr = this.f101223f;
                if (i13 >= iArr.length || this.f101227j || (i12 = iArr[i13]) == 0 || i12 == 1) {
                    break;
                }
                i13++;
            }
            return i13;
        }

        public boolean h() {
            if (this.f101219b == -1) {
                return true;
            }
            for (int i11 = 0; i11 < this.f101219b; i11++) {
                int i12 = this.f101223f[i11];
                if (i12 == 0 || i12 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.f101219b * 31) + this.f101220c) * 31;
            long j11 = this.f101218a;
            int iHashCode = (((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f101222e)) * 31) + Arrays.hashCode(this.f101223f)) * 31) + Arrays.hashCode(this.f101224g)) * 31;
            long j12 = this.f101226i;
            return ((((((iHashCode + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f101227j ? 1 : 0)) * 31) + Arrays.hashCode(this.f101225h)) * 31) + (this.f101228k ? 1 : 0);
        }

        public boolean i() {
            return this.f101228k && this.f101218a == Long.MIN_VALUE && this.f101219b == -1;
        }

        public boolean j() {
            return this.f101219b == -1 || d() < this.f101219b;
        }

        public Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putLong(f101207l, this.f101218a);
            bundle.putInt(f101208m, this.f101219b);
            bundle.putInt(f101214s, this.f101220c);
            bundle.putParcelableArrayList(f101209n, new ArrayList<>(Arrays.asList(this.f101221d)));
            bundle.putParcelableArrayList(f101215t, e());
            bundle.putIntArray(f101210o, this.f101223f);
            bundle.putLongArray(f101211p, this.f101224g);
            bundle.putLong(f101212q, this.f101226i);
            bundle.putBoolean(f101213r, this.f101227j);
            bundle.putStringArrayList(f101216u, new ArrayList<>(Arrays.asList(this.f101225h)));
            bundle.putBoolean(f101217v, this.f101228k);
            return bundle;
        }

        public a l(int i11) {
            int[] iArrB = b(this.f101223f, i11);
            long[] jArrA = a(this.f101224g, i11);
            return new a(this.f101218a, i11, this.f101220c, iArrB, (y[]) Arrays.copyOf(this.f101222e, i11), jArrA, this.f101226i, this.f101227j, (String[]) Arrays.copyOf(this.f101225h, i11), this.f101228k);
        }

        private a(long j11, int i11, int i12, int[] iArr, y[] yVarArr, long[] jArr, long j12, boolean z11, String[] strArr, boolean z12) {
            int i13 = 0;
            s7.a.a(iArr.length == yVarArr.length);
            this.f101218a = j11;
            this.f101219b = i11;
            this.f101220c = i12;
            this.f101223f = iArr;
            this.f101222e = yVarArr;
            this.f101224g = jArr;
            this.f101226i = j12;
            this.f101227j = z11;
            this.f101221d = new Uri[yVarArr.length];
            while (true) {
                Uri[] uriArr = this.f101221d;
                if (i13 >= uriArr.length) {
                    this.f101225h = strArr;
                    this.f101228k = z12;
                    return;
                } else {
                    y yVar = yVarArr[i13];
                    uriArr[i13] = yVar == null ? null : ((y.h) s7.a.f(yVar.f101682b)).f101783a;
                    i13++;
                }
            }
        }
    }

    private b(Object obj, a[] aVarArr, long j11, long j12, int i11) {
        this.f101201a = obj;
        this.f101203c = j11;
        this.f101204d = j12;
        this.f101202b = aVarArr.length + i11;
        this.f101206f = aVarArr;
        this.f101205e = i11;
    }

    public static b a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f101197i);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                aVarArr2[i11] = a.c((Bundle) parcelableArrayList.get(i11));
            }
            aVarArr = aVarArr2;
        }
        String str = f101198j;
        b bVar = f101195g;
        return new b(null, aVarArr, bundle.getLong(str, bVar.f101203c), bundle.getLong(f101199k, bVar.f101204d), bundle.getInt(f101200l, bVar.f101205e));
    }

    private boolean f(long j11, long j12, int i11) {
        if (j11 == Long.MIN_VALUE) {
            return false;
        }
        a aVarB = b(i11);
        long j13 = aVarB.f101218a;
        if (j13 == Long.MIN_VALUE) {
            return j12 == -9223372036854775807L || aVarB.i() || j11 < j12;
        }
        return j11 < j13;
    }

    public a b(int i11) {
        int i12 = this.f101205e;
        return i11 < i12 ? f101196h : this.f101206f[i11 - i12];
    }

    public int c(long j11, long j12) {
        if (j11 != Long.MIN_VALUE && (j12 == -9223372036854775807L || j11 < j12)) {
            int i11 = this.f101205e;
            while (i11 < this.f101202b && ((b(i11).f101218a != Long.MIN_VALUE && b(i11).f101218a <= j11) || !b(i11).j())) {
                i11++;
            }
            if (i11 < this.f101202b && (j12 == -9223372036854775807L || b(i11).f101218a <= j12)) {
                return i11;
            }
        }
        return -1;
    }

    public int d(long j11, long j12) {
        int i11 = this.f101202b - 1;
        int i12 = i11 - (e(i11) ? 1 : 0);
        while (i12 >= 0) {
            long j13 = j11;
            long j14 = j12;
            if (!f(j13, j14, i12)) {
                break;
            }
            i12--;
            j11 = j13;
            j12 = j14;
        }
        if (i12 < 0 || !b(i12).h()) {
            return -1;
        }
        return i12;
    }

    public boolean e(int i11) {
        return i11 == this.f101202b - 1 && b(i11).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (Objects.equals(this.f101201a, bVar.f101201a) && this.f101202b == bVar.f101202b && this.f101203c == bVar.f101203c && this.f101204d == bVar.f101204d && this.f101205e == bVar.f101205e && Arrays.equals(this.f101206f, bVar.f101206f)) {
                return true;
            }
        }
        return false;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f101206f) {
            arrayList.add(aVar.k());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f101197i, arrayList);
        }
        long j11 = this.f101203c;
        b bVar = f101195g;
        if (j11 != bVar.f101203c) {
            bundle.putLong(f101198j, j11);
        }
        long j12 = this.f101204d;
        if (j12 != bVar.f101204d) {
            bundle.putLong(f101199k, j12);
        }
        int i11 = this.f101205e;
        if (i11 != bVar.f101205e) {
            bundle.putInt(f101200l, i11);
        }
        return bundle;
    }

    public int hashCode() {
        int i11 = this.f101202b * 31;
        Object obj = this.f101201a;
        return ((((((((i11 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f101203c)) * 31) + ((int) this.f101204d)) * 31) + this.f101205e) * 31) + Arrays.hashCode(this.f101206f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f101201a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f101203c);
        sb2.append(", adGroups=[");
        for (int i11 = 0; i11 < this.f101206f.length; i11++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f101206f[i11].f101218a);
            sb2.append(", ads=[");
            for (int i12 = 0; i12 < this.f101206f[i11].f101223f.length; i12++) {
                sb2.append("ad(state=");
                int i13 = this.f101206f[i11].f101223f[i12];
                if (i13 == 0) {
                    sb2.append('_');
                } else if (i13 == 1) {
                    sb2.append('R');
                } else if (i13 == 2) {
                    sb2.append('S');
                } else if (i13 == 3) {
                    sb2.append('P');
                } else if (i13 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f101206f[i11].f101224g[i12]);
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (i12 < this.f101206f[i11].f101223f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i11 < this.f101206f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
