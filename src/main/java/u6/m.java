package u6;

import ch.qos.logback.core.joran.action.Action;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lu6/m;", "T", "Lu6/b0;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lu6/d0;", "serializer", "<init>", "(Ljava/io/File;Lu6/d0;)V", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "close", "()V", "f", "a", "Ljava/io/File;", "g", "()Ljava/io/File;", "b", "Lu6/d0;", "h", "()Lu6/d0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class m<T> implements b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0<T> serializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closed;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", i = {0}, l = {169, 178}, m = "readData$suspendImpl", n = {"$this"}, s = {"L$0"})
    static final class a<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115651n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115652o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115653p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ m<T> f115654q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115655r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<T> mVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f115654q = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115653p = obj;
            this.f115655r |= Integer.MIN_VALUE;
            return m.i(this.f115654q, this);
        }
    }

    public m(File file, d0<T> serializer) {
        p013kotlin.jvm.internal.s.k(file, "file");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [u6.m] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v21 */
    static /* synthetic */ <T> Object i(m<T> mVar, Continuation<? super T> continuation) {
        a aVar;
        Throwable th2;
        Closeable closeable;
        Closeable closeable2;
        Throwable th3;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f115655r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f115655r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(mVar, continuation);
            }
        } else {
            aVar = new a(mVar, continuation);
        }
        Object obj = aVar.f115653p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = aVar.f115655r;
        try {
            if (r11 != 0) {
                if (r11 == 1) {
                    closeable2 = (Closeable) aVar.f115652o;
                    r11 = (m) aVar.f115651n;
                    try {
                        jn0.t.b(obj);
                        sn0.b.a(closeable2, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            sn0.b.a(closeable2, th3);
                            throw th5;
                        }
                    }
                }
                if (r11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f115651n;
                try {
                    jn0.t.b(obj);
                    sn0.b.a(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        sn0.b.a(closeable, th2);
                        throw th7;
                    }
                }
            }
            jn0.t.b(obj);
            mVar.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(((m) mVar).file);
                try {
                    d0<T> d0Var = ((m) mVar).serializer;
                    aVar.f115651n = mVar;
                    aVar.f115652o = fileInputStream;
                    aVar.f115655r = 1;
                    Object objB = d0Var.b(fileInputStream, aVar);
                    if (objB != coroutine_suspended) {
                        closeable2 = fileInputStream;
                        obj = objB;
                        sn0.b.a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    r11 = mVar;
                    closeable2 = fileInputStream;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                if (!((m) mVar).file.exists()) {
                    return ((m) mVar).serializer.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((m) mVar).file);
                try {
                    d0<T> d0Var2 = ((m) mVar).serializer;
                    aVar.f115651n = fileInputStream2;
                    aVar.f115652o = null;
                    aVar.f115655r = 2;
                    Object objB2 = d0Var2.b(fileInputStream2, aVar);
                    if (objB2 != coroutine_suspended) {
                        obj = objB2;
                        closeable = fileInputStream2;
                        sn0.b.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream2;
                    throw th2;
                }
            }
            return coroutine_suspended;
        } catch (FileNotFoundException unused2) {
            mVar = (m<T>) r11;
        }
    }

    @Override // u6.c
    public void close() {
        this.closed.set(true);
    }

    @Override // u6.b0
    public Object e(Continuation<? super T> continuation) {
        return i(this, continuation);
    }

    protected final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final File getFile() {
        return this.file;
    }

    protected final d0<T> h() {
        return this.serializer;
    }
}
