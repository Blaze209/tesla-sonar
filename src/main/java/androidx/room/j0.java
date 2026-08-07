package androidx.room;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/room/j0;", "", "", "sql", "Lkotlin/Function1;", "Lya/d;", "Ljn0/h0;", "onBindStatement", "<init>", "(Ljava/lang/String;Lwn0/l;)V", "c", "()Lwn0/l;", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Lwn0/l;", "bindingFunction", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sql;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<ya.d, jn0.h0> bindingFunction;

    public j0(String sql, final wn0.l<? super ya.d, jn0.h0> onBindStatement) {
        p013kotlin.jvm.internal.s.k(sql, "sql");
        p013kotlin.jvm.internal.s.k(onBindStatement, "onBindStatement");
        this.sql = sql;
        this.bindingFunction = new wn0.l() { // from class: androidx.room.i0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j0.b(onBindStatement, (ya.d) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, ya.d it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(new c(it));
        return jn0.h0.f84049a;
    }

    public final wn0.l<ya.d, jn0.h0> c() {
        return this.bindingFunction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSql() {
        return this.sql;
    }
}
