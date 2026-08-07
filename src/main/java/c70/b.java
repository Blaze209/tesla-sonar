package c70;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import ezvcard.property.Kind;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lc70/b;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Landroid/content/Context;", "b", "(Landroid/app/Application;)Landroid/content/Context;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "args", "Lkotlin/Function0;", "", "a", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;)Lwn0/a;", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Set;", "", "c", "()Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18900a = new b();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CollectBankAccountContract.a f18901c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CollectBankAccountContract.a aVar) {
            super(0);
            this.f18901c = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f18901c.getPublishableKey();
        }
    }

    private b() {
    }

    public final wn0.a<String> a(CollectBankAccountContract.a args) {
        s.k(args, "args");
        return new a(args);
    }

    public final Context b(Application application) {
        s.k(application, "application");
        return application;
    }

    public final boolean c() {
        return false;
    }

    public final Set<String> d() {
        return d1.d();
    }
}
