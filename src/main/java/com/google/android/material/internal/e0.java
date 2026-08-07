package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
public class e0 extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42332a;

    public e0(Context context) {
        this(context, null);
    }

    public final void b(int i11, boolean z11) {
        super.setVisibility(i11);
        if (z11) {
            this.f42332a = i11;
        }
    }

    public final int getUserSetVisibility() {
        return this.f42332a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        b(i11, true);
    }

    public e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e0(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f42332a = getVisibility();
    }
}
