package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZD extends Bo {

    public static final class a extends ZD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30007a = new a();

        private a() {
            super("network_connection_lost", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -901154040;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ConnectionLost";
        }
    }

    public static final class b extends ZD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message) {
            super("network_generic", null);
            p013kotlin.jvm.internal.s.k(message, "message");
            this.f30008a = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f30008a, ((b) obj).f30008a);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f30008a;
        }

        public int hashCode() {
            return this.f30008a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Fatal(message=" + this.f30008a + ")";
        }
    }

    public static final class c extends ZD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30009a = new c();

        private c() {
            super("network_recoverable", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2036370072;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Recoverable";
        }
    }

    public /* synthetic */ ZD(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ZD(String str) {
        super(null, null, str, 3, null);
    }
}
