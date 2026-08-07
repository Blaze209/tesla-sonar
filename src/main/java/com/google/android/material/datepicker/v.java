package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
class v extends BaseAdapter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f42057g = c0.m().getMaximum(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f42058h = (c0.m().getMaximum(5) + c0.m().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u f42059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j<?> f42060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection<Long> f42061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c f42062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final a f42063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final n f42064f;

    v(u uVar, j<?> jVar, a aVar, n nVar) {
        this.f42059a = uVar;
        this.f42060b = jVar;
        this.f42063e = aVar;
        this.f42064f = nVar;
        this.f42061c = jVar.u1();
    }

    private String c(Context context, long j11) {
        return k.c(context, j11, l(j11), k(j11), g(j11));
    }

    private void f(Context context) {
        if (this.f42062d == null) {
            this.f42062d = new c(context);
        }
    }

    private boolean j(long j11) {
        Iterator<Long> it = this.f42060b.u1().iterator();
        while (it.hasNext()) {
            if (c0.a(j11) == c0.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j11) {
        return c0.k().getTimeInMillis() == j11;
    }

    private void o(TextView textView, long j11, int i11) {
        boolean zJ;
        b bVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j11);
        textView.setContentDescription(strC);
        boolean zU0 = this.f42063e.g().u0(j11);
        if (zU0) {
            textView.setEnabled(true);
            zJ = j(j11);
            textView.setSelected(zJ);
            if (zJ) {
                bVar = this.f42062d.f41942b;
            } else {
                bVar = l(j11) ? this.f42062d.f41943c : this.f42062d.f41941a;
            }
        } else {
            zJ = false;
            textView.setEnabled(false);
            bVar = this.f42062d.f41947g;
        }
        boolean z11 = zJ;
        n nVar = this.f42064f;
        if (nVar == null || i11 == -1) {
            bVar.d(textView);
            return;
        }
        u uVar = this.f42059a;
        int i12 = uVar.f42052c;
        int i13 = uVar.f42051b;
        bVar.e(textView, nVar.a(context, i12, i13, i11, zU0, z11), this.f42064f.g(context, i12, i13, i11, zU0, z11));
        textView.setCompoundDrawables(this.f42064f.c(context, i12, i13, i11, zU0, z11), this.f42064f.e(context, i12, i13, i11, zU0, z11), this.f42064f.d(context, i12, i13, i11, zU0, z11), this.f42064f.b(context, i12, i13, i11, zU0, z11));
        textView.setContentDescription(this.f42064f.f(context, i12, i13, i11, zU0, z11, strC));
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j11) {
        if (u.c(j11).equals(this.f42059a)) {
            int iG = this.f42059a.g(j11);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iG) - materialCalendarGridView.getFirstVisiblePosition()), j11, iG);
        }
    }

    int a(int i11) {
        return b() + (i11 - 1);
    }

    int b() {
        return this.f42059a.e(this.f42063e.i());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i11) {
        if (i11 < b() || i11 > m()) {
            return null;
        }
        return Long.valueOf(this.f42059a.f(n(i11)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i11, View view, @NonNull ViewGroup viewGroup) {
        int i12;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(zs.i.f128754p, viewGroup, false);
        }
        int iB = i11 - b();
        if (iB >= 0) {
            u uVar = this.f42059a;
            if (iB >= uVar.f42054e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i12 = -1;
            } else {
                i12 = iB + 1;
                textView.setTag(uVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i12)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i12 = -1;
        }
        Long item = getItem(i11);
        if (item == null) {
            return textView;
        }
        o(textView, item.longValue(), i12);
        return textView;
    }

    boolean g(long j11) {
        Iterator<u5.d<Long, Long>> it = this.f42060b.O2().iterator();
        while (it.hasNext()) {
            Long l11 = it.next().f115408b;
            if (l11 != null && l11.longValue() == j11) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f42058h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11 / this.f42059a.f42053d;
    }

    boolean h(int i11) {
        return i11 % this.f42059a.f42053d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i11) {
        return (i11 + 1) % this.f42059a.f42053d == 0;
    }

    boolean k(long j11) {
        Iterator<u5.d<Long, Long>> it = this.f42060b.O2().iterator();
        while (it.hasNext()) {
            Long l11 = it.next().f115407a;
            if (l11 != null && l11.longValue() == j11) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return (b() + this.f42059a.f42054e) - 1;
    }

    int n(int i11) {
        return (i11 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f42061c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        j<?> jVar = this.f42060b;
        if (jVar != null) {
            Iterator<Long> it2 = jVar.u1().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f42061c = this.f42060b.u1();
        }
    }

    boolean r(int i11) {
        return i11 >= b() && i11 <= m();
    }
}
