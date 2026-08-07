package a80;

import android.app.Application;
import ezvcard.property.Kind;
import javax.inject.Provider;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La80/c;", "", "Ljavax/inject/Provider;", "La80/g$a;", "a", "()Ljavax/inject/Provider;", "subComponentBuilderProvider", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La80/c$a;", "", "Landroid/app/Application;", Kind.APPLICATION, "a", "(Landroid/app/Application;)La80/c$a;", "La80/c;", "build", "()La80/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Application application);

        c build();
    }

    Provider<g.a> a();
}
