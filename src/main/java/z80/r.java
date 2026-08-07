package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b&\u0010\u001eR\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001c\u0010+R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b)\u00100R \u00103\u001a\b\u0012\u0004\u0012\u0002020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b\u0016\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lz80/r;", "Li90/u1;", "<init>", "()V", "", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "Lkotlin/text/q;", "Lkotlin/Lazy;", "l", "()Lkotlin/text/q;", "blikPattern", "", "b", "I", "getLabel", "()Ljava/lang/Integer;", AnnotatedPrivateKey.LABEL, "Lo4/x;", "c", "e", "()I", "capitalization", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "Lo4/y;", "k", "keyboard", "Lo4/z0;", "f", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/w1;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "trailingIcon", "", "loading", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r implements p010i90.u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o4.z0 visualTransformation;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy blikPattern = jn0.m.b(a.f127736c);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int label = w80.n.f121518k;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int capitalization = o4.x.INSTANCE.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel = "blik_code";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int keyboard = o4.y.INSTANCE.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.w1> trailingIcon = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/q;", "b", "()Lkotlin/text/q;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<p013kotlin.text.q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127736c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p013kotlin.text.q invoke() {
            return new p013kotlin.text.q("^[0-9]{6}$");
        }
    }

    private final p013kotlin.text.q l() {
        return (p013kotlin.text.q) this.blikPattern.getValue();
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
    public StateFlow<p010i90.w1> f() {
        return this.trailingIcon;
    }

    @Override // p010i90.u1
    public p010i90.x1 g(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        boolean zI = l().i(input);
        if (input.length() == 0) {
            return i90.y1.a.f77113c;
        }
        if (zI) {
            return i90.z1.b.f77177a;
        }
        for (int i11 = 0; i11 < input.length(); i11++) {
            if (!Character.isDigit(input.charAt(i11))) {
                return new i90.y1.c(w80.n.f121544x, null, false, 6, null);
            }
        }
        return input.length() < 6 ? new i90.y1.b(w80.n.f121542w) : new i90.y1.c(w80.n.f121544x, null, false, 6, null);
    }

    @Override // p010i90.u1
    public Integer getLabel() {
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
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return p013kotlin.text.t.T1(string, 6);
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: k, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }
}
