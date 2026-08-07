package sa;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\u0019\u0010\u0016\u001a\u00020\t2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u00060\u001ej\u0002`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lsa/k;", "", "", "capacity", "Lkotlin/Function0;", "Lya/b;", "connectionFactory", "<init>", "(ILwn0/a;)V", "Ljn0/h0;", "e", "()V", "Lsa/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connection", DateTokenConverter.CONVERTER_KEY, "(Lsa/i;)V", "b", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "c", "(Ljava/lang/StringBuilder;)V", "I", "getCapacity", "()I", "Lwn0/a;", "getConnectionFactory", "()Lwn0/a;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "size", "", "Z", "isClosed", "", "f", "[Lsa/i;", "connections", "Lkotlinx/coroutines/sync/Semaphore;", "g", "Lkotlinx/coroutines/sync/Semaphore;", "connectionPermits", "Landroidx/collection/e;", "h", "Landroidx/collection/e;", "availableConnections", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<ya.b> connectionFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i[] connections;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Semaphore connectionPermits;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final androidx.collection.e<i> availableConnections;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "acquire", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110711n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f110712o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f110714q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110712o = obj;
            this.f110714q |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(int i11, wn0.a<? extends ya.b> connectionFactory) {
        s.k(connectionFactory, "connectionFactory");
        this.capacity = i11;
        this.connectionFactory = connectionFactory;
        this.lock = new ReentrantLock();
        this.connections = new i[i11];
        this.connectionPermits = SemaphoreKt.Semaphore$default(i11, 0, 2, null);
        this.availableConnections = new androidx.collection.e<>(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e() {
        if (this.size >= this.capacity) {
            return;
        }
        i iVar = new i(this.connectionFactory.invoke(), null, 2, 0 == true ? 1 : 0);
        i[] iVarArr = this.connections;
        int i11 = this.size;
        this.size = i11 + 1;
        iVarArr[i11] = iVar;
        this.availableConnections.a(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation<? super i> continuation) {
        a aVar;
        k kVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f110714q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f110714q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f110712o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f110714q;
        if (i12 == 0) {
            t.b(obj);
            Semaphore semaphore = this.connectionPermits;
            aVar.f110711n = this;
            aVar.f110714q = 1;
            if (semaphore.acquire(aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            kVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (k) aVar.f110711n;
            t.b(obj);
        }
        try {
            ReentrantLock reentrantLock = kVar.lock;
            reentrantLock.lock();
            try {
                if (kVar.isClosed) {
                    ya.a.b(21, "Connection pool is closed");
                    throw new KotlinNothingValueException();
                }
                if (kVar.availableConnections.d()) {
                    kVar.e();
                }
                i iVarE = kVar.availableConnections.e();
                reentrantLock.unlock();
                return iVarE;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            kVar.connectionPermits.release();
            throw th3;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (i iVar : this.connections) {
                if (iVar != null) {
                    iVar.close();
                }
            }
            h0 h0Var = h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(StringBuilder builder) {
        s.k(builder, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listC = v.c();
            int iF = this.availableConnections.f();
            for (int i11 = 0; i11 < iF; i11++) {
                listC.add(this.availableConnections.c(i11));
            }
            List listA = v.a(listC);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + ", ");
            builder.append("permits=" + this.connectionPermits.getAvailablePermits() + ", ");
            builder.append("queue=(size=" + listA.size() + ")[" + v.y0(listA, null, null, null, 0, null, null, 63, null) + "], ");
            builder.append(")");
            builder.append('\n');
            i[] iVarArr = this.connections;
            int length = iVarArr.length;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                i iVar = iVarArr[i13];
                i12++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i12);
                sb2.append("] - ");
                sb2.append(iVar != null ? iVar.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (iVar != null) {
                    iVar.c(builder);
                }
            }
            h0 h0Var = h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(i connection) {
        s.k(connection, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.a(connection);
            h0 h0Var = h0.f84049a;
            reentrantLock.unlock();
            this.connectionPermits.release();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
