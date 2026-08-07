package pl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.nio.ByteBuffer;
import kotlinx.coroutines.DisposableHandle;
import ll0.j;
import ll0.k;
import ll0.t;
import ll0.w;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 -2\u00020\u0001:\u0004\u0012\u0016\u001a\u001dBI\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0012\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u0082\u0001\u0003./0¨\u00061"}, d2 = {"Lpl0/b;", "", "", "fin", "Lpl0/d;", "frameType", "", "data", "Lkotlinx/coroutines/DisposableHandle;", "disposableHandle", "rsv1", "rsv2", "rsv3", "<init>", "(ZLpl0/d;[BLkotlinx/coroutines/DisposableHandle;ZZZ)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "getFin", "()Z", "b", "Lpl0/d;", "getFrameType", "()Lpl0/d;", "c", "[B", "()[B", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/DisposableHandle;", "getDisposableHandle", "()Lkotlinx/coroutines/DisposableHandle;", "e", "getRsv1", "f", "getRsv2", "g", "getRsv3", "Ljava/nio/ByteBuffer;", "h", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "buffer", IntegerTokenConverter.CONVERTER_KEY, "Lpl0/b$a;", "Lpl0/b$b;", "Lpl0/b$d;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f103187j = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean fin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pl0.d frameType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte[] data;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DisposableHandle disposableHandle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean rsv1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean rsv2;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean rsv3;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ByteBuffer buffer;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lpl0/b$a;", "Lpl0/b;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, byte[] data, boolean z12, boolean z13, boolean z14) {
            super(z11, pl0.d.BINARY, data, e.f103196a, z12, z13, z14, null);
            s.k(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, byte[] data) {
            this(z11, data, false, false, false);
            s.k(data, "data");
        }
    }

    /* JADX INFO: renamed from: pl0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lpl0/b$b;", "Lpl0/b;", "", "data", "<init>", "([B)V", "Lpl0/a;", AnalyticsAttribute.Reason, "(Lpl0/a;)V", "Lll0/k;", "packet", "(Lll0/k;)V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2194b extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2194b(byte[] data) {
            super(true, pl0.d.CLOSE, data, e.f103196a, false, false, false, null);
            s.k(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C2194b(k packet) {
            this(w.c(packet, 0, 1, null));
            s.k(packet, "packet");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2194b(pl0.a reason) {
            s.k(reason, "reason");
            j jVar = new j(null, 1, 0 == true ? 1 : 0);
            try {
                t.a(jVar, reason.getCode());
                w.i(jVar, reason.getMessage(), 0, 0, null, 14, null);
                this(jVar.T0());
            } catch (Throwable th2) {
                jVar.release();
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lpl0/b$d;", "Lpl0/b;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z11, byte[] data, boolean z12, boolean z13, boolean z14) {
            super(z11, pl0.d.TEXT, data, e.f103196a, z12, z13, z14, null);
            s.k(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(boolean z11, byte[] data) {
            this(z11, data, false, false, false);
            s.k(data, "data");
        }
    }

    public /* synthetic */ b(boolean z11, pl0.d dVar, byte[] bArr, DisposableHandle disposableHandle, boolean z12, boolean z13, boolean z14, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, dVar, bArr, disposableHandle, z12, z13, z14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public String toString() {
        return "Frame " + this.frameType + " (fin=" + this.fin + ", buffer len = " + this.data.length + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private b(boolean z11, pl0.d dVar, byte[] bArr, DisposableHandle disposableHandle, boolean z12, boolean z13, boolean z14) {
        this.fin = z11;
        this.frameType = dVar;
        this.data = bArr;
        this.disposableHandle = disposableHandle;
        this.rsv1 = z12;
        this.rsv2 = z13;
        this.rsv3 = z14;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        s.j(byteBufferWrap, "wrap(data)");
        this.buffer = byteBufferWrap;
    }
}
