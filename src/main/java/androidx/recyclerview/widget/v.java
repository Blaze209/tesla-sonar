package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class v extends androidx.core.view.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RecyclerView f13586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f13587e;

    public static class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final v f13588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<View, androidx.core.view.a> f13589e = new WeakHashMap();

        public a(@NonNull v vVar) {
            this.f13588d = vVar;
        }

        @Override // androidx.core.view.a
        public boolean a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f13589e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public AccessibilityNodeProviderCompat b(@NonNull View view) {
            androidx.core.view.a aVar = this.f13589e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f13589e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f13588d.o() || this.f13588d.f13586d.getLayoutManager() == null) {
                super.g(view, accessibilityNodeInfoCompat);
                return;
            }
            this.f13588d.f13586d.getLayoutManager().U0(view, accessibilityNodeInfoCompat);
            androidx.core.view.a aVar = this.f13589e.get(view);
            if (aVar != null) {
                aVar.g(view, accessibilityNodeInfoCompat);
            } else {
                super.g(view, accessibilityNodeInfoCompat);
            }
        }

        @Override // androidx.core.view.a
        public void h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f13589e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f13589e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i11, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f13588d.o() || this.f13588d.f13586d.getLayoutManager() == null) {
                return super.j(view, i11, bundle);
            }
            androidx.core.view.a aVar = this.f13589e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i11, bundle)) {
                    return true;
                }
            } else if (super.j(view, i11, bundle)) {
                return true;
            }
            return this.f13588d.f13586d.getLayoutManager().o1(view, i11, bundle);
        }

        @Override // androidx.core.view.a
        public void l(@NonNull View view, int i11) {
            androidx.core.view.a aVar = this.f13589e.get(view);
            if (aVar != null) {
                aVar.l(view, i11);
            } else {
                super.l(view, i11);
            }
        }

        @Override // androidx.core.view.a
        public void m(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f13589e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        androidx.core.view.a n(View view) {
            return this.f13589e.remove(view);
        }

        void o(View view) {
            androidx.core.view.a aVarM = ViewCompat.m(view);
            if (aVarM == null || aVarM == this) {
                return;
            }
            this.f13589e.put(view, aVarM);
        }
    }

    public v(@NonNull RecyclerView recyclerView) {
        this.f13586d = recyclerView;
        androidx.core.view.a aVarN = n();
        if (aVarN == null || !(aVarN instanceof a)) {
            this.f13587e = new a(this);
        } else {
            this.f13587e = (a) aVarN;
        }
    }

    @Override // androidx.core.view.a
    public void f(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Q0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.g(view, accessibilityNodeInfoCompat);
        if (o() || this.f13586d.getLayoutManager() == null) {
            return;
        }
        this.f13586d.getLayoutManager().S0(accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.a
    public boolean j(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i11, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, i11, bundle)) {
            return true;
        }
        if (o() || this.f13586d.getLayoutManager() == null) {
            return false;
        }
        return this.f13586d.getLayoutManager().m1(i11, bundle);
    }

    @NonNull
    public androidx.core.view.a n() {
        return this.f13587e;
    }

    boolean o() {
        return this.f13586d.w0();
    }
}
