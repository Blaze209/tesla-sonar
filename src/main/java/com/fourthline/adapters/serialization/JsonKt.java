package com.fourthline.adapters.serialization;

import com.fourthline.adapters.serialization.JsonKt;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wo0.b;
import wo0.d;
import wo0.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lwo0/b;", "json", "Lwo0/b;", "getJson", "()Lwo0/b;", "outputJson", "getOutputJson", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonKt {
    private static final b json = u.b(null, new l() { // from class: mp.a
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return JsonKt.json$lambda$0((d) obj);
        }
    }, 1, null);
    private static final b outputJson = u.b(null, new l() { // from class: mp.b
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return JsonKt.outputJson$lambda$1((d) obj);
        }
    }, 1, null);

    public static final b getJson() {
        return json;
    }

    public static final b getOutputJson() {
        return outputJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 json$lambda$0(d Json) {
        s.k(Json, "$this$Json");
        Json.j(true);
        Json.g(false);
        Json.h(true);
        Json.e(true);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 outputJson$lambda$1(d Json) {
        s.k(Json, "$this$Json");
        Json.g(true);
        return h0.f84049a;
    }
}
