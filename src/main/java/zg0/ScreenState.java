package zg0;

import com.withpersona.sdk2.inquiry.ExperimentalInlineApi;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: zg0.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0018"}, d2 = {"Lzg0/d;", "", "", "shouldShowBackButton", "shouldShowCancelButton", "isNavigationEnabled", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getShouldShowBackButton", "()Z", "b", "getShouldShowCancelButton", "c", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalInlineApi
public final /* data */ class ScreenState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowBackButton;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowCancelButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNavigationEnabled;

    public ScreenState(boolean z11, boolean z12, boolean z13) {
        this.shouldShowBackButton = z11;
        this.shouldShowCancelButton = z12;
        this.isNavigationEnabled = z13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenState)) {
            return false;
        }
        ScreenState screenState = (ScreenState) other;
        return this.shouldShowBackButton == screenState.shouldShowBackButton && this.shouldShowCancelButton == screenState.shouldShowCancelButton && this.isNavigationEnabled == screenState.isNavigationEnabled;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.shouldShowBackButton) * 31) + Boolean.hashCode(this.shouldShowCancelButton)) * 31) + Boolean.hashCode(this.isNavigationEnabled);
    }

    public String toString() {
        return "ScreenState(shouldShowBackButton=" + this.shouldShowBackButton + ", shouldShowCancelButton=" + this.shouldShowCancelButton + ", isNavigationEnabled=" + this.isNavigationEnabled + ")";
    }
}
