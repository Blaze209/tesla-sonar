package p013kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BinaryVersion {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f88067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f88068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f88069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f88070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Integer> f88071e;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BinaryVersion(int... numbers) {
        List<Integer> listM;
        s.k(numbers, "numbers");
        this.f88067a = numbers;
        Integer numW0 = n.w0(numbers, 0);
        this.f88068b = numW0 != null ? numW0.intValue() : -1;
        Integer numW1 = n.w0(numbers, 1);
        this.f88069c = numW1 != null ? numW1.intValue() : -1;
        Integer numW2 = n.w0(numbers, 2);
        this.f88070d = numW2 != null ? numW2.intValue() : -1;
        if (numbers.length <= 3) {
            listM = v.m();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + CoreConstants.DOT);
            }
            listM = v.m1(n.g(numbers).subList(3, numbers.length));
        }
        this.f88071e = listM;
    }

    protected final boolean a(BinaryVersion ourVersion) {
        s.k(ourVersion, "ourVersion");
        int i11 = this.f88068b;
        if (i11 == 0) {
            return ourVersion.f88068b == 0 && this.f88069c == ourVersion.f88069c;
        }
        return i11 == ourVersion.f88068b && this.f88069c <= ourVersion.f88069c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !s.f(getClass(), obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.f88068b == binaryVersion.f88068b && this.f88069c == binaryVersion.f88069c && this.f88070d == binaryVersion.f88070d && s.f(this.f88071e, binaryVersion.f88071e);
    }

    public final int getMajor() {
        return this.f88068b;
    }

    public final int getMinor() {
        return this.f88069c;
    }

    public int hashCode() {
        int i11 = this.f88068b;
        int i12 = i11 + (i11 * 31) + this.f88069c;
        int i13 = i12 + (i12 * 31) + this.f88070d;
        return i13 + (i13 * 31) + this.f88071e.hashCode();
    }

    public final boolean isAtLeast(BinaryVersion version) {
        s.k(version, "version");
        return isAtLeast(version.f88068b, version.f88069c, version.f88070d);
    }

    public final boolean isAtMost(int i11, int i12, int i13) {
        int i14 = this.f88068b;
        if (i14 < i11) {
            return true;
        }
        if (i14 > i11) {
            return false;
        }
        int i15 = this.f88069c;
        if (i15 < i12) {
            return true;
        }
        return i15 <= i12 && this.f88070d <= i13;
    }

    public final int[] toArray() {
        return this.f88067a;
    }

    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i11 : array) {
            if (i11 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList.isEmpty() ? "unknown" : v.y0(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean isAtLeast(int i11, int i12, int i13) {
        int i14 = this.f88068b;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        int i15 = this.f88069c;
        if (i15 > i12) {
            return true;
        }
        return i15 >= i12 && this.f88070d >= i13;
    }
}
