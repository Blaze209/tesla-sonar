package v70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lv70/m;", "", "Lv70/p$a;", "a", "()Lv70/p$a;", "paymentOptionsViewModelSubcomponentBuilder", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface m {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00002\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv70/m$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Lv70/m$a;", "", "", "productUsage", "b", "(Ljava/util/Set;)Lv70/m$a;", "Lv70/m;", "build", "()Lv70/m;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Context context);

        a b(Set<String> productUsage);

        m build();
    }

    p.a a();
}
