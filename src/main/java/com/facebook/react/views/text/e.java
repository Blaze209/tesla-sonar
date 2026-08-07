package com.facebook.react.views.text;

import com.facebook.react.uimanager.j0;

/* JADX INFO: loaded from: classes4.dex */
public class e extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23687a = null;

    public String b() {
        return this.f23687a;
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public boolean isVirtual() {
        return true;
    }

    @no.a(name = "text")
    public void setText(String str) {
        this.f23687a = str;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.j0
    public String toString() {
        return getViewClass() + " [text: " + this.f23687a + "]";
    }
}
