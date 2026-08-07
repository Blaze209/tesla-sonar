package n50;

import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import wo0.f0;
import wo0.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln50/c;", "Lwo0/f0;", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "a", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends f0<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f93344b = new c();

    private c() {
        super(so0.a.F(t0.f86535a));
    }

    @Override // wo0.f0
    protected JsonElement a(JsonElement element) {
        s.k(element, "element");
        return j.c(element.toString());
    }
}
