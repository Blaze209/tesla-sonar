package okio;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Lokio/f;", "Lokio/s0;", "<init>", "()V", "", "now", "remainingNanos", "(J)J", "Ljn0/h0;", "enter", "", "exit", "()Z", "cancel", "timedOut", "Lokio/p0;", "sink", "(Lokio/p0;)Lokio/p0;", "Lokio/r0;", "source", "(Lokio/r0;)Lokio/r0;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lwn0/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "", "state", "I", "next", "Lokio/f;", "timeoutAt", "J", "Companion", "b", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f extends s0 {
    private static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static f head;
    private static final ReentrantLock lock;
    private f next;
    private int state;
    private long timeoutAt;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lokio/f$a;", "", "<init>", "()V", "Lokio/f;", "node", "", "timeoutNanos", "", "hasDeadline", "Ljn0/h0;", "f", "(Lokio/f;JZ)V", "g", "(Lokio/f;)V", "c", "()Lokio/f;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/concurrent/locks/Condition;", "", "TIMEOUT_WRITE_SIZE", "I", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "head", "Lokio/f;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(f node, long timeoutNanos, boolean hasDeadline) {
            if (f.head == null) {
                f.head = new f();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.timeoutAt = Math.min(timeoutNanos, node.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (timeoutNanos != 0) {
                node.timeoutAt = timeoutNanos + jNanoTime;
            } else {
                if (!hasDeadline) {
                    throw new AssertionError();
                }
                node.timeoutAt = node.deadlineNanoTime();
            }
            long jRemainingNanos = node.remainingNanos(jNanoTime);
            f fVar = f.head;
            p013kotlin.jvm.internal.s.h(fVar);
            while (fVar.next != null) {
                f fVar2 = fVar.next;
                p013kotlin.jvm.internal.s.h(fVar2);
                if (jRemainingNanos < fVar2.remainingNanos(jNanoTime)) {
                    break;
                }
                fVar = fVar.next;
                p013kotlin.jvm.internal.s.h(fVar);
            }
            node.next = fVar.next;
            fVar.next = node;
            if (fVar == f.head) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(f node) {
            for (f fVar = f.head; fVar != null; fVar = fVar.next) {
                if (fVar.next == node) {
                    fVar.next = node.next;
                    node.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final f c() throws InterruptedException {
            f fVar = f.head;
            p013kotlin.jvm.internal.s.h(fVar);
            f fVar2 = fVar.next;
            if (fVar2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(f.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                f fVar3 = f.head;
                p013kotlin.jvm.internal.s.h(fVar3);
                if (fVar3.next != null || System.nanoTime() - jNanoTime < f.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return f.head;
            }
            long jRemainingNanos = fVar2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                d().await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            f fVar4 = f.head;
            p013kotlin.jvm.internal.s.h(fVar4);
            fVar4.next = fVar2.next;
            fVar2.next = null;
            fVar2.state = 2;
            return fVar2;
        }

        public final Condition d() {
            return f.condition;
        }

        public final ReentrantLock e() {
            return f.lock;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokio/f$b;", "Ljava/lang/Thread;", "<init>", "()V", "Ljn0/h0;", "run", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = f.Companion.e();
                    reentrantLockE.lock();
                    try {
                        f fVarC = f.Companion.c();
                        if (fVarC == f.head) {
                            a unused = f.Companion;
                            f.head = null;
                            reentrantLockE.unlock();
                            return;
                        } else {
                            jn0.h0 h0Var = jn0.h0.f84049a;
                            reentrantLockE.unlock();
                            if (fVarC != null) {
                                fVarC.timedOut();
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLockE.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused2) {
                    continue;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"okio/f$c", "Lokio/p0;", "Lokio/h;", "source", "", "byteCount", "Ljn0/h0;", "write", "(Lokio/h;J)V", "flush", "()V", "close", "Lokio/f;", "c", "()Lokio/f;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f97914b;

        c(p0 p0Var) {
            this.f97914b = p0Var;
        }

        @Override // okio.p0
        /* JADX INFO: renamed from: c, reason: from getter and merged with bridge method [inline-methods] */
        public f getTimeout() {
            return f.this;
        }

        @Override // okio.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            f fVar = f.this;
            p0 p0Var = this.f97914b;
            fVar.enter();
            try {
                try {
                    p0Var.close();
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    if (fVar.exit()) {
                        throw fVar.access$newTimeoutException(null);
                    }
                } catch (IOException e11) {
                    if (!fVar.exit()) {
                        throw e11;
                    }
                    throw fVar.access$newTimeoutException(e11);
                }
            } catch (Throwable th2) {
                fVar.exit();
                throw th2;
            }
        }

        @Override // okio.p0, java.io.Flushable
        public void flush() throws IOException {
            f fVar = f.this;
            p0 p0Var = this.f97914b;
            fVar.enter();
            try {
                try {
                    p0Var.flush();
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    if (fVar.exit()) {
                        throw fVar.access$newTimeoutException(null);
                    }
                } catch (IOException e11) {
                    if (!fVar.exit()) {
                        throw e11;
                    }
                    throw fVar.access$newTimeoutException(e11);
                }
            } catch (Throwable th2) {
                fVar.exit();
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f97914b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // okio.p0
        public void write(h source, long byteCount) throws IOException {
            p013kotlin.jvm.internal.s.k(source, "source");
            e.b(source.getSize(), 0L, byteCount);
            while (true) {
                long j11 = 0;
                if (byteCount <= 0) {
                    return;
                }
                m0 m0Var = source.head;
                p013kotlin.jvm.internal.s.h(m0Var);
                while (j11 < 65536) {
                    j11 += (long) (m0Var.limit - m0Var.pos);
                    if (j11 >= byteCount) {
                        j11 = byteCount;
                        break;
                    } else {
                        m0Var = m0Var.next;
                        p013kotlin.jvm.internal.s.h(m0Var);
                    }
                }
                f fVar = f.this;
                p0 p0Var = this.f97914b;
                fVar.enter();
                try {
                    try {
                        p0Var.write(source, j11);
                        jn0.h0 h0Var = jn0.h0.f84049a;
                        if (fVar.exit()) {
                            throw fVar.access$newTimeoutException(null);
                        }
                        byteCount -= j11;
                    } catch (IOException e11) {
                        if (!fVar.exit()) {
                            throw e11;
                        }
                        throw fVar.access$newTimeoutException(e11);
                    }
                } catch (Throwable th2) {
                    fVar.exit();
                    throw th2;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"okio/f$d", "Lokio/r0;", "Lokio/h;", "sink", "", "byteCount", "read", "(Lokio/h;J)J", "Ljn0/h0;", "close", "()V", "Lokio/f;", "c", "()Lokio/f;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements r0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f97916b;

        d(r0 r0Var) {
            this.f97916b = r0Var;
        }

        @Override // okio.r0
        /* JADX INFO: renamed from: c, reason: from getter and merged with bridge method [inline-methods] */
        public f getTimeout() {
            return f.this;
        }

        @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            f fVar = f.this;
            r0 r0Var = this.f97916b;
            fVar.enter();
            try {
                try {
                    r0Var.close();
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    if (fVar.exit()) {
                        throw fVar.access$newTimeoutException(null);
                    }
                } catch (IOException e11) {
                    if (!fVar.exit()) {
                        throw e11;
                    }
                    throw fVar.access$newTimeoutException(e11);
                }
            } catch (Throwable th2) {
                fVar.exit();
                throw th2;
            }
        }

        @Override // okio.r0
        public long read(h sink, long byteCount) throws IOException {
            p013kotlin.jvm.internal.s.k(sink, "sink");
            f fVar = f.this;
            r0 r0Var = this.f97916b;
            fVar.enter();
            try {
                try {
                    long j11 = r0Var.read(sink, byteCount);
                    if (fVar.exit()) {
                        throw fVar.access$newTimeoutException(null);
                    }
                    return j11;
                } catch (IOException e11) {
                    if (fVar.exit()) {
                        throw fVar.access$newTimeoutException(e11);
                    }
                    throw e11;
                }
            } catch (Throwable th2) {
                fVar.exit();
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f97916b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        p013kotlin.jvm.internal.s.j(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    public final IOException access$newTimeoutException(IOException cause) {
        return newTimeoutException(cause);
    }

    @Override // okio.s0
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                Companion.g(this);
                this.state = 3;
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.f(this, timeoutNanos, hasDeadline);
                jn0.h0 h0Var = jn0.h0.f84049a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i11 = this.state;
            this.state = 0;
            if (i11 != 1) {
                return i11 == 2;
            }
            Companion.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException newTimeoutException(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final p0 sink(p0 sink) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        return new c(sink);
    }

    public final r0 source(r0 source) {
        p013kotlin.jvm.internal.s.k(source, "source");
        return new d(source);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(wn0.a<? extends T> block) throws IOException {
        p013kotlin.jvm.internal.s.k(block, "block");
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                p013kotlin.jvm.internal.q.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                p013kotlin.jvm.internal.q.a(1);
                return tInvoke;
            } catch (IOException e11) {
                if (exit()) {
                    throw access$newTimeoutException(e11);
                }
                throw e11;
            }
        } catch (Throwable th2) {
            p013kotlin.jvm.internal.q.b(1);
            exit();
            p013kotlin.jvm.internal.q.a(1);
            throw th2;
        }
    }
}
