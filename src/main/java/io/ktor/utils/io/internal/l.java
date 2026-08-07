package io.ktor.utils.io.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.ktor.utils.io.ByteBufferChannel;
import io.ktor.utils.io.x;
import java.nio.ByteBuffer;
import jn0.h0;
import jn0.t;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lio/ktor/utils/io/internal/l;", "Lio/ktor/utils/io/x;", "Lio/ktor/utils/io/a;", "channel", "<init>", "(Lio/ktor/utils/io/a;)V", "", "n", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Void;", "Ljn0/h0;", "g", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()V", "e", "min", "Lml0/a;", "a", "(I)Lml0/a;", "h", "(I)V", "b", "f", "I", "locked", "Lio/ktor/utils/io/a;", "current", "Ljava/nio/ByteBuffer;", "c", "Ljava/nio/ByteBuffer;", "byteBuffer", "Lml0/a;", "view", "Lio/ktor/utils/io/internal/i;", "Lio/ktor/utils/io/internal/i;", "ringBufferCapacity", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int locked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ByteBufferChannel current;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ByteBuffer byteBuffer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ml0.a view;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private i ringBufferCapacity;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.internal.WriteSessionImpl", f = "WriteSessionImpl.kt", i = {0}, l = {86}, m = "tryAwaitJoinSwitch", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78789n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f78790o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78792q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78790o = obj;
            this.f78792q |= Integer.MIN_VALUE;
            return l.this.g(0, this);
        }
    }

    public l(ByteBufferChannel channel) {
        s.k(channel, "channel");
        this.current = channel.u0();
        ml0.a.Companion companion = ml0.a.INSTANCE;
        this.byteBuffer = companion.a().getMemory();
        this.view = companion.a();
        this.ringBufferCapacity = this.current.Q().capacity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(int i11, Continuation<? super h0> continuation) throws Throwable {
        a aVar;
        l lVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f78792q;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f78792q = i12 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f78790o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = aVar.f78792q;
        if (i13 == 0) {
            t.b(obj);
            int i14 = this.locked;
            if (i14 > 0) {
                this.ringBufferCapacity.a(i14);
                this.locked = 0;
            }
            f();
            this.current.x0();
            this.current.K0();
            ByteBufferChannel byteBufferChannel = this.current;
            aVar.f78789n = this;
            aVar.f78792q = 1;
            if (byteBufferChannel.M0(i11, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lVar = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) aVar.f78789n;
            t.b(obj);
        }
        ByteBufferChannel byteBufferChannelU0 = lVar.current.u0();
        lVar.current = byteBufferChannelU0;
        ByteBuffer byteBufferF0 = byteBufferChannelU0.F0();
        if (byteBufferF0 != null) {
            lVar.byteBuffer = byteBufferF0;
            ml0.a aVarB = ll0.g.b(lVar.current.Q().backingBuffer, null, 2, null);
            lVar.view = aVarB;
            ll0.g.d(aVarB, lVar.byteBuffer);
            lVar.ringBufferCapacity = lVar.current.Q().capacity;
        }
        return h0.f84049a;
    }

    private final Void i(int n11) {
        if (n11 < 0) {
            throw new IllegalArgumentException("Written bytes count shouldn't be negative: " + n11);
        }
        throw new IllegalStateException("Unable to mark " + n11 + " bytes as written: only " + this.locked + " were pre-locked.");
    }

    @Override // io.ktor.utils.io.v
    public ml0.a a(int min) {
        int iN = this.locked + this.ringBufferCapacity.n(0);
        this.locked = iN;
        if (iN < min) {
            return null;
        }
        this.current.f0(this.byteBuffer, iN);
        if (this.byteBuffer.remaining() < min) {
            return null;
        }
        ll0.g.d(this.view, this.byteBuffer);
        return this.view;
    }

    @Override // io.ktor.utils.io.x
    public Object b(int i11, Continuation<? super h0> continuation) throws Throwable {
        if (this.current.getJoining() != null) {
            Object objG = g(i11, continuation);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : h0.f84049a;
        }
        int i12 = this.locked;
        if (i12 >= i11) {
            return h0.f84049a;
        }
        if (i12 > 0) {
            this.ringBufferCapacity.a(i12);
            this.locked = 0;
        }
        Object objM0 = this.current.M0(i11, continuation);
        return objM0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM0 : h0.f84049a;
    }

    public final void d() {
        ByteBufferChannel byteBufferChannelU0 = this.current.u0();
        this.current = byteBufferChannelU0;
        ByteBuffer byteBufferF0 = byteBufferChannelU0.F0();
        if (byteBufferF0 == null) {
            return;
        }
        this.byteBuffer = byteBufferF0;
        ml0.a aVarB = ll0.g.b(this.current.Q().backingBuffer, null, 2, null);
        this.view = aVarB;
        ll0.g.d(aVarB, this.byteBuffer);
        this.ringBufferCapacity = this.current.Q().capacity;
    }

    public final void e() {
        int i11 = this.locked;
        if (i11 > 0) {
            this.ringBufferCapacity.a(i11);
            this.locked = 0;
        }
        this.current.x0();
        this.current.K0();
    }

    public void f() {
        this.current.flush();
    }

    public void h(int n11) {
        int i11;
        if (n11 < 0 || n11 > (i11 = this.locked)) {
            i(n11);
            throw new KotlinNothingValueException();
        }
        this.locked = i11 - n11;
        this.current.N(this.byteBuffer, this.ringBufferCapacity, n11);
    }
}
