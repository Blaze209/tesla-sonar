package lo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llo0/s0;", "Lno0/c0;", "Llo0/n0;", "Llo0/h0;", "padding", "<init>", "(Llo0/h0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "e", "Llo0/h0;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s0 extends no0.c0<n0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h0 padding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(h0 padding) {
        super(g0.f90505a.c(), padding == h0.ZERO ? 2 : 1, padding == h0.SPACE ? 2 : null);
        p013kotlin.jvm.internal.s.k(padding, "padding");
        this.padding = padding;
    }

    public boolean equals(Object other) {
        return (other instanceof s0) && this.padding == ((s0) other).padding;
    }

    public int hashCode() {
        return this.padding.hashCode();
    }
}
