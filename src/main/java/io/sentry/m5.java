package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public final class m5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m5 f80765d = new m5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f80766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f80767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f80768c = new io.sentry.util.a();

    private m5() {
    }

    public static m5 a() {
        return f80765d;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    public Boolean b(String str, boolean z11) {
        d1 d1VarA = this.f80768c.a();
        try {
            if (this.f80766a) {
                Boolean bool = this.f80767b;
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return bool;
            }
            if (str == null) {
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return null;
            }
            boolean z12 = true;
            this.f80766a = true;
            File file = new File(str, "last_crash");
            File file2 = new File(str, ".sentry-native/last_crash");
            try {
                try {
                    if (!file.exists()) {
                        if (!file2.exists()) {
                            z12 = false;
                        } else if (z11) {
                            file2.delete();
                        }
                        this.f80767b = Boolean.valueOf(z12);
                        if (d1VarA != null) {
                            d1VarA.close();
                        }
                        return this.f80767b;
                    }
                    file.delete();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.f80767b = Boolean.valueOf(z12);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return this.f80767b;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void c(boolean z11) {
        d1 d1VarA = this.f80768c.a();
        try {
            if (!this.f80766a) {
                this.f80767b = Boolean.valueOf(z11);
                this.f80766a = true;
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
