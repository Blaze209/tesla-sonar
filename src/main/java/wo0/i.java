package wo0;

import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lwo0/b0;", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Ljn0/h0;", "builderAction", "Lkotlinx/serialization/json/JsonElement;", "b", "(Lwo0/b0;Ljava/lang/String;Lwn0/l;)Lkotlinx/serialization/json/JsonElement;", "value", "a", "(Lwo0/b0;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {
    public static final JsonElement a(b0 b0Var, String key, String str) {
        p013kotlin.jvm.internal.s.k(b0Var, "<this>");
        p013kotlin.jvm.internal.s.k(key, "key");
        return b0Var.b(key, j.c(str));
    }

    public static final JsonElement b(b0 b0Var, String key, wn0.l<? super b0, h0> builderAction) {
        p013kotlin.jvm.internal.s.k(b0Var, "<this>");
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(builderAction, "builderAction");
        b0 b0Var2 = new b0();
        builderAction.invoke(b0Var2);
        return b0Var.b(key, b0Var2.a());
    }
}
