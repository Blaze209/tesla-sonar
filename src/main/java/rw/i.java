package rw;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f109228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f109229b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f109230a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f109231b = com.google.firebase.remoteconfig.internal.m.f44687j;

        @NonNull
        public i c() {
            return new i(this);
        }

        @NonNull
        public b d(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
            }
            this.f109230a = j11;
            return this;
        }

        @NonNull
        public b e(long j11) {
            if (j11 >= 0) {
                this.f109231b = j11;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j11 + " is an invalid argument");
        }
    }

    private i(b bVar) {
        this.f109228a = bVar.f109230a;
        this.f109229b = bVar.f109231b;
    }
}
