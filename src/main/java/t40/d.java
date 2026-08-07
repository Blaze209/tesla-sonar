package t40;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import h50.NoticeSheetState;
import j40.FinancialConnectionsEvent;
import java.util.Date;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import n40.b0;
import n40.p0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import wn0.p;
import z50.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0BS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0016¢\u0006\u0004\b%\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.¨\u00061"}, d2 = {"Lt40/d;", "Ls50/i;", "Lt40/c;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Ln40/a;", "acceptConsent", "Ln40/b0;", "getOrFetchSync", "Lo50/f;", "navigationManager", "Lj40/f;", "eventTracker", "Lv50/d;", "handleClickableUrl", "Lo30/d;", "logger", "Lh50/f;", "presentSheet", "<init>", "(Lt40/c;Ln40/p0;Ln40/a;Ln40/b0;Lo50/f;Lj40/f;Lv50/d;Lo30/d;Lh50/f;)V", "Ljn0/h0;", "x", "()V", "B", "C", "state", "Lq50/c;", "D", "(Lt40/c;)Lq50/c;", "z", "", "uri", "Lkotlinx/coroutines/Job;", "y", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "A", "v", "Ln40/a;", "w", "Ln40/b0;", "Lo50/f;", "Lj40/f;", "Lv50/d;", "Lo30/d;", "Lh50/f;", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends s50.i<ConsentState> {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int D = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final h50.f presentSheet;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final n40.a acceptConsent;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final v50.d handleClickableUrl;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt40/c$a;", "<anonymous>", "()Lt40/c$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$1", f = "ConsentViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super ConsentState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f112435n;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f112435n;
            if (i11 == 0) {
                t.b(obj);
                b0 b0Var = d.this.getOrFetchSync;
                this.f112435n = 1;
                obj = b0.b(b0Var, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
            z50.d dVar = z50.d.CONNECTIONS_CONSENT_COMBINED_LOGO;
            boolean zF = s.f(z50.e.a(manifest, dVar), "treatment");
            z50.e.c(d.this.eventTracker, dVar, manifest);
            TextUpdate text = synchronizeSessionResponse.getText();
            s.h(text);
            ConsentPane consent = text.getConsent();
            s.h(consent);
            return new ConsentState.Payload(consent, synchronizeSessionResponse.getVisual().b(), zF, t40.e.b(synchronizeSessionResponse.getManifest()));
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super ConsentState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt40/c;", "Ls50/a;", "Lt40/c$a;", "it", "a", "(Lt40/c;Ls50/a;)Lt40/c;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<ConsentState, s50.a<? extends ConsentState.Payload>, ConsentState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f112437c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsentState invoke(ConsentState execute, s50.a<ConsentState.Payload> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return ConsentState.b(execute, it, null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: t40.d$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt40/d$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: t40.d$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lt40/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lt40/d;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<CreationExtras, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f112438c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f112438c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f112438c.m().a(new ConsentState(null, null, null, null, 15, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(d.class), new a(parentComponent));
            return bVar.b();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: t40.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt40/d$d;", "", "Lt40/c;", "initialState", "Lt40/d;", "a", "(Lt40/c;)Lt40/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC2397d {
        d a(ConsentState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt40/c$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lt40/c$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$2", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<ConsentState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f112440n;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ConsentState.Payload payload, Continuation<? super h0> continuation) {
            return ((f) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f112440n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.eventTracker.a(new FinancialConnectionsEvent.w(FinancialConnectionsSessionManifest.Pane.CONSENT));
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$3", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f112442n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112443o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = d.this.new g(continuation);
            gVar.f112443o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f112442n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.logger.error("Error retrieving consent content", (Throwable) this.f112443o);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((g) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$5", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f112446n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112447o;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            i iVar = d.this.new i(continuation);
            iVar.f112447o = obj;
            return iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f112446n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.h.b(d.this.eventTracker, "Error accepting consent", (Throwable) this.f112447o, d.this.logger, FinancialConnectionsSessionManifest.Pane.CONSENT);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((i) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1", f = "ConsentViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f112449n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f112451p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<String, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f112452c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f112453d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Date f112454e;

            /* JADX INFO: renamed from: t40.d$j$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt40/c;", "a", "(Lt40/c;)Lt40/c;"}, k = 3, mv = {1, 9, 0})
            static final class C2398a extends u implements wn0.l<ConsentState, ConsentState> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f112455c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Date f112456d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2398a(String str, Date date) {
                    super(1);
                    this.f112455c = str;
                    this.f112456d = date;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ConsentState invoke(ConsentState setState) {
                    s.k(setState, "$this$setState");
                    return ConsentState.b(setState, null, null, null, new ConsentState.b.OpenUrl(this.f112455c, this.f112456d.getTime()), 7, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, String str, Date date) {
                super(1);
                this.f112452c = dVar;
                this.f112453d = str;
                this.f112454e = date;
            }

            public final void a(String it) {
                s.k(it, "it");
                this.f112452c.k(new C2398a(this.f112453d, this.f112454e));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                a(str);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv50/d$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lv50/d$a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$2", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<v50.d.DeeplinkPayload, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f112457n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f112458o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f112458o = dVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v50.d.DeeplinkPayload deeplinkPayload, Continuation<? super h0> continuation) {
                return ((b) create(deeplinkPayload, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f112458o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112457n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f112458o.B();
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv50/d$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lv50/d$a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$3", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements p<v50.d.DeeplinkPayload, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f112459n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f112460o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d dVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f112460o = dVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v50.d.DeeplinkPayload deeplinkPayload, Continuation<? super h0> continuation) {
                return ((c) create(deeplinkPayload, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new c(this.f112460o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112459n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f112460o.C();
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: t40.d$j$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv50/d$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lv50/d$a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$4", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2399d extends SuspendLambda implements p<v50.d.DeeplinkPayload, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f112461n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f112462o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2399d(d dVar, Continuation<? super C2399d> continuation) {
                super(2, continuation);
                this.f112462o = dVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v50.d.DeeplinkPayload deeplinkPayload, Continuation<? super h0> continuation) {
                return ((C2399d) create(deeplinkPayload, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2399d(this.f112462o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112461n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                o50.f.a.a(this.f112462o.navigationManager, o50.b.k(o50.b.o.f96753i, FinancialConnectionsSessionManifest.Pane.CONSENT, null, 2, null), null, false, 6, null);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv50/d$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lv50/d$a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$5", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends SuspendLambda implements p<v50.d.DeeplinkPayload, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f112463n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f112464o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ d f112465p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(d dVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f112465p = dVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v50.d.DeeplinkPayload deeplinkPayload, Continuation<? super h0> continuation) {
                return ((e) create(deeplinkPayload, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                e eVar = new e(this.f112465p, continuation);
                eVar.f112464o = obj;
                return eVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112463n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                o50.f.a.a(this.f112465p.navigationManager, o50.b.q.f96755i.j(FinancialConnectionsSessionManifest.Pane.CONSENT, v0.f(x.a("next_pane_on_disable_networking", ((v50.d.DeeplinkPayload) this.f112464o).getNextPaneOrDrawerOnSecondaryCta()))), null, false, 6, null);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv50/d$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lv50/d$a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$6", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class f extends SuspendLambda implements p<v50.d.DeeplinkPayload, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f112466n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f112467o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(d dVar, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f112467o = dVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v50.d.DeeplinkPayload deeplinkPayload, Continuation<? super h0> continuation) {
                return ((f) create(deeplinkPayload, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new f(this.f112467o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112466n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                o50.f.a.a(this.f112467o.navigationManager, o50.b.k(o50.b.m.f96751i, FinancialConnectionsSessionManifest.Pane.CONSENT, null, 2, null), null, false, 6, null);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f112451p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new j(this.f112451p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f112449n;
            if (i11 == 0) {
                t.b(obj);
                Date date = new Date();
                v50.d dVar = d.this.handleClickableUrl;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.CONSENT;
                String str = this.f112451p;
                a aVar = new a(d.this, str, date);
                Map<String, ? extends p<? super v50.d.DeeplinkPayload, ? super Continuation<? super h0>, ? extends Object>> mapM = v0.m(x.a(t40.a.DATA.getValue(), new b(d.this, null)), x.a(t40.a.LEGAL_DETAILS.getValue(), new c(d.this, null)), x.a(t40.a.MANUAL_ENTRY.getValue(), new C2399d(d.this, null)), x.a(t40.a.LINK_LOGIN_WARMUP.getValue(), new e(d.this, null)), x.a(t40.a.LINK_ACCOUNT_PICKER.getValue(), new f(d.this, null)));
                this.f112449n = 1;
                if (dVar.b(pane, str, aVar, mapM, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onContinueClick$1", f = "ConsentViewModel.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.l<Continuation<? super FinancialConnectionsSessionManifest>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f112468n;

        k(Continuation<? super k> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new k(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f112468n;
            if (i11 == 0) {
                t.b(obj);
                d.this.eventTracker.a(FinancialConnectionsEvent.o.f82596e);
                n40.a aVar = d.this.acceptConsent;
                this.f112468n = 1;
                obj = aVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
            i40.a.c(i40.a.f75822a, j40.FinancialConnectionsEvent.c.CONSENT_ACQUIRED, null, 2, null);
            o50.f.a.a(d.this.navigationManager, o50.b.k(o50.d.a(financialConnectionsSessionManifest.getNextPane()), FinancialConnectionsSessionManifest.Pane.CONSENT, null, 2, null), null, false, 6, null);
            return financialConnectionsSessionManifest;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((k) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt40/c;", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "it", "a", "(Lt40/c;Ls50/a;)Lt40/c;"}, k = 3, mv = {1, 9, 0})
    static final class l extends u implements p<ConsentState, s50.a<? extends FinancialConnectionsSessionManifest>, ConsentState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f112470c = new l();

        l() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsentState invoke(ConsentState execute, s50.a<FinancialConnectionsSessionManifest> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return ConsentState.b(execute, null, null, it, null, 11, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt40/c;", "a", "(Lt40/c;)Lt40/c;"}, k = 3, mv = {1, 9, 0})
    static final class m extends u implements wn0.l<ConsentState, ConsentState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f112471c = new m();

        m() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsentState invoke(ConsentState setState) {
            s.k(setState, "$this$setState");
            return ConsentState.b(setState, null, null, null, null, 7, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConsentState initialState, p0 nativeAuthFlowCoordinator, n40.a acceptConsent, b0 getOrFetchSync, o50.f navigationManager, j40.f eventTracker, v50.d handleClickableUrl, o30.d logger, h50.f presentSheet) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(acceptConsent, "acceptConsent");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(navigationManager, "navigationManager");
        s.k(eventTracker, "eventTracker");
        s.k(handleClickableUrl, "handleClickableUrl");
        s.k(logger, "logger");
        s.k(presentSheet, "presentSheet");
        this.acceptConsent = acceptConsent;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.eventTracker = eventTracker;
        this.handleClickableUrl = handleClickableUrl;
        this.logger = logger;
        this.presentSheet = presentSheet;
        x();
        s50.i.g(this, new a(null), null, b.f112437c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        ConsentPane consent;
        DataAccessNotice dataAccessNotice;
        ConsentState.Payload payloadA = h().getValue().d().a();
        if (payloadA == null || (consent = payloadA.getConsent()) == null || (dataAccessNotice = consent.getDataAccessNotice()) == null) {
            return;
        }
        this.presentSheet.a(new NoticeSheetState.a.DataAccess(dataAccessNotice), FinancialConnectionsSessionManifest.Pane.CONSENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        ConsentPane consent;
        LegalDetailsNotice legalDetailsNotice;
        ConsentState.Payload payloadA = h().getValue().d().a();
        if (payloadA == null || (consent = payloadA.getConsent()) == null || (legalDetailsNotice = consent.getLegalDetailsNotice()) == null) {
            return;
        }
        this.presentSheet.a(new NoticeSheetState.a.Legal(legalDetailsNotice), FinancialConnectionsSessionManifest.Pane.CONSENT);
    }

    private final void x() {
        i(new f0() { // from class: t40.d.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((ConsentState) obj).d();
            }
        }, new f(null), new g(null));
        s50.i.j(this, new f0() { // from class: t40.d.h
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((ConsentState) obj).c();
            }
        }, null, new i(null), 2, null);
    }

    public final void A() {
        k(m.f112471c);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(ConsentState state) {
        s.k(state, "state");
        FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.CONSENT;
        ConsentState.Payload payloadA = state.d().a();
        return new TopAppBarStateUpdate(pane, true, n.a(state.d()), Boolean.valueOf(payloadA != null ? payloadA.getShouldShowMerchantLogos() : true), false, 16, null);
    }

    public final Job y(String uri) {
        s.k(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new j(uri, null), 3, null);
    }

    public final void z() {
        s50.i.g(this, new k(null), null, l.f112470c, 1, null);
    }
}
