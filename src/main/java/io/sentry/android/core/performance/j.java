package io.sentry.android.core.performance;

import android.view.Window;

/* JADX INFO: loaded from: classes9.dex */
public class j extends io.sentry.android.core.internal.gestures.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f79697b;

    public j(Window.Callback callback, Runnable runnable) {
        super(callback);
        this.f79697b = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f79697b.run();
    }
}
