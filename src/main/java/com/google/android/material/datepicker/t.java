package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class t<S> extends y<S> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j<S> f42047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.material.datepicker.a f42048p;

    class a extends x<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.x
        public void a() {
            Iterator<x<S>> it = t.this.f42074m.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.x
        public void b(S s11) {
            Iterator<x<S>> it = t.this.f42074m.iterator();
            while (it.hasNext()) {
                it.next().b(s11);
            }
        }
    }

    @NonNull
    static <T> t<T> j(j<T> jVar, int i11, @NonNull com.google.android.material.datepicker.a aVar) {
        t<T> tVar = new t<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable("DATE_SELECTOR_KEY", jVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        tVar.setArguments(bundle);
        return tVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f42046n = bundle.getInt("THEME_RES_ID_KEY");
        this.f42047o = (j) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f42048p = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f42047o.h1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f42046n)), viewGroup, bundle, this.f42048p, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f42046n);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f42047o);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f42048p);
    }
}
