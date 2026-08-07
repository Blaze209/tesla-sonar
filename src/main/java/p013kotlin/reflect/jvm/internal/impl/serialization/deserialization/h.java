package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f88799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f88800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ProtoBuf.Property f88801c;

    public h(MemberDeserializer memberDeserializer, boolean z11, ProtoBuf.Property property) {
        this.f88799a = memberDeserializer;
        this.f88800b = z11;
        this.f88801c = property;
    }

    @Override // wn0.a
    public Object invoke() {
        return MemberDeserializer.n(this.f88799a, this.f88800b, this.f88801c);
    }
}
