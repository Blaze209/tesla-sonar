package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes5.dex */
class a extends androidx.core.view.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AccessibilityNodeInfoCompat.AccessibilityActionCompat f43021d;

    public a(Context context, int i11) {
        this.f43021d = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i11));
    }

    @Override // androidx.core.view.a
    public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.g(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.b(this.f43021d);
    }
}
