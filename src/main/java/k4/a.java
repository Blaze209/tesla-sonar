package k4;

import android.text.SegmentFinder;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk4/a;", "", "<init>", "()V", "Lk4/e;", "Landroid/text/SegmentFinder;", "a", "(Lk4/e;)Landroid/text/SegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f84905a = new a();

    /* JADX INFO: renamed from: k4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"k4/a$a", "Landroid/text/SegmentFinder;", "", "offset", "previousStartBoundary", "(I)I", "previousEndBoundary", "nextStartBoundary", "nextEndBoundary", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1792a extends SegmentFinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f84906a;

        C1792a(e eVar) {
            this.f84906a = eVar;
        }

        public int nextEndBoundary(int offset) {
            return this.f84906a.d(offset);
        }

        public int nextStartBoundary(int offset) {
            return this.f84906a.b(offset);
        }

        public int previousEndBoundary(int offset) {
            return this.f84906a.a(offset);
        }

        public int previousStartBoundary(int offset) {
            return this.f84906a.c(offset);
        }
    }

    private a() {
    }

    public final SegmentFinder a(e eVar) {
        return new C1792a(eVar);
    }
}
