package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f88805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoContainer f88806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MessageLite f88807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AnnotatedCallableKind f88808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f88809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ProtoBuf.ValueParameter f88810f;

    public j(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i11, ProtoBuf.ValueParameter valueParameter) {
        this.f88805a = memberDeserializer;
        this.f88806b = protoContainer;
        this.f88807c = messageLite;
        this.f88808d = annotatedCallableKind;
        this.f88809e = i11;
        this.f88810f = valueParameter;
    }

    @Override // wn0.a
    public Object invoke() {
        return MemberDeserializer.y(this.f88805a, this.f88806b, this.f88807c, this.f88808d, this.f88809e, this.f88810f);
    }
}
