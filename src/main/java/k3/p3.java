package k3;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lk3/p3;", "", "<init>", "()V", "Lj3/i;", "a", "()Lj3/i;", "bounds", "b", "c", "Lk3/p3$a;", "Lk3/p3$b;", "Lk3/p3$c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class p3 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Lk3/p3$a;", "Lk3/p3;", "Lk3/t3;", "path", "<init>", "(Lk3/t3;)V", "a", "Lk3/t3;", "b", "()Lk3/t3;", "Lj3/i;", "()Lj3/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final t3 path;

        public a(t3 t3Var) {
            super(null);
            this.path = t3Var;
        }

        @Override // k3.p3
        /* JADX INFO: renamed from: a */
        public j3.i getRect() {
            return this.path.getBounds();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final t3 getPath() {
            return this.path;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Lk3/p3$b;", "Lk3/p3;", "Lj3/i;", "rect", "<init>", "(Lj3/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lj3/i;", "b", "()Lj3/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends p3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j3.i rect;

        public b(j3.i iVar) {
            super(null);
            this.rect = iVar;
        }

        @Override // k3.p3
        /* JADX INFO: renamed from: a, reason: from getter */
        public j3.i getRect() {
            return this.rect;
        }

        public final j3.i b() {
            return this.rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && p013kotlin.jvm.internal.s.f(this.rect, ((b) other).rect);
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Lk3/p3$c;", "Lk3/p3;", "Lj3/k;", "roundRect", "<init>", "(Lj3/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lj3/k;", "b", "()Lj3/k;", "Lk3/t3;", "Lk3/t3;", "c", "()Lk3/t3;", "roundRectPath", "Lj3/i;", "()Lj3/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends p3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j3.k roundRect;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final t3 roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(j3.k kVar) {
            super(0 == true ? 1 : 0);
            t3 t3Var = null;
            this.roundRect = kVar;
            if (!j3.l.e(kVar)) {
                t3 t3VarA = w0.a();
                t3.d(t3VarA, kVar, null, 2, null);
                t3Var = t3VarA;
            }
            this.roundRectPath = t3Var;
        }

        @Override // k3.p3
        /* JADX INFO: renamed from: a */
        public j3.i getRect() {
            return j3.l.d(this.roundRect);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final j3.k getRoundRect() {
            return this.roundRect;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final t3 getRoundRectPath() {
            return this.roundRectPath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && p013kotlin.jvm.internal.s.f(this.roundRect, ((c) other).roundRect);
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ p3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract j3.i getRect();

    private p3() {
    }
}
