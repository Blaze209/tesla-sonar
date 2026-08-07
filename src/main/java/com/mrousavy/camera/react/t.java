package com.mrousavy.camera.react;

import android.content.res.Resources;
import androidx.camera.view.PreviewView;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuation;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/mrousavy/camera/react/o;", "Lcom/facebook/react/bridge/ReadableMap;", "pointMap", "Ljn0/h0;", "a", "(Lcom/mrousavy/camera/react/o;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f45777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PreviewView f45778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f45779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f45780d;

        public a(CancellableContinuation cancellableContinuation, PreviewView previewView, double d11, double d12) {
            this.f45777a = cancellableContinuation;
            this.f45778b = previewView;
            this.f45779c = d11;
            this.f45780d = d12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f45777a.isCancelled()) {
                throw new CancellationException();
            }
            float f11 = Resources.getSystem().getDisplayMetrics().density;
            this.f45777a.resumeWith(jn0.s.b(this.f45778b.getMeteringPointFactory().b(((float) this.f45779c) * f11, ((float) this.f45780d) * f11)));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraView_FocusKt", f = "CameraView+Focus.kt", i = {0, 0, 0, 0}, l = {27, 18}, m = "focus", n = {"$this$focus", "previewView", "x", "y"}, s = {"L$0", "L$1", "D$0", "D$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f45781n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f45782o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f45783p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        double f45784q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f45785r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f45786s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45785r = obj;
            this.f45786s |= Integer.MIN_VALUE;
            return t.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (dz.t.b(r12, (c0.b1) r13, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.mrousavy.camera.react.o r12, com.facebook.react.bridge.ReadableMap r13, p013kotlin.coroutines.Continuation<? super jn0.h0> r14) throws dz.n0 {
        /*
            boolean r0 = r14 instanceof com.mrousavy.camera.react.t.b
            if (r0 == 0) goto L13
            r0 = r14
            com.mrousavy.camera.react.t$b r0 = (com.mrousavy.camera.react.t.b) r0
            int r1 = r0.f45786s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45786s = r1
            goto L18
        L13:
            com.mrousavy.camera.react.t$b r0 = new com.mrousavy.camera.react.t$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f45785r
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45786s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            jn0.t.b(r14)
            goto Lbb
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            java.lang.Object r12 = r0.f45782o
            androidx.camera.view.PreviewView r12 = (androidx.camera.view.PreviewView) r12
            java.lang.Object r12 = r0.f45781n
            com.mrousavy.camera.react.o r12 = (com.mrousavy.camera.react.o) r12
            jn0.t.b(r14)
            goto La1
        L41:
            jn0.t.b(r14)
            java.lang.String r14 = "x"
            double r8 = r13.getDouble(r14)
            java.lang.String r14 = "y"
            double r10 = r13.getDouble(r14)
            androidx.camera.view.PreviewView r7 = r12.getPreviewView()
            if (r7 == 0) goto Lbe
            boolean r13 = com.facebook.react.bridge.UiThreadUtil.isOnUiThread()
            if (r13 == 0) goto L73
            android.content.res.Resources r13 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            c0.c1 r14 = r7.getMeteringPointFactory()
            float r2 = (float) r8
            float r2 = r2 * r13
            float r4 = (float) r10
            float r4 = r4 * r13
            c0.b1 r13 = r14.b(r2, r4)
            goto La2
        L73:
            r0.f45781n = r12
            r0.f45782o = r7
            r0.f45783p = r8
            r0.f45784q = r10
            r0.f45786s = r4
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r13 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r6.<init>(r13, r4)
            r6.initCancellability()
            com.mrousavy.camera.react.t$a r5 = new com.mrousavy.camera.react.t$a
            r5.<init>(r6, r7, r8, r10)
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r5)
            java.lang.Object r14 = r6.getResult()
            java.lang.Object r13 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r14 != r13) goto L9e
            p013kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L9e:
            if (r14 != r1) goto La1
            goto Lba
        La1:
            r13 = r14
        La2:
            java.lang.String r14 = "runOnUiThreadAndWait(...)"
            p013kotlin.jvm.internal.s.j(r13, r14)
            c0.b1 r13 = (c0.b1) r13
            dz.j r12 = r12.getCameraSession()
            r14 = 0
            r0.f45781n = r14
            r0.f45782o = r14
            r0.f45786s = r3
            java.lang.Object r12 = dz.t.b(r12, r13, r0)
            if (r12 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            jn0.h0 r12 = jn0.h0.f84049a
            return r12
        Lbe:
            dz.n0 r12 = new dz.n0
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.react.t.a(com.mrousavy.camera.react.o, com.facebook.react.bridge.ReadableMap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
