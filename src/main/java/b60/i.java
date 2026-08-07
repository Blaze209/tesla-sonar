package b60;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lb60/i;", "", "Lb60/j$a;", "a", "()Lb60/j$a;", "subcomponentBuilder", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00002\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00002\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH'¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00002\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lb60/i$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Lb60/i$a;", "", "enableLogging", "c", "(Z)Lb60/i$a;", "Lkotlin/Function0;", "", "publishableKeyProvider", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lb60/i$a;", "stripeAccountIdProvider", "e", "", "productUsage", "b", "(Ljava/util/Set;)Lb60/i$a;", "Lcom/stripe/android/googlepaylauncher/h$e;", "config", "f", "(Lcom/stripe/android/googlepaylauncher/h$e;)Lb60/i$a;", "Lb60/i;", "build", "()Lb60/i;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Context context);

        a b(Set<String> productUsage);

        i build();

        a c(boolean enableLogging);

        a d(wn0.a<String> publishableKeyProvider);

        a e(wn0.a<String> stripeAccountIdProvider);

        a f(com.stripe.android.googlepaylauncher.h.Config config);
    }

    j.a a();
}
