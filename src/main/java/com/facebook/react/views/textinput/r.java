package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SpannableStringBuilder f23844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f23845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CharSequence f23850g;

    public r(EditText editText) {
        this.f23844a = new SpannableStringBuilder(editText.getText());
        this.f23845b = editText.getTextSize();
        this.f23848e = editText.getInputType();
        this.f23850g = editText.getHint();
        this.f23846c = editText.getMinLines();
        this.f23847d = editText.getMaxLines();
        this.f23849f = editText.getBreakStrategy();
    }

    public void a(EditText editText) {
        editText.setText(this.f23844a);
        editText.setTextSize(0, this.f23845b);
        editText.setMinLines(this.f23846c);
        editText.setMaxLines(this.f23847d);
        editText.setInputType(this.f23848e);
        editText.setHint(this.f23850g);
        editText.setBreakStrategy(this.f23849f);
    }
}
