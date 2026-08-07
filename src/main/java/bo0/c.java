package bo0;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lbo0/c;", "Lbo0/a;", "Lbo0/f;", "", "", "start", "endInclusive", "<init>", "(CC)V", "value", "", "k", "(C)Z", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "m", "()Ljava/lang/Character;", "l", "e", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends a implements f<Character> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f17853f = new c(1, 0);

    public c(char c11, char c12) {
        super(c11, c12, 1);
    }

    @Override // bo0.f
    public /* bridge */ /* synthetic */ boolean d(Comparable comparable) {
        return k(((Character) comparable).charValue());
    }

    public boolean equals(Object other) {
        if (!(other instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) other).isEmpty()) {
            return true;
        }
        c cVar = (c) other;
        return getFirst() == cVar.getFirst() && getLast() == cVar.getLast();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // bo0.f
    public boolean isEmpty() {
        return s.m(getFirst(), getLast()) > 0;
    }

    public boolean k(char value) {
        return s.m(getFirst(), value) <= 0 && s.m(value, getLast()) <= 0;
    }

    @Override // bo0.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Character e() {
        return Character.valueOf(getLast());
    }

    @Override // bo0.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(getFirst());
    }

    public String toString() {
        return getFirst() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + getLast();
    }
}
