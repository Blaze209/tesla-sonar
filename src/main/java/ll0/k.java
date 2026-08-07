package ll0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.nio.ByteBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lll0/k;", "Lll0/o;", "Lml0/a;", "head", "", "remaining", "Lnl0/f;", "pool", "<init>", "(Lml0/a;JLnl0/f;)V", "(Lml0/a;Lnl0/f;)V", "M1", "()Lll0/k;", "n0", "()Lml0/a;", "Ljl0/c;", "destination", "", "offset", "length", "r0", "(Ljava/nio/ByteBuffer;II)I", "Ljn0/h0;", "B", "()V", "", "toString", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final k f90240j;

    /* JADX INFO: renamed from: ll0.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lll0/k$a;", "", "<init>", "()V", "Lll0/k;", "Empty", "Lll0/k;", "a", "()Lll0/k;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f90240j;
        }

        private Companion() {
        }
    }

    static {
        ml0.a.Companion dVar = ml0.a.INSTANCE;
        f90240j = new k(dVar.a(), 0L, dVar.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ml0.a head, long j11, nl0.f<ml0.a> pool) {
        super(head, j11, pool);
        p013kotlin.jvm.internal.s.k(head, "head");
        p013kotlin.jvm.internal.s.k(pool, "pool");
        K0();
    }

    public final k M1() {
        return new k(h.a(y0()), J0(), H0());
    }

    @Override // ll0.o
    protected final ml0.a n0() {
        return null;
    }

    @Override // ll0.o
    protected final int r0(ByteBuffer destination, int offset, int length) {
        p013kotlin.jvm.internal.s.k(destination, "destination");
        return 0;
    }

    public String toString() {
        return "ByteReadPacket[" + hashCode() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(ml0.a head, nl0.f<ml0.a> pool) {
        this(head, h.e(head), pool);
        p013kotlin.jvm.internal.s.k(head, "head");
        p013kotlin.jvm.internal.s.k(pool, "pool");
    }

    @Override // ll0.o
    protected final void B() {
    }
}
