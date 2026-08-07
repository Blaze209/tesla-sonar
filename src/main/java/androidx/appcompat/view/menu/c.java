package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f2282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f2283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f2284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f2285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f2287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.a f2289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f2290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2291j;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2292a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarX = c.this.f2284c.x();
            if (gVarX != null) {
                ArrayList<g> arrayListB = c.this.f2284c.B();
                int size = arrayListB.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (arrayListB.get(i11) == gVarX) {
                        this.f2292a = i11;
                        return;
                    }
                }
            }
            this.f2292a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i11) {
            ArrayList<g> arrayListB = c.this.f2284c.B();
            int i12 = i11 + c.this.f2286e;
            int i13 = this.f2292a;
            if (i13 >= 0 && i12 >= i13) {
                i12++;
            }
            return arrayListB.get(i12);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f2284c.B().size() - c.this.f2286e;
            return this.f2292a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f2283b.inflate(cVar.f2288g, viewGroup, false);
            }
            ((k.a) view).d(getItem(i11), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i11) {
        this(i11, 0);
        this.f2282a = context;
        this.f2283b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f2290i == null) {
            this.f2290i = new a();
        }
        return this.f2290i;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z11) {
        j.a aVar = this.f2289h;
        if (aVar != null) {
            aVar.b(eVar, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable d() {
        if (this.f2285d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z11) {
        a aVar = this.f2290i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f2291j;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(Context context, e eVar) {
        if (this.f2287f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f2287f);
            this.f2282a = contextThemeWrapper;
            this.f2283b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f2282a != null) {
            this.f2282a = context;
            if (this.f2283b == null) {
                this.f2283b = LayoutInflater.from(context);
            }
        }
        this.f2284c = eVar;
        a aVar = this.f2290i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(j.a aVar) {
        this.f2289h = aVar;
    }

    public k j(ViewGroup viewGroup) {
        if (this.f2285d == null) {
            this.f2285d = (ExpandedMenuView) this.f2283b.inflate(i.g.f73832g, viewGroup, false);
            if (this.f2290i == null) {
                this.f2290i = new a();
            }
            this.f2285d.setAdapter((ListAdapter) this.f2290i);
            this.f2285d.setOnItemClickListener(this);
        }
        return this.f2285d;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean l(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f2289h;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2285d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f2285d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        this.f2284c.O(this.f2290i.getItem(i11), this, 0);
    }

    public c(int i11, int i12) {
        this.f2288g = i11;
        this.f2287f = i12;
    }
}
