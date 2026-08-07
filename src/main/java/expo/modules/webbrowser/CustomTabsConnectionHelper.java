package expo.modules.webbrowser;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.interfaces.Consumer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\fJ\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lexpo/modules/webbrowser/CustomTabsConnectionHelper;", "Landroidx/browser/customtabs/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "ensureSession", "()V", "", "packageName", "ensureConnection", "(Ljava/lang/String;)V", "", "isConnectionStarted", "(Ljava/lang/String;)Z", "clearConnection", "destroy", "warmUp", "Landroid/net/Uri;", "uri", "mayInitWithUrl", "(Ljava/lang/String;Landroid/net/Uri;)V", "coolDown", "Landroid/content/ComponentName;", "componentName", "onBindingDied", "(Landroid/content/ComponentName;)V", "Landroidx/browser/customtabs/c;", "client", "onCustomTabsServiceConnected", "(Landroid/content/ComponentName;Landroidx/browser/customtabs/c;)V", "onServiceDisconnected", "Landroid/content/Context;", "currentPackageName", "Ljava/lang/String;", "Lexpo/modules/webbrowser/DeferredClientActionsQueue;", "clientActions", "Lexpo/modules/webbrowser/DeferredClientActionsQueue;", "Landroidx/browser/customtabs/f;", "sessionActions", "expo-web-browser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomTabsConnectionHelper extends e {
    private final DeferredClientActionsQueue<androidx.browser.customtabs.c> clientActions;
    private final Context context;
    private String currentPackageName;
    private final DeferredClientActionsQueue<f> sessionActions;

    public CustomTabsConnectionHelper(Context context) {
        s.k(context, "context");
        this.context = context;
        this.clientActions = new DeferredClientActionsQueue<>();
        this.sessionActions = new DeferredClientActionsQueue<>();
    }

    private final void clearConnection() {
        if (this.currentPackageName != null) {
            this.context.unbindService(this);
        }
        this.currentPackageName = null;
        this.clientActions.clear();
        this.sessionActions.clear();
    }

    private final void ensureConnection(String packageName) {
        String str = this.currentPackageName;
        if (str != null && !s.f(str, packageName)) {
            clearConnection();
        }
        if (isConnectionStarted(packageName)) {
            return;
        }
        androidx.browser.customtabs.c.a(this.context, packageName, this);
        this.currentPackageName = packageName;
    }

    private final void ensureSession() {
        if (this.sessionActions.hasClient()) {
            return;
        }
        this.clientActions.executeOrQueueAction(new Consumer() { // from class: expo.modules.webbrowser.b
            @Override // expo.modules.core.interfaces.Consumer
            public final void apply(Object obj) {
                CustomTabsConnectionHelper.ensureSession$lambda$2(this.f63432a, (androidx.browser.customtabs.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureSession$lambda$2(CustomTabsConnectionHelper customTabsConnectionHelper, androidx.browser.customtabs.c client) {
        s.k(client, "client");
        customTabsConnectionHelper.sessionActions.setClient(client.e(null));
    }

    private final boolean isConnectionStarted(String packageName) {
        return s.f(packageName, this.currentPackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mayInitWithUrl$lambda$1(Uri uri, f fVar) {
        if (fVar != null) {
            fVar.c(uri, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void warmUp$lambda$0(androidx.browser.customtabs.c client) {
        s.k(client, "client");
        client.g(0L);
    }

    public final boolean coolDown(String packageName) {
        s.k(packageName, "packageName");
        if (!isConnectionStarted(packageName)) {
            return false;
        }
        clearConnection();
        return true;
    }

    public final void destroy() {
        clearConnection();
    }

    public final void mayInitWithUrl(String packageName, final Uri uri) {
        s.k(packageName, "packageName");
        s.k(uri, "uri");
        this.sessionActions.executeOrQueueAction(new Consumer() { // from class: expo.modules.webbrowser.c
            @Override // expo.modules.core.interfaces.Consumer
            public final void apply(Object obj) {
                CustomTabsConnectionHelper.mayInitWithUrl$lambda$1(uri, (f) obj);
            }
        });
        ensureConnection(packageName);
        ensureSession();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        s.k(componentName, "componentName");
        String packageName = componentName.getPackageName();
        s.j(packageName, "getPackageName(...)");
        if (isConnectionStarted(packageName)) {
            clearConnection();
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c client) {
        s.k(componentName, "componentName");
        s.k(client, "client");
        String packageName = componentName.getPackageName();
        s.j(packageName, "getPackageName(...)");
        if (isConnectionStarted(packageName)) {
            this.clientActions.setClient(client);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        s.k(componentName, "componentName");
        String packageName = componentName.getPackageName();
        s.j(packageName, "getPackageName(...)");
        if (isConnectionStarted(packageName)) {
            clearConnection();
        }
    }

    public final void warmUp(String packageName) {
        s.k(packageName, "packageName");
        this.clientActions.executeOrQueueAction(new Consumer() { // from class: expo.modules.webbrowser.a
            @Override // expo.modules.core.interfaces.Consumer
            public final void apply(Object obj) {
                CustomTabsConnectionHelper.warmUp$lambda$0((androidx.browser.customtabs.c) obj);
            }
        });
        ensureConnection(packageName);
    }
}
