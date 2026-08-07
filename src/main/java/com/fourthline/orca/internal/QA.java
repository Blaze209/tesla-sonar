package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface QA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27433a = a.f27434a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27434a = new a();

        private a() {
        }

        public static /* synthetic */ d b(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = R.string.shared_validation_required;
            }
            return aVar.b(i11);
        }

        public final d a(int i11, int i12) {
            return new d(i11, i12);
        }

        public static /* synthetic */ d a(a aVar, int i11, int i12, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                i12 = i11;
            }
            return aVar.a(i11, i12);
        }

        public final c a(int i11, String... arguments) {
            p013kotlin.jvm.internal.s.k(arguments, "arguments");
            return new c(i11, p013kotlin.collections.n.h(arguments));
        }

        public final d b(int i11) {
            return a(R.string.shared_validation_required, i11);
        }

        public static /* synthetic */ d a(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = R.string.shared_validation_invalid;
            }
            return aVar.a(i11);
        }

        public final d a(int i11) {
            return a(R.string.shared_validation_invalid, i11);
        }
    }

    public static final class b implements QA {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f27435b = new b();

        private b() {
        }
    }

    public static final class c implements QA {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f27437c;

        public c(int i11, List arguments) {
            p013kotlin.jvm.internal.s.k(arguments, "arguments");
            this.f27436b = i11;
            this.f27437c = arguments;
        }

        public final List a() {
            return this.f27437c;
        }

        public final int b() {
            return this.f27436b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f27436b == cVar.f27436b && p013kotlin.jvm.internal.s.f(this.f27437c, cVar.f27437c);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f27436b) * 31) + this.f27437c.hashCode();
        }

        public String toString() {
            return "Formatted(resource=" + this.f27436b + ", arguments=" + this.f27437c + ")";
        }
    }

    public static final class e implements QA {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27440b;

        public e(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            this.f27440b = value;
        }

        public final String a() {
            return this.f27440b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f27440b, ((e) obj).f27440b);
        }

        public int hashCode() {
            return this.f27440b.hashCode();
        }

        public String toString() {
            return "SimpleString(value=" + this.f27440b + ")";
        }
    }

    public static final class d implements QA {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27439c;

        public d(int i11, int i12) {
            this.f27438b = i11;
            this.f27439c = i12;
        }

        public final int a() {
            return this.f27439c;
        }

        public final int b() {
            return this.f27438b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f27438b == dVar.f27438b && this.f27439c == dVar.f27439c;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f27438b) * 31) + Integer.hashCode(this.f27439c);
        }

        public String toString() {
            return "Localised(resource=" + this.f27438b + ", accessibilityResource=" + this.f27439c + ")";
        }

        public /* synthetic */ d(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i13 & 2) != 0 ? i11 : i12);
        }
    }
}
