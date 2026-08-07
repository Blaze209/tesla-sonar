package rf;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.CheckoutException;
import je.e;
import je.h;
import kf.r;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sf.VoucherOutputData;
import sf.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lrf/c;", "Lje/a;", "Lje/h;", "Lsf/b;", "Lkf/r;", "Lje/e;", "Lpe/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "n", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "q", "(Landroid/content/Context;Landroid/view/View;)V", "Lkotlinx/coroutines/flow/Flow;", "Lsf/f;", "a", "()Lkotlinx/coroutines/flow/Flow;", "eventFlow", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c extends je.a, h<VoucherOutputData>, r, e, pe.d {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(c cVar, CheckoutException e11) {
            s.k(e11, "e");
            je.a.C1763a.a(cVar, e11);
        }
    }

    Flow<f> a();

    void n(Context context);

    void q(Context context, View view);
}
