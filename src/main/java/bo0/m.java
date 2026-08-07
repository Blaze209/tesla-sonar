package bo0;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lbo0/m;", "Lbo0/k;", "Lbo0/f;", "", "", "start", "endInclusive", "<init>", "(JJ)V", "value", "", "m", "(J)Z", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "o", "()Ljava/lang/Long;", "n", "e", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends k implements f<Long> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final m f17877f = new m(1, 0);

    /* JADX INFO: renamed from: bo0.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbo0/m$a;", "", "<init>", "()V", "Lbo0/m;", "EMPTY", "Lbo0/m;", "a", "()Lbo0/m;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return m.f17877f;
        }

        private Companion() {
        }
    }

    public m(long j11, long j12) {
        super(j11, j12, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bo0.f
    public /* bridge */ /* synthetic */ boolean d(Comparable comparable) {
        return m(((Number) comparable).longValue());
    }

    @Override // bo0.k
    public boolean equals(Object other) {
        if (!(other instanceof m)) {
            return false;
        }
        if (isEmpty() && ((m) other).isEmpty()) {
            return true;
        }
        m mVar = (m) other;
        return getFirst() == mVar.getFirst() && getLast() == mVar.getLast();
    }

    @Override // bo0.k
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    @Override // bo0.k, bo0.f
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    public boolean m(long value) {
        return getFirst() <= value && value <= getLast();
    }

    @Override // bo0.f
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long e() {
        return Long.valueOf(getLast());
    }

    @Override // bo0.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(getFirst());
    }

    @Override // bo0.k
    public String toString() {
        return getFirst() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + getLast();
    }
}
