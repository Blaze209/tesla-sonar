package p019p1;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "num", "Lp1/v;", "a", "(D)Lp1/v;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {
    public static final ComplexDouble a(double d11) {
        return d11 < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d11))) : new ComplexDouble(Math.sqrt(d11), 0.0d);
    }
}
