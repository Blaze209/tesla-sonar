package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class I2 {

    public static final class a extends I2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46346a;

        public a(int i11) {
            this.f46346a = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f46346a == ((a) obj).f46346a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f46346a);
        }

        public final String toString() {
            return "Delay(delayMillis=" + this.f46346a + ")";
        }
    }

    public static final class b extends I2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46347a = new b();
    }

    public static final class c extends I2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46348a = new c();
    }

    public static final class d extends I2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f46349a = new d();
    }
}
