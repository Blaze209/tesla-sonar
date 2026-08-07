package u6;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ4\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\b\u0012\u0004\u0012\u00020\f0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b \u0010&R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010(R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00104\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010#R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u001b\u0010=\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b9\u0010:*\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lu6/w;", "Lu6/s;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", Action.FILE_ATTRIBUTE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "", "suffix", "p", "(Ljava/lang/String;)Ljava/io/File;", "Ljn0/h0;", "n", "(Ljava/io/File;)V", "o", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "c", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "a", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lkotlin/coroutines/CoroutineContext;", "b", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "updateNotifications", "Ljava/lang/String;", "LOCK_SUFFIX", "VERSION_SUFFIX", "f", "LOCK_ERROR_MESSAGE", "Lkotlinx/coroutines/sync/Mutex;", "g", "Lkotlinx/coroutines/sync/Mutex;", "inMemoryMutex", "h", "Lkotlin/Lazy;", "q", "lockFile", "Lkotlin/Lazy;", "Lu6/e0;", IntegerTokenConverter.CONVERTER_KEY, "lazySharedCounter", "r", "()Lu6/e0;", "getSharedCounter$delegate", "(Lu6/w;)Ljava/lang/Object;", "sharedCounter", "j", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w implements s {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f115700k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f115701l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f115702m = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Flow<jn0.h0> updateNotifications;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String LOCK_SUFFIX;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String VERSION_SUFFIX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String LOCK_ERROR_MESSAGE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Mutex inMemoryMutex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy lockFile;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy<e0> lazySharedCounter;

    /* JADX INFO: renamed from: u6.w$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lu6/w$a;", "", "<init>", "()V", "Ljava/io/FileOutputStream;", "lockFileStream", "Ljava/nio/channels/FileLock;", "b", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: u6.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", i = {0, 0}, l = {182}, m = "getExclusiveFileLockWithRetryIfDeadlock", n = {"lockFileStream", "backoff"}, s = {"L$0", "J$0"})
        static final class C2484a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f115712n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            long f115713o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f115714p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f115716r;

            C2484a(Continuation<? super C2484a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f115714p = obj;
                this.f115716r |= Integer.MIN_VALUE;
                return Companion.this.b(null, this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            r2 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (r2 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        
            r15.f115712n = r14;
            r15.f115713o = r5;
            r15.f115716r = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r5, r15) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(java.io.FileOutputStream r14, p013kotlin.coroutines.Continuation<? super java.nio.channels.FileLock> r15) throws java.io.IOException {
            /*
                r13 = this;
                boolean r0 = r15 instanceof u6.w.Companion.C2484a
                if (r0 == 0) goto L13
                r0 = r15
                u6.w$a$a r0 = (u6.w.Companion.C2484a) r0
                int r1 = r0.f115716r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f115716r = r1
                goto L18
            L13:
                u6.w$a$a r0 = new u6.w$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f115714p
                java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f115716r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L39
                if (r2 != r4) goto L31
                long r5 = r0.f115713o
                java.lang.Object r14 = r0.f115712n
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                jn0.t.b(r15)
                r15 = r0
                goto L7f
            L31:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L39:
                jn0.t.b(r15)
                long r5 = u6.w.i()
                r15 = r0
            L41:
                long r7 = u6.w.k()
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r0 > 0) goto L83
                java.nio.channels.FileChannel r7 = r14.getChannel()     // Catch: java.io.IOException -> L5f
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r0 = r7.lock(r8, r10, r12)     // Catch: java.io.IOException -> L5f
                p013kotlin.jvm.internal.s.j(r0, r2)     // Catch: java.io.IOException -> L5f
                return r0
            L5f:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L82
                java.lang.String r7 = u6.w.h()
                r8 = 0
                r9 = 0
                boolean r2 = p013kotlin.text.t.h0(r2, r7, r8, r3, r9)
                if (r2 != r4) goto L82
                r15.f115712n = r14
                r15.f115713o = r5
                r15.f115716r = r4
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r5, r15)
                if (r0 != r1) goto L7f
                return r1
            L7f:
                long r7 = (long) r3
                long r5 = r5 * r7
                goto L41
            L82:
                throw r0
            L83:
                java.nio.channels.FileChannel r7 = r14.getChannel()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r14 = r7.lock(r8, r10, r12)
                p013kotlin.jvm.internal.s.j(r14, r2)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.w.Companion.b(java.io.FileOutputStream, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Integer>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115717n;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return w.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115717n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return Boxing.boxInt(w.this.r().b());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Integer>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115719n;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return w.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115719n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return Boxing.boxInt(w.this.r().c());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu6/e0;", "b", "()Lu6/e0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<e0> {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<File> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w f115722c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar) {
                super(0);
                this.f115722c = wVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final File invoke() throws IOException {
                w wVar = this.f115722c;
                File fileP = wVar.p(wVar.VERSION_SUFFIX);
                this.f115722c.n(fileP);
                return fileP;
            }
        }

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            e0.Companion companion = e0.INSTANCE;
            companion.d();
            return companion.a(new a(w.this));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {211, 47, 48}, m = "lock", n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
    static final class e<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115723n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115724o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f115725p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f115726q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f115728s;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115726q = obj;
            this.f115728s |= Integer.MIN_VALUE;
            return w.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<File> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            w wVar = w.this;
            File fileP = wVar.p(wVar.LOCK_SUFFIX);
            w.this.n(fileP);
            return fileP;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 1, 1, 1}, l = {62, 87}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
    static final class g<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115730n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115731o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f115732p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f115733q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f115734r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f115736t;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115734r = obj;
            this.f115736t |= Integer.MIN_VALUE;
            return w.this.a(null, this);
        }
    }

    public w(CoroutineContext context, File file) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = z.INSTANCE.e(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = MutexKt.Mutex$default(false, 1, null);
        this.lockFile = jn0.m.b(new f());
        this.lazySharedCounter = jn0.m.b(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(File file) throws IOException {
        o(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void o(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File p(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    private final File q() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 r() {
        return this.lazySharedCounter.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [wn0.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, u6.w$g] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // u6.s
    public <T> Object a(wn0.p<? super Boolean, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) throws Throwable {
        ?? gVar;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        Mutex mutex;
        boolean z11;
        Closeable closeable;
        Mutex mutex2;
        boolean z12;
        ?? r11 = pVar;
        if (continuation instanceof g) {
            g gVar2 = (g) continuation;
            int i11 = gVar2.f115736t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar2.f115736t = i11 - Integer.MIN_VALUE;
                gVar = gVar2;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objInvoke = gVar.f115734r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = gVar.f115736t;
        try {
            try {
                if (r12 != 0) {
                    if (r12 == 1) {
                        z12 = gVar.f115733q;
                        mutex2 = (Mutex) gVar.f115730n;
                        jn0.t.b(objInvoke);
                        if (z12) {
                            mutex2.unlock(null);
                        }
                        return objInvoke;
                    }
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = gVar.f115733q;
                    fileLock = (FileLock) gVar.f115732p;
                    closeable = (Closeable) gVar.f115731o;
                    mutex = (Mutex) gVar.f115730n;
                    try {
                        jn0.t.b(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        sn0.b.a(closeable, null);
                        if (z11) {
                            mutex.unlock(null);
                        }
                        return objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                jn0.t.b(objInvoke);
                Mutex mutex3 = this.inMemoryMutex;
                boolean zTryLock = mutex3.tryLock(null);
                try {
                    if (zTryLock) {
                        FileInputStream fileInputStream = new FileInputStream(q());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th3) {
                                th = th3;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e11) {
                            String message2 = e11.getMessage();
                            if ((message2 == null || !p013kotlin.text.t.b0(message2, this.LOCK_ERROR_MESSAGE, false, 2, null)) && ((message = e11.getMessage()) == null || !p013kotlin.text.t.b0(message, f115700k, false, 2, null))) {
                                throw e11;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolBoxBoolean = Boxing.boxBoolean(fileLockTryLock != null);
                            gVar.f115730n = mutex3;
                            gVar.f115731o = fileInputStream;
                            gVar.f115732p = fileLockTryLock;
                            gVar.f115733q = zTryLock;
                            gVar.f115736t = 2;
                            objInvoke = r11.invoke(boolBoxBoolean, gVar);
                            if (objInvoke != coroutine_suspended) {
                                mutex = mutex3;
                                z11 = zTryLock;
                                closeable = fileInputStream;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                sn0.b.a(closeable, null);
                                if (z11) {
                                    mutex.unlock(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                        gVar.f115730n = mutex3;
                        gVar.f115733q = zTryLock;
                        gVar.f115736t = 1;
                        objInvoke = r11.invoke(boolBoxBoolean2, gVar);
                        if (objInvoke != coroutine_suspended) {
                            mutex2 = mutex3;
                            z12 = zTryLock;
                            if (z12) {
                                mutex2.unlock(null);
                            }
                            return objInvoke;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th = th5;
                    gVar = mutex3;
                    r11 = zTryLock;
                    if (r11 != 0) {
                        gVar.unlock(null);
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            ?? r13 = gVar;
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    sn0.b.a(r12, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r11 = r11;
                    gVar = r13;
                    if (r11 != 0) {
                        gVar.unlock(null);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // u6.s
    public Flow<jn0.h0> b() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // u6.s
    public <T> Object c(wn0.l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) throws Throwable {
        e eVar;
        w wVar;
        FileOutputStream fileOutputStream;
        Throwable th2;
        wn0.l<? super Continuation<? super T>, ? extends Object> lVar2;
        Closeable closeable;
        ?? r11;
        ?? r12;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r13;
        ?? r14;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f115728s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f115728s = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        ?? r15 = eVar.f115726q;
        ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f115728s;
        try {
            try {
                try {
                    if (i12 == 0) {
                        jn0.t.b(r15);
                        Mutex mutex = this.inMemoryMutex;
                        eVar.f115723n = this;
                        eVar.f115724o = lVar;
                        eVar.f115725p = mutex;
                        eVar.f115728s = 1;
                        if (mutex.lock(null, eVar) != coroutine_suspended) {
                            wVar = this;
                            r15 = mutex;
                        }
                        return coroutine_suspended;
                    }
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) eVar.f115725p;
                            closeable2 = (Closeable) eVar.f115724o;
                            Mutex mutex2 = (Mutex) eVar.f115723n;
                            try {
                                jn0.t.b(r15);
                                r14 = mutex2;
                                r13 = r15;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    sn0.b.a(closeable2, null);
                                    r14.unlock(null);
                                    return r13;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r15 = r14;
                                    r15.unlock(null);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        }
                        closeable = (Closeable) eVar.f115725p;
                        r11 = (Mutex) eVar.f115724o;
                        lVar2 = (wn0.l) eVar.f115723n;
                        try {
                            jn0.t.b(r15);
                            r11 = r11;
                            r12 = r15;
                            fileLock2 = (FileLock) r12;
                            try {
                                eVar.f115723n = r11;
                                eVar.f115724o = closeable;
                                eVar.f115725p = fileLock2;
                                eVar.f115728s = 3;
                                objInvoke = lVar2.invoke(eVar);
                                if (objInvoke != coroutine_suspended) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r13 = objInvoke;
                                    r14 = r11;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    sn0.b.a(closeable2, null);
                                    r14.unlock(null);
                                    return r13;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th5) {
                                fileLock = fileLock2;
                                th2 = th5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th2;
                        }
                    }
                    Mutex mutex3 = (Mutex) eVar.f115725p;
                    wn0.l<? super Continuation<? super T>, ? extends Object> lVar3 = (wn0.l) eVar.f115724o;
                    wVar = (w) eVar.f115723n;
                    jn0.t.b(r15);
                    r15 = mutex3;
                    lVar = lVar3;
                    Companion companion = INSTANCE;
                    eVar.f115723n = lVar;
                    eVar.f115724o = r15;
                    eVar.f115725p = fileOutputStream;
                    eVar.f115728s = 2;
                    Object objB = companion.b(fileOutputStream, eVar);
                    if (objB != coroutine_suspended) {
                        lVar2 = lVar;
                        closeable = fileOutputStream;
                        r11 = r15;
                        r12 = objB;
                        fileLock2 = (FileLock) r12;
                        eVar.f115723n = r11;
                        eVar.f115724o = closeable;
                        eVar.f115725p = fileLock2;
                        eVar.f115728s = 3;
                        objInvoke = lVar2.invoke(eVar);
                        if (objInvoke != coroutine_suspended) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            r13 = objInvoke;
                            r14 = r11;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            sn0.b.a(closeable2, null);
                            r14.unlock(null);
                            return r13;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th7) {
                    th2 = th7;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th2;
                }
                fileOutputStream = new FileOutputStream(wVar.q());
            } catch (Throwable th8) {
                th = th8;
                r15.unlock(null);
                throw th;
            }
        } catch (Throwable th9) {
            r15 = eVar;
            try {
                throw th9;
            } catch (Throwable th10) {
                sn0.b.a(coroutine_suspended, th9);
                throw th10;
            }
        }
    }

    @Override // u6.s
    public Object d(Continuation<? super Integer> continuation) {
        return this.lazySharedCounter.isInitialized() ? Boxing.boxInt(r().b()) : BuildersKt.withContext(this.context, new b(null), continuation);
    }

    @Override // u6.s
    public Object e(Continuation<? super Integer> continuation) {
        return this.lazySharedCounter.isInitialized() ? Boxing.boxInt(r().c()) : BuildersKt.withContext(this.context, new c(null), continuation);
    }
}
