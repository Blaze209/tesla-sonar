package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class o0 implements o.e {
    private static Method G;
    private static Method H;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f2756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    k0 f2757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f2769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f2770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DataSetObserver f2772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f2773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f2774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f2775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f2776v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final g f2777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final f f2778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final e f2779y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final c f2780z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = o0.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            o0.this.show();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            k0 k0Var;
            if (i11 == -1 || (k0Var = o0.this.f2757c) == null) {
                return;
            }
            k0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.this.q();
        }
    }

    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (o0.this.a()) {
                o0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            o0.this.dismiss();
        }
    }

    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 != 1 || o0.this.z() || o0.this.F.getContentView() == null) {
                return;
            }
            o0 o0Var = o0.this;
            o0Var.B.removeCallbacks(o0Var.f2777w);
            o0.this.f2777w.run();
        }
    }

    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = o0.this.F) != null && popupWindow.isShowing() && x11 >= 0 && x11 < o0.this.F.getWidth() && y11 >= 0 && y11 < o0.this.F.getHeight()) {
                o0 o0Var = o0.this;
                o0Var.B.postDelayed(o0Var.f2777w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            o0 o0Var2 = o0.this;
            o0Var2.B.removeCallbacks(o0Var2.f2777w);
            return false;
        }
    }

    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0 k0Var = o0.this.f2757c;
            if (k0Var == null || !ViewCompat.S(k0Var) || o0.this.f2757c.getCount() <= o0.this.f2757c.getChildCount()) {
                return;
            }
            int childCount = o0.this.f2757c.getChildCount();
            o0 o0Var = o0.this;
            if (childCount <= o0Var.f2769o) {
                o0Var.F.setInputMethodMode(2);
                o0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public o0(@NonNull Context context) {
        this(context, null, i.a.H);
    }

    private void B() {
        View view = this.f2770p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2770p);
            }
        }
    }

    private void N(boolean z11) {
        if (Build.VERSION.SDK_INT > 28) {
            this.F.setIsClippedToScreen(z11);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z11));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int p() {
        int measuredHeight;
        int i11;
        int iMakeMeasureSpec;
        View view;
        int i12;
        if (this.f2757c == null) {
            Context context = this.f2755a;
            this.A = new a();
            k0 k0VarR = r(context, !this.E);
            this.f2757c = k0VarR;
            Drawable drawable = this.f2774t;
            if (drawable != null) {
                k0VarR.setSelector(drawable);
            }
            this.f2757c.setAdapter(this.f2756b);
            this.f2757c.setOnItemClickListener(this.f2775u);
            this.f2757c.setFocusable(true);
            this.f2757c.setFocusableInTouchMode(true);
            this.f2757c.setOnItemSelectedListener(new b());
            this.f2757c.setOnScrollListener(this.f2779y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2776v;
            if (onItemSelectedListener != null) {
                this.f2757c.setOnItemSelectedListener(onItemSelectedListener);
            }
            k0 k0Var = this.f2757c;
            View view2 = this.f2770p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.f2771q;
                if (i13 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(k0Var, layoutParams);
                } else if (i13 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f2771q);
                } else {
                    linearLayout.addView(k0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i14 = this.f2759e;
                if (i14 >= 0) {
                    i12 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = k0Var;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.f2770p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i15 = rect.top;
            i11 = rect.bottom + i15;
            if (!this.f2763i) {
                this.f2761g = -i15;
            }
        } else {
            this.C.setEmpty();
            i11 = 0;
        }
        int iT = t(s(), this.f2761g, this.F.getInputMethodMode() == 2);
        if (this.f2767m || this.f2758d == -1) {
            return iT + i11;
        }
        int i16 = this.f2759e;
        if (i16 == -2) {
            int i17 = this.f2755a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i16 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        } else {
            int i18 = this.f2755a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f2757c.d(iMakeMeasureSpec, 0, -1, iT - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i11 + this.f2757c.getPaddingTop() + this.f2757c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int t(View view, int i11, boolean z11) {
        return this.F.getMaxAvailableHeight(view, i11, z11);
    }

    public boolean A() {
        return this.E;
    }

    public void C(View view) {
        this.f2773s = view;
    }

    public void D(int i11) {
        this.F.setAnimationStyle(i11);
    }

    public void E(int i11) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            Q(i11);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f2759e = rect.left + rect.right + i11;
    }

    public void F(int i11) {
        this.f2766l = i11;
    }

    public void G(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i11) {
        this.F.setInputMethodMode(i11);
    }

    public void I(boolean z11) {
        this.E = z11;
        this.F.setFocusable(z11);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2775u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f2776v = onItemSelectedListener;
    }

    public void M(boolean z11) {
        this.f2765k = true;
        this.f2764j = z11;
    }

    public void O(int i11) {
        this.f2771q = i11;
    }

    public void P(int i11) {
        k0 k0Var = this.f2757c;
        if (!a() || k0Var == null) {
            return;
        }
        k0Var.setListSelectionHidden(false);
        k0Var.setSelection(i11);
        if (k0Var.getChoiceMode() != 0) {
            k0Var.setItemChecked(i11, true);
        }
    }

    public void Q(int i11) {
        this.f2759e = i11;
    }

    @Override // o.e
    public boolean a() {
        return this.F.isShowing();
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public Drawable d() {
        return this.F.getBackground();
    }

    @Override // o.e
    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView(null);
        this.f2757c = null;
        this.B.removeCallbacks(this.f2777w);
    }

    public void e(int i11) {
        this.f2761g = i11;
        this.f2763i = true;
    }

    public int h() {
        if (this.f2763i) {
            return this.f2761g;
        }
        return 0;
    }

    @Override // o.e
    public ListView j() {
        return this.f2757c;
    }

    public int k() {
        return this.f2760f;
    }

    public void l(int i11) {
        this.f2760f = i11;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2772r;
        if (dataSetObserver == null) {
            this.f2772r = new d();
        } else {
            ListAdapter listAdapter2 = this.f2756b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2756b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2772r);
        }
        k0 k0Var = this.f2757c;
        if (k0Var != null) {
            k0Var.setAdapter(this.f2756b);
        }
    }

    public void q() {
        k0 k0Var = this.f2757c;
        if (k0Var != null) {
            k0Var.setListSelectionHidden(true);
            k0Var.requestLayout();
        }
    }

    @NonNull
    k0 r(Context context, boolean z11) {
        return new k0(context, z11);
    }

    public View s() {
        return this.f2773s;
    }

    @Override // o.e
    public void show() {
        int iP = p();
        boolean z11 = z();
        androidx.core.widget.l.b(this.F, this.f2762h);
        if (this.F.isShowing()) {
            if (ViewCompat.S(s())) {
                int width = this.f2759e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i11 = this.f2758d;
                if (i11 == -1) {
                    if (!z11) {
                        iP = -1;
                    }
                    if (z11) {
                        this.F.setWidth(this.f2759e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f2759e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    iP = i11;
                }
                this.F.setOutsideTouchable((this.f2768n || this.f2767m) ? false : true);
                this.F.update(s(), this.f2760f, this.f2761g, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f2759e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i12 = this.f2758d;
        if (i12 == -1) {
            iP = -1;
        } else if (i12 != -2) {
            iP = i12;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iP);
        N(true);
        this.F.setOutsideTouchable((this.f2768n || this.f2767m) ? false : true);
        this.F.setTouchInterceptor(this.f2778x);
        if (this.f2765k) {
            androidx.core.widget.l.a(this.F, this.f2764j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e11) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e11);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        androidx.core.widget.l.c(this.F, s(), this.f2760f, this.f2761g, this.f2766l);
        this.f2757c.setSelection(-1);
        if (!this.E || this.f2757c.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f2780z);
    }

    public Object u() {
        if (a()) {
            return this.f2757c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f2757c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f2757c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f2757c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f2759e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public o0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.H);
    }

    public o0(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public o0(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f2758d = -2;
        this.f2759e = -2;
        this.f2762h = 1002;
        this.f2766l = 0;
        this.f2767m = false;
        this.f2768n = false;
        this.f2769o = Integer.MAX_VALUE;
        this.f2771q = 0;
        this.f2777w = new g();
        this.f2778x = new f();
        this.f2779y = new e();
        this.f2780z = new c();
        this.C = new Rect();
        this.f2755a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f73982w1, i11, i12);
        this.f2760f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f73987x1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f73992y1, 0);
        this.f2761g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2763i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        n nVar = new n(context, attributeSet, i11, i12);
        this.F = nVar;
        nVar.setInputMethodMode(1);
    }
}
