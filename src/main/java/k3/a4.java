package k3;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\" \u0010\u0006\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0007"}, d2 = {"Lk3/g4;", "a", "Lk3/g4;", "()Lk3/g4;", "getRectangleShape$annotations", "()V", "RectangleShape", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g4 f84720a = new a();

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"k3/a4$a", "Lk3/g4;", "Lj3/m;", "size", "Lw4/t;", "layoutDirection", "Lw4/d;", "density", "Lk3/p3$b;", "b", "(JLw4/t;Lw4/d;)Lk3/p3$b;", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements g4 {
        a() {
        }

        @Override // k3.g4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p3.b a(long size, w4.t layoutDirection, w4.d density) {
            return new p3.b(j3.n.c(size));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    public static final g4 a() {
        return f84720a;
    }
}
