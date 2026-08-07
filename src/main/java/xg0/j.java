package xg0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import e30.AlertContainerScreen;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import oh0.l1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import pg0.Frame;
import pg0.IdConfig;
import pg0.c4;
import pg0.d0;
import pg0.g3;
import pg0.g5;
import pg0.i4;
import pg0.m1;
import pg0.n1;
import y20.b0;
import zf0.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lxg0/j;", "", "Landroid/content/Context;", "applicationContext", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "Lii0/b;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lzf0/y$a;Lbg0/e$a;Lii0/b;)V", "Lpg0/g3$a;", "renderProps", "Lpg0/n1$e;", "renderState", "Ly20/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Ly20/k;", "Lpg0/n1;", "Lpg0/g3$b;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxg0/k;", "videoCaptureHelper", IntegerTokenConverter.CONVERTER_KEY, "(Lpg0/g3$a;Lpg0/n1$e;Ly20/k$a;Lxg0/k;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lzf0/y$a;", "c", "Lbg0/e$a;", DateTokenConverter.CONVERTER_KEY, "Lii0/b;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y.a cameraXControllerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bg0.e.a camera2ManagerFactoryFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ii0.b navigationStateManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123509n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ n1.FinalizeLocalVideoCapture f123510o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y20.k<g3.a, n1, g3.b, Object>.a f123511p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(n1.FinalizeLocalVideoCapture finalizeLocalVideoCapture, y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f123510o = finalizeLocalVideoCapture;
            this.f123511p = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 b(y20.r.c cVar) {
            Object objC = cVar.c();
            n1.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objC instanceof n1.FinalizeLocalVideoCapture ? (n1.FinalizeLocalVideoCapture) objC : null;
            if (finalizeLocalVideoCapture == null) {
                return h0.f84049a;
            }
            cVar.e(n1.FinalizeLocalVideoCapture.q(finalizeLocalVideoCapture, null, null, null, null, 0, null, null, null, 0L, true, 511, null));
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f123510o, this.f123511p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f123509n;
            if (i11 == 0) {
                jn0.t.b(obj);
                long minDurationMs = this.f123510o.getMinDurationMs();
                this.f123509n = 1;
                if (DelayKt.delay(minDurationMs, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            this.f123511p.c().b(b0.c(null, new wn0.l() { // from class: xg0.i
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return j.a.b((y20.r.c) obj2);
                }
            }, 1, null));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public j(Context applicationContext, y.a cameraXControllerFactory, bg0.e.a camera2ManagerFactoryFactory, ii0.b navigationStateManager) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(cameraXControllerFactory, "cameraXControllerFactory");
        p013kotlin.jvm.internal.s.k(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        p013kotlin.jvm.internal.s.k(navigationStateManager, "navigationStateManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.navigationStateManager = navigationStateManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(List list, zf0.u uVar) {
        p013kotlin.jvm.internal.s.k(list, "<unused var>");
        p013kotlin.jvm.internal.s.k(uVar, "<unused var>");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(y20.k.a aVar) {
        aVar.c().b(b0.c(null, new wn0.l() { // from class: xg0.h
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j.l((y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(g3.b.C2176b.f102421a);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(y20.k.a aVar) {
        c4.N(aVar, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(n1.FinalizeLocalVideoCapture finalizeLocalVideoCapture, y20.k.a aVar, g3.a aVar2, k kVar, File file, zf0.u cameraProperties) {
        p013kotlin.jvm.internal.s.k(file, "file");
        p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
        List<d0> listK = finalizeLocalVideoCapture.k();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listK, 10));
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(((d0) it.next()).getSide());
        }
        d0.d dVar = d0.d.FRONT;
        boolean zContains = arrayList.contains(dVar);
        d0.d dVar2 = d0.d.BACK;
        boolean zContains2 = arrayList.contains(dVar2);
        String absolutePath = file.getAbsolutePath();
        p013kotlin.jvm.internal.s.j(absolutePath, "getAbsolutePath(...)");
        List listE = p013kotlin.collections.v.e(new Frame(absolutePath, "video/*"));
        if (zContains && zContains2) {
            dVar = d0.d.FRONT_AND_BACK;
        } else if (!zContains && zContains2) {
            dVar = dVar2;
        }
        c4.R(finalizeLocalVideoCapture, aVar, aVar2, new d0.GovernmentIdVideo(listE, dVar, finalizeLocalVideoCapture.getId().getIdClassKey(), d0.a.MANUAL), finalizeLocalVideoCapture.getId(), kVar, cameraProperties, (3584 & 128) != 0, (3584 & 256) != 0 ? finalizeLocalVideoCapture.j() : null, (3584 & 512) != 0 ? finalizeLocalVideoCapture.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? finalizeLocalVideoCapture.getCountryCode() : null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 p() {
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 q(j jVar, y20.k.a aVar, g3.a aVar2) {
        c4.P(jVar.applicationContext, aVar, aVar2, true);
        return h0.f84049a;
    }

    public final Object i(final g3.a renderProps, final n1.FinalizeLocalVideoCapture renderState, final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a context, final k videoCaptureHelper) {
        IdConfig.e side;
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(videoCaptureHelper, "videoCaptureHelper");
        context.a("finalize_delay", new a(renderState, context, null));
        i4 currentPart = renderState.getCurrentPart();
        i4.SideIdPart sideIdPart = currentPart instanceof i4.SideIdPart ? (i4.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.e.Front;
        }
        IdConfig.e eVar = side;
        IdConfig.IdSideConfig idSideConfigC = renderState.getId().c(eVar);
        String strG = c4.G(renderProps.getStrings(), eVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        g5.b.a aVar = g5.b.a.Disabled;
        wg0.e type = renderState.getId().getType();
        g5.d overlay = idSideConfigC.getOverlay();
        ii0.a aVarB = this.navigationStateManager.b();
        List listM = p013kotlin.collections.v.m();
        int partIndex = renderState.getPartIndex();
        wn0.l<Throwable, h0> lVarY = c4.y(context);
        boolean isDelayComplete = renderState.getIsDelayComplete();
        return new AlertContainerScreen(l1.c(m1.f(renderProps, strG, capturing, aVar, overlay, type, eVar, aVarB, (601882880 & 256) != 0 ? new wn0.p() { // from class: pg0.h1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return m1.h((List) obj, (zf0.u) obj2);
            }
        } : new wn0.p() { // from class: xg0.a
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return j.j((List) obj, (zf0.u) obj2);
            }
        }, new wn0.a() { // from class: xg0.b
            @Override // wn0.a
            public final Object invoke() {
                return j.k(context);
            }
        }, new wn0.a() { // from class: xg0.c
            @Override // wn0.a
            public final Object invoke() {
                return j.m(context);
            }
        }, false, listM, renderState, partIndex, this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, (131072 & 601882880) != 0 ? new wn0.p() { // from class: pg0.i1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return m1.i((List) obj, (zf0.u) obj2);
            }
        } : null, (262144 & 601882880) != 0 ? new wn0.l() { // from class: pg0.j1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m1.j((Throwable) obj);
            }
        } : new wn0.l() { // from class: xg0.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j.n((Throwable) obj);
            }
        }, lVarY, (1048576 & 601882880) != 0 ? fg0.a.None : fg0.a.Upload, (2097152 & 601882880) != 0, (4194304 & 601882880) != 0 ? false : true, (8388608 & 601882880) != 0 ? false : isDelayComplete, (16777216 & 601882880) != 0 ? new wn0.p() { // from class: pg0.k1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return m1.k((File) obj, (zf0.u) obj2);
            }
        } : new wn0.p() { // from class: xg0.e
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return j.o(renderState, context, renderProps, videoCaptureHelper, (File) obj, (zf0.u) obj2);
            }
        }, (33554432 & 601882880) != 0 ? new wn0.a() { // from class: pg0.l1
            @Override // wn0.a
            public final Object invoke() {
                return m1.l();
            }
        } : new wn0.a() { // from class: xg0.f
            @Override // wn0.a
            public final Object invoke() {
                return j.p();
            }
        }, new wn0.a() { // from class: xg0.g
            @Override // wn0.a
            public final Object invoke() {
                return j.q(this.f123502a, context, renderProps);
            }
        }, (134217728 & 601882880) != 0 ? renderProps.getImageCaptureCount() : 0, (268435456 & 601882880) != 0 ? null : null, (536870912 & 601882880) != 0 ? null : null, (601882880 & 1073741824) != 0 ? null : null)), null, 2, null);
    }
}
