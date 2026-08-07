package kotlinx.serialization.json;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Address;
import p013kotlin.Metadata;
import ro0.d;
import ro0.p;
import wo0.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lro0/d;", "serializer", "()Lro0/d;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "content", "", DateTokenConverter.CONVERTER_KEY, "()Z", "isString", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p(with = z.class)
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final String content = Address.ADDRESS_NULL_PLACEHOLDER;

    private JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: b */
    public String getContent() {
        return content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: d */
    public boolean getIsString() {
        return false;
    }

    public final d<JsonNull> serializer() {
        return z.f122164a;
    }
}
