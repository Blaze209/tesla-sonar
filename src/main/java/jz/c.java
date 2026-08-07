package jz;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f84442b = new c("DEF");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f84443a;

    public c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The compression algorithm name must not be null");
        }
        this.f84443a = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f84443a.hashCode();
    }

    public String toString() {
        return this.f84443a;
    }
}
