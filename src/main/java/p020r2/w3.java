package p020r2;

import c3.b;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import p013kotlin.Metadata;
import xn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lr2/w3;", "Lc3/b;", "", "Lr2/a3;", "table", "", "parent", "Lr2/t0;", "sourceInformation", "Lr2/v3;", "identityPath", "<init>", "(Lr2/a3;ILr2/t0;Lr2/v3;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lr2/a3;", "getTable", "()Lr2/a3;", "b", "I", "getParent", "()I", "c", "Lr2/t0;", "getSourceInformation", "()Lr2/t0;", DateTokenConverter.CONVERTER_KEY, "Lr2/v3;", "getIdentityPath", "()Lr2/v3;", "", "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", Action.KEY_ATTRIBUTE, "f", "Ljava/lang/Iterable;", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class w3 implements b, Iterable<b>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t0 sourceInformation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v3 identityPath;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Iterable<b> compositionGroups = this;

    public w3(a3 a3Var, int i11, t0 t0Var, v3 v3Var) {
        this.table = a3Var;
        this.parent = i11;
        this.sourceInformation = t0Var;
        this.identityPath = v3Var;
        this.key = Integer.valueOf(t0Var.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return new u3(this.table, this.parent, this.sourceInformation, this.identityPath);
    }
}
