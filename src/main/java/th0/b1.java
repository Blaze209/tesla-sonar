package th0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u0017\u0012B-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lth0/b1;", "Ly20/o;", "Lth0/b1$c;", "Lzf0/r0;", "selfieDirectionFeed", "Lth0/a1$b;", "pose", "", "captureOnPoseDetected", "Lfi0/c;", "sdkFilesManager", "<init>", "(Lzf0/r0;Lth0/a1$b;ZLfi0/c;)V", "Ldg0/c;", "", "h", "(Ldg0/c;Lth0/a1$b;)F", "otherWorker", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Lzf0/r0;", "c", "Lth0/a1$b;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lfi0/c;", "", "f", "I", "numRetries", "g", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b1 implements y20.o<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zf0.r0 selfieDirectionFeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a1.b pose;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean captureOnPoseDetected;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int numRetries;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lth0/b1$b;", "", "Lth0/a1$b;", "pose", "", "captureOnPoseDetected", "Lth0/b1;", "a", "(Lth0/a1$b;Z)Lth0/b1;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        b1 a(a1.b pose, boolean captureOnPoseDetected);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lth0/b1$c;", "", "<init>", "()V", "a", "c", "b", "Lth0/b1$c$a;", "Lth0/b1$c$b;", "Lth0/b1$c$c;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lth0/b1$c$a;", "Lth0/b1$c;", "Lth0/a1;", "selfie", "", "poseScore", "Ldg0/a;", "brightnessInfo", "<init>", "(Lth0/a1;FLdg0/a;)V", "a", "Lth0/a1;", "c", "()Lth0/a1;", "b", Gender.FEMALE, "()F", "Ldg0/a;", "()Ldg0/a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final a1 selfie;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final float poseScore;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final dg0.a brightnessInfo;

            public a(a1 a1Var, float f11, dg0.a aVar) {
                super(null);
                this.selfie = a1Var;
                this.poseScore = f11;
                this.brightnessInfo = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final dg0.a getBrightnessInfo() {
                return this.brightnessInfo;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final a1 getSelfie() {
                return this.selfie;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lth0/b1$c$b;", "Lth0/b1$c;", "", AnalyticsAttribute.Error, "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable error) {
                super(null);
                p013kotlin.jvm.internal.s.k(error, "error");
                this.error = error;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }
        }

        /* JADX INFO: renamed from: th0.b1$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lth0/b1$c$c;", "Lth0/b1$c;", "Ldg0/b;", AnalyticsAttribute.Error, "", "poseScore", "Ldg0/a;", "brightnessInfo", "<init>", "(Ldg0/b;FLdg0/a;)V", "a", "Ldg0/b;", "b", "()Ldg0/b;", Gender.FEMALE, "c", "()F", "Ldg0/a;", "()Ldg0/a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2421c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final dg0.b error;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final float poseScore;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final dg0.a brightnessInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2421c(dg0.b error, float f11, dg0.a aVar) {
                super(null);
                p013kotlin.jvm.internal.s.k(error, "error");
                this.error = error;
                this.poseScore = f11;
                this.brightnessInfo = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final dg0.a getBrightnessInfo() {
                return this.brightnessInfo;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final dg0.b getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113572a;

        static {
            int[] iArr = new int[a1.b.values().length];
            try {
                iArr[a1.b.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.b.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.b.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f113572a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements Flow<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f113573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1 f113574b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f113575a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b1 f113576b;

            /* JADX INFO: renamed from: th0.b1$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "SelfieAnalyzeWorker.kt", i = {0}, l = {89, 100}, m = "emit", n = {"$this$mapNotNull_u24lambda_u246"}, s = {"L$0"})
            public static final class C2422a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f113577n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f113578o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f113579p;

                public C2422a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f113577n = obj;
                    this.f113578o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, b1 b1Var) {
                this.f113575a = flowCollector;
                this.f113576b = b1Var;
            }

            /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
            
                if (r10.emit(r5, r0) == r1) goto L46;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v3, types: [kotlinx.coroutines.flow.FlowCollector] */
            /* JADX WARN: Type inference failed for: r10v4 */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r10v6 */
            /* JADX WARN: Type inference failed for: r10v7 */
            /* JADX WARN: Type inference failed for: r10v8 */
            /* JADX WARN: Type inference failed for: r10v9 */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, p013kotlin.coroutines.Continuation r10) {
                /*
                    Method dump skipped, instruction units count: 268
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: th0.b1.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(Flow flow, b1 b1Var) {
            this.f113573a = flow;
            this.f113574b = b1Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super c> flowCollector, Continuation continuation) {
            Object objCollect = this.f113573a.collect(new a(flowCollector, this.f113574b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    public b1(zf0.r0 selfieDirectionFeed, a1.b pose, boolean z11, fi0.c sdkFilesManager) {
        p013kotlin.jvm.internal.s.k(selfieDirectionFeed, "selfieDirectionFeed");
        p013kotlin.jvm.internal.s.k(pose, "pose");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.pose = pose;
        this.captureOnPoseDetected = z11;
        this.sdkFilesManager = sdkFilesManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float h(dg0.c cVar, a1.b bVar) {
        if (cVar.getFacesInFrame() != 1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i11 = d.f113572a[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) ? BitmapDescriptorFactory.HUE_RED : 1.0f - Math.min(Math.abs((15.0f - cVar.getFaceAngle()) / 15.0f), 1.0f);
            }
            if (i11 == 3) {
                return (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) ? BitmapDescriptorFactory.HUE_RED : 1.0f - Math.min(Math.abs(((-15.0f) - cVar.getFaceAngle()) / (-15.0f)), 1.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z11 = (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar()) ? false : true;
        boolean isFaceCentered = cVar.getIsFaceCentered();
        float fM = bo0.n.m((Math.abs(cVar.getFaceAngle()) - 10.0f) / 90.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float f11 = z11 ? 0.33f : 0.0f;
        if (isFaceCentered) {
            f11 += 0.17f;
        }
        return fM > BitmapDescriptorFactory.HUE_RED ? f11 + (fM * 0.5f) : f11;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        if (!(otherWorker instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) otherWorker;
        return b1Var.pose == this.pose && b1Var.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    @Override // y20.o
    public Flow<c> run() {
        return FlowKt.flowOn(new e(FlowKt.drop(this.selfieDirectionFeed, 1), this), Dispatchers.getDefault());
    }
}
