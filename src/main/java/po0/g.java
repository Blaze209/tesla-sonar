package po0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0005\u0003\u0005\u0006\u0007\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lpo0/g;", "", "", "a", "()Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpo0/g$a;", "Lpo0/g;", "", "conflicting", "<init>", "(Ljava/lang/Object;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/Object;", "getConflicting", "()Ljava/lang/Object;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object conflicting;

        public a(Object conflicting) {
            p013kotlin.jvm.internal.s.k(conflicting, "conflicting");
            this.conflicting = conflicting;
        }

        @Override // po0.g
        public String a() {
            return "attempted to overwrite the existing value '" + this.conflicting + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo0/g$b;", "Lpo0/g;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f103484a = new b();

        private b() {
        }

        @Override // po0.g
        public String a() {
            return "expected an Int value";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpo0/g$c;", "Lpo0/g;", "", "minDigits", "<init>", "(I)V", "", "a", "()Ljava/lang/String;", "I", "getMinDigits", "()I", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int minDigits;

        public c(int i11) {
            this.minDigits = i11;
        }

        @Override // po0.g
        public String a() {
            return "expected at least " + this.minDigits + " digits";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpo0/g$d;", "Lpo0/g;", "", "maxDigits", "<init>", "(I)V", "", "a", "()Ljava/lang/String;", "I", "getMaxDigits", "()I", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int maxDigits;

        public d(int i11) {
            this.maxDigits = i11;
        }

        @Override // po0.g
        public String a() {
            return "expected at most " + this.maxDigits + " digits";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lpo0/g$e;", "Lpo0/g;", "", "expected", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Ljava/lang/String;", "getExpected", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String expected;

        public e(String expected) {
            p013kotlin.jvm.internal.s.k(expected, "expected");
            this.expected = expected;
        }

        @Override // po0.g
        public String a() {
            return "expected '" + this.expected + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    String a();
}
