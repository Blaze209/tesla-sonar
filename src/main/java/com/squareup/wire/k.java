package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\fJ\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0011J\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0011J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\nJ'\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010+R\u0016\u0010-\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0018\u00103\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00108¨\u00069"}, d2 = {"Lcom/squareup/wire/k;", "", "Lokio/j;", "source", "<init>", "(Lokio/j;)V", "", "expectedEndTag", "Ljn0/h0;", "q", "(I)V", "f", "()I", "fieldEncoding", "b", "", "c", "()J", DateTokenConverter.CONVERTER_KEY, "token", "Lokio/k;", "e", "(J)Lokio/k;", "g", "Lcom/squareup/wire/b;", "h", "()Lcom/squareup/wire/b;", "p", "()V", IntegerTokenConverter.CONVERTER_KEY, "()Lokio/k;", "", "l", "()Ljava/lang/String;", "n", "o", "j", "k", "tag", "m", "value", "a", "(ILcom/squareup/wire/b;Ljava/lang/Object;)V", "J", "pos", "limit", "I", "recursionDepth", "state", "pushedLimit", "Lcom/squareup/wire/b;", "nextFieldEncoding", "", "Lokio/h;", "Ljava/util/List;", "bufferStack", "Lokio/j;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long pos;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long limit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int recursionDepth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int tag;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long pushedLimit;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private b nextFieldEncoding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<okio.h> bufferStack;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final okio.j source;

    public k(okio.j source) {
        s.k(source, "source");
        this.source = source;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    private final void b(int fieldEncoding) throws IOException {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        long j11 = this.pos;
        long j12 = this.limit;
        if (j11 > j12) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j11 != j12) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private final long c() throws ProtocolException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j11 = this.limit - this.pos;
        this.source.D2(j11);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j11;
    }

    private final int f() throws ProtocolException {
        int i11;
        this.source.D2(1L);
        this.pos++;
        byte b11 = this.source.readByte();
        if (b11 >= 0) {
            return b11;
        }
        int i12 = b11 & 127;
        this.source.D2(1L);
        this.pos++;
        byte b12 = this.source.readByte();
        if (b12 >= 0) {
            i11 = b12 << 7;
        } else {
            i12 |= (b12 & 127) << 7;
            this.source.D2(1L);
            this.pos++;
            byte b13 = this.source.readByte();
            if (b13 >= 0) {
                i11 = b13 << 14;
            } else {
                i12 |= (b13 & 127) << 14;
                this.source.D2(1L);
                this.pos++;
                byte b14 = this.source.readByte();
                if (b14 < 0) {
                    int i13 = i12 | ((b14 & 127) << 21);
                    this.source.D2(1L);
                    this.pos++;
                    byte b15 = this.source.readByte();
                    int i14 = i13 | (b15 << 28);
                    if (b15 < 0) {
                        for (int i15 = 0; i15 <= 4; i15++) {
                            this.source.D2(1L);
                            this.pos++;
                            if (this.source.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i14;
                }
                i11 = b14 << 21;
            }
        }
        return i12 | i11;
    }

    private final void q(int expectedEndTag) throws IOException {
        while (this.pos < this.limit && !this.source.T2()) {
            int iF = f();
            if (iF == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iF >> 3;
            int i12 = iF & 7;
            if (i12 == 0) {
                this.state = 0;
                o();
            } else if (i12 == 1) {
                this.state = 1;
                k();
            } else if (i12 == 2) {
                long jF = f();
                this.pos += jF;
                this.source.skip(jF);
            } else if (i12 == 3) {
                q(i11);
            } else if (i12 == 4) {
                if (i11 != expectedEndTag) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i12 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i12);
                }
                this.state = 5;
                j();
            }
        }
        throw new EOFException();
    }

    public final void a(int tag, b fieldEncoding, Object value) {
        s.k(fieldEncoding, "fieldEncoding");
        l lVar = new l(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
        if (protoAdapterRawProtoAdapter == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        }
        protoAdapterRawProtoAdapter.encodeWithTag(lVar, tag, value);
    }

    public final long d() {
        if (!(this.state == 2)) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i11 = this.recursionDepth + 1;
        this.recursionDepth = i11;
        if (i11 > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i11 > this.bufferStack.size()) {
            this.bufferStack.add(new okio.h());
        }
        long j11 = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j11;
    }

    public final okio.k e(long token) throws IOException {
        boolean z11 = false;
        if (!(this.state == 6)) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i11 = this.recursionDepth - 1;
        this.recursionDepth = i11;
        if (i11 >= 0 && this.pushedLimit == -1) {
            z11 = true;
        }
        if (!z11) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i11 == 0) {
            this.limit = token;
            okio.h hVar = this.bufferStack.get(i11);
            return hVar.getSize() > 0 ? hVar.m1() : okio.k.f97943e;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public final int g() {
        int i11 = this.state;
        if (i11 == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i11 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.T2()) {
            int iF = f();
            if (iF == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i12 = iF >> 3;
            this.tag = i12;
            int i13 = iF & 7;
            if (i13 == 0) {
                this.nextFieldEncoding = b.VARINT;
                this.state = 0;
                return i12;
            }
            if (i13 == 1) {
                this.nextFieldEncoding = b.FIXED64;
                this.state = 1;
                return i12;
            }
            if (i13 == 2) {
                this.nextFieldEncoding = b.LENGTH_DELIMITED;
                this.state = 2;
                int iF2 = f();
                if (iF2 < 0) {
                    throw new ProtocolException("Negative length: " + iF2);
                }
                if (this.pushedLimit != -1) {
                    throw new IllegalStateException();
                }
                long j11 = this.limit;
                this.pushedLimit = j11;
                long j12 = this.pos + ((long) iF2);
                this.limit = j12;
                if (j12 <= j11) {
                    return this.tag;
                }
                throw new EOFException();
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i13 == 5) {
                    this.nextFieldEncoding = b.FIXED32;
                    this.state = 5;
                    return i12;
                }
                throw new ProtocolException("Unexpected field encoding: " + i13);
            }
            q(i12);
        }
        return -1;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public final okio.k i() throws ProtocolException {
        long jC = c();
        this.source.D2(jC);
        return this.source.Q0(jC);
    }

    public final int j() throws IOException {
        int i11 = this.state;
        if (i11 != 5 && i11 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.D2(4L);
        this.pos += (long) 4;
        int iW3 = this.source.w3();
        b(5);
        return iW3;
    }

    public final long k() throws IOException {
        int i11 = this.state;
        if (i11 != 1 && i11 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.D2(8L);
        this.pos += (long) 8;
        long jE0 = this.source.E0();
        b(1);
        return jE0;
    }

    public final String l() throws ProtocolException {
        long jC = c();
        this.source.D2(jC);
        return this.source.M0(jC);
    }

    public final void m(int tag) {
        b nextFieldEncoding = getNextFieldEncoding();
        s.h(nextFieldEncoding);
        a(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    public final int n() {
        int i11 = this.state;
        if (i11 == 0 || i11 == 2) {
            int iF = f();
            b(0);
            return iF;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    public final long o() throws IOException {
        int i11 = this.state;
        if (i11 != 0 && i11 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j11 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            this.source.D2(1L);
            this.pos++;
            byte b11 = this.source.readByte();
            j11 |= ((long) (b11 & 127)) << i12;
            if ((b11 & 128) == 0) {
                b(0);
                return j11;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void p() throws IOException {
        int i11 = this.state;
        if (i11 == 0) {
            o();
            return;
        }
        if (i11 == 1) {
            k();
            return;
        }
        if (i11 == 2) {
            this.source.skip(c());
        } else {
            if (i11 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            j();
        }
    }
}
