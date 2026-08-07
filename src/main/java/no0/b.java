package no0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lno0/b;", "Object", "Field", "Lpo0/a;", "container", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b<Object, Field> extends po0.a<Object, Field> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <Object, Field> Field a(b<? super Object, Field> bVar, Object object) {
            Field fieldA = bVar.a(object);
            if (fieldA != null) {
                return fieldA;
            }
            throw new IllegalStateException("Field " + bVar.getName() + " is not set");
        }
    }

    Field a(Object container);

    Field b(Object container);
}
