package ye0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lye0/b;", "", "<init>", "()V", "", "message", "", "ivCounter", DateTokenConverter.CONVERTER_KEY, "([BLjava/lang/Long;)J", "", "a", "([B)Z", "b", "([B)Ljava/lang/Long;", "c", "(J)[B", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "messageCounter", "", "Lkotlin/Pair;", "Lokio/k;", "Ljava/util/List;", "pendingUnsignedMessages", "Lye0/b$a;", "Lye0/b$a;", "pendingSignedMessages", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("LegacyMessageManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicLong messageCounter = new AtomicLong(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<okio.k, Long>> pendingUnsignedMessages = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a pendingSignedMessages = new a();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0015j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0015j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Lye0/b$a;", "", "<init>", "()V", "Lokio/k;", "message", "", "b", "(Lokio/k;)Z", "", "counter", "a", "(J)Z", "ivCounter", "Ljn0/h0;", "e", "(Lokio/k;J)V", "c", "(Lokio/k;)Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "(J)Lokio/k;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "pendingSignedMessages", "counterToSignedMessage", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HashMap<okio.k, Long> pendingSignedMessages = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final HashMap<Long, okio.k> counterToSignedMessage = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        public final boolean a(long counter) {
            ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
            lock.lock();
            try {
                return this.counterToSignedMessage.containsKey(Long.valueOf(counter));
            } finally {
                lock.unlock();
            }
        }

        public final boolean b(okio.k message) {
            s.k(message, "message");
            ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
            lock.lock();
            try {
                return this.pendingSignedMessages.containsKey(message);
            } finally {
                lock.unlock();
            }
        }

        public final Long c(okio.k message) {
            s.k(message, "message");
            ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i11 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i12 = 0; i12 < readHoldCount; i12++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                if (!b(message)) {
                    while (i11 < readHoldCount) {
                        lock.lock();
                        i11++;
                    }
                    writeLock.unlock();
                    return null;
                }
                u0.d(this.counterToSignedMessage).remove(this.pendingSignedMessages.get(message));
                Long lRemove = this.pendingSignedMessages.remove(message);
                while (i11 < readHoldCount) {
                    lock.lock();
                    i11++;
                }
                writeLock.unlock();
                return lRemove;
            } catch (Throwable th2) {
                while (i11 < readHoldCount) {
                    lock.lock();
                    i11++;
                }
                writeLock.unlock();
                throw th2;
            }
        }

        public final okio.k d(long ivCounter) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i11 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i12 = 0; i12 < readHoldCount; i12++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                if (!a(ivCounter)) {
                    while (i11 < readHoldCount) {
                        lock.lock();
                        i11++;
                    }
                    writeLock.unlock();
                    return null;
                }
                u0.d(this.pendingSignedMessages).remove(this.counterToSignedMessage.get(Long.valueOf(ivCounter)));
                okio.k kVarRemove = this.counterToSignedMessage.remove(Long.valueOf(ivCounter));
                while (i11 < readHoldCount) {
                    lock.lock();
                    i11++;
                }
                writeLock.unlock();
                return kVarRemove;
            } catch (Throwable th2) {
                while (i11 < readHoldCount) {
                    lock.lock();
                    i11++;
                }
                writeLock.unlock();
                throw th2;
            }
        }

        public final void e(okio.k message, long ivCounter) {
            s.k(message, "message");
            ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i11 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i12 = 0; i12 < readHoldCount; i12++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.counterToSignedMessage.put(Long.valueOf(ivCounter), message);
                this.pendingSignedMessages.put(message, Long.valueOf(ivCounter));
                h0 h0Var = h0.f84049a;
                while (i11 < readHoldCount) {
                    lock.lock();
                    i11++;
                }
            } finally {
                while (i11 < readHoldCount) {
                    lock.lock();
                    i11++;
                }
                writeLock.unlock();
            }
        }
    }

    public final boolean a(byte[] message) {
        boolean z11;
        s.k(message, "message");
        this.logger.j(Thread.currentThread().getName() + " check isUnsignedMessage: " + message);
        okio.k kVarI = okio.k.Companion.i(okio.k.INSTANCE, message, 0, 0, 3, null);
        synchronized (this) {
            Iterator<Pair<okio.k, Long>> it = this.pendingUnsignedMessages.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (s.f(it.next().e(), kVarI)) {
                    break;
                }
                i11++;
            }
            z11 = i11 != -1;
        }
        return z11;
    }

    public final Long b(byte[] message) {
        Long lF;
        s.k(message, "message");
        this.logger.j(Thread.currentThread().getName() + " remove message: " + message);
        okio.k kVarI = okio.k.Companion.i(okio.k.INSTANCE, message, 0, 0, 3, null);
        if (!a(message)) {
            return this.pendingSignedMessages.c(kVarI);
        }
        synchronized (this) {
            try {
                Iterator<Pair<okio.k, Long>> it = this.pendingUnsignedMessages.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (s.f(it.next().e(), kVarI)) {
                        break;
                    }
                    i11++;
                }
                Integer numValueOf = Integer.valueOf(i11);
                lF = null;
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    Pair<okio.k, Long> pairRemove = this.pendingUnsignedMessages.remove(numValueOf.intValue());
                    if (pairRemove != null) {
                        lF = pairRemove.f();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lF;
    }

    public final byte[] c(long ivCounter) {
        this.logger.j(Thread.currentThread().getName() + " remove signed message with " + ivCounter);
        okio.k kVarD = this.pendingSignedMessages.d(ivCounter);
        if (kVarD != null) {
            return kVarD.J();
        }
        return null;
    }

    public final long d(byte[] message, Long ivCounter) {
        s.k(message, "message");
        this.logger.j(Thread.currentThread().getName() + " store message: " + message + " with " + ivCounter);
        okio.k kVarI = okio.k.Companion.i(okio.k.INSTANCE, message, 0, 0, 3, null);
        if (ivCounter != null) {
            long jLongValue = ivCounter.longValue();
            this.pendingSignedMessages.e(kVarI, jLongValue);
            return jLongValue;
        }
        long andIncrement = this.messageCounter.getAndIncrement();
        synchronized (this) {
            this.pendingUnsignedMessages.add(x.a(kVarI, Long.valueOf(andIncrement)));
        }
        return andIncrement;
    }
}
