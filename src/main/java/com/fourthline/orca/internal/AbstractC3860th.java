package com.fourthline.orca.internal;

import java.io.File;

/* JADX INFO: renamed from: com.fourthline.orca.internal.th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3860th {
    public static final String a(EnumC3689ph enumC3689ph, File fourthlineDirectory) {
        p013kotlin.jvm.internal.s.k(enumC3689ph, "<this>");
        p013kotlin.jvm.internal.s.k(fourthlineDirectory, "fourthlineDirectory");
        String str = fourthlineDirectory.getAbsolutePath() + "/images/";
        new File(str).mkdirs();
        return str + enumC3689ph.b();
    }
}
