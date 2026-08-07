package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import f90.h;
import java.io.IOException;
import java.util.Calendar;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o4.x;
import o4.y;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001a\u0010'\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&R\"\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R \u0010/\u001a\b\u0012\u0004\u0012\u00020.0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b\u0015\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Li90/v;", "Li90/u1;", "<init>", "()V", "", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "Lo4/x;", "I", "e", "()I", "capitalization", "b", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "", "c", "getLabel", "()Ljava/lang/Integer;", AnnotatedPrivateKey.LABEL, "Lo4/y;", DateTokenConverter.CONVERTER_KEY, "k", "keyboard", "Li90/b0;", "Li90/b0;", "l", "()Li90/b0;", "visualTransformation", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/w1;", "f", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "trailingIcon", "", "loading", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v implements u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f77026i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capitalization = x.INSTANCE.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel = InquiryField.DateField.TYPE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int label = h.C;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboard = y.INSTANCE.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0 visualTransformation = new b0();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<w1> trailingIcon = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: i90.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li90/v$a;", "", "<init>", "()V", "", "month1Based", "twoDigitYear", "current1BasedMonth", "currentYear", "Li90/x1;", "a", "(IIII)Li90/x1;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x1 a(int month1Based, int twoDigitYear, int current1BasedMonth, int currentYear) {
            int i11 = twoDigitYear - (currentYear % 100);
            boolean z11 = false;
            boolean z12 = i11 < 0;
            boolean z13 = i11 > 50;
            boolean z14 = i11 == 0 && current1BasedMonth > month1Based;
            if (1 <= month1Based && month1Based < 13) {
                z11 = true;
            }
            if (z12) {
                return new y1.c(h.I, null, true, 2, null);
            }
            if (z13) {
                return new y1.c(h.I, null, true, 2, null);
            }
            if (z14) {
                return new y1.c(h.H, null, true, 2, null);
            }
            return !z11 ? new y1.b(h.H) : z1.a.f77176a;
        }

        private Companion() {
        }
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
    public String d() {
        return u1.a.a(this);
    }

    @Override // p010i90.u1
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // p010i90.u1
    public StateFlow<w1> f() {
        return this.trailingIcon;
    }

    @Override // p010i90.u1
    public x1 g(String input) {
        s.k(input, "input");
        if (t.y0(input)) {
            return y1.a.f77113c;
        }
        String strA = s.a(input);
        if (strA.length() < 4) {
            return new y1.b(h.F);
        }
        if (strA.length() > 4) {
            return new y1.c(h.F, null, false, 6, null);
        }
        Companion companion = INSTANCE;
        Integer numX = t.x(t.T1(strA, 2));
        if (numX == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue = numX.intValue();
        Integer numX2 = t.x(t.U1(strA, 2));
        if (numX2 != null) {
            return companion.a(iIntValue, numX2.intValue(), Calendar.getInstance().get(2) + 1, Calendar.getInstance().get(1));
        }
        throw new IllegalArgumentException("Required value was null.");
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
    /* JADX INFO: renamed from: l, reason: from getter */
    public b0 getVisualTransformation() {
        return this.visualTransformation;
    }
}
