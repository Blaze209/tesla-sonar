package zf0;

import android.content.Context;
import androidx.camera.core.ImageCaptureException;
import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzf0/l;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "b", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f128227a = new l();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.CameraHelper", f = "CameraHelper.kt", i = {}, l = {13, 16, 20}, m = "unbind", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f128228n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f128230p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128228n = obj;
            this.f128230p |= Integer.MIN_VALUE;
            return l.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$2", f = "CameraHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f128231n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ x0.h f128232o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x0.h hVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f128232o = hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f128232o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f128231n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            try {
                this.f128232o.h();
            } catch (ImageCaptureException unused) {
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/google/common/util/concurrent/s;", "Lx0/h;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/google/common/util/concurrent/s;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$future$1", f = "CameraHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super com.google.common.util.concurrent.s<x0.h>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f128233n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f128234o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f128234o = context;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f128234o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f128233n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return x0.h.INSTANCE.b(this.f128234o);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.google.common.util.concurrent.s<x0.h>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final x0.h c(com.google.common.util.concurrent.s sVar) {
        return (x0.h) sVar.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zf0.l.a
            if (r0 == 0) goto L13
            r0 = r9
            zf0.l$a r0 = (zf0.l.a) r0
            int r1 = r0.f128230p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128230p = r1
            goto L18
        L13:
            zf0.l$a r0 = new zf0.l$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f128228n
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f128230p
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            jn0.t.b(r9)
            goto L7d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            jn0.t.b(r9)
            goto L69
        L3c:
            jn0.t.b(r9)
            goto L55
        L40:
            jn0.t.b(r9)
            kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()
            zf0.l$c r2 = new zf0.l$c
            r2.<init>(r8, r3)
            r0.f128230p = r6
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L55
            goto L7c
        L55:
            com.google.common.util.concurrent.s r9 = (com.google.common.util.concurrent.s) r9
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            zf0.k r2 = new zf0.k
            r2.<init>()
            r0.f128230p = r5
            java.lang.Object r9 = kotlinx.coroutines.InterruptibleKt.runInterruptible(r8, r2, r0)
            if (r9 != r1) goto L69
            goto L7c
        L69:
            x0.h r9 = (x0.h) r9
            kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
            zf0.l$b r2 = new zf0.l$b
            r2.<init>(r9, r3)
            r0.f128230p = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.l.b(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
