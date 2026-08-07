package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.internal.util.k;
import io.sentry.util.r;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements io.sentry.internal.gestures.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r<Boolean> f79428a;

    public a(r<Boolean> rVar) {
        this.f79428a = rVar;
    }

    private io.sentry.internal.gestures.b b(View view) {
        try {
            return new io.sentry.internal.gestures.b(view, k.a(view), i.b(view), null, "old_view_system");
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean c(View view, boolean z11) {
        if (z11) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean d(View view, boolean z11) {
        return (c(view, z11) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    private static boolean e(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.a
    public io.sentry.internal.gestures.b a(Object obj, float f11, float f12, io.sentry.internal.gestures.b.a aVar) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (aVar == io.sentry.internal.gestures.b.a.CLICKABLE && e(view)) {
            return b(view);
        }
        if (aVar == io.sentry.internal.gestures.b.a.SCROLLABLE && d(view, this.f79428a.a().booleanValue())) {
            return b(view);
        }
        return null;
    }
}
