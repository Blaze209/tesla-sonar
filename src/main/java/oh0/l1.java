package oh0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0085\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00020\u00042\"\u0010\u0007\u001a\u001e0\u0005R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\r2$\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d0\u001b¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f*\u00020\u0004¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010%\u001a\u00020\b*\u00020$2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010&\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0'*\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "Ly20/k$a;", "Ly20/k;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "requestPermissions", "Loh0/d0;", "permission", "optional", "", "title", "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalNegativeButton", "Loh0/c1;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Loh0/c1$a;", "Ly20/r;", "handler", "Llh0/c;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ly20/k$a;ZLoh0/d0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loh0/c1;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lwn0/l;)Llh0/c;", "c", "(Ljava/lang/Object;)Llh0/c;", "Landroid/content/Context;", "b", "(Landroid/content/Context;Loh0/d0;)Z", "", "permissions", "a", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "permissions_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l1 {
    public static final List<d0> a(Context context, List<? extends d0> permissions) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (!b(context, (d0) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean b(Context context, d0 permission) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(permission, "permission");
        return androidx.core.content.b.checkSelfPermission(context, k1.b(permission)) == 0;
    }

    public static final lh0.c<Object, Object> c(Object obj) {
        p013kotlin.jvm.internal.s.k(obj, "<this>");
        return new lh0.c<>(obj, p013kotlin.collections.v.m(), "PermissionFlowModal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <PropsT, StateT, OutputT, RenderingT> lh0.c<Object, Object> d(Object obj, y20.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.a context, boolean z11, d0 permission, boolean z12, String title, String rationale, String rationaleWhenPermanentlyDenied, String str, String str2, String str3, String str4, String str5, c1 permissionRequestWorkflow, StepStyle stepStyle, String key, wn0.l<? super c1.Output, ? extends y20.r<? super PropsT, StateT, ? extends OutputT>> handler) {
        lh0.c<Object, Object> cVarA;
        p013kotlin.jvm.internal.s.k(obj, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(permission, "permission");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(rationale, "rationale");
        p013kotlin.jvm.internal.s.k(rationaleWhenPermanentlyDenied, "rationaleWhenPermanentlyDenied");
        p013kotlin.jvm.internal.s.k(permissionRequestWorkflow, "permissionRequestWorkflow");
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(handler, "handler");
        if (!z11) {
            return c(obj);
        }
        Object objD = context.d(permissionRequestWorkflow, new c1.Props(permission, z12, title, rationale, rationaleWhenPermanentlyDenied, str, str2, str3, str4, str5, stepStyle), key, handler);
        return (objD == null || (cVarA = lh0.d.a(objD, obj, "PermissionFlowModal")) == null) ? c(obj) : cVarA;
    }
}
