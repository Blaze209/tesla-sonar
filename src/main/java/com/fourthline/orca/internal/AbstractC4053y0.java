package com.fourthline.orca.internal;

import java.io.File;

/* JADX INFO: renamed from: com.fourthline.orca.internal.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4053y0 {
    public static final String a(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        return str + "/bundle.zip";
    }

    public static final File a(File file) {
        p013kotlin.jvm.internal.s.k(file, "<this>");
        return new File(file, "bundle.zip");
    }
}
