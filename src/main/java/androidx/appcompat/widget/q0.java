package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends o0 implements p0 {
    private static Method J;
    private p0 I;

    public static class a extends k0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f2792o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final int f2793p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private p0 f2794q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private MenuItem f2795r;

        public a(Context context, boolean z11) {
            super(context, z11);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f2792o = 21;
                this.f2793p = 22;
            } else {
                this.f2792o = 22;
                this.f2793p = 21;
            }
        }

        @Override // androidx.appcompat.widget.k0
        public /* bridge */ /* synthetic */ int d(int i11, int i12, int i13, int i14, int i15) {
            return super.d(i11, i12, i13, i14, i15);
        }

        @Override // androidx.appcompat.widget.k0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i11) {
            return super.e(motionEvent, i11);
        }

        @Override // androidx.appcompat.widget.k0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.k0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.k0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.k0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.k0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i11;
            if (this.f2794q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = iPointToPosition - headersCount) < 0 || i11 >= dVar.getCount()) ? null : dVar.getItem(i11);
                MenuItem menuItem = this.f2795r;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f2794q.i(eVarB, menuItem);
                    }
                    this.f2795r = item;
                    if (item != null) {
                        this.f2794q.c(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i11, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i11 == this.f2792o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i11 != this.f2793p) {
                return super.onKeyDown(i11, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.k0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(p0 p0Var) {
            this.f2794q = p0Var;
        }

        @Override // androidx.appcompat.widget.k0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public q0(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    public void R(Object obj) {
        this.F.setEnterTransition((Transition) obj);
    }

    public void S(Object obj) {
        this.F.setExitTransition((Transition) obj);
    }

    public void T(p0 p0Var) {
        this.I = p0Var;
    }

    public void U(boolean z11) {
        if (Build.VERSION.SDK_INT > 28) {
            this.F.setTouchModal(z11);
            return;
        }
        Method method = J;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z11));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.p0
    public void c(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        p0 p0Var = this.I;
        if (p0Var != null) {
            p0Var.c(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.p0
    public void i(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        p0 p0Var = this.I;
        if (p0Var != null) {
            p0Var.i(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.o0
    @NonNull
    k0 r(Context context, boolean z11) {
        a aVar = new a(context, z11);
        aVar.setHoverListener(this);
        return aVar;
    }
}
