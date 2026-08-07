package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.b1;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f2220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f2221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f2222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f2223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f2224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f2225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f2226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f2227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f2228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f2229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f2231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f2233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayoutInflater f2235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2236q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.G);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i11) {
        LinearLayout linearLayout = this.f2228i;
        if (linearLayout != null) {
            linearLayout.addView(view, i11);
        } else {
            addView(view, i11);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(i.g.f73833h, (ViewGroup) this, false);
        this.f2224e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(i.g.f73834i, (ViewGroup) this, false);
        this.f2221b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(i.g.f73836k, (ViewGroup) this, false);
        this.f2222c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f2235p == null) {
            this.f2235p = LayoutInflater.from(getContext());
        }
        return this.f2235p;
    }

    private void setSubMenuArrowVisible(boolean z11) {
        ImageView imageView = this.f2226g;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2227h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2227h.getLayoutParams();
        rect.top += this.f2227h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i11) {
        this.f2220a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        setShortcut(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f2220a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.t0(this, this.f2229j);
        TextView textView = (TextView) findViewById(i.f.N);
        this.f2223d = textView;
        int i11 = this.f2230k;
        if (i11 != -1) {
            textView.setTextAppearance(this.f2231l, i11);
        }
        this.f2225f = (TextView) findViewById(i.f.G);
        ImageView imageView = (ImageView) findViewById(i.f.J);
        this.f2226g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2233n);
        }
        this.f2227h = (ImageView) findViewById(i.f.f73818s);
        this.f2228i = (LinearLayout) findViewById(i.f.f73812m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f2221b != null && this.f2232m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2221b.getLayoutParams();
            int i13 = layoutParams.height;
            if (i13 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i13;
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setCheckable(boolean z11) {
        CompoundButton compoundButton;
        View view;
        if (!z11 && this.f2222c == null && this.f2224e == null) {
            return;
        }
        if (this.f2220a.m()) {
            if (this.f2222c == null) {
                g();
            }
            compoundButton = this.f2222c;
            view = this.f2224e;
        } else {
            if (this.f2224e == null) {
                e();
            }
            compoundButton = this.f2224e;
            view = this.f2222c;
        }
        if (z11) {
            compoundButton.setChecked(this.f2220a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f2224e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f2222c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z11) {
        CompoundButton compoundButton;
        if (this.f2220a.m()) {
            if (this.f2222c == null) {
                g();
            }
            compoundButton = this.f2222c;
        } else {
            if (this.f2224e == null) {
                e();
            }
            compoundButton = this.f2224e;
        }
        compoundButton.setChecked(z11);
    }

    public void setForceShowIcon(boolean z11) {
        this.f2236q = z11;
        this.f2232m = z11;
    }

    public void setGroupDividerEnabled(boolean z11) {
        ImageView imageView = this.f2227h;
        if (imageView != null) {
            imageView.setVisibility((this.f2234o || !z11) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z11 = this.f2220a.z() || this.f2236q;
        if (z11 || this.f2232m) {
            ImageView imageView = this.f2221b;
            if (imageView == null && drawable == null && !this.f2232m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f2232m) {
                this.f2221b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f2221b;
            if (!z11) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f2221b.getVisibility() != 0) {
                this.f2221b.setVisibility(0);
            }
        }
    }

    public void setShortcut(boolean z11, char c11) {
        int i11 = (z11 && this.f2220a.A()) ? 0 : 8;
        if (i11 == 0) {
            this.f2225f.setText(this.f2220a.h());
        }
        if (this.f2225f.getVisibility() != i11) {
            this.f2225f.setVisibility(i11);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2223d.getVisibility() != 8) {
                this.f2223d.setVisibility(8);
            }
        } else {
            this.f2223d.setText(charSequence);
            if (this.f2223d.getVisibility() != 0) {
                this.f2223d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        b1 b1VarV = b1.v(getContext(), attributeSet, i.j.f73892e2, i11, 0);
        this.f2229j = b1VarV.g(i.j.f73903g2);
        this.f2230k = b1VarV.n(i.j.f73898f2, -1);
        this.f2232m = b1VarV.a(i.j.f73908h2, false);
        this.f2231l = context;
        this.f2233n = b1VarV.g(i.j.f73913i2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, i.a.D, 0);
        this.f2234o = typedArrayObtainStyledAttributes.hasValue(0);
        b1VarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }
}
