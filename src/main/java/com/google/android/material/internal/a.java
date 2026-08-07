package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.internal.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class a<T extends l<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, T> f42261a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Integer> f42262b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f42263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42265e;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0666a implements l.a<T> {
        C0666a() {
        }

        @Override // com.google.android.material.internal.l.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T t11, boolean z11) {
            if (!z11) {
                a aVar = a.this;
                if (!aVar.r(t11, aVar.f42265e)) {
                    return;
                }
            } else if (!a.this.g(t11)) {
                return;
            }
            a.this.m();
        }
    }

    public interface b {
        void a(@NonNull Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(@NonNull l<T> lVar) {
        int id2 = lVar.getId();
        if (this.f42262b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t11 = this.f42261a.get(Integer.valueOf(k()));
        if (t11 != null) {
            r(t11, false);
        }
        boolean zAdd = this.f42262b.add(Integer.valueOf(id2));
        if (!lVar.isChecked()) {
            lVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.f42263c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(@NonNull l<T> lVar, boolean z11) {
        int id2 = lVar.getId();
        if (!this.f42262b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z11 && this.f42262b.size() == 1 && this.f42262b.contains(Integer.valueOf(id2))) {
            lVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f42262b.remove(Integer.valueOf(id2));
        if (lVar.isChecked()) {
            lVar.setChecked(false);
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t11) {
        this.f42261a.put(Integer.valueOf(t11.getId()), t11);
        if (t11.isChecked()) {
            g(t11);
        }
        t11.setInternalOnCheckedChangeListener(new C0666a());
    }

    public void f(int i11) {
        T t11 = this.f42261a.get(Integer.valueOf(i11));
        if (t11 != null && g(t11)) {
            m();
        }
    }

    public void h() {
        boolean zIsEmpty = this.f42262b.isEmpty();
        Iterator<T> it = this.f42261a.values().iterator();
        while (it.hasNext()) {
            r(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        m();
    }

    @NonNull
    public Set<Integer> i() {
        return new HashSet(this.f42262b);
    }

    @NonNull
    public List<Integer> j(@NonNull ViewGroup viewGroup) {
        Set<Integer> setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof l) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f42264d || this.f42262b.isEmpty()) {
            return -1;
        }
        return this.f42262b.iterator().next().intValue();
    }

    public boolean l() {
        return this.f42264d;
    }

    public void n(T t11) {
        t11.setInternalOnCheckedChangeListener(null);
        this.f42261a.remove(Integer.valueOf(t11.getId()));
        this.f42262b.remove(Integer.valueOf(t11.getId()));
    }

    public void o(b bVar) {
        this.f42263c = bVar;
    }

    public void p(boolean z11) {
        this.f42265e = z11;
    }

    public void q(boolean z11) {
        if (this.f42264d != z11) {
            this.f42264d = z11;
            h();
        }
    }
}
