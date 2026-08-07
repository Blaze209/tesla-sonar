package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3393il extends Bo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3393il(Throwable original) {
        super(original.getMessage(), original.getCause(), "network_error");
        p013kotlin.jvm.internal.s.k(original, "original");
    }
}
