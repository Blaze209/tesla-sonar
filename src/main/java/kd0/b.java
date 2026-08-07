package kd0;

import com.google.firebase.perf.metrics.Trace;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t*\n\u0010\n\"\u00020\u00002\u00020\u0000¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/perf/metrics/Trace;", "Lcom/tesla/monitoring/FirebaseTrace;", "Lkd0/a;", "attribute", "Ljn0/h0;", "a", "(Lcom/google/firebase/perf/metrics/Trace;Lkd0/a;)V", "", "b", "(Ljava/lang/String;)Ljava/lang/String;", "FirebaseTrace", "monitoring_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final void a(Trace trace, a attribute) {
        s.k(trace, "<this>");
        s.k(attribute, "attribute");
        trace.putAttribute(b(attribute.getName()), b(attribute.getValue().toString()));
    }

    public static final String b(String str) {
        s.k(str, "<this>");
        Locale US = Locale.US;
        s.j(US, "US");
        String lowerCase = str.toLowerCase(US);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
