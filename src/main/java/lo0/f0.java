package lo0;

import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llo0/f0;", "", "", "", "names", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f0 f90501c = new f0(p013kotlin.collections.v.p("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f0 f90502d = new f0(p013kotlin.collections.v.p("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> names;

    /* JADX INFO: renamed from: lo0.f0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llo0/f0$a;", "", "<init>", "()V", "Llo0/f0;", "ENGLISH_ABBREVIATED", "Llo0/f0;", "a", "()Llo0/f0;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a() {
            return f0.f90502d;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f90504a = new b();

        b() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return p11.toString();
        }
    }

    public f0(List<String> names) {
        p013kotlin.jvm.internal.s.k(names, "names");
        this.names = names;
        if (names.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        Iterator<Integer> it = p013kotlin.collections.v.n(names).iterator();
        while (it.hasNext()) {
            int iNextInt = ((p013kotlin.collections.s0) it).nextInt();
            if (this.names.get(iNextInt).length() <= 0) {
                throw new IllegalArgumentException("A month name can not be empty");
            }
            for (int i11 = 0; i11 < iNextInt; i11++) {
                if (p013kotlin.jvm.internal.s.f(this.names.get(iNextInt), this.names.get(i11))) {
                    throw new IllegalArgumentException(("Month names must be unique, but '" + this.names.get(iNextInt) + "' was repeated").toString());
                }
            }
        }
    }

    public final List<String> b() {
        return this.names;
    }

    public boolean equals(Object other) {
        return (other instanceof f0) && p013kotlin.jvm.internal.s.f(this.names, ((f0) other).names);
    }

    public int hashCode() {
        return this.names.hashCode();
    }

    public String toString() {
        return p013kotlin.collections.v.y0(this.names, ", ", "MonthNames(", ")", 0, null, b.f90504a, 24, null);
    }
}
