package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.SerializationException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lvo0/b;", "", "T", "Lro0/d;", "<init>", "()V", "Luo0/c;", "compositeDecoder", "b", "(Luo0/c;)Ljava/lang/Object;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "", "klassName", "Lro0/c;", "c", "(Luo0/c;Ljava/lang/String;)Lro0/c;", "Lro0/q;", DateTokenConverter.CONVERTER_KEY, "(Luo0/f;Ljava/lang/Object;)Lro0/q;", "Lco0/d;", "e", "()Lco0/d;", "baseClass", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b<T> implements ro0.d<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T b(uo0.c compositeDecoder) {
        return (T) uo0.c.a.c(compositeDecoder, getDescriptor(), 1, ro0.i.a(this, compositeDecoder, compositeDecoder.t(getDescriptor(), 0)), null, 8, null);
    }

    public ro0.c<T> c(uo0.c decoder, String klassName) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        return decoder.getSerializersModule().d(e(), klassName);
    }

    public ro0.q<T> d(uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        return encoder.getSerializersModule().e(e(), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ro0.c
    public final T deserialize(uo0.e decoder) {
        T t11;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        to0.f descriptor = getDescriptor();
        uo0.c cVarB = decoder.b(descriptor);
        p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        if (cVarB.i()) {
            t11 = (T) b(cVarB);
        } else {
            Object objC = null;
            while (true) {
                int iA = cVarB.A(getDescriptor());
                if (iA == -1) {
                    if (objC != null) {
                        p013kotlin.jvm.internal.s.i(objC, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                        t11 = (T) objC;
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) n0Var.f86529a)).toString());
                }
                if (iA == 0) {
                    n0Var.f86529a = (T) cVarB.t(getDescriptor(), iA);
                } else {
                    if (iA != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) n0Var.f86529a;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(iA);
                        throw new SerializationException(sb2.toString());
                    }
                    T t12 = n0Var.f86529a;
                    if (t12 == 0) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    n0Var.f86529a = t12;
                    objC = uo0.c.a.c(cVarB, getDescriptor(), iA, ro0.i.a(this, cVarB, (String) t12), null, 8, null);
                }
            }
        }
        cVarB.c(descriptor);
        return t11;
    }

    public abstract co0.d<T> e();

    @Override // ro0.q
    public final void serialize(uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        ro0.q<? super T> qVarB = ro0.i.b(this, encoder, value);
        to0.f descriptor = getDescriptor();
        uo0.d dVarB = encoder.b(descriptor);
        dVarB.e(getDescriptor(), 0, qVarB.getDescriptor().getSerialName());
        to0.f descriptor2 = getDescriptor();
        p013kotlin.jvm.internal.s.i(qVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.D(descriptor2, 1, qVarB, value);
        dVarB.c(descriptor);
    }
}
