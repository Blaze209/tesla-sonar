package androidx.compose.ui;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/a;", "Landroidx/compose/ui/d;", "outer", "inner", "<init>", "(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/d$b;", "operation", "b", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "a", "(Lwn0/l;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/d;", "m", "()Landroidx/compose/ui/d;", "c", IntegerTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d outer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d inner;

    /* JADX INFO: renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Landroidx/compose/ui/d$b;", "element", "a", "(Ljava/lang/String;Landroidx/compose/ui/d$b;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class C0118a extends u implements p<String, d.b, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0118a f5266c = new C0118a();

        C0118a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, d.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public a(d dVar, d dVar2) {
        this.outer = dVar;
        this.inner = dVar2;
    }

    @Override // androidx.compose.ui.d
    public boolean a(l<? super d.b, Boolean> predicate) {
        return this.outer.a(predicate) && this.inner.a(predicate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.d
    public <R> R b(R initial, p<? super R, ? super d.b, ? extends R> operation) {
        return (R) this.inner.b(this.outer.b(initial, operation), operation);
    }

    public boolean equals(Object other) {
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(this.outer, aVar.outer) && s.f(this.inner, aVar.inner);
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getInner() {
        return this.inner;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final d getOuter() {
        return this.outer;
    }

    public String toString() {
        return '[' + ((String) b("", C0118a.f5266c)) + ']';
    }
}
