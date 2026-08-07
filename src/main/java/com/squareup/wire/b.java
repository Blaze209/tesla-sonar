package com.squareup.wire;

import java.net.ProtocolException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/squareup/wire/b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Lcom/squareup/wire/ProtoAdapter;", "rawProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "I", "getValue$wire_runtime", "()I", "Companion", "a", "VARINT", "FIXED64", "LENGTH_DELIMITED", "FIXED32", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public enum b {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    /* JADX INFO: renamed from: com.squareup.wire.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0081\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/squareup/wire/b$a;", "", "<init>", "()V", "", "value", "Lcom/squareup/wire/b;", "a", "(I)Lcom/squareup/wire/b;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final b a(int value) throws ProtocolException {
            if (value == 0) {
                return b.VARINT;
            }
            if (value == 1) {
                return b.FIXED64;
            }
            if (value == 2) {
                return b.LENGTH_DELIMITED;
            }
            if (value == 5) {
                return b.FIXED32;
            }
            throw new ProtocolException("Unexpected FieldEncoding: " + value);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    b(int i11) {
        this.value = i11;
    }

    /* JADX INFO: renamed from: getValue$wire_runtime, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final ProtoAdapter<?> rawProtoAdapter() {
        int i11 = c.f49541a[ordinal()];
        if (i11 == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i11 == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i11 == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i11 == 4) {
            return ProtoAdapter.BYTES;
        }
        throw new NoWhenBranchMatchedException();
    }
}
