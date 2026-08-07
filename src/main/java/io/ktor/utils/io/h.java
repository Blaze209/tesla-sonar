package io.ktor.utils.io;

import com.plaid.internal.EnumC4419g;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/j;", "dst", "", "limit", "b", "(Lio/ktor/utils/io/g;Lio/ktor/utils/io/j;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelJVMKt", f = "ByteReadChannelJVM.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_DARK_APPEARANCE_VALUE}, m = "copyToImpl", n = {"$this$copyToImpl", "dst", "buffer", "limit", "dstNeedsFlush", "copied", "$this$copyToImpl", "dst", "buffer", "limit", "dstNeedsFlush", "copied", "size"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "I$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78715n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78716o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f78717p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        long f78718q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f78719r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f78720s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f78721t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f78722u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f78723v;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78722u = obj;
            this.f78723v |= Integer.MIN_VALUE;
            return h.c(null, null, 0L, this);
        }
    }

    public static final Object b(g gVar, j jVar, long j11, Continuation<? super Long> continuation) {
        if (gVar == jVar) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j11 == 0) {
            return Boxing.boxLong(0L);
        }
        if ((gVar instanceof ByteBufferChannel) && (jVar instanceof ByteBufferChannel)) {
            return ((ByteBufferChannel) jVar).P((ByteBufferChannel) gVar, j11, null, continuation);
        }
        return ((gVar instanceof f) && (jVar instanceof f)) ? io.ktor.utils.io.internal.j.b((f) gVar, (f) jVar, Long.MAX_VALUE, continuation) : c(gVar, jVar, j11, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x008f A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:38:0x00e6, B:40:0x00ec, B:26:0x008f), top: B:55:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0040, B:30:0x00bb, B:32:0x00c4, B:47:0x00ff, B:21:0x0067), top: B:59:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:38:0x00e6, B:40:0x00ec, B:26:0x008f), top: B:55:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(io.ktor.utils.io.g r19, io.ktor.utils.io.j r20, long r21, p013kotlin.coroutines.Continuation<? super java.lang.Long> r23) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.c(io.ktor.utils.io.g, io.ktor.utils.io.j, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
