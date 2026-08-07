package e50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import n40.b0;
import n40.d0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Le50/b;", "Le50/a;", "Lt50/j;", "consumerRepository", "Ln40/c;", "attachConsumerToLinkAccountSession", "Ln40/b0;", "getOrFetchSync", "Lo50/f;", "navigationManager", "Ln40/d0;", "handleError", "<init>", "(Lt50/j;Ln40/c;Ln40/b0;Lo50/f;Ln40/d0;)V", "Le50/h;", "state", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "a", "(Le50/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "c", "()V", "", AnalyticsAttribute.Error, "b", "(Ljava/lang/Throwable;)V", "Lt50/j;", "Ln40/c;", "Ln40/b0;", DateTokenConverter.CONVERTER_KEY, "Lo50/f;", "e", "Ln40/d0;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements e50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.j consumerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n40.c attachConsumerToLinkAccountSession;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d0 handleError;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits", f = "LinkSignupHandler.kt", i = {0, 1}, l = {50, 56, 60}, m = "performSignup", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f61868n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f61869o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f61871q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61869o = obj;
            this.f61871q |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(t50.j consumerRepository, n40.c attachConsumerToLinkAccountSession, b0 getOrFetchSync, o50.f navigationManager, d0 handleError) {
        s.k(consumerRepository, "consumerRepository");
        s.k(attachConsumerToLinkAccountSession, "attachConsumerToLinkAccountSession");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(navigationManager, "navigationManager");
        s.k(handleError, "handleError");
        this.consumerRepository = consumerRepository;
        this.attachConsumerToLinkAccountSession = attachConsumerToLinkAccountSession;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.handleError = handleError;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (r9 == r1) goto L27;
     */
    @Override // e50.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(e50.NetworkingLinkSignupState r8, p013kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest.Pane> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof e50.b.a
            if (r0 == 0) goto L13
            r0 = r9
            e50.b$a r0 = (e50.b.a) r0
            int r1 = r0.f61871q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61871q = r1
            goto L18
        L13:
            e50.b$a r0 = new e50.b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f61869o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f61871q
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            jn0.t.b(r9)
            goto La7
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f61868n
            e50.b r8 = (e50.b) r8
            jn0.t.b(r9)
            goto L97
        L40:
            java.lang.Object r8 = r0.f61868n
            e50.b r8 = (e50.b) r8
            jn0.t.b(r9)
            goto L80
        L48:
            jn0.t.b(r9)
            s50.a r9 = r8.e()
            java.lang.Object r9 = r9.a()
            p013kotlin.jvm.internal.s.h(r9)
            e50.h$b r9 = (e50.NetworkingLinkSignupState.Payload) r9
            i90.q0 r9 = r9.getPhoneController()
            t50.j r2 = r7.consumerRepository
            java.lang.String r6 = r8.getValidEmail()
            p013kotlin.jvm.internal.s.h(r6)
            java.lang.String r8 = r8.getValidPhone()
            p013kotlin.jvm.internal.s.h(r8)
            java.lang.String r8 = r9.y(r8)
            java.lang.String r9 = r9.w()
            r0.f61868n = r7
            r0.f61871q = r5
            java.lang.Object r9 = r2.a(r6, r8, r9, r0)
            if (r9 != r1) goto L7f
            goto La6
        L7f:
            r8 = r7
        L80:
            com.stripe.android.model.v r9 = (com.stripe.android.model.ConsumerSessionSignup) r9
            n40.c r2 = r8.attachConsumerToLinkAccountSession
            com.stripe.android.model.t r9 = r9.getConsumerSession()
            java.lang.String r9 = r9.getClientSecret()
            r0.f61868n = r8
            r0.f61871q = r4
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L97
            goto La6
        L97:
            n40.b0 r8 = r8.getOrFetchSync
            n40.b0$a$a r9 = n40.b0.a.C1985a.f93053a
            r2 = 0
            r0.f61868n = r2
            r0.f61871q = r3
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            com.stripe.android.financialconnections.model.k0 r9 = (com.stripe.android.financialconnections.model.SynchronizeSessionResponse) r9
            com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest r8 = r9.getManifest()
            com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest$Pane r8 = r8.getNextPane()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e50.b.a(e50.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // e50.a
    public void b(Throwable error) {
        s.k(error, "error");
        this.handleError.a("Error creating a Link account", error, FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, true);
    }

    @Override // e50.a
    public void c() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.s.f96758i, FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, null, 2, null), null, false, 6, null);
    }
}
