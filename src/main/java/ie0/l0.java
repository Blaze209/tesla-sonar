package ie0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B;\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015¨\u0006\u001f"}, d2 = {"Lie0/l0;", "Lho0/i;", "", "", "", "maxAttempts", "maxDelay", "Lbo0/m;", "jitterRange", "Lkotlin/Function1;", "delayFunction", "<init>", "(IJLbo0/m;Lwn0/l;)V", "iterator", "()Ljava/util/Iterator;", "", "hasNext", "()Z", "next", "()Ljava/lang/Long;", "a", "I", "b", "J", "c", "Lbo0/m;", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "e", "current", "f", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 implements ho0.i<Long>, Iterator<Long>, xn0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxAttempts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long maxDelay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bo0.m jitterRange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Integer, Long> delayFunction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int current;

    /* JADX INFO: renamed from: ie0.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lie0/l0$a;", "", "<init>", "()V", "", "attempt", "", "a", "(I)J", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(int attempt) {
            return (long) Math.pow(2.0d, attempt);
        }

        private Companion() {
        }
    }

    public l0() {
        this(0, 0L, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(int i11) {
        return INSTANCE.a(i11);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.maxAttempts;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(int i11, long j11, bo0.m jitterRange, wn0.l<? super Integer, Long> delayFunction) {
        p013kotlin.jvm.internal.s.k(jitterRange, "jitterRange");
        p013kotlin.jvm.internal.s.k(delayFunction, "delayFunction");
        this.maxAttempts = i11;
        this.maxDelay = j11;
        this.jitterRange = jitterRange;
        this.delayFunction = delayFunction;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Long next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long jLongValue = this.delayFunction.invoke(Integer.valueOf(this.current)).longValue() + (this.jitterRange.isEmpty() ? 0L : zn0.c.INSTANCE.g(this.jitterRange.getFirst(), this.jitterRange.getLast()));
        this.current++;
        return Long.valueOf(bo0.n.k(jLongValue, this.maxDelay));
    }

    public /* synthetic */ l0(int i11, long j11, bo0.m mVar, wn0.l lVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 3 : i11, (i12 & 2) != 0 ? 5L : j11, (i12 & 4) != 0 ? new bo0.m(0L, 2L) : mVar, (i12 & 8) != 0 ? new wn0.l() { // from class: ie0.k0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Long.valueOf(l0.e(((Integer) obj).intValue()));
            }
        } : lVar);
    }

    @Override // ho0.i
    public Iterator<Long> iterator() {
        return this;
    }
}
