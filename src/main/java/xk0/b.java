package xk0;

import bl0.k;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lxk0/b;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "", "value", "Lbl0/k;", "headers", "Ljn0/h0;", "a", "(Ljava/lang/String;[BLbl0/k;)V", "", "Lxk0/e;", "b", "()Ljava/util/List;", "", "Ljava/util/List;", "parts", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<FormPart<?>> parts = new ArrayList();

    public final void a(String key, byte[] value, k headers) {
        s.k(key, "key");
        s.k(value, "value");
        s.k(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public final List<FormPart<?>> b() {
        return this.parts;
    }
}
