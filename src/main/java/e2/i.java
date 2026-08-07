package e2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.b2;
import p020r2.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Le2/i;", "", "<init>", "()V", "Ljn0/h0;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "animationJob", "", "<set-?>", "b", "Lr2/l1;", "c", "()F", DateTokenConverter.CONVERTER_KEY, "(F)V", "cursorAlpha", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AtomicReference<Job> animationJob = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l1 cursorAlpha = b2.a(BitmapDescriptorFactory.HUE_RED);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f61486n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f61487o;

        /* JADX INFO: renamed from: e2.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", i = {}, l = {69, 77, 79}, m = "invokeSuspend", n = {}, s = {})
        static final class C1260a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f61489n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Job f61490o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ i f61491p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1260a(Job job, i iVar, Continuation<? super C1260a> continuation) {
                super(2, continuation);
                this.f61490o = job;
                this.f61491p = iVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new C1260a(this.f61490o, this.f61491p, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x003a A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0014, B:21:0x003a, B:24:0x004a, B:13:0x0022), top: B:29:0x000c }] */
            /* JADX WARN: Code duplicated, block: B:23:0x0049  */
            /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0014, B:21:0x003a, B:24:0x004a, B:13:0x0022), top: B:29:0x000c }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:21:0x003a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f61489n
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r7) goto L26
                    if (r1 == r6) goto L22
                    if (r1 != r5) goto L1a
                    jn0.t.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L3a
                L18:
                    r9 = move-exception
                    goto L58
                L1a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L22:
                    jn0.t.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L4a
                L26:
                    jn0.t.b(r9)
                    goto L3a
                L2a:
                    jn0.t.b(r9)
                    kotlinx.coroutines.Job r9 = r8.f61490o
                    if (r9 == 0) goto L3a
                    r8.f61489n = r7
                    java.lang.Object r9 = kotlinx.coroutines.JobKt.cancelAndJoin(r9, r8)
                    if (r9 != r0) goto L3a
                    goto L57
                L3a:
                    e2.i r9 = r8.f61491p     // Catch: java.lang.Throwable -> L18
                    r1 = 1065353216(0x3f800000, float:1.0)
                    e2.i.b(r9, r1)     // Catch: java.lang.Throwable -> L18
                    r8.f61489n = r6     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L4a
                    goto L57
                L4a:
                    e2.i r9 = r8.f61491p     // Catch: java.lang.Throwable -> L18
                    e2.i.b(r9, r2)     // Catch: java.lang.Throwable -> L18
                    r8.f61489n = r5     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L3a
                L57:
                    return r0
                L58:
                    e2.i r0 = r8.f61491p
                    e2.i.b(r0, r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: e2.i.a.C1260a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((C1260a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = i.this.new a(continuation);
            aVar.f61487o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f61486n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return Boxing.boxBoolean(androidx.camera.view.i.a(i.this.animationJob, null, BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f61487o, null, null, new C1260a((Job) i.this.animationJob.getAndSet(null), i.this, null), 3, null)));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(float f11) {
        this.cursorAlpha.r(f11);
    }

    public final float c() {
        return this.cursorAlpha.d();
    }

    public final Object e(Continuation<? super jn0.h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : jn0.h0.f84049a;
    }
}
