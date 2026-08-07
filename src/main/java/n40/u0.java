package n40;

import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import z50.PollTimingOptions;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ln40/u0;", "", "Lt50/h;", "repository", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Lt50/h;Lcom/stripe/android/financialconnections/a$b;)V", "", "canRetry", "Lcom/stripe/android/financialconnections/model/k0;", BaseJavaModule.METHOD_TYPE_SYNC, "Lcom/stripe/android/financialconnections/model/d0;", "c", "(ZLcom/stripe/android/financialconnections/model/k0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lt50/h;", "b", "Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.h repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts", f = "PollAuthorizationSessionAccounts.kt", i = {0, 0}, l = {37}, m = "invoke", n = {BaseJavaModule.METHOD_TYPE_SYNC, "canRetry"}, s = {"L$0", "Z$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f93285n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93286o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f93287p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f93289r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93287p = obj;
            this.f93289r |= Integer.MIN_VALUE;
            return u0.this.c(false, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "exception", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$3", f = "PollAuthorizationSessionAccounts.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<Throwable, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93290n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93291o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f93291o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f93290n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return Boxing.boxBoolean(z50.c.a((Throwable) this.f93291o));
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super Boolean> continuation) {
            return ((b) create(th2, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/model/d0;", "<anonymous>", "()Lcom/stripe/android/financialconnections/model/d0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$4", f = "PollAuthorizationSessionAccounts.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.l<Continuation<? super PartnerAccountsList>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93292n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsAuthorizationSession f93294p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest f93295q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SynchronizeSessionResponse f93296r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f93297s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, SynchronizeSessionResponse synchronizeSessionResponse, boolean z11, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f93294p = financialConnectionsAuthorizationSession;
            this.f93295q = financialConnectionsSessionManifest;
            this.f93296r = synchronizeSessionResponse;
            this.f93297s = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return u0.this.new c(this.f93294p, this.f93295q, this.f93296r, this.f93297s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws AccountLoadError {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93292n;
            if (i11 == 0) {
                jn0.t.b(obj);
                t50.h hVar = u0.this.repository;
                String financialConnectionsSessionClientSecret = u0.this.configuration.getFinancialConnectionsSessionClientSecret();
                String id2 = this.f93294p.getId();
                this.f93292n = 1;
                obj = hVar.g(financialConnectionsSessionClientSecret, id2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            PartnerAccountsList partnerAccountsList = (PartnerAccountsList) obj;
            if (!partnerAccountsList.b().isEmpty()) {
                return partnerAccountsList;
            }
            FinancialConnectionsInstitution activeInstitution = this.f93295q.getActiveInstitution();
            if (activeInstitution == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new AccountLoadError(p022s40.k.g(this.f93296r), this.f93297s, activeInstitution, new APIException(null, null, 0, null, null, 31, null));
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super PartnerAccountsList> continuation) {
            return ((c) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public u0(t50.h repository, com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(boolean z11, SynchronizeSessionResponse synchronizeSessionResponse, Continuation<? super PartnerAccountsList> continuation) throws StripeException {
        a aVar;
        u0 u0Var;
        boolean z12;
        SynchronizeSessionResponse synchronizeSessionResponse2;
        FinancialConnectionsAuthorizationSession.Flow next;
        SynchronizeSessionResponse synchronizeSessionResponse3;
        boolean z13;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93289r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93289r = i11 - Integer.MIN_VALUE;
                u0Var = this;
            } else {
                u0Var = this;
                aVar = u0Var.new a(continuation);
            }
        } else {
            u0Var = this;
            aVar = u0Var.new a(continuation);
        }
        Object objB = aVar.f93287p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f93289r;
        if (i12 == 0) {
            jn0.t.b(objB);
            try {
                FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
                try {
                    if (manifest == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    FinancialConnectionsAuthorizationSession activeAuthSession = manifest.getActiveAuthSession();
                    if (activeAuthSession == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Iterator<FinancialConnectionsAuthorizationSession.Flow> it = FinancialConnectionsAuthorizationSession.Flow.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p013kotlin.jvm.internal.s.f(next.getValue(), activeAuthSession.getFlow()));
                    PollTimingOptions pollTimingOptions = new PollTimingOptions(v0.d(next), 0, 0L, 6, null);
                    b bVar = new b(null);
                    synchronizeSessionResponse2 = synchronizeSessionResponse;
                    c cVar = u0Var.new c(activeAuthSession, manifest, synchronizeSessionResponse2, z11, null);
                    try {
                        aVar.f93286o = synchronizeSessionResponse2;
                        aVar.f93285n = z11;
                        aVar.f93289r = 1;
                        objB = z50.c.b(pollTimingOptions, bVar, cVar, aVar);
                        if (objB == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        synchronizeSessionResponse3 = synchronizeSessionResponse2;
                        z13 = z11;
                    } catch (StripeException e11) {
                        e = e11;
                        z12 = z11;
                    }
                } catch (StripeException e12) {
                    e = e12;
                }
            } catch (StripeException e13) {
                e = e13;
                z12 = z11;
                synchronizeSessionResponse2 = synchronizeSessionResponse;
            }
            throw v0.c(e, synchronizeSessionResponse2.getManifest().getActiveInstitution(), p022s40.k.c(synchronizeSessionResponse2.getManifest()), z12, p022s40.k.g(synchronizeSessionResponse2));
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z13 = aVar.f93285n;
        synchronizeSessionResponse3 = (SynchronizeSessionResponse) aVar.f93286o;
        try {
            jn0.t.b(objB);
        } catch (StripeException e14) {
            e = e14;
            synchronizeSessionResponse2 = synchronizeSessionResponse3;
            z12 = z13;
        }
        return (PartnerAccountsList) objB;
    }
}
