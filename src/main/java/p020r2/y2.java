package p020r2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vn0.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0015"}, d2 = {"Lr2/y2;", "T", "", "Lr2/l;", "composer", "b", "(Lr2/l;)Lr2/l;", "", "e", "(Lr2/l;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Lr2/l;)I", "other", "", "c", "(Lr2/l;Ljava/lang/Object;)Z", "a", "Lr2/l;", "getComposer$annotations", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@b
public final class y2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l composer;

    private /* synthetic */ y2(l lVar) {
        this.composer = lVar;
    }

    public static final /* synthetic */ y2 a(l lVar) {
        return new y2(lVar);
    }

    public static boolean c(l lVar, Object obj) {
        return (obj instanceof y2) && s.f(lVar, ((y2) obj).getComposer());
    }

    public static int d(l lVar) {
        return lVar.hashCode();
    }

    public static String e(l lVar) {
        return "SkippableUpdater(composer=" + lVar + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.composer, obj);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final /* synthetic */ l getComposer() {
        return this.composer;
    }

    public int hashCode() {
        return d(this.composer);
    }

    public String toString() {
        return e(this.composer);
    }

    public static <T> l b(l lVar) {
        return lVar;
    }
}
