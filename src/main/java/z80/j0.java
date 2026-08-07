package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u000fR \u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R \u0010!\u001a\u00020\u001f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Lz80/j0;", "", "<init>", "()V", "Lcom/stripe/android/model/h;", "brand", "", InquiryField.FloatField.TYPE2, "", "numberAllowedDigits", "Li90/x1;", "c", "(Lcom/stripe/android/model/h;Ljava/lang/String;I)Li90/x1;", "userTyped", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "b", "rawValue", "a", "Lo4/x;", "I", "e", "()I", "capitalization", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "debugLabel", "h", AnnotatedPrivateKey.LABEL, "Lo4/y;", "g", "keyboard", "Lo4/z0;", "Lo4/z0;", IntegerTokenConverter.CONVERTER_KEY, "()Lo4/z0;", "visualTransformation", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capitalization = o4.x.INSTANCE.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel = "Card number";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int label = f30.d0.f63934a;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboard = o4.y.INSTANCE.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o4.z0 visualTransformation = new m0(' ');

    public String a(String rawValue) {
        p013kotlin.jvm.internal.s.k(rawValue, "rawValue");
        return rawValue;
    }

    public String b(String displayName) {
        p013kotlin.jvm.internal.s.k(displayName, "displayName");
        return displayName;
    }

    public p010i90.x1 c(com.stripe.android.model.h brand, String number, int numberAllowedDigits) {
        p013kotlin.jvm.internal.s.k(brand, "brand");
        p013kotlin.jvm.internal.s.k(number, "number");
        boolean zB = f30.b.f63902a.b(number);
        boolean z11 = brand.getMaxLengthForCardNumber(number) != -1;
        if (p013kotlin.text.t.y0(number)) {
            return i90.y1.a.f77113c;
        }
        if (brand == com.stripe.android.model.h.Unknown) {
            return new i90.y1.c(f30.d0.f63979w0, null, true, 2, null);
        }
        if (z11 && number.length() < numberAllowedDigits) {
            return new i90.y1.b(f30.d0.f63979w0);
        }
        if (zB) {
            return (z11 && number.length() == numberAllowedDigits) ? i90.z1.a.f77176a : new i90.y1.c(f30.d0.f63979w0, null, false, 6, null);
        }
        return new i90.y1.c(f30.d0.f63979w0, null, true, 2, null);
    }

    public String d(String userTyped) throws IOException {
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
        return string;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public String getDebugLabel() {
        return this.debugLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public o4.z0 getVisualTransformation() {
        return this.visualTransformation;
    }
}
