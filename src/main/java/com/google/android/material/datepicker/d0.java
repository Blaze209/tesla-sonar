package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class d0 extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p<?> f41954a;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f41955a;

        a(int i11) {
            this.f41955a = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d0.this.f41954a.C(d0.this.f41954a.t().f(u.b(this.f41955a, d0.this.f41954a.v().f42051b)));
            d0.this.f41954a.D(p.l.DAY);
        }
    }

    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final TextView f41957a;

        b(TextView textView) {
            super(textView);
            this.f41957a = textView;
        }
    }

    d0(p<?> pVar) {
        this.f41954a = pVar;
    }

    @NonNull
    private View.OnClickListener b(int i11) {
        return new a(i11);
    }

    int c(int i11) {
        return i11 - this.f41954a.t().l().f42052c;
    }

    int d(int i11) {
        return this.f41954a.t().l().f42052c + i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i11) {
        int iD = d(i11);
        bVar.f41957a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iD)));
        TextView textView = bVar.f41957a;
        textView.setContentDescription(k.i(textView.getContext(), iD));
        c cVarU = this.f41954a.u();
        Calendar calendarK = c0.k();
        com.google.android.material.datepicker.b bVar2 = calendarK.get(1) == iD ? cVarU.f41946f : cVarU.f41944d;
        Iterator<Long> it = this.f41954a.w().u1().iterator();
        while (it.hasNext()) {
            calendarK.setTimeInMillis(it.next().longValue());
            if (calendarK.get(1) == iD) {
                bVar2 = cVarU.f41945e;
            }
        }
        bVar2.d(bVar.f41957a);
        bVar.f41957a.setOnClickListener(b(iD));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(zs.i.f128759u, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f41954a.t().m();
    }
}
