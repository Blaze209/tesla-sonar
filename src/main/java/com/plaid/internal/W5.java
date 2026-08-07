package com.plaid.internal;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class W5 implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f46795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f46796b;

    public W5(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f46795a = frameLayout;
        this.f46796b = frameLayout2;
    }

    @Override // gb.a
    @NonNull
    public final View getRoot() {
        return this.f46795a;
    }
}
