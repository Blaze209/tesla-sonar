package expo.modules;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.a0;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.devsupport.f0;
import com.facebook.react.o0;
import com.facebook.react.v0;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lexpo/modules/ReactNativeHostWrapper;", "Lexpo/modules/ReactNativeHostWrapperBase;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/facebook/react/o0;", "host", "<init>", "(Landroid/app/Application;Lcom/facebook/react/o0;)V", "Lcom/facebook/react/devsupport/f0;", "getDevSupportManagerFactory", "()Lcom/facebook/react/devsupport/f0;", "Lcom/facebook/react/v0$a;", "getReactPackageTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/v0$a;", "Lcom/facebook/react/bridge/UIManagerProvider;", "getUIManagerProvider", "()Lcom/facebook/react/bridge/UIManagerProvider;", "Lcom/facebook/react/f;", "getJSEngineResolutionAlgorithm", "()Lcom/facebook/react/f;", "", "getShouldRequireActivity", "()Z", "Ljn/i;", "getSurfaceDelegateFactory", "()Ljn/i;", "Lpn/j;", "getRedBoxHandler", "()Lpn/j;", "Companion", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactNativeHostWrapper extends ReactNativeHostWrapperBase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/ReactNativeHostWrapper$Companion;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/o0;", "reactNativeHost", "Lcom/facebook/react/a0;", "createReactHost", "(Landroid/content/Context;Lcom/facebook/react/o0;)Lcom/facebook/react/a0;", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0 createReactHost(Context context, o0 reactNativeHost) {
            s.k(context, "context");
            s.k(reactNativeHost, "reactNativeHost");
            return ExpoReactHostFactory.createFromReactNativeHost(context, reactNativeHost);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeHostWrapper(Application application, o0 host) {
        super(application, host);
        s.k(application, "application");
        s.k(host, "host");
    }

    public static final a0 createReactHost(Context context, o0 o0Var) {
        return INSTANCE.createReactHost(context, o0Var);
    }

    @Override // com.facebook.react.o0
    protected f0 getDevSupportManagerFactory() {
        f0 f0Var = (f0) ho0.l.M(ho0.l.V(v.e0(getReactNativeHostHandlers()), new wn0.l() { // from class: expo.modules.i
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ((ReactNativeHostHandler) obj).getDevSupportManagerFactory();
            }
        }));
        return f0Var == null ? (f0) invokeDelegateMethod$expo_release("getDevSupportManagerFactory") : f0Var;
    }

    @Override // com.facebook.react.defaults.d, com.facebook.react.o0
    public com.facebook.react.f getJSEngineResolutionAlgorithm() {
        return (com.facebook.react.f) invokeDelegateMethod$expo_release("getJSEngineResolutionAlgorithm");
    }

    @Override // com.facebook.react.defaults.d, com.facebook.react.o0
    protected v0.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return (v0.a) invokeDelegateMethod$expo_release("getReactPackageTurboModuleManagerDelegateBuilder");
    }

    @Override // com.facebook.react.o0
    protected pn.j getRedBoxHandler() {
        return (pn.j) invokeDelegateMethod$expo_release("getRedBoxHandler");
    }

    @Override // com.facebook.react.o0
    public boolean getShouldRequireActivity() {
        return getHost().getShouldRequireActivity();
    }

    @Override // com.facebook.react.o0
    public jn.i getSurfaceDelegateFactory() {
        jn.i surfaceDelegateFactory = getHost().getSurfaceDelegateFactory();
        s.j(surfaceDelegateFactory, "getSurfaceDelegateFactory(...)");
        return surfaceDelegateFactory;
    }

    @Override // com.facebook.react.defaults.d, com.facebook.react.o0
    protected UIManagerProvider getUIManagerProvider() {
        return (UIManagerProvider) invokeDelegateMethod$expo_release("getUIManagerProvider");
    }
}
