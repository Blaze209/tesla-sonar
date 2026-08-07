package io.ktor.utils.io.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.nio.ByteBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\r\u000f\b\n\u000b\f\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011\u0082\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/utils/io/internal/g;", "", "Ljava/nio/ByteBuffer;", "backingBuffer", "Lio/ktor/utils/io/internal/i;", "capacity", "<init>", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/i;)V", "c", "()Lio/ktor/utils/io/internal/g;", DateTokenConverter.CONVERTER_KEY, "e", "f", "a", "Ljava/nio/ByteBuffer;", "b", "Lio/ktor/utils/io/internal/i;", "()Ljava/nio/ByteBuffer;", "readBuffer", "writeBuffer", "g", "Lio/ktor/utils/io/internal/g$a;", "Lio/ktor/utils/io/internal/g$b;", "Lio/ktor/utils/io/internal/g$c;", "Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$f;", "Lio/ktor/utils/io/internal/g$g;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ByteBuffer backingBuffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final i capacity;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/internal/g$a;", "Lio/ktor/utils/io/internal/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f78754c = new a();

        private a() {
            super(h.a(), h.b(), null);
        }

        public String toString() {
            return "IDLE(empty)";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/internal/g$b;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g$d;", "h", "()Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$g;", IntegerTokenConverter.CONVERTER_KEY, "()Lio/ktor/utils/io/internal/g$g;", "", "toString", "()Ljava/lang/String;", "c", "Lio/ktor/utils/io/internal/g$c;", "g", "()Lio/ktor/utils/io/internal/g$c;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final c initial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c initial) {
            super(initial.backingBuffer, initial.capacity, null);
            s.k(initial, "initial");
            this.initial = initial;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final c getInitial() {
            return this.initial;
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public d c() {
            return this.initial.getReadingState();
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C1678g d() {
            return this.initial.getWritingState();
        }

        public String toString() {
            return "IDLE(with buffer)";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010%\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lio/ktor/utils/io/internal/g$c;", "Lio/ktor/utils/io/internal/g;", "Ljava/nio/ByteBuffer;", "backingBuffer", "", "reservedSize", "<init>", "(Ljava/nio/ByteBuffer;I)V", "Lio/ktor/utils/io/internal/g$d;", "k", "()Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$g;", "l", "()Lio/ktor/utils/io/internal/g$g;", "", "toString", "()Ljava/lang/String;", "c", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "writeBuffer", DateTokenConverter.CONVERTER_KEY, "a", "readBuffer", "Lio/ktor/utils/io/internal/g$b;", "e", "Lio/ktor/utils/io/internal/g$b;", "g", "()Lio/ktor/utils/io/internal/g$b;", "idleState", "f", "Lio/ktor/utils/io/internal/g$d;", "h", "readingState", "Lio/ktor/utils/io/internal/g$g;", "j", "writingState", "Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$e;", IntegerTokenConverter.CONVERTER_KEY, "()Lio/ktor/utils/io/internal/g$e;", "readingWritingState", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ByteBuffer writeBuffer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ByteBuffer readBuffer;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final b idleState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final d readingState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C1678g writingState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final e readingWritingState;

        public /* synthetic */ c(ByteBuffer byteBuffer, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(byteBuffer, (i12 & 2) != 0 ? 8 : i11);
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public ByteBuffer getReadBuffer() {
            return this.readBuffer;
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public ByteBuffer getWriteBuffer() {
            return this.writeBuffer;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getIdleState() {
            return this.idleState;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final d getReadingState() {
            return this.readingState;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final e getReadingWritingState() {
            return this.readingWritingState;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final C1678g getWritingState() {
            return this.writingState;
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public d c() {
            return this.readingState;
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C1678g d() {
            return this.writingState;
        }

        public String toString() {
            return "Initial";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ByteBuffer backingBuffer, int i11) {
            super(backingBuffer, new i(backingBuffer.capacity() - i11), null);
            s.k(backingBuffer, "backingBuffer");
            if (backingBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (backingBuffer.limit() != backingBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ByteBuffer byteBufferDuplicate = backingBuffer.duplicate();
            s.j(byteBufferDuplicate, "backingBuffer.duplicate()");
            this.writeBuffer = byteBufferDuplicate;
            ByteBuffer byteBufferDuplicate2 = backingBuffer.duplicate();
            s.j(byteBufferDuplicate2, "backingBuffer.duplicate()");
            this.readBuffer = byteBufferDuplicate2;
            this.idleState = new b(this);
            this.readingState = new d(this);
            this.writingState = new C1678g(this);
            this.readingWritingState = new e(this);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g$e;", "g", "()Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$b;", "h", "()Lio/ktor/utils/io/internal/g$b;", "", "toString", "()Ljava/lang/String;", "c", "Lio/ktor/utils/io/internal/g$c;", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "readBuffer", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final c initial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c initial) {
            super(initial.backingBuffer, initial.capacity, null);
            s.k(initial, "initial");
            this.initial = initial;
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: a */
        public ByteBuffer getReadBuffer() {
            return this.initial.getReadBuffer();
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public e d() {
            return this.initial.getReadingWritingState();
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this.initial.getIdleState();
        }

        public String toString() {
            return "Reading";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g$g;", "g", "()Lio/ktor/utils/io/internal/g$g;", "Lio/ktor/utils/io/internal/g$d;", "h", "()Lio/ktor/utils/io/internal/g$d;", "", "toString", "()Ljava/lang/String;", "c", "Lio/ktor/utils/io/internal/g$c;", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "readBuffer", "b", "writeBuffer", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final c initial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c initial) {
            super(initial.backingBuffer, initial.capacity, null);
            s.k(initial, "initial");
            this.initial = initial;
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: a */
        public ByteBuffer getReadBuffer() {
            return this.initial.getReadBuffer();
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: b */
        public ByteBuffer getWriteBuffer() {
            return this.initial.getWriteBuffer();
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1678g e() {
            return this.initial.getWritingState();
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public d f() {
            return this.initial.getReadingState();
        }

        public String toString() {
            return "Reading+Writing";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/internal/g$f;", "Lio/ktor/utils/io/internal/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f78764c = new f();

        private f() {
            super(h.a(), h.b(), null);
        }

        public String toString() {
            return "Terminated";
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/internal/g$g;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g$e;", "g", "()Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$b;", "h", "()Lio/ktor/utils/io/internal/g$b;", "", "toString", "()Ljava/lang/String;", "c", "Lio/ktor/utils/io/internal/g$c;", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "writeBuffer", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1678g extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final c initial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1678g(c initial) {
            super(initial.backingBuffer, initial.capacity, null);
            s.k(initial, "initial");
            this.initial = initial;
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: b */
        public ByteBuffer getWriteBuffer() {
            return this.initial.getWriteBuffer();
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public e c() {
            return this.initial.getReadingWritingState();
        }

        @Override // io.ktor.utils.io.internal.g
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b f() {
            return this.initial.getIdleState();
        }

        public String toString() {
            return "Writing";
        }
    }

    public /* synthetic */ g(ByteBuffer byteBuffer, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, iVar);
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer getReadBuffer() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer getWriteBuffer() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public g c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public g d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public g e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public g f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }

    private g(ByteBuffer byteBuffer, i iVar) {
        this.backingBuffer = byteBuffer;
        this.capacity = iVar;
    }
}
