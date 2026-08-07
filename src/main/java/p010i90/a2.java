package p010i90;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li90/x1;", "", "currentValue", "proposedValue", "", "a", "(Li90/x1;Ljava/lang/String;Ljava/lang/String;)Z", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a2 {
    public static final boolean a(x1 x1Var, String currentValue, String proposedValue) {
        s.k(x1Var, "<this>");
        s.k(currentValue, "currentValue");
        s.k(proposedValue, "proposedValue");
        return !x1Var.d() || proposedValue.length() <= currentValue.length();
    }
}
