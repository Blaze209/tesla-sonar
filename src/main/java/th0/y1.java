package th0;

import java.io.File;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lth0/x1;", "Ljn0/h0;", "a", "(Lth0/x1;)V", "selfie_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class y1 {
    public static final void a(x1 x1Var) {
        p013kotlin.jvm.internal.s.k(x1Var, "<this>");
        Iterator<T> it = x1Var.q().iterator();
        while (it.hasNext()) {
            new File(((a1) it.next()).getAbsoluteFilePath()).delete();
        }
    }
}
