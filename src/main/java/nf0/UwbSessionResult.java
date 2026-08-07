package nf0;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: nf0.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"Lnf0/e;", "", "Lkotlinx/coroutines/flow/Flow;", "Lv5/e;", AnalyticsContext.Flow, "Lkf0/a;", AnalyticsAttribute.Error, "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkf0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlinx/coroutines/flow/Flow;", "b", "()Lkotlinx/coroutines/flow/Flow;", "Lkf0/a;", "()Lkf0/a;", "c", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UwbSessionResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Flow<v5.e> flow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final kf0.a error;

    /* JADX INFO: renamed from: nf0.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnf0/e$a;", "", "<init>", "()V", "Lkf0/a;", "e", "Lnf0/e;", "a", "(Lkf0/a;)Lnf0/e;", "Lkotlinx/coroutines/flow/Flow;", "Lv5/e;", AnalyticsContext.Flow, "b", "(Lkotlinx/coroutines/flow/Flow;)Lnf0/e;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UwbSessionResult a(kf0.a e11) {
            s.k(e11, "e");
            return new UwbSessionResult(null, e11);
        }

        public final UwbSessionResult b(Flow<? extends v5.e> flow) {
            s.k(flow, "flow");
            return new UwbSessionResult(flow, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UwbSessionResult(Flow<? extends v5.e> flow, kf0.a aVar) {
        this.flow = flow;
        this.error = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final kf0.a getError() {
        return this.error;
    }

    public final Flow<v5.e> b() {
        return this.flow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UwbSessionResult)) {
            return false;
        }
        UwbSessionResult uwbSessionResult = (UwbSessionResult) other;
        return s.f(this.flow, uwbSessionResult.flow) && s.f(this.error, uwbSessionResult.error);
    }

    public int hashCode() {
        Flow<v5.e> flow = this.flow;
        int iHashCode = (flow == null ? 0 : flow.hashCode()) * 31;
        kf0.a aVar = this.error;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "UwbSessionResult(flow=" + this.flow + ", error=" + this.error + ")";
    }
}
