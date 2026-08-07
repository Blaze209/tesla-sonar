package fs;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.g;
import java.util.ArrayList;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f66525g = new c(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f66526h = new a(0).k(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f66527i = p0.t0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f66528j = p0.t0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f66529k = p0.t0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f66530l = p0.t0(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g.a<c> f66531m = new g.a() { // from class: fs.a
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            return c.b(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f66532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f66534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f66535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f66536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f66537f;

    public static final class a implements g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f66538i = p0.t0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f66539j = p0.t0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f66540k = p0.t0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f66541l = p0.t0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f66542m = p0.t0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f66543n = p0.t0(5);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f66544o = p0.t0(6);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f66545p = p0.t0(7);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final g.a<a> f66546q = new g.a() { // from class: fs.b
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                return c.a.e(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f66547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f66549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri[] f66550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f66551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long[] f66552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f66553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f66554h;

        public a(long j11) {
            this(j11, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private static long[] c(long[] jArr, int i11) {
            int length = jArr.length;
            int iMax = Math.max(i11, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static int[] d(int[] iArr, int i11) {
            int length = iArr.length;
            int iMax = Math.max(i11, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a e(Bundle bundle) {
            long j11 = bundle.getLong(f66538i);
            int i11 = bundle.getInt(f66539j);
            int i12 = bundle.getInt(f66545p);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f66540k);
            int[] intArray = bundle.getIntArray(f66541l);
            long[] longArray = bundle.getLongArray(f66542m);
            long j12 = bundle.getLong(f66543n);
            boolean z11 = bundle.getBoolean(f66544o);
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new a(j11, i11, i12, iArr, uriArr, longArray, j12, z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() {
            return this.f66554h && this.f66547a == Long.MIN_VALUE && this.f66548b == -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f66547a == aVar.f66547a && this.f66548b == aVar.f66548b && this.f66549c == aVar.f66549c && Arrays.equals(this.f66550d, aVar.f66550d) && Arrays.equals(this.f66551e, aVar.f66551e) && Arrays.equals(this.f66552f, aVar.f66552f) && this.f66553g == aVar.f66553g && this.f66554h == aVar.f66554h) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            return g(-1);
        }

        public int g(int i11) {
            int i12;
            int i13 = i11 + 1;
            while (true) {
                int[] iArr = this.f66551e;
                if (i13 >= iArr.length || this.f66554h || (i12 = iArr[i13]) == 0 || i12 == 1) {
                    break;
                }
                i13++;
            }
            return i13;
        }

        public boolean h() {
            if (this.f66548b == -1) {
                return true;
            }
            for (int i11 = 0; i11 < this.f66548b; i11++) {
                int i12 = this.f66551e[i11];
                if (i12 == 0 || i12 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.f66548b * 31) + this.f66549c) * 31;
            long j11 = this.f66547a;
            int iHashCode = (((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f66550d)) * 31) + Arrays.hashCode(this.f66551e)) * 31) + Arrays.hashCode(this.f66552f)) * 31;
            long j12 = this.f66553g;
            return ((iHashCode + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f66554h ? 1 : 0);
        }

        public boolean j() {
            return this.f66548b == -1 || f() < this.f66548b;
        }

        public a k(int i11) {
            int[] iArrD = d(this.f66551e, i11);
            long[] jArrC = c(this.f66552f, i11);
            return new a(this.f66547a, i11, this.f66549c, iArrD, (Uri[]) Arrays.copyOf(this.f66550d, i11), jArrC, this.f66553g, this.f66554h);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f66538i, this.f66547a);
            bundle.putInt(f66539j, this.f66548b);
            bundle.putInt(f66545p, this.f66549c);
            bundle.putParcelableArrayList(f66540k, new ArrayList<>(Arrays.asList(this.f66550d)));
            bundle.putIntArray(f66541l, this.f66551e);
            bundle.putLongArray(f66542m, this.f66552f);
            bundle.putLong(f66543n, this.f66553g);
            bundle.putBoolean(f66544o, this.f66554h);
            return bundle;
        }

        private a(long j11, int i11, int i12, int[] iArr, Uri[] uriArr, long[] jArr, long j12, boolean z11) {
            ts.a.a(iArr.length == uriArr.length);
            this.f66547a = j11;
            this.f66548b = i11;
            this.f66549c = i12;
            this.f66551e = iArr;
            this.f66550d = uriArr;
            this.f66552f = jArr;
            this.f66553g = j12;
            this.f66554h = z11;
        }
    }

    private c(Object obj, a[] aVarArr, long j11, long j12, int i11) {
        this.f66532a = obj;
        this.f66534c = j11;
        this.f66535d = j12;
        this.f66533b = aVarArr.length + i11;
        this.f66537f = aVarArr;
        this.f66536e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f66527i);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                aVarArr2[i11] = (a) a.f66546q.a((Bundle) parcelableArrayList.get(i11));
            }
            aVarArr = aVarArr2;
        }
        String str = f66528j;
        c cVar = f66525g;
        return new c(null, aVarArr, bundle.getLong(str, cVar.f66534c), bundle.getLong(f66529k, cVar.f66535d), bundle.getInt(f66530l, cVar.f66536e));
    }

    private boolean g(long j11, long j12, int i11) {
        if (j11 == Long.MIN_VALUE) {
            return false;
        }
        a aVarC = c(i11);
        long j13 = aVarC.f66547a;
        if (j13 == Long.MIN_VALUE) {
            return j12 == -9223372036854775807L || (aVarC.f66554h && aVarC.f66548b == -1) || j11 < j12;
        }
        return j11 < j13;
    }

    public a c(int i11) {
        int i12 = this.f66536e;
        return i11 < i12 ? f66526h : this.f66537f[i11 - i12];
    }

    public int d(long j11, long j12) {
        if (j11 != Long.MIN_VALUE && (j12 == -9223372036854775807L || j11 < j12)) {
            int i11 = this.f66536e;
            while (i11 < this.f66533b && ((c(i11).f66547a != Long.MIN_VALUE && c(i11).f66547a <= j11) || !c(i11).j())) {
                i11++;
            }
            if (i11 < this.f66533b) {
                return i11;
            }
        }
        return -1;
    }

    public int e(long j11, long j12) {
        int i11 = this.f66533b - 1;
        int i12 = i11 - (f(i11) ? 1 : 0);
        while (i12 >= 0) {
            long j13 = j11;
            long j14 = j12;
            if (!g(j13, j14, i12)) {
                break;
            }
            i12--;
            j11 = j13;
            j12 = j14;
        }
        if (i12 < 0 || !c(i12).h()) {
            return -1;
        }
        return i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (p0.c(this.f66532a, cVar.f66532a) && this.f66533b == cVar.f66533b && this.f66534c == cVar.f66534c && this.f66535d == cVar.f66535d && this.f66536e == cVar.f66536e && Arrays.equals(this.f66537f, cVar.f66537f)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i11) {
        return i11 == this.f66533b - 1 && c(i11).i();
    }

    public int hashCode() {
        int i11 = this.f66533b * 31;
        Object obj = this.f66532a;
        return ((((((((i11 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f66534c)) * 31) + ((int) this.f66535d)) * 31) + this.f66536e) * 31) + Arrays.hashCode(this.f66537f);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f66537f) {
            arrayList.add(aVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f66527i, arrayList);
        }
        long j11 = this.f66534c;
        c cVar = f66525g;
        if (j11 != cVar.f66534c) {
            bundle.putLong(f66528j, j11);
        }
        long j12 = this.f66535d;
        if (j12 != cVar.f66535d) {
            bundle.putLong(f66529k, j12);
        }
        int i11 = this.f66536e;
        if (i11 != cVar.f66536e) {
            bundle.putInt(f66530l, i11);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f66532a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f66534c);
        sb2.append(", adGroups=[");
        for (int i11 = 0; i11 < this.f66537f.length; i11++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f66537f[i11].f66547a);
            sb2.append(", ads=[");
            for (int i12 = 0; i12 < this.f66537f[i11].f66551e.length; i12++) {
                sb2.append("ad(state=");
                int i13 = this.f66537f[i11].f66551e[i12];
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
                sb2.append(this.f66537f[i11].f66552f[i12]);
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (i12 < this.f66537f[i11].f66551e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i11 < this.f66537f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
