package u6;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122.\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001d\u001a\u00020\n2(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,¨\u0006."}, d2 = {"Lu6/o;", "T", "Lu6/j0;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lu6/d0;", "serializer", "Lu6/s;", "coordinator", "Lkotlin/Function0;", "Ljn0/h0;", "onClose", "<init>", "(Ljava/io/File;Lu6/d0;Lu6/s;Lwn0/a;)V", "f", "()V", "g", "(Ljava/io/File;)V", "R", "Lkotlin/Function3;", "Lu6/b0;", "", "Lkotlin/coroutines/Continuation;", "", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lu6/o0;", "b", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "a", "Ljava/io/File;", "Lu6/d0;", "c", "Lu6/s;", "()Lu6/s;", "Lwn0/a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "transactionMutex", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o<T> implements j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0<T> serializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s coordinator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onClose;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Mutex transactionMutex;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0}, l = {101}, m = "readScope", n = {"this", "$this$use$iv", "lock"}, s = {"L$0", "L$1", "Z$0"})
    static final class a<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115676n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115677o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f115678p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f115679q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ o<T> f115680r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f115681s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o<T> oVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f115680r = oVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115679q = obj;
            this.f115681s |= Integer.MIN_VALUE;
            return this.f115680r.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, 118}, m = "writeScope", n = {"this", "block", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchFile", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115682n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115683o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f115684p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f115685q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f115686r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ o<T> f115687s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f115688t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o<T> oVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f115687s = oVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115686r = obj;
            this.f115688t |= Integer.MIN_VALUE;
            return this.f115687s.b(null, this);
        }
    }

    public o(File file, d0<T> serializer, s coordinator, wn0.a<jn0.h0> onClose) {
        p013kotlin.jvm.internal.s.k(file, "file");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        p013kotlin.jvm.internal.s.k(coordinator, "coordinator");
        p013kotlin.jvm.internal.s.k(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = MutexKt.Mutex$default(false, 1, null);
    }

    private final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // u6.j0
    public Object b(wn0.p<? super o0<T>, ? super Continuation<? super jn0.h0>, ? extends Object> pVar, Continuation<? super jn0.h0> continuation) throws IOException {
        b bVar;
        File file;
        o<T> oVar;
        Mutex mutex;
        p pVar2;
        Throwable th2;
        c cVar;
        File file2;
        o<T> oVar2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f115688t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f115688t = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object obj = bVar.f115686r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = bVar.f115688t;
        try {
            try {
                try {
                    try {
                        if (r11 == 0) {
                            jn0.t.b(obj);
                            f();
                            g(this.file);
                            Mutex mutex2 = this.transactionMutex;
                            bVar.f115682n = this;
                            bVar.f115683o = pVar;
                            bVar.f115684p = mutex2;
                            bVar.f115688t = 1;
                            if (mutex2.lock(null, bVar) != coroutine_suspended) {
                                oVar = this;
                                mutex = mutex2;
                            }
                            return coroutine_suspended;
                        }
                        if (r11 != 1) {
                            if (r11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar = (c) bVar.f115685q;
                            File file3 = (File) bVar.f115684p;
                            mutex = (Mutex) bVar.f115683o;
                            oVar2 = (o) bVar.f115682n;
                            try {
                                jn0.t.b(obj);
                                file2 = file3;
                                jn0.h0 h0Var = jn0.h0.f84049a;
                                try {
                                    cVar.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !l.a(file2, oVar2.file)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + oVar2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                jn0.h0 h0Var2 = jn0.h0.f84049a;
                                mutex.unlock(null);
                                return jn0.h0.f84049a;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    cVar.close();
                                } catch (Throwable th5) {
                                    jn0.g.a(th2, th5);
                                }
                                throw th2;
                            }
                        }
                        Mutex mutex3 = (Mutex) bVar.f115684p;
                        wn0.p<? super o0<T>, ? super Continuation<? super jn0.h0>, ? extends Object> pVar3 = (wn0.p) bVar.f115683o;
                        oVar = (o) bVar.f115682n;
                        jn0.t.b(obj);
                        mutex = mutex3;
                        pVar = pVar3;
                        bVar.f115682n = oVar;
                        bVar.f115683o = mutex;
                        bVar.f115684p = file;
                        bVar.f115685q = pVar2;
                        bVar.f115688t = 2;
                        if (pVar.invoke(pVar2, bVar) != coroutine_suspended) {
                            file2 = file;
                            oVar2 = oVar;
                            cVar = pVar2;
                            jn0.h0 h0Var3 = jn0.h0.f84049a;
                            cVar.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + oVar2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            jn0.h0 h0Var4 = jn0.h0.f84049a;
                            mutex.unlock(null);
                            return jn0.h0.f84049a;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th6) {
                        th2 = th6;
                        cVar = pVar2;
                        cVar.close();
                        throw th2;
                    }
                    pVar2 = new p(file, oVar.serializer);
                } catch (IOException e11) {
                    e = e11;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(oVar.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                r11.unlock(null);
                throw th7;
            }
        } catch (IOException e12) {
            e = e12;
            file = coroutine_suspended;
        }
    }

    @Override // u6.j0
    /* JADX INFO: renamed from: c, reason: from getter */
    public s getCoordinator() {
        return this.coordinator;
    }

    @Override // u6.c
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [u6.o] */
    /* JADX WARN: Type inference failed for: r0v14, types: [u6.o] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u6.o$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [u6.o] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [wn0.q, wn0.q<? super u6.b0<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // u6.j0
    public <R> Object d(wn0.q<? super b0<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super R> continuation) throws Throwable {
        ?? aVar;
        Throwable th2;
        c cVar;
        ?? r11;
        ?? r12;
        if (continuation instanceof a) {
            a aVar2 = (a) continuation;
            int i11 = aVar2.f115681s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f115681s = i11 - Integer.MIN_VALUE;
                aVar = aVar2;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object obj = aVar.f115679q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f115681s;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (wn0.q<? super b0<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object>) aVar.f115678p;
                cVar = (c) aVar.f115677o;
                aVar = (o) aVar.f115676n;
                try {
                    jn0.t.b(obj);
                    r12 = aVar;
                    r11 = qVar;
                    try {
                        cVar.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r11 != 0) {
                        Mutex.DefaultImpls.unlock$default(r12.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        cVar.close();
                    } catch (Throwable th5) {
                        jn0.g.a(th2, th5);
                    }
                    throw th2;
                }
            }
            jn0.t.b(obj);
            f();
            boolean zTryLock$default = Mutex.DefaultImpls.tryLock$default(this.transactionMutex, null, 1, null);
            try {
                m mVar = new m(this.file, this.serializer);
                try {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(zTryLock$default);
                    aVar.f115676n = this;
                    aVar.f115677o = mVar;
                    aVar.f115678p = zTryLock$default;
                    aVar.f115681s = 1;
                    Object objInvoke = qVar.invoke(mVar, boolBoxBoolean, aVar);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    r11 = zTryLock$default;
                    r12 = this;
                    cVar = mVar;
                    cVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r11 != 0) {
                        Mutex.DefaultImpls.unlock$default(r12.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    qVar = zTryLock$default;
                    aVar = this;
                    cVar = mVar;
                    cVar.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                qVar = zTryLock$default;
                aVar = this;
                if (qVar != 0) {
                    Mutex.DefaultImpls.unlock$default(aVar.transactionMutex, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (qVar != 0) {
                Mutex.DefaultImpls.unlock$default(aVar.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }
}
