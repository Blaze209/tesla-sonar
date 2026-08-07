package yw;

import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import vw.ApplicationInfo;
import vw.w0;
import wn0.p;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010)¨\u0006,"}, d2 = {"Lyw/d;", "Lyw/o;", "Lvw/w0;", "timeProvider", "Lzv/f;", "firebaseInstallationsApi", "Lvw/b;", "appInfo", "Lyw/a;", "configsFetcher", "Lyw/l;", "settingsCache", "<init>", "(Lvw/w0;Lzv/f;Lvw/b;Lyw/a;Lyw/l;)V", "", "s", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "Ljn0/h0;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lvw/w0;", "Lzv/f;", "c", "Lvw/b;", DateTokenConverter.CONVERTER_KEY, "Lyw/a;", "e", "Lyw/l;", "Lkotlinx/coroutines/sync/Mutex;", "f", "Lkotlinx/coroutines/sync/Mutex;", "fetchInProgress", "", "()Ljava/lang/Boolean;", "sessionEnabled", "Lio0/b;", "()Lio0/b;", "sessionRestartTimeout", "", "()Ljava/lang/Double;", "samplingRate", "g", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f125890g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f125891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final q f125892i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w0 timeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zv.f firebaseInstallationsApi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ApplicationInfo appInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yw.a configsFetcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l settingsCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Mutex fetchInProgress;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyw/d$a;", "", "<init>", "()V", "", "defaultCacheDuration", "I", "a", "()I", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f125891h;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {165, 78, 95}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f125899n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f125900o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f125901p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f125903r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125901p = obj;
            this.f125903r |= Integer.MIN_VALUE;
            return d.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Ljn0/h0;", "<anonymous>", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<JSONObject, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f125904n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f125905o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, Continuation<? super h0> continuation) {
            return ((c) create(jSONObject, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = d.this.new c(continuation);
            cVar.f125905o = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            Boolean bool;
            Double d11;
            Integer num;
            l lVar;
            int iA;
            SessionConfigs sessionConfigs;
            Integer num2;
            Double d12;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f125904n;
            if (i11 == 0) {
                t.b(obj);
                JSONObject jSONObject = (JSONObject) this.f125905o;
                Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                Integer num3 = 0;
                Integer num4 = null;
                Boolean bool2 = null;
                if (jSONObject.has("app_quality")) {
                    Object obj3 = jSONObject.get("app_quality");
                    s.i(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj3;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d12 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                    h0 h0Var = h0.f84049a;
                                    num = num2;
                                    d11 = d12;
                                    bool = bool3;
                                    num3 = num4;
                                } catch (JSONException e11) {
                                    e = e11;
                                    Integer num5 = num4;
                                    bool2 = bool3;
                                    obj2 = num5;
                                    Boxing.boxInt(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d11 = d12;
                                    bool = bool2;
                                    num3 = obj2;
                                }
                            } catch (JSONException e12) {
                                e = e12;
                                num2 = null;
                                bool2 = bool3;
                                obj2 = null;
                            }
                        } catch (JSONException e13) {
                            e = e13;
                            num2 = null;
                            d12 = null;
                            bool2 = bool3;
                            obj2 = d12;
                            Boxing.boxInt(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            num = num2;
                            d11 = d12;
                            bool = bool2;
                            num3 = obj2;
                            lVar = d.this.settingsCache;
                            if (num3 != 0) {
                                iA = num3.intValue();
                            } else {
                                iA = d.f125890g.a();
                            }
                            sessionConfigs = new SessionConfigs(bool, d11, num, Boxing.boxInt(iA), Boxing.boxLong(d.this.timeProvider.a().getSeconds()));
                            this.f125904n = 1;
                            if (lVar.a(sessionConfigs, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return h0.f84049a;
                        }
                    } catch (JSONException e14) {
                        e = e14;
                        num2 = null;
                        d12 = null;
                    }
                } else {
                    bool = null;
                    d11 = null;
                    num = null;
                }
                lVar = d.this.settingsCache;
                if (num3 != 0) {
                    iA = num3.intValue();
                } else {
                    iA = d.f125890g.a();
                }
                sessionConfigs = new SessionConfigs(bool, d11, num, Boxing.boxInt(iA), Boxing.boxLong(d.this.timeProvider.a().getSeconds()));
                this.f125904n = 1;
                if (lVar.a(sessionConfigs, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: yw.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "msg", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2736d extends SuspendLambda implements p<String, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f125907n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f125908o;

        C2736d(Continuation<? super C2736d> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation<? super h0> continuation) {
            return ((C2736d) create(str, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2736d c2736d = new C2736d(continuation);
            c2736d.f125908o = obj;
            return c2736d;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f125907n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f125908o));
            return h0.f84049a;
        }
    }

    static {
        io0.b.Companion companion = io0.b.INSTANCE;
        f125891h = (int) io0.b.r(io0.d.s(24, io0.e.HOURS));
        f125892i = new q("/");
    }

    public d(w0 timeProvider, zv.f firebaseInstallationsApi, ApplicationInfo appInfo, yw.a configsFetcher, l settingsCache) {
        s.k(timeProvider, "timeProvider");
        s.k(firebaseInstallationsApi, "firebaseInstallationsApi");
        s.k(appInfo, "appInfo");
        s.k(configsFetcher, "configsFetcher");
        s.k(settingsCache, "settingsCache");
        this.timeProvider = timeProvider;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = settingsCache;
        this.fetchInProgress = MutexKt.Mutex$default(false, 1, null);
    }

    private final String i(String s11) {
        return f125892i.j(s11, "");
    }

    @Override // yw.o
    public Double a() {
        return this.settingsCache.c();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c4 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b6, B:49:0x00c4, B:52:0x00cf), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b6, B:49:0x00c4, B:52:0x00cf), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00cf, please report this as an issue */
    @Override // yw.o
    public Object b(Continuation<? super h0> continuation) throws Throwable {
        b bVar;
        Mutex mutex;
        d dVar;
        Mutex mutex2;
        Throwable th2;
        Mutex mutex3;
        d dVar2;
        String fid;
        Map<String, String> mapM;
        yw.a aVar;
        c cVar;
        C2736d c2736d;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f125903r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f125903r = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f125901p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f125903r;
        try {
            if (i12 == 0) {
                t.b(obj);
                if (!this.fetchInProgress.isLocked() && !this.settingsCache.d()) {
                    return h0.f84049a;
                }
                mutex = this.fetchInProgress;
                bVar.f125899n = this;
                bVar.f125900o = mutex;
                bVar.f125903r = 1;
                if (mutex.lock(null, bVar) != coroutine_suspended) {
                    dVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) bVar.f125899n;
                    try {
                        t.b(obj);
                        h0 h0Var = h0.f84049a;
                        mutex2.unlock(null);
                        return h0.f84049a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        mutex2.unlock(null);
                        throw th2;
                    }
                }
                mutex3 = (Mutex) bVar.f125900o;
                dVar2 = (d) bVar.f125899n;
                try {
                    t.b(obj);
                    fid = ((vw.t) obj).getFid();
                    if (s.f(fid, "")) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        h0 h0Var2 = h0.f84049a;
                        mutex3.unlock(null);
                        return h0Var2;
                    }
                    Pair pairA = x.a("X-Crashlytics-Installation-ID", fid);
                    Pair pairA2 = x.a("X-Crashlytics-Device-Model", dVar2.i(Build.MANUFACTURER + Build.MODEL));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    s.j(INCREMENTAL, "INCREMENTAL");
                    Pair pairA3 = x.a("X-Crashlytics-OS-Build-Version", dVar2.i(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    s.j(RELEASE, "RELEASE");
                    mapM = v0.m(pairA, pairA2, pairA3, x.a("X-Crashlytics-OS-Display-Version", dVar2.i(RELEASE)), x.a("X-Crashlytics-API-Client-Version", dVar2.appInfo.getSessionSdkVersion()));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    aVar = dVar2.configsFetcher;
                    cVar = dVar2.new c(null);
                    c2736d = new C2736d(null);
                    bVar.f125899n = mutex3;
                    bVar.f125900o = null;
                    bVar.f125903r = 3;
                    if (aVar.a(mapM, cVar, c2736d, bVar) != coroutine_suspended) {
                        mutex2 = mutex3;
                        h0 h0Var3 = h0.f84049a;
                        mutex2.unlock(null);
                        return h0.f84049a;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th2 = th4;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    throw th2;
                }
            }
            Mutex mutex4 = (Mutex) bVar.f125900o;
            dVar = (d) bVar.f125899n;
            t.b(obj);
            mutex = mutex4;
            if (!dVar.settingsCache.d()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                h0 h0Var4 = h0.f84049a;
                mutex.unlock(null);
                return h0Var4;
            }
            vw.t.Companion companion = vw.t.INSTANCE;
            zv.f fVar = dVar.firebaseInstallationsApi;
            bVar.f125899n = dVar;
            bVar.f125900o = mutex;
            bVar.f125903r = 2;
            Object objA = companion.a(fVar, bVar);
            if (objA != coroutine_suspended) {
                mutex3 = mutex;
                obj = objA;
                dVar2 = dVar;
                fid = ((vw.t) obj).getFid();
                if (s.f(fid, "")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    h0 h0Var5 = h0.f84049a;
                    mutex3.unlock(null);
                    return h0Var5;
                }
                Pair pairA4 = x.a("X-Crashlytics-Installation-ID", fid);
                Pair pairA5 = x.a("X-Crashlytics-Device-Model", dVar2.i(Build.MANUFACTURER + Build.MODEL));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                s.j(INCREMENTAL2, "INCREMENTAL");
                Pair pairA6 = x.a("X-Crashlytics-OS-Build-Version", dVar2.i(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                s.j(RELEASE2, "RELEASE");
                mapM = v0.m(pairA4, pairA5, pairA6, x.a("X-Crashlytics-OS-Display-Version", dVar2.i(RELEASE2)), x.a("X-Crashlytics-API-Client-Version", dVar2.appInfo.getSessionSdkVersion()));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                aVar = dVar2.configsFetcher;
                cVar = dVar2.new c(null);
                c2736d = new C2736d(null);
                bVar.f125899n = mutex3;
                bVar.f125900o = null;
                bVar.f125903r = 3;
                if (aVar.a(mapM, cVar, c2736d, bVar) != coroutine_suspended) {
                    mutex2 = mutex3;
                    h0 h0Var6 = h0.f84049a;
                    mutex2.unlock(null);
                    return h0.f84049a;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th5) {
            mutex2 = mutex;
            th2 = th5;
            mutex2.unlock(null);
            throw th2;
        }
    }

    @Override // yw.o
    public Boolean c() {
        return this.settingsCache.e();
    }

    @Override // yw.o
    public io0.b d() {
        Integer numB = this.settingsCache.b();
        if (numB == null) {
            return null;
        }
        io0.b.Companion companion = io0.b.INSTANCE;
        return io0.b.f(io0.d.s(numB.intValue(), io0.e.SECONDS));
    }
}
