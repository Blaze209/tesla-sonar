package fd0;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lfd0/b;", "", "Lfd0/h;", "params", "<init>", "(Lfd0/h;)V", "a", "Lfd0/h;", "getParams", "()Lfd0/h;", "b", "Lfd0/b$a;", "Lfd0/b$b;", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ProtoRequestBuildParams params;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfd0/b$a;", "Lfd0/b;", "Lfd0/h;", "params", "", AnalyticsAttribute.Error, "<init>", "(Lfd0/h;Ljava/lang/Throwable;)V", "b", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProtoRequestBuildParams params, Throwable error) {
            super(params, null);
            s.k(params, "params");
            s.k(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }
    }

    /* JADX INFO: renamed from: fd0.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfd0/b$b;", "Lfd0/b;", "Lfd0/h;", "params", "Lkc0/d;", "message", "<init>", "(Lfd0/h;Lkc0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lfd0/h;", "getParams", "()Lfd0/h;", "c", "Lkc0/d;", "a", "()Lkc0/d;", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProtoRequestBuildParams params;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final kc0.d message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ProtoRequestBuildParams params, kc0.d message) {
            super(params, null);
            s.k(params, "params");
            s.k(message, "message");
            this.params = params;
            this.message = message;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final kc0.d getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return s.f(this.params, success.params) && s.f(this.message, success.message);
        }

        public int hashCode() {
            return (this.params.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Success(params=" + this.params + ", message=" + this.message + ")";
        }
    }

    public /* synthetic */ b(ProtoRequestBuildParams protoRequestBuildParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(protoRequestBuildParams);
    }

    private b(ProtoRequestBuildParams protoRequestBuildParams) {
        this.params = protoRequestBuildParams;
    }
}
