package dz;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.camera.core.CameraControl;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz/j;", "Lc0/b1;", "meteringPoint", "Ljn0/h0;", "b", "(Ldz/j;Lc0/b1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mrousavy.camera.core.CameraSession_FocusKt", f = "CameraSession+Focus.kt", i = {}, l = {22}, m = "focus", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f61229n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f61230o;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61229n = obj;
            this.f61230o |= Integer.MIN_VALUE;
            return t.b(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @SuppressLint({"RestrictedApi"})
    public static final Object b(j jVar, c0.b1 b1Var, Continuation<? super jn0.h0> continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f61230o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f61230o = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f61229n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f61230o;
        try {
            if (i12 == 0) {
                jn0.t.b(objA);
                c0.i camera = jVar.getCamera();
                if (camera == null) {
                    throw new g();
                }
                c0.e0 e0VarB = new c0.e0.a(b1Var).b();
                p013kotlin.jvm.internal.s.j(e0VarB, "build(...)");
                if (!camera.c().j(e0VarB)) {
                    throw new m0();
                }
                List<c0.b1> listC = e0VarB.c();
                p013kotlin.jvm.internal.s.j(listC, "getMeteringPointsAf(...)");
                Log.i("CameraSession", "Focusing to " + p013kotlin.collections.v.y0(listC, null, null, null, 0, null, new wn0.l() { // from class: dz.s
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return t.c((c0.b1) obj);
                    }
                }, 31, null) + "...");
                com.google.common.util.concurrent.s<c0.f0> sVarG = camera.b().g(e0VarB);
                p013kotlin.jvm.internal.s.j(sVarG, "startFocusAndMetering(...)");
                ExecutorService executorServiceB = i.INSTANCE.b();
                aVar.f61230o = 1;
                objA = ez.h.a(sVarG, executorServiceB, aVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(objA);
            }
            if (((c0.f0) objA).c()) {
                Log.i("CameraSession", "Focused successfully!");
            } else {
                Log.i("CameraSession", "Focus failed.");
            }
            return jn0.h0.f84049a;
        } catch (CameraControl.OperationCanceledException unused) {
            throw new l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(c0.b1 b1Var) {
        return "(" + b1Var.c() + ", " + b1Var.d() + ")";
    }
}
