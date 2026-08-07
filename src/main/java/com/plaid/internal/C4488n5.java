package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: renamed from: com.plaid.internal.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4488n5 implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f47932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f47933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f47934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatButton f47935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f47936e;

    public C4488n5(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull AppCompatButton appCompatButton, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f47932a = linearLayout;
        this.f47933b = textView;
        this.f47934c = textView2;
        this.f47935d = appCompatButton;
        this.f47936e = linearLayout3;
    }

    @Override // gb.a
    @NonNull
    public final View getRoot() {
        return this.f47932a;
    }
}
