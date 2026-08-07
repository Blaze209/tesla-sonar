package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f7810a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f7811a;

        a(View view) {
            this.f7811a = view;
        }

        @Override // androidx.core.view.h0.c
        void a() {
            View view = this.f7811a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f7811a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.h0.c
        void b() {
            final View viewFindViewById = this.f7811a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f7811a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.g0
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    private static class c {
        c() {
        }

        void a() {
            throw null;
        }

        void b() {
            throw null;
        }
    }

    public h0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7810a = new b(view);
        } else {
            this.f7810a = new a(view);
        }
    }

    public void a() {
        this.f7810a.a();
    }

    public void b() {
        this.f7810a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f7812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsetsController f7813c;

        b(View view) {
            super(view);
            this.f7812b = view;
        }

        @Override // androidx.core.view.h0.a, androidx.core.view.h0.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f7813c;
            if (windowInsetsController == null) {
                View view2 = this.f7812b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.i0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i11) {
                    atomicBoolean.set((i11 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f7812b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f7812b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.h0.a, androidx.core.view.h0.c
        void b() {
            View view = this.f7812b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f7813c;
            if (windowInsetsController == null) {
                View view2 = this.f7812b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f7813c = windowInsetsController;
        }
    }

    @Deprecated
    h0(WindowInsetsController windowInsetsController) {
        this.f7810a = new b(windowInsetsController);
    }
}
