package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g implements m5.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f2334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f2335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f2336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f2337h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f2339j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f2341l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f2343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f2344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f2345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f2346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f2347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f2348s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f2355z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2338i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2340k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2342m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f2349t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f2350u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2351v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f2352w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f2353x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f2354y = 16;
    private boolean D = false;

    class a implements androidx.core.view.b.InterfaceC0158b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0158b
        public void onActionProviderVisibilityChanged(boolean z11) {
            g gVar = g.this;
            gVar.f2343n.L(gVar);
        }
    }

    g(e eVar, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        this.f2343n = eVar;
        this.f2330a = i12;
        this.f2331b = i11;
        this.f2332c = i13;
        this.f2333d = i14;
        this.f2334e = charSequence;
        this.f2355z = i15;
    }

    private static void d(StringBuilder sb2, int i11, int i12, String str) {
        if ((i11 & i12) == i12) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f2353x && (this.f2351v || this.f2352w)) {
            drawable = l5.a.r(drawable).mutate();
            if (this.f2351v) {
                l5.a.o(drawable, this.f2349t);
            }
            if (this.f2352w) {
                l5.a.p(drawable, this.f2350u);
            }
            this.f2353x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f2343n.J() && g() != 0;
    }

    public boolean B() {
        return (this.f2355z & 4) == 4;
    }

    @Override // m5.b
    public androidx.core.view.b a() {
        return this.B;
    }

    @Override // m5.b
    public m5.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f2343n.M(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f2343n.K(this);
    }

    @Override // m5.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f2355z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2343n.f(this);
        }
        return false;
    }

    @Override // m5.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2343n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f2333d;
    }

    char g() {
        return this.f2343n.I() ? this.f2339j : this.f2337h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // m5.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // m5.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2340k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2339j;
    }

    @Override // m5.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2347r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2331b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f2341l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f2342m == 0) {
            return null;
        }
        Drawable drawableB = j.a.b(this.f2343n.w(), this.f2342m);
        this.f2342m = 0;
        this.f2341l = drawableB;
        return e(drawableB);
    }

    @Override // m5.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2349t;
    }

    @Override // m5.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2350u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2336g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f2330a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // m5.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2338i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2337h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2332c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f2344o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2334e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2335f;
        return charSequence != null ? charSequence : this.f2334e;
    }

    @Override // m5.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2348s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f2343n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f2343n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(i.h.f73858m));
        }
        int i11 = this.f2343n.I() ? this.f2340k : this.f2338i;
        d(sb2, i11, 65536, resources.getString(i.h.f73854i));
        d(sb2, i11, 4096, resources.getString(i.h.f73850e));
        d(sb2, i11, 2, resources.getString(i.h.f73849d));
        d(sb2, i11, 1, resources.getString(i.h.f73855j));
        d(sb2, i11, 4, resources.getString(i.h.f73857l));
        d(sb2, i11, 8, resources.getString(i.h.f73853h));
        if (cG == '\b') {
            sb2.append(resources.getString(i.h.f73851f));
        } else if (cG == '\n') {
            sb2.append(resources.getString(i.h.f73852g));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(i.h.f73856k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2344o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // m5.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2354y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2354y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2354y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            return (this.f2354y & 8) == 0;
        }
        return (this.f2354y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f2355z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2346q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f2343n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f2345p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f2336g != null) {
            try {
                this.f2343n.w().startActivity(this.f2336g);
                return true;
            } catch (ActivityNotFoundException e11) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e11);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f2354y & 32) == 32;
    }

    public boolean m() {
        return (this.f2354y & 4) != 0;
    }

    public boolean n() {
        return (this.f2355z & 1) == 1;
    }

    public boolean o() {
        return (this.f2355z & 2) == 2;
    }

    @Override // m5.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public m5.b setActionView(int i11) {
        Context contextW = this.f2343n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i11, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public m5.b setActionView(View view) {
        int i11;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i11 = this.f2330a) > 0) {
            view.setId(i11);
        }
        this.f2343n.K(this);
        return this;
    }

    public void r(boolean z11) {
        this.D = z11;
        this.f2343n.M(false);
    }

    void s(boolean z11) {
        int i11 = this.f2354y;
        int i12 = (z11 ? 2 : 0) | (i11 & (-3));
        this.f2354y = i12;
        if (i11 != i12) {
            this.f2343n.M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11) {
        if (this.f2339j == c11) {
            return this;
        }
        this.f2339j = Character.toLowerCase(c11);
        this.f2343n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z11) {
        int i11 = this.f2354y;
        int i12 = (z11 ? 1 : 0) | (i11 & (-2));
        this.f2354y = i12;
        if (i11 != i12) {
            this.f2343n.M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z11) {
        if ((this.f2354y & 4) != 0) {
            this.f2343n.X(this);
            return this;
        }
        s(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z11) {
        if (z11) {
            this.f2354y |= 16;
        } else {
            this.f2354y &= -17;
        }
        this.f2343n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2342m = 0;
        this.f2341l = drawable;
        this.f2353x = true;
        this.f2343n.M(false);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2349t = colorStateList;
        this.f2351v = true;
        this.f2353x = true;
        this.f2343n.M(false);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2350u = mode;
        this.f2352w = true;
        this.f2353x = true;
        this.f2343n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2336g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11) {
        if (this.f2337h == c11) {
            return this;
        }
        this.f2337h = c11;
        this.f2343n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2346q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12) {
        this.f2337h = c11;
        this.f2339j = Character.toLowerCase(c12);
        this.f2343n.M(false);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public void setShowAsAction(int i11) {
        int i12 = i11 & 3;
        if (i12 != 0 && i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2355z = i11;
        this.f2343n.K(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2334e = charSequence;
        this.f2343n.M(false);
        m mVar = this.f2344o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2335f = charSequence;
        this.f2343n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z11) {
        if (y(z11)) {
            this.f2343n.L(this);
        }
        return this;
    }

    public void t(boolean z11) {
        this.f2354y = (z11 ? 4 : 0) | (this.f2354y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f2334e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z11) {
        if (z11) {
            this.f2354y |= 32;
        } else {
            this.f2354y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // m5.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public m5.b setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    public void x(m mVar) {
        this.f2344o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z11) {
        int i11 = this.f2354y;
        int i12 = (z11 ? 0 : 8) | (i11 & (-9));
        this.f2354y = i12;
        return i11 != i12;
    }

    public boolean z() {
        return this.f2343n.C();
    }

    @Override // m5.b, android.view.MenuItem
    public m5.b setContentDescription(CharSequence charSequence) {
        this.f2347r = charSequence;
        this.f2343n.M(false);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public m5.b setTooltipText(CharSequence charSequence) {
        this.f2348s = charSequence;
        this.f2343n.M(false);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        if (this.f2339j == c11 && this.f2340k == i11) {
            return this;
        }
        this.f2339j = Character.toLowerCase(c11);
        this.f2340k = KeyEvent.normalizeMetaState(i11);
        this.f2343n.M(false);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c11, int i11) {
        if (this.f2337h == c11 && this.f2338i == i11) {
            return this;
        }
        this.f2337h = c11;
        this.f2338i = KeyEvent.normalizeMetaState(i11);
        this.f2343n.M(false);
        return this;
    }

    @Override // m5.b, android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f2337h = c11;
        this.f2338i = KeyEvent.normalizeMetaState(i11);
        this.f2339j = Character.toLowerCase(c12);
        this.f2340k = KeyEvent.normalizeMetaState(i12);
        this.f2343n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i11) {
        this.f2341l = null;
        this.f2342m = i11;
        this.f2353x = true;
        this.f2343n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i11) {
        return setTitle(this.f2343n.w().getString(i11));
    }
}
