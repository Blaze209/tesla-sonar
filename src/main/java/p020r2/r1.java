package p020r2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010!\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010 ¨\u0006\""}, d2 = {"Lr2/r1;", Gender.NONE, "Lr2/f;", "applier", "", "offset", "<init>", "(Lr2/f;I)V", "node", "Ljn0/h0;", "h", "(Ljava/lang/Object;)V", IntegerTokenConverter.CONVERTER_KEY, "()V", "index", "instance", "f", "(ILjava/lang/Object;)V", "g", "count", "a", "(II)V", "from", "to", "e", "(III)V", "clear", "Lr2/f;", "b", "I", "c", "nesting", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r1<N> implements f<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f<N> applier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nesting;

    public r1(f<N> fVar, int i11) {
        this.applier = fVar;
        this.offset = i11;
    }

    @Override // p020r2.f
    public void a(int index, int count) {
        this.applier.a(index + (this.nesting == 0 ? this.offset : 0), count);
    }

    @Override // p020r2.f
    public N b() {
        return this.applier.b();
    }

    @Override // p020r2.f
    public void clear() {
        o.s("Clear is not valid on OffsetApplier");
    }

    @Override // p020r2.f
    public void e(int from, int to2, int count) {
        int i11 = this.nesting == 0 ? this.offset : 0;
        this.applier.e(from + i11, to2 + i11, count);
    }

    @Override // p020r2.f
    public void f(int index, N instance) {
        this.applier.f(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // p020r2.f
    public void g(int index, N instance) {
        this.applier.g(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // p020r2.f
    public void h(N node) {
        this.nesting++;
        this.applier.h(node);
    }

    @Override // p020r2.f
    public void i() {
        if (!(this.nesting > 0)) {
            o.s("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.i();
    }
}
