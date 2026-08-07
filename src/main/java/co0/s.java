package co0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lco0/s;", "", "Lco0/t;", "variance", "Lco0/q;", "type", "<init>", "(Lco0/t;Lco0/q;)V", "", "toString", "()Ljava/lang/String;", "a", "()Lco0/t;", "b", "()Lco0/q;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lco0/t;", DateTokenConverter.CONVERTER_KEY, "Lco0/q;", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f19454d = new s(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t variance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q type;

    /* JADX INFO: renamed from: co0.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lco0/s$a;", "", "<init>", "()V", "Lco0/q;", "type", "Lco0/s;", DateTokenConverter.CONVERTER_KEY, "(Lco0/q;)Lco0/s;", "a", "b", "c", "()Lco0/s;", "STAR", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(q type) {
            p013kotlin.jvm.internal.s.k(type, "type");
            return new s(t.IN, type);
        }

        public final s b(q type) {
            p013kotlin.jvm.internal.s.k(type, "type");
            return new s(t.OUT, type);
        }

        public final s c() {
            return s.f19454d;
        }

        public final s d(q type) {
            p013kotlin.jvm.internal.s.k(type, "type");
            return new s(t.INVARIANT, type);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19457a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19457a = iArr;
        }
    }

    public s(t tVar, q qVar) {
        String str;
        this.variance = tVar;
        this.type = qVar;
        if ((tVar == null) == (qVar == null)) {
            return;
        }
        if (tVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + tVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final t getVariance() {
        return this.variance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q getType() {
        return this.type;
    }

    public final q c() {
        return this.type;
    }

    public final t d() {
        return this.variance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return this.variance == sVar.variance && p013kotlin.jvm.internal.s.f(this.type, sVar.type);
    }

    public int hashCode() {
        t tVar = this.variance;
        int iHashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        q qVar = this.type;
        return iHashCode + (qVar != null ? qVar.hashCode() : 0);
    }

    public String toString() {
        t tVar = this.variance;
        int i11 = tVar == null ? -1 : b.f19457a[tVar.ordinal()];
        if (i11 == -1) {
            return Marker.ANY_MARKER;
        }
        if (i11 == 1) {
            return String.valueOf(this.type);
        }
        if (i11 == 2) {
            return "in " + this.type;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.type;
    }
}
