package com.facebook.react.bridge;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@in.a
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "addListener", "(Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;)V", "removeListener", "clearListeners", "", "category", "", "cause", "logSoftExceptionVerbose", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "logSoftException", "message", "logNoThrowSoftExceptionWithMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "", "listeners", "Ljava/util/List;", "Categories", "ReactSoftExceptionListener", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactSoftExceptionLogger {
    public static final ReactSoftExceptionLogger INSTANCE = new ReactSoftExceptionLogger();
    private static final List<ReactSoftExceptionListener> listeners = new CopyOnWriteArrayList();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$Categories;", "", "<init>", "()V", "RVG_IS_VIEW_CLIPPED", "", "RVG_ON_VIEW_REMOVED", "SOFT_ASSERTIONS", "SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Categories {
        public static final Categories INSTANCE = new Categories();
        public static final String RVG_IS_VIEW_CLIPPED = "ReactViewGroup.isViewClipped";
        public static final String RVG_ON_VIEW_REMOVED = "ReactViewGroup.onViewRemoved";
        public static final String SOFT_ASSERTIONS = "SoftAssertions";
        public static final String SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE = "SurfaceMountingManager:MissingViewState";

        private Categories() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "", "", "category", "", "cause", "Ljn0/h0;", "logSoftException", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ReactSoftExceptionListener {
        void logSoftException(String category, Throwable cause);
    }

    private ReactSoftExceptionLogger() {
    }

    public static final void addListener(ReactSoftExceptionListener listener) {
        s.k(listener, "listener");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    public static final void clearListeners() {
        listeners.clear();
    }

    @in.a
    private static final void logNoThrowSoftExceptionWithMessage(String category, String message) {
        logSoftException(category, new ReactNoCrashSoftException(message));
    }

    public static final void logSoftException(String category, Throwable cause) {
        s.k(category, "category");
        s.k(cause, "cause");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.isEmpty()) {
            qk.a.n(category, "Unhandled SoftException", cause);
            return;
        }
        Iterator<ReactSoftExceptionListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().logSoftException(category, cause);
        }
    }

    public static final void logSoftExceptionVerbose(String category, Throwable cause) {
        s.k(category, "category");
        s.k(cause, "cause");
        logSoftException(category + "|" + cause.getClass().getSimpleName() + ":" + cause.getMessage(), cause);
    }

    public static final void removeListener(ReactSoftExceptionListener listener) {
        s.k(listener, "listener");
        listeners.remove(listener);
    }
}
