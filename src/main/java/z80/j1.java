package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o4.TransformedText;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R \u0010&\u001a\u00020#8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0019\u00100R\u001a\u00105\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b\u001f\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Lz80/j1;", "Li90/u1;", "<init>", "()V", "", "iban", "", "n", "(Ljava/lang/String;)Z", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "Lo4/x;", "I", "e", "()I", "capitalization", "b", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "", "c", "getLabel", "()Ljava/lang/Integer;", AnnotatedPrivateKey.LABEL, "Lo4/y;", DateTokenConverter.CONVERTER_KEY, "k", "keyboard", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Li90/w1;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "m", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "f", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "Lo4/z0;", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j1 implements p010i90.u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f127564h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f127565i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<Character> f127566j = p013kotlin.collections.v.P0(p013kotlin.collections.v.N0(new bo0.c('0', '9'), new bo0.c('a', 'z')), new bo0.c('A', 'Z'));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capitalization = o4.x.INSTANCE.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel = "iban";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int label = w80.n.f121532r;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboard = o4.y.INSTANCE.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<p010i90.w1> trailingIcon = StateFlowKt.MutableStateFlow(new p010i90.w1.Trailing(f30.y.f64234p, null, true, null, 10, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o4.z0 visualTransformation = new o4.z0() { // from class: z80.i1
        @Override // o4.z0
        public final TransformedText filter(i4.d dVar) {
            return j1.o(dVar);
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz80/j1$a;", "", "<init>", "()V", "", "MAX_LENGTH", "I", "MIN_LENGTH", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/m;", "it", "", "a", "(Lkotlin/text/m;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<p013kotlin.text.m, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f127574c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(p013kotlin.text.m it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return String.valueOf(p013kotlin.text.t.O1(it.getValue()) - '7');
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"z80/j1$c", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements o4.f0 {
        c() {
        }

        @Override // o4.f0
        public int originalToTransformed(int offset) {
            return offset + (offset / 4);
        }

        @Override // o4.f0
        public int transformedToOriginal(int offset) {
            return offset - (offset / 5);
        }
    }

    private final boolean n(String iban) {
        String upperCase = (p013kotlin.text.t.U1(iban, iban.length() - 4) + p013kotlin.text.t.T1(iban, 4)).toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        return new BigInteger(new p013kotlin.text.q("[A-Z]").k(upperCase, b.f127574c)).mod(new BigInteger("97")).equals(BigInteger.ONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText o(i4.d text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        StringBuilder sb2 = new StringBuilder();
        String text2 = text.getText();
        int i11 = 0;
        int i12 = 0;
        while (i11 < text2.length()) {
            int i13 = i12 + 1;
            sb2.append(text2.charAt(i11));
            if (i12 % 4 == 3 && i12 < 33) {
                sb2.append(" ");
            }
            i11++;
            i12 = i13;
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return new TransformedText(new i4.d(string, null, null, 6, null), new c());
    }

    @Override // p010i90.u1
    public String a(String rawValue) {
        p013kotlin.jvm.internal.s.k(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p010i90.u1
    public StateFlow<Boolean> b() {
        return this.loading;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: c, reason: from getter */
    public o4.z0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // p010i90.u1
    public String d() {
        return i90.u1.a.a(this);
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // p010i90.u1
    public p010i90.x1 g(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        if (p013kotlin.text.t.y0(input)) {
            return i90.y1.a.f77113c;
        }
        String upperCase = p013kotlin.text.t.T1(input, 2).toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        for (int i11 = 0; i11 < upperCase.length(); i11++) {
            if (Character.isDigit(upperCase.charAt(i11))) {
                return new i90.y1.c(w80.n.f121538u, null, false, 6, null);
            }
        }
        if (upperCase.length() < 2) {
            return new i90.y1.b(w80.n.f121534s);
        }
        String[] iSOCountries = Locale.getISOCountries();
        p013kotlin.jvm.internal.s.j(iSOCountries, "getISOCountries(...)");
        if (!p013kotlin.collections.n.e0(iSOCountries, upperCase)) {
            return new i90.y1.c(w80.n.f121536t, new String[]{upperCase}, false, 4, null);
        }
        if (input.length() < 8) {
            return new i90.y1.b(w80.n.f121534s);
        }
        if (n(input)) {
            return input.length() == 34 ? i90.z1.a.f77176a : i90.z1.b.f77177a;
        }
        return new i90.y1.b(f30.d0.f63977v0);
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: getLabel */
    public Integer getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String() {
        return Integer.valueOf(this.label);
    }

    @Override // p010i90.u1
    public String h(String displayName) {
        p013kotlin.jvm.internal.s.k(displayName, "displayName");
        return displayName;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: i, reason: from getter */
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // p010i90.u1
    public String j(String userTyped) throws IOException {
        p013kotlin.jvm.internal.s.k(userTyped, "userTyped");
        StringBuilder sb2 = new StringBuilder();
        int length = userTyped.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = userTyped.charAt(i11);
            if (f127566j.contains(Character.valueOf(cCharAt))) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        String upperCase = p013kotlin.text.t.T1(string, 34).toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: k, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<p010i90.w1> f() {
        return this.trailingIcon;
    }
}
