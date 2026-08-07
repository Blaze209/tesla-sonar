package bl0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lbl0/l;", "Ldl0/y;", "", "size", "<init>", "(I)V", "Lbl0/k;", "n", "()Lbl0/k;", "", "name", "Ljn0/h0;", "l", "(Ljava/lang/String;)V", "value", "m", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends dl0.y {
    public l() {
        this(0, 1, null);
    }

    @Override // dl0.y
    protected void l(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        super.l(name);
        o.f17654a.a(name);
    }

    @Override // dl0.y
    protected void m(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        super.m(value);
        o.f17654a.b(value);
    }

    public k n() {
        return new m(i());
    }

    public l(int i11) {
        super(true, i11);
    }

    public /* synthetic */ l(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 8 : i11);
    }
}
