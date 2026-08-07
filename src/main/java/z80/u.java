package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o4.TransformedText;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R \u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b\u0015\u0010$R\u001a\u0010+\u001a\u00020(8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b)\u0010*R \u0010.\u001a\u00020,8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b-\u0010\u0018R\u001a\u00102\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b\u001a\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Lz80/u;", "Li90/u1;", "", "Lcom/stripe/android/view/q$a;", "banks", "<init>", "(Ljava/util/List;)V", "", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "Ljava/util/List;", "Lo4/x;", "b", "I", "e", "()I", "capitalization", "c", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/w1;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/StateFlow;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "trailingIcon", "", "loading", "", "getLabel", "()Ljava/lang/Integer;", AnnotatedPrivateKey.LABEL, "Lo4/y;", "k", "keyboard", "Lo4/z0;", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u implements p010i90.u1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f127817i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f127818j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final bo0.c f127819k = new bo0.c('0', '9');

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<com.stripe.android.view.q.Bank> banks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int capitalization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.w1> trailingIcon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int label;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int keyboard;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final o4.z0 visualTransformation;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz80/u$a;", "", "<init>", "()V", "", "LENGTH", "I", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"z80/u$b", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements o4.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f127828a;

        b(String str) {
            this.f127828a = str;
        }

        @Override // o4.f0
        public int originalToTransformed(int offset) {
            return offset <= 2 ? offset : offset + this.f127828a.length();
        }

        @Override // o4.f0
        public int transformedToOriginal(int offset) {
            return offset <= 3 ? offset : offset - this.f127828a.length();
        }
    }

    public u(List<com.stripe.android.view.q.Bank> banks) {
        p013kotlin.jvm.internal.s.k(banks, "banks");
        this.banks = banks;
        this.capitalization = o4.x.INSTANCE.b();
        this.debugLabel = "bsb";
        this.trailingIcon = StateFlowKt.MutableStateFlow(null);
        this.loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.label = f30.d0.Q;
        this.keyboard = o4.y.INSTANCE.d();
        this.visualTransformation = new o4.z0() { // from class: z80.t
            @Override // o4.z0
            public final TransformedText filter(i4.d dVar) {
                return u.m(dVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText m(i4.d text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        StringBuilder sb2 = new StringBuilder();
        String text2 = text.getText();
        int i11 = 0;
        int i12 = 0;
        while (i11 < text2.length()) {
            int i13 = i12 + 1;
            sb2.append(text2.charAt(i11));
            if (i12 == 2) {
                sb2.append(" - ");
            }
            i11++;
            i12 = i13;
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return new TransformedText(new i4.d(string, null, null, 6, null), new b(" - "));
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
        Object obj;
        p013kotlin.jvm.internal.s.k(input, "input");
        if (p013kotlin.text.t.y0(input)) {
            return i90.y1.a.f77113c;
        }
        if (input.length() < 6) {
            return new i90.y1.b(f30.d0.R);
        }
        Iterator<T> it = this.banks.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (p013kotlin.text.t.b0(input, ((com.stripe.android.view.q.Bank) next).getPrefix(), false, 2, null)) {
                obj = next;
                break;
            }
        }
        return (((com.stripe.android.view.q.Bank) obj) == null || input.length() > 6) ? new i90.y1.c(f30.d0.S, null, false, 6, null) : i90.z1.a.f77176a;
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
            if (f127819k.k(cCharAt)) {
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
