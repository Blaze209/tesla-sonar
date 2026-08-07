package io.ktor.utils.io;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ#\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u001b\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0080@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0080@ø\u0001\u0000¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010&\u001a\u00020\tH\u0004¢\u0006\u0004\b&\u0010\u000bJ\u001b\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\t2\u0006\u0010+\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\t2\u0006\u00106\u001a\u00020\u001dH\u0016¢\u0006\u0004\b7\u0010 J\u0017\u00108\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0004¢\u0006\u0004\b8\u0010 J\u001b\u00109\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010=\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020;H\u0096@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020*H\u0080@ø\u0001\u0000¢\u0006\u0004\b?\u0010-J+\u0010@\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b@\u00102J\u001b\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\bB\u0010#J\u0013\u0010C\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001b\u0010E\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u001dH\u0084@ø\u0001\u0000¢\u0006\u0004\bE\u0010#J\u001b\u0010F\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\bF\u0010:J\u0019\u0010I\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bK\u0010JJ\u001f\u0010L\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0004¢\u0006\u0004\bN\u0010 R\u001a\u0010Q\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010O\u001a\u0004\bP\u0010\bR\u001a\u0010U\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bF\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010Y\u001a\u00020\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b7\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010[R\u0018\u0010`\u001a\u00060\u0004j\u0002`]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010RR\u0014\u0010c\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\bR$\u0010h\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00068D@DX\u0084\u000e¢\u0006\f\u001a\u0004\be\u0010\b\"\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010jR\u0014\u0010o\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\bR(\u0010t\u001a\u0004\u0018\u00010G2\b\u0010d\u001a\u0004\u0018\u00010G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010s\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006u"}, d2 = {"Lio/ktor/utils/io/f;", "Lio/ktor/utils/io/c;", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/j;", "", "Lio/ktor/utils/io/s;", "", "H", "()Z", "Ljn0/h0;", "I", "()V", "E", Gender.FEMALE, "Lll0/j;", "closeable", "G", "(Lll0/j;)V", "builder", "", "limit", "Lll0/k;", Gender.UNKNOWN, "(Lll0/j;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "B", "max", "discarded0", "D", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "count", "r", "(I)V", "s", "y", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x", "flush", "P", "packet", "j", "(Lll0/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lll0/a;", "src", "k", "(Lll0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "offset", "length", "l", "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/x;", "n", "()Lio/ktor/utils/io/x;", "written", DateTokenConverter.CONVERTER_KEY, "t", "g", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lml0/a;", "dst", "b", "(Lml0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Q", IntegerTokenConverter.CONVERTER_KEY, "atLeast", "v", "z", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "A", "c", "", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "close", "X", "(Lio/ktor/utils/io/f;J)J", "u", "Z", "e", "autoFlush", "Lll0/j;", Gender.NONE, "()Lll0/j;", "writable", "Lll0/k;", "getReadable", "()Lll0/k;", "readable", "Lio/ktor/utils/io/internal/a;", "Lio/ktor/utils/io/internal/a;", "slot", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "f", "Ljava/lang/Object;", "flushMutex", "flushBuffer", Gender.OTHER, "isCancelled", "<anonymous parameter 0>", "K", "setClosed", "(Z)V", "closed", "a", "()I", "availableForRead", "J", "availableForWrite", "o", "isClosedForRead", "h", "()Ljava/lang/Throwable;", "setClosedCause", "(Ljava/lang/Throwable;)V", "closedCause", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class f implements io.ktor.utils.io.c, io.ktor.utils.io.g, io.ktor.utils.io.j, s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f78639h = AtomicLongFieldUpdater.newUpdater(f.class, "_totalBytesRead");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f78640i = AtomicLongFieldUpdater.newUpdater(f.class, "_totalBytesWritten");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f78641j = AtomicIntegerFieldUpdater.newUpdater(f.class, "_availableForRead");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f78642k = AtomicIntegerFieldUpdater.newUpdater(f.class, "channelSize");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78643l = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_closed");
    private volatile /* synthetic */ int _availableForRead;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _lastReadView;
    private volatile /* synthetic */ long _totalBytesRead;
    private volatile /* synthetic */ long _totalBytesWritten;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean autoFlush;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ll0.j writable;
    private volatile /* synthetic */ int channelSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ll0.k readable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final io.ktor.utils.io.internal.a slot;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object flushMutex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ll0.j flushBuffer;
    private volatile /* synthetic */ int lastReadAvailable$delegate;
    private volatile /* synthetic */ Object lastReadView$delegate;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {88}, m = "awaitAtLeastNBytesAvailableForRead$ktor_io", n = {"this", "count"}, s = {"L$0", "I$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78650n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f78651o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78652p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78654r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78652p = obj;
            this.f78654r |= Integer.MIN_VALUE;
            return f.this.x(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f78656d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(0);
            this.f78656d = i11;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(f.this.get_availableForRead() < this.f78656d && !f.this.o());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {81}, m = "awaitAtLeastNBytesAvailableForWrite$ktor_io", n = {"this", "count"}, s = {"L$0", "I$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78657n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f78658o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78659p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78661r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78659p = obj;
            this.f78661r |= Integer.MIN_VALUE;
            return f.this.y(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f78663d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(0);
            this.f78663d = i11;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(f.this.J() < this.f78663d && !f.this.K());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {611}, m = "awaitSuspend", n = {"this", "atLeast"}, s = {"L$0", "I$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78664n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f78665o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78666p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78668r;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78666p = obj;
            this.f78668r |= Integer.MIN_VALUE;
            return f.this.A(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"io/ktor/utils/io/f$f", "Lio/ktor/utils/io/x;", "", "min", "Lml0/a;", "a", "(I)Lml0/a;", "n", "Ljn0/h0;", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1675f implements x {
        C1675f() {
        }

        @Override // io.ktor.utils.io.v
        public ml0.a a(int min) {
            if (f.this.J() == 0) {
                return null;
            }
            return f.this.getWritable().u0(min);
        }

        @Override // io.ktor.utils.io.x
        public Object b(int i11, Continuation<? super h0> continuation) {
            if (f.this.J() >= i11) {
                return h0.f84049a;
            }
            Object objY = f.this.y(i11, continuation);
            return objY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objY : h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {673}, m = "discardSuspend", n = {"this", "max", "discarded"}, s = {"L$0", "J$0", "J$1"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78670n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f78671o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f78672p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f78673q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f78675s;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78673q = obj;
            this.f78675s |= Integer.MIN_VALUE;
            return f.this.D(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {486}, m = "readAvailable$ktor_io", n = {"this", "dst"}, s = {"L$0", "L$1"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78676n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78677o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78678p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78680r;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78678p = obj;
            this.f78680r |= Integer.MIN_VALUE;
            return f.this.Q(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {530}, m = "readAvailable$suspendImpl", n = {"$this", "dst", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78681n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78682o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78683p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78684q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f78685r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f78687t;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78685r = obj;
            this.f78687t |= Integer.MIN_VALUE;
            return f.S(f.this, null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {425}, m = "readRemainingSuspend", n = {"this", "builder", "limit"}, s = {"L$0", "L$1", "J$0"})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78688n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78689o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f78690p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f78691q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f78693s;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78691q = obj;
            this.f78693s |= Integer.MIN_VALUE;
            return f.this.U(null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {193}, m = "writeFully$suspendImpl", n = {"$this", "src"}, s = {"L$0", "L$1"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78694n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78695o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78696p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78698r;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78696p = obj;
            this.f78698r |= Integer.MIN_VALUE;
            return f.Y(f.this, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE}, m = "writeFully$suspendImpl", n = {"$this", "src", "currentIndex", "endIndex"}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78699n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78700o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78701p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78702q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f78703r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f78705t;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78703r = obj;
            this.f78705t |= Integer.MIN_VALUE;
            return f.Z(f.this, null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {186}, m = "writePacket$suspendImpl", n = {"$this", "packet"}, s = {"L$0", "L$1"})
    static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78706n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78707o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78708p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78710r;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78708p = obj;
            this.f78710r |= Integer.MIN_VALUE;
            return f.a0(f.this, null, this);
        }
    }

    private final void B() {
        ml0.a aVarM = M();
        int lastReadAvailable$delegate = getLastReadAvailable$delegate() - (aVarM.getWritePosition() - aVarM.getReadPosition());
        if (M() != ll0.a.INSTANCE.a()) {
            ml0.f.a(this.readable, M());
        }
        if (lastReadAvailable$delegate > 0) {
            t(lastReadAvailable$delegate);
        }
        V(0);
        W(ml0.a.INSTANCE.a());
    }

    static /* synthetic */ Object C(f fVar, long j11, Continuation<? super Long> continuation) throws Throwable {
        long jH = fVar.readable.H(j11);
        fVar.t((int) jH);
        if (jH != j11 && !fVar.o()) {
            return fVar.D(j11, jH, continuation);
        }
        fVar.F();
        return Boxing.boxLong(jH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2.o() == false) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r9, long r11, p013kotlin.coroutines.Continuation<? super java.lang.Long> r13) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.f.g
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.f$g r0 = (io.ktor.utils.io.f.g) r0
            int r1 = r0.f78675s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78675s = r1
            goto L18
        L13:
            io.ktor.utils.io.f$g r0 = new io.ktor.utils.io.f$g
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f78673q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78675s
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            long r9 = r0.f78672p
            long r11 = r0.f78671o
            java.lang.Object r2 = r0.f78670n
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            jn0.t.b(r13)
            r6 = r11
            r11 = r9
            r9 = r6
            goto L4f
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            jn0.t.b(r13)
            r2 = r8
        L40:
            r0.f78670n = r2
            r0.f78671o = r9
            r0.f78672p = r11
            r0.f78675s = r3
            java.lang.Object r13 = r2.v(r3, r0)
            if (r13 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L6e
            ll0.k r13 = r2.readable
            long r4 = r9 - r11
            long r4 = r13.H(r4)
            int r13 = (int) r4
            r2.t(r13)
            long r11 = r11 + r4
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 >= 0) goto L6e
            boolean r13 = r2.o()
            if (r13 == 0) goto L40
        L6e:
            r2.F()
            java.lang.Long r9 = p013kotlin.coroutines.jvm.internal.Boxing.boxLong(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.D(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void E() throws Throwable {
        if (K()) {
            Throwable thH = h();
            if (thH != null) {
                throw thH;
            }
            throw new ClosedWriteChannelException("Channel " + this + " is already closed");
        }
    }

    private final void F() throws Throwable {
        Throwable thH = h();
        if (thH != null) {
            throw thH;
        }
    }

    private final void G(ll0.j closeable) throws Throwable {
        Throwable thH = h();
        if (thH == null) {
            return;
        }
        closeable.release();
        throw thH;
    }

    private final boolean H() {
        if (this.writable.Y0()) {
            this.slot.c();
            return false;
        }
        I();
        this.slot.c();
        return true;
    }

    private final void I() {
        synchronized (this.flushMutex) {
            int iU0 = this.writable.U0();
            ml0.a aVarY0 = this.writable.y0();
            p013kotlin.jvm.internal.s.h(aVarY0);
            this.flushBuffer.z0(aVarY0);
            f78641j.addAndGet(this, iU0);
        }
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    private final int getLastReadAvailable$delegate() {
        return this.lastReadAvailable$delegate;
    }

    private final ml0.a M() {
        return (ml0.a) this.lastReadView$delegate;
    }

    private final boolean O() {
        n nVar = (n) this._closed;
        return (nVar != null ? nVar.getCause() : null) != null;
    }

    static /* synthetic */ Object R(f fVar, ml0.a aVar, Continuation<? super Integer> continuation) {
        p013kotlin.jvm.internal.s.i(aVar, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
        return fVar.Q(aVar, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object S(f fVar, byte[] bArr, int i11, int i12, Continuation<? super Integer> continuation) throws Throwable {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i13 = iVar.f78687t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f78687t = i13 - Integer.MIN_VALUE;
            } else {
                iVar = fVar.new i(continuation);
            }
        } else {
            iVar = fVar.new i(continuation);
        }
        Object obj = iVar.f78685r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = iVar.f78687t;
        if (i14 == 0) {
            jn0.t.b(obj);
            Throwable thH = fVar.h();
            if (thH != null) {
                throw thH;
            }
            if (fVar.K() && fVar.get_availableForRead() == 0) {
                return Boxing.boxInt(-1);
            }
            if (i12 == 0) {
                return Boxing.boxInt(0);
            }
            if (fVar.get_availableForRead() == 0) {
                iVar.f78681n = fVar;
                iVar.f78682o = bArr;
                iVar.f78683p = i11;
                iVar.f78684q = i12;
                iVar.f78687t = 1;
                if (fVar.A(1, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = iVar.f78684q;
            i11 = iVar.f78683p;
            bArr = (byte[]) iVar.f78682o;
            fVar = (f) iVar.f78681n;
            jn0.t.b(obj);
        }
        if (!fVar.readable.t()) {
            fVar.P();
        }
        int iMin = (int) Math.min(i12, fVar.readable.J0());
        ll0.p.c(fVar.readable, bArr, i11, iMin);
        fVar.t(iMin);
        return Boxing.boxInt(iMin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object T(f fVar, long j11, Continuation<? super ll0.k> continuation) throws Throwable {
        fVar.F();
        ll0.j jVar = new ll0.j(null, 1, 0 == true ? 1 : 0);
        long jMin = Math.min(j11, fVar.readable.J0());
        jVar.G0(fVar.readable, jMin);
        fVar.t((int) jMin);
        if (j11 - ((long) jVar.U0()) != 0 && !fVar.o()) {
            return fVar.U(jVar, j11, continuation);
        }
        fVar.G(jVar);
        return jVar.T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(ll0.j jVar, long j11, Continuation<? super ll0.k> continuation) throws Throwable {
        j jVar2;
        f fVar;
        if (continuation instanceof j) {
            jVar2 = (j) continuation;
            int i11 = jVar2.f78693s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar2.f78693s = i11 - Integer.MIN_VALUE;
            } else {
                jVar2 = new j(continuation);
            }
        } else {
            jVar2 = new j(continuation);
        }
        Object obj = jVar2.f78691q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar2.f78693s;
        if (i12 == 0) {
            jn0.t.b(obj);
            fVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j12 = jVar2.f78690p;
            ll0.j jVar3 = (ll0.j) jVar2.f78689o;
            fVar = (f) jVar2.f78688n;
            jn0.t.b(obj);
            jVar = jVar3;
            j11 = j12;
        }
        while (jVar.U0() < j11) {
            long jMin = Math.min(j11 - ((long) jVar.U0()), fVar.readable.J0());
            jVar.G0(fVar.readable, jMin);
            fVar.t((int) jMin);
            fVar.G(jVar);
            if (fVar.o() || jVar.U0() == ((int) j11)) {
                break;
            }
            jVar2.f78688n = fVar;
            jVar2.f78689o = jVar;
            jVar2.f78690p = j11;
            jVar2.f78693s = 1;
            if (fVar.A(1, jVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        fVar.G(jVar);
        return jVar.T0();
    }

    private final void V(int i11) {
        this.lastReadAvailable$delegate = i11;
    }

    private final void W(ml0.a aVar) {
        this.lastReadView$delegate = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object Y(f fVar, ll0.a aVar, Continuation<? super h0> continuation) throws Throwable {
        k kVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f78698r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f78698r = i11 - Integer.MIN_VALUE;
            } else {
                kVar = fVar.new k(continuation);
            }
        } else {
            kVar = fVar.new k(continuation);
        }
        Object obj = kVar.f78696p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar.f78698r;
        if (i12 == 0) {
            jn0.t.b(obj);
            kVar.f78694n = fVar;
            kVar.f78695o = aVar;
            kVar.f78698r = 1;
            if (fVar.y(1, kVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (ll0.a) kVar.f78695o;
            fVar = (f) kVar.f78694n;
            jn0.t.b(obj);
        }
        int writePosition = aVar.getWritePosition() - aVar.getReadPosition();
        ll0.s.c(fVar.writable, aVar, 0, 2, null);
        fVar.u(writePosition);
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static /* synthetic */ java.lang.Object Z(io.ktor.utils.io.f r5, byte[] r6, int r7, int r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.f.l
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.f$l r0 = (io.ktor.utils.io.f.l) r0
            int r1 = r0.f78705t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78705t = r1
            goto L18
        L13:
            io.ktor.utils.io.f$l r0 = new io.ktor.utils.io.f$l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f78703r
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78705t
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r5 = r0.f78702q
            int r6 = r0.f78701p
            java.lang.Object r7 = r0.f78700o
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.f78699n
            io.ktor.utils.io.f r8 = (io.ktor.utils.io.f) r8
            jn0.t.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L5c
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            jn0.t.b(r9)
            int r8 = r8 + r7
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r4
        L49:
            if (r8 >= r5) goto L70
            r0.f78699n = r6
            r0.f78700o = r7
            r0.f78701p = r8
            r0.f78702q = r5
            r0.f78705t = r3
            java.lang.Object r9 = r6.y(r3, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            int r9 = r6.J()
            int r2 = r5 - r8
            int r9 = java.lang.Math.min(r9, r2)
            ll0.j r2 = r6.writable
            ll0.s.b(r2, r7, r8, r9)
            int r8 = r8 + r9
            r6.u(r9)
            goto L49
        L70:
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.Z(io.ktor.utils.io.f, byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object a0(f fVar, ll0.k kVar, Continuation<? super h0> continuation) throws Throwable {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f78710r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f78710r = i11 - Integer.MIN_VALUE;
            } else {
                mVar = fVar.new m(continuation);
            }
        } else {
            mVar = fVar.new m(continuation);
        }
        Object obj = mVar.f78708p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mVar.f78710r;
        if (i12 == 0) {
            jn0.t.b(obj);
            mVar.f78706n = fVar;
            mVar.f78707o = kVar;
            mVar.f78710r = 1;
            if (fVar.y(1, mVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (ll0.k) mVar.f78707o;
            fVar = (f) mVar.f78706n;
            jn0.t.b(obj);
        }
        int iJ0 = (int) kVar.J0();
        fVar.writable.D0(kVar);
        fVar.u(iJ0);
        return h0.f84049a;
    }

    private final void r(int count) {
        if (count < 0) {
            throw new IllegalArgumentException(("Can't read negative amount of bytes: " + count).toString());
        }
        int i11 = -count;
        f78642k.getAndAdd(this, i11);
        f78639h.addAndGet(this, count);
        f78641j.getAndAdd(this, i11);
        if (this.channelSize < 0) {
            throw new IllegalStateException(("Readable bytes count is negative: " + get_availableForRead() + ", " + count + " in " + this).toString());
        }
        if (get_availableForRead() >= 0) {
            return;
        }
        throw new IllegalStateException(("Readable bytes count is negative: " + get_availableForRead() + ", " + count + " in " + this).toString());
    }

    private final void s(int count) {
        if (count < 0) {
            throw new IllegalArgumentException(("Can't write negative amount of bytes: " + count).toString());
        }
        f78642k.getAndAdd(this, count);
        f78640i.addAndGet(this, count);
        if (this.channelSize >= 0) {
            return;
        }
        throw new IllegalStateException(("Readable bytes count is negative: " + this.channelSize + ", " + count + " in " + this).toString());
    }

    static /* synthetic */ Object w(f fVar, int i11, Continuation<? super Boolean> continuation) {
        if (i11 < 0) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be negative: " + i11).toString());
        }
        long j11 = i11;
        if (j11 <= 4088) {
            fVar.B();
            if (i11 == 0) {
                return Boxing.boxBoolean(!fVar.o());
            }
            return fVar.readable.J0() >= j11 ? Boxing.boxBoolean(true) : fVar.A(i11, continuation);
        }
        throw new IllegalArgumentException(("atLeast parameter shouldn't be larger than max buffer size of 4088: " + i11).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    protected final Object A(int i11, Continuation<? super Boolean> continuation) throws Throwable {
        e eVar;
        f fVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f78668r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f78668r = i12 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f78666p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = eVar.f78668r;
        if (i13 == 0) {
            jn0.t.b(obj);
            if (i11 < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            eVar.f78664n = this;
            eVar.f78665o = i11;
            eVar.f78668r = 1;
            if (x(i11, eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            fVar = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = eVar.f78665o;
            fVar = (f) eVar.f78664n;
            jn0.t.b(obj);
        }
        fVar.P();
        Throwable thH = fVar.h();
        if (thH == null) {
            return Boxing.boxBoolean(!fVar.o() && fVar.get_availableForRead() >= i11);
        }
        throw thH;
    }

    public int J() {
        return Math.max(0, 4088 - this.channelSize);
    }

    protected final boolean K() {
        return this._closed != null;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    protected final ll0.j getWritable() {
        return this.writable;
    }

    protected final void P() {
        synchronized (this.flushMutex) {
            ml0.f.e(this.readable, this.flushBuffer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(ll0.a aVar, Continuation<? super Integer> continuation) throws Throwable {
        h hVar;
        f fVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f78680r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f78680r = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object obj = hVar.f78678p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f78680r;
        if (i12 == 0) {
            jn0.t.b(obj);
            Throwable thH = h();
            if (thH != null) {
                throw thH;
            }
            if (K() && get_availableForRead() == 0) {
                return Boxing.boxInt(-1);
            }
            if (aVar.getLimit() - aVar.getWritePosition() == 0) {
                return Boxing.boxInt(0);
            }
            if (get_availableForRead() == 0) {
                hVar.f78676n = this;
                hVar.f78677o = aVar;
                hVar.f78680r = 1;
                if (A(1, hVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            fVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (ll0.a) hVar.f78677o;
            fVar = (f) hVar.f78676n;
            jn0.t.b(obj);
        }
        if (!fVar.readable.t()) {
            fVar.P();
        }
        int iMin = (int) Math.min(aVar.getLimit() - aVar.getWritePosition(), fVar.readable.J0());
        ll0.p.b(fVar.readable, aVar, iMin);
        fVar.t(iMin);
        return Boxing.boxInt(iMin);
    }

    public final long X(f dst, long limit) throws Throwable {
        p013kotlin.jvm.internal.s.k(dst, "dst");
        long jJ0 = this.readable.J0();
        if (jJ0 > limit) {
            return 0L;
        }
        dst.writable.D0(this.readable);
        int i11 = (int) jJ0;
        dst.u(i11);
        t(i11);
        return jJ0;
    }

    @Override // io.ktor.utils.io.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public int get_availableForRead() {
        return this._availableForRead;
    }

    @Override // io.ktor.utils.io.g
    public Object b(ml0.a aVar, Continuation<? super Integer> continuation) {
        return R(this, aVar, continuation);
    }

    @Override // io.ktor.utils.io.g
    public Object c(long j11, Continuation<? super Long> continuation) {
        return C(this, j11, continuation);
    }

    @Override // io.ktor.utils.io.g
    public boolean cancel(Throwable cause) {
        if (h() != null || K()) {
            return false;
        }
        if (cause == null) {
            cause = new CancellationException("Channel cancelled");
        }
        return close(cause);
    }

    @Override // io.ktor.utils.io.j
    public boolean close(Throwable cause) {
        if (!androidx.concurrent.futures.b.a(f78643l, this, null, cause == null ? o.a() : new n(cause))) {
            return false;
        }
        if (cause != null) {
            this.readable.release();
            this.writable.release();
            this.flushBuffer.release();
        } else {
            flush();
            this.writable.release();
        }
        this.slot.b(cause);
        return true;
    }

    @Override // io.ktor.utils.io.s
    public void d(int written) throws Throwable {
        this.writable.n();
        u(written);
    }

    @Override // io.ktor.utils.io.j
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override // io.ktor.utils.io.j
    public void flush() {
        H();
    }

    @Override // io.ktor.utils.io.g
    public Object g(long j11, Continuation<? super ll0.k> continuation) {
        return T(this, j11, continuation);
    }

    @Override // io.ktor.utils.io.g
    public final Throwable h() {
        n nVar = (n) this._closed;
        if (nVar != null) {
            return nVar.getCause();
        }
        return null;
    }

    @Override // io.ktor.utils.io.g
    public Object i(byte[] bArr, int i11, int i12, Continuation<? super Integer> continuation) {
        return S(this, bArr, i11, i12, continuation);
    }

    @Override // io.ktor.utils.io.j
    public Object j(ll0.k kVar, Continuation<? super h0> continuation) {
        return a0(this, kVar, continuation);
    }

    @Override // io.ktor.utils.io.j
    public Object k(ll0.a aVar, Continuation<? super h0> continuation) {
        return Y(this, aVar, continuation);
    }

    @Override // io.ktor.utils.io.j
    public Object l(byte[] bArr, int i11, int i12, Continuation<? super h0> continuation) {
        return Z(this, bArr, i11, i12, continuation);
    }

    @Override // io.ktor.utils.io.s
    public x n() {
        return new C1675f();
    }

    @Override // io.ktor.utils.io.g
    public boolean o() {
        if (O()) {
            return true;
        }
        return K() && this.channelSize == 0;
    }

    protected final void t(int count) {
        r(count);
        this.slot.c();
    }

    protected final void u(int count) throws Throwable {
        s(count);
        if (K()) {
            this.writable.release();
            E();
        }
        if (getAutoFlush() || J() == 0) {
            flush();
        }
    }

    public Object v(int i11, Continuation<? super Boolean> continuation) {
        return w(this, i11, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(int i11, Continuation<? super h0> continuation) {
        a aVar;
        f fVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f78654r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f78654r = i12 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f78652p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = aVar.f78654r;
        if (i13 == 0) {
            jn0.t.b(obj);
            fVar = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = aVar.f78651o;
            fVar = (f) aVar.f78650n;
            jn0.t.b(obj);
        }
        while (fVar.get_availableForRead() < i11 && !fVar.o()) {
            io.ktor.utils.io.internal.a aVar2 = fVar.slot;
            b bVar = fVar.new b(i11);
            aVar.f78650n = fVar;
            aVar.f78651o = i11;
            aVar.f78654r = 1;
            if (aVar2.d(bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(int i11, Continuation<? super h0> continuation) {
        c cVar;
        f fVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f78661r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f78661r = i12 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f78659p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = cVar.f78661r;
        if (i13 == 0) {
            jn0.t.b(obj);
            fVar = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = cVar.f78658o;
            fVar = (f) cVar.f78657n;
            jn0.t.b(obj);
        }
        while (fVar.J() < i11 && !fVar.K()) {
            if (!fVar.H()) {
                io.ktor.utils.io.internal.a aVar = fVar.slot;
                d dVar = fVar.new d(i11);
                cVar.f78657n = fVar;
                cVar.f78658o = i11;
                cVar.f78661r = 1;
                if (aVar.d(dVar, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return h0.f84049a;
    }

    public final Object z(Continuation<? super Boolean> continuation) {
        return !this.readable.w0() ? Boxing.boxBoolean(true) : A(1, continuation);
    }
}
