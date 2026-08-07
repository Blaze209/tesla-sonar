package n50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.o;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wo0.g;
import wo0.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ln50/b;", "Lwo0/g;", "Lcom/stripe/android/financialconnections/model/o;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lro0/d;", DateTokenConverter.CONVERTER_KEY, "(Lkotlinx/serialization/json/JsonElement;)Lro0/d;", "", "c", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;", "typeValue", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends g<o> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f93343c = new b();

    private b() {
        super(o0.b(o.class));
    }

    private final String c(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitiveP;
        JsonElement jsonElement2 = (JsonElement) j.o(jsonElement).get("type");
        if (jsonElement2 == null || (jsonPrimitiveP = j.p(jsonElement2)) == null) {
            return null;
        }
        return jsonPrimitiveP.getContent();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wo0.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ro0.d<? extends o> a(JsonElement element) {
        s.k(element, "element");
        String strC = c(element);
        if (s.f(strC, "text")) {
            return o.Text.INSTANCE.serializer();
        }
        if (s.f(strC, "image")) {
            return o.Image.INSTANCE.serializer();
        }
        throw new IllegalArgumentException("Unknown type! " + c(element));
    }
}
