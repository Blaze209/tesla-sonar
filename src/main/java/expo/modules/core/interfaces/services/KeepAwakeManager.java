package expo.modules.core.interfaces.services;

/* JADX INFO: loaded from: classes8.dex */
public interface KeepAwakeManager {
    void activate(String str, Runnable runnable);

    void deactivate(String str, Runnable runnable);

    boolean isActivated();
}
