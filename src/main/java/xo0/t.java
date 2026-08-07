package xo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxo0/w;", "sb", "Lwo0/b;", "json", "Lxo0/n;", "a", "(Lxo0/w;Lwo0/b;)Lxo0/n;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t {
    public static final n a(w sb2, wo0.b json) {
        p013kotlin.jvm.internal.s.k(sb2, "sb");
        p013kotlin.jvm.internal.s.k(json, "json");
        return json.getConfiguration().getPrettyPrint() ? new s(sb2, json) : new n(sb2);
    }
}
