package com.plaid.internal;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.plaid.internal.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4506p5 implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f48038a;

    public C4506p5(@NonNull FrameLayout frameLayout) {
        this.f48038a = frameLayout;
    }

    @Override // gb.a
    @NonNull
    public final View getRoot() {
        return this.f48038a;
    }
}
