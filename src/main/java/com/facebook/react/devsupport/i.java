package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0081\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0089\u0001\u0010 \u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/facebook/react/devsupport/i;", "Lcom/facebook/react/devsupport/f0;", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/devsupport/z0;", "reactInstanceManagerHelper", "", "packagerPathForJSBundleName", "", "enableOnCreate", "Lpn/j;", "redBoxHandler", "Lpn/b;", "devBundleDownloadListener", "", "minNumShakes", "", "Ljo/f;", "customPackagerCommandHandlers", "Ljn/i;", "surfaceDelegateFactory", "Lpn/c;", "devLoadingViewManager", "Lpn/i;", "pausedInDebuggerOverlayManager", "Lpn/e;", "b", "(Landroid/content/Context;Lcom/facebook/react/devsupport/z0;Ljava/lang/String;ZLpn/j;Lpn/b;ILjava/util/Map;Ljn/i;Lpn/c;Lpn/i;)Lpn/e;", "", "useDevSupport", "a", "(Landroid/content/Context;Lcom/facebook/react/devsupport/z0;Ljava/lang/String;ZLpn/j;Lpn/b;ILjava/util/Map;Ljn/i;Lpn/c;Lpn/i;Z)Lpn/e;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f22493a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/facebook/react/devsupport/i$a;", "", "<init>", "()V", "", "DEVSUPPORT_IMPL_PACKAGE", "Ljava/lang/String;", "DEVSUPPORT_IMPL_CLASS", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.facebook.react.devsupport.f0
    public pn.e a(Context applicationContext, z0 reactInstanceManagerHelper, String packagerPathForJSBundleName, boolean enableOnCreate, pn.j redBoxHandler, pn.b devBundleDownloadListener, int minNumShakes, Map<String, jo.f> customPackagerCommandHandlers, jn.i surfaceDelegateFactory, pn.c devLoadingViewManager, pn.i pausedInDebuggerOverlayManager, boolean useDevSupport) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(reactInstanceManagerHelper, "reactInstanceManagerHelper");
        if (useDevSupport) {
            return new com.facebook.react.devsupport.a(applicationContext, reactInstanceManagerHelper, packagerPathForJSBundleName, enableOnCreate, redBoxHandler, devBundleDownloadListener, minNumShakes, customPackagerCommandHandlers, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
        }
        return ln.a.UNSTABLE_ENABLE_FUSEBOX_RELEASE ? new y0(applicationContext) : new h1();
    }

    @Override // com.facebook.react.devsupport.f0
    public pn.e b(Context applicationContext, z0 reactInstanceManagerHelper, String packagerPathForJSBundleName, boolean enableOnCreate, pn.j redBoxHandler, pn.b devBundleDownloadListener, int minNumShakes, Map<String, ? extends jo.f> customPackagerCommandHandlers, jn.i surfaceDelegateFactory, pn.c devLoadingViewManager, pn.i pausedInDebuggerOverlayManager) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(reactInstanceManagerHelper, "reactInstanceManagerHelper");
        if (!enableOnCreate) {
            return new h1();
        }
        try {
            String str = "com.facebook.react.devsupport.BridgeDevSupportManager";
            p013kotlin.jvm.internal.s.j(str, "toString(...)");
            Object objNewInstance = Class.forName(str).getConstructor(Context.class, z0.class, String.class, Boolean.TYPE, pn.j.class, pn.b.class, Integer.TYPE, Map.class, jn.i.class, pn.c.class, pn.i.class).newInstance(applicationContext, reactInstanceManagerHelper, packagerPathForJSBundleName, Boolean.TRUE, redBoxHandler, devBundleDownloadListener, Integer.valueOf(minNumShakes), customPackagerCommandHandlers, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
            p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager");
            return (pn.e) objNewInstance;
        } catch (Exception unused) {
            return new y0(applicationContext);
        }
    }
}
