package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f88822a = new q();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Integer.valueOf(TypeDeserializer.w((ProtoBuf.Type) obj));
    }
}
