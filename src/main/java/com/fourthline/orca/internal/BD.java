package com.fourthline.orca.internal;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BD {
    public static final String a(Un un2, File fourthlineDirectory) {
        p013kotlin.jvm.internal.s.k(un2, "<this>");
        p013kotlin.jvm.internal.s.k(fourthlineDirectory, "fourthlineDirectory");
        String str = fourthlineDirectory.getAbsolutePath() + "/videos/";
        new File(str).mkdirs();
        return str + un2.b();
    }
}
