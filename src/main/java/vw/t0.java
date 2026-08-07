package vw;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\b\u0001\u0018\u00002\u00020\u0001:\u0001#BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00106\u001a\u00020\u000b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010;\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b#\u0010:R\"\u0010B\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lvw/t0;", "Lvw/s0;", "Lyw/j;", "sessionsSettings", "Lvw/n0;", "sessionGenerator", "Lvw/k0;", "sessionFirelogPublisher", "Lvw/w0;", "timeProvider", "Lu6/h;", "Lvw/e0;", "sessionDataStore", "Lvw/w;", "processDataManager", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lyw/j;Lvw/n0;Lvw/k0;Lvw/w0;Lu6/h;Lvw/w;Lkotlin/coroutines/CoroutineContext;)V", "", "sessionId", "Lvw/t0$b;", "type", "Ljn0/h0;", "q", "(Ljava/lang/String;Lvw/t0$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionData", "", "p", "(Lvw/e0;)Z", "n", "o", "c", "()V", "a", "b", "Lyw/j;", "Lvw/n0;", DateTokenConverter.CONVERTER_KEY, "Lvw/k0;", "e", "Lvw/w0;", "f", "Lu6/h;", "g", "Lvw/w;", "h", "Lkotlin/coroutines/CoroutineContext;", IntegerTokenConverter.CONVERTER_KEY, "Lvw/e0;", "m", "()Lvw/e0;", "r", "(Lvw/e0;)V", "localSessionData", "value", "j", "Z", "()Z", "isInForeground", "k", "Lvw/t0$b;", "getPreviousNotificationType$com_google_firebase_firebase_sessions", "()Lvw/t0$b;", "setPreviousNotificationType$com_google_firebase_firebase_sessions", "(Lvw/t0$b;)V", "previousNotificationType", "l", "Ljava/lang/String;", "previousSessionId", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0 implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yw.j sessionsSettings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n0 sessionGenerator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k0 sessionFirelogPublisher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w0 timeProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u6.h<SessionData> sessionDataStore;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w processDataManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public SessionData localSessionData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isInForeground;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private b previousNotificationType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String previousSessionId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120023n;

        /* JADX INFO: renamed from: vw.t0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lvw/e0;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        static final class C2568a extends SuspendLambda implements wn0.q<FlowCollector<? super SessionData>, Throwable, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f120025n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f120026o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f120027p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ t0 f120028q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2568a(t0 t0Var, Continuation<? super C2568a> continuation) {
                super(3, continuation);
                this.f120028q = t0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f120025n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f120026o;
                    Throwable th2 = (Throwable) this.f120027p;
                    SessionData sessionData = new SessionData(this.f120028q.sessionGenerator.a(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.f120026o = null;
                    this.f120025n = 1;
                    if (flowCollector.emit(sessionData, this) == coroutine_suspended) {
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

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super SessionData> flowCollector, Throwable th2, Continuation<? super jn0.h0> continuation) {
                C2568a c2568a = new C2568a(this.f120028q, continuation);
                c2568a.f120026o = flowCollector;
                c2568a.f120027p = th2;
                return c2568a.invokeSuspend(jn0.h0.f84049a);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0 f120029a;

            b(t0 t0Var) {
                this.f120029a = t0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionData sessionData, Continuation<? super jn0.h0> continuation) {
                this.f120029a.r(sessionData);
                Object objQ = this.f120029a.q(sessionData.getSessionDetails().getSessionId(), b.GENERAL, continuation);
                return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : jn0.h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return t0.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f120023n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flowM548catch = FlowKt.m548catch(t0.this.sessionDataStore.getData(), new C2568a(t0.this, null));
                b bVar = new b(t0.this);
                this.f120023n = 1;
                if (flowM548catch.collect(bVar, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lvw/t0$b;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "FALLBACK", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        GENERAL,
        FALLBACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120030a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120030a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120031n;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvw/e0;", "sessionData", "<anonymous>", "(Lvw/e0;)Lvw/e0;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<SessionData, Continuation<? super SessionData>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f120033n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f120034o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ t0 f120035p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0 t0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f120035p = t0Var;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((a) create(sessionData, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f120035p, continuation);
                aVar.f120034o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f120033n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return SessionData.c((SessionData) this.f120034o, null, this.f120035p.timeProvider.a(), null, 5, null);
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return t0.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f120031n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    u6.h hVar = t0.this.sessionDataStore;
                    a aVar = new a(t0.this, null);
                    this.f120031n = 1;
                    if (hVar.a(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
            } catch (Exception e11) {
                Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e11.getMessage());
                t0 t0Var = t0.this;
                t0Var.r(SessionData.c(t0Var.m(), null, t0.this.timeProvider.a(), null, 5, null));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", i = {}, l = {135, 186}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120036n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ SessionData f120038p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvw/e0;", "currentSessionData", "<anonymous>", "(Lvw/e0;)Lvw/e0;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<SessionData, Continuation<? super SessionData>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f120039n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f120040o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ t0 f120041p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0 t0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f120041p = t0Var;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((a) create(sessionData, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f120041p, continuation);
                aVar.f120040o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Map<String, ProcessData> mapE;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f120039n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                SessionData sessionData = (SessionData) this.f120040o;
                boolean zP = this.f120041p.p(sessionData);
                boolean zN = this.f120041p.n(sessionData);
                boolean zO = this.f120041p.o(sessionData);
                if (zN) {
                    mapE = this.f120041p.processDataManager.d();
                } else {
                    mapE = zO ? this.f120041p.processDataManager.e(sessionData.e()) : sessionData.e();
                }
                SessionDetails sessionDetails = zN ? null : sessionData.getSessionDetails();
                if (!zP && !zN) {
                    return zO ? SessionData.c(sessionData, null, null, this.f120041p.processDataManager.e(mapE), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsA = this.f120041p.sessionGenerator.a(sessionDetails);
                this.f120041p.sessionFirelogPublisher.a(sessionDetailsA);
                this.f120041p.processDataManager.f();
                return sessionData.b(sessionDetailsA, null, mapE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SessionData sessionData, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f120038p = sessionData;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return t0.this.new e(this.f120038p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r10.a(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            if (r10.q(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            return r1;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r9.f120036n
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L23
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L13
                jn0.t.b(r10)
                goto L9a
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                jn0.t.b(r10)     // Catch: java.lang.Exception -> L20
                goto L9a
            L20:
                r0 = move-exception
                r10 = r0
                goto L3d
            L23:
                jn0.t.b(r10)
                vw.t0 r10 = vw.t0.this     // Catch: java.lang.Exception -> L20
                u6.h r10 = vw.t0.e(r10)     // Catch: java.lang.Exception -> L20
                vw.t0$e$a r0 = new vw.t0$e$a     // Catch: java.lang.Exception -> L20
                vw.t0 r4 = vw.t0.this     // Catch: java.lang.Exception -> L20
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L20
                r9.f120036n = r3     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = r10.a(r0, r9)     // Catch: java.lang.Exception -> L20
                if (r10 != r1) goto L9a
                goto L99
            L3d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "App foregrounded, failed to update data. Message: "
                r0.append(r3)
                java.lang.String r10 = r10.getMessage()
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                java.lang.String r0 = "FirebaseSessions"
                android.util.Log.d(r0, r10)
                vw.t0 r10 = vw.t0.this
                vw.e0 r0 = r9.f120038p
                boolean r10 = vw.t0.k(r10, r0)
                if (r10 == 0) goto L9a
                vw.t0 r10 = vw.t0.this
                vw.n0 r10 = vw.t0.g(r10)
                vw.e0 r0 = r9.f120038p
                vw.h0 r0 = r0.getSessionDetails()
                vw.h0 r4 = r10.a(r0)
                vw.t0 r10 = vw.t0.this
                vw.e0 r3 = r9.f120038p
                r7 = 4
                r8 = 0
                r5 = 0
                r6 = 0
                vw.e0 r0 = vw.SessionData.c(r3, r4, r5, r6, r7, r8)
                r10.r(r0)
                vw.t0 r10 = vw.t0.this
                vw.k0 r10 = vw.t0.f(r10)
                r10.a(r4)
                vw.t0 r10 = vw.t0.this
                java.lang.String r0 = r4.getSessionId()
                vw.t0$b r3 = vw.t0.b.FALLBACK
                r9.f120036n = r2
                java.lang.Object r10 = vw.t0.l(r10, r0, r3, r9)
                if (r10 != r1) goto L9a
            L99:
                return r1
            L9a:
                jn0.h0 r10 = jn0.h0.f84049a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: vw.t0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE}, m = "notifySubscribers", n = {"sessionId", "type"}, s = {"L$0", "L$1"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f120042n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f120043o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f120044p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f120046r;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120044p = obj;
            this.f120046r |= Integer.MIN_VALUE;
            return t0.this.q(null, null, this);
        }
    }

    public t0(yw.j sessionsSettings, n0 sessionGenerator, k0 sessionFirelogPublisher, w0 timeProvider, u6.h<SessionData> sessionDataStore, w processDataManager, @xu.a CoroutineContext backgroundDispatcher) {
        p013kotlin.jvm.internal.s.k(sessionsSettings, "sessionsSettings");
        p013kotlin.jvm.internal.s.k(sessionGenerator, "sessionGenerator");
        p013kotlin.jvm.internal.s.k(sessionFirelogPublisher, "sessionFirelogPublisher");
        p013kotlin.jvm.internal.s.k(timeProvider, "timeProvider");
        p013kotlin.jvm.internal.s.k(sessionDataStore, "sessionDataStore");
        p013kotlin.jvm.internal.s.k(processDataManager, "processDataManager");
        p013kotlin.jvm.internal.s.k(backgroundDispatcher, "backgroundDispatcher");
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.sessionFirelogPublisher = sessionFirelogPublisher;
        this.timeProvider = timeProvider;
        this.sessionDataStore = sessionDataStore;
        this.processDataManager = processDataManager;
        this.backgroundDispatcher = backgroundDispatcher;
        this.previousNotificationType = b.GENERAL;
        this.previousSessionId = "";
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(SessionData sessionData) {
        Map<String, ProcessData> mapE = sessionData.e();
        if (mapE == null) {
            Log.d("FirebaseSessions", "No process data map");
            return true;
        }
        boolean zC = this.processDataManager.c(mapE);
        if (zC) {
            Log.d("FirebaseSessions", "Cold app start detected");
        }
        return zC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(SessionData sessionData) {
        Map<String, ProcessData> mapE = sessionData.e();
        if (mapE == null) {
            Log.d("FirebaseSessions", "No process data for " + this.processDataManager.a());
            return true;
        }
        boolean zB = this.processDataManager.b(mapE);
        if (zB) {
            Log.d("FirebaseSessions", "Process " + this.processDataManager.a() + " is stale");
        }
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
            return false;
        }
        boolean z11 = io0.b.h(this.timeProvider.a().c(backgroundTime), this.sessionsSettings.b()) > 0;
        if (z11) {
            Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(String str, b bVar, Continuation<? super jn0.h0> continuation) {
        f fVar;
        String str2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f120046r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f120046r = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objC = fVar.f120044p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f120046r;
        if (i12 == 0) {
            jn0.t.b(objC);
            this.previousNotificationType = bVar;
            if (p013kotlin.jvm.internal.s.f(this.previousSessionId, str)) {
                return jn0.h0.f84049a;
            }
            this.previousSessionId = str;
            ww.b bVar2 = ww.b.f122397a;
            fVar.f120042n = str;
            fVar.f120043o = bVar;
            fVar.f120046r = 1;
            objC = bVar2.c(fVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) fVar.f120043o;
            str = (String) fVar.f120042n;
            jn0.t.b(objC);
        }
        for (ww.c cVar : ((Map) objC).values()) {
            cVar.c(new ww.c.SessionDetails(str));
            int i13 = c.f120030a[bVar.ordinal()];
            if (i13 == 1) {
                str2 = "Notified " + cVar.b() + " of new session " + str;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "Notified " + cVar.b() + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return jn0.h0.f84049a;
    }

    @Override // vw.s0
    public void a() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        SessionData sessionDataM = m();
        Log.d("FirebaseSessions", "App foregrounded on " + this.processDataManager.a());
        if (p(sessionDataM) || o(sessionDataM)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new e(sessionDataM, null), 3, null);
        }
    }

    @Override // vw.s0
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsInForeground() {
        return this.isInForeground;
    }

    @Override // vw.s0
    public void c() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.processDataManager.a());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new d(null), 3, null);
    }

    public final SessionData m() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        p013kotlin.jvm.internal.s.B("localSessionData");
        return null;
    }

    public final void r(SessionData sessionData) {
        p013kotlin.jvm.internal.s.k(sessionData, "<set-?>");
        this.localSessionData = sessionData;
    }
}
