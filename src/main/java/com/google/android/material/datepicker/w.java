package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
class w extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.datepicker.a f42065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j<?> f42066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f42067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p.m f42068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42069e;

    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f42070a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f42070a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
            if (this.f42070a.getAdapter().r(i11)) {
                w.this.f42068d.a(this.f42070a.getAdapter().getItem(i11).longValue());
            }
        }
    }

    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final TextView f42072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MaterialCalendarGridView f42073b;

        b(@NonNull LinearLayout linearLayout, boolean z11) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(zs.g.G);
            this.f42072a = textView;
            ViewCompat.q0(textView, true);
            this.f42073b = (MaterialCalendarGridView) linearLayout.findViewById(zs.g.C);
            if (z11) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    w(@NonNull Context context, j<?> jVar, @NonNull com.google.android.material.datepicker.a aVar, n nVar, p.m mVar) {
        u uVarL = aVar.l();
        u uVarH = aVar.h();
        u uVarK = aVar.k();
        if (uVarL.compareTo(uVarK) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (uVarK.compareTo(uVarH) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f42069e = (v.f42057g * p.x(context)) + (r.u(context) ? p.x(context) : 0);
        this.f42065a = aVar;
        this.f42066b = jVar;
        this.f42067c = nVar;
        this.f42068d = mVar;
        setHasStableIds(true);
    }

    @NonNull
    u b(int i11) {
        return this.f42065a.l().j(i11);
    }

    @NonNull
    CharSequence c(int i11) {
        return b(i11).h();
    }

    int d(@NonNull u uVar) {
        return this.f42065a.l().k(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i11) {
        u uVarJ = this.f42065a.l().j(i11);
        bVar.f42072a.setText(uVarJ.h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f42073b.findViewById(zs.g.C);
        if (materialCalendarGridView.getAdapter() == null || !uVarJ.equals(materialCalendarGridView.getAdapter().f42059a)) {
            v vVar = new v(uVarJ, this.f42066b, this.f42065a, this.f42067c);
            materialCalendarGridView.setNumColumns(uVarJ.f42053d);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(zs.i.f128757s, viewGroup, false);
        if (!r.u(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f42069e));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f42065a.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i11) {
        return this.f42065a.l().j(i11).i();
    }
}
