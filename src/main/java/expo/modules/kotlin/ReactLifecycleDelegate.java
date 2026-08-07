package expo.modules.kotlin;

import android.app.Activity;
import android.content.Intent;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ1\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00030\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/ReactLifecycleDelegate;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ActivityEventListener;", "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Lexpo/modules/kotlin/AppContext;)V", "Ljn0/h0;", "onHostResume", "()V", "onHostPause", "Landroid/app/Activity;", "activity", "onUserLeaveHint", "(Landroid/app/Activity;)V", "onHostDestroy", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", AnalyticsAttribute.Intent, "onNewIntent", "(Landroid/content/Intent;)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "appContextHolder", "Ljava/lang/ref/WeakReference;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactLifecycleDelegate implements LifecycleEventListener, ActivityEventListener {
    private final WeakReference<AppContext> appContextHolder;

    public ReactLifecycleDelegate(AppContext appContext) {
        s.k(appContext, "appContext");
        this.appContextHolder = new WeakReference<>(appContext);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        s.k(activity, "activity");
        AppContext appContext = this.appContextHolder.get();
        if (appContext != null) {
            appContext.onActivityResult$expo_modules_core_release(activity, requestCode, resultCode, data);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        AppContext appContext = this.appContextHolder.get();
        if (appContext != null) {
            appContext.onHostDestroy$expo_modules_core_release();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        AppContext appContext = this.appContextHolder.get();
        if (appContext != null) {
            appContext.onHostPause$expo_modules_core_release();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        AppContext appContext = this.appContextHolder.get();
        if (appContext != null) {
            appContext.onHostResume$expo_modules_core_release();
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        AppContext appContext = this.appContextHolder.get();
        if (appContext != null) {
            appContext.onNewIntent$expo_modules_core_release(intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onUserLeaveHint(Activity activity) {
        s.k(activity, "activity");
        AppContext appContext = this.appContextHolder.get();
        if (appContext != null) {
            appContext.onUserLeaveHint$expo_modules_core_release();
        }
    }
}
