package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
abstract class y<S> extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final LinkedHashSet<x<S>> f42074m = new LinkedHashSet<>();

    y() {
    }

    boolean b(x<S> xVar) {
        return this.f42074m.add(xVar);
    }

    void i() {
        this.f42074m.clear();
    }
}
