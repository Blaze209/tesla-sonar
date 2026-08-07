package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class s0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f87500a = new s0();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(SignatureEnhancement.p((UnwrappedType) obj));
    }
}
