package zf0;

import android.graphics.Rect;
import android.media.Image;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u001e\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$H\u0096A¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lzf0/r0;", "Lcg0/a;", "Landroidx/camera/core/f$a;", "Lkotlinx/coroutines/flow/SharedFlow;", "Ldg0/c;", "Lbg0/a;", "Lzf0/v0;", "selfieProcessor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "resultFlow", "<init>", "(Lzf0/v0;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "", "requireStrictSelfie", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Z)V", "Lzf0/v0$c;", "pose", "e", "(Lzf0/v0$c;)V", "Landroidx/camera/core/n;", "imageProxy", "analyze", "(Landroidx/camera/core/n;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "b", "(Landroid/media/Image;I)V", "Landroid/graphics/Rect;", "rect", "previewRect", "a", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzf0/v0;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 implements cg0.a, androidx.camera.core.f.a, SharedFlow<dg0.c>, bg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 selfieProcessor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<dg0.c> resultFlow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$1", f = "SelfieDirectionFeed.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f128295n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ dg0.c f128297p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dg0.c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f128297p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return r0.this.new a(this.f128297p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f128295n;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow mutableSharedFlow = r0.this.resultFlow;
                dg0.c cVar = this.f128297p;
                this.f128295n = 1;
                if (mutableSharedFlow.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$2", f = "SelfieDirectionFeed.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f128298n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ dg0.c f128300p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(dg0.c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f128300p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return r0.this.new b(this.f128300p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f128298n;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow mutableSharedFlow = r0.this.resultFlow;
                dg0.c cVar = this.f128300p;
                this.f128298n = 1;
                if (mutableSharedFlow.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public r0(v0 selfieProcessor, MutableSharedFlow<dg0.c> resultFlow) {
        p013kotlin.jvm.internal.s.k(selfieProcessor, "selfieProcessor");
        p013kotlin.jvm.internal.s.k(resultFlow, "resultFlow");
        this.selfieProcessor = selfieProcessor;
        this.resultFlow = resultFlow;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }

    @Override // cg0.a
    public void a(Rect rect, Rect previewRect) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        p013kotlin.jvm.internal.s.k(previewRect, "previewRect");
        this.selfieProcessor.u(rect, previewRect);
    }

    @Override // androidx.camera.core.f.a
    public void analyze(androidx.camera.core.n imageProxy) throws Exception {
        p013kotlin.jvm.internal.s.k(imageProxy, "imageProxy");
        try {
            dg0.c cVarE = this.selfieProcessor.e(imageProxy);
            un0.a.a(imageProxy, null);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new a(cVarE, null), 3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(imageProxy, th2);
                throw th3;
            }
        }
    }

    @Override // bg0.a
    public void b(Image image, int rotationDegrees) throws Exception {
        p013kotlin.jvm.internal.s.k(image, "image");
        try {
            dg0.c cVarD = this.selfieProcessor.d(image, rotationDegrees);
            un0.a.a(image, null);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new b(cVarD, null), 3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(image, th2);
                throw th3;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super dg0.c> flowCollector, Continuation<?> continuation) {
        return this.resultFlow.collect(flowCollector, continuation);
    }

    public final void d(boolean requireStrictSelfie) {
        this.selfieProcessor.s(requireStrictSelfie);
    }

    public final void e(v0.c pose) {
        p013kotlin.jvm.internal.s.k(pose, "pose");
        this.selfieProcessor.t(pose);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<dg0.c> getReplayCache() {
        return this.resultFlow.getReplayCache();
    }
}
