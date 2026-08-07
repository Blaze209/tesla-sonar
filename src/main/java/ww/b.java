package ww;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0010H\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014RT\u0010\u0018\u001aB\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r \u0016* \u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r\u0018\u00010\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Lww/b;", "", "<init>", "()V", "Lww/c$a;", "subscriberName", "Ljn0/h0;", "a", "(Lww/c$a;)V", "Lww/c;", "subscriber", "e", "(Lww/c;)V", "Lww/b$a;", "b", "(Lww/c$a;)Lww/b$a;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Lww/c$a;)Lww/c;", "", "kotlin.jvm.PlatformType", "Ljava/util/Map;", "dependencies", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f122397a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<c.a, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: ww.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lww/b$a;", "", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lww/c;", "subscriber", "<init>", "(Lkotlinx/coroutines/sync/Mutex;Lww/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlinx/coroutines/sync/Mutex;", "()Lkotlinx/coroutines/sync/Mutex;", "b", "Lww/c;", "()Lww/c;", "c", "(Lww/c;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class Dependency {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Mutex mutex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private c subscriber;

        public Dependency(Mutex mutex, c cVar) {
            s.k(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Mutex getMutex() {
            return this.mutex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getSubscriber() {
            return this.subscriber;
        }

        public final void c(c cVar) {
            this.subscriber = cVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return s.f(this.mutex, dependency.mutex) && s.f(this.subscriber, dependency.subscriber);
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            c cVar = this.subscriber;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Dependency(Mutex mutex, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(mutex, (i11 & 2) != 0 ? null : cVar);
        }
    }

    /* JADX INFO: renamed from: ww.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", i = {0, 0, 0}, l = {110}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2", "L$3"})
    static final class C2630b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f122401n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f122402o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f122403p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f122404q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f122405r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f122406s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f122407t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f122409v;

        C2630b(Continuation<? super C2630b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f122407t = obj;
            this.f122409v |= Integer.MIN_VALUE;
            return b.this.c(this);
        }
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c.a subscriberName) {
        s.k(subscriberName, "subscriberName");
        Map<c.a, Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            Log.d("FirebaseSessions", "Dependency " + subscriberName + " already added.");
            return;
        }
        s.j(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(MutexKt.Mutex(true), null, 2, 0 == true ? 1 : 0));
        Log.d("FirebaseSessions", "Dependency to " + subscriberName + " added.");
    }

    private final Dependency b(c.a subscriberName) {
        Map<c.a, Dependency> dependencies2 = dependencies;
        s.j(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(subscriberName);
        if (dependency != null) {
            s.j(dependency, "getOrElse(...)");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
    }

    public static final void e(c subscriber) {
        s.k(subscriber, "subscriber");
        c.a aVarB = subscriber.b();
        Dependency dependencyB = f122397a.b(aVarB);
        if (dependencyB.getSubscriber() != null) {
            Log.d("FirebaseSessions", "Subscriber " + aVarB + " already registered.");
            return;
        }
        dependencyB.c(subscriber);
        Log.d("FirebaseSessions", "Subscriber " + aVarB + " registered.");
        Mutex.DefaultImpls.unlock$default(dependencyB.getMutex(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(p013kotlin.coroutines.Continuation<? super java.util.Map<ww.c.a, ? extends ww.c>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ww.b.C2630b
            if (r0 == 0) goto L13
            r0 = r11
            ww.b$b r0 = (ww.b.C2630b) r0
            int r1 = r0.f122409v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122409v = r1
            goto L18
        L13:
            ww.b$b r0 = new ww.b$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f122407t
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f122409v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f122406s
            java.lang.Object r5 = r0.f122405r
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f122404q
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r0.f122403p
            ww.c$a r7 = (ww.c.a) r7
            java.lang.Object r8 = r0.f122402o
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f122401n
            java.util.Map r9 = (java.util.Map) r9
            jn0.t.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            jn0.t.b(r11)
            java.util.Map<ww.c$a, ww.b$a> r11 = ww.b.dependencies
            java.lang.String r2 = "dependencies"
            p013kotlin.jvm.internal.s.j(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = p013kotlin.collections.v0.e(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            ww.c$a r7 = (ww.c.a) r7
            java.lang.Object r11 = r11.getValue()
            ww.b$a r11 = (ww.b.Dependency) r11
            kotlinx.coroutines.sync.Mutex r6 = r11.getMutex()
            r0.f122401n = r5
            r0.f122402o = r8
            r0.f122403p = r7
            r0.f122404q = r6
            r0.f122405r = r5
            r0.f122406s = r2
            r0.f122409v = r3
            java.lang.Object r11 = r6.lock(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            ww.b r11 = ww.b.f122397a     // Catch: java.lang.Throwable -> Lb0
            ww.c r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.unlock(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.unlock(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ww.b.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final c d(c.a subscriberName) {
        s.k(subscriberName, "subscriberName");
        c subscriber = b(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
