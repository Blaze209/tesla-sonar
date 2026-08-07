package lo0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llo0/t0;", "Lno0/z;", "Llo0/h;", "Llo0/h0;", "padding", "", "isYearOfEra", "<init>", "(Llo0/h0;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "f", "Llo0/h0;", "g", "Z", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class t0 extends no0.z<h> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h0 padding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isYearOfEra;

    public /* synthetic */ t0(h0 h0Var, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, (i11 & 2) != 0 ? false : z11);
    }

    public boolean equals(Object other) {
        if (!(other instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) other;
        return this.padding == t0Var.padding && this.isYearOfEra == t0Var.isYearOfEra;
    }

    public int hashCode() {
        return (this.padding.hashCode() * 31) + Boolean.hashCode(this.isYearOfEra);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(h0 padding, boolean z11) {
        super(i.f90515a.d(), Integer.valueOf(padding != h0.ZERO ? 1 : 4), null, padding == h0.SPACE ? 4 : null, 4);
        p013kotlin.jvm.internal.s.k(padding, "padding");
        this.padding = padding;
        this.isYearOfEra = z11;
    }
}
