package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.l;

/* JADX INFO: loaded from: classes5.dex */
public interface l<T extends l<T>> extends Checkable {

    public interface a<C> {
        void a(C c11, boolean z11);
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
