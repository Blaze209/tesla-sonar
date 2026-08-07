package io.realm.internal;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.realm.n0;
import io.realm.z;

/* JADX INFO: loaded from: classes9.dex */
public interface o extends n0 {

    public static class a<E extends n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
        public int f79099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f79100b;

        public a(int i11, E e11) {
            this.f79099a = i11;
            this.f79100b = e11;
        }
    }

    void d();

    z f();
}
