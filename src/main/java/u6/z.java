package u6;

import android.os.FileObserver;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR,\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lu6/z;", "Landroid/os/FileObserver;", "", "path", "<init>", "(Ljava/lang/String;)V", "", "event", "Ljn0/h0;", "onEvent", "(ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Landroidx/datastore/core/FileMoveObserver;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "delegates", "c", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z extends FileObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f115742d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, z> f115743e = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<wn0.l<String, jn0.h0>> delegates;

    /* JADX INFO: renamed from: u6.z$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lu6/z$a;", "", "<init>", "()V", "Ljava/io/File;", "parent", "Lkotlin/Function1;", "", "Ljn0/h0;", "Landroidx/datastore/core/FileMoveObserver;", "observer", "Lkotlinx/coroutines/DisposableHandle;", DateTokenConverter.CONVERTER_KEY, "(Ljava/io/File;Lwn0/l;)Lkotlinx/coroutines/DisposableHandle;", Action.FILE_ATTRIBUTE, "Lkotlinx/coroutines/flow/Flow;", "e", "(Ljava/io/File;)Lkotlinx/coroutines/flow/Flow;", "", "Lu6/z;", "fileObservers", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "getFileObservers$datastore_core_release$annotations", "LOCK", "Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: u6.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", i = {0, 0}, l = {84, 85}, m = "invokeSuspend", n = {"$this$channelFlow", "disposeListener"}, s = {"L$0", "L$1"})
        static final class C2485a extends SuspendLambda implements wn0.p<ProducerScope<? super jn0.h0>, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f115746n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f115747o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private /* synthetic */ Object f115748p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ File f115749q;

            /* JADX INFO: renamed from: u6.z$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
            static final class C2486a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ DisposableHandle f115750c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2486a(DisposableHandle disposableHandle) {
                    super(0);
                    this.f115750c = disposableHandle;
                }

                public final void b() {
                    this.f115750c.dispose();
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                    b();
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: u6.z$a$a$b */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fileName", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
            static final class b extends p013kotlin.jvm.internal.u implements wn0.l<String, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ File f115751c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ProducerScope<jn0.h0> f115752d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(File file, ProducerScope<? super jn0.h0> producerScope) {
                    super(1);
                    this.f115751c = file;
                    this.f115752d = producerScope;
                }

                public final void a(String str) {
                    if (p013kotlin.jvm.internal.s.f(str, this.f115751c.getName())) {
                        ChannelsKt.trySendBlocking(this.f115752d, jn0.h0.f84049a);
                    }
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(String str) {
                    a(str);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2485a(File file, Continuation<? super C2485a> continuation) {
                super(2, continuation);
                this.f115749q = file;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                C2485a c2485a = new C2485a(this.f115749q, continuation);
                c2485a.f115748p = obj;
                return c2485a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
            
                if (kotlinx.coroutines.channels.ProduceKt.awaitClose(r3, r7, r6) == r0) goto L16;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.f115747o
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    jn0.t.b(r7)
                    goto L66
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1a:
                    java.lang.Object r1 = r6.f115746n
                    kotlinx.coroutines.DisposableHandle r1 = (kotlinx.coroutines.DisposableHandle) r1
                    java.lang.Object r3 = r6.f115748p
                    kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                    jn0.t.b(r7)
                    goto L53
                L26:
                    jn0.t.b(r7)
                    java.lang.Object r7 = r6.f115748p
                    kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                    u6.z$a$a$b r1 = new u6.z$a$a$b
                    java.io.File r4 = r6.f115749q
                    r1.<init>(r4, r7)
                    u6.z$a r4 = u6.z.INSTANCE
                    java.io.File r5 = r6.f115749q
                    java.io.File r5 = r5.getParentFile()
                    p013kotlin.jvm.internal.s.h(r5)
                    kotlinx.coroutines.DisposableHandle r1 = u6.z.Companion.b(r4, r5, r1)
                    jn0.h0 r4 = jn0.h0.f84049a
                    r6.f115748p = r7
                    r6.f115746n = r1
                    r6.f115747o = r3
                    java.lang.Object r3 = r7.send(r4, r6)
                    if (r3 != r0) goto L52
                    goto L65
                L52:
                    r3 = r7
                L53:
                    u6.z$a$a$a r7 = new u6.z$a$a$a
                    r7.<init>(r1)
                    r1 = 0
                    r6.f115748p = r1
                    r6.f115746n = r1
                    r6.f115747o = r2
                    java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r3, r7, r6)
                    if (r7 != r0) goto L66
                L65:
                    return r0
                L66:
                    jn0.h0 r7 = jn0.h0.f84049a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: u6.z.Companion.C2485a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(ProducerScope<? super jn0.h0> producerScope, Continuation<? super jn0.h0> continuation) {
                return ((C2485a) create(producerScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DisposableHandle d(File parent, final wn0.l<? super String, jn0.h0> observer) {
            final String key = parent.getCanonicalFile().getPath();
            synchronized (z.f115742d) {
                try {
                    Map<String, z> mapC = z.INSTANCE.c();
                    p013kotlin.jvm.internal.s.j(key, "key");
                    z zVar = mapC.get(key);
                    if (zVar == null) {
                        zVar = new z(key, null);
                        mapC.put(key, zVar);
                    }
                    z zVar2 = zVar;
                    zVar2.delegates.add(observer);
                    if (zVar2.delegates.size() == 1) {
                        zVar2.startWatching();
                    }
                    jn0.h0 h0Var = jn0.h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new DisposableHandle() { // from class: u6.y
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    z.Companion.f(key, observer);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(String str, wn0.l observer) {
            p013kotlin.jvm.internal.s.k(observer, "$observer");
            synchronized (z.f115742d) {
                try {
                    Companion companion = z.INSTANCE;
                    z zVar = companion.c().get(str);
                    if (zVar != null) {
                        zVar.delegates.remove(observer);
                        if (zVar.delegates.isEmpty()) {
                            companion.c().remove(str);
                            zVar.stopWatching();
                        }
                    }
                    jn0.h0 h0Var = jn0.h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final Map<String, z> c() {
            return z.f115743e;
        }

        public final Flow<jn0.h0> e(File file) {
            p013kotlin.jvm.internal.s.k(file, "file");
            return FlowKt.channelFlow(new C2485a(file, null));
        }

        private Companion() {
        }
    }

    public /* synthetic */ z(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // android.os.FileObserver
    public void onEvent(int event, String path) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((wn0.l) it.next()).invoke(path);
        }
    }

    private z(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }
}
