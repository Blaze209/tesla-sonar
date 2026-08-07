package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Interpolator f2823l = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f2824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f2825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    n0 f2826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spinner f2827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f2829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ViewPropertyAnimator f2833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final e f2834k;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2835a;

        a(View view) {
            this.f2835a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.smoothScrollTo(this.f2835a.getLeft() - ((u0.this.getWidth() - this.f2835a.getWidth()) / 2), 0);
            u0.this.f2824a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return u0.this.f2826c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            return ((d) u0.this.f2826c.getChildAt(i11)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                return u0.this.d((ActionBar.c) getItem(i11), true);
            }
            ((d) view).a((ActionBar.c) getItem(i11));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = u0.this.f2826c.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = u0.this.f2826c.getChildAt(i11);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f2839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ActionBar.c f2840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f2841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f2842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f2843e;

        public d(Context context, ActionBar.c cVar, boolean z11) {
            super(context, null, i.a.f73728e);
            int[] iArr = {R.attr.background};
            this.f2839a = iArr;
            this.f2840b = cVar;
            b1 b1VarV = b1.v(context, null, iArr, i.a.f73728e, 0);
            if (b1VarV.s(0)) {
                setBackgroundDrawable(b1VarV.g(0));
            }
            b1VarV.w();
            if (z11) {
                setGravity(8388627);
            }
            c();
        }

        public void a(ActionBar.c cVar) {
            this.f2840b = cVar;
            c();
        }

        public ActionBar.c b() {
            return this.f2840b;
        }

        public void c() {
            ActionBar.c cVar = this.f2840b;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f2843e = viewB;
                TextView textView = this.f2841c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2842d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2842d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2843e;
            if (view != null) {
                removeView(view);
                this.f2843e = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f2842d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f2842d = appCompatImageView;
                }
                this.f2842d.setImageDrawable(drawableC);
                this.f2842d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2842d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2842d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceD);
            if (zIsEmpty) {
                TextView textView2 = this.f2841c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2841c.setText((CharSequence) null);
                }
            } else {
                if (this.f2841c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, i.a.f73729f);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f2841c = appCompatTextView;
                }
                this.f2841c.setText(charSequenceD);
                this.f2841c.setVisibility(0);
            }
            ImageView imageView3 = this.f2842d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            d1.a(this, zIsEmpty ? cVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (u0.this.f2829f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = u0.this.f2829f;
                if (measuredWidth > i13) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z11) {
            boolean z12 = isSelected() != z11;
            super.setSelected(z11);
            if (z12 && z11) {
                sendAccessibilityEvent(4);
            }
        }
    }

    protected class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2845a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2846b;

        protected e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2845a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2845a) {
                return;
            }
            u0 u0Var = u0.this;
            u0Var.f2833j = null;
            u0Var.setVisibility(this.f2846b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            u0.this.setVisibility(0);
            this.f2845a = false;
        }
    }

    public u0(@NonNull Context context) {
        super(context);
        this.f2834k = new e();
        setHorizontalScrollBarEnabled(false);
        n.a aVarB = n.a.b(context);
        setContentHeight(aVarB.f());
        this.f2830g = aVarB.e();
        n0 n0VarC = c();
        this.f2826c = n0VarC;
        addView(n0VarC, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner b() {
        v vVar = new v(getContext(), null, i.a.f73732i);
        vVar.setLayoutParams(new n0.a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    private n0 c() {
        n0 n0Var = new n0(getContext(), null, i.a.f73727d);
        n0Var.setMeasureWithLargestChildEnabled(true);
        n0Var.setGravity(17);
        n0Var.setLayoutParams(new n0.a(-2, -1));
        return n0Var;
    }

    private boolean e() {
        Spinner spinner = this.f2827d;
        return spinner != null && spinner.getParent() == this;
    }

    private void f() {
        if (e()) {
            return;
        }
        if (this.f2827d == null) {
            this.f2827d = b();
        }
        removeView(this.f2826c);
        addView(this.f2827d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f2827d.getAdapter() == null) {
            this.f2827d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f2824a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f2824a = null;
        }
        this.f2827d.setSelection(this.f2832i);
    }

    private boolean g() {
        if (!e()) {
            return false;
        }
        removeView(this.f2827d);
        addView(this.f2826c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2827d.getSelectedItemPosition());
        return false;
    }

    public void a(int i11) {
        View childAt = this.f2826c.getChildAt(i11);
        Runnable runnable = this.f2824a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f2824a = aVar;
        post(aVar);
    }

    d d(ActionBar.c cVar, boolean z11) {
        d dVar = new d(getContext(), cVar, z11);
        if (z11) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2831h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.f2825b == null) {
            this.f2825b = new c();
        }
        dVar.setOnClickListener(this.f2825b);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2824a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n.a aVarB = n.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f2830g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2824a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.f2826c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f2829f = -1;
        } else {
            if (childCount > 2) {
                this.f2829f = (int) (View.MeasureSpec.getSize(i11) * 0.4f);
            } else {
                this.f2829f = View.MeasureSpec.getSize(i11) / 2;
            }
            this.f2829f = Math.min(this.f2829f, this.f2830g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2831h, 1073741824);
        if (z11 || !this.f2828e) {
            g();
        } else {
            this.f2826c.measure(0, iMakeMeasureSpec);
            if (this.f2826c.getMeasuredWidth() > View.MeasureSpec.getSize(i11)) {
                f();
            } else {
                g();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i11, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z11 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f2832i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z11) {
        this.f2828e = z11;
    }

    public void setContentHeight(int i11) {
        this.f2831h = i11;
        requestLayout();
    }

    public void setTabSelected(int i11) {
        this.f2832i = i11;
        int childCount = this.f2826c.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = this.f2826c.getChildAt(i12);
            boolean z11 = i12 == i11;
            childAt.setSelected(z11);
            if (z11) {
                a(i11);
            }
            i12++;
        }
        Spinner spinner = this.f2827d;
        if (spinner == null || i11 < 0) {
            return;
        }
        spinner.setSelection(i11);
    }
}
