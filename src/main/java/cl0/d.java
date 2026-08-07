package cl0;

import bl0.v;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcl0/d;", "Lcl0/b$a;", "", "text", "Lbl0/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lbl0/v;", PermissionsResponse.STATUS_KEY, "<init>", "(Ljava/lang/String;Lbl0/c;Lbl0/v;)V", "", DateTokenConverter.CONVERTER_KEY, "()[B", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getText", "b", "Lbl0/c;", "()Lbl0/c;", "c", "Lbl0/v;", "getStatus", "()Lbl0/v;", "[B", "bytes", "", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bl0.c contentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final byte[] bytes;

    public /* synthetic */ d(String str, bl0.c cVar, v vVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, (i11 & 4) != 0 ? null : vVar);
    }

    @Override // cl0.b
    /* JADX INFO: renamed from: a */
    public Long getContentLength() {
        return Long.valueOf(this.bytes.length);
    }

    @Override // cl0.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public bl0.c getContentType() {
        return this.contentType;
    }

    @Override // cl0.b.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public byte[] getBytes() {
        return this.bytes;
    }

    public String toString() {
        return "TextContent[" + getContentType() + "] \"" + t.T1(this.text, 30) + CoreConstants.DOUBLE_QUOTE_CHAR;
    }

    public d(String text, bl0.c contentType, v vVar) {
        byte[] bArrG;
        s.k(text, "text");
        s.k(contentType, "contentType");
        this.text = text;
        this.contentType = contentType;
        this.status = vVar;
        Charset charsetA = bl0.d.a(getContentType());
        charsetA = charsetA == null ? p013kotlin.text.d.UTF_8 : charsetA;
        if (s.f(charsetA, p013kotlin.text.d.UTF_8)) {
            bArrG = t.J(text);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charsetA.newEncoder();
            s.j(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrG = kl0.a.g(charsetEncoderNewEncoder, text, 0, text.length());
        }
        this.bytes = bArrG;
    }
}
