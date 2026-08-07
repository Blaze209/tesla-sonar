package w30;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lw30/u;", "Lw30/f0;", "<init>", "()V", "Lio0/b;", "delay", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "maxRetries", "a", "(I)J", "remainingRetries", "b", "(II)J", "J", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f120693b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long delay;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw30/u$a;", "", "<init>", "()V", "", "DEFAULT_DELAY", "J", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ u(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    @Override // w30.f0
    public long a(int maxRetries) {
        return io0.b.G(this.delay, maxRetries);
    }

    @Override // w30.f0
    public long b(int maxRetries, int remainingRetries) {
        return this.delay;
    }

    private u(long j11) {
        this.delay = j11;
    }

    public u() {
        this(io0.d.t(3L, io0.e.SECONDS), null);
    }
}
