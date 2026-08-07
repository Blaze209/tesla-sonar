package com.henninghall.date_picker;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f45196a;

    public g(l lVar) {
        this.f45196a = lVar;
    }

    private String a(String str) {
        return " " + str + " ";
    }

    private boolean c(String str) {
        return this.f45196a.I() == ny.c.nativeAndroid && str.length() == 1;
    }

    public String b(String str) {
        return !c(str) ? str : a(str);
    }
}
