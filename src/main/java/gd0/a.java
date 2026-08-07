package gd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import ie0.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import rc0.o;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\rJ\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lgd0/a;", "", "Lkotlin/Function1;", "", "Ljn0/h0;", "debugLog", "<init>", "(Lwn0/l;)V", "Lrc0/o;", "tag", "", "value", "f", "(Lrc0/o;[B)V", "", "g", "(I)[B", DateTokenConverter.CONVERTER_KEY, "()V", "a", "c", "(Lrc0/o;Ljava/lang/String;)V", "b", "(Lrc0/o;I)V", "Lwn0/l;", "Ljava/io/ByteArrayOutputStream;", "Ljava/io/ByteArrayOutputStream;", "data", "e", "()[B", OrcaKeys.METADATA, "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<String, h0> debugLog;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ByteArrayOutputStream data;

    /* JADX WARN: Multi-variable type inference failed */
    public a(l<? super String, h0> debugLog) {
        s.k(debugLog, "debugLog");
        this.debugLog = debugLog;
        this.data = new ByteArrayOutputStream();
    }

    private final void f(o tag, byte[] value) {
        this.debugLog.invoke(tag + " (" + tag.getValue() + ") = " + n.e(value, 0, 1, null) + " bytes:" + value.length);
    }

    private final byte[] g(int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(i11);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.j(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final void a(o tag, byte[] value) throws IOException {
        s.k(tag, "tag");
        s.k(value, "value");
        this.data.write(tag.getValue());
        if (value.length <= 255) {
            this.data.write(value.length);
            this.data.write(value);
            f(tag, value);
        } else {
            throw new IllegalArgumentException("Tag " + tag + " value has too many bytes " + value.length);
        }
    }

    public final void b(o tag, int value) throws IOException {
        s.k(tag, "tag");
        a(tag, g(value));
    }

    public final void c(o tag, String value) throws IOException {
        s.k(tag, "tag");
        s.k(value, "value");
        byte[] bytes = value.getBytes(p013kotlin.text.d.UTF_8);
        s.j(bytes, "getBytes(...)");
        a(tag, bytes);
    }

    public final void d() {
        o oVar = o.TAG_END;
        this.data.write(oVar.getValue());
        f(oVar, g(oVar.getValue()));
    }

    public final byte[] e() {
        byte[] byteArray = this.data.toByteArray();
        s.j(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
