package n40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ln40/h1;", "Ln40/d0;", "Lt50/l;", "errorRepository", "Lj40/f;", "analyticsTracker", "Lo30/d;", "logger", "Lo50/f;", "navigationManager", "<init>", "(Lt50/l;Lj40/f;Lo30/d;Lo50/f;)V", "", "extraMessage", "", AnalyticsAttribute.Error, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "displayErrorScreen", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Z)V", "Lt50/l;", "b", "Lj40/f;", "c", "Lo30/d;", DateTokenConverter.CONVERTER_KEY, "Lo50/f;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h1 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.l errorRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j40.f analyticsTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    public h1(t50.l errorRepository, j40.f analyticsTracker, o30.d logger, o50.f navigationManager) {
        p013kotlin.jvm.internal.s.k(errorRepository, "errorRepository");
        p013kotlin.jvm.internal.s.k(analyticsTracker, "analyticsTracker");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(navigationManager, "navigationManager");
        this.errorRepository = errorRepository;
        this.analyticsTracker = analyticsTracker;
        this.logger = logger;
        this.navigationManager = navigationManager;
    }

    @Override // n40.d0
    public void a(String extraMessage, Throwable error, FinancialConnectionsSessionManifest.Pane pane, boolean displayErrorScreen) {
        p013kotlin.jvm.internal.s.k(extraMessage, "extraMessage");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(pane, "pane");
        j40.h.b(this.analyticsTracker, extraMessage, error, this.logger, pane);
        if (displayErrorScreen) {
            this.errorRepository.e(error);
            o50.f.a.a(this.navigationManager, o50.b.k(o50.b.j.f96748i, pane, null, 2, null), null, false, 6, null);
        }
    }
}
