package ed;

import android.content.Context;
import ce.g;
import ce.k;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import jn0.e;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B!\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB!\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Led/a;", "Lce/k;", "ConfigurationT", "Lce/g;", "BuilderT", "", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "<init>", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Lme/c;Ljava/lang/String;)V", "Ldd/b$a;", "f", "Ldd/b$a;", "j", "()Ldd/b$a;", "genericActionConfigurationBuilder", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a<ConfigurationT extends k, BuilderT extends g<ConfigurationT, BuilderT>> extends g<ConfigurationT, BuilderT> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dd.b.a genericActionConfigurationBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Locale locale, Environment environment, String clientKey) {
        super(locale, environment, clientKey);
        s.k(environment, "environment");
        s.k(clientKey, "clientKey");
        dd.b.a aVar = new dd.b.a(environment, clientKey);
        if (locale != null) {
            aVar.i(locale);
        }
        this.genericActionConfigurationBuilder = aVar;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    protected final dd.b.a getGenericActionConfigurationBuilder() {
        return this.genericActionConfigurationBuilder;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public a(Context context, Environment environment, String clientKey) {
        this((Locale) null, environment, clientKey);
        s.k(context, "context");
        s.k(environment, "environment");
        s.k(clientKey, "clientKey");
    }
}
