package h30;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lh30/f;", "", "<init>", "()V", "a", "b", "c", "Lh30/f$b;", "Lh30/f$c;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Integer> f70591b = d1.i(4, 9, 14);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Set<Integer>> f70592c = v0.m(x.a(14, d1.i(4, 11)), x.a(15, d1.i(4, 11)), x.a(16, d1.i(4, 9, 14)), x.a(19, d1.i(4, 9, 14, 19)));

    /* JADX INFO: renamed from: h30.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh30/f$a;", "", "<init>", "()V", "", "panLength", "", "a", "(I)Ljava/util/Set;", "DEFAULT_PAN_LENGTH", "I", "DEFAULT_SPACE_POSITIONS", "Ljava/util/Set;", "MAX_PAN_LENGTH", "MIN_PAN_LENGTH", "", "SPACE_POSITIONS", "Ljava/util/Map;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<Integer> a(int panLength) {
            Set<Integer> set = (Set) f.f70592c.get(Integer.valueOf(panLength));
            return set == null ? f.f70591b : set;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: h30.f$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010!\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010$\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010(\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b\u001b\u0010'R\u0017\u0010*\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b)\u0010\u0012¨\u0006,"}, d2 = {"Lh30/f$b;", "Lh30/f;", "", "denormalized", "<init>", "(Ljava/lang/String;)V", "", "panLength", "c", "(I)Ljava/lang/String;", "Lh30/f$c;", "l", "(I)Lh30/f$c;", "e", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "j", "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "normalized", "f", "I", "length", "Z", "h", "isMaxLength", "Lh30/a;", "Lh30/a;", "()Lh30/a;", "bin", "k", "isValidLuhn", "a", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unvalidated extends f {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final a f70593j = new a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Set<Character> f70594k = d1.i(Character.valueOf(CoreConstants.DASH_CHAR), ' ');

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String denormalized;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String normalized;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int length;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean isMaxLength;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final h30.a bin;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean isValidLuhn;

        /* JADX INFO: renamed from: h30.f$b$a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh30/f$b$a;", "", "<init>", "()V", "", "", "REJECT_CHARS", "Ljava/util/Set;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String denormalized) throws IOException {
            super(null);
            s.k(denormalized, "denormalized");
            this.denormalized = denormalized;
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < denormalized.length(); i11++) {
                char cCharAt = denormalized.charAt(i11);
                if (!f70594k.contains(Character.valueOf(cCharAt))) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            s.j(string, "toString(...)");
            this.normalized = string;
            int length = string.length();
            this.length = length;
            this.isMaxLength = length == 19;
            this.bin = h30.a.INSTANCE.a(string);
            this.isValidLuhn = f30.b.f63902a.b(string);
        }

        private final String c(int panLength) {
            Set<Integer> setA = f.INSTANCE.a(panLength);
            String strT1 = t.T1(this.normalized, panLength);
            int size = setA.size() + 1;
            String[] strArr = new String[size];
            int length = strT1.length();
            int i11 = 0;
            int i12 = 0;
            for (Object obj : v.Y0(v.m1(setA))) {
                int i13 = i11 + 1;
                if (i11 < 0) {
                    v.x();
                }
                int iIntValue = ((Number) obj).intValue() - i11;
                if (length > iIntValue) {
                    String strSubstring = strT1.substring(i12, iIntValue);
                    s.j(strSubstring, "substring(...)");
                    strArr[i11] = strSubstring;
                    i12 = iIntValue;
                }
                i11 = i13;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    i14 = -1;
                    break;
                }
                if (strArr[i14] == null) {
                    break;
                }
                i14++;
            }
            Integer numValueOf = Integer.valueOf(i14);
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                String strSubstring2 = strT1.substring(i12);
                s.j(strSubstring2, "substring(...)");
                strArr[iIntValue2] = strSubstring2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < size; i15++) {
                String str = strArr[i15];
                if (str == null) {
                    break;
                }
                arrayList.add(str);
            }
            return v.y0(arrayList, " ", null, null, 0, null, null, 62, null);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final h30.a getBin() {
            return this.bin;
        }

        public final String e(int panLength) {
            return c(panLength);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unvalidated) && s.f(this.denormalized, ((Unvalidated) other).denormalized);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getNormalized() {
            return this.normalized;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsMaxLength() {
            return this.isMaxLength;
        }

        public int hashCode() {
            return this.denormalized.hashCode();
        }

        public final boolean i(int panLength) {
            return (this.normalized.length() == panLength || t.y0(this.normalized)) ? false : true;
        }

        public final boolean j() {
            return (t.y0(this.normalized) || v.o0(com.stripe.android.model.h.INSTANCE.c(this.normalized)) == com.stripe.android.model.h.Unknown) ? false : true;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsValidLuhn() {
            return this.isValidLuhn;
        }

        public final Validated l(int panLength) {
            if (panLength >= 14 && this.normalized.length() == panLength && this.isValidLuhn) {
                return new Validated(this.normalized);
            }
            return null;
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.denormalized + ")";
        }
    }

    /* JADX INFO: renamed from: h30.f$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lh30/f$c;", "Lh30/f;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "c", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Validated extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validated(String value) {
            super(null);
            s.k(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Validated) && s.f(this.value, ((Validated) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.value + ")";
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f() {
    }
}
