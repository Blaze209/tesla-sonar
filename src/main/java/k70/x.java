package k70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lk70/x;", "", "Lk70/y$a;", "a", "()Lk70/y$a;", "subcomponentBuilder", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface x {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00002\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00002\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u0006H'¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk70/x$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Lk70/x$a;", "", "enableLogging", "c", "(Z)Lk70/x$a;", "Lkotlin/Function0;", "", "publishableKeyProvider", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lk70/x$a;", "", "productUsage", "b", "(Ljava/util/Set;)Lk70/x$a;", "isInstantApp", "e", "Lk70/x;", "build", "()Lk70/x;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Context context);

        a b(Set<String> productUsage);

        x build();

        a c(boolean enableLogging);

        a d(wn0.a<String> publishableKeyProvider);

        a e(boolean isInstantApp);
    }

    y.a a();
}
