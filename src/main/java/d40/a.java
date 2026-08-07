package d40;

import android.app.Application;
import c40.l;
import c40.m;
import c40.n;
import c40.o;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ld40/a;", "", "Lc40/n;", "a", "()Lc40/n;", "customerSheetPaymentMethodDataSource", "Lc40/o;", "c", "()Lc40/o;", "customerSheetSavedSelectionDataSource", "Lc40/m;", DateTokenConverter.CONVERTER_KEY, "()Lc40/m;", "customerSheetIntentDataSource", "Lc40/l;", "b", "()Lc40/l;", "customerSheetInitializationDataSource", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: d40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld40/a$a;", "", "Landroid/app/Application;", Kind.APPLICATION, "a", "(Landroid/app/Application;)Ld40/a$a;", "Lcom/stripe/android/customersheet/b;", "customerAdapter", "b", "(Lcom/stripe/android/customersheet/b;)Ld40/a$a;", "Ld40/a;", "build", "()Ld40/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC1213a {
        InterfaceC1213a a(Application application);

        InterfaceC1213a b(com.stripe.android.customersheet.b customerAdapter);

        a build();
    }

    n a();

    l b();

    o c();

    m d();
}
