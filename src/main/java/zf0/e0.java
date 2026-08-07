package zf0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import cg0.ViewfinderInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.camera.analyzers.AnalysisError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u00020\u0006B\u001d\b\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0011H\u0001¢\u0006\u0004\b*\u0010+J$\u0010/\u001a\u00020.2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040,H\u0096A¢\u0006\u0004\b/\u00100R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00101R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00102R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lzf0/e0;", "Lcg0/a;", "Landroidx/camera/core/f$a;", "Lkotlinx/coroutines/flow/SharedFlow;", "Ljn0/s;", "Lzf0/q0;", "Lbg0/a;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "resultFlow", "<init>", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "Lzf0/i0;", "imageToAnalyze", "e", "(Lzf0/i0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzf0/q0$c;", "side", "", "Lzf0/e;", "rules", "Lag0/b;", "passiveAnalyzers", "Ljn0/h0;", "f", "(Lzf0/q0$c;Ljava/util/List;Ljava/util/List;)V", "Landroid/graphics/Rect;", "rect", "previewRect", "a", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroidx/camera/core/n;", "imageProxy", "analyze", "(Landroidx/camera/core/n;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "b", "(Landroid/media/Image;I)V", "Lzf0/b;", "analyzerResults", "g", "(Lzf0/i0;Ljava/util/List;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lzf0/q0$c;", "c", "Ljava/util/List;", "analyzers", DateTokenConverter.CONVERTER_KEY, "Lcg0/c;", "Lcg0/c;", "viewfinderInfo", "getReplayCache", "()Ljava/util/List;", "replayCache", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 implements cg0.a, androidx.camera.core.f.a, SharedFlow<jn0.s<? extends q0>>, bg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<jn0.s<q0>> resultFlow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private q0.c side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<? extends ag0.b> analyzers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<? extends ag0.b> passiveAnalyzers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ViewfinderInfo viewfinderInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.GovernmentIdFeed", f = "GovernmentIdFeed.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {91, 97}, m = "analyze-gIAlu-s", n = {"this", "imageToAnalyze", "results", "finalViewfinderRect", "this", "imageToAnalyze", "results", "finalViewfinderRect"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f128188n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f128189o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f128190p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f128191q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f128192r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f128193s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f128194t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f128196v;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128194t = obj;
            this.f128196v |= Integer.MIN_VALUE;
            Object objE = e0.this.e(null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : jn0.s.a(objE);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$4", f = "GovernmentIdFeed.kt", i = {}, l = {111, 113}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f128197n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f128198o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.n f128199p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ e0 f128200q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.camera.core.n nVar, e0 e0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f128199p = nVar;
            this.f128200q = e0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f128199p, this.f128200q, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L25;
         */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.AutoCloseable] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f128198o
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                jn0.t.b(r7)
                goto L61
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f128197n
                java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
                jn0.t.b(r7)     // Catch: java.lang.Throwable -> L29
                jn0.s r7 = (jn0.s) r7     // Catch: java.lang.Throwable -> L29
                java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L29
                goto L49
            L29:
                r7 = move-exception
                goto L64
            L2b:
                jn0.t.b(r7)
                androidx.camera.core.n r1 = r6.f128199p
                zf0.e0 r7 = r6.f128200q
                zf0.i0 r5 = zf0.l0.e(r1)     // Catch: java.lang.Throwable -> L29
                if (r5 != 0) goto L3e
                jn0.h0 r7 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L29
                un0.a.a(r1, r4)
                return r7
            L3e:
                r6.f128197n = r1     // Catch: java.lang.Throwable -> L29
                r6.f128198o = r3     // Catch: java.lang.Throwable -> L29
                java.lang.Object r7 = zf0.e0.c(r7, r5, r6)     // Catch: java.lang.Throwable -> L29
                if (r7 != r0) goto L49
                goto L60
            L49:
                un0.a.a(r1, r4)
                zf0.e0 r1 = r6.f128200q
                kotlinx.coroutines.flow.MutableSharedFlow r1 = zf0.e0.d(r1)
                jn0.s r7 = jn0.s.a(r7)
                r6.f128197n = r4
                r6.f128198o = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L61
            L60:
                return r0
            L61:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            L64:
                throw r7     // Catch: java.lang.Throwable -> L65
            L65:
                r0 = move-exception
                un0.a.a(r1, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zf0.e0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5", f = "GovernmentIdFeed.kt", i = {}, l = {120, 122}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f128201n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f128202o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Image f128203p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ e0 f128204q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f128205r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Image image, e0 e0Var, int i11, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f128203p = image;
            this.f128204q = e0Var;
            this.f128205r = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f128203p, this.f128204q, this.f128205r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.flow.MutableSharedFlow] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Exception {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f128202o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L5b
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f128201n
                java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
                jn0.t.b(r6)     // Catch: java.lang.Throwable -> L28
                jn0.s r6 = (jn0.s) r6     // Catch: java.lang.Throwable -> L28
                java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L28
                goto L42
            L28:
                r6 = move-exception
                goto L5e
            L2a:
                jn0.t.b(r6)
                android.media.Image r1 = r5.f128203p
                zf0.e0 r6 = r5.f128204q
                int r4 = r5.f128205r
                zf0.i0 r4 = zf0.l0.d(r1, r4)     // Catch: java.lang.Throwable -> L28
                r5.f128201n = r1     // Catch: java.lang.Throwable -> L28
                r5.f128202o = r3     // Catch: java.lang.Throwable -> L28
                java.lang.Object r6 = zf0.e0.c(r6, r4, r5)     // Catch: java.lang.Throwable -> L28
                if (r6 != r0) goto L42
                goto L5a
            L42:
                r3 = 0
                un0.a.a(r1, r3)
                zf0.e0 r1 = r5.f128204q
                kotlinx.coroutines.flow.MutableSharedFlow r1 = zf0.e0.d(r1)
                jn0.s r6 = jn0.s.a(r6)
                r5.f128201n = r3
                r5.f128202o = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L5b
            L5a:
                return r0
            L5b:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            L5e:
                throw r6     // Catch: java.lang.Throwable -> L5f
            L5f:
                r0 = move-exception
                un0.a.a(r1, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zf0.e0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public e0(MutableSharedFlow<jn0.s<q0>> resultFlow) {
        p013kotlin.jvm.internal.s.k(resultFlow, "resultFlow");
        this.resultFlow = resultFlow;
        this.analyzers = p013kotlin.collections.v.m();
        this.passiveAnalyzers = p013kotlin.collections.v.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cd -> B:32:0x00d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010e -> B:40:0x0111). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(zf0.i0 r13, p013kotlin.coroutines.Continuation<? super jn0.s<? extends zf0.q0>> r14) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.e0.e(zf0.i0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [T, zf0.c0] */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, zf0.q0$c] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, zf0.g0] */
    /* JADX WARN: Type inference failed for: r10v18, types: [T, zf0.g] */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, zf0.h0] */
    private static final void h(p013kotlin.jvm.internal.j0 j0Var, p013kotlin.jvm.internal.n0<g> n0Var, p013kotlin.jvm.internal.n0<ImageIdMetadata> n0Var2, p013kotlin.jvm.internal.n0<q0.c> n0Var3, p013kotlin.jvm.internal.n0<ExtractedTexts> n0Var4, p013kotlin.jvm.internal.j0 j0Var2, p013kotlin.jvm.internal.n0<ImageLightCondition> n0Var5, com.withpersona.sdk2.camera.analyzers.a aVar, boolean z11) {
        com.withpersona.sdk2.camera.analyzers.a.b bVar = com.withpersona.sdk2.camera.analyzers.a.b.f57156a;
        if (!p013kotlin.jvm.internal.s.f(aVar, bVar) && z11) {
            j0Var.f86523a = true;
        }
        if (aVar instanceof com.withpersona.sdk2.camera.analyzers.a.C1154a) {
            if (n0Var.f86529a == null) {
                n0Var.f86529a = ((com.withpersona.sdk2.camera.analyzers.a.C1154a) aVar).getExtractedBarcode();
                return;
            }
            return;
        }
        if (aVar instanceof com.withpersona.sdk2.camera.analyzers.a.d) {
            n0Var2.f86529a = ((com.withpersona.sdk2.camera.analyzers.a.d) aVar).getCom.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String();
            return;
        }
        if (aVar instanceof com.withpersona.sdk2.camera.analyzers.a.c) {
            com.withpersona.sdk2.camera.analyzers.a.c cVar = (com.withpersona.sdk2.camera.analyzers.a.c) aVar;
            h(j0Var, n0Var, n0Var2, n0Var3, n0Var4, j0Var2, n0Var5, cVar.getFrontOrBackData(), z11);
            n0Var3.f86529a = cVar.getSide();
        } else if (aVar instanceof com.withpersona.sdk2.camera.analyzers.a.f) {
            n0Var4.f86529a = ((com.withpersona.sdk2.camera.analyzers.a.f) aVar).getExtractedTexts();
        } else if (p013kotlin.jvm.internal.s.f(aVar, bVar)) {
            j0Var2.f86523a = true;
        } else {
            if (!(aVar instanceof com.withpersona.sdk2.camera.analyzers.a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            n0Var5.f86529a = ((com.withpersona.sdk2.camera.analyzers.a.e) aVar).getImageLightCondition();
        }
    }

    @Override // cg0.a
    public void a(Rect rect, Rect previewRect) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        p013kotlin.jvm.internal.s.k(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }

    @Override // androidx.camera.core.f.a
    public void analyze(androidx.camera.core.n imageProxy) {
        p013kotlin.jvm.internal.s.k(imageProxy, "imageProxy");
        BuildersKt__BuildersKt.runBlocking$default(null, new b(imageProxy, this, null), 1, null);
    }

    @Override // bg0.a
    public void b(Image image, int rotationDegrees) {
        p013kotlin.jvm.internal.s.k(image, "image");
        BuildersKt__BuildersKt.runBlocking$default(null, new c(image, this, rotationDegrees, null), 1, null);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super jn0.s<? extends q0>> flowCollector, Continuation<?> continuation) {
        return this.resultFlow.collect(flowCollector, continuation);
    }

    public final void f(q0.c side, List<? extends e> rules, List<? extends ag0.b> passiveAnalyzers) {
        ag0.b gVar;
        p013kotlin.jvm.internal.s.k(side, "side");
        p013kotlin.jvm.internal.s.k(rules, "rules");
        p013kotlin.jvm.internal.s.k(passiveAnalyzers, "passiveAnalyzers");
        this.side = side;
        List<? extends e> list = rules;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (e eVar : list) {
            if (eVar instanceof e.BarcodePdf417Rule) {
                gVar = new com.withpersona.sdk2.camera.analyzers.b();
            } else if (eVar instanceof e.FrontOrBackRule) {
                gVar = new com.withpersona.sdk2.camera.analyzers.c(new com.withpersona.sdk2.camera.analyzers.d(), new com.withpersona.sdk2.camera.analyzers.b());
            } else if (eVar instanceof e.FrontRule) {
                gVar = new com.withpersona.sdk2.camera.analyzers.d();
            } else if (eVar instanceof e.MrzRule) {
                gVar = new com.withpersona.sdk2.camera.analyzers.f();
            } else {
                if (!(eVar instanceof e.TextExtractionRule)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = new com.withpersona.sdk2.camera.analyzers.g();
            }
            arrayList.add(gVar);
        }
        this.analyzers = arrayList;
        this.passiveAnalyzers = passiveAnalyzers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, zf0.q0$c] */
    public final Object g(i0 imageToAnalyze, List<AnalyzerResult> analyzerResults) {
        Throwable th2;
        p013kotlin.jvm.internal.s.k(imageToAnalyze, "imageToAnalyze");
        p013kotlin.jvm.internal.s.k(analyzerResults, "analyzerResults");
        if (analyzerResults.isEmpty()) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(new AnalysisError.NoAnalyzerError()));
        }
        p013kotlin.jvm.internal.j0 j0Var = new p013kotlin.jvm.internal.j0();
        p013kotlin.jvm.internal.j0 j0Var2 = new p013kotlin.jvm.internal.j0();
        p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        n0Var.f86529a = this.side;
        p013kotlin.jvm.internal.n0 n0Var2 = new p013kotlin.jvm.internal.n0();
        p013kotlin.jvm.internal.n0 n0Var3 = new p013kotlin.jvm.internal.n0();
        p013kotlin.jvm.internal.n0 n0Var4 = new p013kotlin.jvm.internal.n0();
        p013kotlin.jvm.internal.n0 n0Var5 = new p013kotlin.jvm.internal.n0();
        Iterator<T> it = analyzerResults.iterator();
        Throwable thE = null;
        loop0: while (true) {
            th2 = thE;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                AnalyzerResult analyzerResult = (AnalyzerResult) it.next();
                Object result = analyzerResult.getResult();
                if (jn0.s.h(result)) {
                    h(j0Var, n0Var3, n0Var2, n0Var, n0Var4, j0Var2, n0Var5, (com.withpersona.sdk2.camera.analyzers.a) result, analyzerResult.getIsActiveAnalyzer());
                }
                thE = jn0.s.e(result);
                if (thE == null || th2 != null || !analyzerResult.getIsActiveAnalyzer()) {
                }
            }
            j0Var2.f86523a = true;
        }
        if (j0Var2.f86523a) {
            if (th2 != null) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(th2));
            }
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            return jn0.s.b(new q0.None((ImageLightCondition) n0Var5.f86529a));
        }
        if (!j0Var.f86523a) {
            jn0.s.Companion companion4 = jn0.s.INSTANCE;
            return jn0.s.b(new q0.None((ImageLightCondition) n0Var5.f86529a));
        }
        q0.c cVar = (q0.c) n0Var.f86529a;
        if (cVar == null) {
            jn0.s.Companion companion5 = jn0.s.INSTANCE;
            return jn0.s.b(new q0.None((ImageLightCondition) n0Var5.f86529a));
        }
        Bitmap bitmapA = imageToAnalyze.a();
        if (bitmapA == null) {
            jn0.s.Companion companion6 = jn0.s.INSTANCE;
            return jn0.s.b(new q0.None((ImageLightCondition) n0Var5.f86529a));
        }
        jn0.s.Companion companion7 = jn0.s.INSTANCE;
        return jn0.s.b(new q0.ParsedIdSide(cVar, bitmapA, (ImageIdMetadata) n0Var2.f86529a, (g) n0Var3.f86529a, (ExtractedTexts) n0Var4.f86529a, (ImageLightCondition) n0Var5.f86529a));
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<jn0.s<? extends q0>> getReplayCache() {
        return this.resultFlow.getReplayCache();
    }
}
