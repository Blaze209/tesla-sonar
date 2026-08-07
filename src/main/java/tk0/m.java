package tk0;

import bl0.HttpMethod;
import bl0.v;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Set;
import org.slf4j.Logger;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0018\u0010\r\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbl0/v;", "", DateTokenConverter.CONVERTER_KEY, "(Lbl0/v;)Z", "", "Lbl0/t;", "a", "Ljava/util/Set;", "ALLOWED_FOR_REDIRECT", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "b", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<HttpMethod> f114722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f114723b;

    static {
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        f114722a = d1.i(companion.a(), companion.b());
        f114723b = gl0.a.a("io.ktor.client.plugins.HttpRedirect");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(v vVar) {
        int value = vVar.getValue();
        v.Companion companion = v.INSTANCE;
        return value == companion.r().getValue() || value == companion.j().getValue() || value == companion.R().getValue() || value == companion.E().getValue() || value == companion.N().getValue();
    }
}
