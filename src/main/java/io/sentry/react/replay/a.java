package io.sentry.react.replay;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import io.sentry.ILogger;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.b7;
import io.sentry.p4;
import io.sentry.y3;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class a extends FragmentManager.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f81222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ReplayIntegration f81223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f81224c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81225d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<View> f81226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f81227f;

    /* JADX INFO: renamed from: io.sentry.react.replay.a$a, reason: collision with other inner class name */
    class ViewTreeObserverOnGlobalLayoutListenerC1704a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f81228a;

        ViewTreeObserverOnGlobalLayoutListenerC1704a(WeakReference weakReference) {
            this.f81228a = weakReference;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = (View) this.f81228a.get();
            if (view != null) {
                a.this.c(view);
            }
        }
    }

    public a(ILogger iLogger) {
        this.f81222a = iLogger;
    }

    private void b(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC1704a viewTreeObserverOnGlobalLayoutListenerC1704a = new ViewTreeObserverOnGlobalLayoutListenerC1704a(new WeakReference(view));
        this.f81226e = new WeakReference<>(view);
        this.f81227f = viewTreeObserverOnGlobalLayoutListenerC1704a;
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1704a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        try {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            int i11 = displayMetrics.widthPixels;
            int i12 = displayMetrics.heightPixels;
            if (this.f81224c == i11 && this.f81225d == i12) {
                return;
            }
            this.f81224c = i11;
            this.f81225d = i12;
            f(i11, i12);
        } catch (Exception e11) {
            this.f81222a.a(b7.DEBUG, "Failed to check window size", e11);
        }
    }

    private void d() {
        WeakReference<View> weakReference = this.f81226e;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null && this.f81227f != null) {
            try {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.f81227f);
                }
            } catch (Exception e11) {
                this.f81222a.a(b7.DEBUG, "Failed to remove layout change listener", e11);
            }
        }
        this.f81226e = null;
        this.f81227f = null;
    }

    private ReplayIntegration e() {
        try {
            y3 replayController = p4.g().getOptions().getReplayController();
            if (replayController instanceof ReplayIntegration) {
                return (ReplayIntegration) replayController;
            }
            this.f81222a.c(b7.DEBUG, "Error getting replay integration", new Object[0]);
            return null;
        } catch (Exception e11) {
            this.f81222a.a(b7.DEBUG, "Error getting replay integration", e11);
            return null;
        }
    }

    private void f(int i11, int i12) {
        if (this.f81223b == null) {
            this.f81223b = e();
        }
        ReplayIntegration replayIntegration = this.f81223b;
        if (replayIntegration == null) {
            return;
        }
        try {
            replayIntegration.C(i11, i12);
        } catch (Exception e11) {
            this.f81222a.a(b7.DEBUG, "Failed to notify replay integration of size change", e11);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        d();
        b(view);
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        d();
    }
}
