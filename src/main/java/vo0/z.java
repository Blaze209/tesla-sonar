package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u001b\u0010\u000b\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lvo0/z;", "", "T", "Lro0/d;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lto0/f;", "descriptor", "(Ljava/lang/String;[Ljava/lang/Enum;Lto0/f;)V", "b", "(Ljava/lang/String;)Lto0/f;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "e", "(Luo0/f;Ljava/lang/Enum;)V", "Luo0/e;", "decoder", DateTokenConverter.CONVERTER_KEY, "(Luo0/e;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "a", "[Ljava/lang/Enum;", "Lto0/f;", "overriddenDescriptor", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lto0/f;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z<T extends Enum<T>> implements ro0.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T[] values;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private to0.f overriddenDescriptor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy descriptor;

    public z(final String serialName, T[] values) {
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(values, "values");
        this.values = values;
        this.descriptor = jn0.m.b(new wn0.a() { // from class: vo0.y
            @Override // wn0.a
            public final Object invoke() {
                return z.c(this.f119718a, serialName);
            }
        });
    }

    private final to0.f b(String serialName) {
        x xVar = new x(serialName, this.values.length);
        for (T t11 : this.values) {
            m1.p(xVar, t11.name(), false, 2, null);
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f c(z zVar, String str) {
        to0.f fVar = zVar.overriddenDescriptor;
        return fVar == null ? zVar.b(str) : fVar;
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        int iX = decoder.x(getDescriptor());
        if (iX >= 0) {
            T[] tArr = this.values;
            if (iX < tArr.length) {
                return tArr[iX];
            }
        }
        throw new SerializationException(iX + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        int iC0 = p013kotlin.collections.n.C0(this.values, value);
        if (iC0 != -1) {
            encoder.g(getDescriptor(), iC0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().getSerialName());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.values);
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return (to0.f) this.descriptor.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String serialName, T[] values, to0.f descriptor) {
        this(serialName, values);
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(values, "values");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        this.overriddenDescriptor = descriptor;
    }
}
