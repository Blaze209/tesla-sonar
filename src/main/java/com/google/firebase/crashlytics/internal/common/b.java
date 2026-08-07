package com.google.firebase.crashlytics.internal.common;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class b extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gv.f0 f43937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f43939c;

    b(gv.f0 f0Var, String str, File file) {
        if (f0Var == null) {
            throw new NullPointerException("Null report");
        }
        this.f43937a = f0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f43938b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f43939c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.c0
    public gv.f0 b() {
        return this.f43937a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.c0
    public File c() {
        return this.f43939c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.c0
    public String d() {
        return this.f43938b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f43937a.equals(c0Var.b()) && this.f43938b.equals(c0Var.d()) && this.f43939c.equals(c0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f43937a.hashCode() ^ 1000003) * 1000003) ^ this.f43938b.hashCode()) * 1000003) ^ this.f43939c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f43937a + ", sessionId=" + this.f43938b + ", reportFile=" + this.f43939c + "}";
    }
}
