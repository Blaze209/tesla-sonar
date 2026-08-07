package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class M0 extends Bo {

    public static final class a extends M0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bo f26879a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bo error) {
            super("selection_unsupported", error, null);
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f26879a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f26879a, ((a) obj).f26879a);
        }

        public int hashCode() {
            return this.f26879a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "SelectionUnsupported(error=" + this.f26879a + ")";
        }
    }

    public /* synthetic */ M0(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2);
    }

    private M0(String str, Throwable th2) {
        super(str, th2, "base_selector_error");
    }
}
