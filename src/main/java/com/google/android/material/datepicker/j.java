package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public interface j<S> extends Parcelable {
    static void k3(@NonNull final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                j.o2(editTextArr, view, z11);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: com.google.android.material.datepicker.i
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.internal.d0.r(editText2, false);
            }
        }, 100L);
    }

    static /* synthetic */ void o2(EditText[] editTextArr, View view, boolean z11) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        com.google.android.material.internal.d0.l(view, false);
    }

    S B1();

    void H1(long j11);

    @NonNull
    String J2(Context context);

    @NonNull
    Collection<u5.d<Long, Long>> O2();

    void U0(@NonNull S s11);

    @NonNull
    View h1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, @NonNull a aVar, @NonNull x<S> xVar);

    int k0();

    int r0(Context context);

    boolean s1();

    @NonNull
    String s2(@NonNull Context context);

    @NonNull
    Collection<Long> u1();
}
