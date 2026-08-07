package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a implements m5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f95521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f95522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f95523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f95524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f95525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f95526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f95527g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f95529i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f95531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f95532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f95533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f95534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f95535o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95528h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95530j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f95536p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f95537q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f95538r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f95539s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f95540t = 16;

    public a(Context context, int i11, int i12, int i13, int i14, CharSequence charSequence) {
        this.f95532l = context;
        this.f95521a = i12;
        this.f95522b = i11;
        this.f95523c = i14;
        this.f95524d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f95531k;
        if (drawable != null) {
            if (this.f95538r || this.f95539s) {
                Drawable drawableR = l5.a.r(drawable);
                this.f95531k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f95531k = drawableMutate;
                if (this.f95538r) {
                    l5.a.o(drawableMutate, this.f95536p);
                }
                if (this.f95539s) {
                    l5.a.p(this.f95531k, this.f95537q);
                }
            }
        }
    }

    @Override // m5.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // m5.b
    public m5.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // m5.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // m5.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public m5.b setActionView(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // m5.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public m5.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // m5.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // m5.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public m5.b setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // m5.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // m5.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f95530j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f95529i;
    }

    @Override // m5.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f95534n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f95522b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f95531k;
    }

    @Override // m5.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f95536p;
    }

    @Override // m5.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f95537q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f95526f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f95521a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m5.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f95528h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f95527g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f95523c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f95524d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f95525e;
        return charSequence != null ? charSequence : this.f95524d;
    }

    @Override // m5.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f95535o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // m5.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f95540t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f95540t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f95540t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f95540t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11) {
        this.f95529i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z11) {
        this.f95540t = (z11 ? 1 : 0) | (this.f95540t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z11) {
        this.f95540t = (z11 ? 2 : 0) | (this.f95540t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z11) {
        this.f95540t = (z11 ? 16 : 0) | (this.f95540t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f95531k = drawable;
        c();
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f95536p = colorStateList;
        this.f95538r = true;
        c();
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f95537q = mode;
        this.f95539s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f95526f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11) {
        this.f95527g = c11;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f95533m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12) {
        this.f95527g = c11;
        this.f95529i = Character.toLowerCase(c12);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f95524d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f95525e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z11) {
        this.f95540t = (this.f95540t & 8) | (z11 ? 0 : 8);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        this.f95529i = Character.toLowerCase(c11);
        this.f95530j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public m5.b setContentDescription(CharSequence charSequence) {
        this.f95534n = charSequence;
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c11, int i11) {
        this.f95527g = c11;
        this.f95528h = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i11) {
        this.f95524d = this.f95532l.getResources().getString(i11);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public m5.b setTooltipText(CharSequence charSequence) {
        this.f95535o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i11) {
        this.f95531k = androidx.core.content.b.getDrawable(this.f95532l, i11);
        c();
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f95527g = c11;
        this.f95528h = KeyEvent.normalizeMetaState(i11);
        this.f95529i = Character.toLowerCase(c12);
        this.f95530j = KeyEvent.normalizeMetaState(i12);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public void setShowAsAction(int i11) {
    }
}
