package v70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lv70/a;", "", "Lcom/stripe/android/paymentsheet/addresselement/c;", "a", "()Lcom/stripe/android/paymentsheet/addresselement/c;", "addressElementViewModel", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: v70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv70/a$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Lv70/a$a;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "starterArgs", "b", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;)Lv70/a$a;", "Lv70/a;", "build", "()Lv70/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC2533a {
        InterfaceC2533a a(Context context);

        InterfaceC2533a b(AddressElementActivityContract.Args starterArgs);

        a build();
    }

    com.stripe.android.paymentsheet.addresselement.c a();
}
