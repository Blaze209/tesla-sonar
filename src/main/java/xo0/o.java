package xo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxo0/o;", "Lxo0/n;", "Lxo0/w;", "writer", "", "forceQuoting", "<init>", "(Lxo0/w;Z)V", "", "value", "Ljn0/h0;", "n", "(Ljava/lang/String;)V", "c", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w writer, boolean z11) {
        super(writer);
        p013kotlin.jvm.internal.s.k(writer, "writer");
        this.forceQuoting = z11;
    }

    @Override // xo0.n
    public void n(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        if (this.forceQuoting) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
