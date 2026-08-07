package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.m0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g f2205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f2206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f2207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    e.b f2208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m0 f2209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f2210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2215p;

    private class a extends m0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.m0
        public o.e b() {
            b bVar = ActionMenuItemView.this.f2210k;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0
        protected boolean c() {
            o.e eVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f2208i;
            return bVar != null && bVar.b(actionMenuItemView.f2205f) && (eVarB = b()) != null && eVarB.a();
        }
    }

    public static abstract class b {
        public abstract o.e a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (i11 < 480) {
            return (i11 >= 640 && i12 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void h() {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f2206g);
        if (this.f2207h != null && (!this.f2205f.B() || (!this.f2211l && !this.f2212m))) {
            z11 = false;
        }
        boolean z13 = z12 & z11;
        setText(z13 ? this.f2206g : null);
        CharSequence contentDescription = this.f2205f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z13 ? null : this.f2205f.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2205f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            d1.a(this, z13 ? null : this.f2205f.getTitle());
        } else {
            d1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f2205f.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i11) {
        this.f2205f = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f2209j == null) {
            this.f2209j = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f2205f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f2208i;
        if (bVar != null) {
            bVar.b(this.f2205f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2211l = g();
        h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        boolean zF = f();
        if (zF && (i13 = this.f2214o) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f2213n) : this.f2213n;
        if (mode != 1073741824 && this.f2213n > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i12);
        }
        if (zF || this.f2207h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2207h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m0 m0Var;
        if (this.f2205f.hasSubMenu() && (m0Var = this.f2209j) != null && m0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }

    public void setExpandedFormat(boolean z11) {
        if (this.f2212m != z11) {
            this.f2212m = z11;
            g gVar = this.f2205f;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2207h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i11 = this.f2215p;
            if (intrinsicWidth > i11) {
                intrinsicHeight = (int) (intrinsicHeight * (i11 / intrinsicWidth));
                intrinsicWidth = i11;
            }
            if (intrinsicHeight > i11) {
                intrinsicWidth = (int) (intrinsicWidth * (i11 / intrinsicHeight));
            } else {
                i11 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i11);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f2208i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        this.f2214o = i11;
        super.setPadding(i11, i12, i13, i14);
    }

    public void setPopupCallback(b bVar) {
        this.f2210k = bVar;
    }

    public void setShortcut(boolean z11, char c11) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f2206g = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Resources resources = context.getResources();
        this.f2211l = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f73975v, i11, 0);
        this.f2213n = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f73980w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2215p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2214o = -1;
        setSaveEnabled(false);
    }
}
