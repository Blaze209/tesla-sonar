package sb;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsb/m0;", "Lsb/z;", "a", "(Lsb/m0;)Lsb/z;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v1 {
    public static final WorkGenerationalId a(m0 m0Var) {
        p013kotlin.jvm.internal.s.k(m0Var, "<this>");
        return new WorkGenerationalId(m0Var.id, m0Var.getGeneration());
    }
}
