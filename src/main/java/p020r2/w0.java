package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lr2/w0;", "", "Lr2/j2;", "scope", "", "location", "instances", "<init>", "(Lr2/j2;ILjava/lang/Object;)V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "a", "Lr2/j2;", "c", "()Lr2/j2;", "b", "I", "()I", "Ljava/lang/Object;", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j2 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object instances;

    public w0(j2 j2Var, int i11, Object obj) {
        this.scope = j2Var;
        this.location = i11;
        this.instances = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getInstances() {
        return this.instances;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j2 getScope() {
        return this.scope;
    }

    public final boolean d() {
        return this.scope.u(this.instances);
    }

    public final void e(Object obj) {
        this.instances = obj;
    }
}
