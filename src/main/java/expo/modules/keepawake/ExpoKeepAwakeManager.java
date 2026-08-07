package expo.modules.keepawake;

import android.app.Activity;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.errors.CurrentActivityNotFoundException;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.services.KeepAwakeManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lexpo/modules/keepawake/ExpoKeepAwakeManager;", "Lexpo/modules/core/interfaces/services/KeepAwakeManager;", "Lexpo/modules/core/interfaces/InternalModule;", "<init>", "()V", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "Ljn0/h0;", "onCreate", "(Lexpo/modules/core/ModuleRegistry;)V", "", "tag", "Ljava/lang/Runnable;", "done", "activate", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "deactivate", "", "isActivated", "()Z", "", "Ljava/lang/Class;", "getExportedInterfaces", "()Ljava/util/List;", "", "tags", "Ljava/util/Set;", "Lexpo/modules/core/ModuleRegistry;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "expo-keep-awake_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpoKeepAwakeManager implements KeepAwakeManager, InternalModule {
    private ModuleRegistry moduleRegistry;
    private final Set<String> tags = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activate$lambda$0(Activity activity) {
        activity.getWindow().addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deactivate$lambda$1(Activity activity) {
        activity.getWindow().clearFlags(128);
    }

    private final Activity getCurrentActivity() throws CurrentActivityNotFoundException {
        ModuleRegistry moduleRegistry = this.moduleRegistry;
        if (moduleRegistry == null) {
            s.B("moduleRegistry");
            moduleRegistry = null;
        }
        ActivityProvider activityProvider = (ActivityProvider) moduleRegistry.getModule(ActivityProvider.class);
        if (activityProvider == null) {
            throw new CurrentActivityNotFoundException();
        }
        if (activityProvider.getCurrentActivity() == null) {
            throw new CurrentActivityNotFoundException();
        }
        Activity currentActivity = activityProvider.getCurrentActivity();
        s.h(currentActivity);
        return currentActivity;
    }

    @Override // expo.modules.core.interfaces.services.KeepAwakeManager
    public void activate(String tag, Runnable done) throws CurrentActivityNotFoundException {
        s.k(tag, "tag");
        s.k(done, "done");
        final Activity currentActivity = getCurrentActivity();
        if (!isActivated()) {
            currentActivity.runOnUiThread(new Runnable() { // from class: expo.modules.keepawake.b
                @Override // java.lang.Runnable
                public final void run() {
                    ExpoKeepAwakeManager.activate$lambda$0(currentActivity);
                }
            });
        }
        this.tags.add(tag);
        done.run();
    }

    @Override // expo.modules.core.interfaces.services.KeepAwakeManager
    public void deactivate(String tag, Runnable done) throws CurrentActivityNotFoundException {
        s.k(tag, "tag");
        s.k(done, "done");
        final Activity currentActivity = getCurrentActivity();
        if (this.tags.size() == 1 && this.tags.contains(tag)) {
            currentActivity.runOnUiThread(new Runnable() { // from class: expo.modules.keepawake.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExpoKeepAwakeManager.deactivate$lambda$1(currentActivity);
                }
            });
        }
        this.tags.remove(tag);
        done.run();
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<?>> getExportedInterfaces() {
        return v.e(KeepAwakeManager.class);
    }

    @Override // expo.modules.core.interfaces.services.KeepAwakeManager
    public boolean isActivated() {
        return !this.tags.isEmpty();
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.k(moduleRegistry, "moduleRegistry");
        this.moduleRegistry = moduleRegistry;
    }
}
