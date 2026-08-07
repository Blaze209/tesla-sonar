package ql0;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes8.dex */
public class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105674a;

    o(@NonNull String str) {
        this.f105674a = str;
    }

    @NonNull
    public static <T> o<T> b(@NonNull String str) {
        return new o<>(str);
    }

    public T a(@NonNull q qVar) {
        return (T) qVar.a(this);
    }

    @NonNull
    public T c(@NonNull q qVar) {
        T tA = a(qVar);
        if (tA != null) {
            return tA;
        }
        throw new NullPointerException(this.f105674a);
    }

    public void d(@NonNull q qVar, T t11) {
        qVar.b(this, t11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f105674a.equals(((o) obj).f105674a);
    }

    public int hashCode() {
        return this.f105674a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.f105674a + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}
