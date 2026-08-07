package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import f90.h;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o4.x;
import o4.y;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.a;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0012B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010'\u001a\u00020$8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u001dR\u001c\u0010+\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b\u001f\u0010*R\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00106\u001a\b\u0012\u0004\u0012\u00020\b038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b\u001b\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Li90/a0;", "Li90/u1;", "", AnnotatedPrivateKey.LABEL, "<init>", "(I)V", "", "str", "", "m", "(Ljava/lang/String;)Z", "l", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "I", "getLabel", "()Ljava/lang/Integer;", "Lo4/x;", "b", "e", "()I", "capitalization", "c", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "Lo4/y;", DateTokenConverter.CONVERTER_KEY, "k", "keyboard", "Lo4/z0;", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Li90/w1;", "f", "Lkotlinx/coroutines/flow/MutableStateFlow;", "n", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a0 implements u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f76257i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f76258j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int capitalization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboard;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z0 visualTransformation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<w1> trailingIcon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading;

    /* JADX INFO: renamed from: i90.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li90/a0$a;", "", "<init>", "()V", "", "initialValue", "", "showOptionalLabel", "Li90/r1;", "a", "(Ljava/lang/String;Z)Li90/r1;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ r1 b(Companion companion, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return companion.a(str, z11);
        }

        public final r1 a(String initialValue, boolean showOptionalLabel) {
            return new r1(new a0(0, 1, null), showOptionalLabel, initialValue);
        }

        private Companion() {
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        s.j(patternCompile, "compile(...)");
        f76258j = patternCompile;
    }

    public a0(int i11) {
        this.label = i11;
        this.capitalization = x.INSTANCE.b();
        this.debugLabel = Scopes.EMAIL;
        this.keyboard = y.INSTANCE.c();
        this.trailingIcon = StateFlowKt.MutableStateFlow(null);
        this.loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    private final boolean l(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '@') {
                i11++;
            }
        }
        return i11 > 1;
    }

    private final boolean m(String str) {
        return t.h0(str, "@", false, 2, null) && new q(".*@.*\\..+").i(str);
    }

    @Override // p010i90.u1
    public String a(String rawValue) {
        s.k(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p010i90.u1
    public StateFlow<Boolean> b() {
        return this.loading;
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
        if (input.length() == 0) {
            return y1.a.f77113c;
        }
        if (f76258j.matcher(input).matches()) {
            return z1.b.f77177a;
        }
        if (!m(input) && !l(input)) {
            return new y1.b(h.B);
        }
        return new y1.c(h.B, null, false, 6, null);
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
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < userTyped.length(); i11++) {
            char cCharAt = userTyped.charAt(i11);
            if (!a.c(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: k, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<w1> f() {
        return this.trailingIcon;
    }

    public /* synthetic */ a0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? h.A : i11);
    }
}
