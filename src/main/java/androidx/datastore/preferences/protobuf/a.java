package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0162a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0162a<MessageType, BuilderType>> implements p0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0162a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0162a<MessageType, BuilderType>> implements p0.a {
        protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
            y.a(iterable);
            if (!(iterable instanceof c0)) {
                if (iterable instanceof y0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    c(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((c0) iterable).getUnderlyingElements();
            c0 c0Var = (c0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (c0Var.size() - size) + " is null.";
                    for (int size2 = c0Var.size() - 1; size2 >= size; size2--) {
                        c0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof g) {
                    c0Var.c1((g) obj);
                } else if (obj instanceof byte[]) {
                    c0Var.c1(g.f((byte[]) obj));
                } else {
                    c0Var.add((String) obj);
                }
            }
        }

        private static <T> void c(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t11 : iterable) {
                if (t11 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t11);
            }
        }

        protected static UninitializedMessageException f(p0 p0Var) {
            return new UninitializedMessageException(p0Var);
        }

        protected abstract BuilderType d(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.p0.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BuilderType T(p0 p0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(p0Var)) {
                return (BuilderType) d((a) p0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
        AbstractC0162a.b(iterable, list);
    }

    private String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    int d(e1 e1Var) {
        int iC = c();
        if (iC != -1) {
            return iC;
        }
        int serializedSize = e1Var.getSerializedSize(this);
        g(serializedSize);
        return serializedSize;
    }

    UninitializedMessageException f() {
        return new UninitializedMessageException(this);
    }

    void g(int i11) {
        throw new UnsupportedOperationException();
    }

    public void h(OutputStream outputStream) {
        CodedOutputStream codedOutputStreamE0 = CodedOutputStream.e0(outputStream, CodedOutputStream.I(getSerializedSize()));
        a(codedOutputStreamE0);
        codedOutputStreamE0.b0();
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public g toByteString() {
        try {
            g.h hVarL = g.l(getSerializedSize());
            a(hVarL.b());
            return hVarL.a();
        } catch (IOException e11) {
            throw new RuntimeException(e("ByteString"), e11);
        }
    }
}
