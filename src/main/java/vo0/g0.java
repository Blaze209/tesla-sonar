package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "name", "Lro0/d;", "primitiveSerializer", "Lto0/f;", "a", "(Ljava/lang/String;Lro0/d;)Lto0/f;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"vo0/g0$a", "Lvo0/e0;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements e0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ro0.d<T> f119616a;

        a(ro0.d<T> dVar) {
            this.f119616a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{this.f119616a};
        }

        @Override // ro0.c
        public T deserialize(uo0.e decoder) {
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // ro0.q
        public void serialize(uo0.f encoder, T value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    public static final <T> to0.f a(String name, ro0.d<T> primitiveSerializer) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(primitiveSerializer, "primitiveSerializer");
        return new f0(name, new a(primitiveSerializer));
    }
}
