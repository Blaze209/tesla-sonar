package vw;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u001aB3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lvw/l0;", "Lvw/k0;", "Lcom/google/firebase/f;", "firebaseApp", "Lzv/f;", "firebaseInstallations", "Lyw/j;", "sessionSettings", "Lvw/h;", "eventGDTLogger", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/f;Lzv/f;Lyw/j;Lvw/h;Lkotlin/coroutines/CoroutineContext;)V", "Lvw/i0;", "sessionEvent", "Ljn0/h0;", "g", "(Lvw/i0;)V", "", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "()Z", "Lvw/h0;", "sessionDetails", "a", "(Lvw/h0;)V", "Lcom/google/firebase/f;", "b", "Lzv/f;", "c", "Lyw/j;", DateTokenConverter.CONVERTER_KEY, "Lvw/h;", "e", "Lkotlin/coroutines/CoroutineContext;", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 implements k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double f119958g = Math.random();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.f firebaseApp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zv.f firebaseInstallations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yw.j sessionSettings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h eventGDTLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", i = {2}, l = {70, 71, 77}, m = "invokeSuspend", n = {"installationId"}, s = {"L$0"})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f119964n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f119965o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f119966p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f119967q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f119968r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f119969s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f119970t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ SessionDetails f119972v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SessionDetails sessionDetails, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f119972v = sessionDetails;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l0.this.new b(this.f119972v, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t tVar;
            l0 l0Var;
            j0 j0Var;
            com.google.firebase.f fVar;
            SessionDetails sessionDetails;
            yw.j jVar;
            Object objC;
            com.google.firebase.f fVar2;
            SessionDetails sessionDetails2;
            j0 j0Var2;
            yw.j jVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f119970t;
            if (i11 == 0) {
                jn0.t.b(obj);
                l0 l0Var2 = l0.this;
                this.f119970t = 1;
                obj = l0Var2.i(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                jn0.t.b(obj);
            } else {
                if (i11 == 2) {
                    jn0.t.b(obj);
                    tVar = (t) obj;
                    l0Var = l0.this;
                    j0Var = j0.f119948a;
                    fVar = l0Var.firebaseApp;
                    sessionDetails = this.f119972v;
                    jVar = l0.this.sessionSettings;
                    ww.b bVar = ww.b.f122397a;
                    this.f119964n = tVar;
                    this.f119965o = l0Var;
                    this.f119966p = j0Var;
                    this.f119967q = fVar;
                    this.f119968r = sessionDetails;
                    this.f119969s = jVar;
                    this.f119970t = 3;
                    objC = bVar.c(this);
                    if (objC != coroutine_suspended) {
                        fVar2 = fVar;
                        obj = objC;
                        sessionDetails2 = sessionDetails;
                        j0Var2 = j0Var;
                        jVar2 = jVar;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yw.j jVar3 = (yw.j) this.f119969s;
                SessionDetails sessionDetails3 = (SessionDetails) this.f119968r;
                com.google.firebase.f fVar3 = (com.google.firebase.f) this.f119967q;
                j0 j0Var3 = (j0) this.f119966p;
                l0Var = (l0) this.f119965o;
                tVar = (t) this.f119964n;
                jn0.t.b(obj);
                jVar2 = jVar3;
                j0Var2 = j0Var3;
                sessionDetails2 = sessionDetails3;
                fVar2 = fVar3;
            }
            l0 l0Var3 = l0Var;
            Map<ww.c.a, ? extends ww.c> map = (Map) obj;
            t tVar2 = tVar;
            l0Var3.g(j0Var2.a(fVar2, sessionDetails2, jVar2, map, tVar2.getFid(), tVar2.getAuthToken()));
            return jn0.h0.f84049a;
            if (((Boolean) obj).booleanValue()) {
                t.Companion companion = t.INSTANCE;
                zv.f fVar4 = l0.this.firebaseInstallations;
                this.f119970t = 2;
                obj = companion.a(fVar4, this);
                if (obj != coroutine_suspended) {
                    tVar = (t) obj;
                    l0Var = l0.this;
                    j0Var = j0.f119948a;
                    fVar = l0Var.firebaseApp;
                    sessionDetails = this.f119972v;
                    jVar = l0.this.sessionSettings;
                    ww.b bVar2 = ww.b.f122397a;
                    this.f119964n = tVar;
                    this.f119965o = l0Var;
                    this.f119966p = j0Var;
                    this.f119967q = fVar;
                    this.f119968r = sessionDetails;
                    this.f119969s = jVar;
                    this.f119970t = 3;
                    objC = bVar2.c(this);
                    if (objC != coroutine_suspended) {
                        fVar2 = fVar;
                        obj = objC;
                        sessionDetails2 = sessionDetails;
                        j0Var2 = j0Var;
                        jVar2 = jVar;
                        l0 l0Var4 = l0Var;
                        Map<ww.c.a, ? extends ww.c> map2 = (Map) obj;
                        t tVar3 = tVar;
                        l0Var4.g(j0Var2.a(fVar2, sessionDetails2, jVar2, map2, tVar3.getFid(), tVar3.getAuthToken()));
                    }
                }
                return coroutine_suspended;
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {0, 1}, l = {98, 104}, m = "shouldLogSession", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f119973n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f119974o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f119976q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f119974o = obj;
            this.f119976q |= Integer.MIN_VALUE;
            return l0.this.i(this);
        }
    }

    public l0(com.google.firebase.f firebaseApp, zv.f firebaseInstallations, yw.j sessionSettings, h eventGDTLogger, @xu.a CoroutineContext backgroundDispatcher) {
        p013kotlin.jvm.internal.s.k(firebaseApp, "firebaseApp");
        p013kotlin.jvm.internal.s.k(firebaseInstallations, "firebaseInstallations");
        p013kotlin.jvm.internal.s.k(sessionSettings, "sessionSettings");
        p013kotlin.jvm.internal.s.k(eventGDTLogger, "eventGDTLogger");
        p013kotlin.jvm.internal.s.k(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.a(sessionEvent);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e11) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e11);
        }
    }

    private final boolean h() {
        return f119958g <= this.sessionSettings.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Continuation<? super Boolean> continuation) {
        c cVar;
        l0 l0Var;
        l0 l0Var2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f119976q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f119976q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objC = cVar.f119974o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f119976q;
        if (i12 == 0) {
            jn0.t.b(objC);
            ww.b bVar = ww.b.f122397a;
            cVar.f119973n = this;
            cVar.f119976q = 1;
            objC = bVar.c(cVar);
            if (objC != coroutine_suspended) {
                l0Var = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            l0Var = (l0) cVar.f119973n;
            jn0.t.b(objC);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0Var2 = (l0) cVar.f119973n;
            jn0.t.b(objC);
        }
        if (!l0Var2.sessionSettings.c()) {
            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
            return Boxing.boxBoolean(false);
        }
        if (!l0Var2.h()) {
            return Boxing.boxBoolean(true);
        }
        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
        return Boxing.boxBoolean(false);
        Collection collectionValues = ((Map) objC).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!((ww.c) it.next()).a());
            yw.j jVar = l0Var.sessionSettings;
            cVar.f119973n = l0Var;
            cVar.f119976q = 2;
            if (jVar.f(cVar) != coroutine_suspended) {
                l0Var2 = l0Var;
                if (!l0Var2.sessionSettings.c()) {
                    Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                    return Boxing.boxBoolean(false);
                }
                if (!l0Var2.h()) {
                    return Boxing.boxBoolean(true);
                }
                Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                return Boxing.boxBoolean(false);
            }
            return coroutine_suspended;
        }
        Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
        return Boxing.boxBoolean(false);
    }

    @Override // vw.k0
    public void a(SessionDetails sessionDetails) {
        p013kotlin.jvm.internal.s.k(sessionDetails, "sessionDetails");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new b(sessionDetails, null), 3, null);
    }
}
