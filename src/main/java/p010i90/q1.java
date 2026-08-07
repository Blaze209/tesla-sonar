package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o4.x;
import o4.y;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B9\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b \u0010-R \u00101\u001a\b\u0012\u0004\u0012\u00020/0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b0\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Li90/q1;", "Li90/u1;", "", AnnotatedPrivateKey.LABEL, "Lo4/x;", "capitalization", "Lo4/y;", "keyboard", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Li90/w1;", "trailingIcon", "<init>", "(Ljava/lang/Integer;IILkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "Ljava/lang/Integer;", "getLabel", "()Ljava/lang/Integer;", "b", "I", "e", "()I", "c", "k", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "m", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "Lo4/z0;", "f", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "", "l", "loading", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class q1 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int capitalization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int keyboard;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<w1> trailingIcon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z0 visualTransformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> loading;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"i90/q1$a", "Li90/x1;", "", "hasFocus", "c", "(Z)Z", "isValid", "()Z", "Li90/c0;", "a", "()Li90/c0;", DateTokenConverter.CONVERTER_KEY, "b", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements x1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f76872a;

        a(String str) {
            this.f76872a = str;
        }

        @Override // p010i90.x1
        public c0 a() {
            return null;
        }

        @Override // p010i90.x1
        public boolean b() {
            return t.y0(this.f76872a);
        }

        @Override // p010i90.x1
        public boolean c(boolean hasFocus) {
            return false;
        }

        @Override // p010i90.x1
        /* JADX INFO: renamed from: d */
        public boolean getPreventMoreInput() {
            return false;
        }

        @Override // p010i90.x1
        public boolean isValid() {
            return !t.y0(this.f76872a);
        }
    }

    public /* synthetic */ q1(Integer num, int i11, int i12, MutableStateFlow mutableStateFlow, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i11, i12, mutableStateFlow);
    }

    @Override // p010i90.u1
    public String a(String rawValue) {
        s.k(rawValue, "rawValue");
        return rawValue;
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
        return new a(input);
    }

    @Override // p010i90.u1
    public Integer getLabel() {
        return this.label;
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
        y.Companion companion = y.INSTANCE;
        if (!d1.i(y.k(companion.d()), y.k(companion.e())).contains(y.k(getKeyboard()))) {
            return userTyped;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = userTyped.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = userTyped.charAt(i11);
            if (Character.isDigit(cCharAt)) {
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
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<Boolean> b() {
        return this.loading;
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<w1> f() {
        return this.trailingIcon;
    }

    private q1(Integer num, int i11, int i12, MutableStateFlow<w1> trailingIcon) {
        s.k(trailingIcon, "trailingIcon");
        this.label = num;
        this.capitalization = i11;
        this.keyboard = i12;
        this.trailingIcon = trailingIcon;
        this.debugLabel = "generic_text";
        this.loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public /* synthetic */ q1(Integer num, int i11, int i12, MutableStateFlow mutableStateFlow, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? x.INSTANCE.e() : i11, (i13 & 4) != 0 ? y.INSTANCE.h() : i12, (i13 & 8) != 0 ? StateFlowKt.MutableStateFlow(null) : mutableStateFlow, null);
    }
}
