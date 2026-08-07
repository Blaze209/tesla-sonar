package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlow;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u000f\u0010#¨\u0006%"}, d2 = {"Lz80/g0;", "Li90/l1;", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "", "Li90/g0;", "", "initialValues", "", "collectName", "Lx80/a;", "cbcEligibility", "<init>", "(Lh30/b$a;Ljava/util/Map;ZLx80/a;)V", "Lz80/d0;", "a", "Lz80/d0;", "u", "()Lz80/d0;", "cardDetailsElement", "b", "Z", "v", "()Z", "isCardScanEnabled", "Lw80/e;", "c", "Lw80/e;", "w", "()Lw80/e;", "isStripeCardScanAvailable", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/c0;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", AnalyticsAttribute.Error, "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g0 implements p010i90.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d0 cardDetailsElement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isCardScanEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w80.e isStripeCardScanAvailable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.c0> error;

    public g0(h30.b.a cardAccountRangeRepositoryFactory, Map<IdentifierSpec, String> initialValues, boolean z11, x80.a cbcEligibility) {
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        p013kotlin.jvm.internal.s.k(cbcEligibility, "cbcEligibility");
        d0 d0Var = new d0(IdentifierSpec.INSTANCE.a("card_detail"), cardAccountRangeRepositoryFactory, initialValues, z11, cbcEligibility, null, 32, null);
        this.cardDetailsElement = d0Var;
        this.isCardScanEnabled = d0Var.getIsCardScanEnabled();
        this.isStripeCardScanAvailable = new w80.e();
        this.error = d0Var.getController().a();
    }

    @Override // p010i90.l1
    public StateFlow<p010i90.c0> a() {
        return this.error;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final d0 getCardDetailsElement() {
        return this.cardDetailsElement;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsCardScanEnabled() {
        return this.isCardScanEnabled;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final w80.e getIsStripeCardScanAvailable() {
        return this.isStripeCardScanAvailable;
    }
}
