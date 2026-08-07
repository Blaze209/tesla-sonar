package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3210eF implements Rs {
    @Override // com.fourthline.orca.internal.Rs
    public Bo a() {
        return AbstractC3594nE.a.f33881c;
    }

    @Override // com.fourthline.orca.internal.Rs
    public Bo a(Bo cause) {
        p013kotlin.jvm.internal.s.k(cause, "cause");
        AbstractC3594nE.h.a aVar = AbstractC3594nE.h.f33887e;
        String message = cause.getMessage();
        if (message == null) {
            message = "FL Developer error. Throwable message was not provided";
        }
        return AbstractC3594nE.h.a.a(aVar, message, null, 2, null);
    }
}
