package ll0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.EOFException;
import java.nio.ByteBuffer;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@jn0.e
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u0000 32\u00020\u0001:\u0001\u000bB\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0016J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R$\u0010/\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R$\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b0\u0010.R$\u0010\u0011\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b2\u0010.R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b3\u0010.R\u0017\u00105\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b4\u0010.\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Lll0/a;", "", "Ljl0/c;", "memory", "<init>", "(Ljava/nio/ByteBuffer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "count", "Ljn0/h0;", "c", "(I)V", "a", "position", "", "b", "(I)Z", DateTokenConverter.CONVERTER_KEY, "startGap", "q", "endGap", "p", "s", "()V", "t", "limit", "u", "n", "m", "newReadPosition", "o", "copy", "e", "(Lll0/a;)V", "", "l", "()B", "r", "", "toString", "()Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "h", "()Ljava/nio/ByteBuffer;", "<set-?>", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "readPosition", "k", "writePosition", "j", "g", "f", "capacity", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ByteBuffer memory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int readPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int writePosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int startGap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int limit;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: ll0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lll0/a$a;", "", "<init>", "()V", "Lll0/a;", "a", "()Lll0/a;", "Empty", "", "ReservedSize", "I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return ml0.a.f92328j.a();
        }

        private Companion() {
        }
    }

    public /* synthetic */ a(ByteBuffer byteBuffer, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer);
    }

    public final void a(int count) {
        int i11 = this.writePosition + count;
        if (count < 0 || i11 > this.limit) {
            d.a(count, getLimit() - getWritePosition());
            throw new KotlinNothingValueException();
        }
        this.writePosition = i11;
    }

    public final boolean b(int position) {
        int i11 = this.limit;
        int i12 = this.writePosition;
        if (position < i12) {
            d.a(position - i12, getLimit() - getWritePosition());
            throw new KotlinNothingValueException();
        }
        if (position < i11) {
            this.writePosition = position;
            return true;
        }
        if (position == i11) {
            this.writePosition = position;
            return false;
        }
        d.a(position - i12, getLimit() - getWritePosition());
        throw new KotlinNothingValueException();
    }

    public final void c(int count) {
        if (count == 0) {
            return;
        }
        int i11 = this.readPosition + count;
        if (count < 0 || i11 > this.writePosition) {
            d.b(count, getWritePosition() - getReadPosition());
            throw new KotlinNothingValueException();
        }
        this.readPosition = i11;
    }

    public final void d(int position) {
        if (position < 0 || position > this.writePosition) {
            d.b(position - this.readPosition, getWritePosition() - getReadPosition());
            throw new KotlinNothingValueException();
        }
        if (this.readPosition != position) {
            this.readPosition = position;
        }
    }

    protected void e(a copy) {
        p013kotlin.jvm.internal.s.k(copy, "copy");
        copy.limit = this.limit;
        copy.startGap = this.startGap;
        copy.readPosition = this.readPosition;
        copy.writePosition = this.writePosition;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ByteBuffer getMemory() {
        return this.memory;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getReadPosition() {
        return this.readPosition;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getStartGap() {
        return this.startGap;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getWritePosition() {
        return this.writePosition;
    }

    public final byte l() throws EOFException {
        int i11 = this.readPosition;
        if (i11 == this.writePosition) {
            throw new EOFException("No readable bytes available.");
        }
        this.readPosition = i11 + 1;
        return this.memory.get(i11);
    }

    public final void m() {
        this.limit = this.capacity;
    }

    public final void n() {
        o(0);
        m();
    }

    public final void o(int newReadPosition) {
        if (newReadPosition < 0) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be negative: " + newReadPosition).toString());
        }
        if (newReadPosition <= this.readPosition) {
            this.readPosition = newReadPosition;
            if (this.startGap > newReadPosition) {
                this.startGap = newReadPosition;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("newReadPosition shouldn't be ahead of the read position: " + newReadPosition + " > " + this.readPosition).toString());
    }

    public final void p(int endGap) {
        if (endGap < 0) {
            throw new IllegalArgumentException(("endGap shouldn't be negative: " + endGap).toString());
        }
        int i11 = this.capacity - endGap;
        if (i11 >= this.writePosition) {
            this.limit = i11;
            return;
        }
        if (i11 < 0) {
            d.c(this, endGap);
        }
        if (i11 < this.startGap) {
            d.e(this, endGap);
        }
        if (this.readPosition != this.writePosition) {
            d.d(this, endGap);
            return;
        }
        this.limit = i11;
        this.readPosition = i11;
        this.writePosition = i11;
    }

    public final void q(int startGap) {
        if (startGap < 0) {
            throw new IllegalArgumentException(("startGap shouldn't be negative: " + startGap).toString());
        }
        int i11 = this.readPosition;
        if (i11 >= startGap) {
            this.startGap = startGap;
            return;
        }
        if (i11 != this.writePosition) {
            d.g(this, startGap);
            throw new KotlinNothingValueException();
        }
        if (startGap > this.limit) {
            d.h(this, startGap);
            throw new KotlinNothingValueException();
        }
        this.writePosition = startGap;
        this.readPosition = startGap;
        this.startGap = startGap;
    }

    public void r() {
        n();
        t();
    }

    public final void s() {
        this.startGap = 0;
        this.readPosition = 0;
        this.writePosition = this.capacity;
    }

    public final void t() {
        u(this.capacity - this.startGap);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Buffer[0x");
        String string = Integer.toString(hashCode(), p013kotlin.text.a.a(16));
        p013kotlin.jvm.internal.s.j(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        sb2.append("](");
        sb2.append(getWritePosition() - getReadPosition());
        sb2.append(" used, ");
        sb2.append(getLimit() - getWritePosition());
        sb2.append(" free, ");
        sb2.append(this.startGap + (getCapacity() - getLimit()));
        sb2.append(" reserved of ");
        sb2.append(this.capacity);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    public final void u(int limit) {
        int i11 = this.startGap;
        this.readPosition = i11;
        this.writePosition = i11;
        this.limit = limit;
    }

    private a(ByteBuffer memory) {
        p013kotlin.jvm.internal.s.k(memory, "memory");
        this.memory = memory;
        this.limit = memory.limit();
        this.capacity = memory.limit();
    }
}
