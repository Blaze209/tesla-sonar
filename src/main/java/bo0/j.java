package bo0;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lbo0/j;", "Lbo0/h;", "Lbo0/f;", "", "", "start", "endInclusive", "<init>", "(II)V", "value", "", "c", "(I)Z", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "n", "()Ljava/lang/Integer;", "m", "e", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends h implements f<Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j f17867f = new j(1, 0);

    /* JADX INFO: renamed from: bo0.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbo0/j$a;", "", "<init>", "()V", "Lbo0/j;", "EMPTY", "Lbo0/j;", "a", "()Lbo0/j;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f17867f;
        }

        private Companion() {
        }
    }

    public j(int i11, int i12) {
        super(i11, i12, 1);
    }

    public boolean c(int value) {
        return getFirst() <= value && value <= getLast();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bo0.f
    public /* bridge */ /* synthetic */ boolean d(Comparable comparable) {
        return c(((Number) comparable).intValue());
    }

    @Override // bo0.h
    public boolean equals(Object other) {
        if (!(other instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) other).isEmpty()) {
            return true;
        }
        j jVar = (j) other;
        return getFirst() == jVar.getFirst() && getLast() == jVar.getLast();
    }

    @Override // bo0.h
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // bo0.h, bo0.f
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // bo0.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer e() {
        return Integer.valueOf(getLast());
    }

    @Override // bo0.f
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }

    @Override // bo0.h
    public String toString() {
        return getFirst() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + getLast();
    }
}
