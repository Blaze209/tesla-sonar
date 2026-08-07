package n40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SuccessPane;
import com.stripe.android.financialconnections.model.TextUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import z50.PollTimingOptions;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122*\u0010\u001a\u001a&\b\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010)J>\u0010-\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b-\u0010.J0\u00100\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00172\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b0\u00101R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010<¨\u0006="}, d2 = {"Ln40/n1;", "", "Ljava/util/Locale;", "locale", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lt50/c;", "attachedPaymentAccountRepository", "Lt50/z;", "successContentRepository", "Lt50/p;", "repository", "Lt50/h;", "accountsRepository", "<init>", "(Ljava/util/Locale;Lcom/stripe/android/financialconnections/a$b;Lt50/c;Lt50/z;Lt50/p;Lt50/h;)V", "", "shouldPollAccountNumbers", "", "Ln40/d;", "partnerAccounts", "Lkotlin/Function2;", "", "", "Lkotlin/coroutines/Continuation;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "action", "h", "(ZLjava/util/List;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkedAccountIds", "Ljn0/h0;", "f", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "manifest", "", "selectedAccounts", "l", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;I)V", "k", "(I)V", Scopes.EMAIL, "phoneNumber", PlaceTypes.COUNTRY, "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSessionClientSecret", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/Locale;", "b", "Lcom/stripe/android/financialconnections/a$b;", "c", "Lt50/c;", DateTokenConverter.CONVERTER_KEY, "Lt50/z;", "e", "Lt50/p;", "Lt50/h;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t50.c attachedPaymentAccountRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t50.z successContentRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t50.p repository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t50.h accountsRepository;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$awaitAccountNumbersReady$2", f = "SaveAccountToLink.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<Throwable, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93195n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93196o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f93196o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f93195n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return Boxing.boxBoolean(z50.c.a((Throwable) this.f93196o));
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super Boolean> continuation) {
            return ((a) create(th2, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$awaitAccountNumbersReady$3", f = "SaveAccountToLink.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.l<Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93197n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Set<String> f93199p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f93199p = set;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return n1.this.new b(this.f93199p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93197n;
            if (i11 == 0) {
                jn0.t.b(obj);
                t50.h hVar = n1.this.accountsRepository;
                Set<String> set = this.f93199p;
                this.f93197n = 1;
                if (hVar.a(set, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super jn0.h0> continuation) {
            return ((b) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink", f = "SaveAccountToLink.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {84, 89, 91}, m = "ensureReadyAccounts", n = {"this", "action", "selectedAccountIds", "this", "action", "selectedAccountIds", "this", "selectedAccountIds"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93200n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93201o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f93202p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f93203q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f93204r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f93206t;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93204r = obj;
            this.f93206t |= Integer.MIN_VALUE;
            return n1.this.h(false, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "selectedAccountIds", "", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$existing$2", f = "SaveAccountToLink.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<Set<? extends String>, Continuation<? super FinancialConnectionsSessionManifest>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93207n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93208o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f93210q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f93210q = str;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Set<String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((d) create(set, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            d dVar = n1.this.new d(this.f93210q, continuation);
            dVar.f93208o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93207n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            Set<String> set = (Set) this.f93208o;
            t50.p pVar = n1.this.repository;
            String financialConnectionsSessionClientSecret = n1.this.configuration.getFinancialConnectionsSessionClientSecret();
            String str = this.f93210q;
            this.f93207n = 1;
            Object objD = pVar.d(financialConnectionsSessionClientSecret, null, null, null, null, str, set, this);
            return objD == coroutine_suspended ? coroutine_suspended : objD;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "selectedAccountIds", "", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$new$2", f = "SaveAccountToLink.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<Set<? extends String>, Continuation<? super FinancialConnectionsSessionManifest>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93211n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93212o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f93214q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f93215r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f93216s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, String str3, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f93214q = str;
            this.f93215r = str2;
            this.f93216s = str3;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Set<String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((e) create(set, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            e eVar = n1.this.new e(this.f93214q, this.f93215r, this.f93216s, continuation);
            eVar.f93212o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93211n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            Set<String> set = (Set) this.f93212o;
            t50.p pVar = n1.this.repository;
            String financialConnectionsSessionClientSecret = n1.this.configuration.getFinancialConnectionsSessionClientSecret();
            Locale locale = n1.this.locale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            String languageTag = locale.toLanguageTag();
            String str = this.f93214q;
            String str2 = this.f93215r;
            String str3 = this.f93216s;
            this.f93211n = 1;
            Object objD = pVar.d(financialConnectionsSessionClientSecret, str, str2, languageTag, str3, null, set, this);
            return objD == coroutine_suspended ? coroutine_suspended : objD;
        }
    }

    public n1(Locale locale, com.stripe.android.financialconnections.a.Configuration configuration, t50.c attachedPaymentAccountRepository, t50.z successContentRepository, t50.p repository, t50.h accountsRepository) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(attachedPaymentAccountRepository, "attachedPaymentAccountRepository");
        p013kotlin.jvm.internal.s.k(successContentRepository, "successContentRepository");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(accountsRepository, "accountsRepository");
        this.locale = locale;
        this.configuration = configuration;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.successContentRepository = successContentRepository;
        this.repository = repository;
        this.accountsRepository = accountsRepository;
    }

    private final Object f(Set<String> set, Continuation<? super jn0.h0> continuation) {
        io0.b.Companion companion = io0.b.INSTANCE;
        Object objB = z50.c.b(new PollTimingOptions(io0.b.p(io0.d.s(1, io0.e.SECONDS)), 20, 0L, 4, null), new a(null), new b(set, null), continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.h0.f84049a;
    }

    private final Object g(Continuation<? super jn0.h0> continuation) {
        Object objB = this.repository.b(this.configuration.getFinancialConnectionsSessionClientSecret(), "account_numbers_not_available", null, continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b A[PHI: r2 r10 r11 r12
      0x015b: PHI (r2v12 n40.n1) = (r2v10 n40.n1), (r2v10 n40.n1), (r2v16 n40.n1) binds: [B:72:0x0148, B:74:0x0158, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r10v30 java.lang.Object) = (r10v26 java.lang.Object), (r10v26 java.lang.Object), (r10v45 java.lang.Object) binds: [B:72:0x0148, B:74:0x0158, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r11v14 java.util.Set) = (r11v10 java.util.Set), (r11v10 java.util.Set), (r11v27 java.util.Set) binds: [B:72:0x0148, B:74:0x0158, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r12v6 wn0.p<? super java.util.Set<java.lang.String>, ? super kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest>, ? extends java.lang.Object>) = 
      (r12v3 wn0.p<? super java.util.Set<java.lang.String>, ? super kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest>, ? extends java.lang.Object>)
      (r12v3 wn0.p<? super java.util.Set<java.lang.String>, ? super kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest>, ? extends java.lang.Object>)
      (r12v19 wn0.p<? super java.util.Set<java.lang.String>, ? super kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest>, ? extends java.lang.Object>)
     binds: [B:72:0x0148, B:74:0x0158, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    /* JADX WARN: Code duplicated, block: B:87:0x018d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0197  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    public final Object h(boolean z11, List<CachedPartnerAccount> list, wn0.p<? super Set<String>, ? super Continuation<? super FinancialConnectionsSessionManifest>, ? extends Object> pVar, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        c cVar;
        Set setD;
        Set<String> setD2;
        Object objB;
        n1 n1Var;
        Set set;
        Throwable th2;
        Set set2;
        n1 n1Var2;
        Object objB2;
        Set set3;
        n1 n1Var3;
        Object objB3;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f93206t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f93206t = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objInvoke = cVar.f93204r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f93206t;
        if (i12 == 0) {
            jn0.t.b(objInvoke);
            if (list != null) {
                List<CachedPartnerAccount> list2 = list;
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CachedPartnerAccount) it.next()).getId());
                }
                setD = p013kotlin.collections.v.r1(arrayList);
                if (setD == null) {
                    setD = p013kotlin.collections.d1.d();
                }
            } else {
                setD = p013kotlin.collections.d1.d();
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    String linkedAccountId = ((CachedPartnerAccount) it2.next()).getLinkedAccountId();
                    if (linkedAccountId != null) {
                        arrayList2.add(linkedAccountId);
                    }
                }
                setD2 = p013kotlin.collections.v.r1(arrayList2);
                if (setD2 == null) {
                    setD2 = p013kotlin.collections.d1.d();
                }
            } else {
                setD2 = p013kotlin.collections.d1.d();
            }
            List<CachedPartnerAccount> list3 = list;
            if (list3 != null && !list3.isEmpty()) {
                if (z11) {
                    try {
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        cVar.f93200n = this;
                        cVar.f93201o = pVar;
                        cVar.f93202p = setD;
                        cVar.f93206t = 1;
                        if (f(setD2, cVar) != coroutine_suspended) {
                            n1Var2 = this;
                            set2 = setD;
                        }
                    } catch (Throwable th3) {
                        Set set4 = setD;
                        th2 = th3;
                        set2 = set4;
                        n1Var2 = this;
                        jn0.s.Companion companion2 = jn0.s.INSTANCE;
                        objB2 = jn0.s.b(jn0.t.a(th2));
                    }
                } else {
                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.h0.f84049a);
                }
                return coroutine_suspended;
            }
            t50.c.State stateB = this.attachedPaymentAccountRepository.b();
            if ((stateB != null ? stateB.getAttachedPaymentAccount() : null) instanceof m50.c.BankAccount) {
                jn0.s.Companion companion4 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.h0.f84049a);
            } else {
                jn0.s.Companion companion5 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(new IllegalStateException("Must have a bank account attached if no accounts are selected")));
            }
            n1Var = this;
            set = setD;
            if (jn0.s.e(objB) != null) {
                if (jn0.s.h(objB)) {
                    cVar.f93200n = n1Var;
                    cVar.f93201o = set;
                    cVar.f93202p = null;
                    cVar.f93203q = null;
                    cVar.f93206t = 3;
                    objInvoke = pVar.invoke(set, cVar);
                    if (objInvoke != coroutine_suspended) {
                        set3 = set;
                        n1Var3 = n1Var;
                        objB3 = jn0.s.b((FinancialConnectionsSessionManifest) objInvoke);
                    }
                    return coroutine_suspended;
                }
                objB3 = jn0.s.b(objB);
                if (jn0.s.h(objB3)) {
                    n1Var.l((FinancialConnectionsSessionManifest) objB3, set.size());
                }
                if (jn0.s.e(objB3) != null) {
                    n1Var.k(set.size());
                }
                jn0.t.b(objB3);
                return objB3;
            }
            cVar.f93200n = n1Var;
            cVar.f93201o = pVar;
            cVar.f93202p = set;
            cVar.f93203q = objB;
            cVar.f93206t = 2;
            if (n1Var.g(cVar) != coroutine_suspended) {
                if (jn0.s.h(objB)) {
                    cVar.f93200n = n1Var;
                    cVar.f93201o = set;
                    cVar.f93202p = null;
                    cVar.f93203q = null;
                    cVar.f93206t = 3;
                    objInvoke = pVar.invoke(set, cVar);
                    if (objInvoke != coroutine_suspended) {
                        set3 = set;
                        n1Var3 = n1Var;
                        objB3 = jn0.s.b((FinancialConnectionsSessionManifest) objInvoke);
                    }
                } else {
                    objB3 = jn0.s.b(objB);
                }
                if (jn0.s.h(objB3)) {
                    n1Var.l((FinancialConnectionsSessionManifest) objB3, set.size());
                }
                if (jn0.s.e(objB3) != null) {
                    n1Var.k(set.size());
                }
                jn0.t.b(objB3);
                return objB3;
            }
            return coroutine_suspended;
            n1Var = n1Var3;
            set = set3;
            if (jn0.s.h(objB3)) {
                n1Var.l((FinancialConnectionsSessionManifest) objB3, set.size());
            }
            if (jn0.s.e(objB3) != null) {
                n1Var.k(set.size());
            }
            jn0.t.b(objB3);
            return objB3;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set3 = (Set) cVar.f93201o;
                n1Var3 = (n1) cVar.f93200n;
                try {
                    jn0.t.b(objInvoke);
                    objB3 = jn0.s.b((FinancialConnectionsSessionManifest) objInvoke);
                } catch (Throwable th4) {
                    th = th4;
                    jn0.s.Companion companion6 = jn0.s.INSTANCE;
                    objB3 = jn0.s.b(jn0.t.a(th));
                }
                n1Var = n1Var3;
                set = set3;
                if (jn0.s.h(objB3)) {
                    n1Var.l((FinancialConnectionsSessionManifest) objB3, set.size());
                }
                if (jn0.s.e(objB3) != null) {
                    n1Var.k(set.size());
                }
                jn0.t.b(objB3);
                return objB3;
            }
            objB = cVar.f93203q;
            set = (Set) cVar.f93202p;
            pVar = (wn0.p) cVar.f93201o;
            n1Var = (n1) cVar.f93200n;
            jn0.t.b(objInvoke);
            if (jn0.s.h(objB)) {
                try {
                    cVar.f93200n = n1Var;
                    cVar.f93201o = set;
                    cVar.f93202p = null;
                    cVar.f93203q = null;
                    cVar.f93206t = 3;
                    objInvoke = pVar.invoke(set, cVar);
                    if (objInvoke != coroutine_suspended) {
                        set3 = set;
                        n1Var3 = n1Var;
                        objB3 = jn0.s.b((FinancialConnectionsSessionManifest) objInvoke);
                        n1Var = n1Var3;
                        set = set3;
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th = th5;
                    set3 = set;
                    n1Var3 = n1Var;
                    jn0.s.Companion companion7 = jn0.s.INSTANCE;
                    objB3 = jn0.s.b(jn0.t.a(th));
                }
            } else {
                objB3 = jn0.s.b(objB);
            }
            if (jn0.s.h(objB3)) {
                n1Var.l((FinancialConnectionsSessionManifest) objB3, set.size());
            }
            if (jn0.s.e(objB3) != null) {
                n1Var.k(set.size());
            }
            jn0.t.b(objB3);
            return objB3;
        }
        set2 = (Set) cVar.f93202p;
        pVar = (wn0.p) cVar.f93201o;
        n1Var2 = (n1) cVar.f93200n;
        try {
            jn0.t.b(objInvoke);
        } catch (Throwable th6) {
            th2 = th6;
            jn0.s.Companion companion8 = jn0.s.INSTANCE;
            objB2 = jn0.s.b(jn0.t.a(th2));
        }
        objB2 = jn0.s.b(jn0.h0.f84049a);
        n1Var = n1Var2;
        set = set2;
        objB = objB2;
        if (jn0.s.e(objB) != null) {
            if (jn0.s.h(objB)) {
                cVar.f93200n = n1Var;
                cVar.f93201o = set;
                cVar.f93202p = null;
                cVar.f93203q = null;
                cVar.f93206t = 3;
                objInvoke = pVar.invoke(set, cVar);
                if (objInvoke != coroutine_suspended) {
                    set3 = set;
                    n1Var3 = n1Var;
                    objB3 = jn0.s.b((FinancialConnectionsSessionManifest) objInvoke);
                }
                return coroutine_suspended;
            }
            objB3 = jn0.s.b(objB);
            if (jn0.s.h(objB3)) {
                n1Var.l((FinancialConnectionsSessionManifest) objB3, set.size());
            }
            if (jn0.s.e(objB3) != null) {
                n1Var.k(set.size());
            }
            jn0.t.b(objB3);
            return objB3;
        }
        cVar.f93200n = n1Var;
        cVar.f93201o = pVar;
        cVar.f93202p = set;
        cVar.f93203q = objB;
        cVar.f93206t = 2;
        if (n1Var.g(cVar) != coroutine_suspended) {
            if (jn0.s.h(objB)) {
                cVar.f93200n = n1Var;
                cVar.f93201o = set;
                cVar.f93202p = null;
                cVar.f93203q = null;
                cVar.f93206t = 3;
                objInvoke = pVar.invoke(set, cVar);
                if (objInvoke != coroutine_suspended) {
                    set3 = set;
                    n1Var3 = n1Var;
                    objB3 = jn0.s.b((FinancialConnectionsSessionManifest) objInvoke);
                }
            } else {
                objB3 = jn0.s.b(objB);
            }
            if (jn0.s.h(objB3)) {
                n1Var.l((FinancialConnectionsSessionManifest) objB3, set.size());
            }
            if (jn0.s.e(objB3) != null) {
                n1Var.k(set.size());
            }
            jn0.t.b(objB3);
            return objB3;
        }
        return coroutine_suspended;
        n1Var = n1Var3;
        set = set3;
        if (jn0.s.h(objB3)) {
            n1Var.l((FinancialConnectionsSessionManifest) objB3, set.size());
        }
        if (jn0.s.e(objB3) != null) {
            n1Var.k(set.size());
        }
        jn0.t.b(objB3);
        return objB3;
    }

    private final void k(int selectedAccounts) {
        t50.z.f(this.successContentRepository, new v50.g.PluralId(i40.j.f75848d, Math.max(1, selectedAccounts), null, 4, null), null, 2, null);
    }

    private final void l(FinancialConnectionsSessionManifest manifest, int selectedAccounts) {
        SuccessPane successPane;
        String subCaption;
        SuccessPane successPane2;
        String caption;
        t50.z zVar = this.successContentRepository;
        TextUpdate displayText = manifest.getDisplayText();
        v50.g.Text text = (displayText == null || (successPane2 = displayText.getSuccessPane()) == null || (caption = successPane2.getCaption()) == null) ? null : new v50.g.Text(caption);
        TextUpdate displayText2 = manifest.getDisplayText();
        zVar.e((displayText2 == null || (successPane = displayText2.getSuccessPane()) == null || (subCaption = successPane.getSubCaption()) == null) ? new v50.g.PluralId(i40.j.f75849e, Math.max(1, selectedAccounts), null, 4, null) : new v50.g.Text(subCaption), text);
    }

    public final Object i(String str, List<CachedPartnerAccount> list, boolean z11, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        return h(z11, list, new d(str, null), continuation);
    }

    public final Object j(String str, String str2, List<CachedPartnerAccount> list, String str3, boolean z11, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        return h(z11, list, new e(str, str3, str2, null), continuation);
    }
}
