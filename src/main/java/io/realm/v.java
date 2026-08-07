package io.realm;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public interface v {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79175b;

        public a(int i11, int i12) {
            this.f79174a = i11;
            this.f79175b = i12;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", Integer.valueOf(this.f79174a), Integer.valueOf(this.f79175b));
        }
    }

    public enum b {
        INITIAL,
        UPDATE,
        ERROR
    }
}
