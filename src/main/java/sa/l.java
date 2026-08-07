package sa;

import android.database.SQLException;
import androidx.room.r0;
import androidx.room.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.sync.Mutex;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001f $B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2(\u0010\u0010\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2(\u0010\u0010\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fH\u0096@¢\u0006\u0004\b\u001f\u0010\u0012J\u0010\u0010 \u001a\u00020\u0005H\u0096@¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0018\u00102\u001a\u00060/j\u0002`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0014\u00104\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*R\u0014\u00107\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u00106¨\u00068"}, d2 = {"Lsa/l;", "Landroidx/room/s0;", "Lsa/m;", "Lsa/i;", "delegate", "", "isReadOnly", "<init>", "(Lsa/i;Z)V", "R", "Landroidx/room/s0$a;", "type", "Lkotlin/Function2;", "Landroidx/room/r0;", "Lkotlin/coroutines/Continuation;", "", "block", "o", "(Landroidx/room/s0$a;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/room/s0$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "success", "j", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Lya/d;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "()V", "a", "Lsa/i;", "k", "()Lsa/i;", "Z", "l", "()Z", "Lkotlin/collections/m;", "Lsa/l$c;", "Lkotlin/collections/m;", "transactionStack", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isRecycled", "m", "isRecycled", "Lya/b;", "()Lya/b;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class l implements s0, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isReadOnly;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.collections.m<c> transactionStack;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _isRecycled;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lsa/l$a;", "Lya/d;", "delegate", "<init>", "(Lsa/l;Lya/d;)V", "", "index", "", "value", "Ljn0/h0;", "y", "(I[B)V", "", "G", "(ID)V", "", "x", "(IJ)V", "", "c2", "(ILjava/lang/String;)V", "A", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "q3", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "I1", "()Z", "reset", "()V", "close", "a", "Lya/d;", "b", "J", "threadId", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class a implements ya.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ya.d delegate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long threadId;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f110721c;

        public a(l lVar, ya.d delegate) {
            s.k(delegate, "delegate");
            this.f110721c = lVar;
            this.delegate = delegate;
            this.threadId = ra.d.b();
        }

        @Override // ya.d
        public void A(int index) {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                this.delegate.A(index);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // ya.d
        public void G(int index, double value) {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                this.delegate.G(index, value);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // ya.d
        public boolean I1() {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                return this.delegate.I1();
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public void c2(int index, String value) {
            s.k(value, "value");
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                this.delegate.c2(index, value);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                this.delegate.close();
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                return this.delegate.getBlob(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public int getColumnCount() {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                return this.delegate.getColumnCount();
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public String getColumnName(int index) {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                return this.delegate.getColumnName(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public long getLong(int index) {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                return this.delegate.getLong(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public boolean isNull(int index) {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                return this.delegate.isNull(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public String q3(int index) {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                return this.delegate.q3(index);
            }
            ya.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public void reset() {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                this.delegate.reset();
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // ya.d
        public void x(int index, long value) {
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                this.delegate.x(index, value);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // ya.d
        public void y(int index, byte[] value) {
            s.k(value, "value");
            if (this.f110721c.m()) {
                ya.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ra.d.b()) {
                this.delegate.y(index, value);
            } else {
                ya.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lsa/l$b;", "T", "Landroidx/room/r0;", "Lsa/m;", "<init>", "(Lsa/l;)V", "R", "", "sql", "Lkotlin/Function1;", "Lya/d;", "block", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lya/b;", "a", "()Lya/b;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b<T> implements r0<T>, m {
        public b() {
        }

        @Override // sa.m
        public ya.b a() {
            return l.this.a();
        }

        @Override // androidx.room.u
        public <R> Object d(String str, wn0.l<? super ya.d, ? extends R> lVar, Continuation<? super R> continuation) {
            return l.this.d(str, lVar, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lsa/l$c;", "", "", "id", "", "shouldRollback", "<init>", "(IZ)V", "a", "I", "()I", "b", "Z", "()Z", "setShouldRollback", "(Z)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldRollback;

        public c(int i11, boolean z11) {
            this.id = i11;
            this.shouldRollback = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110725a;

        static {
            int[] iArr = new int[s0.a.values().length];
            try {
                iArr[s0.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f110725a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {543}, m = "beginTransaction", n = {"this", "type", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110726n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110727o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f110728p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f110729q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f110731s;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110729q = obj;
            this.f110731s |= Integer.MIN_VALUE;
            return l.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {543}, m = "endTransaction", n = {"this", "$this$withLock_u24default$iv", "success"}, s = {"L$0", "L$1", "Z$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110732n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110733o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f110734p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f110735q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f110737s;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110735q = obj;
            this.f110737s |= Integer.MIN_VALUE;
            return l.this.j(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 1, 1, 4}, l = {376, 380, 393, 393, 393}, m = "transaction", n = {"this", "block", "this", "success", "exception"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0"})
    static final class g<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110738n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110739o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f110740p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f110741q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f110743s;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110741q = obj;
            this.f110743s |= Integer.MIN_VALUE;
            return l.this.o(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0, 0}, l = {554}, m = "usePrepared", n = {"this", "sql", "block", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class h<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110744n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110745o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f110746p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f110747q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f110748r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f110750t;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110748r = obj;
            this.f110750t |= Integer.MIN_VALUE;
            return l.this.d(null, null, this);
        }
    }

    public l(i delegate, boolean z11) {
        s.k(delegate, "delegate");
        this.delegate = delegate;
        this.isReadOnly = z11;
        this.transactionStack = new p013kotlin.collections.m<>();
        this._isRecycled = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(s0.a aVar, Continuation<? super h0> continuation) {
        e eVar;
        Mutex mutex;
        l lVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f110731s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f110731s = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f110729q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f110731s;
        if (i12 == 0) {
            t.b(obj);
            mutex = this.delegate;
            eVar.f110726n = this;
            eVar.f110727o = aVar;
            eVar.f110728p = mutex;
            eVar.f110731s = 1;
            if (mutex.lock(null, eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) eVar.f110728p;
            s0.a aVar2 = (s0.a) eVar.f110727o;
            lVar = (l) eVar.f110726n;
            t.b(obj);
            mutex = mutex2;
            aVar = aVar2;
        }
        try {
            int size = lVar.transactionStack.size();
            if (lVar.transactionStack.isEmpty()) {
                int i13 = d.f110725a[aVar.ordinal()];
                if (i13 == 1) {
                    ya.a.a(lVar.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i13 == 2) {
                    ya.a.a(lVar.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ya.a.a(lVar.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                ya.a.a(lVar.delegate, "SAVEPOINT '" + size + CoreConstants.SINGLE_QUOTE_CHAR);
            }
            lVar.transactionStack.addLast(new c(size, false));
            h0 h0Var = h0.f84049a;
            mutex.unlock(null);
            return h0Var;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z11, Continuation<? super h0> continuation) {
        f fVar;
        l lVar;
        Mutex mutex;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f110737s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f110737s = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f110735q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f110737s;
        if (i12 == 0) {
            t.b(obj);
            i iVar = this.delegate;
            fVar.f110732n = this;
            fVar.f110733o = iVar;
            fVar.f110734p = z11;
            fVar.f110737s = 1;
            if (iVar.lock(null, fVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lVar = this;
            mutex = iVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = fVar.f110734p;
            mutex = (Mutex) fVar.f110733o;
            lVar = (l) fVar.f110732n;
            t.b(obj);
        }
        try {
            if (lVar.transactionStack.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            c cVar = (c) v.O(lVar.transactionStack);
            if (!z11 || cVar.getShouldRollback()) {
                if (lVar.transactionStack.isEmpty()) {
                    ya.a.a(lVar.delegate, "ROLLBACK TRANSACTION");
                } else {
                    ya.a.a(lVar.delegate, "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar.getId() + CoreConstants.SINGLE_QUOTE_CHAR);
                }
            } else if (lVar.transactionStack.isEmpty()) {
                ya.a.a(lVar.delegate, "END TRANSACTION");
            } else {
                ya.a.a(lVar.delegate, "RELEASE SAVEPOINT '" + cVar.getId() + CoreConstants.SINGLE_QUOTE_CHAR);
            }
            h0 h0Var = h0.f84049a;
            mutex.unlock(null);
            return h0Var;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        return this._isRecycled.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #1 {all -> 0x00c0, blocks: (B:49:0x00a8, B:51:0x00ac), top: B:72:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        if (r13.j(false, r0) == r1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object o(androidx.room.s0.a r12, wn0.p<? super androidx.room.r0<R>, ? super p013kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r13, p013kotlin.coroutines.Continuation<? super R> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.l.o(androidx.room.s0$a, wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sa.m
    public ya.b a() {
        return this.delegate;
    }

    @Override // androidx.room.s0
    public Object b(Continuation<? super Boolean> continuation) {
        if (m()) {
            ya.a.b(21, "Connection is recycled");
            throw new KotlinNothingValueException();
        }
        sa.a aVar = (sa.a) continuation.get$context().get(sa.a.INSTANCE);
        if (aVar != null && aVar.getConnectionWrapper() == this) {
            return Boxing.boxBoolean(!this.transactionStack.isEmpty());
        }
        ya.a.b(21, "Attempted to use connection on a different coroutine");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.room.s0
    public <R> Object c(s0.a aVar, p<? super r0<R>, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        if (m()) {
            ya.a.b(21, "Connection is recycled");
            throw new KotlinNothingValueException();
        }
        sa.a aVar2 = (sa.a) continuation.get$context().get(sa.a.INSTANCE);
        if (aVar2 != null && aVar2.getConnectionWrapper() == this) {
            return o(aVar, pVar, continuation);
        }
        ya.a.b(21, "Attempted to use connection on a different coroutine");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.u
    public <R> Object d(String str, wn0.l<? super ya.d, ? extends R> lVar, Continuation<? super R> continuation) {
        h hVar;
        Mutex mutex;
        l lVar2;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f110750t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f110750t = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object obj = hVar.f110748r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f110750t;
        if (i12 == 0) {
            t.b(obj);
            if (m()) {
                ya.a.b(21, "Connection is recycled");
                throw new KotlinNothingValueException();
            }
            sa.a aVar = (sa.a) hVar.get$context().get(sa.a.INSTANCE);
            if (aVar == null || aVar.getConnectionWrapper() != this) {
                ya.a.b(21, "Attempted to use connection on a different coroutine");
                throw new KotlinNothingValueException();
            }
            mutex = this.delegate;
            hVar.f110744n = this;
            hVar.f110745o = str;
            hVar.f110746p = lVar;
            hVar.f110747q = mutex;
            hVar.f110750t = 1;
            if (mutex.lock(null, hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lVar2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) hVar.f110747q;
            lVar = (wn0.l) hVar.f110746p;
            String str2 = (String) hVar.f110745o;
            lVar2 = (l) hVar.f110744n;
            t.b(obj);
            mutex = mutex2;
            str = str2;
        }
        try {
            a aVar2 = new a(lVar2, lVar2.delegate.L1(str));
            try {
                R rInvoke = lVar.invoke(aVar2);
                un0.a.a(aVar2, null);
                mutex.unlock(null);
                return rInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    un0.a.a(aVar2, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            mutex.unlock(null);
            throw th4;
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final i getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final void n() throws Exception {
        if (this._isRecycled.compareAndSet(false, true)) {
            try {
                ya.a.a(this.delegate, "ROLLBACK TRANSACTION");
            } catch (SQLException unused) {
            }
        }
    }
}
