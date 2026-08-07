package ce;

import com.adyen.checkout.components.core.ActionComponentData;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lce/b;", "", "<init>", "()V", "a", "b", "c", "Lce/b$a;", "Lce/b$b;", "Lce/b$c;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lce/b$a;", "Lce/b;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "data", "<init>", "(Lcom/adyen/checkout/components/core/ActionComponentData;)V", "a", "Lcom/adyen/checkout/components/core/ActionComponentData;", "()Lcom/adyen/checkout/components/core/ActionComponentData;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ActionComponentData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActionComponentData data) {
            super(null);
            p013kotlin.jvm.internal.s.k(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActionComponentData getData() {
            return this.data;
        }
    }

    /* JADX INFO: renamed from: ce.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lce/b$b;", "Lce/b;", "Lbe/g;", AnalyticsAttribute.Error, "<init>", "(Lbe/g;)V", "a", "Lbe/g;", "()Lbe/g;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0392b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final be.g error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0392b(be.g error) {
            super(null);
            p013kotlin.jvm.internal.s.k(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final be.g getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lce/b$c;", "Lce/b;", "", "requiredPermission", "Lme/d;", "permissionCallback", "<init>", "(Ljava/lang/String;Lme/d;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lme/d;", "()Lme/d;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String requiredPermission;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final me.d permissionCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String requiredPermission, me.d permissionCallback) {
            super(null);
            p013kotlin.jvm.internal.s.k(requiredPermission, "requiredPermission");
            p013kotlin.jvm.internal.s.k(permissionCallback, "permissionCallback");
            this.requiredPermission = requiredPermission;
            this.permissionCallback = permissionCallback;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final me.d getPermissionCallback() {
            return this.permissionCallback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequiredPermission() {
            return this.requiredPermission;
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
