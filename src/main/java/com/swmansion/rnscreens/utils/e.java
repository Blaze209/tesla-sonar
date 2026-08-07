package com.swmansion.rnscreens.utils;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00060\u0007j\u0002`\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n*\n\u0010\u000b\"\u00020\u00072\u00020\u0007*\n\u0010\r\"\u00020\f2\u00020\f¨\u0006\u000e"}, d2 = {"Landroid/view/View;", "", "insetType", "Landroid/view/WindowInsets;", "sourceWindowInsets", "", "ignoreVisibility", "Lk5/e;", "Lcom/swmansion/rnscreens/utils/InsetsCompat;", "resolveInsetsOrZero", "(Landroid/view/View;ILandroid/view/WindowInsets;Z)Lk5/e;", "InsetsCompat", "Landroid/graphics/Insets;", "InsetsPlatform", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {
    public static final k5.e resolveInsetsOrZero(View view, int i11, WindowInsets windowInsets, boolean z11) {
        s.k(view, "<this>");
        if (windowInsets == null) {
            k5.e NONE = k5.e.f84923e;
            s.j(NONE, "NONE");
            return NONE;
        }
        WindowInsetsCompat windowInsetsCompatZ = WindowInsetsCompat.z(windowInsets, view);
        s.j(windowInsetsCompatZ, "toWindowInsetsCompat(...)");
        if (z11) {
            k5.e eVarG = windowInsetsCompatZ.g(i11);
            s.h(eVarG);
            return eVarG;
        }
        k5.e eVarF = windowInsetsCompatZ.f(i11);
        s.h(eVarF);
        return eVarF;
    }

    public static /* synthetic */ k5.e resolveInsetsOrZero$default(View view, int i11, WindowInsets windowInsets, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            windowInsets = view.getRootWindowInsets();
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return resolveInsetsOrZero(view, i11, windowInsets, z11);
    }
}
