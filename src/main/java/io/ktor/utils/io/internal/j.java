package io.ktor.utils.io.internal;

import bo0.n;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/f;", "dst", "", "limit", "b", "(Lio/ktor/utils/io/f;Lio/ktor/utils/io/f;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {26, 31, 39}, m = "copyToSequentialImpl", n = {"$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "transferred"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$2"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78772n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78773o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f78774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        long f78775q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f78776r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f78777s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f78778t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78777s = obj;
            this.f78778t |= Integer.MIN_VALUE;
            return j.b(null, null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", i = {0, 0, 1, 1}, l = {60, 66}, m = "copyToTail", n = {"dst", "lastPiece", "lastPiece", "rc"}, s = {"L$0", "L$1", "L$0", "I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78779n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78780o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78781p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f78782q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78783r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78782q = obj;
            this.f78783r |= Integer.MIN_VALUE;
            return j.c(null, null, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d2 -> B:44:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ed -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(io.ktor.utils.io.f r18, io.ktor.utils.io.f r19, long r20, p013kotlin.coroutines.Continuation<? super java.lang.Long> r22) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.j.b(io.ktor.utils.io.f, io.ktor.utils.io.f, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [ml0.a] */
    /* JADX WARN: Type inference failed for: r9v17 */
    public static final Object c(io.ktor.utils.io.f fVar, io.ktor.utils.io.f fVar2, long j11, Continuation<? super Long> continuation) throws Throwable {
        b bVar;
        ml0.a aVarS2;
        Object objB;
        io.ktor.utils.io.f fVar3;
        int iIntValue;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f78783r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f78783r = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f78782q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f78783r;
        try {
            if (i12 == 0) {
                t.b(obj);
                aVarS2 = ml0.a.INSTANCE.c().S2();
                try {
                    aVarS2.u((int) n.k(j11, aVarS2.getCapacity()));
                    bVar.f78779n = fVar2;
                    bVar.f78780o = aVarS2;
                    bVar.f78783r = 1;
                    objB = fVar.b(aVarS2, bVar);
                    fVar3 = fVar2;
                    if (objB == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    fVar2 = aVarS2;
                    fVar2.E(ml0.a.INSTANCE.c());
                    throw th;
                }
            }
            if (i12 == 1) {
                ml0.a aVar = (ml0.a) bVar.f78780o;
                io.ktor.utils.io.f fVar4 = (io.ktor.utils.io.f) bVar.f78779n;
                t.b(obj);
                fVar3 = fVar4;
                objB = obj;
                aVarS2 = aVar;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iIntValue = bVar.f78781p;
                ml0.a aVar2 = (ml0.a) bVar.f78779n;
                t.b(obj);
                fVar2 = aVar2;
            }
            Long lBoxLong = Boxing.boxLong(iIntValue);
            fVar2.E(ml0.a.INSTANCE.c());
            return lBoxLong;
            iIntValue = ((Number) objB).intValue();
            if (iIntValue == -1) {
                ml0.a.Companion companion = ml0.a.INSTANCE;
                aVarS2.E(companion.c());
                Long lBoxLong2 = Boxing.boxLong(0L);
                aVarS2.E(companion.c());
                return lBoxLong2;
            }
            bVar.f78779n = aVarS2;
            bVar.f78780o = null;
            bVar.f78781p = iIntValue;
            bVar.f78783r = 2;
            if (fVar3.k(aVarS2, bVar) != coroutine_suspended) {
                fVar2 = aVarS2;
                Long lBoxLong3 = Boxing.boxLong(iIntValue);
                fVar2.E(ml0.a.INSTANCE.c());
                return lBoxLong3;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
