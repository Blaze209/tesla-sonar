package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends androidx.appcompat.view.menu.e {

    @NonNull
    private final Class<?> B;
    private final int C;

    public b(@NonNull Context context, @NonNull Class<?> cls, int i11) {
        super(context);
        this.B = cls;
        this.C = i11;
    }

    @Override // androidx.appcompat.view.menu.e
    @NonNull
    protected MenuItem a(int i11, int i12, int i13, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.C) {
            h0();
            MenuItem menuItemA = super.a(i11, i12, i13, charSequence);
            if (menuItemA instanceof g) {
                ((g) menuItemA).t(true);
            }
            g0();
            return menuItemA;
        }
        String simpleName = this.B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i11, int i12, int i13, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.B.getSimpleName() + " does not support submenus");
    }
}
