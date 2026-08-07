package kotlin;

import i4.SpanStyle;
import i4.d;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb2/j0;", "", "Li4/d$a;", "builder", "<init>", "(Li4/d$a;)V", "Li4/d0;", "style", "", "start", "end", "Ljn0/h0;", "a", "(Li4/d0;II)V", "Li4/d$a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.a builder;

    public j0(d.a aVar) {
        this.builder = aVar;
    }

    public final void a(SpanStyle style, int start, int end) {
        this.builder.c(style, start, end);
    }
}
