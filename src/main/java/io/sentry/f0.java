package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f80545b;

    public f0(String str) {
        Pattern patternCompile;
        this.f80544a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            f5.r().getOptions().getLogger().c(b7.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f80545b = patternCompile;
    }

    public String a() {
        return this.f80544a;
    }

    public boolean b(String str) {
        Pattern pattern = this.f80545b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f80544a, ((f0) obj).f80544a);
    }

    public int hashCode() {
        return Objects.hash(this.f80544a);
    }
}
