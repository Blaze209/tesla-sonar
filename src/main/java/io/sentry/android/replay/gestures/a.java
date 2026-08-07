package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.sentry.android.replay.e;
import io.sentry.android.replay.util.g;
import io.sentry.android.replay.y;
import io.sentry.b7;
import io.sentry.d1;
import io.sentry.q7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R0\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00170\u0016j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0017`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/gestures/a;", "Lio/sentry/android/replay/e;", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/gestures/c;", "touchRecorderCallback", "<init>", "(Lio/sentry/q7;Lio/sentry/android/replay/gestures/c;)V", "Landroid/view/View;", "Ljn0/h0;", "a", "(Landroid/view/View;)V", "c", "root", "", "added", "n", "(Landroid/view/View;Z)V", "b", "()V", "Lio/sentry/q7;", "Lio/sentry/android/replay/gestures/c;", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "rootViews", "Lio/sentry/util/a;", DateTokenConverter.CONVERTER_KEY, "Lio/sentry/util/a;", "rootViewsLock", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c touchRecorderCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<WeakReference<View>> rootViews;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a rootViewsLock;

    /* JADX INFO: renamed from: io.sentry.android.replay.gestures.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/sentry/android/replay/gestures/a$a;", "Lio/sentry/android/replay/util/g;", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/gestures/c;", "touchRecorderCallback", "Landroid/view/Window$Callback;", "delegate", "<init>", "(Lio/sentry/q7;Lio/sentry/android/replay/gestures/c;Landroid/view/Window$Callback;)V", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "b", "Lio/sentry/q7;", "c", "Lio/sentry/android/replay/gestures/c;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1692a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q7 options;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final c touchRecorderCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1692a(q7 options, c cVar, Window.Callback callback) {
            super(callback);
            s.k(options, "options");
            this.options = options;
            this.touchRecorderCallback = cVar;
        }

        @Override // io.sentry.android.replay.util.g, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent event) {
            if (event != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(event);
                s.j(motionEventObtainNoHistory, "obtainNoHistory(...)");
                try {
                    c cVar = this.touchRecorderCallback;
                    if (cVar != null) {
                        cVar.c(motionEventObtainNoHistory);
                    }
                } catch (Throwable th2) {
                    try {
                        this.options.getLogger().a(b7.ERROR, "Error dispatching touch event", th2);
                    } finally {
                        motionEventObtainNoHistory.recycle();
                    }
                }
            }
            return super.dispatchTouchEvent(event);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "it", "", "a", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<WeakReference<View>, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f80043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(1);
            this.f80043c = view;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference<View> it) {
            s.k(it, "it");
            return Boolean.valueOf(s.f(it.get(), this.f80043c));
        }
    }

    public a(q7 options, c touchRecorderCallback) {
        s.k(options, "options");
        s.k(touchRecorderCallback, "touchRecorderCallback");
        this.options = options;
        this.touchRecorderCallback = touchRecorderCallback;
        this.rootViews = new ArrayList<>();
        this.rootViewsLock = new io.sentry.util.a();
    }

    private final void a(View view) {
        Window windowA = y.a(view);
        if (windowA == null) {
            this.options.getLogger().c(b7.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C1692a) {
            return;
        }
        windowA.setCallback(new C1692a(this.options, this.touchRecorderCallback, callback));
    }

    private final void c(View view) {
        Window windowA = y.a(view);
        if (windowA == null) {
            this.options.getLogger().c(b7.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C1692a) {
            windowA.setCallback(((C1692a) callback).f80178a);
        }
    }

    public final void b() throws Exception {
        d1 d1VarA = this.rootViewsLock.a();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    s.h(view);
                    c(view);
                }
            }
            this.rootViews.clear();
            h0 h0Var = h0.f84049a;
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.e
    public void n(View root, boolean added) throws Exception {
        s.k(root, "root");
        d1 d1VarA = this.rootViewsLock.a();
        try {
            if (added) {
                this.rootViews.add(new WeakReference<>(root));
                a(root);
                h0 h0Var = h0.f84049a;
            } else {
                c(root);
                v.L(this.rootViews, new b(root));
            }
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }
}
