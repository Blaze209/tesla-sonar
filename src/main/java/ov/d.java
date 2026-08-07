package ov;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import y6.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ly6/f;", "Ly6/f$a;", Action.KEY_ATTRIBUTE, "defaultValue", "a", "(Ly6/f;Ly6/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final <T> T a(f fVar, f.a<T> key, T t11) {
        s.k(fVar, "<this>");
        s.k(key, "key");
        T t12 = (T) fVar.b(key);
        return t12 == null ? t11 : t12;
    }
}
