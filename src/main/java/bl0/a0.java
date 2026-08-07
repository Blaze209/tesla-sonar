package bl0;

import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbl0/a0;", "Lbl0/x;", "Ldl0/z;", "", "", "", "values", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 extends dl0.z implements x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Map<String, ? extends List<String>> values) {
        super(true, values);
        p013kotlin.jvm.internal.s.k(values, "values");
    }

    public String toString() {
        return "Parameters " + a();
    }
}
