package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006#"}, d2 = {"Lokio/m0;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", DateTokenConverter.CONVERTER_KEY, "()Lokio/m0;", "f", "b", "segment", "c", "(Lokio/m0;)Lokio/m0;", "byteCount", "e", "(I)Lokio/m0;", "Ljn0/h0;", "a", "sink", "g", "(Lokio/m0;I)V", "[B", "I", "Z", "Lokio/m0;", "next", "prev", "h", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final byte[] data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int pos;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int limit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean shared;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean owner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public m0 next;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public m0 prev;

    public m0() {
        this.data = new byte[PKIFailureInfo.certRevoked];
        this.owner = true;
        this.shared = false;
    }

    public final void a() {
        int i11;
        m0 m0Var = this.prev;
        if (m0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        p013kotlin.jvm.internal.s.h(m0Var);
        if (m0Var.owner) {
            int i12 = this.limit - this.pos;
            m0 m0Var2 = this.prev;
            p013kotlin.jvm.internal.s.h(m0Var2);
            int i13 = 8192 - m0Var2.limit;
            m0 m0Var3 = this.prev;
            p013kotlin.jvm.internal.s.h(m0Var3);
            if (m0Var3.shared) {
                i11 = 0;
            } else {
                m0 m0Var4 = this.prev;
                p013kotlin.jvm.internal.s.h(m0Var4);
                i11 = m0Var4.pos;
            }
            if (i12 > i13 + i11) {
                return;
            }
            m0 m0Var5 = this.prev;
            p013kotlin.jvm.internal.s.h(m0Var5);
            g(m0Var5, i12);
            b();
            n0.b(this);
        }
    }

    public final m0 b() {
        m0 m0Var = this.next;
        if (m0Var == this) {
            m0Var = null;
        }
        m0 m0Var2 = this.prev;
        p013kotlin.jvm.internal.s.h(m0Var2);
        m0Var2.next = this.next;
        m0 m0Var3 = this.next;
        p013kotlin.jvm.internal.s.h(m0Var3);
        m0Var3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return m0Var;
    }

    public final m0 c(m0 segment) {
        p013kotlin.jvm.internal.s.k(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        m0 m0Var = this.next;
        p013kotlin.jvm.internal.s.h(m0Var);
        m0Var.prev = segment;
        this.next = segment;
        return segment;
    }

    public final m0 d() {
        this.shared = true;
        return new m0(this.data, this.pos, this.limit, true, false);
    }

    public final m0 e(int byteCount) {
        m0 m0VarC;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            m0VarC = d();
        } else {
            m0VarC = n0.c();
            byte[] bArr = this.data;
            byte[] bArr2 = m0VarC.data;
            int i11 = this.pos;
            p013kotlin.collections.n.q(bArr, bArr2, 0, i11, i11 + byteCount, 2, null);
        }
        m0VarC.limit = m0VarC.pos + byteCount;
        this.pos += byteCount;
        m0 m0Var = this.prev;
        p013kotlin.jvm.internal.s.h(m0Var);
        m0Var.c(m0VarC);
        return m0VarC;
    }

    public final m0 f() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        p013kotlin.jvm.internal.s.j(bArrCopyOf, "copyOf(...)");
        return new m0(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void g(m0 sink, int byteCount) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.limit;
        if (i11 + byteCount > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.pos;
            if ((i11 + byteCount) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            p013kotlin.collections.n.q(bArr, bArr, 0, i12, i11, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i13 = sink.limit;
        int i14 = this.pos;
        p013kotlin.collections.n.k(bArr2, bArr3, i13, i14, i14 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public m0(byte[] data, int i11, int i12, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(data, "data");
        this.data = data;
        this.pos = i11;
        this.limit = i12;
        this.shared = z11;
        this.owner = z12;
    }
}
