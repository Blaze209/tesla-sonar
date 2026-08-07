package okio;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH&¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0010H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0010H&¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0010H&¢\u0006\u0004\b'\u0010%J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0000H&¢\u0006\u0004\b-\u0010,J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0001\u000215ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00066À\u0006\u0001"}, d2 = {"Lokio/i;", "Lokio/p0;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/k;", "byteString", "A1", "(Lokio/k;)Lokio/i;", "", "source", "write", "([B)Lokio/i;", "", "offset", "byteCount", "([BII)Lokio/i;", "Lokio/r0;", "", "q2", "(Lokio/r0;)J", "", InquiryField.StringField.TYPE, "l2", "(Ljava/lang/String;)Lokio/i;", "beginIndex", "endIndex", "p0", "(Ljava/lang/String;II)Lokio/i;", "b", "writeByte", "(I)Lokio/i;", "s", "writeShort", IntegerTokenConverter.CONVERTER_KEY, "writeInt", "X0", "v", "Y", "(J)Lokio/i;", "I0", "l1", "Ljn0/h0;", "flush", "()V", "T1", "()Lokio/i;", "b2", "Ljava/io/OutputStream;", "I3", "()Ljava/io/OutputStream;", "Lokio/h;", "l", "()Lokio/h;", "buffer", "Lokio/k0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i extends p0, WritableByteChannel {
    i A1(k byteString);

    i I0(long v11);

    OutputStream I3();

    i T1();

    i X0(int i11);

    i Y(long v11);

    i b2();

    @Override // okio.p0, java.io.Flushable
    void flush();

    h l();

    i l1(long v11);

    i l2(String string);

    i p0(String string, int beginIndex, int endIndex);

    long q2(r0 source);

    i write(byte[] source);

    i write(byte[] source, int offset, int byteCount);

    i writeByte(int b11);

    i writeInt(int i11);

    i writeShort(int s11);
}
