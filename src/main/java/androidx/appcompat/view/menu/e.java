package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.view.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements m5.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f2301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f2304e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f2312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f2313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f2314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f2315p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f2323x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2325z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2311l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2316q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2317r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2318s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2319t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2320u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<g> f2321v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f2322w = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f2324y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<g> f2305f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<g> f2306g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2307h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<g> f2308i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<g> f2309j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2310k = true;

    public interface a {
        boolean a(@NonNull e eVar, @NonNull MenuItem menuItem);

        void b(@NonNull e eVar);
    }

    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        this.f2300a = context;
        this.f2301b = context.getResources();
        f0(true);
    }

    private static int D(int i11) {
        int i12 = ((-65536) & i11) >> 16;
        if (i12 >= 0) {
            int[] iArr = A;
            if (i12 < iArr.length) {
                return (i11 & 65535) | (iArr[i12] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void P(int i11, boolean z11) {
        if (i11 < 0 || i11 >= this.f2305f.size()) {
            return;
        }
        this.f2305f.remove(i11);
        if (z11) {
            M(true);
        }
    }

    private void a0(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.f2315p = view;
            this.f2313n = null;
            this.f2314o = null;
        } else {
            if (i11 > 0) {
                this.f2313n = resourcesE.getText(i11);
            } else if (charSequence != null) {
                this.f2313n = charSequence;
            }
            if (i12 > 0) {
                this.f2314o = androidx.core.content.b.getDrawable(w(), i12);
            } else if (drawable != null) {
                this.f2314o = drawable;
            }
            this.f2315p = null;
        }
        M(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void f0(boolean z11) {
        boolean z12;
        if (z11) {
            z12 = this.f2301b.getConfiguration().keyboard != 1 && p0.l(ViewConfiguration.get(this.f2300a), this.f2300a);
        }
        this.f2303d = z12;
    }

    private g g(int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        return new g(this, i11, i12, i13, i14, charSequence, i15);
    }

    private void i(boolean z11) {
        if (this.f2322w.isEmpty()) {
            return;
        }
        h0();
        for (WeakReference<j> weakReference : this.f2322w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f2322w.remove(weakReference);
            } else {
                jVar.e(z11);
            }
        }
        g0();
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f2322w.isEmpty()) {
            return;
        }
        for (WeakReference<j> weakReference : this.f2322w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f2322w.remove(weakReference);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    jVar.k(parcelable);
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable parcelableD;
        if (this.f2322w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<j> weakReference : this.f2322w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f2322w.remove(weakReference);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelableD = jVar.d()) != null) {
                    sparseArray.put(id2, parcelableD);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean l(m mVar, j jVar) {
        if (this.f2322w.isEmpty()) {
            return false;
        }
        boolean zL = jVar != null ? jVar.l(mVar) : false;
        for (WeakReference<j> weakReference : this.f2322w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null) {
                this.f2322w.remove(weakReference);
            } else if (!zL) {
                zL = jVar2.l(mVar);
            }
        }
        return zL;
    }

    private static int p(ArrayList<g> arrayList, int i11) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i11) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f2315p;
    }

    public ArrayList<g> B() {
        t();
        return this.f2309j;
    }

    boolean C() {
        return this.f2319t;
    }

    Resources E() {
        return this.f2301b;
    }

    public e F() {
        return this;
    }

    @NonNull
    public ArrayList<g> G() {
        if (!this.f2307h) {
            return this.f2306g;
        }
        this.f2306g.clear();
        int size = this.f2305f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f2305f.get(i11);
            if (gVar.isVisible()) {
                this.f2306g.add(gVar);
            }
        }
        this.f2307h = false;
        this.f2310k = true;
        return this.f2306g;
    }

    public boolean H() {
        return this.f2324y;
    }

    boolean I() {
        return this.f2302c;
    }

    public boolean J() {
        return this.f2303d;
    }

    void K(g gVar) {
        this.f2310k = true;
        M(true);
    }

    void L(g gVar) {
        this.f2307h = true;
        M(true);
    }

    public void M(boolean z11) {
        if (this.f2316q) {
            this.f2317r = true;
            if (z11) {
                this.f2318s = true;
                return;
            }
            return;
        }
        if (z11) {
            this.f2307h = true;
            this.f2310k = true;
        }
        i(z11);
    }

    public boolean N(MenuItem menuItem, int i11) {
        return O(menuItem, null, i11);
    }

    public boolean O(MenuItem menuItem, j jVar, int i11) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        androidx.core.view.b bVarA = gVar.a();
        boolean z11 = bVarA != null && bVarA.a();
        if (gVar.j()) {
            boolean zExpandActionView = gVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!gVar.hasSubMenu() && !z11) {
            if ((i11 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i11 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new m(w(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z11) {
            bVarA.f(mVar);
        }
        boolean zL = l(mVar, jVar) | zK;
        if (!zL) {
            e(true);
        }
        return zL;
    }

    public void Q(j jVar) {
        for (WeakReference<j> weakReference : this.f2322w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f2322w.remove(weakReference);
            }
        }
    }

    public void R(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).R(bundle);
            }
        }
        int i12 = bundle.getInt("android:menu:expandedactionview");
        if (i12 <= 0 || (menuItemFindItem = findItem(i12)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void S(Bundle bundle) {
        j(bundle);
    }

    public void T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(a aVar) {
        this.f2304e = aVar;
    }

    public e W(int i11) {
        this.f2311l = i11;
        return this;
    }

    void X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2305f.size();
        h0();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f2305f.get(i11);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        g0();
    }

    protected e Y(int i11) {
        a0(0, null, i11, null, null);
        return this;
    }

    protected e Z(Drawable drawable) {
        a0(0, null, 0, drawable, null);
        return this;
    }

    protected MenuItem a(int i11, int i12, int i13, CharSequence charSequence) {
        int iD = D(i13);
        g gVarG = g(i11, i12, i13, iD, charSequence, this.f2311l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2312m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f2305f;
        arrayList.add(p(arrayList, iD), gVarG);
        M(true);
        return gVarG;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        PackageManager packageManager = this.f2300a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i16 = 0; i16 < size; i16++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i17 < 0 ? intent : intentArr[i17]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i11, i12, i13, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f2300a);
    }

    protected e b0(int i11) {
        a0(i11, null, 0, null, null);
        return this;
    }

    public void c(j jVar, Context context) {
        this.f2322w.add(new WeakReference<>(jVar));
        jVar.h(context, this);
        this.f2310k = true;
    }

    protected e c0(CharSequence charSequence) {
        a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f2323x;
        if (gVar != null) {
            f(gVar);
        }
        this.f2305f.clear();
        M(true);
    }

    public void clearHeader() {
        this.f2314o = null;
        this.f2313n = null;
        this.f2315p = null;
        M(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f2304e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    protected e d0(View view) {
        a0(0, null, 0, null, view);
        return this;
    }

    public final void e(boolean z11) {
        if (this.f2320u) {
            return;
        }
        this.f2320u = true;
        for (WeakReference<j> weakReference : this.f2322w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f2322w.remove(weakReference);
            } else {
                jVar.b(this, z11);
            }
        }
        this.f2320u = false;
    }

    public void e0(boolean z11) {
        this.f2325z = z11;
    }

    public boolean f(g gVar) {
        boolean zG = false;
        if (!this.f2322w.isEmpty() && this.f2323x == gVar) {
            h0();
            for (WeakReference<j> weakReference : this.f2322w) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zG = jVar.g(this, gVar);
                    if (zG) {
                        break;
                    }
                } else {
                    this.f2322w.remove(weakReference);
                }
            }
            g0();
            if (zG) {
                this.f2323x = null;
            }
        }
        return zG;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i11) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f2305f.get(i12);
            if (gVar.getItemId() == i11) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i11)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public void g0() {
        this.f2316q = false;
        if (this.f2317r) {
            this.f2317r = false;
            M(this.f2318s);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i11) {
        return this.f2305f.get(i11);
    }

    boolean h(@NonNull e eVar, @NonNull MenuItem menuItem) {
        a aVar = this.f2304e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void h0() {
        if (this.f2316q) {
            return;
        }
        this.f2316q = true;
        this.f2317r = false;
        this.f2318s = false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f2325z) {
            return true;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f2305f.get(i11).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return r(i11, keyEvent) != null;
    }

    public boolean m(g gVar) {
        boolean zC = false;
        if (this.f2322w.isEmpty()) {
            return false;
        }
        h0();
        for (WeakReference<j> weakReference : this.f2322w) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zC = jVar.c(this, gVar);
                if (zC) {
                    break;
                }
            } else {
                this.f2322w.remove(weakReference);
            }
        }
        g0();
        if (zC) {
            this.f2323x = gVar;
        }
        return zC;
    }

    public int n(int i11) {
        return o(i11, 0);
    }

    public int o(int i11, int i12) {
        int size = size();
        if (i12 < 0) {
            i12 = 0;
        }
        while (i12 < size) {
            if (this.f2305f.get(i12).getGroupId() == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i11, int i12) {
        return N(findItem(i11), i12);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        g gVarR = r(i11, keyEvent);
        boolean zN = gVarR != null ? N(gVarR, i12) : false;
        if ((i12 & 2) != 0) {
            e(true);
        }
        return zN;
    }

    public int q(int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f2305f.get(i12).getItemId() == i11) {
                return i12;
            }
        }
        return -1;
    }

    g r(int i11, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f2321v;
        arrayList.clear();
        s(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zI = I();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = arrayList.get(i12);
            char alphabeticShortcut = zI ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zI && alphabeticShortcut == '\b' && i11 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i11) {
        int iN = n(i11);
        if (iN >= 0) {
            int size = this.f2305f.size() - iN;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size || this.f2305f.get(iN).getGroupId() != i11) {
                    break;
                }
                P(iN, false);
                i12 = i13;
            }
            M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i11) {
        P(q(i11), true);
    }

    void s(List<g> list, int i11, KeyEvent keyEvent) {
        boolean zI = I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i11 == 67) {
            int size = this.f2305f.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = this.f2305f.get(i12);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).s(list, i11, keyEvent);
                }
                char alphabeticShortcut = zI ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zI ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zI && alphabeticShortcut == '\b' && i11 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        int size = this.f2305f.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f2305f.get(i12);
            if (gVar.getGroupId() == i11) {
                gVar.t(z12);
                gVar.setCheckable(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.f2324y = z11;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i11, boolean z11) {
        int size = this.f2305f.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f2305f.get(i12);
            if (gVar.getGroupId() == i11) {
                gVar.setEnabled(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i11, boolean z11) {
        int size = this.f2305f.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f2305f.get(i12);
            if (gVar.getGroupId() == i11 && gVar.y(z11)) {
                z12 = true;
            }
        }
        if (z12) {
            M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f2302c = z11;
        M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2305f.size();
    }

    public void t() {
        ArrayList<g> arrayListG = G();
        if (this.f2310k) {
            boolean zF = false;
            for (WeakReference<j> weakReference : this.f2322w) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    this.f2322w.remove(weakReference);
                } else {
                    zF |= jVar.f();
                }
            }
            if (zF) {
                this.f2308i.clear();
                this.f2309j.clear();
                int size = arrayListG.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g gVar = arrayListG.get(i11);
                    if (gVar.l()) {
                        this.f2308i.add(gVar);
                    } else {
                        this.f2309j.add(gVar);
                    }
                }
            } else {
                this.f2308i.clear();
                this.f2309j.clear();
                this.f2309j.addAll(G());
            }
            this.f2310k = false;
        }
    }

    public ArrayList<g> u() {
        t();
        return this.f2308i;
    }

    protected String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f2300a;
    }

    public g x() {
        return this.f2323x;
    }

    public Drawable y() {
        return this.f2314o;
    }

    public CharSequence z() {
        return this.f2313n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11) {
        return a(0, 0, 0, this.f2301b.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, this.f2301b.getString(i11));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return a(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        g gVar = (g) a(i11, i12, i13, charSequence);
        m mVar = new m(this.f2300a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, int i14) {
        return a(i11, i12, i13, this.f2301b.getString(i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, this.f2301b.getString(i14));
    }
}
