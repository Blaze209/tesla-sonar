package io.sentry.react;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import io.sentry.ILogger;
import io.sentry.android.core.z0;
import io.sentry.b7;

/* JADX INFO: loaded from: classes9.dex */
public class s extends FragmentManager.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f81230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f81231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f81232c;

    class a implements com.facebook.react.uimanager.events.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventDispatcher f81233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f81234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f81235c;

        a(EventDispatcher eventDispatcher, View view, Runnable runnable) {
            this.f81233a = eventDispatcher;
            this.f81234b = view;
            this.f81235c = runnable;
        }

        @Override // com.facebook.react.uimanager.events.g
        public void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
            if ("com.swmansion.rnscreens.events.f".equals(dVar.getClass().getCanonicalName())) {
                this.f81233a.c(this);
                io.sentry.android.core.internal.util.r.e(this.f81234b, this.f81235c, s.this.f81230a);
            }
        }
    }

    public s(z0 z0Var, Runnable runnable, ILogger iLogger) {
        this.f81230a = z0Var;
        this.f81231b = runnable;
        this.f81232c = iLogger;
    }

    private static EventDispatcher b(@NonNull View view, int i11) {
        return b1.c(b1.d(view), i11);
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (!"com.swmansion.rnscreens.t0".equals(fragment.getClass().getCanonicalName())) {
            this.f81232c.c(b7.DEBUG, "Fragment is not a ScreenStackFragment, won't listen for the first draw.", new Object[0]);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            this.f81232c.c(b7.WARNING, "Fragment view is not a ViewGroup, won't listen for the first draw.", new Object[0]);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            this.f81232c.c(b7.WARNING, "Fragment view has no children, won't listen for the first draw.", new Object[0]);
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null || !(childAt.getContext() instanceof ReactContext)) {
            this.f81232c.c(b7.WARNING, "Fragment view has no ReactContext, won't listen for the first draw.", new Object[0]);
            return;
        }
        int id2 = childAt.getId();
        if (id2 == -1) {
            this.f81232c.c(b7.WARNING, "Screen has no id, won't listen for the first draw.", new Object[0]);
            return;
        }
        EventDispatcher eventDispatcherB = b(childAt, id2);
        if (eventDispatcherB == null) {
            this.f81232c.c(b7.WARNING, "Screen has no event dispatcher, won't listen for the first draw.", new Object[0]);
        } else {
            eventDispatcherB.g(new a(eventDispatcherB, view, this.f81231b));
        }
    }
}
