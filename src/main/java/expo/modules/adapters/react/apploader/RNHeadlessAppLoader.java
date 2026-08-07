package expo.modules.adapters.react.apploader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.a0;
import com.facebook.react.b0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.j0;
import com.facebook.react.o0;
import com.facebook.react.x;
import expo.modules.apploader.HeadlessAppLoader;
import expo.modules.core.interfaces.Consumer;
import expo.modules.core.interfaces.DoNotStrip;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/adapters/react/apploader/RNHeadlessAppLoader;", "Lexpo/modules/apploader/HeadlessAppLoader;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lexpo/modules/apploader/HeadlessAppLoader$Params;", "params", "Ljava/lang/Runnable;", "alreadyRunning", "Lexpo/modules/core/interfaces/Consumer;", "", "callback", "Ljn0/h0;", "loadApp", "(Landroid/content/Context;Lexpo/modules/apploader/HeadlessAppLoader$Params;Ljava/lang/Runnable;Lexpo/modules/core/interfaces/Consumer;)V", "", "appScopeKey", "invalidateApp", "(Ljava/lang/String;)Z", "isRunning", "Landroid/content/Context;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNHeadlessAppLoader implements HeadlessAppLoader {
    private final Context context;

    @DoNotStrip
    public RNHeadlessAppLoader(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    private static final void invalidateApp$lambda$2(a0 a0Var, String str) {
        if (a0Var.p() == LifecycleState.BEFORE_CREATE) {
            a0Var.n("Closing headless task app", null);
        }
        HeadlessAppLoaderNotifier.INSTANCE.notifyAppDestroyed(str);
        u0.d(RNHeadlessAppLoaderKt.appRecords).remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidateApp$lambda$3(j0 j0Var, String str) {
        if (j0Var.H() == LifecycleState.BEFORE_CREATE) {
            j0Var.B();
        }
        HeadlessAppLoaderNotifier.INSTANCE.notifyAppDestroyed(str);
        u0.d(RNHeadlessAppLoaderKt.appRecords).remove(str);
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    @SuppressLint({"VisibleForTests"})
    public boolean invalidateApp(final String appScopeKey) {
        ReactContext reactContext;
        if (!RNHeadlessAppLoaderKt.appRecords.containsKey(appScopeKey) || RNHeadlessAppLoaderKt.appRecords.get(appScopeKey) == null || (reactContext = (ReactContext) RNHeadlessAppLoaderKt.appRecords.get(appScopeKey)) == null) {
            return false;
        }
        Object applicationContext = reactContext.getApplicationContext();
        s.i(applicationContext, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        o0 o0VarD = ((x) applicationContext).d();
        if (!o0VarD.hasInstance()) {
            return true;
        }
        final j0 reactInstanceManager = o0VarD.getReactInstanceManager();
        s.j(reactInstanceManager, "getReactInstanceManager(...)");
        new Handler(reactContext.getMainLooper()).post(new Runnable() { // from class: expo.modules.adapters.react.apploader.a
            @Override // java.lang.Runnable
            public final void run() {
                RNHeadlessAppLoader.invalidateApp$lambda$3(reactInstanceManager, appScopeKey);
            }
        });
        return true;
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    public boolean isRunning(String appScopeKey) {
        ReactContext reactContext = (ReactContext) RNHeadlessAppLoaderKt.appRecords.get(appScopeKey);
        if (reactContext == null) {
            return false;
        }
        Object applicationContext = reactContext.getApplicationContext();
        s.i(applicationContext, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((x) applicationContext).d().getReactInstanceManager().M();
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    public void loadApp(Context context, final HeadlessAppLoader.Params params, Runnable alreadyRunning, final Consumer<Boolean> callback) {
        s.k(context, "context");
        if (params == null || params.getAppScopeKey() == null) {
            throw new IllegalArgumentException("Params must be set with appScopeKey!");
        }
        if (!(context.getApplicationContext() instanceof x)) {
            throw new IllegalStateException("Your application must implement ReactApplication");
        }
        if (RNHeadlessAppLoaderKt.appRecords.containsKey(params.getAppScopeKey())) {
            if (alreadyRunning != null) {
                alreadyRunning.run();
            }
        } else {
            Object applicationContext = context.getApplicationContext();
            s.i(applicationContext, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
            final j0 reactInstanceManager = ((x) applicationContext).d().getReactInstanceManager();
            reactInstanceManager.s(new b0() { // from class: expo.modules.adapters.react.apploader.RNHeadlessAppLoader.loadApp.3
                @Override // com.facebook.react.b0
                public void onReactContextInitialized(ReactContext context2) {
                    s.k(context2, "context");
                    HeadlessAppLoaderNotifier.INSTANCE.notifyAppLoaded(params.getAppScopeKey());
                    reactInstanceManager.t0(this);
                    RNHeadlessAppLoaderKt.appRecords.put(params.getAppScopeKey(), context2);
                    Consumer<Boolean> consumer = callback;
                    if (consumer != null) {
                        consumer.apply(Boolean.TRUE);
                    }
                }
            });
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: expo.modules.adapters.react.apploader.b
                @Override // java.lang.Runnable
                public final void run() {
                    reactInstanceManager.z();
                }
            });
        }
    }
}
