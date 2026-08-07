package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class o extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41974d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Calendar f41975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41977c;

    static {
        f41974d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public o() {
        Calendar calendarM = c0.m();
        this.f41975a = calendarM;
        this.f41976b = calendarM.getMaximum(7);
        this.f41977c = calendarM.getFirstDayOfWeek();
    }

    private int b(int i11) {
        int i12 = i11 + this.f41977c;
        int i13 = this.f41976b;
        return i12 > i13 ? i12 - i13 : i12;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i11) {
        if (i11 >= this.f41976b) {
            return null;
        }
        return Integer.valueOf(b(i11));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f41976b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i11, View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(zs.i.f128755q, viewGroup, false);
        }
        this.f41975a.set(7, b(i11));
        textView.setText(this.f41975a.getDisplayName(7, f41974d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(zs.k.E), this.f41975a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public o(int i11) {
        Calendar calendarM = c0.m();
        this.f41975a = calendarM;
        this.f41976b = calendarM.getMaximum(7);
        this.f41977c = i11;
    }
}
