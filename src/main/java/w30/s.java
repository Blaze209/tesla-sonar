package w30;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lw30/s;", "Lw30/f0;", "<init>", "()V", "Lio0/b;", "incrementDuration", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "maxRetries", "a", "(I)J", "remainingRetries", "b", "(II)J", "J", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f120691b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long incrementDuration;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw30/s$a;", "", "<init>", "()V", "", "DEFAULT_INCREMENT_SECONDS", "J", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ s(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    @Override // w30.f0
    public long a(int maxRetries) {
        io0.b.Companion companion = io0.b.INSTANCE;
        long jS = io0.d.s(0, io0.e.SECONDS);
        for (int i11 = maxRetries; i11 > 0; i11--) {
            jS = io0.b.F(jS, b(maxRetries, i11));
        }
        return jS;
    }

    @Override // w30.f0
    public long b(int maxRetries, int remainingRetries) {
        int iN = (maxRetries - bo0.n.n(remainingRetries, 1, maxRetries)) + 1;
        long j11 = this.incrementDuration;
        io0.e eVar = io0.e.SECONDS;
        return io0.d.r(Math.pow(io0.b.H(j11, eVar), iN), eVar);
    }

    private s(long j11) {
        this.incrementDuration = j11;
    }

    public s() {
        this(io0.d.t(2L, io0.e.SECONDS), null);
    }
}
