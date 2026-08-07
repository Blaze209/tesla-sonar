package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes5.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f42935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f42936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f42937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f42938d;

    s(@NonNull r rVar) {
        this.f42935a = rVar.f42905a;
        this.f42936b = rVar;
        this.f42937c = rVar.getContext();
        this.f42938d = rVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i11, int i12, int i13) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    z5.c.a h() {
        return null;
    }

    boolean i(int i11) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z11) {
    }

    final void r() {
        this.f42936b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
