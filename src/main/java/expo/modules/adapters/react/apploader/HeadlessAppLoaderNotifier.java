package expo.modules.adapters.react.apploader;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\fR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/adapters/react/apploader/HeadlessAppLoaderNotifier;", "", "<init>", "()V", "Lexpo/modules/adapters/react/apploader/HeadlessAppLoaderListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "registerListener", "(Lexpo/modules/adapters/react/apploader/HeadlessAppLoaderListener;)V", "", "appScopeKey", "notifyAppLoaded", "(Ljava/lang/String;)V", "notifyAppDestroyed", "", "Ljava/lang/ref/WeakReference;", "listeners", "Ljava/util/Set;", "getListeners", "()Ljava/util/Set;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeadlessAppLoaderNotifier {
    public static final HeadlessAppLoaderNotifier INSTANCE = new HeadlessAppLoaderNotifier();
    private static final Set<WeakReference<HeadlessAppLoaderListener>> listeners = new LinkedHashSet();

    private HeadlessAppLoaderNotifier() {
    }

    public final Set<WeakReference<HeadlessAppLoaderListener>> getListeners() {
        return listeners;
    }

    public final void notifyAppDestroyed(String appScopeKey) {
        if (appScopeKey != null) {
            Iterator<T> it = listeners.iterator();
            while (it.hasNext()) {
                HeadlessAppLoaderListener headlessAppLoaderListener = (HeadlessAppLoaderListener) ((WeakReference) it.next()).get();
                if (headlessAppLoaderListener != null) {
                    headlessAppLoaderListener.appDestroyed(appScopeKey);
                }
            }
        }
    }

    public final void notifyAppLoaded(String appScopeKey) {
        if (appScopeKey != null) {
            Iterator<T> it = listeners.iterator();
            while (it.hasNext()) {
                HeadlessAppLoaderListener headlessAppLoaderListener = (HeadlessAppLoaderListener) ((WeakReference) it.next()).get();
                if (headlessAppLoaderListener != null) {
                    headlessAppLoaderListener.appLoaded(appScopeKey);
                }
            }
        }
    }

    public final void registerListener(HeadlessAppLoaderListener listener) {
        s.k(listener, "listener");
        listeners.add(new WeakReference<>(listener));
    }
}
