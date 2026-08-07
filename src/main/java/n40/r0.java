package n40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0015"}, d2 = {"Ln40/r0;", "", "Lj40/f;", "eventTracker", "Ll40/a;", "debugConfiguration", "<init>", "(Lj40/f;Ll40/a;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "manifest", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z", "c", "e", "b", "Ljn0/h0;", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V", "Lj40/f;", "Ll40/a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f93242d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l40.a debugConfiguration;

    public r0(j40.f eventTracker, l40.a debugConfiguration) {
        p013kotlin.jvm.internal.s.k(eventTracker, "eventTracker");
        p013kotlin.jvm.internal.s.k(debugConfiguration, "debugConfiguration");
        this.eventTracker = eventTracker;
        this.debugConfiguration = debugConfiguration;
    }

    private final boolean c(FinancialConnectionsSessionManifest manifest) {
        Boolean isLinkWithStripe = manifest.getIsLinkWithStripe();
        return (isLinkWithStripe != null ? isLinkWithStripe.booleanValue() : false) || p013kotlin.jvm.internal.s.f(z50.e.a(manifest, z50.d.CONNECTIONS_MOBILE_NATIVE), "treatment");
    }

    private final boolean d(FinancialConnectionsSessionManifest manifest) {
        Map<String, Boolean> mapV = manifest.v();
        if (mapV == null) {
            return true;
        }
        if (mapV.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, Boolean> entry : mapV.entrySet()) {
            if (p013kotlin.jvm.internal.s.f(entry.getKey(), "bank_connections_mobile_native_version_killswitch") && entry.getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(FinancialConnectionsSessionManifest manifest) {
        boolean z11 = this.debugConfiguration.a() != null;
        Boolean isLinkWithStripe = manifest.getIsLinkWithStripe();
        return (z11 || (isLinkWithStripe != null ? isLinkWithStripe.booleanValue() : false) || d(manifest)) ? false : true;
    }

    public final void a(FinancialConnectionsSessionManifest manifest) {
        p013kotlin.jvm.internal.s.k(manifest, "manifest");
        if (e(manifest)) {
            z50.e.c(this.eventTracker, z50.d.CONNECTIONS_MOBILE_NATIVE, manifest);
        }
    }

    public final boolean b(FinancialConnectionsSessionManifest manifest) {
        p013kotlin.jvm.internal.s.k(manifest, "manifest");
        Boolean boolA = this.debugConfiguration.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        return !d(manifest) && c(manifest);
    }
}
