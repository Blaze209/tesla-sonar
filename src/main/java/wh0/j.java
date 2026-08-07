package wh0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import okhttp3.internal.http2.Http2Connection;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import th0.a1;
import th0.d2;
import th0.d6;
import th0.j2;
import th0.t6;
import th0.x1;
import wn0.l;
import wn0.p;
import y20.b0;
import y20.k;
import y20.r;
import zf0.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lwh0/j;", "", "Landroid/content/Context;", "applicationContext", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "Lii0/b;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lzf0/y$a;Lbg0/e$a;Lii0/b;)V", "Lth0/d6$b;", "renderProps", "Lth0/x1$e;", "renderState", "Ly20/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Ly20/k;", "Lth0/x1;", "Lth0/d6$c;", CoreConstants.CONTEXT_SCOPE_VALUE, "q", "(Lth0/d6$b;Lth0/x1$e;Ly20/k$a;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lzf0/y$a;", "c", "Lbg0/e$a;", DateTokenConverter.CONVERTER_KEY, "Lii0/b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f121870n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ x1.FinalizeLocalVideoCapture f121871o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ k<d6.Input, x1, d6.c, Object>.a f121872p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(x1.FinalizeLocalVideoCapture finalizeLocalVideoCapture, k<? super d6.Input, x1, ? extends d6.c, ? extends Object>.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f121871o = finalizeLocalVideoCapture;
            this.f121872p = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 b(r.c cVar) {
            Object objC = cVar.c();
            x1.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objC instanceof x1.FinalizeLocalVideoCapture ? (x1.FinalizeLocalVideoCapture) objC : null;
            if (finalizeLocalVideoCapture == null) {
                return h0.f84049a;
            }
            cVar.e(x1.FinalizeLocalVideoCapture.u(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null));
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f121871o, this.f121872p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f121870n;
            if (i11 == 0) {
                t.b(obj);
                long minDurationMs = this.f121871o.getMinDurationMs();
                this.f121870n = 1;
                if (DelayKt.delay(minDurationMs, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.f121872p.c().b(b0.c(null, new l() { // from class: wh0.i
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return j.a.b((r.c) obj2);
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
        s.k(applicationContext, "applicationContext");
        s.k(cameraXControllerFactory, "cameraXControllerFactory");
        s.k(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        s.k(navigationStateManager, "navigationStateManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.navigationStateManager = navigationStateManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(k.a aVar, File it) {
        s.k(it, "it");
        final ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        s.j(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new a1.SelfieVideo(absolutePath, a1.a.MANUAL));
        aVar.c().b(b0.c(null, new l() { // from class: wh0.h
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j.j(arrayList, (r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(List list, r.c action) {
        s.k(action, "$this$action");
        Object objC = action.c();
        x1.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objC instanceof x1.FinalizeLocalVideoCapture ? (x1.FinalizeLocalVideoCapture) objC : null;
        if (finalizeLocalVideoCapture == null) {
            return h0.f84049a;
        }
        action.e(x1.FinalizeLocalVideoCapture.u(finalizeLocalVideoCapture, v.P0(((x1) action.c()).q(), list), 0L, false, true, null, 0L, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(k.a aVar, final x1.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        aVar.c().b(b0.c(null, new l() { // from class: wh0.g
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j.l(finalizeLocalVideoCapture, (r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(x1.FinalizeLocalVideoCapture finalizeLocalVideoCapture, r.c action) {
        s.k(action, "$this$action");
        Object objC = action.c();
        x1.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = objC instanceof x1.FinalizeLocalVideoCapture ? (x1.FinalizeLocalVideoCapture) objC : null;
        if (finalizeLocalVideoCapture2 == null) {
            return h0.f84049a;
        }
        if (!finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            return h0.f84049a;
        }
        action.e(t6.y(action, ((x1) action.c()).q(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), t6.j(action, false)));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(k.a aVar) {
        t6.t(aVar, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(k.a aVar) {
        aVar.c().b(b0.c(null, new l() { // from class: wh0.f
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j.o((r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(r.c action) {
        s.k(action, "$this$action");
        action.d(d6.c.b.f113700a);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 p(j jVar, k.a aVar, d6.Input input) {
        t6.v(jVar.applicationContext, aVar, input, true);
        return h0.f84049a;
    }

    public final Object q(final d6.Input renderProps, final x1.FinalizeLocalVideoCapture renderState, final k<? super d6.Input, x1, ? extends d6.c, ? extends Object>.a context) {
        s.k(renderProps, "renderProps");
        s.k(renderState, "renderState");
        s.k(context, "context");
        context.a("finalize_delay", new a(renderState, context, null));
        return j2.e(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), (251658240 & 16) != 0 ? null : null, null, false, new d6.d.c.b.C2429c(new l() { // from class: wh0.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j.i(context, (File) obj);
            }
        }, new wn0.a() { // from class: wh0.b
            @Override // wn0.a
            public final Object invoke() {
                return j.k(context, renderState);
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? d6.d.c.EnumC2431c.COMPLETE : d6.d.c.EnumC2431c.FINALIZING, !s.f(renderProps.getSelfieType(), d2.b.f113623a)), t6.x(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new wn0.a() { // from class: wh0.c
            @Override // wn0.a
            public final Object invoke() {
                return j.m(context);
            }
        }, new wn0.a() { // from class: wh0.d
            @Override // wn0.a
            public final Object invoke() {
                return j.n(context);
            }
        }, t6.l(context), new wn0.a() { // from class: wh0.e
            @Override // wn0.a
            public final Object invoke() {
                return j.p(this.f121861a, context, renderProps);
            }
        }, fg0.a.Upload, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, BitmapDescriptorFactory.HUE_RED, null, renderState.getCameraFacingMode(), false, (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }
}
