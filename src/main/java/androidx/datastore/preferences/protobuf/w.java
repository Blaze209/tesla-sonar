package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected l1 unknownFields = l1.c();

    public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a.AbstractC0162a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f8223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f8224b;

        protected a(MessageType messagetype) {
            this.f8223a = messagetype;
            if (messagetype.z()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f8224b = (MessageType) q();
        }

        private static <MessageType> void p(MessageType messagetype, MessageType messagetype2) {
            a1.a().d(messagetype).mergeFrom(messagetype, messagetype2);
        }

        private MessageType q() {
            return (MessageType) this.f8223a.F();
        }

        @Override // androidx.datastore.preferences.protobuf.p0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw androidx.datastore.preferences.protobuf.a.AbstractC0162a.f(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (!this.f8224b.z()) {
                return this.f8224b;
            }
            this.f8224b.A();
            return this.f8224b;
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.f8224b = (MessageType) buildPartial();
            return buildertype;
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public final boolean isInitialized() {
            return w.y(this.f8224b, false);
        }

        protected final void j() {
            if (this.f8224b.z()) {
                return;
            }
            k();
        }

        protected void k() {
            MessageType messagetype = (MessageType) q();
            p(messagetype, this.f8224b);
            this.f8224b = messagetype;
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.f8223a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0162a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public BuilderType d(MessageType messagetype) {
            return (BuilderType) o(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BuilderType x2(h hVar, n nVar) throws IOException {
            j();
            try {
                a1.a().d(this.f8224b).b(this.f8224b, i.h(hVar), nVar);
                return this;
            } catch (RuntimeException e11) {
                if (e11.getCause() instanceof IOException) {
                    throw ((IOException) e11.getCause());
                }
                throw e11;
            }
        }

        public BuilderType o(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            j();
            p(this.f8224b, messagetype);
            return this;
        }
    }

    protected static class b<T extends w<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f8225b;

        public b(T t11) {
            this.f8225b = t11;
        }

        @Override // androidx.datastore.preferences.protobuf.x0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T a(h hVar, n nVar) {
            return (T) w.H(this.f8225b, hVar, nVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends w<MessageType, BuilderType> implements q0 {
        protected s<d> extensions = s.h();

        s<d> L() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.q0
        public /* bridge */ /* synthetic */ p0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.p0
        public /* bridge */ /* synthetic */ p0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.p0
        public /* bridge */ /* synthetic */ p0.a toBuilder() {
            return super.toBuilder();
        }
    }

    static final class d implements s.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p1.b f8227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f8228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f8229d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.s.b
        public p0.a H0(p0.a aVar, p0 p0Var) {
            return ((a) aVar).o((w) p0Var);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f8226a - dVar.f8226a;
        }

        public y.b<?> b() {
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public p1.c getLiteJavaType() {
            return this.f8227b.getJavaType();
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public p1.b getLiteType() {
            return this.f8227b;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public int getNumber() {
            return this.f8226a;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public boolean isPacked() {
            return this.f8229d;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public boolean isRepeated() {
            return this.f8228c;
        }
    }

    public static class e<ContainingType extends p0, Type> extends l<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p0 f8230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f8231b;

        public p1.b a() {
            return this.f8231b.getLiteType();
        }

        public p0 b() {
            return this.f8230a;
        }

        public int c() {
            return this.f8231b.getNumber();
        }

        public boolean d() {
            return this.f8231b.f8228c;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static <E> y.f<E> C(y.f<E> fVar) {
        int size = fVar.size();
        return fVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Object E(p0 p0Var, String str, Object[] objArr) {
        return new c1(p0Var, str, objArr);
    }

    protected static <T extends w<T, ?>> T G(T t11, InputStream inputStream) {
        return (T) j(H(t11, h.g(inputStream), n.b()));
    }

    static <T extends w<T, ?>> T H(T t11, h hVar, n nVar) throws InvalidProtocolBufferException {
        T t12 = (T) t11.F();
        try {
            e1 e1VarD = a1.a().d(t12);
            e1VarD.b(t12, i.h(hVar), nVar);
            e1VarD.makeImmutable(t12);
            return t12;
        } catch (InvalidProtocolBufferException e11) {
            e = e11;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.k(t12);
        } catch (UninitializedMessageException e12) {
            throw e12.a().k(t12);
        } catch (IOException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw new InvalidProtocolBufferException(e13).k(t12);
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw e14;
        }
    }

    protected static <T extends w<?, ?>> void I(Class<T> cls, T t11) {
        t11.B();
        defaultInstanceMap.put(cls, t11);
    }

    private static <T extends w<T, ?>> T j(T t11) throws InvalidProtocolBufferException {
        if (t11 == null || t11.isInitialized()) {
            return t11;
        }
        throw t11.f().a().k(t11);
    }

    private int n(e1<?> e1Var) {
        return e1Var == null ? a1.a().d(this).getSerializedSize(this) : e1Var.getSerializedSize(this);
    }

    protected static <E> y.f<E> s() {
        return b1.d();
    }

    static <T extends w<?, ?>> T t(Class<T> cls) {
        T t11 = (T) defaultInstanceMap.get(cls);
        if (t11 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t11 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (t11 != null) {
            return t11;
        }
        T t12 = (T) ((w) n1.i(cls)).getDefaultInstanceForType();
        if (t12 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t12);
        return t12;
    }

    static Object x(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends w<T, ?>> boolean y(T t11, boolean z11) {
        byte bByteValue = ((Byte) t11.p(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = a1.a().d(t11).isInitialized(t11);
        if (z11) {
            t11.q(f.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t11 : null);
        }
        return zIsInitialized;
    }

    protected void A() {
        a1.a().d(this).makeImmutable(this);
        B();
    }

    void B() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) p(f.NEW_BUILDER);
    }

    MessageType F() {
        return (MessageType) p(f.NEW_MUTABLE_INSTANCE);
    }

    void J(int i11) {
        this.memoizedHashCode = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        return (BuilderType) ((a) p(f.NEW_BUILDER)).o(this);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void a(CodedOutputStream codedOutputStream) {
        a1.a().d(this).a(this, j.g(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int d(e1 e1Var) {
        if (!z()) {
            if (c() != Integer.MAX_VALUE) {
                return c();
            }
            int iN = n(e1Var);
            g(iN);
            return iN;
        }
        int iN2 = n(e1Var);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return a1.a().d(this).equals(this, (w) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void g(int i11) {
        if (i11 >= 0) {
            this.memoizedSerializedSize = (i11 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final x0<MessageType> getParserForType() {
        return (x0) p(f.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public int getSerializedSize() {
        return d(null);
    }

    public int hashCode() {
        if (z()) {
            return m();
        }
        if (w()) {
            J(m());
        }
        return v();
    }

    Object i() {
        return p(f.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean isInitialized() {
        return y(this, true);
    }

    void k() {
        this.memoizedHashCode = 0;
    }

    void l() {
        g(Integer.MAX_VALUE);
    }

    int m() {
        return a1.a().d(this).hashCode(this);
    }

    protected final <MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType o() {
        return (BuilderType) p(f.NEW_BUILDER);
    }

    protected Object p(f fVar) {
        return r(fVar, null, null);
    }

    protected Object q(f fVar, Object obj) {
        return r(fVar, obj, null);
    }

    protected abstract Object r(f fVar, Object obj, Object obj2);

    public String toString() {
        return r0.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) p(f.GET_DEFAULT_INSTANCE);
    }

    int v() {
        return this.memoizedHashCode;
    }

    boolean w() {
        return v() == 0;
    }

    boolean z() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }
}
