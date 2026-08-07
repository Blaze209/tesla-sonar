package com.fourthline.orca.internal;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Xj {
    public static final String a(Tj tj2, File fourthlineDirectory) {
        p013kotlin.jvm.internal.s.k(tj2, "<this>");
        p013kotlin.jvm.internal.s.k(fourthlineDirectory, "fourthlineDirectory");
        String str = fourthlineDirectory.getAbsolutePath() + "/animations/";
        new File(str).mkdirs();
        return str + tj2.b();
    }
}
