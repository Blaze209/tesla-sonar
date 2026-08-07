package t50;

import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.NetworkedAccountsList;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import n40.CachedPartnerAccount;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u00015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\u00020\u00132\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b#\u0010 J8\u0010)\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096@¢\u0006\u0004\b)\u0010*J*\u0010.\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0004\b.\u0010/J6\u00102\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u00101\u001a\u00020&H\u0096@¢\u0006\u0004\b2\u00103J\u001e\u00105\u001a\u00020\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0$H\u0096@¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010;¨\u0006<"}, d2 = {"Lt50/i;", "Lt50/h;", "Lr50/a;", "requestExecutor", "Lu50/c;", "provideApiRequestOptions", "Lw30/l$b;", "apiRequestFactory", "Lo30/d;", "logger", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Lr50/a;Lu50/c;Lw30/l$b;Lo30/d;Landroidx/lifecycle/s0;)V", "", "source", "", "Lcom/stripe/android/financialconnections/model/c0;", "accounts", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/List;)V", "Ln40/d;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "partnerAccountsList", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clientSecret", "sessionId", "Lcom/stripe/android/financialconnections/model/d0;", "g", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSessionClientSecret", "Lcom/stripe/android/financialconnections/model/y;", "c", "", "selectedAccountIds", "", "consentAcquired", "Lcom/stripe/android/financialconnections/model/i0;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm50/c;", "paymentAccount", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "f", "(Ljava/lang/String;Lm50/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAccounts", "updateLocalCache", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkedAccounts", "a", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr50/a;", "Lu50/c;", "Lw30/l$b;", "Lo30/d;", "Landroidx/lifecycle/s0;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class i implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r50.a requestExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u50.c provideApiRequestOptions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w30.l.b apiRequestFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl", f = "FinancialConnectionsAccountsRepository.kt", i = {0}, l = {142}, m = "getNetworkedAccounts", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112518n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112519o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112521q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112519o = obj;
            this.f112521q |= Integer.MIN_VALUE;
            return i.this.c(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl", f = "FinancialConnectionsAccountsRepository.kt", i = {0}, l = {121}, m = "postAuthorizationSessionAccounts", n = {"this"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112522n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112523o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112525q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112523o = obj;
            this.f112525q |= Integer.MIN_VALUE;
            return i.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl", f = "FinancialConnectionsAccountsRepository.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE}, m = "postAuthorizationSessionSelectedAccounts", n = {"this", "updateLocalCache"}, s = {"L$0", "Z$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112526n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f112527o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f112528p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f112530r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112528p = obj;
            this.f112530r |= Integer.MIN_VALUE;
            return i.this.b(null, null, null, false, this);
        }
    }

    public i(r50.a requestExecutor, u50.c provideApiRequestOptions, w30.l.b apiRequestFactory, o30.d logger, s0 savedStateHandle) {
        p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
        p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
        p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        this.requestExecutor = requestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.apiRequestFactory = apiRequestFactory;
        this.logger = logger;
        this.savedStateHandle = savedStateHandle;
    }

    private final void i(String source, List<PartnerAccount> accounts) {
        this.logger.debug("updating local partner accounts from " + source);
        this.savedStateHandle.n("CachedPartnerAccounts", n40.z.a(accounts));
    }

    @Override // t50.h
    public Object a(Set<String> set, Continuation<? super h0> continuation) throws Exception {
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(set2, 10));
        int i11 = 0;
        for (Object obj : set2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            arrayList.add(jn0.x.a("linked_accounts[" + i11 + "]", (String) obj));
            i11 = i12;
        }
        Object objC = this.requestExecutor.c(w30.l.b.b(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/poll_account_numbers", this.provideApiRequestOptions.a(false), v0.y(arrayList), false, 8, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // t50.h
    public Object b(String str, String str2, List<String> list, boolean z11, Continuation<? super PartnerAccountsList> continuation) {
        d dVar;
        i iVar;
        boolean z12;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f112530r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f112530r = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objD = dVar.f112528p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f112530r;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l.b bVar = this.apiRequestFactory;
            w30.l.Options optionsA = this.provideApiRequestOptions.a(true);
            Map mapM = v0.m(jn0.x.a("id", str2), jn0.x.a("client_secret", str), jn0.x.a("expand", p013kotlin.collections.v.e("data.institution")));
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
            int i13 = 0;
            for (Object obj : list2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    p013kotlin.collections.v.x();
                }
                arrayList.add(jn0.x.a("selected_accounts[" + i13 + "]", (String) obj));
                i13 = i14;
            }
            w30.l lVarD = w30.l.b.d(bVar, "https://api.stripe.com/v1/connections/auth_sessions/selected_accounts", optionsA, v0.q(mapM, arrayList), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<PartnerAccountsList> dVarSerializer = PartnerAccountsList.INSTANCE.serializer();
            dVar.f112526n = this;
            dVar.f112527o = z11;
            dVar.f112530r = 1;
            objD = aVar.d(lVarD, dVarSerializer, dVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            iVar = this;
            z12 = z11;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z12 = dVar.f112527o;
            iVar = (i) dVar.f112526n;
            jn0.t.b(objD);
        }
        PartnerAccountsList partnerAccountsList = (PartnerAccountsList) objD;
        if (z12) {
            iVar.i("postAuthorizationSessionSelectedAccounts", partnerAccountsList.b());
        }
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.h
    public Object c(String str, String str2, Continuation<? super NetworkedAccountsList> continuation) {
        b bVar;
        i iVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f112521q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f112521q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objD = bVar.f112519o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f112521q;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l lVarB = w30.l.b.b(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/networked_accounts", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("client_secret", str), jn0.x.a("consumer_session_client_secret", str2), jn0.x.a("expand", p013kotlin.collections.v.e("data.institution"))), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<NetworkedAccountsList> dVarSerializer = NetworkedAccountsList.INSTANCE.serializer();
            bVar.f112518n = this;
            bVar.f112521q = 1;
            objD = aVar.d(lVarB, dVarSerializer, bVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            iVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (i) bVar.f112518n;
            jn0.t.b(objD);
        }
        iVar.i("getNetworkedAccounts", ((NetworkedAccountsList) objD).c());
        return objD;
    }

    @Override // t50.h
    public Object d(List<PartnerAccount> list, Continuation<? super h0> continuation) {
        if (list == null) {
            list = p013kotlin.collections.v.m();
        }
        i("updateCachedAccounts", list);
        return h0.f84049a;
    }

    @Override // t50.h
    public Object e(Continuation<? super List<CachedPartnerAccount>> continuation) {
        return this.savedStateHandle.f("CachedPartnerAccounts");
    }

    @Override // t50.h
    public Object f(String str, m50.c cVar, String str2, Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
        return this.requestExecutor.d(w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/attach_payment_account", this.provideApiRequestOptions.a(true), v0.r(z50.a.a(v0.m(jn0.x.a("consumer_session_client_secret", str2), jn0.x.a("client_secret", str))), cVar.c3()), false, 8, null), LinkAccountSessionPaymentAccount.INSTANCE.serializer(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.h
    public Object g(String str, String str2, Continuation<? super PartnerAccountsList> continuation) {
        c cVar;
        i iVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f112525q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f112525q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objD = cVar.f112523o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f112525q;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/accounts", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("id", str2), jn0.x.a("client_secret", str), jn0.x.a("expand", p013kotlin.collections.v.e("data.institution"))), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<PartnerAccountsList> dVarSerializer = PartnerAccountsList.INSTANCE.serializer();
            cVar.f112522n = this;
            cVar.f112525q = 1;
            objD = aVar.d(lVarD, dVarSerializer, cVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            iVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (i) cVar.f112522n;
            jn0.t.b(objD);
        }
        iVar.i("getOrFetchAccounts", ((PartnerAccountsList) objD).b());
        return objD;
    }

    @Override // t50.h
    public Object h(String str, String str2, Set<String> set, Boolean bool, Continuation<? super ShareNetworkedAccountsResponse> continuation) {
        w30.l.b bVar = this.apiRequestFactory;
        w30.l.Options optionsA = this.provideApiRequestOptions.a(true);
        Map mapA = z50.a.a(v0.m(jn0.x.a("client_secret", str), jn0.x.a("consumer_session_client_secret", str2), jn0.x.a("consent_acquired", bool)));
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(set2, 10));
        int i11 = 0;
        for (Object obj : set2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            arrayList.add(jn0.x.a("selected_accounts[" + i11 + "]", (String) obj));
            i11 = i12;
        }
        return this.requestExecutor.d(w30.l.b.d(bVar, "https://api.stripe.com/v1/link_account_sessions/share_networked_account", optionsA, v0.q(mapA, arrayList), false, 8, null), ShareNetworkedAccountsResponse.INSTANCE.serializer(), continuation);
    }
}
