package e50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import n40.b0;
import n40.n1;
import n40.y;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Le50/d;", "Le50/a;", "Ln40/b0;", "getOrFetchSync", "Ln40/y;", "getCachedAccounts", "Ln40/n1;", "saveAccountToLink", "Lj40/f;", "eventTracker", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "<init>", "(Ln40/b0;Ln40/y;Ln40/n1;Lj40/f;Lo50/f;Lo30/d;)V", "Le50/h;", "state", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "a", "(Le50/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "c", "()V", "", AnalyticsAttribute.Error, "b", "(Ljava/lang/Throwable;)V", "Ln40/b0;", "Ln40/y;", "Ln40/n1;", DateTokenConverter.CONVERTER_KEY, "Lj40/f;", "e", "Lo50/f;", "f", "Lo30/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements e50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y getCachedAccounts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n1 saveAccountToLink;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForNetworking", f = "LinkSignupHandler.kt", i = {0, 0, 1, 1, 1}, l = {91, 92, 95}, m = "performSignup", n = {"this", "state", "this", "state", "selectedAccounts"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f61883n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f61884o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f61885p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f61886q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f61888s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61886q = obj;
            this.f61888s |= Integer.MIN_VALUE;
            return d.this.a(null, this);
        }
    }

    public d(b0 getOrFetchSync, y getCachedAccounts, n1 saveAccountToLink, j40.f eventTracker, o50.f navigationManager, o30.d logger) {
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(getCachedAccounts, "getCachedAccounts");
        s.k(saveAccountToLink, "saveAccountToLink");
        s.k(eventTracker, "eventTracker");
        s.k(navigationManager, "navigationManager");
        s.k(logger, "logger");
        this.getOrFetchSync = getOrFetchSync;
        this.getCachedAccounts = getCachedAccounts;
        this.saveAccountToLink = saveAccountToLink;
        this.eventTracker = eventTracker;
        this.navigationManager = navigationManager;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r3.j(r2, r11, r4, r5, r10, r7) == r0) goto L31;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00e1, please report this as an issue */
    @Override // e50.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(e50.NetworkingLinkSignupState r10, p013kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest.Pane> r11) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e50.d.a(e50.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // e50.a
    public void b(Throwable error) {
        s.k(error, "error");
        j40.f fVar = this.eventTracker;
        o30.d dVar = this.logger;
        FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE;
        j40.h.b(fVar, "Error saving account to Link", error, dVar, pane);
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.y.f96764i, pane, null, 2, null), null, false, 6, null);
    }

    @Override // e50.a
    public void c() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.t.f96759i, FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE, null, 2, null), null, false, 6, null);
    }
}
