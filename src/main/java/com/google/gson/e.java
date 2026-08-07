package com.google.gson;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f44817d = new e("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f44818e = new e("\n", "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f44821c;

    private e(String str, String str2, boolean z11) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f44819a = str;
        this.f44820b = str2;
        this.f44821c = z11;
    }

    public String a() {
        return this.f44820b;
    }

    public String b() {
        return this.f44819a;
    }

    public boolean c() {
        return this.f44821c;
    }
}
