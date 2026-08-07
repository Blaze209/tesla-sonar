package e80;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import f30.PaymentConfiguration;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Le80/d;", "", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f62255a;

    /* JADX INFO: renamed from: e80.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Le80/d$a;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Landroid/content/Context;", "c", "(Landroid/app/Application;)Landroid/content/Context;", "appContext", "Lf30/o;", "a", "(Landroid/content/Context;)Lf30/o;", "Lkotlin/Function0;", "", "b", "(Landroid/content/Context;)Lwn0/a;", "", "e", "()Ljava/util/Set;", "", DateTokenConverter.CONVERTER_KEY, "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f62255a = new Companion();

        /* JADX INFO: renamed from: e80.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class C1280a extends u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f62256c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1280a(Context context) {
                super(0);
                this.f62256c = context;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return PaymentConfiguration.INSTANCE.a(this.f62256c).getPublishableKey();
            }
        }

        private Companion() {
        }

        public final PaymentConfiguration a(Context appContext) {
            s.k(appContext, "appContext");
            return PaymentConfiguration.INSTANCE.a(appContext);
        }

        public final wn0.a<String> b(Context appContext) {
            s.k(appContext, "appContext");
            return new C1280a(appContext);
        }

        public final Context c(Application application) {
            s.k(application, "application");
            return application;
        }

        public final boolean d() {
            return false;
        }

        public final Set<String> e() {
            return d1.d();
        }
    }
}
