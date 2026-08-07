package kd;

import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.action.Threeds2Action;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lkd/c;", "", "<init>", "()V", "a", "b", "c", "Lkd/c$a;", "Lkd/c$b;", "Lkd/c$c;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lkd/c$a;", "Lkd/c;", "Lorg/json/JSONObject;", "details", "<init>", "(Lorg/json/JSONObject;)V", "a", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JSONObject details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject details) {
            super(null);
            s.k(details, "details");
            this.details = details;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final JSONObject getDetails() {
            return this.details;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lkd/c$b;", "Lkd/c;", "Lcom/adyen/checkout/components/core/action/RedirectAction;", "action", "<init>", "(Lcom/adyen/checkout/components/core/action/RedirectAction;)V", "a", "Lcom/adyen/checkout/components/core/action/RedirectAction;", "()Lcom/adyen/checkout/components/core/action/RedirectAction;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final RedirectAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RedirectAction action) {
            super(null);
            s.k(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RedirectAction getAction() {
            return this.action;
        }
    }

    /* JADX INFO: renamed from: kd.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lkd/c$c;", "Lkd/c;", "Lcom/adyen/checkout/components/core/action/Threeds2Action;", "action", "<init>", "(Lcom/adyen/checkout/components/core/action/Threeds2Action;)V", "a", "Lcom/adyen/checkout/components/core/action/Threeds2Action;", "()Lcom/adyen/checkout/components/core/action/Threeds2Action;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1832c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Threeds2Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1832c(Threeds2Action action) {
            super(null);
            s.k(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Threeds2Action getAction() {
            return this.action;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
