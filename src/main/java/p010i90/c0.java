package p010i90;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR!\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Li90/c0;", "", "", "errorMessage", "", "formatArgs", "<init>", "(I[Ljava/lang/Object;)V", "a", "I", "()I", "b", "[Ljava/lang/Object;", "()[Ljava/lang/Object;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] formatArgs;

    public c0(int i11, Object[] objArr) {
        this.errorMessage = i11;
        this.formatArgs = objArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object[] getFormatArgs() {
        return this.formatArgs;
    }

    public /* synthetic */ c0(int i11, Object[] objArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : objArr);
    }
}
