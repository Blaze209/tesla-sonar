package org.apache.commons.lang3.exception;

import hq0.a;
import hq0.b;

/* JADX INFO: loaded from: classes9.dex */
public class ContextedException extends Exception implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f98503a = new a();

    @Override // hq0.b
    public String a(String str) {
        return this.f98503a.a(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return a(super.getMessage());
    }
}
