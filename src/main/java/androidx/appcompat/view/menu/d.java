package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f2294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2295b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f2297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f2298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2299f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z11, int i11) {
        this.f2297d = z11;
        this.f2298e = layoutInflater;
        this.f2294a = eVar;
        this.f2299f = i11;
        a();
    }

    void a() {
        g gVarX = this.f2294a.x();
        if (gVarX != null) {
            ArrayList<g> arrayListB = this.f2294a.B();
            int size = arrayListB.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (arrayListB.get(i11) == gVarX) {
                    this.f2295b = i11;
                    return;
                }
            }
        }
        this.f2295b = -1;
    }

    public e b() {
        return this.f2294a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i11) {
        ArrayList<g> arrayListB = this.f2297d ? this.f2294a.B() : this.f2294a.G();
        int i12 = this.f2295b;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return arrayListB.get(i11);
    }

    public void d(boolean z11) {
        this.f2296c = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListB = this.f2297d ? this.f2294a.B() : this.f2294a.G();
        return this.f2295b < 0 ? arrayListB.size() : arrayListB.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2298e.inflate(this.f2299f, viewGroup, false);
        }
        int groupId = getItem(i11).getGroupId();
        int i12 = i11 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2294a.H() && groupId != (i12 >= 0 ? getItem(i12).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f2296c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i11), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
