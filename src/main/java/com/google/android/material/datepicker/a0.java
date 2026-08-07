package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
class a0 extends LinearLayoutManager {

    class a extends androidx.recyclerview.widget.p {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.p
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    a0(Context context, int i11, boolean z11) {
        super(context, i11, z11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void O1(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i11) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i11);
        P1(aVar);
    }
}
