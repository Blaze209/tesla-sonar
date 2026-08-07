package h50;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import t50.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lh50/g;", "Lh50/f;", "Lo50/f;", "navigationManager", "Lt50/u;", "noticeSheetContentRepository", "Lt50/a;", "accountUpdateRequiredContentRepository", "<init>", "(Lo50/f;Lt50/u;Lt50/a;)V", "Lh50/b$a;", "content", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "referrer", "Ljn0/h0;", "a", "(Lh50/b$a;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "Lo50/f;", "b", "Lt50/u;", "c", "Lt50/a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u noticeSheetContentRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t50.a accountUpdateRequiredContentRepository;

    public g(o50.f navigationManager, u noticeSheetContentRepository, t50.a accountUpdateRequiredContentRepository) {
        s.k(navigationManager, "navigationManager");
        s.k(noticeSheetContentRepository, "noticeSheetContentRepository");
        s.k(accountUpdateRequiredContentRepository, "accountUpdateRequiredContentRepository");
        this.navigationManager = navigationManager;
        this.noticeSheetContentRepository = noticeSheetContentRepository;
        this.accountUpdateRequiredContentRepository = accountUpdateRequiredContentRepository;
    }

    @Override // h50.f
    public void a(NoticeSheetState.a content, FinancialConnectionsSessionManifest.Pane referrer) {
        s.k(content, "content");
        s.k(referrer, "referrer");
        if (content instanceof NoticeSheetState.a.UpdateRequired) {
            this.accountUpdateRequiredContentRepository.e((NoticeSheetState.a.UpdateRequired) content);
            o50.f.a.a(this.navigationManager, o50.b.k(o50.b.C2057b.f96736i, referrer, null, 2, null), null, false, 6, null);
        } else {
            this.noticeSheetContentRepository.e(content);
            o50.f.a.a(this.navigationManager, o50.b.k(o50.b.u.f96760i, referrer, null, 2, null), null, false, 6, null);
        }
    }
}
