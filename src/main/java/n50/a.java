package n50;

import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wo0.g;
import wo0.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln50/a;", "Lwo0/g;", "Lg$b$d;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lro0/c;", "a", "(Lkotlinx/serialization/json/JsonElement;)Lro0/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends g<FinancialConnectionsGenericInfoScreen.Body.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f93342c = new a();

    private a() {
        super(o0.b(FinancialConnectionsGenericInfoScreen.Body.d.class));
    }

    @Override // wo0.g
    protected ro0.c<FinancialConnectionsGenericInfoScreen.Body.d> a(JsonElement element) {
        JsonPrimitive jsonPrimitiveP;
        s.k(element, "element");
        JsonElement jsonElement = (JsonElement) j.o(element).get("type");
        String content = (jsonElement == null || (jsonPrimitiveP = j.p(jsonElement)) == null) ? null : jsonPrimitiveP.getContent();
        if (content != null) {
            int iHashCode = content.hashCode();
            if (iHashCode != 3556653) {
                if (iHashCode != 100313435) {
                    if (iHashCode == 233716657 && content.equals("bullets")) {
                        return FinancialConnectionsGenericInfoScreen.Body.d.Bullets.INSTANCE.serializer();
                    }
                } else if (content.equals("image")) {
                    return FinancialConnectionsGenericInfoScreen.Body.d.Image.INSTANCE.serializer();
                }
            } else if (content.equals("text")) {
                return FinancialConnectionsGenericInfoScreen.Body.d.Text.INSTANCE.serializer();
            }
        }
        return FinancialConnectionsGenericInfoScreen.Body.d.Unknown.INSTANCE.serializer();
    }
}
