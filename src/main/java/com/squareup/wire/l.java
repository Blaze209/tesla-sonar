package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.nearby.uwb.RangingPosition;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0015J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/squareup/wire/l;", "", "Lokio/i;", "sink", "<init>", "(Lokio/i;)V", "Lokio/k;", "value", "Ljn0/h0;", "a", "(Lokio/k;)V", "", "e", "(Ljava/lang/String;)V", "", "fieldNumber", "Lcom/squareup/wire/b;", "fieldEncoding", "f", "(ILcom/squareup/wire/b;)V", DateTokenConverter.CONVERTER_KEY, "(I)V", "g", "", "h", "(J)V", "b", "c", "Lokio/i;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okio.i sink;

    /* JADX INFO: renamed from: com.squareup.wire.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/squareup/wire/l$a;", "", "<init>", "()V", "", "fieldNumber", "Lcom/squareup/wire/b;", "fieldEncoding", "g", "(ILcom/squareup/wire/b;)I", "tag", "h", "(I)I", "value", "f", IntegerTokenConverter.CONVERTER_KEY, "", "j", "(J)I", "n", DateTokenConverter.CONVERTER_KEY, "b", "e", "(J)J", "c", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int g(int fieldNumber, b fieldEncoding) {
            return (fieldNumber << 3) | fieldEncoding.getValue();
        }

        public final int b(int n11) {
            return (-(n11 & 1)) ^ (n11 >>> 1);
        }

        public final long c(long n11) {
            return (-(n11 & 1)) ^ (n11 >>> 1);
        }

        public final int d(int n11) {
            return (n11 >> 31) ^ (n11 << 1);
        }

        public final long e(long n11) {
            return (n11 >> 63) ^ (n11 << 1);
        }

        public final int f(int value) {
            if (value >= 0) {
                return i(value);
            }
            return 10;
        }

        public final int h(int tag) {
            return i(g(tag, b.VARINT));
        }

        public final int i(int value) {
            if ((value & RangingPosition.RSSI_UNKNOWN) == 0) {
                return 1;
            }
            if ((value & (-16384)) == 0) {
                return 2;
            }
            if (((-2097152) & value) == 0) {
                return 3;
            }
            return (value & (-268435456)) == 0 ? 4 : 5;
        }

        public final int j(long value) {
            if (((-128) & value) == 0) {
                return 1;
            }
            if (((-16384) & value) == 0) {
                return 2;
            }
            if (((-2097152) & value) == 0) {
                return 3;
            }
            if (((-268435456) & value) == 0) {
                return 4;
            }
            if (((-34359738368L) & value) == 0) {
                return 5;
            }
            if (((-4398046511104L) & value) == 0) {
                return 6;
            }
            if (((-562949953421312L) & value) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & value) == 0) {
                return 8;
            }
            return (value & Long.MIN_VALUE) == 0 ? 9 : 10;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l(okio.i sink) {
        s.k(sink, "sink");
        this.sink = sink;
    }

    public final void a(okio.k value) {
        s.k(value, "value");
        this.sink.A1(value);
    }

    public final void b(int value) {
        this.sink.X0(value);
    }

    public final void c(long value) {
        this.sink.Y(value);
    }

    public final void d(int value) {
        if (value >= 0) {
            g(value);
        } else {
            h(value);
        }
    }

    public final void e(String value) {
        s.k(value, "value");
        this.sink.l2(value);
    }

    public final void f(int fieldNumber, b fieldEncoding) {
        s.k(fieldEncoding, "fieldEncoding");
        g(INSTANCE.g(fieldNumber, fieldEncoding));
    }

    public final void g(int value) {
        while ((value & RangingPosition.RSSI_UNKNOWN) != 0) {
            this.sink.writeByte((value & 127) | 128);
            value >>>= 7;
        }
        this.sink.writeByte(value);
    }

    public final void h(long value) {
        while (((-128) & value) != 0) {
            this.sink.writeByte((((int) value) & 127) | 128);
            value >>>= 7;
        }
        this.sink.writeByte((int) value);
    }
}
