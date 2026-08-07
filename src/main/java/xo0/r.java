package xo0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxo0/r;", "Lxo0/n;", "Lxo0/w;", "writer", "", "forceQuoting", "<init>", "(Lxo0/w;Z)V", "", "v", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(I)V", "", "j", "(J)V", "", "e", "(B)V", "", "l", "(S)V", "c", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w writer, boolean z11) {
        super(writer);
        p013kotlin.jvm.internal.s.k(writer, "writer");
        this.forceQuoting = z11;
    }

    @Override // xo0.n
    public void e(byte v11) {
        boolean z11 = this.forceQuoting;
        String strE = jn0.y.e(jn0.y.b(v11));
        if (z11) {
            n(strE);
        } else {
            k(strE);
        }
    }

    @Override // xo0.n
    public void i(int v11) {
        boolean z11 = this.forceQuoting;
        String string = Long.toString(((long) jn0.a0.b(v11)) & 4294967295L, 10);
        if (z11) {
            n(string);
        } else {
            k(string);
        }
    }

    @Override // xo0.n
    public void j(long v11) {
        boolean z11 = this.forceQuoting;
        long jB = jn0.c0.b(v11);
        if (z11) {
            n(h.a(jB, 10));
        } else {
            k(h.a(jB, 10));
        }
    }

    @Override // xo0.n
    public void l(short v11) {
        boolean z11 = this.forceQuoting;
        String strE = jn0.f0.e(jn0.f0.b(v11));
        if (z11) {
            n(strE);
        } else {
            k(strE);
        }
    }
}
