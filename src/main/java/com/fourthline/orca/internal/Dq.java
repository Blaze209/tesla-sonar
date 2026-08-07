package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface Dq extends JD {

    public static final class a implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25486a = new a();

        private a() {
        }
    }

    public static final class b implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f25487a;

        public b(boolean z11) {
            this.f25487a = z11;
        }

        public final boolean a() {
            return this.f25487a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f25487a == ((b) obj).f25487a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f25487a);
        }

        public String toString() {
            return "OnBirthDateInputViewFocusChanged(isFocused=" + this.f25487a + ")";
        }
    }

    public static final class c implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25488a;

        public c(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            this.f25488a = value;
        }

        public final String a() {
            return this.f25488a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f25488a, ((c) obj).f25488a);
        }

        public int hashCode() {
            return this.f25488a.hashCode();
        }

        public String toString() {
            return "OnBirthDateValueChanged(value=" + this.f25488a + ")";
        }
    }

    public static final class d implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f25489a;

        public d(boolean z11) {
            this.f25489a = z11;
        }

        public final boolean a() {
            return this.f25489a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f25489a == ((d) obj).f25489a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f25489a);
        }

        public String toString() {
            return "OnFirstNameInputViewFocusChanged(isFocused=" + this.f25489a + ")";
        }
    }

    public static final class e implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25490a;

        public e(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            this.f25490a = value;
        }

        public final String a() {
            return this.f25490a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f25490a, ((e) obj).f25490a);
        }

        public int hashCode() {
            return this.f25490a.hashCode();
        }

        public String toString() {
            return "OnFirstNameInputViewValueChanged(value=" + this.f25490a + ")";
        }
    }

    public static final class f implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f25491a;

        public f(boolean z11) {
            this.f25491a = z11;
        }

        public final boolean a() {
            return this.f25491a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f25491a == ((f) obj).f25491a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f25491a);
        }

        public String toString() {
            return "OnGenderInputViewFocusChanged(isFocused=" + this.f25491a + ")";
        }
    }

    public static final class g implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map.Entry f25492a;

        public g(Map.Entry gender) {
            p013kotlin.jvm.internal.s.k(gender, "gender");
            this.f25492a = gender;
        }

        public final Map.Entry a() {
            return this.f25492a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f25492a, ((g) obj).f25492a);
        }

        public int hashCode() {
            return this.f25492a.hashCode();
        }

        public String toString() {
            return "OnGenderSelected(gender=" + this.f25492a + ")";
        }
    }

    public static final class h implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f25493a;

        public h(boolean z11) {
            this.f25493a = z11;
        }

        public final boolean a() {
            return this.f25493a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f25493a == ((h) obj).f25493a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f25493a);
        }

        public String toString() {
            return "OnLastNameInputViewFocusChanged(isFocused=" + this.f25493a + ")";
        }
    }

    public static final class i implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25494a;

        public i(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            this.f25494a = value;
        }

        public final String a() {
            return this.f25494a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && p013kotlin.jvm.internal.s.f(this.f25494a, ((i) obj).f25494a);
        }

        public int hashCode() {
            return this.f25494a.hashCode();
        }

        public String toString() {
            return "OnLastNameInputViewValueChanged(value=" + this.f25494a + ")";
        }
    }

    public static final class j implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f25495a = new j();

        private j() {
        }
    }

    public static final class k implements Dq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f25496a = new k();

        private k() {
        }
    }
}
