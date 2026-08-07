package expo.modules.core.interfaces.services;

import android.view.View;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.LifecycleEventListener;

/* JADX INFO: loaded from: classes8.dex */
public interface UIManager {

    public interface GroupUIBlock {
        void execute(ViewHolder viewHolder);
    }

    public interface UIBlock<T> {
        void reject(Throwable th2);

        void resolve(T t11);
    }

    public interface ViewHolder {
        View get(Object obj);
    }

    @Deprecated
    <T> void addUIBlock(int i11, UIBlock<T> uIBlock, Class<T> cls);

    @Deprecated
    void addUIBlock(GroupUIBlock groupUIBlock);

    void registerActivityEventListener(ActivityEventListener activityEventListener);

    void registerLifecycleEventListener(LifecycleEventListener lifecycleEventListener);

    @Deprecated
    View resolveView(int i11);

    void runOnClientCodeQueueThread(Runnable runnable);

    void runOnNativeModulesQueueThread(Runnable runnable);

    void runOnUiQueueThread(Runnable runnable);

    void unregisterActivityEventListener(ActivityEventListener activityEventListener);

    void unregisterLifecycleEventListener(LifecycleEventListener lifecycleEventListener);
}
