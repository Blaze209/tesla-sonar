package p011ja;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001c\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u000b\u0010\u0014R,\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"Lja/i;", "", "<init>", "()V", "Lja/h;", "a", "()Lja/h;", "Lja/h$a;", "Lja/h$a;", "builder", "Lja/b0;", "b", "Lja/b0;", "_type", "", "value", "c", "Z", "getNullable", "()Z", "(Z)V", "nullable", "getType", "()Lja/b0;", "(Lja/b0;)V", "type", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.a builder = new h.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b0<?> _type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean nullable;

    public final h a() {
        return this.builder.a();
    }

    public final void b(boolean z11) {
        this.nullable = z11;
        this.builder.b(z11);
    }

    public final void c(b0<?> value) {
        s.k(value, "value");
        this._type = value;
        this.builder.c(value);
    }
}
