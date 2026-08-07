package com.stripe.android.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/k0;", "", "<init>", "()V", "a", "b", "Lcom/stripe/android/model/k0$a;", "Lcom/stripe/android/model/k0$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class k0 {

    /* JADX INFO: renamed from: com.stripe.android.model.k0$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/k0$b;", "Lcom/stripe/android/model/k0;", "", "month", "year", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Validated extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int month;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int year;

        public Validated(int i11, int i12) {
            super(null);
            this.month = i11;
            this.year = i12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMonth() {
            return this.month;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Validated)) {
                return false;
            }
            Validated validated = (Validated) other;
            return this.month == validated.month && this.year == validated.year;
        }

        public int hashCode() {
            return (Integer.hashCode(this.month) * 31) + Integer.hashCode(this.year);
        }

        public String toString() {
            return "Validated(month=" + this.month + ", year=" + this.year + ")";
        }
    }

    public /* synthetic */ k0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k0() {
    }

    /* JADX INFO: renamed from: com.stripe.android.model.k0$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001d\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010!\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006\""}, d2 = {"Lcom/stripe/android/model/k0$a;", "Lcom/stripe/android/model/k0;", "", "month", "year", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(II)V", "Lcom/stripe/android/model/k0$b;", "h", "()Lcom/stripe/android/model/k0$b;", "b", "()Ljava/lang/String;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "Z", "f", "()Z", "isMonthValid", "e", "isComplete", "g", "isPartialEntry", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unvalidated extends k0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Unvalidated f51306g = new Unvalidated("", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String month;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String year;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isMonthValid;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean isComplete;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean isPartialEntry;

        /* JADX INFO: renamed from: com.stripe.android.model.k0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/k0$a$a;", "", "<init>", "()V", "", "input", "Lcom/stripe/android/model/k0$a;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/k0$a;", "EMPTY", "Lcom/stripe/android/model/k0$a;", "b", "()Lcom/stripe/android/model/k0$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Unvalidated a(String input) throws IOException {
                p013kotlin.jvm.internal.s.k(input, "input");
                for (int i11 = 0; i11 < input.length(); i11++) {
                    char cCharAt = input.charAt(i11);
                    if (!Character.isDigit(cCharAt) && !p013kotlin.text.a.c(cCharAt) && cCharAt != '/') {
                        return b();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                int length = input.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt2 = input.charAt(i12);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                }
                String string = sb2.toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                return new Unvalidated(p013kotlin.text.t.T1(string, 2), p013kotlin.text.t.M1(string, 2));
            }

            public final Unvalidated b() {
                return Unvalidated.f51306g;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String month, String year) {
            Object objB;
            super(null);
            p013kotlin.jvm.internal.s.k(month, "month");
            p013kotlin.jvm.internal.s.k(year, "year");
            this.month = month;
            this.year = year;
            boolean z11 = false;
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                int i11 = Integer.parseInt(month);
                objB = jn0.s.b(Boolean.valueOf(1 <= i11 && i11 < 13));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            this.isMonthValid = ((Boolean) (jn0.s.g(objB) ? Boolean.FALSE : objB)).booleanValue();
            boolean z12 = this.month.length() + this.year.length() == 4;
            this.isComplete = z12;
            if (!z12 && this.month.length() + this.year.length() > 0) {
                z11 = true;
            }
            this.isPartialEntry = z11;
        }

        public final String b() {
            return this.year.length() == 3 ? "" : p013kotlin.collections.v.y0(p013kotlin.collections.v.p(p013kotlin.text.t.K0(this.month, 2, '0'), p013kotlin.text.t.K0(p013kotlin.text.t.U1(this.year, 2), 2, '0')), "", null, null, 0, null, null, 62, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMonth() {
            return this.month;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getYear() {
            return this.year;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unvalidated)) {
                return false;
            }
            Unvalidated unvalidated = (Unvalidated) other;
            return p013kotlin.jvm.internal.s.f(this.month, unvalidated.month) && p013kotlin.jvm.internal.s.f(this.year, unvalidated.year);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsMonthValid() {
            return this.isMonthValid;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsPartialEntry() {
            return this.isPartialEntry;
        }

        public final Validated h() {
            Object objB;
            String str = this.month;
            String str2 = this.year;
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(new Validated(Integer.parseInt(str), com.stripe.android.view.h1.f54917a.a(Integer.parseInt(str2))));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            return (Validated) objB;
        }

        public int hashCode() {
            return (this.month.hashCode() * 31) + this.year.hashCode();
        }

        public String toString() {
            return "Unvalidated(month=" + this.month + ", year=" + this.year + ")";
        }

        public Unvalidated(int i11, int i12) {
            this(String.valueOf(i11), String.valueOf(i12));
        }
    }
}
