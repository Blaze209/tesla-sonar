package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C3586n6 extends Bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33822a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3586n6(String identifier) {
        super("DataWorkRequest with id '" + identifier + "' is not mappable to NetworkRequest.", null, "data_work_request_failed", 2, null);
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        this.f33822a = identifier;
    }
}
