package io.ktor.utils.io.jvm.javaio;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001\u0019\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lio/ktor/utils/io/jvm/javaio/d;", "Ljava/io/InputStream;", "Lkotlinx/coroutines/Job;", "parent", "Lio/ktor/utils/io/g;", "channel", "<init>", "(Lkotlinx/coroutines/Job;Lio/ktor/utils/io/g;)V", "", "available", "()I", "read", "", "b", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "([BII)I", "Ljn0/h0;", "close", "()V", "a", "Lio/ktor/utils/io/g;", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CompletableJob;", CoreConstants.CONTEXT_SCOPE_VALUE, "io/ktor/utils/io/jvm/javaio/d$a", "c", "Lio/ktor/utils/io/jvm/javaio/d$a;", "loop", DateTokenConverter.CONVERTER_KEY, "[B", "single", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final io.ktor.utils.io.g channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CompletableJob context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a loop;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private byte[] single;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"io/ktor/utils/io/jvm/javaio/d$a", "Lio/ktor/utils/io/jvm/javaio/a;", "Ljn0/h0;", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends io.ktor.utils.io.jvm.javaio.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f78813g;

        /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1", f = "Blocking.kt", i = {0, 0, 1}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 38}, m = "loop", n = {"this", "this_$iv", "this"}, s = {"L$0", "L$1", "L$0"})
        static final class C1680a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f78814n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f78815o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f78816p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f78818r;

            C1680a(Continuation<? super C1680a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f78816p = obj;
                this.f78818r |= Integer.MIN_VALUE;
                return a.this.h(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Job job, d dVar) {
            super(job);
            this.f78813g = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0061 A[PHI: r2 r10
          0x0061: PHI (r2v2 io.ktor.utils.io.jvm.javaio.d$a) = (r2v3 io.ktor.utils.io.jvm.javaio.d$a), (r2v8 io.ktor.utils.io.jvm.javaio.d$a) binds: [B:20:0x005e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r10v3 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x005e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        
            if (r10 == r1) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:25:0x0084). Please report as a decompilation issue!!! */
        @Override // io.ktor.utils.io.jvm.javaio.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object h(p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
            /*
                r9 = this;
                boolean r0 = r10 instanceof io.ktor.utils.io.jvm.javaio.d.a.C1680a
                if (r0 == 0) goto L13
                r0 = r10
                io.ktor.utils.io.jvm.javaio.d$a$a r0 = (io.ktor.utils.io.jvm.javaio.d.a.C1680a) r0
                int r1 = r0.f78818r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f78818r = r1
                goto L18
            L13:
                io.ktor.utils.io.jvm.javaio.d$a$a r0 = new io.ktor.utils.io.jvm.javaio.d$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f78816p
                java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f78818r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r2 = r0.f78814n
                io.ktor.utils.io.jvm.javaio.d$a r2 = (io.ktor.utils.io.jvm.javaio.d.a) r2
                jn0.t.b(r10)
                goto L84
            L30:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L38:
                java.lang.Object r2 = r0.f78815o
                io.ktor.utils.io.jvm.javaio.a r2 = (io.ktor.utils.io.jvm.javaio.a) r2
                java.lang.Object r2 = r0.f78814n
                io.ktor.utils.io.jvm.javaio.d$a r2 = (io.ktor.utils.io.jvm.javaio.d.a) r2
                jn0.t.b(r10)
                goto L61
            L44:
                jn0.t.b(r10)
                r10 = 0
                r2 = r9
            L49:
                r2.result = r10
                r0.f78814n = r2
                r0.f78815o = r2
                r0.f78818r = r4
                java.lang.Object r10 = io.ktor.utils.io.jvm.javaio.a.c(r2, r0)
                java.lang.Object r5 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r10 != r5) goto L5e
                p013kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
            L5e:
                if (r10 != r1) goto L61
                goto L83
            L61:
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.ByteArray"
                p013kotlin.jvm.internal.s.i(r10, r5)
                byte[] r10 = (byte[]) r10
                io.ktor.utils.io.jvm.javaio.d r5 = r2.f78813g
                io.ktor.utils.io.g r5 = io.ktor.utils.io.jvm.javaio.d.c(r5)
                int r6 = r2.getOffset()
                int r7 = r2.getLength()
                r0.f78814n = r2
                r8 = 0
                r0.f78815o = r8
                r0.f78818r = r3
                java.lang.Object r10 = r5.i(r10, r6, r7, r0)
                if (r10 != r1) goto L84
            L83:
                return r1
            L84:
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                r5 = -1
                if (r10 != r5) goto L49
                io.ktor.utils.io.jvm.javaio.d r0 = r2.f78813g
                kotlinx.coroutines.CompletableJob r0 = io.ktor.utils.io.jvm.javaio.d.n(r0)
                r0.complete()
                r2.d(r10)
                jn0.h0 r10 = jn0.h0.f84049a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.d.a.h(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public d(Job job, io.ktor.utils.io.g channel) {
        s.k(channel, "channel");
        this.channel = channel;
        this.context = JobKt.Job(job);
        this.loop = new a(job, this);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.channel.get_availableForRead();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            super.close();
            io.ktor.utils.io.i.a(this.channel);
            if (!this.context.isCompleted()) {
                Job.DefaultImpls.cancel$default((Job) this.context, (CancellationException) null, 1, (Object) null);
            }
            this.loop.k();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = this.single;
            if (bArr == null) {
                bArr = new byte[1];
                this.single = bArr;
            }
            int iM = this.loop.m(bArr, 0, 1);
            if (iM == -1) {
                return -1;
            }
            if (iM == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + iM + " bytes.").toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] b11, int off, int len) {
        a aVar;
        aVar = this.loop;
        s.h(b11);
        return aVar.m(b11, off, len);
    }
}
