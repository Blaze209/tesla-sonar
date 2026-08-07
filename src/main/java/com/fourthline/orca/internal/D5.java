package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface D5 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final bo0.j f25314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3447jx f25315b;

        public a(bo0.j range, InterfaceC3447jx item) {
            p013kotlin.jvm.internal.s.k(range, "range");
            p013kotlin.jvm.internal.s.k(item, "item");
            this.f25314a = range;
            this.f25315b = item;
        }

        public final InterfaceC3447jx a() {
            return this.f25315b;
        }

        public final bo0.j b() {
            return this.f25314a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f25314a, aVar.f25314a) && p013kotlin.jvm.internal.s.f(this.f25315b, aVar.f25315b);
        }

        public int hashCode() {
            return (this.f25314a.hashCode() * 31) + this.f25315b.hashCode();
        }

        public String toString() {
            return "CountriesFilterResult(range=" + this.f25314a + ", item=" + this.f25315b + ")";
        }
    }

    List a(String str, List list);
}
