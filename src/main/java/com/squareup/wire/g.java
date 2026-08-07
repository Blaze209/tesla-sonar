package com.squareup.wire;

import com.squareup.wire.f;
import com.squareup.wire.f.a;
import ezvcard.property.Gender;
import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0010*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0005:\u0001\fB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/squareup/wire/g;", "Lcom/squareup/wire/f;", Gender.MALE, "Lcom/squareup/wire/f$a;", "B", "Ljava/io/Serializable;", "", "bytes", "Ljava/lang/Class;", "messageClass", "<init>", "([BLjava/lang/Class;)V", "a", "[B", "b", "Ljava/lang/Class;", "c", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class g<M extends f<M, B>, B extends f.a<M, B>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] bytes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Class<M> messageClass;

    public g(byte[] bytes, Class<M> messageClass) {
        s.k(bytes, "bytes");
        s.k(messageClass, "messageClass");
        this.bytes = bytes;
        this.messageClass = messageClass;
    }
}
