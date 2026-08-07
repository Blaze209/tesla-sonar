package u50;

import n40.e0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import t50.CachedConsumerSession;
import t50.f;
import w30.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu50/d;", "Lu50/c;", "Lt50/f;", "consumerSessionProvider", "Ln40/e0;", "isLinkWithStripe", "Lw30/l$c;", "apiRequestOptions", "<init>", "(Lt50/f;Ln40/e0;Lw30/l$c;)V", "b", "()Lw30/l$c;", "", "useConsumerPublishableKey", "a", "(Z)Lw30/l$c;", "Lt50/f;", "Ln40/e0;", "c", "Lw30/l$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f consumerSessionProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0 isLinkWithStripe;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l.Options apiRequestOptions;

    public d(f consumerSessionProvider, e0 isLinkWithStripe, l.Options apiRequestOptions) {
        s.k(consumerSessionProvider, "consumerSessionProvider");
        s.k(isLinkWithStripe, "isLinkWithStripe");
        s.k(apiRequestOptions, "apiRequestOptions");
        this.consumerSessionProvider = consumerSessionProvider;
        this.isLinkWithStripe = isLinkWithStripe;
        this.apiRequestOptions = apiRequestOptions;
    }

    private final l.Options b() {
        String publishableKey;
        CachedConsumerSession cachedConsumerSessionA = this.consumerSessionProvider.a();
        if (cachedConsumerSessionA == null || !cachedConsumerSessionA.getIsVerified()) {
            cachedConsumerSessionA = null;
        }
        String str = (cachedConsumerSessionA == null || (publishableKey = cachedConsumerSessionA.getPublishableKey()) == null || !this.isLinkWithStripe.invoke()) ? null : publishableKey;
        if (str != null) {
            return new l.Options(str, null, null, 6, null);
        }
        return null;
    }

    @Override // u50.c
    public l.Options a(boolean useConsumerPublishableKey) {
        if (!useConsumerPublishableKey) {
            return this.apiRequestOptions;
        }
        l.Options optionsB = b();
        return optionsB == null ? this.apiRequestOptions : optionsB;
    }
}
