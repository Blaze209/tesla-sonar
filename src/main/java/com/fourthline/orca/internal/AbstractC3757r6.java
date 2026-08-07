package com.fourthline.orca.internal;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.fourthline.orca.internal.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3757r6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat b(SimpleDateFormat simpleDateFormat) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
