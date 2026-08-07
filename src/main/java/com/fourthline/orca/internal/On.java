package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface On {

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.On$a$a, reason: collision with other inner class name */
        public static final class C0509a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0509a f27203a = new C0509a();

            private C0509a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0509a);
            }

            public int hashCode() {
                return -506327304;
            }

            public String toString() {
                return "Succeed";
            }
        }
    }

    Object a(Continuation continuation);
}
