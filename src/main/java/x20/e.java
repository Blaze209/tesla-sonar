package x20;

import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\"'\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/squareup/wire/p;", "E", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;)Lcom/squareup/wire/p;", "identityOrNull", "wire-runtime"}, k = 5, mv = {1, 4, 0}, xs = "com/squareup/wire/internal/Internal")
final /* synthetic */ class e {
    public static final <E extends p> E a(Class<E> identityOrNull) {
        E e11;
        s.k(identityOrNull, "$this$identityOrNull");
        E[] enumConstants = identityOrNull.getEnumConstants();
        s.j(enumConstants, "enumConstants");
        int length = enumConstants.length;
        for (int i11 = 0; i11 < length; i11++) {
            e11 = enumConstants[i11];
            E e12 = e11;
            if (e12 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.WireEnum");
            }
            if (e12.getValue() == 0) {
                return e11;
            }
        }
        e11 = null;
        return e11;
    }
}
