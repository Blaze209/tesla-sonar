package ll0;

import java.nio.ByteBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lll0/j;", "Lll0/r;", "Lnl0/f;", "Lml0/a;", "pool", "<init>", "(Lnl0/f;)V", "Ljn0/h0;", "T", "()V", "Ljl0/c;", "source", "", "offset", "length", "b0", "(Ljava/nio/ByteBuffer;II)V", "", "value", "K0", "(C)Lll0/j;", "", "O0", "(Ljava/lang/CharSequence;)Lll0/j;", "startIndex", "endIndex", "P0", "(Ljava/lang/CharSequence;II)Lll0/j;", "Lll0/k;", "T0", "()Lll0/k;", "", "toString", "()Ljava/lang/String;", "U0", "()I", "size", "", "Y0", "()Z", "isEmpty", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends r {
    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // ll0.r
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j o(char value) {
        r rVarO = super.o(value);
        p013kotlin.jvm.internal.s.i(rVarO, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) rVarO;
    }

    @Override // ll0.r
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j p(CharSequence value) {
        r rVarP = super.p(value);
        p013kotlin.jvm.internal.s.i(rVarP, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) rVarP;
    }

    @Override // ll0.r
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j t(CharSequence value, int startIndex, int endIndex) {
        r rVarT = super.t(value, startIndex, endIndex);
        p013kotlin.jvm.internal.s.i(rVarT, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) rVarT;
    }

    public final k T0() {
        int iU0 = U0();
        ml0.a aVarY0 = y0();
        return aVarY0 == null ? k.INSTANCE.a() : new k(aVarY0, iU0, k0());
    }

    public final int U0() {
        return t0();
    }

    public final boolean Y0() {
        return t0() == 0;
    }

    @Override // ll0.r
    protected final void b0(ByteBuffer source, int offset, int length) {
        p013kotlin.jvm.internal.s.k(source, "source");
    }

    public String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }

    public /* synthetic */ j(nl0.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ml0.a.INSTANCE.c() : fVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nl0.f<ml0.a> pool) {
        super(pool);
        p013kotlin.jvm.internal.s.k(pool, "pool");
    }

    @Override // ll0.r
    protected final void T() {
    }
}
