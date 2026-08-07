package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import f90.h;
import io.sentry.q7;
import java.io.IOException;
import java.util.Locale;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o4.x;
import o4.y;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010&\u001a\u00020#8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b$\u0010%R \u0010*\u001a\u00020'8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010%R\u001a\u0010-\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b\u001d\u00100R \u00104\u001a\b\u0012\u0004\u0012\u0002020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b3\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Li90/x0;", "Li90/u1;", "", AnnotatedPrivateKey.LABEL, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Li90/w1;", "trailingIcon", "", PlaceTypes.COUNTRY, "<init>", "(ILkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;)V", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "I", "getLabel", "()Ljava/lang/Integer;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "o", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "c", "Ljava/lang/String;", "Li90/x0$a;", DateTokenConverter.CONVERTER_KEY, "Li90/x0$a;", "format", "Lo4/x;", "e", "()I", "capitalization", "Lo4/y;", "f", "k", "keyboard", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "Lo4/z0;", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "", "n", "loading", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<w1> trailingIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String country;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a format;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int capitalization;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int keyboard;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z0 visualTransformation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> loading;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0005\t\u000b\r\u0010\u0011B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Li90/x0$a;", "", "", "minimumLength", "maximumLength", "Lkotlin/text/q;", "regexPattern", "<init>", "(IILkotlin/text/q;)V", "a", "I", "b", "()I", "c", "Lkotlin/text/q;", "()Lkotlin/text/q;", DateTokenConverter.CONVERTER_KEY, "e", "Li90/x0$a$a;", "Li90/x0$a$c;", "Li90/x0$a$d;", "Li90/x0$a$e;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f77075e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int minimumLength;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int maximumLength;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q regexPattern;

        /* JADX INFO: renamed from: i90.x0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li90/x0$a$a;", "Li90/x0$a;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1628a extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1628a f77079f = new C1628a();

            /* JADX WARN: Illegal instructions before constructor call */
            private C1628a() {
                int i11 = 6;
                super(i11, i11, new q("[a-zA-Z]\\d[a-zA-Z][\\s-]?\\d[a-zA-Z]\\d"), null);
            }
        }

        /* JADX INFO: renamed from: i90.x0$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li90/x0$a$b;", "", "<init>", "()V", "", PlaceTypes.COUNTRY, "Li90/x0$a;", "a", "(Ljava/lang/String;)Li90/x0$a;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String country) {
                s.k(country, "country");
                int iHashCode = country.hashCode();
                if (iHashCode != 2142) {
                    if (iHashCode != 2267) {
                        if (iHashCode == 2718 && country.equals("US")) {
                            return e.f77082f;
                        }
                    } else if (country.equals("GB")) {
                        return c.f77080f;
                    }
                } else if (country.equals("CA")) {
                    return C1628a.f77079f;
                }
                return d.f77081f;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li90/x0$a$c;", "Li90/x0$a;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final c f77080f = new c();

            private c() {
                super(5, 7, new q("^[A-Za-z][A-Za-z0-9]*(?: [A-Za-z0-9]*)?$"), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li90/x0$a$d;", "Li90/x0$a;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final d f77081f = new d();

            private d() {
                super(1, Integer.MAX_VALUE, new q(q7.DEFAULT_PROPAGATION_TARGETS), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li90/x0$a$e;", "Li90/x0$a;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final e f77082f = new e();

            /* JADX WARN: Illegal instructions before constructor call */
            private e() {
                int i11 = 5;
                super(i11, i11, new q("\\d+"), null);
            }
        }

        public /* synthetic */ a(int i11, int i12, q qVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, i12, qVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMaximumLength() {
            return this.maximumLength;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMinimumLength() {
            return this.minimumLength;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final q getRegexPattern() {
            return this.regexPattern;
        }

        private a(int i11, int i12, q qVar) {
            this.minimumLength = i11;
            this.maximumLength = i12;
            this.regexPattern = qVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"i90/x0$b", "Li90/x1;", "", "hasFocus", "c", "(Z)Z", "isValid", "()Z", "Li90/c0;", "a", "()Li90/c0;", DateTokenConverter.CONVERTER_KEY, "b", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements x1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77084b;

        b(String str) {
            this.f77084b = str;
        }

        @Override // p010i90.x1
        public c0 a() {
            if (!t.y0(this.f77084b) && !isValid() && s.f(x0.this.country, "US")) {
                return new c0(h.f64634v, null, 2, null);
            }
            if (t.y0(this.f77084b) || isValid()) {
                return null;
            }
            return new c0(h.f64635w, null, 2, null);
        }

        @Override // p010i90.x1
        public boolean b() {
            return t.y0(this.f77084b);
        }

        @Override // p010i90.x1
        public boolean c(boolean hasFocus) {
            return (a() == null || hasFocus) ? false : true;
        }

        @Override // p010i90.x1
        /* JADX INFO: renamed from: d */
        public boolean getPreventMoreInput() {
            return this.f77084b.length() >= x0.this.format.getMaximumLength();
        }

        @Override // p010i90.x1
        public boolean isValid() {
            if (x0.this.format instanceof a.d) {
                return !t.y0(this.f77084b);
            }
            int minimumLength = x0.this.format.getMinimumLength();
            int maximumLength = x0.this.format.getMaximumLength();
            int length = this.f77084b.length();
            if (minimumLength <= length && length <= maximumLength) {
                if (x0.this.format.getRegexPattern().i(this.f77084b)) {
                    return true;
                }
            }
            return false;
        }
    }

    public x0(int i11, MutableStateFlow<w1> trailingIcon, String country) {
        int iA;
        int iH;
        s.k(trailingIcon, "trailingIcon");
        s.k(country, "country");
        this.label = i11;
        this.trailingIcon = trailingIcon;
        this.country = country;
        a aVarA = a.INSTANCE.a(country);
        this.format = aVarA;
        a.e eVar = a.e.f77082f;
        if (s.f(aVarA, eVar)) {
            iA = x.INSTANCE.b();
        } else {
            if (!(s.f(aVarA, a.C1628a.f77079f) ? true : s.f(aVarA, a.c.f77080f) ? true : s.f(aVarA, a.d.f77081f))) {
                throw new NoWhenBranchMatchedException();
            }
            iA = x.INSTANCE.a();
        }
        this.capitalization = iA;
        if (s.f(aVarA, eVar)) {
            iH = y.INSTANCE.e();
        } else {
            if (!(s.f(aVarA, a.C1628a.f77079f) ? true : s.f(aVarA, a.c.f77080f) ? true : s.f(aVarA, a.d.f77081f))) {
                throw new NoWhenBranchMatchedException();
            }
            iH = y.INSTANCE.h();
        }
        this.keyboard = iH;
        this.debugLabel = "postal_code_text";
        this.visualTransformation = new y0(aVarA);
        this.loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @Override // p010i90.u1
    public String a(String rawValue) {
        s.k(rawValue, "rawValue");
        return new q("\\s+").j(rawValue, "");
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: c, reason: from getter */
    public z0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // p010i90.u1
    public String d() {
        return u1.a.a(this);
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // p010i90.u1
    public x1 g(String input) {
        s.k(input, "input");
        return new b(input);
    }

    @Override // p010i90.u1
    public Integer getLabel() {
        return Integer.valueOf(this.label);
    }

    @Override // p010i90.u1
    public String h(String displayName) {
        s.k(displayName, "displayName");
        return displayName;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: i, reason: from getter */
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // p010i90.u1
    public String j(String userTyped) throws IOException {
        s.k(userTyped, "userTyped");
        a aVar = this.format;
        int i11 = 0;
        if (s.f(aVar, a.e.f77082f)) {
            StringBuilder sb2 = new StringBuilder();
            int length = userTyped.length();
            while (i11 < length) {
                char cCharAt = userTyped.charAt(i11);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
                i11++;
            }
            userTyped = sb2.toString();
            s.j(userTyped, "toString(...)");
        } else {
            if (s.f(aVar, a.C1628a.f77079f) ? true : s.f(aVar, a.c.f77080f)) {
                StringBuilder sb3 = new StringBuilder();
                int length2 = userTyped.length();
                while (i11 < length2) {
                    char cCharAt2 = userTyped.charAt(i11);
                    if (Character.isLetterOrDigit(cCharAt2)) {
                        sb3.append(cCharAt2);
                    }
                    i11++;
                }
                String string = sb3.toString();
                s.j(string, "toString(...)");
                userTyped = string.toUpperCase(Locale.ROOT);
                s.j(userTyped, "toUpperCase(...)");
            } else if (!s.f(aVar, a.d.f77081f)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return t.T1(userTyped, this.format.getMaximumLength());
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: k, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<Boolean> b() {
        return this.loading;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<w1> f() {
        return this.trailingIcon;
    }

    public /* synthetic */ x0(int i11, MutableStateFlow mutableStateFlow, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? StateFlowKt.MutableStateFlow(null) : mutableStateFlow, str);
    }
}
