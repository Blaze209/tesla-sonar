package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b\u0015\u0010$R\u001a\u0010+\u001a\u00020(8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b)\u0010*R \u0010.\u001a\u00020,8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b-\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Lz80/h;", "Li90/u1;", "<init>", "()V", "", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "Lo4/x;", "I", "e", "()I", "capitalization", "b", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "Lo4/z0;", "c", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/w1;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/StateFlow;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "trailingIcon", "", "loading", "", "getLabel", "()Ljava/lang/Integer;", AnnotatedPrivateKey.LABEL, "Lo4/y;", "k", "keyboard", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h implements p010i90.u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f127481h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f127482i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final bo0.c f127483j = new bo0.c('0', '9');

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o4.z0 visualTransformation;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capitalization = o4.x.INSTANCE.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel = "au_bank_account_number";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.w1> trailingIcon = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int label = f30.d0.N;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int keyboard = o4.y.INSTANCE.d();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz80/h$a;", "", "<init>", "()V", "", "LENGTH", "I", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
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
        if (p013kotlin.text.t.y0(input)) {
            return i90.y1.a.f77113c;
        }
        return input.length() < 9 ? new i90.y1.b(f30.d0.O) : i90.z1.a.f77176a;
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
            if (f127483j.k(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return p013kotlin.text.t.T1(string, 9);
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: k, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }
}
