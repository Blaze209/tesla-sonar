package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.b1;
import com.facebook.react.views.scroll.j.d;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class b<ScrollViewT extends ViewGroup & j.d> implements UIManagerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollViewT f23532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0459b f23534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference<View> f23535d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f23536e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23537f = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.b$b, reason: collision with other inner class name */
    public static class C0459b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f23540b;

        C0459b(int i11, Integer num) {
            this.f23539a = i11;
            this.f23540b = num;
        }

        static C0459b a(ReadableMap readableMap) {
            return new C0459b(readableMap.getInt("minIndexForVisible"), readableMap.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold")) : null);
        }
    }

    public b(ScrollViewT scrollviewt, boolean z11) {
        this.f23532a = scrollviewt;
        this.f23533b = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.facebook.react.views.view.e eVarC;
        float y11;
        int height;
        if (this.f23534c == null || (eVarC = c()) == null) {
            return;
        }
        int scrollX = this.f23533b ? this.f23532a.getScrollX() : this.f23532a.getScrollY();
        for (int i11 = this.f23534c.f23539a; i11 < eVarC.getChildCount(); i11++) {
            View childAt = eVarC.getChildAt(i11);
            if (this.f23533b) {
                y11 = childAt.getX();
                height = childAt.getWidth();
            } else {
                y11 = childAt.getY();
                height = childAt.getHeight();
            }
            if (y11 + height > scrollX || i11 == eVarC.getChildCount() - 1) {
                this.f23535d = new WeakReference<>(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.f23536e = rect;
                return;
            }
        }
    }

    private com.facebook.react.views.view.e c() {
        return (com.facebook.react.views.view.e) this.f23532a.getChildAt(0);
    }

    private UIManager d() {
        return (UIManager) gn.a.c(b1.g((ReactContext) this.f23532a.getContext(), oo.a.a(this.f23532a.getId())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        WeakReference<View> weakReference;
        View view;
        if (this.f23534c == null || (weakReference = this.f23535d) == null || this.f23536e == null || (view = weakReference.get()) == null) {
            return;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (this.f23533b) {
            int i11 = rect.left - this.f23536e.left;
            if (i11 != 0) {
                int scrollX = this.f23532a.getScrollX();
                ScrollViewT scrollviewt = this.f23532a;
                scrollviewt.a(i11 + scrollX, scrollviewt.getScrollY());
                this.f23536e = rect;
                Integer num = this.f23534c.f23540b;
                if (num == null || scrollX > num.intValue()) {
                    return;
                }
                ScrollViewT scrollviewt2 = this.f23532a;
                scrollviewt2.b(0, scrollviewt2.getScrollY());
                return;
            }
            return;
        }
        int i12 = rect.top - this.f23536e.top;
        if (i12 != 0) {
            int scrollY = this.f23532a.getScrollY();
            ScrollViewT scrollviewt3 = this.f23532a;
            scrollviewt3.a(scrollviewt3.getScrollX(), i12 + scrollY);
            this.f23536e = rect;
            Integer num2 = this.f23534c.f23540b;
            if (num2 == null || scrollY > num2.intValue()) {
                return;
            }
            ScrollViewT scrollviewt4 = this.f23532a;
            scrollviewt4.b(scrollviewt4.getScrollX(), 0);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
    }

    public void e(C0459b c0459b) {
        this.f23534c = c0459b;
    }

    public void f() {
        if (this.f23537f) {
            return;
        }
        this.f23537f = true;
        d().addUIManagerEventListener(this);
    }

    public void g() {
        if (this.f23537f) {
            this.f23537f = false;
            d().removeUIManagerEventListener(this);
        }
    }

    public void h() {
        if (oo.a.a(this.f23532a.getId()) == 2) {
            return;
        }
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
        b();
    }
}
