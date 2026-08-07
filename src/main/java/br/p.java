package br;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f17940a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f17941b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f17940a.add(str)) {
            f17941b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f17941b;
    }
}
