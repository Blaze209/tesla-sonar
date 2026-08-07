package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B_\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0013\u0010#R6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010$\u001a\u0004\b\u001d\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, d2 = {"Lr2/k1;", "", "Lr2/i1;", "content", "parameter", "Lr2/e0;", "composition", "Lr2/a3;", "slotTable", "Lr2/d;", "anchor", "", "Lkotlin/Pair;", "Lr2/j2;", "invalidations", "Lr2/z1;", "locals", "<init>", "(Lr2/i1;Ljava/lang/Object;Lr2/e0;Lr2/a3;Lr2/d;Ljava/util/List;Lr2/z1;)V", "a", "Lr2/i1;", "c", "()Lr2/i1;", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "Lr2/e0;", "()Lr2/e0;", DateTokenConverter.CONVERTER_KEY, "Lr2/a3;", "g", "()Lr2/a3;", "e", "Lr2/d;", "()Lr2/d;", "Ljava/util/List;", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "Lr2/z1;", "()Lr2/z1;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i1<Object> content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object parameter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0 composition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 slotTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d anchor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<? extends Pair<j2, ? extends Object>> invalidations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z1 locals;

    public k1(i1<Object> i1Var, Object obj, e0 e0Var, a3 a3Var, d dVar, List<? extends Pair<j2, ? extends Object>> list, z1 z1Var) {
        this.content = i1Var;
        this.parameter = obj;
        this.composition = e0Var;
        this.slotTable = a3Var;
        this.anchor = dVar;
        this.invalidations = list;
        this.locals = z1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getAnchor() {
        return this.anchor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getComposition() {
        return this.composition;
    }

    public final i1<Object> c() {
        return this.content;
    }

    public final List<Pair<j2, Object>> d() {
        return this.invalidations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final z1 getLocals() {
        return this.locals;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a3 getSlotTable() {
        return this.slotTable;
    }

    public final void h(List<? extends Pair<j2, ? extends Object>> list) {
        this.invalidations = list;
    }
}
