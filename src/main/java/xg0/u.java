package xg0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import e30.AlertContainerScreen;
import java.io.File;
import java.util.List;
import jn0.h0;
import oh0.l1;
import p013kotlin.Metadata;
import pg0.IdConfig;
import pg0.c4;
import pg0.g3;
import pg0.g5;
import pg0.i4;
import pg0.m1;
import pg0.n1;
import y20.b0;
import zf0.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lxg0/u;", "", "Landroid/content/Context;", "applicationContext", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "Lii0/b;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lzf0/y$a;Lbg0/e$a;Lii0/b;)V", "Lpg0/g3$a;", "renderProps", "Lpg0/n1$f;", "renderState", "Ly20/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Ly20/k;", "Lpg0/n1;", "Lpg0/g3$b;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxg0/k;", "videoCaptureHelper", "j", "(Lpg0/g3$a;Lpg0/n1$f;Ly20/k$a;Lxg0/k;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lzf0/y$a;", "c", "Lbg0/e$a;", DateTokenConverter.CONVERTER_KEY, "Lii0/b;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y.a cameraXControllerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bg0.e.a camera2ManagerFactoryFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ii0.b navigationStateManager;

    public u(Context applicationContext, y.a cameraXControllerFactory, bg0.e.a camera2ManagerFactoryFactory, ii0.b navigationStateManager) {
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
    public static final h0 k(final y20.k.a aVar, final ej0.a aVar2, final n1.f fVar, final g3.a aVar3, final k kVar, final String it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.c().b(b0.c(null, new wn0.l() { // from class: xg0.t
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u.l(aVar2, fVar, aVar, aVar3, kVar, it, (y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(ej0.a aVar, n1.f fVar, y20.k.a aVar2, g3.a aVar3, k kVar, String str, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (aVar.isConnected()) {
            aVar.d();
            c4.R(fVar, aVar2, aVar3, null, fVar.getId(), kVar, fVar.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? fVar.j() : fVar.j(), (3584 & 512) != 0 ? fVar.getPartIndex() : 0, (3584 & 1024) != 0 ? null : str, (3584 & 2048) != 0 ? fVar.getCountryCode() : null);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(List list, zf0.u uVar) {
        p013kotlin.jvm.internal.s.k(list, "<unused var>");
        p013kotlin.jvm.internal.s.k(uVar, "<unused var>");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(y20.k.a aVar) {
        aVar.c().b(b0.c(null, new wn0.l() { // from class: xg0.s
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u.o((y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(g3.b.C2176b.f102421a);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 p(y20.k.a aVar, k kVar) {
        c4.N(aVar, kVar);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 q(Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 r() {
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 s(u uVar, y20.k.a aVar, g3.a aVar2) {
        c4.P(uVar.applicationContext, aVar, aVar2, true);
        return h0.f84049a;
    }

    public final Object j(final g3.a renderProps, final n1.f renderState, final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a context, final k videoCaptureHelper) {
        final ej0.a aVar;
        IdConfig.e side;
        final g3.a renderProps2 = renderProps;
        p013kotlin.jvm.internal.s.k(renderProps2, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(videoCaptureHelper, "videoCaptureHelper");
        ej0.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            aVar = webRtcManager;
            renderProps2 = renderProps;
            aVar.b(new wn0.l() { // from class: xg0.l
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u.k(context, aVar, renderState, renderProps, videoCaptureHelper, (String) obj);
                }
            });
        } else {
            aVar = webRtcManager;
        }
        i4 currentPart = renderState.getCurrentPart();
        i4.SideIdPart sideIdPart = currentPart instanceof i4.SideIdPart ? (i4.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.e.Front;
        }
        IdConfig.IdSideConfig idSideConfigC = renderState.getId().c(side);
        String strG = c4.G(renderProps2.getStrings(), side, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        IdConfig.e eVar = side;
        g5.b.a aVar2 = g5.b.a.Disabled;
        wg0.e type = renderState.getId().getType();
        return new AlertContainerScreen(l1.c(m1.f(renderProps2, strG, capturing, aVar2, idSideConfigC.getOverlay(), type, eVar, this.navigationStateManager.b(), (601882880 & 256) != 0 ? new wn0.p() { // from class: pg0.h1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return m1.h((List) obj, (zf0.u) obj2);
            }
        } : new wn0.p() { // from class: xg0.m
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return u.m((List) obj, (zf0.u) obj2);
            }
        }, new wn0.a() { // from class: xg0.n
            @Override // wn0.a
            public final Object invoke() {
                return u.n(context);
            }
        }, new wn0.a() { // from class: xg0.o
            @Override // wn0.a
            public final Object invoke() {
                return u.p(context, videoCaptureHelper);
            }
        }, false, p013kotlin.collections.v.m(), renderState, renderState.getPartIndex(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, (131072 & 601882880) != 0 ? new wn0.p() { // from class: pg0.i1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return m1.i((List) obj, (zf0.u) obj2);
            }
        } : null, (262144 & 601882880) != 0 ? new wn0.l() { // from class: pg0.j1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m1.j((Throwable) obj);
            }
        } : new wn0.l() { // from class: xg0.p
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u.q((Throwable) obj);
            }
        }, c4.y(context), (1048576 & 601882880) != 0 ? fg0.a.None : fg0.a.Stream, (2097152 & 601882880) != 0, (4194304 & 601882880) != 0 ? false : true, (8388608 & 601882880) != 0 ? false : false, (16777216 & 601882880) != 0 ? new wn0.p() { // from class: pg0.k1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return m1.k((File) obj, (zf0.u) obj2);
            }
        } : null, (33554432 & 601882880) != 0 ? new wn0.a() { // from class: pg0.l1
            @Override // wn0.a
            public final Object invoke() {
                return m1.l();
            }
        } : new wn0.a() { // from class: xg0.q
            @Override // wn0.a
            public final Object invoke() {
                return u.r();
            }
        }, new wn0.a() { // from class: xg0.r
            @Override // wn0.a
            public final Object invoke() {
                return u.s(this.f123521a, context, renderProps2);
            }
        }, (134217728 & 601882880) != 0 ? renderProps2.getImageCaptureCount() : 0, (268435456 & 601882880) != 0 ? null : null, (536870912 & 601882880) != 0 ? null : null, (601882880 & 1073741824) != 0 ? null : aVar)), null, 2, null);
    }
}
