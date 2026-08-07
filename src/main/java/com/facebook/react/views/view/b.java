package com.facebook.react.views.view;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/views/view/b;", "", "<init>", "()V", "", "r", "g", "b", "a", "", "(DDDD)I", "value", "(D)I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23864a = new b();

    private b() {
    }

    private final int a(double value) {
        return Math.max(0, Math.min(255, yn0.a.c(value)));
    }

    public static final int b(double r11, double g11, double b11, double a11) {
        b bVar = f23864a;
        return (bVar.a(r11) << 16) | (bVar.a(a11 * ((double) 255)) << 24) | (bVar.a(g11) << 8) | bVar.a(b11);
    }
}
