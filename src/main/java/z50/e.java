package z50;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import j40.FinancialConnectionsEvent;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "Lz50/d;", "experiment", "", "b", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lz50/d;)Z", "", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lz50/d;)Ljava/lang/String;", "Lj40/f;", "manifest", "Ljn0/h0;", "c", "(Lj40/f;Lz50/d;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {
    public static final String a(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, d experiment) {
        s.k(financialConnectionsSessionManifest, "<this>");
        s.k(experiment, "experiment");
        Map<String, String> mapU = financialConnectionsSessionManifest.u();
        if (mapU != null) {
            return mapU.get(experiment.getKey());
        }
        return null;
    }

    public static final boolean b(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, d experiment) {
        s.k(financialConnectionsSessionManifest, "<this>");
        s.k(experiment, "experiment");
        return a(financialConnectionsSessionManifest, experiment) != null;
    }

    public static final void c(j40.f fVar, d experiment, FinancialConnectionsSessionManifest manifest) {
        s.k(fVar, "<this>");
        s.k(experiment, "experiment");
        s.k(manifest, "manifest");
        String assignmentEventId = manifest.getAssignmentEventId();
        String accountholderToken = manifest.getAccountholderToken();
        if (!b(manifest, experiment) || assignmentEventId == null || accountholderToken == null) {
            return;
        }
        fVar.a(new FinancialConnectionsEvent.q(experiment.getKey(), assignmentEventId, accountholderToken));
    }
}
