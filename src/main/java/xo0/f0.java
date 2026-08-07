package xo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lwo0/b;", "json", "Lxo0/w;", "writer", "Lro0/q;", "serializer", "value", "Ljn0/h0;", "a", "(Lwo0/b;Lxo0/w;Lro0/q;Ljava/lang/Object;)V", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f0 {
    public static final <T> void a(wo0.b json, w writer, ro0.q<? super T> serializer, T t11) {
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(writer, "writer");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        new r0(writer, json, a1.OBJ, new wo0.s[a1.getEntries().size()]).s(serializer, t11);
    }
}
