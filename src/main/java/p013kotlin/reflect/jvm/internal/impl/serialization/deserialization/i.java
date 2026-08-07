package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f88802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MessageLite f88803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AnnotatedCallableKind f88804c;

    public i(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f88802a = memberDeserializer;
        this.f88803b = messageLite;
        this.f88804c = annotatedCallableKind;
    }

    @Override // wn0.a
    public Object invoke() {
        return MemberDeserializer.p(this.f88802a, this.f88803b, this.f88804c);
    }
}
