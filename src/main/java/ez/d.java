package ez;

import android.content.Context;
import android.util.Log;
import androidx.camera.extensions.ExtensionsManager;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executor;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a<\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc0/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lx0/h;", "provider", "", "needsImageAnalysis", "", "extension", "", "extensionDebugName", "a", "(Lc0/p;Landroid/content/Context;Lx0/h;ZILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mrousavy.camera.core.extensions.CameraSelector_withExtensionKt", f = "CameraSelector+withExtension.kt", i = {0, 0, 0, 0}, l = {22}, m = "withExtension", n = {"$this$withExtension", "extensionDebugName", "needsImageAnalysis", "extension"}, s = {"L$0", "L$1", "Z$0", "I$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63467n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f63468o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f63469p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f63470q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f63471r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f63472s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63471r = obj;
            this.f63472s |= Integer.MIN_VALUE;
            return d.a(null, null, null, false, 0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c0.p pVar, Context context, x0.h hVar, boolean z11, int i11, String str, Continuation<? super c0.p> continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f63472s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f63472s = i12 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f63471r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = aVar.f63472s;
        if (i13 == 0) {
            t.b(objA);
            Log.i("CameraSelector", str + " is enabled, looking up vendor " + str + " extension...");
            Executor mainExecutor = androidx.core.content.b.getMainExecutor(context);
            s.j(mainExecutor, "getMainExecutor(...)");
            com.google.common.util.concurrent.s<ExtensionsManager> sVarC = ExtensionsManager.c(context, hVar);
            s.j(sVarC, "getInstanceAsync(...)");
            aVar.f63467n = pVar;
            aVar.f63468o = str;
            aVar.f63469p = z11;
            aVar.f63470q = i11;
            aVar.f63472s = 1;
            objA = h.a(sVarC, mainExecutor, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = aVar.f63470q;
            z11 = aVar.f63469p;
            str = (String) aVar.f63468o;
            pVar = (c0.p) aVar.f63467n;
            t.b(objA);
        }
        ExtensionsManager extensionsManager = (ExtensionsManager) objA;
        if (!extensionsManager.f(pVar, i11)) {
            return pVar;
        }
        if (z11 && !extensionsManager.g(pVar, i11)) {
            Log.i("CameraSelector", "Device supports a " + str + " vendor extension, but we cannot use it since we need ImageAnalysis and this extension does not work with ImageAnalysis use-cases.");
            return pVar;
        }
        Log.i("CameraSelector", "Device supports a " + str + " vendor extension! Enabling...");
        c0.p pVarB = extensionsManager.b(pVar, i11);
        s.j(pVarB, "getExtensionEnabledCameraSelector(...)");
        return pVarB;
    }
}
