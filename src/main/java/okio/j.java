package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020*H&¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\t2\u0006\u0010/\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H&¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u0002072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000207H&¢\u0006\u0004\b<\u00109J\u0017\u0010>\u001a\u0002072\u0006\u0010=\u001a\u00020\tH&¢\u0006\u0004\b>\u0010;J\u0017\u0010A\u001a\u0002072\u0006\u0010@\u001a\u00020?H&¢\u0006\u0004\bA\u0010BJ'\u0010F\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\tH&¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020!H&¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020!H&¢\u0006\u0004\bL\u0010JJ\u001f\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\t2\u0006\u0010H\u001a\u00020!H&¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0000H&¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH&¢\u0006\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0005\u0082\u0001\u0002\u0003Wø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006XÀ\u0006\u0001"}, d2 = {"Lokio/j;", "Lokio/r0;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/h;", "P1", "()Lokio/h;", "", "T2", "()Z", "", "byteCount", "Ljn0/h0;", "D2", "(J)V", "request", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "A0", "", "readInt", "()I", "w3", "readLong", "()J", "E0", "X2", "J1", "skip", "Lokio/k;", "m1", "()Lokio/k;", "Q0", "(J)Lokio/k;", "Lokio/g0;", "options", "M3", "(Lokio/g0;)I", "", "V0", "()[B", "y2", "(J)[B", "sink", "readFully", "([B)V", "Z1", "(Lokio/h;J)V", "Lokio/p0;", "D1", "(Lokio/p0;)J", "", "t1", "()Ljava/lang/String;", "M0", "(J)Ljava/lang/String;", "w2", "limit", "e2", "Ljava/nio/charset/Charset;", "charset", "j1", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "b", "fromIndex", "toIndex", "a2", "(BJJ)J", "bytes", "Z", "(Lokio/k;)J", "targetBytes", "d0", "offset", "l0", "(JLokio/k;)Z", "peek", "()Lokio/j;", "Ljava/io/InputStream;", "K3", "()Ljava/io/InputStream;", "l", "buffer", "Lokio/l0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface j extends r0, ReadableByteChannel {
    short A0();

    long D1(p0 sink);

    void D2(long byteCount);

    long E0();

    long J1();

    InputStream K3();

    String M0(long byteCount);

    int M3(g0 options);

    @jn0.e
    h P1();

    k Q0(long byteCount);

    boolean T2();

    byte[] V0();

    long X2();

    long Z(k bytes);

    void Z1(h sink, long byteCount);

    long a2(byte b11, long fromIndex, long toIndex);

    long d0(k targetBytes);

    String e2(long limit);

    String j1(Charset charset);

    h l();

    boolean l0(long offset, k bytes);

    k m1();

    j peek();

    byte readByte();

    void readFully(byte[] sink);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long byteCount);

    void skip(long byteCount);

    String t1();

    String w2();

    int w3();

    byte[] y2(long byteCount);
}
